package X;

/* renamed from: X.0fA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13000fA<T> {
    public final int LIZ;
    public final int LIZIZ;
    public final T LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C13000fA(int i, int i2, InterfaceC13030fD interfaceC13030fD) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = interfaceC13030fD;
        if (i >= 0) {
            if (i2 > 0) {
                return;
            }
            String LJ = KMP.LJ("size should be >0, but was ", i2);
            LJ.toString();
            throw new IllegalArgumentException(LJ);
        }
        String LJ2 = KMP.LJ("startIndex should be >= 0, but was ", i);
        LJ2.toString();
        throw new IllegalArgumentException(LJ2);
    }
}
