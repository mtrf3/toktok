package X;

import java.util.Comparator;
import kotlin.jvm.internal.o;

/* renamed from: X.0Z2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Z2 implements Comparator<C51171zd> {
    public static final C0Z2 LJLIL = new C0Z2();

    @Override // java.util.Comparator
    public final int compare(C51171zd c51171zd, C51171zd c51171zd2) {
        C29321Dc c29321Dc;
        C29321Dc c29321Dc2;
        C51171zd c51171zd3 = c51171zd;
        C51171zd c51171zd4 = c51171zd2;
        if (c51171zd3 != null) {
            if (c51171zd4 != null) {
                int i = 0;
                if (!C0Z0.LJ(c51171zd3) || !C0Z0.LJ(c51171zd4)) {
                    return 0;
                }
                AbstractC538029g abstractC538029g = c51171zd3.LJLLJ;
                if (abstractC538029g != null && (c29321Dc = abstractC538029g.LJLJL) != null) {
                    AbstractC538029g abstractC538029g2 = c51171zd4.LJLLJ;
                    if (abstractC538029g2 != null && (c29321Dc2 = abstractC538029g2.LJLJL) != null) {
                        if (o.LJ(c29321Dc, c29321Dc2)) {
                            return 0;
                        }
                        C25710zf c25710zf = new C25710zf(new C29321Dc[16]);
                        do {
                            c25710zf.LIZJ(0, c29321Dc);
                            c29321Dc = c29321Dc.LJIJJLI();
                        } while (c29321Dc != null);
                        C25710zf c25710zf2 = new C25710zf(new C29321Dc[16]);
                        do {
                            c25710zf2.LIZJ(0, c29321Dc2);
                            c29321Dc2 = c29321Dc2.LJIJJLI();
                        } while (c29321Dc2 != null);
                        int min = Math.min(c25710zf.LJLJI - 1, c25710zf2.LJLJI - 1);
                        if (min >= 0) {
                            while (o.LJ(c25710zf.LJLIL[i], c25710zf2.LJLIL[i])) {
                                if (i != min) {
                                    i++;
                                }
                            }
                            return o.LJIIJJI(((C29321Dc) c25710zf.LJLIL[i]).LJZL, ((C29321Dc) c25710zf2.LJLIL[i]).LJZL);
                        }
                        "Could not find a common ancestor between the two FocusModifiers.".toString();
                        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
                    }
                    "Required value was null.".toString();
                    throw new IllegalStateException("Required value was null.");
                }
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
