package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.3mF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93833mF implements java.util.Map, Serializable, InterfaceC90533gv {
    public static final C93833mF LJLIL = new C93833mF();
    public static final long serialVersionUID = 8246714829545688274L;

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return 0;
    }

    public final String toString() {
        return "{}";
    }

    private final Object readResolve() {
        return LJLIL;
    }

    @Override // java.util.Map
    public final java.util.Set<Map.Entry> entrySet() {
        return OQY.INSTANCE;
    }

    @Override // java.util.Map
    public final java.util.Set<Object> keySet() {
        return OQY.INSTANCE;
    }

    @Override // java.util.Map
    public final Collection values() {
        return C61878OQg.INSTANCE;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object value) {
        if (!(value instanceof Void)) {
            return false;
        }
        o.LJIIIZ(value, "value");
        return false;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if ((obj instanceof java.util.Map) && ((java.util.Map) obj).isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
