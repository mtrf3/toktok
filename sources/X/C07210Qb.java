package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.play.core.appupdate.u;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS7S1000000;
import kotlin.jvm.internal.o;

/* renamed from: X.0Qb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07210Qb {
    public final C1DT LIZ;
    public final boolean LIZIZ;
    public final C29321Dc LIZJ;
    public boolean LIZLLL;
    public C07210Qb LJ;
    public final C1JY LJFF;
    public final int LJI;

    public final List<C07210Qb> LJII() {
        return LJ(false);
    }

    public final AbstractC538029g LIZIZ() {
        if (this.LJFF.LJLILLLLZI) {
            C1DT LJIILL = C1E4.LJIILL(this.LIZJ);
            if (LJIILL == null) {
                LJIILL = this.LIZ;
            }
            return C78840Uwu.LJJIIZI(LJIILL, 8);
        }
        return C78840Uwu.LJJIIZI(this.LIZ, 8);
    }

    public final C10390ax LIZLLL() {
        if (!this.LIZJ.LJJIIZ()) {
            return C10390ax.LJ;
        }
        return C78977Uz7.LJJIIZI(LIZIZ());
    }

    public final C07210Qb LJI() {
        C29321Dc LJIJJLI;
        C07210Qb c07210Qb = this.LJ;
        if (c07210Qb != null) {
            return c07210Qb;
        }
        if (this.LIZIZ) {
            C29321Dc c29321Dc = this.LIZJ;
            C48631vX c48631vX = C48631vX.LJLIL;
            LJIJJLI = c29321Dc.LJIJJLI();
            while (LJIJJLI != null) {
                if (((Boolean) c48631vX.invoke(LJIJJLI)).booleanValue()) {
                    break;
                }
                LJIJJLI = LJIJJLI.LJIJJLI();
            }
        }
        C29321Dc c29321Dc2 = this.LIZJ;
        C48641vY c48641vY = C48641vY.LJLIL;
        LJIJJLI = c29321Dc2.LJIJJLI();
        while (LJIJJLI != null) {
            if (((Boolean) c48641vY.invoke(LJIJJLI)).booleanValue()) {
                C1DT LJIILLIIL = C1E4.LJIILLIIL(LJIJJLI);
                if (LJIILLIIL != null) {
                    return new C07210Qb(LJIILLIIL, this.LIZIZ, C78840Uwu.LJJIJ(LJIILLIIL));
                }
                return null;
            }
            LJIJJLI = LJIJJLI.LJIJJLI();
        }
        return null;
    }

    public final boolean LJIIIIZZ() {
        if (this.LIZIZ && this.LJFF.LJLILLLLZI) {
            return true;
        }
        return false;
    }

    public final C1JY LJFF() {
        if (LJIIIIZZ()) {
            C1JY c1jy = this.LJFF;
            c1jy.getClass();
            C1JY c1jy2 = new C1JY();
            c1jy2.LJLILLLLZI = c1jy.LJLILLLLZI;
            c1jy2.LJLJI = c1jy.LJLJI;
            c1jy2.LJLIL.putAll(c1jy.LJLIL);
            LJIIIZ(c1jy2);
            return c1jy2;
        }
        return this.LJFF;
    }

    public final List LJ(boolean z) {
        if (this.LJFF.LJLJI) {
            return C61878OQg.INSTANCE;
        }
        if (LJIIIIZZ()) {
            return LIZJ(this, null, z, 1);
        }
        return LJIIJ(z, true);
    }

    public final void LJIIIZ(C1JY c1jy) {
        if (!this.LJFF.LJLJI) {
            List<C07210Qb> LJIIJ = LJIIJ(false, false);
            int size = LJIIJ.size();
            for (int i = 0; i < size; i++) {
                C07210Qb c07210Qb = (C07210Qb) ListProtector.get(LJIIJ, i);
                if (!c07210Qb.LJIIIIZZ()) {
                    C1JY child = c07210Qb.LJFF;
                    o.LJIIIZ(child, "child");
                    for (Map.Entry entry : ((LinkedHashMap) child.LJLIL).entrySet()) {
                        C07270Qh<?> c07270Qh = (C07270Qh) entry.getKey();
                        Object value = entry.getValue();
                        Object obj = ((LinkedHashMap) c1jy.LJLIL).get(c07270Qh);
                        o.LJII(c07270Qh, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object invoke = c07270Qh.LIZIZ.invoke(obj, value);
                        if (invoke != null) {
                            c1jy.LJLIL.put(c07270Qh, invoke);
                        }
                    }
                    c07210Qb.LJIIIZ(c1jy);
                }
            }
        }
    }

    public /* synthetic */ C07210Qb(C1DT c1dt, boolean z) {
        this(c1dt, z, C78840Uwu.LJJIJ(c1dt));
    }

    public final C07210Qb LIZ(C0QW c0qw, InterfaceC88472Yns<? super InterfaceC07280Qi, C76800UCe> interfaceC88472Yns) {
        int i;
        int i2;
        C41471jz c41471jz = new C41471jz(interfaceC88472Yns);
        if (c0qw != null) {
            i = this.LJI;
            i2 = 1000000000;
        } else {
            i = this.LJI;
            i2 = 2000000000;
        }
        C07210Qb c07210Qb = new C07210Qb(c41471jz, false, new C29321Dc(true, i + i2));
        c07210Qb.LIZLLL = true;
        c07210Qb.LJ = this;
        return c07210Qb;
    }

    public final List<C07210Qb> LJIIJ(boolean z, boolean z2) {
        ArrayList arrayList;
        List list;
        String str;
        if (this.LIZLLL) {
            return C61878OQg.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            C29321Dc c29321Dc = this.LIZJ;
            arrayList = new ArrayList();
            u.LJIIJ(c29321Dc, arrayList);
        } else {
            C29321Dc c29321Dc2 = this.LIZJ;
            arrayList = new ArrayList();
            C1E4.LJIIJ(c29321Dc2, arrayList);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(new C07210Qb((C1DT) ListProtector.get(arrayList, i), this.LIZIZ));
        }
        if (z2) {
            C0QW c0qw = (C0QW) C0QZ.LIZ(this.LJFF, C07230Qd.LJIILLIIL);
            if (c0qw != null && this.LJFF.LJLILLLLZI && (!arrayList2.isEmpty())) {
                arrayList2.add(LIZ(c0qw, new IDqS416S0100000(c0qw, 142)));
            }
            C1JY c1jy = this.LJFF;
            C07270Qh<List<String>> c07270Qh = C07230Qd.LIZ;
            if (c1jy.LJII(c07270Qh) && (!arrayList2.isEmpty())) {
                C1JY c1jy2 = this.LJFF;
                if (c1jy2.LJLILLLLZI && (list = (List) C0QZ.LIZ(c1jy2, c07270Qh)) != null && (str = (String) ORZ.LJLLLL(list)) != null) {
                    ListProtector.add(arrayList2, 0, LIZ(null, new IDqS7S1000000(str, 1)));
                }
            }
        }
        return arrayList2;
    }

    public C07210Qb(C1DT outerSemanticsNode, boolean z, C29321Dc layoutNode) {
        o.LJIIIZ(outerSemanticsNode, "outerSemanticsNode");
        o.LJIIIZ(layoutNode, "layoutNode");
        this.LIZ = outerSemanticsNode;
        this.LIZIZ = z;
        this.LIZJ = layoutNode;
        this.LJFF = C78598Ut0.LIZLLL(outerSemanticsNode);
        this.LJI = layoutNode.LJLILLLLZI;
    }

    public static List LIZJ(C07210Qb c07210Qb, List list, boolean z, int i) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        c07210Qb.getClass();
        List<C07210Qb> LJIIJ = c07210Qb.LJIIJ(z, false);
        int size = LJIIJ.size();
        for (int i2 = 0; i2 < size; i2++) {
            C07210Qb c07210Qb2 = (C07210Qb) ListProtector.get(LJIIJ, i2);
            if (c07210Qb2.LJIIIIZZ()) {
                list.add(c07210Qb2);
            } else if (!c07210Qb2.LJFF.LJLJI) {
                LIZJ(c07210Qb2, list, false, 2);
            }
        }
        return list;
    }
}
