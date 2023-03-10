package icyllis.modernui.mc.text.mixin;

import com.mojang.blaze3d.platform.NativeImage;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

/**
 * Created by calebzhou on 2022-09-20,7:52.
 */
@Mixin(NativeImage.class)
public interface AccessNativeImage {
	@Accessor
	NativeImage.Format getFormat();
	@Accessor
	long getPixels();
}
