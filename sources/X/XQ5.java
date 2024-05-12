package X;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes16.dex */
public final class XQ5<K, V> {
    public static final C65770Pra LJIILLIIL = new C65770Pra(new XQQ());
    public static final XQR LJIIZILJ = new XQR();
    public static final Logger LJIJ = Logger.getLogger(XQ5.class.getName());
    public XQP<? super K, ? super V> LJFF;
    public XQ9 LJI;
    public XQ9 LJII;
    public XQK<Object> LJIIJJI;
    public XQK<Object> LJIIL;
    public InterfaceC84783XPf<? super K, ? super V> LJIILIIL;
    public AbstractC44430HcA LJIILJJIL;
    public boolean LIZ = true;
    public final int LIZIZ = -1;
    public int LIZJ = -1;
    public long LIZLLL = -1;
    public long LJ = -1;
    public long LJIIIIZZ = -1;
    public long LJIIIZ = -1;
    public final long LJIIJ = -1;
    public final C65770Pra LJIILL = LJIILLIIL;

    public final XQ6 LIZ() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.LJFF == null) {
            if (this.LJ == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C76917UGr.LJIIL("maximumWeight requires weigher", z2);
        } else if (this.LIZ) {
            if (this.LJ != -1) {
                z = true;
            } else {
                z = false;
            }
            C76917UGr.LJIIL("weigher requires maximumWeight", z);
        } else if (this.LJ == -1) {
            LJIJ.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
        if (this.LJIIJ == -1) {
            z3 = true;
        }
        C76917UGr.LJIIL("refreshAfterWrite requires a LoadingCache", z3);
        return new XQ6(this);
    }

    public final String toString() {
        C65752PrI LIZIZ = C65749PrF.LIZIZ(this);
        int i = this.LIZIZ;
        if (i != -1) {
            LIZIZ.LIZIZ(String.valueOf(i), "initialCapacity");
        }
        int i2 = this.LIZJ;
        if (i2 != -1) {
            LIZIZ.LIZIZ(String.valueOf(i2), "concurrencyLevel");
        }
        long j = this.LIZLLL;
        if (j != -1) {
            LIZIZ.LIZ(j, "maximumSize");
        }
        long j2 = this.LJ;
        if (j2 != -1) {
            LIZIZ.LIZ(j2, "maximumWeight");
        }
        if (this.LJIIIIZZ != -1) {
            StringBuilder LIZ = X1D.LIZ();
            LIZIZ.LIZIZ(C0H1.LIZJ(LIZ, this.LJIIIIZZ, "ns", LIZ), "expireAfterWrite");
        }
        if (this.LJIIIZ != -1) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZIZ.LIZIZ(C0H1.LIZJ(LIZ2, this.LJIIIZ, "ns", LIZ2), "expireAfterAccess");
        }
        XQ9 xq9 = this.LJI;
        if (xq9 != null) {
            LIZIZ.LIZIZ(C30591Hz.LJJIIZ(xq9.toString()), "keyStrength");
        }
        XQ9 xq92 = this.LJII;
        if (xq92 != null) {
            LIZIZ.LIZIZ(C30591Hz.LJJIIZ(xq92.toString()), "valueStrength");
        }
        if (this.LJIIJJI != null) {
            C65754PrK c65754PrK = new C65754PrK();
            LIZIZ.LIZJ.LIZJ = c65754PrK;
            LIZIZ.LIZJ = c65754PrK;
            c65754PrK.LIZIZ = "keyEquivalence";
        }
        if (this.LJIIL != null) {
            C65754PrK c65754PrK2 = new C65754PrK();
            LIZIZ.LIZJ.LIZJ = c65754PrK2;
            LIZIZ.LIZJ = c65754PrK2;
            c65754PrK2.LIZIZ = "valueEquivalence";
        }
        if (this.LJIILIIL != null) {
            C65754PrK c65754PrK3 = new C65754PrK();
            LIZIZ.LIZJ.LIZJ = c65754PrK3;
            LIZIZ.LIZJ = c65754PrK3;
            c65754PrK3.LIZIZ = "removalListener";
        }
        return LIZIZ.toString();
    }

    public final void LIZIZ(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        long j2 = this.LIZLLL;
        boolean z4 = false;
        if (j2 == -1) {
            z = true;
        } else {
            z = false;
        }
        C76917UGr.LJIIJJI(j2, "maximum size was already set to %s", z);
        long j3 = this.LJ;
        if (j3 == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C76917UGr.LJIIJJI(j3, "maximum weight was already set to %s", z2);
        if (this.LJFF == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        C76917UGr.LJIIL("maximum size can not be combined with weigher", z3);
        if (j >= 0) {
            z4 = true;
        }
        C76917UGr.LIZJ("maximum size must not be negative", z4);
        this.LIZLLL = j;
    }

    public final void LIZJ(InterfaceC84783XPf interfaceC84783XPf) {
        boolean z;
        if (this.LJIILIIL == null) {
            z = true;
        } else {
            z = false;
        }
        C76917UGr.LJIILL(z);
        interfaceC84783XPf.getClass();
        this.LJIILIIL = interfaceC84783XPf;
    }
}
