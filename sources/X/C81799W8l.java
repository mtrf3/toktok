package X;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: X.W8l, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81799W8l<T> implements InterfaceC81759W6x<T> {
    public final InterfaceC81759W6x<T> LIZ;
    public int LIZIZ;
    public final ConcurrentLinkedQueue<Pair<W7F<T>, InterfaceC81770W7i>> LIZJ;
    public final Executor LIZLLL;

    public C81799W8l(Executor executor, InterfaceC81759W6x interfaceC81759W6x) {
        executor.getClass();
        this.LIZLLL = executor;
        this.LIZ = interfaceC81759W6x;
        this.LIZJ = new ConcurrentLinkedQueue<>();
        this.LIZIZ = 0;
    }

    @Override // X.InterfaceC81759W6x
    public final void LIZIZ(W7F<T> w7f, InterfaceC81770W7i interfaceC81770W7i) {
        boolean z;
        interfaceC81770W7i.LIZ().LIZ(interfaceC81770W7i.getId(), "ThrottlingProducer");
        synchronized (this) {
            int i = this.LIZIZ;
            z = true;
            if (i >= 5) {
                this.LIZJ.add(Pair.create(w7f, interfaceC81770W7i));
            } else {
                this.LIZIZ = i + 1;
                z = false;
            }
        }
        if (!z) {
            interfaceC81770W7i.LIZ().LIZIZ(interfaceC81770W7i.getId(), "ThrottlingProducer", null);
            this.LIZ.LIZIZ(new C81805W8r(this, w7f), interfaceC81770W7i);
        }
    }
}
