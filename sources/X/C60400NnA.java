package X;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.NnA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60400NnA<K, V> extends HashMap<K, V> implements InterfaceC60311Nlj<K, V> {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    public /* bridge */ java.util.Set getEntries() {
        return super.entrySet();
    }

    public /* bridge */ java.util.Set getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection getValues() {
        return super.values();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    public V getAny(K k) {
        return get(k);
    }

    @Override // X.InterfaceC60311Nlj
    public Boolean getBoolean(K k) {
        V v = get(k);
        if (!(v instanceof Boolean)) {
            v = (V) null;
        }
        return v;
    }

    @Override // X.InterfaceC60311Nlj
    public String getString(K k) {
        V v = get(k);
        if (!(v instanceof String)) {
            v = (V) null;
        }
        return v;
    }

    public boolean putAnyIfAbsent(K k, V v) {
        if (containsKey(k)) {
            return false;
        }
        put(k, v);
        return true;
    }

    @Override // X.InterfaceC60311Nlj
    public boolean putBooleanIfAbsent(K k, boolean z) {
        Object LIZ;
        if (containsKey(k)) {
            return false;
        }
        try {
            LIZ = put(k, Boolean.valueOf(z));
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        return C3C5.m13isSuccessimpl(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC60311Nlj
    public boolean putStringIfAbsent(K k, String v) {
        Object LIZ;
        o.LJIIJ(v, "v");
        if (containsKey(k)) {
            return false;
        }
        try {
            LIZ = put(k, v);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        return C3C5.m13isSuccessimpl(LIZ);
    }
}
