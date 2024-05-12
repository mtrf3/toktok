package X;

import Y.AfS59S0100000_7;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class H30 implements H3S {
    public final C67996QmO LIZ;
    public final int LIZIZ;
    public C73411SrX LIZJ;
    public long LIZLLL;

    @Override // X.H3S
    public final String LIZ() {
        return "";
    }

    @Override // X.H3S
    public final int LIZIZ() {
        return 0;
    }

    @Override // X.H3S
    public final void LIZJ(int i) {
    }

    @Override // X.H3S
    public final void onLog(int i, int i2, String str) {
    }

    public H30(C67996QmO c67996QmO, int i) {
        this.LIZ = c67996QmO;
        this.LIZIZ = i;
        if (i > 0) {
            this.LIZJ = (C73411SrX) AbstractC73672Svk.LJJIJIIJI(i, TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJ(new C73950T0o(EnumC169566l6.LJLIL)).LJJJJZI(new AfS59S0100000_7(this, 0));
        }
        this.LIZLLL = System.currentTimeMillis();
    }

    @Override // X.H3S
    public final void LIZLLL(int i, long j, C43340Gzg c43340Gzg) {
        this.LIZLLL = System.currentTimeMillis();
    }
}
