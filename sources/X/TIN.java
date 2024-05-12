package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TIN extends TIR {
    public final TEZ LIZIZ;
    public final I9W LIZJ;

    @Override // X.InterfaceC72862Sig
    public final void LIZ(Effect effect) {
        String effectId;
        if (effect == null || (effectId = effect.getEffectId()) == null || effectId.length() == 0 || effect.isBusiness() || (effect instanceof MobileEffect) || (effect instanceof DraftEffect)) {
            return;
        }
        LIZLLL(effect);
    }

    @Override // X.TIR
    public final void LJI(Effect curEffect) {
        o.LJIIIZ(curEffect, "curEffect");
        this.LIZJ.LLZL().LIZJ(J8V.LJFF());
        new C139715e3().LIZ(curEffect.getEffectId());
        this.LIZJ.bi0();
        this.LIZIZ.LJJJJLL().LIZJ().LIZIZ().LIZIZ();
        C2U8.LIZ(new TE4(curEffect));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TIN(C29S activity, TEZ stickerDataManager, I9W i9w) {
        super(activity);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        this.LIZIZ = stickerDataManager;
        this.LIZJ = i9w;
    }
}
