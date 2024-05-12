package X;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStore;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavControllerViewModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.a5w, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92140a5w extends AbstractC91702Zys {
    public final AbstractC91695Zyl<? extends C91720ZzA> LJI;
    public final /* synthetic */ C91706Zyw LJII;

    @Override // X.AbstractC91702Zys
    public final void LIZIZ(NavBackStackEntry navBackStackEntry) {
        NavControllerViewModel navControllerViewModel;
        boolean LJ = o.LJ(((LinkedHashMap) this.LJII.LJJI).get(navBackStackEntry), Boolean.TRUE);
        super.LIZIZ(navBackStackEntry);
        this.LJII.LJJI.remove(navBackStackEntry);
        if (!this.LJII.LJI.contains(navBackStackEntry)) {
            this.LJII.LJIJJLI(navBackStackEntry);
            if (navBackStackEntry.LJLJLJ.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                navBackStackEntry.LIZ(Lifecycle.State.DESTROYED);
            }
            ORV<NavBackStackEntry> orv = this.LJII.LJI;
            if (!(orv instanceof Collection) || !orv.isEmpty()) {
                Iterator<NavBackStackEntry> it = orv.iterator();
                while (it.hasNext()) {
                    if (o.LJ(it.next().LJLJJLL, navBackStackEntry.LJLJJLL)) {
                        break;
                    }
                }
            }
            if (!LJ && (navControllerViewModel = this.LJII.LJIILJJIL) != null) {
                String backStackEntryId = navBackStackEntry.LJLJJLL;
                o.LJIIIZ(backStackEntryId, "backStackEntryId");
                ViewModelStore remove = navControllerViewModel.LJLIL.remove(backStackEntryId);
                if (remove != null) {
                    remove.clear();
                }
            }
            this.LJII.LJIL();
            C91706Zyw c91706Zyw = this.LJII;
            c91706Zyw.LJII.setValue(c91706Zyw.LJIJI());
            return;
        }
        if (this.LIZLLL) {
            return;
        }
        this.LJII.LJIL();
        C91706Zyw c91706Zyw2 = this.LJII;
        c91706Zyw2.LJII.setValue(c91706Zyw2.LJIJI());
    }

    @Override // X.AbstractC91702Zys
    public final void LJ(NavBackStackEntry backStackEntry) {
        o.LJIIIZ(backStackEntry, "backStackEntry");
        AbstractC91695Zyl LIZIZ = this.LJII.LJIJJ.LIZIZ(backStackEntry.LJLILLLLZI.LJLIL);
        if (o.LJ(LIZIZ, this.LJI)) {
            InterfaceC88472Yns<? super NavBackStackEntry, C76800UCe> interfaceC88472Yns = this.LJII.LJIL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(backStackEntry);
                super.LJ(backStackEntry);
                return;
            }
            return;
        }
        Object obj = ((LinkedHashMap) this.LJII.LJIJJLI).get(LIZIZ);
        if (obj != null) {
            ((AbstractC91702Zys) obj).LJ(backStackEntry);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NavigatorBackStack for ");
        LIZ.append(backStackEntry.LJLILLLLZI.LJLIL);
        LIZ.append(" should already be created");
        String LIZIZ2 = X1D.LIZIZ(LIZ);
        LIZIZ2.toString();
        throw new IllegalStateException(LIZIZ2);
    }

    public final void LJII(NavBackStackEntry navBackStackEntry) {
        super.LJ(navBackStackEntry);
    }

    public C92140a5w(C91706Zyw this$0, AbstractC91695Zyl<? extends C91720ZzA> navigator) {
        o.LJIIIZ(this$0, "this$0");
        o.LJIIIZ(navigator, "navigator");
        this.LJII = this$0;
        this.LJI = navigator;
    }

    @Override // X.AbstractC91702Zys
    public final NavBackStackEntry LIZ(C91720ZzA c91720ZzA, Bundle bundle) {
        C91706Zyw c91706Zyw = this.LJII;
        return C91677ZyT.LIZIZ(c91706Zyw.LIZ, c91720ZzA, bundle, c91706Zyw.LJIIIIZZ(), this.LJII.LJIILJJIL);
    }

    @Override // X.AbstractC91702Zys
    public final void LIZJ(NavBackStackEntry popUpTo, boolean z) {
        o.LJIIIZ(popUpTo, "popUpTo");
        AbstractC91695Zyl LIZIZ = this.LJII.LJIJJ.LIZIZ(popUpTo.LJLILLLLZI.LJLIL);
        if (o.LJ(LIZIZ, this.LJI)) {
            C91706Zyw c91706Zyw = this.LJII;
            InterfaceC88472Yns<? super NavBackStackEntry, C76800UCe> interfaceC88472Yns = c91706Zyw.LJJ;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(popUpTo);
                super.LIZJ(popUpTo, z);
                return;
            }
            C92397aA5 c92397aA5 = new C92397aA5(this, popUpTo, z);
            int indexOf = c91706Zyw.LJI.indexOf(popUpTo);
            if (indexOf < 0) {
                return;
            }
            int i = indexOf + 1;
            if (i != c91706Zyw.LJI.size()) {
                c91706Zyw.LJIILLIIL(c91706Zyw.LJI.get(i).LJLILLLLZI.LJLJJLL, true, false);
            }
            C91706Zyw.LJIJ(c91706Zyw, popUpTo);
            c92397aA5.invoke();
            c91706Zyw.LJJ();
            c91706Zyw.LIZIZ();
            return;
        }
        Object obj = ((LinkedHashMap) this.LJII.LJIJJLI).get(LIZIZ);
        o.LJI(obj);
        ((AbstractC91702Zys) obj).LIZJ(popUpTo, z);
    }

    @Override // X.AbstractC91702Zys
    public final void LIZLLL(NavBackStackEntry popUpTo, boolean z) {
        o.LJIIIZ(popUpTo, "popUpTo");
        super.LIZLLL(popUpTo, z);
        this.LJII.LJJI.put(popUpTo, Boolean.valueOf(z));
    }
}
