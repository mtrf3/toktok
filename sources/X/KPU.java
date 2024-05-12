package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KPU extends F9E {
    public final boolean LJLIL;
    public final boolean LJLILLLLZI;
    public final KPT LJLJI;
    public final boolean LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI), this.LJLJI, Boolean.valueOf(this.LJLJJI)};
    }

    public KPU(boolean z, boolean z2, KPT playState, boolean z3) {
        o.LJIIIZ(playState, "playState");
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = playState;
        this.LJLJJI = z3;
    }

    public static KPU L(KPU kpu, boolean z, boolean z2, KPT playState, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = kpu.LJLIL;
        }
        if ((i & 2) != 0) {
            z2 = kpu.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            playState = kpu.LJLJI;
        }
        if ((i & 8) != 0) {
            z3 = kpu.LJLJJI;
        }
        kpu.getClass();
        o.LJIIIZ(playState, "playState");
        return new KPU(z, z2, playState, z3);
    }
}
