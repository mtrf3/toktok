package X;

import com.bytedance.common.jato.jit.JitOptions;

/* loaded from: classes7.dex */
public final class EVU implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            JitOptions.setCompileThreshold(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL);
        } finally {
            if (LIZ) {
            }
        }
    }

    public EVU(int i, int i2, int i3, int i4, int i5) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = i4;
        this.LJLJJL = i5;
    }
}
