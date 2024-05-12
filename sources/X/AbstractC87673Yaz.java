package X;

/* renamed from: X.Yaz, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public abstract class AbstractC87673Yaz {
    public final C87677Yb3 LIZ;

    public void LIZJ() {
        C87677Yb3 c87677Yb3 = this.LIZ;
        c87677Yb3.LIZLLL(new C87665Yar(c87677Yb3));
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

    public AbstractC87673Yaz(C87677Yb3 c87677Yb3) {
        this.LIZ = c87677Yb3;
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

    public void LIZLLL(C87671Yax c87671Yax) {
        LJI("complete on not running or fast result");
    }

    public void LJFF(C87681Yb7 c87681Yb7) {
        LJI("fastResult on not running");
    }
}
