package com.appsflyer;

import X.V0N;
import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.ai;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppsFlyerProperties {
    public static AppsFlyerProperties AFInAppEventParameterName = new AppsFlyerProperties();
    public String AFKeystoreWrapper;
    public boolean valueOf;
    public Map<String, Object> AFInAppEventType = new HashMap();
    public boolean values = false;

    public boolean isEnableLog() {
        AFLogger.LogLevel logLevel = AFLogger.LogLevel.NONE;
        if (getInt("logLevel", logLevel.getLevel()) > logLevel.getLevel()) {
            return true;
        }
        return false;
    }

    public boolean isLogsDisabledCompletely() {
        return getBoolean("disableLogs", false);
    }

    public boolean isOtherSdkStringDisabled() {
        return getBoolean("disableOtherSdk", false);
    }

    /* loaded from: classes.dex */
    public enum EmailsCryptType {
        NONE(0),
        SHA256(3);

        public final int values;

        public final int getValue() {
            return this.values;
        }

        public static EmailsCryptType valueOf(String str) {
            return (EmailsCryptType) V0N.LJJJ(EmailsCryptType.class, str);
        }

        EmailsCryptType(int i) {
            this.values = i;
        }
    }

    private boolean AFKeystoreWrapper() {
        return this.values;
    }

    public static AppsFlyerProperties getInstance() {
        return AFInAppEventParameterName;
    }

    public final boolean values() {
        return this.valueOf;
    }

    public synchronized Object getObject(String str) {
        return this.AFInAppEventType.get(str);
    }

    public String getReferrer(Context context) {
        String str = this.AFKeystoreWrapper;
        if (str != null) {
            return str;
        }
        if (getString("AF_REFERRER") != null) {
            return getString("AF_REFERRER");
        }
        if (context == null) {
            return null;
        }
        return ai.values(context).getString("referrer", null);
    }

    public synchronized String getString(String str) {
        return (String) this.AFInAppEventType.get(str);
    }

    public synchronized void loadProperties(Context context) {
        if (AFKeystoreWrapper()) {
            return;
        }
        String string = ai.values(context).getString("savedProperties", null);
        if (string != null) {
            AFLogger.AFInAppEventType("Loading properties..");
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (this.AFInAppEventType.get(next) == null) {
                        this.AFInAppEventType.put(next, JSONObjectProtectorUtils.getString(jSONObject, next));
                    }
                }
                this.values = true;
            } catch (JSONException e) {
                AFLogger.valueOf("Failed loading properties", e);
            }
            AFLogger.AFInAppEventType("Done loading properties: " + this.values);
        }
    }

    public synchronized void remove(String str) {
        this.AFInAppEventType.remove(str);
    }

    public synchronized void saveProperties(SharedPreferences sharedPreferences) {
        sharedPreferences.edit().putString("savedProperties", new JSONObject(this.AFInAppEventType).toString()).apply();
    }

    public synchronized void setCustomData(String str) {
        this.AFInAppEventType.put("additionalCustomData", str);
    }

    public synchronized void setUserEmails(String str) {
        this.AFInAppEventType.put("userEmails", str);
    }

    public boolean getBoolean(String str, boolean z) {
        String string = getString(str);
        if (string == null) {
            return z;
        }
        return Boolean.valueOf(string).booleanValue();
    }

    public int getInt(String str, int i) {
        String string = getString(str);
        if (string == null) {
            return i;
        }
        return CastIntegerProtector.valueOf(string).intValue();
    }

    public long getLong(String str, long j) {
        String string = getString(str);
        if (string == null) {
            return j;
        }
        return CastLongProtector.valueOf(string).longValue();
    }

    public synchronized void set(String str, int i) {
        this.AFInAppEventType.put(str, Integer.toString(i));
    }

    public synchronized void set(String str, long j) {
        this.AFInAppEventType.put(str, Long.toString(j));
    }

    public synchronized void set(String str, boolean z) {
        this.AFInAppEventType.put(str, Boolean.toString(z));
    }

    public synchronized void set(String str, String str2) {
        this.AFInAppEventType.put(str, str2);
    }

    public synchronized void set(String str, String[] strArr) {
        this.AFInAppEventType.put(str, strArr);
    }
}
