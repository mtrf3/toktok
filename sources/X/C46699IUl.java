package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.IUl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46699IUl extends LinkedHashMap<String, Boolean> {
    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set<Map.Entry<String, Boolean>> entrySet() {
        return getEntries();
    }

    public /* bridge */ java.util.Set<Map.Entry<String, Boolean>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ java.util.Set<String> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<Boolean> getValues() {
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
    public final /* bridge */ Collection<Boolean> values() {
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
        if (!(obj instanceof Boolean)) {
            return false;
        }
        return containsValue((Boolean) obj);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Boolean get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return get((String) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Boolean remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return remove((String) obj);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<String, Boolean> eldest) {
        o.LJIIIZ(eldest, "eldest");
        if (size() > 5) {
            return true;
        }
        return false;
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public /* bridge */ boolean containsValue(Boolean bool) {
        return super.containsValue((Object) bool);
    }

    public /* bridge */ Boolean get(String str) {
        return get((Object) str);
    }

    public /* bridge */ Boolean remove(String str) {
        return remove((Object) str);
    }

    public final /* bridge */ Boolean getOrDefault(Object obj, Boolean bool) {
        if (!(obj instanceof String)) {
            return bool;
        }
        return getOrDefault((String) obj, bool);
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
        if (obj2 != null && !(obj2 instanceof Boolean)) {
            return false;
        }
        return remove((String) obj, (Boolean) obj2);
    }

    public /* bridge */ Boolean getOrDefault(String str, Boolean bool) {
        return getOrDefault((Object) str, (String) bool);
    }

    public /* bridge */ boolean remove(String str, Boolean bool) {
        return super.remove((Object) str, (Object) bool);
    }
}
