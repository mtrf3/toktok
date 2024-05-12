package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Xdp, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85301Xdp implements InterfaceC61107NyZ {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZ;
    public final /* synthetic */ long LIZIZ;

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... results) {
        boolean z;
        M78 stateWrapper;
        M78 stateWrapper2;
        o.LJIIIZ(results, "results");
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        if (results.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C7IJ c7ij = C85295Xdj.LIZIZ;
            if (c7ij != null && (stateWrapper2 = c7ij.getStateWrapper()) != null) {
                stateWrapper2.LIZ();
            }
            C85295Xdj.LIZIZ = null;
            return;
        }
        int i = C76871UEx.LIZ[results[0].LIZIZ.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                C85299Xdn.LIZLLL(System.currentTimeMillis() - this.LIZIZ, false);
                C35908E7k.LIZIZ().storeBoolean("has_deny_location_permission_manually", true);
            }
        } else {
            C35908E7k.LIZIZ().storeBoolean("location_permission_is_allow", true);
            C85299Xdn.LIZLLL(System.currentTimeMillis() - this.LIZIZ, true);
        }
        C7IJ c7ij2 = C85295Xdj.LIZIZ;
        if (c7ij2 != null && (stateWrapper = c7ij2.getStateWrapper()) != null) {
            stateWrapper.LIZ();
        }
        C85295Xdj.LIZIZ = null;
    }

    public C85301Xdp(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, long j) {
        this.LIZ = interfaceC65784Pro;
        this.LIZIZ = j;
    }
}
