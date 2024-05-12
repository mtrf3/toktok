package X;

import androidx.navigation.NavBackStackEntry;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.IDqS174S0200000_31;
import kotlin.jvm.internal.IDqS3S0201000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.a40, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92020a40 {
    public static final void LIZ(List<NavBackStackEntry> list, Collection<NavBackStackEntry> transitionsInProgress, InterfaceC24520xk interfaceC24520xk, int i) {
        o.LJIIIZ(list, "<this>");
        o.LJIIIZ(transitionsInProgress, "transitionsInProgress");
        C35931b3 LJIL = interfaceC24520xk.LJIL(2019779279);
        for (NavBackStackEntry navBackStackEntry : transitionsInProgress) {
            C24610xt.LIZIZ(navBackStackEntry.LJLJLJ, new IDqS174S0200000_31(navBackStackEntry, (NavBackStackEntry) list, (List<NavBackStackEntry>) 24), LJIL);
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new IDqS3S0201000_31((List) list, (List<NavBackStackEntry>) transitionsInProgress, (Collection<NavBackStackEntry>) i, 4);
    }
}
