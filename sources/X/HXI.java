package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* loaded from: classes8.dex */
public final class HXI {
    public final C82622Wbi LIZ;
    public final ActivityC45651qj LIZIZ;
    public final HXS LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public final Effect LIZIZ() {
        I0N i0n;
        C82622Wbi c82622Wbi = this.LIZ;
        if (c82622Wbi == null || (i0n = (I0N) c82622Wbi.LJIIIIZZ(null, I0N.class)) == null) {
            return null;
        }
        return (Effect) i0n.LLLLL().LJIIIIZZ().LJIILL().getValue();
    }

    public final boolean LIZ() {
        Effect LIZIZ = LIZIZ();
        if (V3N.LJIJJ(LIZIZ) && !ETV.LIZ(LIZIZ)) {
            this.LIZJ.getClass();
            this.LIZJ.getClass();
            return true;
        }
        return false;
    }

    public HXI(C82622Wbi c82622Wbi) {
        HXG hxg = new HXG(this);
        this.LIZIZ = (ActivityC45651qj) c82622Wbi.LJ(ActivityC45651qj.class, null);
        this.LIZ = c82622Wbi;
        LIZIZ();
        HF7 hf7 = C44172HVg.LJJIFFI;
        C77413UZt.LJJIIJ();
        hf7.getClass();
        this.LIZJ = new HXS(hxg);
    }
}
