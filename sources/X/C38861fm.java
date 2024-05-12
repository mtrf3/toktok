package X;

import defpackage.b0;

/* renamed from: X.1fm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38861fm implements InterfaceC271214q {
    public final String LIZ;
    public final int LIZIZ;
    public final C44501os LIZJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShapePath{name=");
        LIZ.append(this.LIZ);
        LIZ.append(", index=");
        return b0.LIZJ(LIZ, this.LIZIZ, '}', LIZ);
    }

    @Override // X.InterfaceC271214q
    public final InterfaceC20640rU LIZ(C04740Go c04740Go, AbstractC45041pk abstractC45041pk) {
        return new C43691nZ(c04740Go, abstractC45041pk, this);
    }

    public C38861fm(String str, int i, C44501os c44501os) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = c44501os;
    }
}
