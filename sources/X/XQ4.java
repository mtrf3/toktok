package X;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes16.dex */
public class XQ4<K, V> extends AbstractC65727Pqt<K, V> implements Serializable {
    public static final long serialVersionUID = 1;
    public final XQ9 LJLIL;
    public final XQ9 LJLILLLLZI;
    public final XQK<Object> LJLJI;
    public final XQK<Object> LJLJJI;
    public final long LJLJJL;
    public final long LJLJJLL;
    public final long LJLJL;
    public final XQP<K, V> LJLJLJ;
    public final int LJLJLLL;
    public final InterfaceC84783XPf<? super K, ? super V> LJLL;
    public final AbstractC44430HcA LJLLI;
    public transient XQ6 LJLLILLLL;

    private Object readResolve() {
        return this.LJLLILLLL;
    }

    @Override // X.AbstractC65727Pqt, X.AbstractC65561PoD
    public final Object LJII() {
        return this.LJLLILLLL;
    }

    @Override // X.AbstractC65727Pqt
    /* renamed from: LJIIIIZZ */
    public final XQ6 LJII() {
        return this.LJLLILLLL;
    }

    public XQ4(XQ3<K, V> xq3) {
        XQ9 xq9 = xq3.LJLJL;
        XQ9 xq92 = xq3.LJLJLJ;
        XQK<Object> xqk = xq3.LJLJJL;
        XQK<Object> xqk2 = xq3.LJLJJLL;
        long j = xq3.LJLLILLLL;
        long j2 = xq3.LJLLI;
        long j3 = xq3.LJLJLLL;
        XQP<K, V> xqp = xq3.LJLL;
        int i = xq3.LJLJJI;
        InterfaceC84783XPf<K, V> interfaceC84783XPf = xq3.LJLLLL;
        AbstractC44430HcA abstractC44430HcA = xq3.LJLLLLLL;
        this.LJLIL = xq9;
        this.LJLILLLLZI = xq92;
        this.LJLJI = xqk;
        this.LJLJJI = xqk2;
        this.LJLJJL = j;
        this.LJLJJLL = j2;
        this.LJLJL = j3;
        this.LJLJLJ = xqp;
        this.LJLJLLL = i;
        this.LJLL = interfaceC84783XPf;
        this.LJLLI = (abstractC44430HcA == AbstractC44430HcA.LIZ || abstractC44430HcA == XQ5.LJIIZILJ) ? null : abstractC44430HcA;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        long j;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        objectInputStream.defaultReadObject();
        XQ5 xq5 = new XQ5();
        XQ9 xq9 = this.LJLIL;
        XQ9 xq92 = xq5.LJI;
        boolean z14 = true;
        if (xq92 == null) {
            z = true;
        } else {
            z = false;
        }
        C76917UGr.LJIILJJIL("Key strength was already set to %s", z, xq92);
        xq9.getClass();
        xq5.LJI = xq9;
        XQ9 xq93 = this.LJLILLLLZI;
        XQ9 xq94 = xq5.LJII;
        if (xq94 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C76917UGr.LJIILJJIL("Value strength was already set to %s", z2, xq94);
        xq93.getClass();
        xq5.LJII = xq93;
        XQK<Object> xqk = this.LJLJI;
        XQK<Object> xqk2 = xq5.LJIIJJI;
        if (xqk2 == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        C76917UGr.LJIILJJIL("key equivalence was already set to %s", z3, xqk2);
        xqk.getClass();
        xq5.LJIIJJI = xqk;
        XQK<Object> xqk3 = this.LJLJJI;
        XQK<Object> xqk4 = xq5.LJIIL;
        if (xqk4 == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        C76917UGr.LJIILJJIL("value equivalence was already set to %s", z4, xqk4);
        xqk3.getClass();
        xq5.LJIIL = xqk3;
        int i = this.LJLJLLL;
        int i2 = xq5.LIZJ;
        if (i2 == -1) {
            z5 = true;
        } else {
            z5 = false;
        }
        C76917UGr.LJIIJ(i2, "concurrency level was already set to %s", z5);
        if (i > 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        C76917UGr.LJ(z6);
        xq5.LIZJ = i;
        xq5.LIZJ(this.LJLL);
        xq5.LIZ = false;
        long j2 = this.LJLJJL;
        if (j2 > 0) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long j3 = xq5.LJIIIIZZ;
            if (j3 == -1) {
                z13 = true;
            } else {
                z13 = false;
            }
            C76917UGr.LJIIJJI(j3, "expireAfterWrite was already set to %s ns", z13);
            xq5.LJIIIIZZ = timeUnit.toNanos(j2);
        }
        long j4 = this.LJLJJLL;
        if (j4 > 0) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            long j5 = xq5.LJIIIZ;
            if (j5 == -1) {
                z12 = true;
            } else {
                z12 = false;
            }
            C76917UGr.LJIIJJI(j5, "expireAfterAccess was already set to %s ns", z12);
            xq5.LJIIIZ = timeUnit2.toNanos(j4);
        }
        XQP<K, V> xqp = this.LJLJLJ;
        if (xqp != XQE.LJLIL) {
            if (xq5.LJFF == null) {
                z7 = true;
            } else {
                z7 = false;
            }
            C76917UGr.LJIILL(z7);
            if (xq5.LIZ) {
                long j6 = xq5.LIZLLL;
                j = -1;
                if (j6 == -1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C76917UGr.LJIIJJI(j6, "weigher can not be combined with maximum size", z11);
            } else {
                j = -1;
            }
            xqp.getClass();
            xq5.LJFF = xqp;
            long j7 = this.LJLJL;
            if (j7 != j) {
                long j8 = xq5.LJ;
                if (j8 == j) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                C76917UGr.LJIIJJI(j8, "maximum weight was already set to %s", z8);
                long j9 = xq5.LIZLLL;
                if (j9 == j) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                C76917UGr.LJIIJJI(j9, "maximum size was already set to %s", z9);
                xq5.LJ = j7;
                if (j7 >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C76917UGr.LIZJ("maximum weight must not be negative", z10);
            }
        } else {
            long j10 = this.LJLJL;
            if (j10 != -1) {
                xq5.LIZIZ(j10);
            }
        }
        AbstractC44430HcA abstractC44430HcA = this.LJLLI;
        if (abstractC44430HcA != null) {
            if (xq5.LJIILJJIL != null) {
                z14 = false;
            }
            C76917UGr.LJIILL(z14);
            xq5.LJIILJJIL = abstractC44430HcA;
        }
        this.LJLLILLLL = xq5.LIZ();
    }
}
