package X;

import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* loaded from: classes7.dex */
public final class ES3 implements ERP {
    @Override // X.ERP
    public final FaceStickerBean LIZ(Effect effect) {
        boolean z;
        if (effect != null && C78886Uxe.LJJIJL(effect)) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (effect == null || !C78886Uxe.LJJJ(effect))) {
            return null;
        }
        FaceStickerBean LJFF = SFS.LJFF(effect, null);
        LJFF.setStackableEffect(true);
        return LJFF;
    }
}
