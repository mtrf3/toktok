package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0or, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC19010or<Key, Value> {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public final CopyOnWriteArrayList<InterfaceC18990op> LIZIZ = new CopyOnWriteArrayList<>();

    public abstract boolean LIZLLL();

    public void LIZJ() {
        if (this.LIZ.compareAndSet(false, true)) {
            Iterator<InterfaceC18990op> it = this.LIZIZ.iterator();
            while (it.hasNext()) {
                it.next().LIZ();
            }
        }
    }

    public boolean LJ() {
        return this.LIZ.get();
    }

    public void LIZIZ(InterfaceC18990op interfaceC18990op) {
        this.LIZIZ.add(interfaceC18990op);
    }

    public void LJFF(InterfaceC18990op interfaceC18990op) {
        this.LIZIZ.remove(interfaceC18990op);
    }
}
