package X;

import androidx.navigation.NavBackStackEntry;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC91694Zyk("composable")
/* renamed from: X.a7z, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92267a7z extends AbstractC91695Zyl<C92266a7y> {
    @Override // X.AbstractC91695Zyl
    public final C92266a7y LIZ() {
        return new C92266a7y(this, C92014a3u.LIZ);
    }

    @Override // X.AbstractC91695Zyl
    public final void LJ(NavBackStackEntry popUpTo, boolean z) {
        o.LJIIIZ(popUpTo, "popUpTo");
        LIZIZ().LIZLLL(popUpTo, z);
    }

    @Override // X.AbstractC91695Zyl
    public final void LIZLLL(List<NavBackStackEntry> list, C91683ZyZ c91683ZyZ, InterfaceC91693Zyj interfaceC91693Zyj) {
        Iterator<NavBackStackEntry> it = list.iterator();
        while (it.hasNext()) {
            LIZIZ().LJFF(it.next());
        }
    }
}
