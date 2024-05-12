package X;

/* renamed from: X.Pc5, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64809Pc5 extends Exception {
    public final int LJLIL;

    public int getResponseCode() {
        return this.LJLIL;
    }

    public C64809Pc5(int i, String str) {
        super(str);
        this.LJLIL = i;
    }

    public C64809Pc5(int i, Throwable th) {
        super(th);
        this.LJLIL = i;
    }
}
