package X;

import Y.ARunnableS16S1100000_15;
import Y.ARunnableS51S0100000_15;
import android.os.Handler;

/* loaded from: classes16.dex */
public final class X5S implements X5Z {
    public final /* synthetic */ X5Q LIZ;

    @Override // X.X5Z
    public final void LIZIZ() {
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS51S0100000_15(this.LIZ, 0));
    }

    @Override // X.X5Z
    public final void LIZJ() {
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS51S0100000_15(this.LIZ, 1));
    }

    public X5S(X5Q x5q) {
        this.LIZ = x5q;
    }

    @Override // X.X5Z
    public final void LIZ(String str) {
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS16S1100000_15(this.LIZ, str, 0));
    }
}
