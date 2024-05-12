package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;

/* loaded from: classes7.dex */
public final class ERU implements ERO {
    @Override // X.ERO
    public final ERB LIZ(Effect effect) {
        return new ERV((DraftEffect) effect);
    }

    @Override // X.ERO
    public final boolean LIZIZ(Effect effect) {
        return effect instanceof DraftEffect;
    }
}
