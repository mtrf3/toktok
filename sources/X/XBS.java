package X;

import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XBS {
    public final C0FT LIZ;
    public final C0FT LIZIZ;
    public final C0FT LIZJ;
    public final XBR LIZLLL;
    public final /* synthetic */ XBL LJ;

    public final void LIZ() {
        this.LJ.LIZJ(this, false);
    }

    public final void LIZIZ() {
        if (((Boolean) this.LIZIZ.LIZ).booleanValue()) {
            this.LJ.LIZJ(this, false);
            this.LJ.LJIILL(this.LIZLLL.LJFF);
        } else {
            this.LJ.LIZJ(this, true);
        }
        this.LIZJ.LIZ = Boolean.TRUE;
    }

    public final C32631Pv LIZJ() {
        C32631Pv LJIILIIL;
        XBL xbl = this.LJ;
        if (xbl.LJIILL > 0) {
            C30941Ji c30941Ji = xbl.LJI;
            c30941Ji.LIZIZ();
            try {
                if (o.LJ((XBS) this.LIZLLL.LIZJ.LIZ, this)) {
                    if (!((Boolean) this.LIZLLL.LIZIZ.LIZ).booleanValue()) {
                        boolean[] zArr = new boolean[this.LJ.LJIILL];
                        zArr[0] = true;
                        this.LIZ.LIZ = zArr;
                    }
                    C10830bf LIZIZ = this.LIZLLL.LIZIZ(0);
                    try {
                        LJIILIIL = C10820be.LJIILIIL(LIZIZ, false);
                    } catch (Exception unused) {
                        C10820be.LJIIJJI(this.LJ.LJIILIIL);
                        try {
                            LJIILIIL = C10820be.LJIILIIL(LIZIZ, false);
                        } catch (Exception unused2) {
                            C84435XBv c84435XBv = new C84435XBv();
                            c30941Ji.LIZLLL();
                            return c84435XBv;
                        }
                    }
                    if (LJIILIIL != null) {
                        C84421XBh c84421XBh = new C84421XBh(LJIILIIL, new AqS165S0100000_15(this, 877));
                        c30941Ji.LIZLLL();
                        return c84421XBh;
                    }
                    o.LJIIZILJ();
                    throw null;
                }
                "Check failed.".toString();
                throw new IllegalStateException("Check failed.");
            } catch (Throwable th) {
                c30941Ji.LIZLLL();
                throw th;
            }
        }
        StringBuilder LIZ = C06830Op.LIZ("Expected index ", 0, " to ", "be greater than 0 and less than the maximum value count ", "of ");
        LIZ.append(this.LJ.LJIILL);
        String LIZIZ2 = X1D.LIZIZ(LIZ);
        LIZIZ2.toString();
        throw new IllegalArgumentException(LIZIZ2);
    }

    public XBS(XBL xbl, XBR xbr) {
        this.LJ = xbl;
        this.LIZLLL = xbr;
        this.LIZ = new C0FT(new boolean[xbl.LJIILL]);
        Boolean bool = Boolean.FALSE;
        this.LIZIZ = new C0FT(bool);
        this.LIZJ = new C0FT(bool);
    }
}
