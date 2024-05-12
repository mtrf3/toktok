package X;

import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;

/* loaded from: classes7.dex */
public final class ES1 implements ERP {
    @Override // X.ERP
    public final FaceStickerBean LIZ(Effect effect) {
        boolean z = effect instanceof MobileEffect;
        boolean z2 = false;
        if (!z && (effect == null || !V0N.LJJIFFI(effect))) {
            return null;
        }
        FaceStickerBean LJFF = SFS.LJFF(effect, null);
        LJFF.setMobileEffect(true);
        if (z) {
            if (((MobileEffect) effect).getModerationStatus() == 3) {
                z2 = true;
            }
            LJFF.setEffectPassedModeration(z2);
        }
        return LJFF;
    }
}
