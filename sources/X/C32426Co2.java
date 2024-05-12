package X;

/* renamed from: X.Co2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32426Co2 extends C32425Co1 {
    public final String LJLILLLLZI;

    @Override // X.C32425Co1, java.lang.Throwable
    public String getMessage() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("md5:");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append("\n");
        LIZ.append(super.getMessage());
        return X1D.LIZIZ(LIZ);
    }

    public C32426Co2(C32420Cnw c32420Cnw, String str) {
        super(c32420Cnw);
        this.LJLILLLLZI = str;
    }

    public C32426Co2(String str, C32420Cnw c32420Cnw, String str2) {
        super(str, c32420Cnw);
        this.LJLILLLLZI = str2;
    }

    public C32426Co2(String str, Throwable th, C32420Cnw c32420Cnw, String str2) {
        super(str, th, c32420Cnw);
        this.LJLILLLLZI = str2;
    }
}
