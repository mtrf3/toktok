package X;

import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0ZH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0ZH {
    public static final C17R<C51281zo> LIZ = UC0.LJJJI(C51251zl.LJLIL);

    public static final void LIZ(C51171zd c51171zd) {
        C03750Ct snapshotObserver;
        o.LJIIIZ(c51171zd, "<this>");
        AbstractC538029g abstractC538029g = c51171zd.LJLLJ;
        if (abstractC538029g == null) {
            return;
        }
        C1PD c1pd = c51171zd.LJLLI;
        o.LJIIIZ(c1pd, "<this>");
        c1pd.LIZ = true;
        C0ZJ c0zj = C0ZJ.LIZIZ;
        c1pd.LIZLLL(c0zj);
        c1pd.LIZJ = c0zj;
        c1pd.LIZLLL = c0zj;
        c1pd.LJ = c0zj;
        c1pd.LJFF = c0zj;
        c1pd.LJI = c0zj;
        c1pd.LJII = c0zj;
        c1pd.LJIIIIZZ = c0zj;
        c1pd.LIZIZ(C51261zm.LJLIL);
        c1pd.LIZJ(C51271zn.LJLIL);
        C0DR c0dr = abstractC538029g.LJLJL.LJLJLJ;
        if (c0dr != null && (snapshotObserver = c0dr.getSnapshotObserver()) != null) {
            snapshotObserver.LIZ(c51171zd, C51171zd.LJLZ, new IDqS420S0100000(c51171zd, 99));
        }
        C1PD properties = c51171zd.LJLLI;
        o.LJIIIZ(properties, "properties");
        if (properties.LIZ) {
            C09520Yy.LIZ(c51171zd);
        } else {
            C09520Yy.LIZLLL(c51171zd);
        }
    }
}
