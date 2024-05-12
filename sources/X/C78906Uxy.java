package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.Uxy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78906Uxy implements UDJ {
    public final /* synthetic */ C78907Uxz LIZ;
    public final /* synthetic */ FragmentC78904Uxw LIZIZ;

    @Override // X.UDJ
    public final void cancel() {
        this.LIZ.LIZ();
        C78907Uxz c78907Uxz = this.LIZ;
        c78907Uxz.LJ.LJ("DENY_FROM_REQUEST_RESULT_NEVER_ASK", c78907Uxz.LIZJ);
        C78907Uxz c78907Uxz2 = this.LIZ;
        c78907Uxz2.LJ.LIZ(c78907Uxz2.LIZJ);
    }

    @Override // X.UDJ
    public final void execute() {
        FragmentC78904Uxw fragmentC78904Uxw = this.LIZIZ;
        C78907Uxz c78907Uxz = this.LIZ;
        fragmentC78904Uxw.getClass();
        int LJJIIJ = (C78897Uxp.LJJIIJ(c78907Uxz.LIZJ) & (-65536)) >>> 16;
        try {
            Activity activity = c78907Uxz.LIZ;
            C40216FqO c40216FqO = C40221FqT.LIZ;
            if (FragmentC78904Uxw.LIZJ(activity, c40216FqO.LIZIZ(activity))) {
                Intent LIZIZ = c40216FqO.LIZIZ(c78907Uxz.LIZ);
                C78598Ut0.LJIJJ(LIZIZ, fragmentC78904Uxw);
                fragmentC78904Uxw.startActivityForResult(LIZIZ, LJJIIJ);
                fragmentC78904Uxw.LJLILLLLZI.LJI(LJJIIJ, c78907Uxz);
            } else {
                fragmentC78904Uxw.LIZIZ(c78907Uxz, LJJIIJ);
            }
        } catch (Exception unused) {
            fragmentC78904Uxw.LIZIZ(c78907Uxz, LJJIIJ);
            C0NB.LJ("PermissionFragment", "go to origin setting error");
        }
        C78907Uxz c78907Uxz2 = this.LIZ;
        c78907Uxz2.LJ.LJFF(c78907Uxz2.LIZJ);
    }

    public C78906Uxy(FragmentC78904Uxw fragmentC78904Uxw, C78907Uxz c78907Uxz) {
        this.LIZIZ = fragmentC78904Uxw;
        this.LIZ = c78907Uxz;
    }
}
