package X;

import android.app.Activity;
import android.webkit.PermissionRequest;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Nx2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61012Nx2 extends AbstractC61103NyV {
    public final /* synthetic */ Activity LIZIZ;
    public final /* synthetic */ PermissionRequest LIZJ;
    public final /* synthetic */ NK2 LIZLLL;
    public final /* synthetic */ C34K LJ;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJFF;

    @Override // X.AbstractC61103NyV
    public final void LIZIZ(C61101NyT c61101NyT, C164906da... permissionsStatus) {
        o.LJIIIZ(permissionsStatus, "permissionsStatus");
        int i = C61114Nyg.LIZ[permissionsStatus[0].LIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                if (c61101NyT != null) {
                    c61101NyT.LIZ();
                }
                PermissionRequest permissionRequest = this.LIZJ;
                if (!new C03880Dg(2).LIZJ(102606, "android/webkit/PermissionRequest", "deny", permissionRequest, new Object[0], "void", new C65300Pk0(false, "()V", "4464863876073654863")).LIZ) {
                    permissionRequest.deny();
                }
                this.LJFF.invoke(Boolean.FALSE);
                Activity activity = this.LIZIZ;
                NK2 nk2 = this.LIZLLL;
                C26227ARb c26227ARb = new C26227ARb(activity);
                c26227ARb.LJ(R.string.b9q);
                c26227ARb.LIZ(R.string.b9p);
                UC0.LIZJ(c26227ARb, new AqS141S0200000_10(activity, nk2, 84));
                c26227ARb.LJII = false;
                c26227ARb.LJI().LIZLLL();
                return;
            }
            if (c61101NyT == null) {
                return;
            }
            c61101NyT.LIZIZ();
            return;
        }
        if (c61101NyT != null) {
            c61101NyT.LIZ();
        }
        C61011Nx1.LIZIZ(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ.element, this.LJFF);
    }

    public C61012Nx2(Activity activity, PermissionRequest permissionRequest, NK2 nk2, InterfaceC88472Yns interfaceC88472Yns, C34K c34k) {
        this.LIZIZ = activity;
        this.LIZJ = permissionRequest;
        this.LIZLLL = nk2;
        this.LJ = c34k;
        this.LJFF = interfaceC88472Yns;
    }
}
