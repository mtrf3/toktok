package X;

/* renamed from: X.1fo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38881fo implements InterfaceC271214q {
    public final String LIZ;
    public final AnonymousClass151 LIZIZ;
    public final C44451on LIZJ;
    public final C44451on LIZLLL;
    public final C44451on LJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Trim Path: {start: ");
        LIZ.append(this.LIZJ);
        LIZ.append(", end: ");
        LIZ.append(this.LIZLLL);
        LIZ.append(", offset: ");
        LIZ.append(this.LJ);
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC271214q
    public final InterfaceC20640rU LIZ(C04740Go c04740Go, AbstractC45041pk abstractC45041pk) {
        return new C34861Yk(abstractC45041pk, this);
    }

    public C38881fo(String str, AnonymousClass151 anonymousClass151, C44451on c44451on, C44451on c44451on2, C44451on c44451on3) {
        this.LIZ = str;
        this.LIZIZ = anonymousClass151;
        this.LIZJ = c44451on;
        this.LIZLLL = c44451on2;
        this.LJ = c44451on3;
    }
}
