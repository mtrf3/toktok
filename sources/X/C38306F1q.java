package X;

/* renamed from: X.F1q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38306F1q extends RuntimeException {
    public final int LJLIL;

    public int getErrorCode() {
        return this.LJLIL;
    }

    public C38306F1q(int i) {
        super(KMP.LJ("error_code = ", i));
        this.LJLIL = i;
    }

    public C38306F1q(int i, Throwable th) {
        super(KMP.LJ("error_code = ", i), th);
        this.LJLIL = i;
    }
}
