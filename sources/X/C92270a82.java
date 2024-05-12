package X;

import androidx.navigation.NavBackStackEntry;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC91694Zyk("dialog")
/* renamed from: X.a82, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92270a82 extends AbstractC91695Zyl<C92269a81> {
    public static final /* synthetic */ int LIZJ = 0;

    @Override // X.AbstractC91695Zyl
    public final C92269a81 LIZ() {
        return new C92269a81(this, C92015a3v.LIZ);
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
            LIZIZ().LJ(it.next());
        }
    }
}
