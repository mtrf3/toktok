package X;

import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.ProTemplateEffect;

/* loaded from: classes7.dex */
public final class ESD implements ERP {
    @Override // X.ERP
    public final FaceStickerBean LIZ(Effect effect) {
        if (effect instanceof ProTemplateEffect) {
            return FaceStickerBean.NONE;
        }
        return null;
    }
}
