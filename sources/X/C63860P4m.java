package X;

/* renamed from: X.P4m, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63860P4m extends Exception {
    public final EnumC63871P4x LJLIL;
    public final String LJLILLLLZI;

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Error type: ");
        LIZ.append(this.LJLIL);
        LIZ.append(". ");
        LIZ.append(this.LJLILLLLZI);
        return X1D.LIZIZ(LIZ);
    }

    public EnumC63871P4x getErrorType() {
        return this.LJLIL;
    }

    public C63860P4m(EnumC63871P4x enumC63871P4x, String str) {
        super(str);
        this.LJLILLLLZI = str;
        this.LJLIL = enumC63871P4x;
    }
}
