package X;

import Y.IDObjectS0S0101000;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ujb.o;

/* renamed from: X.a5z, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92143a5z extends C91720ZzA implements Iterable<C91720ZzA>, InterfaceC90533gv {
    public static final /* synthetic */ int LJLLJ = 0;
    public final C0MB<C91720ZzA> LJLJLLL;
    public int LJLL;
    public String LJLLI;
    public String LJLLILLLL;

    @Override // X.C91720ZzA
    public final int hashCode() {
        int i = this.LJLL;
        C0MB<C91720ZzA> c0mb = this.LJLJLLL;
        int LJIIIIZZ = c0mb.LJIIIIZZ();
        for (int i2 = 0; i2 < LJIIIIZZ; i2++) {
            i = (((i * 31) + c0mb.LJFF(i2)) * 31) + c0mb.LJIIIZ(i2).hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator<C91720ZzA> iterator() {
        return new C92142a5y(this);
    }

    @Override // X.C91720ZzA
    public final String toString() {
        C91720ZzA LJIIZILJ;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        String str = this.LJLLILLLL;
        if (str == null || o.LJJJJJL(str) || (LJIIZILJ = LJIJ(str, true)) == null) {
            LJIIZILJ = LJIIZILJ(this.LJLL, true);
        }
        sb.append(" startDestination=");
        if (LJIIZILJ == null) {
            String str2 = this.LJLLILLLL;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = this.LJLLI;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append(kotlin.jvm.internal.o.LJIILLIIL(Integer.toHexString(this.LJLL), "0x"));
                }
            }
        } else {
            sb.append("{");
            sb.append(LJIIZILJ.toString());
            sb.append("}");
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92143a5z(AbstractC91695Zyl<? extends C92143a5z> navGraphNavigator) {
        super(navGraphNavigator);
        kotlin.jvm.internal.o.LJIIIZ(navGraphNavigator, "navGraphNavigator");
        this.LJLJLLL = new C0MB<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C91720ZzA
    public final C91719Zz9 LJIILJJIL(C91717Zz7 c91717Zz7) {
        C91719Zz9 LJIILJJIL = super.LJIILJJIL(c91717Zz7);
        ArrayList arrayList = new ArrayList();
        C92142a5y c92142a5y = new C92142a5y(this);
        while (c92142a5y.hasNext()) {
            C91719Zz9 LJIILJJIL2 = ((C91720ZzA) c92142a5y.next()).LJIILJJIL(c91717Zz7);
            if (LJIILJJIL2 != null) {
                arrayList.add(LJIILJJIL2);
            }
        }
        return (C91719Zz9) ORZ.LLFZ(ORY.LJJIJLIJ(new C91719Zz9[]{LJIILJJIL, ORZ.LLFZ(arrayList)}));
    }

    @Override // X.C91720ZzA
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C92143a5z)) {
            List LJJLIIIJ = OJ4.LJJLIIIJ(OJ6.LJJIJLIJ(C78934UyQ.LJJIIZ(this.LJLJLLL)));
            C92143a5z c92143a5z = (C92143a5z) obj;
            IDObjectS0S0101000 LJJIIZ = C78934UyQ.LJJIIZ(c92143a5z.LJLJLLL);
            while (LJJIIZ.hasNext()) {
                ((ArrayList) LJJLIIIJ).remove(LJJIIZ.next());
            }
            if (super.equals(obj) && this.LJLJLLL.LJIIIIZZ() == c92143a5z.LJLJLLL.LJIIIIZZ() && this.LJLL == c92143a5z.LJLL && ((ArrayList) LJJLIIIJ).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final C91720ZzA LJIIZILJ(int i, boolean z) {
        C92143a5z c92143a5z;
        C91720ZzA LJ = this.LJLJLLL.LJ(i, null);
        if (LJ == null) {
            if (!z || (c92143a5z = this.LJLILLLLZI) == null) {
                return null;
            }
            return c92143a5z.LJIIZILJ(i, true);
        }
        return LJ;
    }

    public final C91720ZzA LJIJ(String route, boolean z) {
        C92143a5z c92143a5z;
        kotlin.jvm.internal.o.LJIIIZ(route, "route");
        C91720ZzA LJ = this.LJLJLLL.LJ(C91718Zz8.LIZ(route).hashCode(), null);
        if (LJ == null) {
            if (!z || (c92143a5z = this.LJLILLLLZI) == null || o.LJJJJJL(route)) {
                return null;
            }
            return c92143a5z.LJIJ(route, true);
        }
        return LJ;
    }
}
