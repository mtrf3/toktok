package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.ss.android.ugc.aweme.net.CommonApi;
import defpackage.i0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class EYV {
    public static final /* synthetic */ int LIZ = 0;

    public static CommonApi LIZ(String str) {
        Object obj = null;
        if (C38354F3m.LJ(str)) {
            return null;
        }
        InterfaceC789838c create = C46104I7o.LJJII().create(str);
        if (create != null) {
            obj = create.create(CommonApi.class);
        }
        o.LJI(obj);
        return (CommonApi) obj;
    }

    public static void LJ(JSONObject jSONObject, String str, java.util.Map map) {
        String LIZIZ;
        String str2;
        if (jSONObject == null) {
            return;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            if (TextUtils.isEmpty(str)) {
                o.LJIIIIZZ(key, "key");
                LIZIZ = key;
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str);
                LIZ2.append('[');
                LIZ2.append(key);
                LIZ2.append(']');
                LIZIZ = X1D.LIZIZ(LIZ2);
            }
            Object obj = jSONObject.get(key);
            if (obj instanceof JSONObject) {
                LJ((JSONObject) obj, LIZIZ, map);
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    LJ(JSONArrayProtectorUtils.getJSONObject(jSONArray, i), LIZIZ, map);
                }
            } else {
                if (obj == null || (str2 = obj.toString()) == null) {
                    str2 = "";
                }
                ((HashMap) map).put(LIZIZ, str2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String LIZIZ(String url, JSONObject jSONObject, String str, List list) {
        o.LJIIIZ(url, "url");
        C64797Pbt LIZJ = LIZJ(url, jSONObject, str, list);
        o.LJI(LIZJ);
        T t = LIZJ.LIZIZ;
        o.LJI(t);
        return (String) t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C64797Pbt LIZJ(String url, JSONObject jSONObject, String str, List list) {
        String jSONObject2;
        o.LJIIIZ(url, "url");
        byte[] bArr = null;
        String baseUrl = (String) EZX.LIZJ(url, null).first;
        o.LJIIIIZZ(baseUrl, "baseUrl");
        CommonApi LIZ2 = LIZ(baseUrl);
        if (LIZ2 != 0) {
            if (list == null) {
                list = new ArrayList();
            }
            if (!TextUtils.isEmpty(str)) {
                list.add(new EJ6("Content-Type", str));
            }
            if (str != null && ujb.o.LJJJLIIL(str, "application/json", false)) {
                if (jSONObject != null && (jSONObject2 = jSONObject.toString()) != null) {
                    Charset forName = Charset.forName("UTF-8");
                    o.LJIIIIZZ(forName, "forName(charsetName)");
                    bArr = jSONObject2.getBytes(forName);
                    o.LJIIIIZZ(bArr, "this as java.lang.String).getBytes(charset)");
                }
                return LIZ2.postBody(url, new TypedByteArray(str, bArr, new String[0]), list).execute();
            }
            HashMap hashMap = new HashMap();
            LJ(jSONObject, "", hashMap);
            return LIZ2.doPost(url, hashMap, (List<EJ6>) list).execute();
        }
        throw new RuntimeException(i0.LJFF("CommonApi is null,url=", url));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C64797Pbt LIZLLL(String url, JSONObject jSONObject, String str, List list) {
        String jSONObject2;
        o.LJIIIZ(url, "url");
        byte[] bArr = null;
        String baseUrl = (String) EZX.LIZJ(url, null).first;
        o.LJIIIIZZ(baseUrl, "baseUrl");
        CommonApi LIZ2 = LIZ(baseUrl);
        if (LIZ2 != 0) {
            if (list == null) {
                list = new ArrayList();
            }
            if (!TextUtils.isEmpty(str)) {
                list.add(new EJ6("Content-Type", str));
            }
            if (jSONObject != null && (jSONObject2 = jSONObject.toString()) != null) {
                Charset forName = Charset.forName("UTF-8");
                o.LJIIIIZZ(forName, "forName(charsetName)");
                bArr = jSONObject2.getBytes(forName);
                o.LJIIIIZZ(bArr, "this as java.lang.String).getBytes(charset)");
            }
            return LIZ2.putBody(url, new TypedByteArray(str, bArr, new String[0]), list).execute();
        }
        throw new RuntimeException(i0.LJFF("CommonApi is null,url=", url));
    }
}
