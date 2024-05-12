package X;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.F9u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38518F9u extends HashMap<String, Object> {
    public static final C38519F9v Companion = new C38519F9v();

    public Object getABParamsValue(String abKey) {
        o.LJIIJ(abKey, "abKey");
        return abKey;
    }

    public HashMap<String, Object> getCommonVarParams(InterfaceC60761Nsz kitView) {
        o.LJIIJ(kitView, "kitView");
        return null;
    }

    public HashMap<String, Object> getPreloadSettingKeys(InterfaceC60761Nsz kitView, String preloadSettingsKeys) {
        o.LJIIJ(kitView, "kitView");
        o.LJIIJ(preloadSettingsKeys, "preloadSettingsKeys");
        return null;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set<Map.Entry<String, Object>> entrySet() {
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
    public final /* bridge */ java.util.Set<String> keySet() {
        return getKeys();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<Object> values() {
        return getValues();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return containsKey((String) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return null;
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public /* bridge */ Object get(String str) {
        return super.get((Object) str);
    }

    public /* bridge */ Object remove(String str) {
        return super.remove((Object) str);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        if (obj instanceof String) {
            return getOrDefault((String) obj, obj2);
        }
        return obj2;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(String key, Object value) {
        Object aBParamsValue;
        o.LJIIJ(key, "key");
        o.LJIIJ(value, "value");
        if (key.equals("abParams")) {
            C39836FkG.LJII.getClass();
            C39858Fkc c39858Fkc = C38262Ezy.LIZ().LIZLLL;
            if (c39858Fkc == null || (aBParamsValue = c39858Fkc.getABParamsValue(value.toString())) == null) {
                aBParamsValue = getABParamsValue(value.toString());
            }
            return super.put((C38518F9u) key, (String) aBParamsValue);
        }
        return super.put((C38518F9u) key, (String) value);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if ((obj instanceof String) && obj2 != null) {
            return remove((String) obj, obj2);
        }
        return false;
    }

    public /* bridge */ Object getOrDefault(String str, Object obj) {
        return super.getOrDefault((Object) str, (String) obj);
    }

    public /* bridge */ boolean remove(String str, Object obj) {
        return super.remove((Object) str, obj);
    }
}
