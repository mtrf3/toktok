package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IV1 extends LinkedHashMap<Long, String> {
    public static final IV2 Companion = new IV2();

    public IV1() {
        super(30, 0.75f, true);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set<Map.Entry<Long, String>> entrySet() {
        return getEntries();
    }

    public /* bridge */ java.util.Set<Map.Entry<Long, String>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ java.util.Set<Long> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<String> getValues() {
        return super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set<Long> keySet() {
        return getKeys();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<String> values() {
        return getValues();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof Long)) {
            return false;
        }
        return containsKey((Long) obj);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return containsValue((String) obj);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof Long)) {
            return null;
        }
        return get((Long) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (!(obj instanceof Long)) {
            return null;
        }
        return remove((Long) obj);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<Long, String> eldest) {
        boolean z;
        o.LJIIIZ(eldest, "eldest");
        if (size() > 30) {
            z = true;
        } else {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8(eldest, (Map.Entry<Long, String>) 572);
        if (C78598Ut0.LJIILJJIL(valueOf)) {
            aqS158S0100000_8.invoke();
            return true;
        }
        return false;
    }

    public /* bridge */ boolean containsKey(Long l) {
        return super.containsKey((Object) l);
    }

    public /* bridge */ boolean containsValue(String str) {
        return super.containsValue((Object) str);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ String get(Object obj) {
        if (!(obj instanceof Long)) {
            return null;
        }
        return get((Long) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ String remove(Object obj) {
        if (!(obj instanceof Long)) {
            return null;
        }
        return remove((Long) obj);
    }

    public /* bridge */ String get(Long l) {
        return (String) super.get((Object) l);
    }

    public /* bridge */ String remove(Long l) {
        return (String) super.remove((Object) l);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof Long)) {
            return obj2;
        }
        return getOrDefault((Long) obj, (String) obj2);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof Long) || !(obj2 instanceof String)) {
            return false;
        }
        return remove((Long) obj, (String) obj2);
    }

    public final /* bridge */ String getOrDefault(Object obj, String str) {
        if (!(obj instanceof Long)) {
            return str;
        }
        return getOrDefault((Long) obj, str);
    }

    public /* bridge */ boolean remove(Long l, String str) {
        return super.remove((Object) l, (Object) str);
    }

    public /* bridge */ String getOrDefault(Long l, String str) {
        return (String) super.getOrDefault((Object) l, (Long) str);
    }
}
