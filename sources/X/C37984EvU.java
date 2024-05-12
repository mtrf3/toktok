package X;

import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import kotlin.jvm.internal.o;

/* renamed from: X.EvU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37984EvU implements InterfaceC37980EvQ {
    public final /* synthetic */ C60737Nsb LIZ;

    @Override // X.InterfaceC37980EvQ
    public final void LIZJ(String eventName) {
        o.LJIIJ(eventName, "eventName");
    }

    public C37984EvU(C60737Nsb c60737Nsb) {
        this.LIZ = c60737Nsb;
    }

    @Override // X.InterfaceC37980EvQ
    public final void LIZ(C37977EvN c37977EvN) {
        InterfaceC60761Nsz LJI = this.LIZ.LJI();
        if (!(LJI instanceof C60726NsQ)) {
            LJI = null;
        }
        C60726NsQ c60726NsQ = (C60726NsQ) LJI;
        if (c60726NsQ != null) {
            C38097ExJ.LIZLLL(c60726NsQ, c37977EvN, System.currentTimeMillis());
            C38164EyO c38164EyO = new C38164EyO();
            c38164EyO.LJLJJI = c37977EvN.LIZ;
            c38164EyO.LJLILLLLZI = C38097ExJ.LIZ(c37977EvN.LIZIZ);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("code: ");
            LIZ.append(c37977EvN.LIZIZ);
            LIZ.append(", msg: ");
            C1DI.LIZIZ(LIZ, c37977EvN.LIZJ, ", ", "rawRequest: ");
            LIZ.append(c37977EvN.LJI);
            LIZ.append(", rawResult: ");
            LIZ.append(c37977EvN.LJFF);
            LIZ.append(", ");
            LIZ.append("isRunInMainThread: ");
            LIZ.append(c37977EvN.LJII);
            c38164EyO.LJLJI = X1D.LIZIZ(LIZ);
            LynxViewMonitor.Companion.getClass();
            LynxViewMonitor.INSTANCE.reportJsbError(c60726NsQ, c38164EyO);
        }
    }

    @Override // X.InterfaceC37980EvQ
    public final void LIZIZ(C37977EvN c37977EvN) {
        InterfaceC60761Nsz LJI = this.LIZ.LJI();
        if (!(LJI instanceof C60726NsQ)) {
            LJI = null;
        }
        C60726NsQ c60726NsQ = (C60726NsQ) LJI;
        if (c60726NsQ != null) {
            C38097ExJ.LIZLLL(c60726NsQ, c37977EvN, System.currentTimeMillis());
        }
    }
}
