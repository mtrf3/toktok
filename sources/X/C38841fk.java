package X;

import android.graphics.Path;

/* renamed from: X.1fk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38841fk implements InterfaceC271214q {
    public final boolean LIZ;
    public final Path.FillType LIZIZ;
    public final String LIZJ;
    public final C44441om LIZLLL;
    public final C44471op LJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShapeFill{color=, fillEnabled=");
        return C48339Iy7.LIZJ(LIZ, this.LIZ, '}', LIZ);
    }

    @Override // X.InterfaceC271214q
    public final InterfaceC20640rU LIZ(C04740Go c04740Go, AbstractC45041pk abstractC45041pk) {
        return new C43631nT(c04740Go, abstractC45041pk, this);
    }

    public C38841fk(String str, boolean z, Path.FillType fillType, C44441om c44441om, C44471op c44471op) {
        this.LIZJ = str;
        this.LIZ = z;
        this.LIZIZ = fillType;
        this.LIZLLL = c44441om;
        this.LJ = c44471op;
    }
}
