package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BRo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC28788BRo<T> {
    public T LIZIZ;
    public final List<WeakReference<InterfaceC28471BFj<T>>> LIZ = new ArrayList();
    public final boolean LIZJ = true;

    public final void LIZ(InterfaceC28471BFj<T> interfaceC28471BFj) {
        if (interfaceC28471BFj == null) {
            return;
        }
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            Reference reference = (Reference) it.next();
            if (reference.get() == null) {
                it.remove();
            } else if (reference.get() == interfaceC28471BFj) {
                return;
            }
        }
        ((ArrayList) this.LIZ).add(new WeakReference(interfaceC28471BFj));
        if (this.LIZJ) {
            interfaceC28471BFj.onChanged(this.LIZIZ);
        }
    }

    public final void LIZIZ(T t) {
        if (t == this.LIZIZ) {
            return;
        }
        this.LIZIZ = t;
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            Reference reference = (Reference) it.next();
            if (reference.get() == null) {
                it.remove();
            } else {
                ((InterfaceC28471BFj) reference.get()).onChanged(this.LIZIZ);
            }
        }
    }

    public final void LIZJ(InterfaceC28471BFj<T> interfaceC28471BFj) {
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            Reference reference = (Reference) it.next();
            if (reference.get() == null) {
                it.remove();
            } else if (reference.get() == interfaceC28471BFj) {
                it.remove();
                return;
            }
        }
    }
}
