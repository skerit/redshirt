package rocks.blackblock.redshirt.config;

import com.google.gson.JsonObject;
import org.jetbrains.annotations.NotNull;
import rocks.blackblock.core.config.Config;
import rocks.blackblock.core.utils.BBLog;

public class RedshirtConfig extends Config {

    // This has to be a static. When it's a regular private, it suddenly becomes null. IDK.
    private static String rincemaft_api_endpoint;
    private Boolean ready = false;

    /**
     * Create a new instance of the CoreConfig
     *
     * @author   Jelle De Loecker   <jelle@elevenways.be>
     * @since    0.2.0
     */
    public RedshirtConfig(String name) {
        super(name);
    }

    /**
     * Parse the configuration
     *
     * @author   Jelle De Loecker   <jelle@elevenways.be>
     * @since    0.2.0
     */
    @Override
    protected void parseConfig(@NotNull JsonObject data) {
        this.ready = true;
        rincemaft_api_endpoint = data.get("rincemaft_endpoint").getAsString();
    }

    /**
     * Get the Rincemaft API endpoint
     *
     * @author   Jelle De Loecker   <jelle@elevenways.be>
     * @since    0.2.0
     */
    public String getRincemaftEndpoint() {
        return rincemaft_api_endpoint;
    }
}
