package X;

import java.util.HashSet;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.00D, reason: invalid class name */
/* loaded from: classes.dex */
public final class C00D {
    public final C0DR LIZ;
    public final C25710zf<OSZ<C45791qx, C00C<?>>> LIZIZ;
    public final C25710zf<OSZ<C45791qx, C00C<?>>> LIZJ;
    public final C25710zf<OSZ<C29321Dc, C00C<?>>> LIZLLL;
    public boolean LJ;

    public final void LIZ() {
        if (!this.LJ) {
            this.LJ = true;
            this.LIZ.LJIILJJIL(new IDqS420S0100000(this, 0));
        }
    }

    public C00D(C0DR owner) {
        o.LJIIIZ(owner, "owner");
        this.LIZ = owner;
        this.LIZIZ = new C25710zf<>(new OSZ[16]);
        this.LIZJ = new C25710zf<>(new OSZ[16]);
        this.LIZLLL = new C25710zf<>(new OSZ[16]);
    }

    public static void LIZIZ(C1M3 c1m3, C00C c00c, java.util.Set set) {
        C1M3 c1m32 = c1m3.LJLIL;
        if (c1m32.LJLJL) {
            C25710zf c25710zf = new C25710zf(new C1M3[16]);
            C1M3 c1m33 = c1m32.LJLJJL;
            if (c1m33 == null) {
                C78840Uwu.LIZIZ(c25710zf, c1m32);
            } else {
                c25710zf.LIZLLL(c1m33);
            }
            while (c25710zf.LJIIJJI()) {
                C1M3 c1m34 = (C1M3) c25710zf.LJIILJJIL(c25710zf.LJLJI - 1);
                if ((c1m34.LJLJI & 32) != 0) {
                    C1M3 c1m35 = c1m34;
                    do {
                        if ((c1m35.LJLILLLLZI & 32) != 0 && (c1m35 instanceof C17Q)) {
                            C17Q c17q = (C17Q) c1m35;
                            if (c17q instanceof C45791qx) {
                                C45791qx c45791qx = (C45791qx) c17q;
                                if ((c45791qx.LJLJLJ instanceof InterfaceC39641h2) && c45791qx.LJLLILLLL.contains(c00c)) {
                                    ((HashSet) set).add(c17q);
                                }
                            }
                            if (c17q.LIZLLL().LJIIIIZZ(c00c)) {
                                break;
                            }
                        }
                        c1m35 = c1m35.LJLJJL;
                    } while (c1m35 != null);
                }
                C78840Uwu.LIZIZ(c25710zf, c1m34);
            }
            return;
        }
        "Check failed.".toString();
        throw new IllegalStateException("Check failed.");
    }
}
