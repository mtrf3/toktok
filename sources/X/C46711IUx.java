package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.IUx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46711IUx extends LinkedHashMap<String, C47164IfA> {
    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set<Map.Entry<String, C47164IfA>> entrySet() {
        return getEntries();
    }

    public /* bridge */ java.util.Set<Map.Entry<String, C47164IfA>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ java.util.Set<String> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<C47164IfA> getValues() {
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
    public final /* bridge */ Collection<C47164IfA> values() {
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
        if (!(obj instanceof C47164IfA)) {
            return false;
        }
        return containsValue((C47164IfA) obj);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ C47164IfA get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return get((String) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ C47164IfA remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return remove((String) obj);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<String, C47164IfA> entry) {
        if (size() > 50) {
            return true;
        }
        return false;
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public /* bridge */ boolean containsValue(C47164IfA c47164IfA) {
        return super.containsValue((Object) c47164IfA);
    }

    public /* bridge */ C47164IfA get(String str) {
        return get((Object) str);
    }

    public /* bridge */ C47164IfA remove(String str) {
        return remove((Object) str);
    }

    public final /* bridge */ C47164IfA getOrDefault(Object obj, C47164IfA c47164IfA) {
        if (!(obj instanceof String)) {
            return c47164IfA;
        }
        return getOrDefault((String) obj, c47164IfA);
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
        if (obj2 != null && !(obj2 instanceof C47164IfA)) {
            return false;
        }
        return remove((String) obj, (C47164IfA) obj2);
    }

    public /* bridge */ C47164IfA getOrDefault(String str, C47164IfA c47164IfA) {
        return getOrDefault((Object) str, (String) c47164IfA);
    }

    public /* bridge */ boolean remove(String str, C47164IfA c47164IfA) {
        return super.remove((Object) str, (Object) c47164IfA);
    }
}
