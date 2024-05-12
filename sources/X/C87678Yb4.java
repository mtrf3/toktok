package X;

import Y.ARunnableS46S0100000_10;
import kotlin.jvm.internal.AqS157S0100000_7;

/* renamed from: X.Yb4, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87678Yb4 {
    public C73411SrX LIZIZ;
    public QXX LIZJ;
    public AbstractC87674Yb0 LIZ = new C87670Yaw(this);
    public final C43366H0g LIZLLL = new C43366H0g(C00F.LIZ(31744, 300000, "upload_speed_probe_min_gap", true), false);

    public final void LJ() {
        LIZLLL(new C87680Yb6(this));
        C38995FSd.LJFF().execute(new ARunnableS46S0100000_10((InterfaceC65784Pro) new AqS157S0100000_7(this, 592), 142));
    }

    public static void LIZJ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BDUploadSpeedProbe : ");
        LIZ.append(str);
        H78.LIZJ(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("BDUploadSpeedProbe : ");
        LIZ2.append(str);
        C78983UzD.LJIILL(X1D.LIZIZ(LIZ2));
    }

    public final synchronized void LIZIZ(C87672Yay c87672Yay) {
        this.LIZ.LIZLLL(c87672Yay);
    }

    public final void LIZLLL(AbstractC87674Yb0 abstractC87674Yb0) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ.LIZIZ());
        LIZ.append(" change to ");
        LIZ.append(abstractC87674Yb0);
        LIZ(X1D.LIZIZ(LIZ), true);
        this.LIZ = abstractC87674Yb0;
    }

    public static void LIZ(String str, boolean z) {
        if (z) {
            FP1.LJ("BDUploadSpeedProbe : ", str);
        }
    }
}
