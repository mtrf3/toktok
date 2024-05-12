package X;

import android.app.Activity;
import android.webkit.PermissionRequest;
import kotlin.jvm.internal.o;

/* renamed from: X.Nx0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61010Nx0 implements InterfaceC61107NyZ {
    public final /* synthetic */ C34K LIZ;
    public final /* synthetic */ PermissionRequest LIZIZ;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LIZJ;
    public final /* synthetic */ NK2 LIZLLL;
    public final /* synthetic */ Activity LJ;

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... results) {
        o.LJIIIZ(results, "results");
        this.LIZ.element = false;
        if (!results[0].LIZ()) {
            PermissionRequest permissionRequest = this.LIZIZ;
            if (!new C03880Dg(2).LIZJ(102606, "android/webkit/PermissionRequest", "deny", permissionRequest, new Object[0], "void", new C65300Pk0(false, "()V", "4464863876073654863")).LIZ) {
                permissionRequest.deny();
            }
            this.LIZJ.invoke(Boolean.FALSE);
            NK2 nk2 = this.LIZLLL;
            if (nk2 != null) {
                C58685N1l.LIZ.getClass();
                nk2.LJIIIZ(C58685N1l.LJJIL);
                return;
            }
            return;
        }
        NK2 nk22 = this.LIZLLL;
        if (nk22 != null) {
            C58685N1l.LIZ.getClass();
            nk22.LJIIIZ(C58685N1l.LJJIJLIJ);
        }
        C61011Nx1.LIZIZ(this.LJ, this.LIZIZ, this.LIZLLL, this.LIZ.element, this.LIZJ);
    }

    public C61010Nx0(Activity activity, PermissionRequest permissionRequest, NK2 nk2, InterfaceC88472Yns interfaceC88472Yns, C34K c34k) {
        this.LIZ = c34k;
        this.LIZIZ = permissionRequest;
        this.LIZJ = interfaceC88472Yns;
        this.LIZLLL = nk2;
        this.LJ = activity;
    }
}
