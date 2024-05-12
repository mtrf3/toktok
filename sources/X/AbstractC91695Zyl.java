package X;

import X.C91720ZzA;
import androidx.navigation.NavBackStackEntry;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.Zyl, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public abstract class AbstractC91695Zyl<D extends C91720ZzA> {
    public AbstractC91702Zys LIZ;
    public boolean LIZIZ;

    public abstract D LIZ();

    public C91720ZzA LIZJ(C91720ZzA c91720ZzA) {
        return c91720ZzA;
    }

    public boolean LJFF() {
        return true;
    }

    public final AbstractC91702Zys LIZIZ() {
        AbstractC91702Zys abstractC91702Zys = this.LIZ;
        if (abstractC91702Zys != null) {
            return abstractC91702Zys;
        }
        "You cannot access the Navigator's state until the Navigator is attached".toString();
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public void LJ(NavBackStackEntry popUpTo, boolean z) {
        o.LJIIIZ(popUpTo, "popUpTo");
        List list = (List) LIZIZ().LJ.getValue();
        if (list.contains(popUpTo)) {
            ListIterator listIterator = list.listIterator(list.size());
            NavBackStackEntry navBackStackEntry = null;
            while (LJFF()) {
                navBackStackEntry = (NavBackStackEntry) listIterator.previous();
                if (o.LJ(navBackStackEntry, popUpTo)) {
                    break;
                }
            }
            if (navBackStackEntry != null) {
                LIZIZ().LIZJ(navBackStackEntry, z);
                return;
            }
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("popBackStack was called with ");
        LIZ.append(popUpTo);
        LIZ.append(" which does not exist in back stack ");
        LIZ.append(list);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalStateException(LIZIZ);
    }

    public void LIZLLL(List<NavBackStackEntry> list, C91683ZyZ c91683ZyZ, InterfaceC91693Zyj interfaceC91693Zyj) {
        C115524g8 c115524g8 = new C115524g8(OJ4.LJJJJIZL(OJ4.LJJJJLL(ORZ.LJLIIIL(list), new IDqS418S0100000_31(this, c91683ZyZ, interfaceC91693Zyj, 0))));
        while (c115524g8.hasNext()) {
            LIZIZ().LJ((NavBackStackEntry) c115524g8.next());
        }
    }
}
