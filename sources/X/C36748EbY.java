package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.EbY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36748EbY {
    public static final JSONObject LIZIZ(java.util.Map<String, String> map) {
        if (map != null) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject;
        }
        return new JSONObject();
    }

    public static final List<String> LIZJ(JSONArray jSONArray) {
        if (jSONArray == null) {
            return C61878OQg.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String string = JSONArrayProtectorUtils.getString(jSONArray, i);
            o.LJFF(string, "this@toStringList.getString(i)");
            arrayList.add(string);
        }
        return arrayList;
    }

    public static final SortedMap<String, String> LIZLLL(JSONObject jSONObject) {
        TreeMap treeMap = new TreeMap();
        Iterator<String> keys = jSONObject.keys();
        o.LJFF(keys, "keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            treeMap.put(next, JSONObjectProtectorUtils.getString(jSONObject, next));
        }
        return treeMap;
    }

    public static final SortedMap<String, AbstractC36750Eba> LJ(JSONObject jSONObject) {
        TreeMap treeMap = new TreeMap();
        Iterator<String> keys = jSONObject.keys();
        o.LJFF(keys, "this@toTypedMap.keys()");
        while (keys.hasNext()) {
            String key = keys.next();
            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, key);
            String value = JSONObjectProtectorUtils.getString(jSONObject2, "value");
            String string = JSONObjectProtectorUtils.getString(jSONObject2, "type");
            o.LJFF(string, "obj.getString(\"type\")");
            Locale locale = Locale.ROOT;
            o.LJFF(locale, "Locale.ROOT");
            String lowerCase = string.toLowerCase(locale);
            o.LJFF(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            switch (lowerCase.hashCode()) {
                case -1249586564:
                    if (!lowerCase.equals("variable")) {
                        break;
                    } else {
                        o.LJFF(key, "key");
                        o.LJFF(value, "value");
                        treeMap.put(key, new C36752Ebc(value));
                        break;
                    }
                case -892481938:
                    if (!lowerCase.equals("static")) {
                        break;
                    } else {
                        o.LJFF(key, "key");
                        o.LJFF(value, "value");
                        treeMap.put(key, new C36751Ebb(value));
                        break;
                    }
                case -362445944:
                    if (!lowerCase.equals("pathparam")) {
                        break;
                    } else {
                        o.LJFF(key, "key");
                        o.LJFF(value, "value");
                        treeMap.put(key, new C36753Ebd(value));
                        break;
                    }
                case 107944136:
                    if (!lowerCase.equals("query")) {
                        break;
                    } else {
                        o.LJFF(key, "key");
                        o.LJFF(value, "value");
                        treeMap.put(key, new C36749EbZ(value));
                        break;
                    }
            }
        }
        return treeMap;
    }

    public static final String LIZ(String baseUrl, java.util.Map<String, String> map) {
        o.LJIIJ(baseUrl, "baseUrl");
        Uri.Builder buildUpon = UriProtector.parse(baseUrl).buildUpon();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        String builder = buildUpon.toString();
        o.LJFF(builder, "builder.toString()");
        return builder;
    }
}
