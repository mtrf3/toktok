package X;

import Y.IDdS380S0100000_11;
import com.bytedance.retrofit2.SsHttpCall;

/* renamed from: X.Pqz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65733Pqz extends AbstractC84773XOv<C64797Pbt> {
    public final /* synthetic */ InterfaceC37276Ek4 LJLJLJ;

    @Override // X.AbstractC84773XOv
    public final void LJII() {
        this.LJLJLJ.cancel();
    }

    public C65733Pqz(SsHttpCall ssHttpCall) {
        this.LJLJLJ = ssHttpCall;
        ssHttpCall.enqueue(new IDdS380S0100000_11(this, 1));
    }
}
