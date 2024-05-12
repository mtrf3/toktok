package X;

/* renamed from: X.UeB, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77679UeB extends Exception {
    public final String LJLIL;
    public int LJLILLLLZI;

    public final int getErrorCode() {
        return this.LJLILLLLZI;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LJLIL;
    }

    public final void setErrorCode(int i) {
        this.LJLILLLLZI = i;
    }

    public C77679UeB(String str, int i) {
        super(str);
        this.LJLIL = str;
        this.LJLILLLLZI = i;
    }
}
