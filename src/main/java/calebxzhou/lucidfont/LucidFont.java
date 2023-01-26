package calebxzhou.lucidfont;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.loader.impl.lib.electronwill.nightconfig.core.file.FileConfig;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

import java.io.File;

/**
 * Created  on 2023-01-20,16:22.
 */
public class LucidFont implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("lucidfont");
	@Override
	public void onInitialize(ModContainer mod) {

	}
	public static File getFontFileInConfig(){
		FileConfig config = FileConfig.of("config/lucidfont.toml");
		config.load(); // Reads the file and populates the config
		String fontPath = config.getOptional("font_path").orElse("mods/lucidfont/default.ttf").toString();
		LOGGER.info("Font path is {}",fontPath);
		config.close();
		return new File(fontPath);
	}
}
