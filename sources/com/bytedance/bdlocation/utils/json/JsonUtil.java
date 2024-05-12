package com.bytedance.bdlocation.utils.json;

import X.C16880lQ;
import X.X1D;
import android.location.Location;
import android.text.TextUtils;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.log.Logger;
import com.bytedance.bdlocation.utils.json.deserializer.BDLocationDeserializer;
import com.bytedance.bdlocation.utils.json.deserializer.LocationDeserializer;
import com.bytedance.bdlocation.utils.json.serializer.BDLocationSerializer;
import com.bytedance.bdlocation.utils.json.serializer.LocationSerializer;
import com.google.gson.Gson;
import com.google.gson.e;
import com.google.gson.j;
import java.lang.reflect.Type;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class JsonUtil {
    public static Gson sGson;

    static {
        e eVar = new e();
        eVar.LIZ = eVar.LIZ.LJ(new SuperclassExclusionStrategy(), false, true);
        eVar.LIZ = eVar.LIZ.LJ(new SuperclassExclusionStrategy(), true, false);
        eVar.LIZLLL(Location.class, new LocationSerializer());
        eVar.LIZLLL(Location.class, new LocationDeserializer());
        eVar.LIZLLL(BDLocation.class, new BDLocationSerializer());
        eVar.LIZLLL(BDLocation.class, new BDLocationDeserializer());
        sGson = eVar.LIZ();
    }

    public static j safeToJsonTree(Object obj) {
        Logger.d("BDLocation", "Util#safeToJsonTree begin executing");
        try {
            return sGson.LJIJJLI(obj);
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Util#safeToJsonTree occurs exception that ");
            LIZ.append(th.getMessage());
            Logger.d("BDLocation", X1D.LIZIZ(LIZ));
            return null;
        }
    }

    public static j toJsonTreeSafely(Object obj) {
        try {
            return new Gson().LJIJJLI(obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static j toJsonTreeSafely(Object obj, Type type) {
        try {
            return new Gson().LJIL(obj, type);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int safeOptInt(JSONObject jSONObject, String str, int i) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            i = jSONObject.optInt(str);
            return i;
        } catch (Throwable unused) {
            return i;
        }
    }

    public static long safeOptLong(JSONObject jSONObject, String str, long j) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return j;
        }
        try {
            j = jSONObject.optLong(str, j);
            return j;
        } catch (Throwable unused) {
            return j;
        }
    }

    public static String safeOptString(JSONObject jSONObject, String str, String str2) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return str2;
        }
        try {
            str2 = jSONObject.optString(str);
            return str2;
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static void safePutBoolean(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            jSONObject.put(str, z);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void safePutDouble(JSONObject jSONObject, String str, double d) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            jSONObject.put(str, d);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void safePutInt(JSONObject jSONObject, String str, int i) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            jSONObject.put(str, i);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void safePutLong(JSONObject jSONObject, String str, long j) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            jSONObject.put(str, j);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void safePutString(JSONObject jSONObject, String str, String str2) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
