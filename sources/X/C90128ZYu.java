package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.ZYu, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90128ZYu {
    public final /* synthetic */ C90639Zhj LIZ;

    public final void LIZ() {
        Iterator it = ((CopyOnWriteArrayList) this.LIZ.LJI).iterator();
        while (it.hasNext()) {
            ((InterfaceC90123ZYp) it.next()).LJ();
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZ.LJII).iterator();
        while (it2.hasNext()) {
            ((AbstractC90122ZYo) it2.next()).LIZ();
        }
    }
}
