package X;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.Pui, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65964Pui<T> extends ConcurrentLinkedQueue<T> {
    public final int LJLIL;
    public final InterfaceC65965Puj<T> LJLILLLLZI;

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue
    public synchronized boolean offer(T t) {
        boolean offer;
        InterfaceC65965Puj<T> interfaceC65965Puj;
        if (size() >= this.LJLIL && (interfaceC65965Puj = this.LJLILLLLZI) != null) {
            interfaceC65965Puj.LIZIZ(this);
        }
        if (size() + 1 > this.LJLIL) {
            poll();
        }
        offer = super.offer(t);
        InterfaceC65965Puj<T> interfaceC65965Puj2 = this.LJLILLLLZI;
        if (interfaceC65965Puj2 != null) {
            interfaceC65965Puj2.LIZ(this, t, offer);
        }
        return offer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65964Pui(int i, InterfaceC65965Puj<T> interfaceC65965Puj, Collection<? extends T> initialCollection) {
        super(initialCollection);
        o.LJIIIZ(initialCollection, "initialCollection");
        this.LJLIL = i;
        this.LJLILLLLZI = interfaceC65965Puj;
    }

    public C65964Pui(int i, InterfaceC65965Puj interfaceC65965Puj, Collection collection, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : interfaceC65965Puj, (i2 & 4) != 0 ? C61878OQg.INSTANCE : collection);
    }
}
