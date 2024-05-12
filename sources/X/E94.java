package X;

import Y.IDComparatorS34S0000000_6;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class E94 {
    public android.net.Uri LIZ;
    public android.net.Uri LIZIZ;
    public android.net.Uri LIZJ;
    public final C62822Ol8 LIZLLL;

    public final String LIZ() {
        Uri.Builder clearQuery;
        Uri.Builder buildUpon;
        Uri.Builder clearQuery2;
        Uri.Builder buildUpon2;
        Uri.Builder clearQuery3;
        android.net.Uri uri = this.LIZIZ;
        if (uri != null && (buildUpon2 = uri.buildUpon()) != null && (clearQuery3 = buildUpon2.clearQuery()) != null) {
            String str = "url";
            if (!LIZJ().containsKey("url")) {
                str = "surl";
            }
            java.util.Map<String, String> map = LIZJ().get(str);
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    clearQuery3.appendQueryParameter(entry.getKey(), entry.getValue());
                }
            }
            java.util.Map<String, String> map2 = LIZJ().get("default");
            if (map2 != null) {
                map2.put(str, clearQuery3.build().toString());
            }
        }
        android.net.Uri uri2 = this.LIZJ;
        if (uri2 != null && (buildUpon = uri2.buildUpon()) != null && (clearQuery2 = buildUpon.clearQuery()) != null) {
            java.util.Map<String, String> map3 = LIZJ().get("fallback_url");
            if (map3 != null) {
                for (Map.Entry<String, String> entry2 : map3.entrySet()) {
                    clearQuery2.appendQueryParameter(entry2.getKey(), entry2.getValue());
                }
            }
            java.util.Map<String, String> map4 = LIZJ().get("default");
            if (map4 != null) {
                map4.put("fallback_url", clearQuery2.build().toString());
            }
        }
        android.net.Uri uri3 = this.LIZ;
        android.net.Uri uri4 = null;
        if (uri3 != null) {
            Uri.Builder buildUpon3 = uri3.buildUpon();
            if (buildUpon3 != null && (clearQuery = buildUpon3.clearQuery()) != null) {
                java.util.Map<String, String> map5 = LIZJ().get("default");
                if (map5 != null) {
                    for (Map.Entry<String, String> entry3 : map5.entrySet()) {
                        clearQuery.appendQueryParameter(entry3.getKey(), entry3.getValue());
                    }
                }
                uri4 = clearQuery.build();
            }
            return String.valueOf(uri4);
        }
        o.LJIJI("uri");
        throw null;
    }

    public final java.util.Map<String, java.util.Map<String, String>> LIZJ() {
        return (java.util.Map) this.LIZLLL.getValue();
    }

    public final android.net.Uri LJ() {
        android.net.Uri uri = this.LIZ;
        if (uri != null) {
            return uri;
        }
        o.LJIJI("uri");
        throw null;
    }

    public E94(String originalUrl) {
        boolean z;
        String str;
        String str2;
        o.LJIIIZ(originalUrl, "originalUrl");
        this.LIZLLL = C221108m2.LIZIZ(E95.LJLIL);
        android.net.Uri parse = UriProtector.parse(originalUrl);
        LIZJ().put("default", new LinkedHashMap());
        java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(parse);
        o.LJIIIIZZ(queryParameterNames, "queryParameterNames");
        for (String key : queryParameterNames) {
            java.util.Map<String, String> map = LIZJ().get("default");
            if (map != null) {
                o.LJIIIIZZ(key, "key");
                map.put(key, UriProtector.getQueryParameter(parse, key));
            }
        }
        o.LJIIIIZZ(parse, "parse(originalUrl).apply…)\n            }\n        }");
        this.LIZ = parse;
        java.util.Map<String, String> map2 = LIZJ().get("default");
        if (map2 != null && map2.containsKey("url")) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            java.util.Map<String, String> map3 = LIZJ().get("default");
            if (map3 != null) {
                str2 = map3.get("url");
            } else {
                str2 = null;
            }
            android.net.Uri parse2 = UriProtector.parse(str2);
            LIZJ().put("url", new LinkedHashMap());
            java.util.Set<String> queryParameterNames2 = UriProtector.getQueryParameterNames(parse2);
            o.LJIIIIZZ(queryParameterNames2, "queryParameterNames");
            for (String key2 : queryParameterNames2) {
                java.util.Map<String, String> map4 = LIZJ().get("url");
                if (map4 != null) {
                    o.LJIIIIZZ(key2, "key");
                    map4.put(key2, UriProtector.getQueryParameter(parse2, key2));
                }
            }
            this.LIZIZ = parse2;
        }
        java.util.Map<String, String> map5 = LIZJ().get("default");
        if (map5 != null && map5.containsKey("surl")) {
            java.util.Map<String, String> map6 = LIZJ().get("default");
            if (map6 != null) {
                str = map6.get("surl");
            } else {
                str = null;
            }
            android.net.Uri parse3 = UriProtector.parse(str);
            LIZJ().put("surl", new LinkedHashMap());
            java.util.Set<String> queryParameterNames3 = UriProtector.getQueryParameterNames(parse3);
            o.LJIIIIZZ(queryParameterNames3, "queryParameterNames");
            for (String key3 : queryParameterNames3) {
                java.util.Map<String, String> map7 = LIZJ().get("surl");
                if (map7 != null) {
                    o.LJIIIIZZ(key3, "key");
                    map7.put(key3, UriProtector.getQueryParameter(parse3, key3));
                }
            }
            this.LIZIZ = parse3;
        }
        java.util.Map<String, String> map8 = LIZJ().get("default");
        if (map8 != null && map8.containsKey("fallback_url")) {
            java.util.Map<String, String> map9 = LIZJ().get("default");
            android.net.Uri parse4 = UriProtector.parse(map9 != null ? map9.get("fallback_url") : null);
            LIZJ().put("fallback_url", new LinkedHashMap());
            java.util.Set<String> queryParameterNames4 = UriProtector.getQueryParameterNames(parse4);
            o.LJIIIIZZ(queryParameterNames4, "queryParameterNames");
            for (String key4 : queryParameterNames4) {
                java.util.Map<String, String> map10 = LIZJ().get("fallback_url");
                if (map10 != null) {
                    o.LJIIIIZZ(key4, "key");
                    map10.put(key4, UriProtector.getQueryParameter(parse4, key4));
                }
            }
            this.LIZJ = parse4;
        }
    }

    public final java.util.Map<String, String> LIZIZ(String str) {
        if (str != null) {
            java.util.Map<String, String> map = LIZJ().get(str);
            if (map == null) {
                return C113554cx.LJJJLIIL();
            }
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ORZ.LLILII(new IDComparatorS34S0000000_6(8), LIZJ().keySet()).iterator();
        while (it.hasNext()) {
            java.util.Map<String, String> map2 = LIZJ().get(it.next());
            if (map2 != null) {
                linkedHashMap.putAll(map2);
            }
        }
        return linkedHashMap;
    }

    public final void LJII(int i, java.util.Map map) {
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            Iterator<Map.Entry<String, java.util.Map<String, String>>> it = LIZJ().entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (it.next().getValue().containsKey(key)) {
                    z = true;
                }
            }
            if (z) {
                if ((i & 2) == 2) {
                    for (Map.Entry<String, java.util.Map<String, String>> entry2 : LIZJ().entrySet()) {
                        if (entry2.getValue().containsKey(key)) {
                            entry2.getValue().put(key, value);
                        }
                    }
                }
            } else if ((i & 1) == 1) {
                java.util.Map<String, java.util.Map<String, String>> LIZJ = LIZJ();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, java.util.Map<String, String>> entry3 : LIZJ.entrySet()) {
                    if (LIZJ().size() <= 1 || !o.LJ("default", entry3.getKey())) {
                        linkedHashMap.put(entry3.getKey(), entry3.getValue());
                    }
                }
                Iterator it2 = linkedHashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    ((java.util.Map) ((Map.Entry) it2.next()).getValue()).put(key, value);
                }
            }
        }
    }

    public final String LIZLLL(String key, String str, String str2) {
        String str3;
        HashMap<String, Object> LJII;
        Object obj;
        String str4;
        HashMap<String, Object> LJII2;
        Object obj2;
        o.LJIIIZ(key, "key");
        try {
            if (str2 != null) {
                if (str != null) {
                    java.util.Map<String, String> map = LIZJ().get(str2);
                    if (map == null || (str4 = map.get(str)) == null || (LJII2 = C27739Aud.LJII(str4)) == null || (obj2 = LJII2.get(key)) == null) {
                        return null;
                    }
                    return obj2.toString();
                }
                java.util.Map<String, String> map2 = LIZJ().get(str2);
                if (map2 == null) {
                    return null;
                }
                return map2.get(key);
            }
            Iterator it = ORZ.LLILII(new IDComparatorS34S0000000_6(9), LIZJ().keySet()).iterator();
            if (!it.hasNext()) {
                return null;
            }
            String str5 = (String) it.next();
            if (str != null) {
                java.util.Map<String, String> map3 = LIZJ().get(str5);
                if (map3 == null || (str3 = map3.get(str)) == null || (LJII = C27739Aud.LJII(str3)) == null || (obj = LJII.get(key)) == null) {
                    return null;
                }
                return obj.toString();
            }
            java.util.Map<String, String> map4 = LIZJ().get(str5);
            if (map4 == null) {
                return null;
            }
            return map4.get(key);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJFF(int i, int i2, java.util.Map map) {
        HashMap<String, Object> LJII;
        Iterator<Map.Entry<String, java.util.Map<String, String>>> it = LIZJ().entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().getValue().containsKey("trackParams")) {
                z = true;
            }
        }
        if (z) {
            if ((i & 2) != 2) {
                return;
            }
            for (Map.Entry<String, java.util.Map<String, String>> entry : LIZJ().entrySet()) {
                if (entry.getValue().containsKey("trackParams") && (LJII = C27739Aud.LJII(entry.getValue().get("trackParams"))) != 0) {
                    for (Map.Entry entry2 : map.entrySet()) {
                        if ((!LJII.containsKey(entry2.getKey()) && (i2 & 1) == 1) || (LJII.containsKey(entry2.getKey()) && (i2 & 2) == 2)) {
                            LJII.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    entry.getValue().put("trackParams", C27739Aud.LJI(LJII));
                }
            }
            return;
        }
        if ((i & 1) != 1) {
            return;
        }
        java.util.Map<String, java.util.Map<String, String>> LIZJ = LIZJ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, java.util.Map<String, String>> entry3 : LIZJ.entrySet()) {
            if (LIZJ().size() <= 1 || !o.LJ("default", entry3.getKey())) {
                linkedHashMap.put(entry3.getKey(), entry3.getValue());
            }
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            java.util.Map map2 = (java.util.Map) ((Map.Entry) it2.next()).getValue();
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry4 : map.entrySet()) {
                jSONObject.put((String) entry4.getKey(), entry4.getValue());
            }
            map2.put("trackParams", jSONObject.toString());
        }
    }

    public final void LJI(int i, String str, String str2) {
        LJII(i, C51029K0z.LJJIIZI(new OSZ(str, str2)));
    }
}
