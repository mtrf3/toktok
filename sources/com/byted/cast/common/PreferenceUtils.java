package com.byted.cast.common;

import X.C16880lQ;
import X.F9J;
import X.X1D;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class PreferenceUtils {
    public static final String TAG = C16880lQ.LJLLJ(PreferenceUtils.class);

    public static boolean isByteUserToB() {
        return false;
    }

    public static int getByteLicenseDomainType(Context context) {
        if (context == null) {
            return 0;
        }
        return F9J.LIZIZ(context, 0, "cast_setting").getInt("license_domain", 0);
    }

    public static String getDeviceID(Context context) {
        return getValue(context, "device_id", (String) null);
    }

    public static HashMap<String, String> getDlnaDevicesIp(Context context) {
        return getHashMapValue(context, "device_ip_source", "dlna_device_ip_source");
    }

    public static String getServerGrayConfig(String str) {
        Context context = Constants.sAppContext;
        if (context == null) {
            return "";
        }
        return getValue(context, prefixSPKey(str, "server_gray_config"), "");
    }

    public static String getToBCastDid(String str) {
        Context context = Constants.sAppContext;
        if (context == null) {
            return str;
        }
        SharedPreferences LIZIZ = F9J.LIZIZ(context, 0, "cast_setting");
        String string = LIZIZ.getString("tob_fake_did", "");
        if (TextUtils.isEmpty(string)) {
            string = Utils.tryGetDidFromAppLog();
            if (string == null) {
                string = Utils.generateCastDid();
            }
            SharedPreferences.Editor edit = LIZIZ.edit();
            edit.putString("tob_fake_did", string);
            edit.apply();
        }
        return string;
    }

    public static boolean isDeviceIdGeneratedByRandomUUID(Context context) {
        return getValue(context, "npush_id_generated_by_random_uuid", false);
    }

    public static String getBDCloudDomain(Context context, String str) {
        if (context == null) {
            return str;
        }
        return F9J.LIZIZ(context, 0, "cast_setting").getString("bdcloud_domain", str);
    }

    public static String getBDLinkServiceInfo(Context context, String str) {
        return getValue(context, prefixSPKey(str, "new_bdlink_service_info"), (String) null);
    }

    public static String getByteGrayDomain(Context context, String str) {
        Context context2 = Constants.sAppContext;
        if (context2 == null) {
            return str;
        }
        return F9J.LIZIZ(context2, 0, "cast_setting").getString("gray_domain", str);
    }

    public static String prefixSPKey(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str2);
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }

    public static void setDeviceID(Context context, String str) {
        setValue(context, "device_id", str);
    }

    public static void setDeviceIdGeneratedByRandomUUID(Context context, boolean z) {
        setValue(context, "npush_id_generated_by_random_uuid", z);
    }

    public static void setServerGrayConfig(String str, String str2) {
        SharedPreferences.Editor edit = F9J.LIZIZ(Constants.sAppContext, 0, "ByteCast").edit();
        edit.putString(prefixSPKey(str, "server_gray_config"), str2);
        edit.apply();
    }

    public static int getBDLinkValue(Context context, String str, int i) {
        return F9J.LIZIZ(context, 0, "BDLink").getInt(str, i);
    }

    public static HashMap<String, String> getHashMapValue(Context context, String str, String str2) {
        HashMap<String, String> hashMap = new HashMap<>();
        Context context2 = Constants.sAppContext;
        if (context2 == null) {
            return hashMap;
        }
        try {
            JSONArray jSONArray = new JSONArray(F9J.LIZIZ(context2, 0, str).getString(str2, ""));
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                JSONArray names = jSONObject.names();
                if (names != null) {
                    for (int i2 = 0; i2 < names.length(); i2++) {
                        String string = JSONArrayProtectorUtils.getString(names, i2);
                        hashMap.put(string, JSONObjectProtectorUtils.getString(jSONObject, string));
                    }
                }
            }
        } catch (JSONException e) {
            Logger.d(TAG, e.getMessage());
        }
        return hashMap;
    }

    public static String getValue(Context context, String str, String str2) {
        Context context2 = Constants.sAppContext;
        if (context2 == null) {
            return str2;
        }
        return F9J.LIZIZ(context2, 0, "ByteCast").getString(str, str2);
    }

    public static void saveDlnaDevicesIp(Context context, String str, String str2) {
        HashMap<String, String> dlnaDevicesIp = getDlnaDevicesIp(context);
        dlnaDevicesIp.put(str, str2);
        setValue(context, "device_ip_source", "dlna_device_ip_source", dlnaDevicesIp);
    }

    public static void setBDLinkServiceInfo(Context context, String str, String str2) {
        setValue(context, prefixSPKey(str, "new_bdlink_service_info"), str2);
    }

    public static void setBDLinkValue(Context context, String str, int i) {
        SharedPreferences.Editor edit = F9J.LIZIZ(context, 0, "BDLink").edit();
        edit.putInt(str, i);
        edit.apply();
    }

    public static void setValue(Context context, String str, String str2) {
        Context context2 = Constants.sAppContext;
        if (context2 == null) {
            return;
        }
        SharedPreferences.Editor edit = F9J.LIZIZ(context2, 0, "ByteCast").edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static boolean getValue(Context context, String str, boolean z) {
        Context context2 = Constants.sAppContext;
        if (context2 == null) {
            return z;
        }
        return F9J.LIZIZ(context2, 0, "ByteCast").getBoolean(str, z);
    }

    public static void setValue(Context context, String str, boolean z) {
        Context context2 = Constants.sAppContext;
        if (context2 == null) {
            return;
        }
        SharedPreferences.Editor edit = F9J.LIZIZ(context2, 0, "ByteCast").edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public static String getValue(Context context, String str, String str2, String str3) {
        Context context2 = Constants.sAppContext;
        if (context2 == null) {
            return str3;
        }
        return F9J.LIZIZ(context2, 0, "ByteCast").getString(prefixSPKey(str, str2), str3);
    }

    public static void setValue(Context context, String str, String str2, HashMap<String, String> hashMap) {
        if (Constants.sAppContext == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException e) {
                Logger.d(TAG, e.getMessage());
            }
        }
        jSONArray.put(jSONObject);
        SharedPreferences.Editor edit = F9J.LIZIZ(Constants.sAppContext, 0, str).edit();
        edit.putString(str2, jSONArray.toString());
        edit.apply();
    }

    public static int getValue(Context context, String str, String str2, int i) {
        Context context2 = Constants.sAppContext;
        if (context2 == null) {
            return i;
        }
        return F9J.LIZIZ(context2, 0, str).getInt(str2, i);
    }

    public static void setValue(Context context, String str, String str2, String str3) {
        Context context2 = Constants.sAppContext;
        if (context2 == null) {
            return;
        }
        SharedPreferences.Editor edit = F9J.LIZIZ(context2, 0, "ByteCast").edit();
        edit.putString(prefixSPKey(str, str2), str3);
        edit.apply();
    }

    public static void setValue(Context context, String str, String str2, int i) {
        Context context2 = Constants.sAppContext;
        if (context2 == null) {
            return;
        }
        SharedPreferences.Editor edit = F9J.LIZIZ(context2, 0, str).edit();
        edit.putInt(str2, i);
        edit.apply();
    }

    public static int getValue(Context context, String str, String str2, String str3, int i) {
        Context context2 = Constants.sAppContext;
        if (context2 == null) {
            return i;
        }
        return F9J.LIZIZ(context2, 0, str).getInt(prefixSPKey(str2, str3), i);
    }

    public static void setValue(Context context, String str, String str2, String str3, int i) {
        Context context2 = Constants.sAppContext;
        if (context2 == null) {
            return;
        }
        SharedPreferences.Editor edit = F9J.LIZIZ(context2, 0, str).edit();
        edit.putInt(prefixSPKey(str2, str3), i);
        edit.apply();
    }
}
