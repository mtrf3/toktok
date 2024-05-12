package X;

/* renamed from: X.Yb0, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public abstract class AbstractC87674Yb0 {
    public final C87678Yb4 LIZ;

    public void LIZJ() {
        C87678Yb4 c87678Yb4 = this.LIZ;
        c87678Yb4.LIZLLL(new C87669Yav(c87678Yb4));
    }

    public void LJ() {
        LJI("failed on not running");
    }

    public void LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowsRecordLayoutState:");
        LIZ.append(LIZIZ());
        LIZ.append(" has not implement method:");
        LIZ.append("cancel");
        X1D.LIZIZ(LIZ);
    }

    public String LIZIZ() {
        return toString();
    }

    public void LJII() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowsRecordLayoutState:");
        LIZ.append(LIZIZ());
        LIZ.append(" has not implement method:");
        LIZ.append("start");
        X1D.LIZIZ(LIZ);
    }

    public AbstractC87674Yb0(C87678Yb4 c87678Yb4) {
        this.LIZ = c87678Yb4;
    }

    public static void LJI(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BDUploadSpeedProbe : ");
        LIZ.append(str);
        H78.LIZJ(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("BDUploadSpeedProbe : ");
        LIZ2.append(str);
        C78983UzD.LJIILL(X1D.LIZIZ(LIZ2));
    }

    public void LIZLLL(C87672Yay c87672Yay) {
        LJI("complete on not running or fast result");
    }

    public void LJFF(C87682Yb8 c87682Yb8) {
        LJI("fastResult on not running");
    }
}
