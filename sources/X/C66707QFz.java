package X;

import Y.ARunnableS47S0100000_11;
import android.os.Looper;

/* renamed from: X.QFz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66707QFz extends WB7 {
    public final /* synthetic */ InterfaceC37276Ek4 LIZ;
    public final /* synthetic */ C66699QFr LIZIZ;

    @Override // X.InterfaceC81847WAh
    public final void LIZJ() {
        if (Looper.myLooper() != C16880lQ.LLJJJJ()) {
            this.LIZ.cancel();
        } else {
            this.LIZIZ.LIZ.execute(new ARunnableS47S0100000_11(this, 115));
        }
    }

    public C66707QFz(C66699QFr c66699QFr, InterfaceC37276Ek4 interfaceC37276Ek4) {
        this.LIZIZ = c66699QFr;
        this.LIZ = interfaceC37276Ek4;
    }
}
