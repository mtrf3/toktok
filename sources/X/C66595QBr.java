package X;

/* renamed from: X.QBr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66595QBr extends AbstractC43055Gv5 {
    public final C26222AQw LIZIZ = new C26222AQw("OfflineModeStorage");

    @Override // X.AbstractC43055Gv5
    public final String LJI() {
        return "RESOURCE";
    }

    @Override // X.AbstractC43055Gv5
    public final boolean LJFF() {
        try {
            C86951YAp.LIZIZ.LJI();
            return true;
        } catch (Exception e) {
            C26222AQw c26222AQw = this.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("settings page delete offline cache failed, ");
            LIZ.append(e);
            c26222AQw.LIZLLL(X1D.LIZIZ(LIZ));
            return false;
        }
    }

    @Override // X.AbstractC43055Gv5
    public final long LJIIIIZZ() {
        return C86951YAp.LIZIZ.LJII();
    }
}
