package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.IUh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46695IUh extends LinkedHashMap<String, Long> {
    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set<Map.Entry<String, Long>> entrySet() {
        return getEntries();
    }

    public /* bridge */ java.util.Set<Map.Entry<String, Long>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ java.util.Set<String> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<Long> getValues() {
        return super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set<String> keySet() {
        return getKeys();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<Long> values() {
        return getValues();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return containsKey((String) obj);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof Long)) {
            return false;
        }
        return containsValue((Long) obj);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Long get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return get((String) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Long remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return remove((String) obj);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<String, Long> eldest) {
        o.LJIIIZ(eldest, "eldest");
        if (size() > 10) {
            return true;
        }
        return false;
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public /* bridge */ boolean containsValue(Long l) {
        return super.containsValue((Object) l);
    }

    public /* bridge */ Long get(String str) {
        return get((Object) str);
    }

    public /* bridge */ Long remove(String str) {
        return remove((Object) str);
    }

    public final /* bridge */ Long getOrDefault(Object obj, Long l) {
        if (!(obj instanceof String)) {
            return l;
        }
        return getOrDefault((String) obj, l);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof String;
        }
        if (!z) {
            return false;
        }
        if (obj2 != null && !(obj2 instanceof Long)) {
            return false;
        }
        return remove((String) obj, (Long) obj2);
    }

    public /* bridge */ Long getOrDefault(String str, Long l) {
        return getOrDefault((Object) str, (String) l);
    }

    public /* bridge */ boolean remove(String str, Long l) {
        return super.remove((Object) str, (Object) l);
    }
}
