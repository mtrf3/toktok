package X;

import Y.AfS59S0100000_7;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H37 implements C5SJ, InterfaceC133905Ni {
    public final C67996QmO LJLIL;
    public final int LJLILLLLZI;
    public C73411SrX LJLJI;
    public long LJLJJI;
    public long LJLJJL;

    public final void LIZJ() {
        C73411SrX c73411SrX = this.LJLJI;
        if (c73411SrX != null && !c73411SrX.isDisposed()) {
            C73411SrX c73411SrX2 = this.LJLJI;
            if (c73411SrX2 != null) {
                c73411SrX2.dispose();
            }
            this.LJLJI = null;
        }
    }

    public H37(C67996QmO c67996QmO, int i) {
        this.LJLIL = c67996QmO;
        this.LJLILLLLZI = i;
        if (i > 0) {
            this.LJLJI = (C73411SrX) AbstractC73672Svk.LJJIJIIJI(i, TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJ(new C73950T0o(EnumC169566l6.LJLIL)).LJJJJZI(new AfS59S0100000_7(this, 1));
        }
        this.LJLJJI = System.currentTimeMillis();
        this.LJLJJL = System.currentTimeMillis();
    }

    @Override // X.InterfaceC133905Ni
    public final void LIZ(int i, int i2, float f, String str) {
        this.LJLJJL = System.currentTimeMillis();
        if (i == 4176) {
            this.LJLIL.LIZIZ(new C43457H3t(H1T.COMPILE, H4Z.VESDK, ""), EnumC43531H6p.OUTER);
        }
    }

    @Override // X.C5SJ
    public final void LIZIZ(byte[] bytes, long j, int i, boolean z) {
        o.LJIIIZ(bytes, "bytes");
        this.LJLJJI = System.currentTimeMillis();
    }
}
