package X;

/* renamed from: X.16r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C276516r extends Exception {
    public final int LJLIL;

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" TYPE = ApiException, errorCode = ");
        LIZ.append(this.LJLIL);
        LIZ.append(" ");
        LIZ.append(super.getMessage());
        return X1D.LIZIZ(LIZ);
    }

    public int getErrorCode() {
        return this.LJLIL;
    }

    public C276516r(int i) {
        this.LJLIL = i;
    }

    public C276516r(int i, Throwable th) {
        super(th);
        this.LJLIL = i;
    }
}
