package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* loaded from: classes8.dex */
public final class ID8 implements TGR {
    public final /* synthetic */ ID1 LJLIL;

    public ID8(ID1 id1) {
        this.LJLIL = id1;
    }

    @Override // X.TGR
    public final void LIZ(T4Q t4q) {
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BaseStickerModule#onStickerChosen:listener:");
        LIZ.append(this);
        LIZ.append(";effectId:");
        LIZ.append(t4q.LIZ.getEffectId());
        LIZLLL.i(X1D.LIZIZ(LIZ));
        this.LJLIL.LIZIZ(t4q);
    }

    @Override // X.TGR
    public final void LIZIZ(T4R t4r) {
        String str;
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BaseStickerModule#onStickerCancel:listener:");
        LIZ.append(this);
        LIZ.append(";effectId:");
        Effect effect = t4r.LIZ;
        if (effect != null) {
            str = effect.getEffectId();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZLLL.i(X1D.LIZIZ(LIZ));
        this.LJLIL.LIZIZ(t4r);
    }
}
