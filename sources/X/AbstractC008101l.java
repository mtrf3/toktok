package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.01l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC008101l {
    public boolean LIZ;
    public final CopyOnWriteArrayList<InterfaceC008001k> LIZIZ = new CopyOnWriteArrayList<>();

    public abstract void LIZ();

    public final void LIZIZ() {
        Iterator<InterfaceC008001k> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    public AbstractC008101l(boolean z) {
        this.LIZ = z;
    }
}
