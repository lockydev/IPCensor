package com.stuffbylocky.ipcensor.mixin;

import net.minecraft.client.gui.screen.DisconnectedScreen;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DisconnectedScreen.class)
public class DisconnectedScreenMixin {

    @Mutable
    @Shadow @Final private Text reason;

    @Inject(method = "init", at = @At("HEAD"))
    private void injected(CallbackInfo ci) {
        String res = reason.getString();
        System.out.println(res);
        if (res.startsWith("io") || res.contains("25565")) {
            reason = new LiteralText("Error censored");
        }

    }


}
