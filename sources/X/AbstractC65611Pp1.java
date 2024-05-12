package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Pp1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65611Pp1<K, V> extends AbstractC65632PpM<K, V> implements Serializable {
    public static final long serialVersionUID = 0;
    public final transient AbstractC65564PoG<K, ? extends AbstractC65578PoU<V>> LJLJJLL;
    public final transient int LJLJL;

    @Override // X.InterfaceC65633PpN
    public abstract AbstractC65578PoU<V> get(K k);

    public abstract AbstractC65611Pp1<V, K> inverse();

    public static <K, V> C65620PpA<K, V> builder() {
        return new C65620PpA<>();
    }

    @Override // X.AbstractC65632PpM
    public final java.util.Map<K, Collection<V>> LIZ() {
        throw new AssertionError("should never be called");
    }

    @Override // X.AbstractC65632PpM
    public final Collection LIZIZ() {
        return new C65616Pp6(this);
    }

    @Override // X.AbstractC65632PpM
    public final java.util.Set<K> LIZJ() {
        throw new AssertionError("unreachable");
    }

    @Override // X.AbstractC65632PpM
    public final InterfaceC65672Pq0 LIZLLL() {
        return new C65614Pp4(this);
    }

    @Override // X.AbstractC65632PpM
    public final Collection LJ() {
        return new C65613Pp3(this);
    }

    @Override // X.AbstractC65632PpM
    public final Iterator LJFF() {
        return new C65617Pp7(this);
    }

    @Override // X.AbstractC65632PpM
    public final Iterator LJI() {
        return new C65622PpC(this);
    }

    @Override // X.InterfaceC65633PpN
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // X.AbstractC65632PpM, X.InterfaceC65633PpN
    public AbstractC65583PoZ<K> keySet() {
        return this.LJLJJLL.keySet();
    }

    public static <K, V> AbstractC65611Pp1<K, V> of() {
        return C65610Pp0.of();
    }

    @Override // X.AbstractC65632PpM, X.InterfaceC65633PpN
    public AbstractC65578PoU<Map.Entry<K, V>> entries() {
        return (AbstractC65578PoU) super.entries();
    }

    @Override // X.AbstractC65632PpM
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // X.AbstractC65632PpM, X.InterfaceC65633PpN
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // X.AbstractC65632PpM
    public AbstractC65654Ppi<K> keys() {
        return (AbstractC65654Ppi) super.keys();
    }

    @Override // X.AbstractC65632PpM
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // X.AbstractC65632PpM
    public AbstractC65578PoU<V> values() {
        return (AbstractC65578PoU) super.values();
    }

    @Override // X.InterfaceC65633PpN
    public int size() {
        return this.LJLJL;
    }

    @Override // X.AbstractC65632PpM, X.InterfaceC65633PpN
    public AbstractC65564PoG<K, Collection<V>> asMap() {
        return this.LJLJJLL;
    }

    public static <K, V> AbstractC65611Pp1<K, V> copyOf(InterfaceC65633PpN<? extends K, ? extends V> interfaceC65633PpN) {
        if (interfaceC65633PpN instanceof AbstractC65611Pp1) {
            AbstractC65611Pp1<K, V> abstractC65611Pp1 = (AbstractC65611Pp1) interfaceC65633PpN;
            if (!abstractC65611Pp1.LJLJJLL.LJ()) {
                return abstractC65611Pp1;
            }
        }
        return C65610Pp0.copyOf((InterfaceC65633PpN) interfaceC65633PpN);
    }

    @Override // X.InterfaceC65633PpN
    public boolean containsKey(Object obj) {
        return this.LJLJJLL.containsKey(obj);
    }

    @Override // X.AbstractC65632PpM
    public boolean containsValue(Object obj) {
        if (obj != null && super.containsValue(obj)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC65632PpM
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65633PpN
    public /* bridge */ /* synthetic */ Collection get(Object obj) {
        return get((AbstractC65611Pp1<K, V>) obj);
    }

    @Override // X.AbstractC65632PpM
    public boolean putAll(InterfaceC65633PpN<? extends K, ? extends V> interfaceC65633PpN) {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC65633PpN
    public AbstractC65578PoU<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> AbstractC65611Pp1<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return C65610Pp0.copyOf((Iterable) iterable);
    }

    public AbstractC65611Pp1(AbstractC65564PoG<K, ? extends AbstractC65578PoU<V>> abstractC65564PoG, int i) {
        this.LJLJJLL = abstractC65564PoG;
        this.LJLJL = i;
    }

    public static <K, V> AbstractC65611Pp1<K, V> of(K k, V v) {
        return C65610Pp0.of((Object) k, (Object) v);
    }

    @Override // X.AbstractC65632PpM, X.InterfaceC65633PpN
    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // X.AbstractC65632PpM, X.InterfaceC65633PpN
    public boolean put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // X.AbstractC65632PpM
    public boolean putAll(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // X.AbstractC65632PpM, X.InterfaceC65633PpN
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // X.AbstractC65632PpM
    public AbstractC65578PoU<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC65632PpM
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues((AbstractC65611Pp1<K, V>) obj, iterable);
    }

    public static <K, V> AbstractC65611Pp1<K, V> of(K k, V v, K k2, V v2) {
        return C65610Pp0.of((Object) k, (Object) v, (Object) k2, (Object) v2);
    }

    public static <K, V> AbstractC65611Pp1<K, V> of(K k, V v, K k2, V v2, K k3, V v3) {
        return C65610Pp0.of((Object) k, (Object) v, (Object) k2, (Object) v2, (Object) k3, (Object) v3);
    }

    public static <K, V> AbstractC65611Pp1<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        return C65610Pp0.of((Object) k, (Object) v, (Object) k2, (Object) v2, (Object) k3, (Object) v3, (Object) k4, (Object) v4);
    }

    public static <K, V> AbstractC65611Pp1<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v6) {
        return C65610Pp0.of((Object) k, (Object) v, (Object) k2, (Object) v2, (Object) k3, (Object) v3, (Object) k4, (Object) v4, (Object) k5, (Object) v6);
    }
}
