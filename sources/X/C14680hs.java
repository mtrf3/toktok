package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0hs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14680hs {
    public InterfaceC23370vt LIZ;
    public EnumC23500w6 LIZIZ;
    public InterfaceC11750d9 LIZJ;
    public long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14680hs)) {
            return false;
        }
        C14680hs c14680hs = (C14680hs) obj;
        return o.LJ(this.LIZ, c14680hs.LIZ) && this.LIZIZ == c14680hs.LIZIZ && o.LJ(this.LIZJ, c14680hs.LIZJ) && C10430b1.LIZ(this.LIZLLL, c14680hs.LIZLLL);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DrawParams(density=");
        LIZ.append(this.LIZ);
        LIZ.append(", layoutDirection=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", canvas=");
        LIZ.append(this.LIZJ);
        LIZ.append(", size=");
        LIZ.append((Object) C10430b1.LJFF(this.LIZLLL));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C14680hs() {
        C35431aF c35431aF = C14700hu.LIZ;
        EnumC23500w6 enumC23500w6 = EnumC23500w6.Ltr;
        InterfaceC11750d9 interfaceC11750d9 = new InterfaceC11750d9() { // from class: X.1Ty
            @Override // X.InterfaceC11750d9
            public final void LJFF() {
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC11750d9
            public final void LJIIJ() {
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC11750d9
            public final void LJIIL() {
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC11750d9
            public final void LJIJ() {
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC11750d9
            public final void LJIJI() {
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC11750d9
            public final void LJIJJ() {
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC11750d9
            public final void LJIILIIL(float[] fArr) {
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC11750d9
            public final void LIZJ(C10390ax c10390ax, InterfaceC11550cp interfaceC11550cp) {
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC11750d9
            public final void LJI(C10390ax c10390ax, C1QW paint) {
                o.LJIIIZ(paint, "paint");
                LJIIIIZZ(c10390ax.LIZ, c10390ax.LIZIZ, c10390ax.LIZJ, c10390ax.LIZLLL, paint);
                throw null;
            }

            @Override // X.InterfaceC11750d9
            public final void LJIIIZ(InterfaceC11610cv path, int i) {
                o.LJIIIZ(path, "path");
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC11750d9
            public final void LJIIJJI(C10390ax c10390ax, int i) {
                LIZLLL(c10390ax.LIZ, c10390ax.LIZIZ, c10390ax.LIZJ, c10390ax.LIZLLL, i);
                throw null;
            }

            @Override // X.InterfaceC11750d9
            public final void LJIILJJIL(InterfaceC11610cv path, InterfaceC11550cp interfaceC11550cp) {
                o.LJIIIZ(path, "path");
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC11750d9
            public final void LJIILLIIL(float f, float f2) {
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC11750d9
            public final void LIZ(float f, long j, InterfaceC11550cp interfaceC11550cp) {
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC11750d9
            public final void LJ(InterfaceC12040dc image, long j, InterfaceC11550cp interfaceC11550cp) {
                o.LJIIIZ(image, "image");
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC11750d9
            public final void LJIIZILJ(long j, long j2, InterfaceC11550cp interfaceC11550cp) {
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC11750d9
            public final void LIZLLL(float f, float f2, float f3, float f4, int i) {
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC11750d9
            public final void LJIIIIZZ(float f, float f2, float f3, float f4, InterfaceC11550cp paint) {
                o.LJIIIZ(paint, "paint");
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC11750d9
            public final void LIZIZ(InterfaceC12040dc image, long j, long j2, long j3, long j4, InterfaceC11550cp interfaceC11550cp) {
                o.LJIIIZ(image, "image");
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC11750d9
            public final void LJII(float f, float f2, float f3, float f4, float f5, float f6, InterfaceC11550cp interfaceC11550cp) {
                throw new UnsupportedOperationException();
            }

            @Override // X.InterfaceC11750d9
            public final void LJIILL(float f, float f2, float f3, float f4, float f5, float f6, InterfaceC11550cp interfaceC11550cp) {
                throw new UnsupportedOperationException();
            }
        };
        long j = C10430b1.LIZIZ;
        this.LIZ = c35431aF;
        this.LIZIZ = enumC23500w6;
        this.LIZJ = interfaceC11750d9;
        this.LIZLLL = j;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZLLL) + ((this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31)) * 31);
    }
}
