package X;

/* renamed from: X.0n6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17920n6 {
    public static final /* synthetic */ int LJ = 0;
    public final EnumC17880n2 LIZ;
    public final C17900n4 LIZIZ;
    public final C17930n7 LIZJ;
    public final String LIZLLL;

    public final String toString() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        EnumC17880n2 enumC17880n2 = this.LIZ;
        if (enumC17880n2 != null) {
            str = enumC17880n2.getType();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append("://");
        LIZ.append(this.LIZIZ);
        LIZ.append('/');
        String LIZIZ = X1D.LIZIZ(LIZ);
        C17930n7 c17930n7 = this.LIZJ;
        if (c17930n7 != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZIZ);
            LIZ2.append(c17930n7);
            LIZ2.append('/');
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(LIZIZ);
        LIZ3.append(this.LIZLLL);
        return X1D.LIZIZ(LIZ3);
    }

    public C17920n6(C17940n8 c17940n8) {
        this.LIZ = c17940n8.LIZ;
        this.LIZIZ = c17940n8.LIZIZ;
        this.LIZJ = c17940n8.LIZJ;
        this.LIZLLL = c17940n8.LIZLLL;
    }
}
