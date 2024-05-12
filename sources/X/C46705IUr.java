package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.IUr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46705IUr extends LinkedHashMap<String, IYQ> {
    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set<Map.Entry<String, IYQ>> entrySet() {
        return getEntries();
    }

    public /* bridge */ java.util.Set<Map.Entry<String, IYQ>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ java.util.Set<String> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<IYQ> getValues() {
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
    public final /* bridge */ Collection<IYQ> values() {
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
        if (!(obj instanceof IYQ)) {
            return false;
        }
        return containsValue((IYQ) obj);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ IYQ get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return get((String) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ IYQ remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return remove((String) obj);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<String, IYQ> entry) {
        if (size() > 100) {
            return true;
        }
        return false;
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public /* bridge */ boolean containsValue(IYQ iyq) {
        return super.containsValue((Object) iyq);
    }

    public /* bridge */ IYQ get(String str) {
        return get((Object) str);
    }

    public /* bridge */ IYQ remove(String str) {
        return remove((Object) str);
    }

    public final /* bridge */ IYQ getOrDefault(Object obj, IYQ iyq) {
        if (!(obj instanceof String)) {
            return iyq;
        }
        return getOrDefault((String) obj, iyq);
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
        if (obj2 != null && !(obj2 instanceof IYQ)) {
            return false;
        }
        return remove((String) obj, (IYQ) obj2);
    }

    public /* bridge */ IYQ getOrDefault(String str, IYQ iyq) {
        return getOrDefault((Object) str, (String) iyq);
    }

    public /* bridge */ boolean remove(String str, IYQ iyq) {
        return super.remove((Object) str, (Object) iyq);
    }
}
