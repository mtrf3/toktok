package X;

import com.ss.bduploader.BDNetworkRouterListener;

/* renamed from: X.HKw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43902HKw implements BDNetworkRouterListener {
    public final /* synthetic */ InterfaceC43905HKz LIZ;
    public final /* synthetic */ C43900HKu LIZIZ;

    public C43902HKw(HL8 hl8, C43900HKu c43900HKu) {
        this.LIZ = hl8;
        this.LIZIZ = c43900HKu;
    }

    @Override // com.ss.bduploader.BDNetworkRouterListener
    public final int networkRouteCheckNetState(int i, int i2) {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.bduploader.BDNetworkRouterListener
    public final void onRouteContext(int i, int i2, String str) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    this.LIZIZ.getClass();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("BDPublishNetworkRouter : ");
                    LIZ.append("error vidContextType onSpeedVidContext");
                    H78.LIZJ(X1D.LIZIZ(LIZ));
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("BDPublishNetworkRouter : ");
                    LIZ2.append("error vidContextType onSpeedVidContext");
                    C78983UzD.LJIILL(X1D.LIZIZ(LIZ2));
                    return;
                }
                InterfaceC43905HKz interfaceC43905HKz = this.LIZ;
                if (str == null) {
                    str = "";
                }
                interfaceC43905HKz.onRouteContext(3, i2, str);
                return;
            }
            InterfaceC43905HKz interfaceC43905HKz2 = this.LIZ;
            if (str == null) {
                str = "";
            }
            interfaceC43905HKz2.onRouteContext(1, i2, str);
            return;
        }
        InterfaceC43905HKz interfaceC43905HKz3 = this.LIZ;
        if (str == null) {
            str = "";
        }
        interfaceC43905HKz3.onRouteContext(5, i2, str);
    }
}
