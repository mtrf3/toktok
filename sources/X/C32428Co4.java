package X;

/* renamed from: X.Co4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32428Co4 extends C32425Co1 {
    public final int LJLILLLLZI;
    public final C63932P7g LJLJI;

    @Override // X.C32425Co1, java.lang.Throwable
    public String getMessage() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLJI.toString());
        LIZ.append("\n");
        LIZ.append(super.getMessage());
        return X1D.LIZIZ(LIZ);
    }

    public int getErrorCode() {
        return this.LJLILLLLZI;
    }

    public C32428Co4(C32420Cnw c32420Cnw, int i, C63932P7g c63932P7g) {
        super(c32420Cnw);
        this.LJLILLLLZI = i;
        this.LJLJI = c63932P7g;
    }

    public C32428Co4(String str, C32420Cnw c32420Cnw, int i, C63932P7g c63932P7g) {
        super(str, c32420Cnw);
        this.LJLILLLLZI = i;
        this.LJLJI = c63932P7g;
    }

    public C32428Co4(String str, Throwable th, C32420Cnw c32420Cnw, int i, C63932P7g c63932P7g) {
        super(str, th, c32420Cnw);
        this.LJLILLLLZI = i;
        this.LJLJI = c63932P7g;
    }
}
