package X;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.Pto, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65908Pto<T> extends ConcurrentLinkedQueue<T> {
    public final ConcurrentHashMap<Object, T> LJLIL;
    public final InterfaceC65784Pro<Integer> LJLILLLLZI;
    public final InterfaceC88472Yns<T, Object> LJLJI;
    public final InterfaceC65913Ptt<T> LJLJJI;

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue
    public synchronized T poll() {
        T t;
        t = (T) super.poll();
        if (t != null) {
            this.LJLIL.remove(LIZJ(t));
            InterfaceC65913Ptt<T> interfaceC65913Ptt = this.LJLJJI;
            if (interfaceC65913Ptt != null) {
                interfaceC65913Ptt.LIZIZ(this, t);
            }
        }
        return t;
    }

    public final int getMapSize() {
        return this.LJLIL.size();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    public final InterfaceC65784Pro<Integer> getCapacityGetter() {
        return this.LJLILLLLZI;
    }

    public final Object LIZJ(T t) {
        if (t != null) {
            InterfaceC88472Yns<T, Object> interfaceC88472Yns = this.LJLJI;
            if (interfaceC88472Yns != null) {
                return interfaceC88472Yns.invoke(t);
            }
            return C76800UCe.LIZ;
        }
        return C76800UCe.LIZ;
    }

    public final T getElementByUniqueKey(Object uniqueKey) {
        o.LJIIIZ(uniqueKey, "uniqueKey");
        return this.LJLIL.get(uniqueKey);
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue
    public synchronized boolean offer(T t) {
        boolean offer;
        InterfaceC65913Ptt<T> interfaceC65913Ptt;
        if (size() >= this.LJLILLLLZI.invoke().intValue() && (interfaceC65913Ptt = this.LJLJJI) != null) {
            interfaceC65913Ptt.LIZJ(this);
        }
        if (size() + 1 > this.LJLILLLLZI.invoke().intValue()) {
            poll();
        }
        offer = super.offer(t);
        if (offer) {
            this.LJLIL.put(LIZJ(t), t);
            InterfaceC65913Ptt<T> interfaceC65913Ptt2 = this.LJLJJI;
            if (interfaceC65913Ptt2 != null) {
                interfaceC65913Ptt2.LIZ(this, t);
            }
        }
        return offer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractCollection, java.util.Collection
    public synchronized boolean remove(Object obj) {
        boolean remove;
        remove = super.remove(obj);
        if (remove && obj != 0) {
            this.LJLIL.remove(LIZJ(obj));
            InterfaceC65913Ptt<T> interfaceC65913Ptt = this.LJLJJI;
            if (interfaceC65913Ptt != null) {
                interfaceC65913Ptt.LIZIZ(this, obj);
            }
        }
        return remove;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C65908Pto(InterfaceC65784Pro<Integer> capacityGetter, InterfaceC88472Yns<? super T, ? extends Object> interfaceC88472Yns, InterfaceC65913Ptt<T> interfaceC65913Ptt, Collection<? extends T> initialCollection) {
        super(initialCollection);
        o.LJIIIZ(capacityGetter, "capacityGetter");
        o.LJIIIZ(initialCollection, "initialCollection");
        this.LJLILLLLZI = capacityGetter;
        this.LJLJI = interfaceC88472Yns;
        this.LJLJJI = interfaceC65913Ptt;
        this.LJLIL = new ConcurrentHashMap<>();
    }

    public C65908Pto(InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65913Ptt interfaceC65913Ptt, Collection collection, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC65784Pro, (i & 2) != 0 ? null : interfaceC88472Yns, (i & 4) != 0 ? null : interfaceC65913Ptt, (i & 8) != 0 ? C61878OQg.INSTANCE : collection);
    }
}
