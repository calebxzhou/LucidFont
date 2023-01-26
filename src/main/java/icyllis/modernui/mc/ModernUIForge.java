package icyllis.modernui.mc;

import icyllis.modernui.ModernUI;
import net.minecraft.resources.ResourceLocation;

import javax.annotation.Nonnull;

/**
 * Created  on 2023-01-26,19:19.
 */
public class ModernUIForge {
	@Nonnull
	public static ResourceLocation location(String path) {
		return new ResourceLocation(ModernUI.ID, path);
	}
}
