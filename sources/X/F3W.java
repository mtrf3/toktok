package X;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class F3W<T> implements InterfaceC1039145z<T> {
    public final AtomicReference<InterfaceC1039145z<T>> LIZ;

    @Override // X.InterfaceC1039145z
    public final Iterator<T> iterator() {
        InterfaceC1039145z<T> andSet = this.LIZ.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }

    public F3W(InterfaceC1039145z<? extends T> interfaceC1039145z) {
        this.LIZ = new AtomicReference<>(interfaceC1039145z);
    }
}
