package X;

import com.bytedance.common.jato.gfx.HwuiBoost;

/* loaded from: classes7.dex */
public final class EVT implements Runnable {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            HwuiBoost.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
        } finally {
            if (LIZ) {
            }
        }
    }

    public EVT(boolean z, boolean z2, boolean z3) {
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = z3;
    }
}
