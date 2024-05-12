package com.ss.android.ugc.aweme.shortvideo.stitch;

import X.ID0;
import X.V3N;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.ss.android.ugc.aweme.services.stitch.IStitchService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* loaded from: classes8.dex */
public final class StitchServiceImpl implements IStitchService {
    @Override // com.ss.android.ugc.aweme.services.stitch.IStitchService
    public final boolean canUseEffectInStitch(Effect effect) {
        if (effect == null) {
            return false;
        }
        IStickerUtilsService stickerInfo = AVExternalServiceImpl.LIZ().infoService().stickerInfo();
        if (ID0.LJIJJLI(effect, "voice_recognization") || V3N.LJIILLIIL(effect) || ID0.LJIIIZ(effect) || V3N.LJIJI(effect) || ID0.LJJII(effect) || V3N.LJIILIIL(effect)) {
            return false;
        }
        if (stickerInfo.isLockSticker(effect) && !stickerInfo.hasUnlocked(effect)) {
            return false;
        }
        return true;
    }
}
