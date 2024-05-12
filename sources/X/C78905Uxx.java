package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.Uxx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78905Uxx implements UDJ {
    public final /* synthetic */ C78909Uy1 LIZ;
    public final /* synthetic */ FragmentC78903Uxv LIZIZ;

    @Override // X.UDJ
    public final void cancel() {
        this.LIZ.LIZ();
        C78909Uy1 c78909Uy1 = this.LIZ;
        c78909Uy1.LIZJ.LJ("DENY_FROM_REQUEST_RESULT_NEVER_ASK", c78909Uy1.LIZ);
        C78909Uy1 c78909Uy12 = this.LIZ;
        c78909Uy12.LIZJ.LIZ(c78909Uy12.LIZ);
    }

    @Override // X.UDJ
    public final void execute() {
        FragmentC78903Uxv fragmentC78903Uxv = this.LIZIZ;
        C78909Uy1 c78909Uy1 = this.LIZ;
        fragmentC78903Uxv.getClass();
        int LJJIIJ = (C78897Uxp.LJJIIJ(c78909Uy1.LIZ) & (-65536)) >>> 16;
        try {
            Activity activity = fragmentC78903Uxv.getActivity();
            Activity activity2 = fragmentC78903Uxv.getActivity();
            C40216FqO c40216FqO = C40221FqT.LIZ;
            if (FragmentC78903Uxv.LIZJ(activity, c40216FqO.LIZIZ(activity2))) {
                Intent LIZIZ = c40216FqO.LIZIZ(fragmentC78903Uxv.getActivity());
                C78598Ut0.LJIJJ(LIZIZ, fragmentC78903Uxv);
                fragmentC78903Uxv.startActivityForResult(LIZIZ, LJJIIJ);
                fragmentC78903Uxv.LJLILLLLZI.LJI(LJJIIJ, c78909Uy1);
            } else {
                fragmentC78903Uxv.LIZIZ(c78909Uy1, LJJIIJ);
            }
        } catch (Exception unused) {
            fragmentC78903Uxv.LIZIZ(c78909Uy1, LJJIIJ);
            C0NB.LJ("PermissionFragment", "go to origin setting error");
        }
        C78909Uy1 c78909Uy12 = this.LIZ;
        c78909Uy12.LIZJ.LJFF(c78909Uy12.LIZ);
    }

    public C78905Uxx(FragmentC78903Uxv fragmentC78903Uxv, C78909Uy1 c78909Uy1) {
        this.LIZIZ = fragmentC78903Uxv;
        this.LIZ = c78909Uy1;
    }
}
