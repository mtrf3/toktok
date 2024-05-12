package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.navigation.NavBackStackEntry;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC91694Zyk("animatedComposable")
/* renamed from: X.a8m, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92316a8m extends AbstractC91695Zyl<C92315a8l> {
    public final ParcelableSnapshotMutableState LIZJ = C78966Uyw.LJJJIL(Boolean.FALSE);

    @Override // X.AbstractC91695Zyl
    public final C92315a8l LIZ() {
        return new C92315a8l(this, C92095a5D.LIZ);
    }

    @Override // X.AbstractC91695Zyl
    public final void LJ(NavBackStackEntry popUpTo, boolean z) {
        o.LJIIIZ(popUpTo, "popUpTo");
        LIZIZ().LIZLLL(popUpTo, z);
        this.LIZJ.setValue(Boolean.TRUE);
    }

    @Override // X.AbstractC91695Zyl
    public final void LIZLLL(List<NavBackStackEntry> list, C91683ZyZ c91683ZyZ, InterfaceC91693Zyj interfaceC91693Zyj) {
        Iterator<NavBackStackEntry> it = list.iterator();
        while (it.hasNext()) {
            LIZIZ().LJFF(it.next());
        }
        this.LIZJ.setValue(Boolean.FALSE);
    }
}
