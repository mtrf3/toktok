package X;

import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: X.5bF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137975bF implements BOC {
    public final /* synthetic */ C137965bE LIZ;
    public final /* synthetic */ Effect LIZIZ;

    public C137975bF(C137965bE c137965bE, Effect effect) {
        this.LIZ = c137965bE;
        this.LIZIZ = effect;
    }

    @Override // X.BOC
    public final void LIZ(AVChallenge aVChallenge) {
        this.LIZ.LIZIZ().getStickerList().add(this.LIZIZ.getEffectId());
        this.LIZ.LIZIZ().getStickerToChallenge().put(this.LIZIZ.getEffectId(), aVChallenge);
    }
}
