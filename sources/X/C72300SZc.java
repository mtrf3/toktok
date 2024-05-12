package X;

import kotlin.jvm.internal.o;

/* renamed from: X.SZc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C72300SZc implements SYX {
    public void LIZ() {
    }

    public void LIZIZ() {
    }

    public void LIZJ() {
    }

    public void LIZLLL() {
    }

    public void LJ() {
    }

    public void LJFF() {
    }

    public void LJI(Exception exc) {
    }

    public void LJII() {
    }

    public void LJIIIIZZ() {
    }

    @Override // X.SYX
    public final void LJIIL(SZZ data) {
        o.LJIIIZ(data, "data");
        AbstractC72298SZa abstractC72298SZa = data.LJLIL;
        SZP szp = abstractC72298SZa.LIZ;
        if (abstractC72298SZa instanceof C72304SZg) {
            int i = C72301SZd.LIZ[szp.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    LJII();
                    return;
                }
                LJ();
                return;
            }
            LIZIZ();
            return;
        }
        if (abstractC72298SZa instanceof C72303SZf) {
            int i2 = C72301SZd.LIZ[szp.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        return;
                    }
                    LJIIIIZZ();
                    return;
                }
                LJFF();
                return;
            }
            LIZJ();
            return;
        }
        if (abstractC72298SZa instanceof C72299SZb) {
            Exception exc = ((C72299SZb) abstractC72298SZa).LIZLLL;
            int i3 = C72301SZd.LIZ[szp.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        return;
                    }
                    LJI(exc);
                    return;
                }
                LIZLLL();
                return;
            }
            LIZ();
            return;
        }
        if (!(abstractC72298SZa instanceof C72302SZe)) {
            return;
        }
        int i4 = C72301SZd.LIZ[szp.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    return;
                }
                LJIIIIZZ();
                return;
            }
            LJFF();
            return;
        }
        LIZJ();
    }
}
