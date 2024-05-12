package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Ecc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC36814Ecc {
    public final HashSet<String> LIZ;
    public final HashMap<String, HashSet<String>> LIZIZ;

    public abstract boolean LIZIZ(String str);

    public abstract boolean LIZJ(HashSet<String> hashSet, String str);

    public static final AbstractC36814Ecc LIZLLL(Context context) {
        AbstractC36814Ecc c36816Ece;
        try {
            SharedPreferences LIZIZ = F9J.LIZIZ(context, 0, "sp_filter_name");
            HashSet hashSet = new HashSet();
            HashMap hashMap = new HashMap();
            java.util.Map<String, ?> all = LIZIZ.getAll();
            if (all != null && all.size() > 0) {
                int i = 0;
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    if (entry != null) {
                        String key = entry.getKey();
                        if ("is_block".equals(key)) {
                            i = LIZIZ.getInt("is_block", 0);
                        } else if ("events".equals(key)) {
                            try {
                                java.util.Set set = (java.util.Set) entry.getValue();
                                if (set != null && set.size() > 0) {
                                    hashSet.addAll(set);
                                }
                            } catch (Throwable unused) {
                            }
                        } else if (!TextUtils.isEmpty(key)) {
                            HashSet hashSet2 = new HashSet();
                            try {
                                java.util.Set set2 = (java.util.Set) entry.getValue();
                                if (set2 != null && set2.size() > 0) {
                                    hashSet2.addAll(set2);
                                }
                            } catch (Throwable unused2) {
                            }
                            if (hashSet2.size() > 0) {
                                hashMap.put(key, hashSet2);
                            }
                        }
                    }
                }
                if (i > 0) {
                    c36816Ece = new C36815Ecd(hashSet, hashMap);
                } else {
                    c36816Ece = new C36816Ece(hashSet, hashMap);
                }
                return c36816Ece;
            }
            return null;
        } catch (Throwable unused3) {
            return null;
        }
    }

    public AbstractC36814Ecc(HashSet<String> hashSet, HashMap<String, HashSet<String>> hashMap) {
        this.LIZ = hashSet;
        this.LIZIZ = hashMap;
    }

    public static final AbstractC36814Ecc LJ(Context context, JSONObject jSONObject) {
        JSONObject optJSONObject;
        AbstractC36814Ecc c36816Ece;
        try {
            SharedPreferences.Editor edit = F9J.LIZIZ(context, 0, "sp_filter_name").edit();
            edit.clear().commit();
            if (jSONObject == null || !jSONObject.has("event_list") || (optJSONObject = jSONObject.optJSONObject("event_list")) == null) {
                return null;
            }
            int optInt = optJSONObject.optInt("is_block", 0);
            edit.putInt("is_block", optInt);
            HashSet hashSet = new HashSet();
            JSONArray optJSONArray = optJSONObject.optJSONArray("events");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString = optJSONArray.optString(i);
                    if (!TextUtils.isEmpty(optString)) {
                        hashSet.add(optString);
                    }
                }
            }
            if (hashSet.size() > 0) {
                edit.putStringSet("events", hashSet);
            }
            HashMap hashMap = new HashMap();
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("params");
            if (optJSONObject2 != null) {
                Iterator<String> keys = optJSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!TextUtils.isEmpty(next)) {
                        HashSet hashSet2 = new HashSet();
                        JSONArray optJSONArray2 = optJSONObject2.optJSONArray(next);
                        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                                String optString2 = optJSONArray2.optString(i2);
                                if (!TextUtils.isEmpty(optString2)) {
                                    hashSet2.add(optString2);
                                }
                            }
                        }
                        if (hashSet2.size() > 0) {
                            hashMap.put(next, hashSet2);
                        }
                    }
                }
            }
            if (hashMap.size() > 0) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    edit.putStringSet((String) entry.getKey(), (java.util.Set) entry.getValue());
                }
            }
            edit.commit();
            if (optInt > 0) {
                c36816Ece = new C36815Ecd(hashSet, hashMap);
            } else {
                c36816Ece = new C36816Ece(hashSet, hashMap);
            }
            return c36816Ece;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final boolean LIZ(String str, JSONObject jSONObject) {
        HashMap<String, HashSet<String>> hashMap;
        HashSet<String> hashSet;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        HashSet<String> hashSet2 = this.LIZ;
        if (hashSet2 != null && hashSet2.size() > 0) {
            if (LIZIZ(str)) {
                return false;
            }
            if (jSONObject != null && (hashMap = this.LIZIZ) != null && hashMap.size() > 0 && this.LIZIZ.containsKey(str) && (hashSet = this.LIZIZ.get(str)) != null && hashSet.size() > 0) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    if (LIZJ(hashSet, keys.next())) {
                        try {
                            keys.remove();
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
        return true;
    }
}
