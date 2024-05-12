package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0Z0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Z0 {
    public static final C25710zf<C51171zd> LIZ(C51171zd c51171zd) {
        o.LJIIIZ(c51171zd, "<this>");
        C25710zf<C51171zd> c25710zf = c51171zd.LJLJI;
        int i = c25710zf.LJLJI;
        if (i > 0) {
            C51171zd[] c51171zdArr = c25710zf.LJLIL;
            o.LJII(c51171zdArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i2 = 0;
            while (!c51171zdArr[i2].LJLJJI.isDeactivated()) {
                i2++;
                if (i2 >= i) {
                }
            }
            C25710zf<C51171zd> c25710zf2 = new C25710zf<>(new C51171zd[16]);
            C25710zf<C51171zd> c25710zf3 = c51171zd.LJLJI;
            int i3 = c25710zf3.LJLJI;
            if (i3 > 0) {
                C51171zd[] c51171zdArr2 = c25710zf3.LJLIL;
                o.LJII(c51171zdArr2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int i4 = 0;
                do {
                    C51171zd c51171zd2 = c51171zdArr2[i4];
                    if (!c51171zd2.LJLJJI.isDeactivated()) {
                        c25710zf2.LIZLLL(c51171zd2);
                    } else {
                        C0ZJ invoke = c51171zd2.LJLLI.LJIIIZ.invoke(new C09470Yt(7));
                        if (o.LJ(invoke, C0ZJ.LIZJ)) {
                            return new C25710zf<>(new C51171zd[16]);
                        }
                        if (o.LJ(invoke, C0ZJ.LIZIZ)) {
                            c25710zf2.LJ(c25710zf2.LJLJI, LIZ(c51171zd2));
                        } else {
                            C25710zf<C51121zY> c25710zf4 = invoke.LIZ;
                            int i5 = c25710zf4.LJLJI;
                            if (i5 > 0) {
                                C51121zY[] c51121zYArr = c25710zf4.LJLIL;
                                o.LJII(c51121zYArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                                int i6 = 0;
                                do {
                                    C51171zd LIZJ = c51121zYArr[i6].LIZJ();
                                    if (LIZJ != null) {
                                        c25710zf2.LIZLLL(LIZJ);
                                    }
                                    i6++;
                                } while (i6 < i5);
                            }
                        }
                    }
                    i4++;
                } while (i4 < i3);
            }
            return c25710zf2;
        }
        return c51171zd.LJLJI;
    }

    public static final C51171zd LIZIZ(C51171zd c51171zd) {
        o.LJIIIZ(c51171zd, "<this>");
        switch (C09530Yz.LIZIZ[c51171zd.LJLJJI.ordinal()]) {
            case 1:
            case 2:
                return c51171zd;
            case 3:
            case 4:
                C51171zd c51171zd2 = c51171zd.LJLJJL;
                if (c51171zd2 == null) {
                    return null;
                }
                return LIZIZ(c51171zd2);
            case 5:
            case 6:
                return null;
            default:
                throw new C162476Zf();
        }
    }

    public static final C51171zd LIZJ(C51171zd c51171zd) {
        C51171zd c51171zd2 = c51171zd.LJLILLLLZI;
        if (c51171zd2 != null) {
            switch (C09530Yz.LIZIZ[c51171zd.LJLJJI.ordinal()]) {
                case 1:
                case 2:
                case 4:
                case 5:
                case 6:
                    return LIZJ(c51171zd2);
                case 3:
                    return c51171zd;
                default:
                    throw new C162476Zf();
            }
        }
        return null;
    }

    public static final C10390ax LIZLLL(C51171zd c51171zd) {
        C10390ax LJIIJ;
        o.LJIIIZ(c51171zd, "<this>");
        AbstractC538029g abstractC538029g = c51171zd.LJLLJ;
        if (abstractC538029g == null || (LJIIJ = C78977Uz7.LJJIL(abstractC538029g).LJIIJ(abstractC538029g, false)) == null) {
            return C10390ax.LJ;
        }
        return LJIIJ;
    }

    public static final boolean LJ(C51171zd c51171zd) {
        C29321Dc c29321Dc;
        C29321Dc c29321Dc2;
        o.LJIIIZ(c51171zd, "<this>");
        AbstractC538029g abstractC538029g = c51171zd.LJLLJ;
        if (abstractC538029g != null && (c29321Dc = abstractC538029g.LJLJL) != null && c29321Dc.LJZI && (c29321Dc2 = abstractC538029g.LJLJL) != null && c29321Dc2.LJJIIZ()) {
            return true;
        }
        return false;
    }
}
