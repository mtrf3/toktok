package X;

import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Ws1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83633Ws1 implements InterfaceC83710WtG {
    public final /* synthetic */ C83634Ws2 LIZ;

    public C83633Ws1(C83634Ws2 c83634Ws2) {
        this.LIZ = c83634Ws2;
    }

    @Override // X.InterfaceC83710WtG
    public final void LIZ(C83644WsC event) {
        o.LJIIIZ(event, "event");
        try {
            this.LIZ.LIZIZ(event);
        } catch (Exception e) {
            AbstractC83672Wse LIZ = this.LIZ.LJ.LIZ(new C83684Wsq(false), "action_name_stop_preview");
            C83699Wt5 c83699Wt5 = this.LIZ.LIZLLL;
            NDG ndg = new NDG(LIZ, C83651WsJ.LIZIZ.LIZIZ(EnumC83650WsI.CLOSE_CAMERA_ADD_STREAM, EnumC158826Le.PAGE_INVISIBLE));
            c83699Wt5.getClass();
            C6QQ.LIZ(new AqS164S0100000_14(ndg, 345));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("stream onError: ");
            LIZ2.append(e.getStackTrace());
            String LIZIZ = X1D.LIZIZ(LIZ2);
            C5NP LIZLLL = C82891Wg3.LIZLLL();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("SensitiveApiManagement: onError: ");
            LIZ3.append(LIZIZ);
            LIZLLL.i(X1D.LIZIZ(LIZ3));
        }
    }
}
