package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.0gA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13620gA {
    public static C13610g9 LIZ(C13640gC weight, int i, InterfaceC13600g8... interfaceC13600g8Arr) {
        o.LJIIIZ(weight, "weight");
        QSQ qsq = new QSQ(3);
        final int i2 = weight.LJLIL;
        if (1 <= i2 && i2 < 1001) {
            qsq.LIZ(new InterfaceC13600g8(i2) { // from class: X.1Rk
                public final String LIZ = "wght";
                public final int LIZIZ;

                @Override // X.InterfaceC13600g8
                public final void LIZ() {
                }

                @Override // X.InterfaceC13600g8
                public final float LIZIZ() {
                    return this.LIZIZ;
                }

                public final int hashCode() {
                    return (this.LIZ.hashCode() * 31) + this.LIZIZ;
                }

                public final String toString() {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("FontVariation.Setting(axisName='");
                    LIZ.append(this.LIZ);
                    LIZ.append("', value=");
                    return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
                }

                @Override // X.InterfaceC13600g8
                public final String LIZJ() {
                    return this.LIZ;
                }

                {
                    this.LIZIZ = i2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C33041Rk)) {
                        return false;
                    }
                    C33041Rk c33041Rk = (C33041Rk) obj;
                    if (o.LJ(this.LIZ, c33041Rk.LIZ) && this.LIZIZ == c33041Rk.LIZIZ) {
                        return true;
                    }
                    return false;
                }
            });
            final float f = i;
            if (0.0f <= f && f <= 1.0f) {
                qsq.LIZ(new InterfaceC13600g8(f) { // from class: X.1Rj
                    public final String LIZ = "ital";
                    public final float LIZIZ;

                    @Override // X.InterfaceC13600g8
                    public final void LIZ() {
                    }

                    public final int hashCode() {
                        return Float.floatToIntBits(this.LIZIZ) + (this.LIZ.hashCode() * 31);
                    }

                    public final String toString() {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("FontVariation.Setting(axisName='");
                        LIZ.append(this.LIZ);
                        LIZ.append("', value=");
                        return C74221TAz.LIZLLL(LIZ, this.LIZIZ, ')', LIZ);
                    }

                    @Override // X.InterfaceC13600g8
                    public final float LIZIZ() {
                        return this.LIZIZ;
                    }

                    @Override // X.InterfaceC13600g8
                    public final String LIZJ() {
                        return this.LIZ;
                    }

                    {
                        this.LIZIZ = f;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C33031Rj)) {
                            return false;
                        }
                        C33031Rj c33031Rj = (C33031Rj) obj;
                        if (o.LJ(this.LIZ, c33031Rj.LIZ) && this.LIZIZ == c33031Rj.LIZIZ) {
                            return true;
                        }
                        return false;
                    }
                });
                qsq.LJ(interfaceC13600g8Arr);
                return new C13610g9((InterfaceC13600g8[]) qsq.LJIIIZ(new InterfaceC13600g8[qsq.LJFF()]));
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("'ital' must be in 0.0f..1.0f. Actual: ");
            LIZ.append(f);
            String LIZIZ = X1D.LIZIZ(LIZ);
            LIZIZ.toString();
            throw new IllegalArgumentException(LIZIZ);
        }
        String LJ = KMP.LJ("'wght' value must be in [1, 1000]. Actual: ", i2);
        LJ.toString();
        throw new IllegalArgumentException(LJ);
    }
}
