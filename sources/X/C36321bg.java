package X;

import com.google.gson.j;
import com.google.gson.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.o;

/* renamed from: X.1bg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36321bg implements java.util.Map<String, Object>, InterfaceC90533gv {
    public final m LJLIL;

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object compute(String str, BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfAbsent(String str, Function<? super String, ? extends Object> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfPresent(String str, BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object merge(String str, Object obj, BiFunction<? super Object, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(String str, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends String, ? extends Object> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object putIfAbsent(String str, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object replace(String str, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.util.Set<Map.Entry<String, Object>> entrySet() {
        java.util.Set<Map.Entry<String, j>> entrySet = this.LJLIL.entrySet();
        o.LJIIIIZZ(entrySet, "delegate.entrySet()");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Map.Entry<String, j>> it = entrySet.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(new C36311bf(it.next()));
        }
        return linkedHashSet;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.LJLIL.size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final java.util.Set<String> keySet() {
        java.util.Set<String> LJJIZ = this.LJLIL.LJJIZ();
        o.LJIIIIZZ(LJJIZ, "delegate.keySet()");
        return LJJIZ;
    }

    @Override // java.util.Map
    public final int size() {
        return this.LJLIL.size();
    }

    @Override // java.util.Map
    public final Collection<Object> values() {
        java.util.Set<Map.Entry<String, j>> entrySet = this.LJLIL.entrySet();
        o.LJIIIIZZ(entrySet, "delegate.entrySet()");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Map.Entry<String, j>> it = entrySet.iterator();
        while (it.hasNext()) {
            j value = it.next().getValue();
            o.LJIIIIZZ(value, "it.value");
            linkedHashSet.add(C05600Jw.LIZIZ(value));
        }
        return linkedHashSet;
    }

    public C36321bg(m delegate) {
        o.LJIIIZ(delegate, "delegate");
        this.LJLIL = delegate;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object key) {
        if (!(key instanceof String)) {
            return false;
        }
        o.LJIIIZ(key, "key");
        return this.LJLIL.LJJIZ().contains(key);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        java.util.Set<Map.Entry<String, j>> entrySet = this.LJLIL.entrySet();
        o.LJIIIIZZ(entrySet, "delegate.entrySet()");
        if (entrySet.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<String, j>> it = entrySet.iterator();
        while (it.hasNext()) {
            if (o.LJ(it.next().getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String key = (String) obj;
        o.LJIIIZ(key, "key");
        j LJJIJ = this.LJLIL.LJJIJ(key);
        if (LJJIJ == null) {
            return null;
        }
        return C05600Jw.LIZIZ(LJJIJ);
    }
}
