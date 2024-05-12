package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.E9d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35953E9d<K, V> extends LinkedHashMap<K, V> {
    public static final C35954E9e Companion = new C35954E9e();
    public final int LJLIL;

    public C35953E9d() {
        this(0, 1, null);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set<Map.Entry<K, V>> entrySet() {
        return (java.util.Set<Map.Entry<K, V>>) getEntries();
    }

    public /* bridge */ java.util.Set<Map.Entry<Object, Object>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ java.util.Set<Object> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<Object> getValues() {
        return super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set<K> keySet() {
        return (java.util.Set<K>) getKeys();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<V> values() {
        return (Collection<V>) getValues();
    }

    public final int getCapacity() {
        return this.LJLIL;
    }

    public C35953E9d(int i) {
        super(i, 0.75f, true);
        this.LJLIL = i;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<K, V> entry) {
        if (size() > this.LJLIL) {
            return true;
        }
        return false;
    }

    public /* synthetic */ C35953E9d(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 100 : i);
    }
}
