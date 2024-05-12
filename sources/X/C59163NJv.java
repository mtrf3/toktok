package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.NJv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59163NJv {
    public static void LIZ(N3D n3d, JSONArray jSONArray) {
        N3C c58746N3u;
        JSONArray optJSONArray;
        Object opt;
        JSONArray optJSONArray2;
        if (jSONArray != null && jSONArray.length() > 0) {
            n3d.LIZIZ = jSONArray;
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        int optInt = optJSONObject.optInt("sampling_rate");
                        int optInt2 = optJSONObject.optInt("sampling_method");
                        HashSet hashSet = new HashSet();
                        JSONArray optJSONArray3 = optJSONObject.optJSONArray("events");
                        if (optJSONArray3 != null && optJSONArray3.length() > 0) {
                            for (int i2 = 0; i2 < optJSONArray3.length(); i2++) {
                                String optString = optJSONArray3.optString(i2);
                                if (!TextUtils.isEmpty(optString)) {
                                    hashSet.add(optString);
                                }
                            }
                        }
                        HashMap hashMap = new HashMap();
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("param_keys");
                        if (optJSONObject2 != null) {
                            Iterator<String> keys = optJSONObject2.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                if (!TextUtils.isEmpty(next) && (optJSONArray2 = optJSONObject2.optJSONArray(next)) != null && optJSONArray2.length() > 0) {
                                    ArrayList arrayList = new ArrayList();
                                    for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                                        JSONArray optJSONArray4 = optJSONArray2.optJSONArray(i3);
                                        if (optJSONArray4 != null && optJSONArray4.length() > 0) {
                                            HashSet hashSet2 = new HashSet();
                                            for (int i4 = 0; i4 < optJSONArray4.length(); i4++) {
                                                String optString2 = optJSONArray4.optString(i4);
                                                if (!TextUtils.isEmpty(optString2)) {
                                                    hashSet2.add(optString2);
                                                }
                                            }
                                            arrayList.add(hashSet2);
                                        }
                                    }
                                    hashMap.put(next, arrayList);
                                }
                            }
                        }
                        HashMap hashMap2 = new HashMap();
                        JSONObject optJSONObject3 = optJSONObject.optJSONObject("param_key_values");
                        if (optJSONObject3 != null) {
                            Iterator<String> keys2 = optJSONObject3.keys();
                            while (keys2.hasNext()) {
                                String next2 = keys2.next();
                                if (!TextUtils.isEmpty(next2) && (optJSONArray = optJSONObject3.optJSONArray(next2)) != null && optJSONArray.length() > 0) {
                                    ArrayList arrayList2 = new ArrayList();
                                    for (int i5 = 0; i5 < optJSONArray.length(); i5++) {
                                        JSONObject optJSONObject4 = optJSONArray.optJSONObject(i5);
                                        if (optJSONObject4 != null) {
                                            HashMap hashMap3 = new HashMap();
                                            Iterator<String> keys3 = optJSONObject4.keys();
                                            while (keys3.hasNext()) {
                                                String next3 = keys3.next();
                                                if (!TextUtils.isEmpty(next3) && (opt = optJSONObject4.opt(next3)) != null) {
                                                    hashMap3.put(next3, opt);
                                                }
                                            }
                                            arrayList2.add(hashMap3);
                                        }
                                    }
                                    hashMap2.put(next2, arrayList2);
                                }
                            }
                        }
                        if (optInt2 != 1) {
                            if (optInt2 != 2) {
                                if (optInt2 != 3) {
                                    if (optInt2 != 4) {
                                        if (optInt2 == 5) {
                                            c58746N3u = new N3G(optInt, hashMap, hashMap2, hashSet);
                                        }
                                    } else {
                                        c58746N3u = new N3F(optInt, hashMap, hashMap2, hashSet);
                                    }
                                } else {
                                    c58746N3u = new N3E(optInt, hashMap, hashMap2, hashSet);
                                }
                            } else {
                                c58746N3u = new C58745N3t(optInt, hashMap, hashMap2, hashSet);
                            }
                        } else {
                            c58746N3u = new C58746N3u(optInt, hashMap, hashMap2, hashSet);
                        }
                        ((ArrayList) n3d.LIZJ).add(c58746N3u);
                    }
                } catch (Throwable th) {
                    QIX.LJIJJ().LIZJ(12, "loadSamplingMapFromJsonArray error", th, new Object[0]);
                    return;
                }
            }
        }
    }

    public static N3D LIZJ(Context context, String str) {
        N3D n3d = new N3D();
        if (TextUtils.isEmpty(str)) {
            str = "sampling_list";
        }
        SharedPreferences LIZIZ = F9J.LIZIZ(context, 0, str);
        n3d.LIZ = LIZIZ.getInt("event_sampling_version", 0);
        String string = LIZIZ.getString("samplings", null);
        if (!TextUtils.isEmpty(string)) {
            try {
                LIZ(n3d, new JSONArray(string));
            } catch (Throwable th) {
                QIX.LJIJJ().LIZJ(12, "parseEventSamplingFromLocal", th, new Object[0]);
            }
        }
        return n3d;
    }

    public static N3D LIZIZ(Context context, String str, JSONObject jSONObject, N3D n3d) {
        if (jSONObject == null) {
            return n3d;
        }
        try {
            N3D n3d2 = new N3D();
            n3d2.LIZ = jSONObject.optInt("event_sampling_version", 0);
            JSONArray optJSONArray = jSONObject.optJSONArray("samplings");
            LIZ(n3d2, optJSONArray);
            if (n3d == null || n3d2.LIZ > n3d.LIZ) {
                if (TextUtils.isEmpty(str)) {
                    str = "sampling_list";
                }
                SharedPreferences.Editor edit = F9J.LIZIZ(context, 0, str).edit();
                edit.putInt("event_sampling_version", n3d2.LIZ);
                if (optJSONArray != null) {
                    edit.putString("samplings", optJSONArray.toString());
                }
                edit.apply();
                return n3d2;
            }
        } catch (Throwable th) {
            QIX.LJIJJ().LIZJ(12, "parseEventSamplingFromServer", th, new Object[0]);
        }
        return n3d;
    }
}
