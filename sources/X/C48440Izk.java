package X;

import com.lynx.tasm.base.LLog;

/* renamed from: X.Izk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48440Izk implements InterfaceC48417IzN {
    public final /* synthetic */ C48439Izj LIZ;

    public C48440Izk(C48439Izj c48439Izj) {
        this.LIZ = c48439Izj;
    }

    @Override // X.InterfaceC48417IzN
    public final void LIZIZ(InterfaceC47775Ip1 interfaceC47775Ip1) {
        if (this.LIZ.preparedListener != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Prepare success with player : [");
            LIZ.append(this.LIZ.LIZIZ);
            LIZ.append("]");
            LLog.LIZLLL(2, "x-alpha-video", X1D.LIZIZ(LIZ));
            C48439Izj c48439Izj = this.LIZ;
            c48439Izj.preparedListener.onPrepared(c48439Izj.self);
        }
    }
}
