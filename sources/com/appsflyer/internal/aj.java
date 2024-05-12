package com.appsflyer.internal;

import X.C16880lQ;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class aj {
    public static aj AFInAppEventParameterName = null;
    public static String valueOf = "https://%smonitorsdk.%s/remote-debug?app_id=";
    public JSONObject AFInAppEventType;
    public int AFLogger$LogLevel;
    public boolean AppsFlyer2dXConversionCallback;
    public boolean init;
    public boolean values;
    public boolean AFKeystoreWrapper = true;
    public final List<String> AFVersionDeclaration = new ArrayList();
    public String getLevel = "-1";

    private synchronized String AFVersionDeclaration() {
        String str;
        try {
            this.AFInAppEventType.put("data", new JSONArray((Collection) this.AFVersionDeclaration));
            str = this.AFInAppEventType.toString();
            try {
                init();
            } catch (JSONException unused) {
            }
        } catch (JSONException unused2) {
            str = null;
        }
        return str;
    }

    private synchronized void init() {
        this.AFVersionDeclaration.clear();
        this.AFLogger$LogLevel = 0;
    }

    public final synchronized void AFInAppEventType() {
        this.init = true;
        AFInAppEventType("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
    }

    public final synchronized void AFKeystoreWrapper() {
        this.AFInAppEventType = null;
        AFInAppEventParameterName = null;
    }

    public final synchronized void valueOf() {
        this.AFKeystoreWrapper = false;
        init();
    }

    public final synchronized void values() {
        AFInAppEventType("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        this.init = false;
        this.AFKeystoreWrapper = false;
    }

    public static aj AFInAppEventParameterName() {
        if (AFInAppEventParameterName == null) {
            AFInAppEventParameterName = new aj();
        }
        return AFInAppEventParameterName;
    }

    private boolean AFLogger$LogLevel() {
        if (this.values) {
            if (this.AFKeystoreWrapper || this.init) {
                return true;
            }
            return false;
        }
        return false;
    }

    public aj() {
        this.AFLogger$LogLevel = 0;
        boolean z = AppsFlyerProperties.getInstance().getBoolean("disableProxy", false);
        this.AppsFlyer2dXConversionCallback = z;
        this.values = true ^ z;
        this.AFLogger$LogLevel = 0;
        this.init = false;
    }

    public final boolean getLevel() {
        return this.init;
    }

    public final synchronized void AFInAppEventType(String str) {
        this.getLevel = str;
    }

    public static void AFInAppEventParameterName(String str, PackageManager packageManager) {
        try {
            if (AFInAppEventParameterName == null) {
                AFInAppEventParameterName = new aj();
            }
            AFInAppEventParameterName.AFInAppEventType(str, packageManager);
            if (AFInAppEventParameterName == null) {
                AFInAppEventParameterName = new aj();
            }
            String AFVersionDeclaration = AFInAppEventParameterName.AFVersionDeclaration();
            bz bzVar = new bz();
            bzVar.onInstallConversionDataLoadedNative = AFVersionDeclaration;
            bzVar.onConversionDataSuccess = AppsFlyerLib.getInstance().isStopped();
            bzVar.valueOf(C16880lQ.LLLZ(valueOf, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName()}) + str);
            new PthreadThread(new ah(bzVar), "r/internal/aj").start();
        } catch (Throwable th) {
            AFLogger.valueOf(th);
        }
    }

    private synchronized void AFInAppEventType(String str, PackageManager packageManager) {
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        ai valueOf2 = ai.valueOf();
        String string = appsFlyerProperties.getString("remote_debug_static_data");
        if (string != null) {
            try {
                this.AFInAppEventType = new JSONObject(string);
            } catch (Throwable unused) {
            }
        } else {
            this.AFInAppEventType = new JSONObject();
            values(Build.BRAND, Build.MODEL, Build.VERSION.RELEASE, appsFlyerProperties.getString("advertiserId"), valueOf2.AFVersionDeclaration, valueOf2.getLevel);
            AFKeystoreWrapper("6.4.0." + ai.AFInAppEventParameterName, appsFlyerProperties.getString("AppsFlyerKey"), appsFlyerProperties.getString("KSAppsFlyerId"), appsFlyerProperties.getString("uid"));
            try {
                AFInAppEventType(str, String.valueOf(C16880lQ.LLLLLLZ(packageManager, str, 0).versionCode), appsFlyerProperties.getString("channel"), appsFlyerProperties.getString("preInstallName"));
            } catch (Throwable unused2) {
            }
            appsFlyerProperties.set("remote_debug_static_data", this.AFInAppEventType.toString());
        }
        try {
            this.AFInAppEventType.put("launch_counter", this.getLevel);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static String[] AFInAppEventType(String str, StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return new String[]{str};
        }
        String[] strArr = new String[stackTraceElementArr.length + 1];
        strArr[0] = str;
        for (int i = 1; i < stackTraceElementArr.length; i++) {
            strArr[i] = stackTraceElementArr[i].toString();
        }
        return strArr;
    }

    public final synchronized void AFInAppEventType(String str, String str2, String... strArr) {
        String str3;
        if (AFLogger$LogLevel()) {
            if (this.AFLogger$LogLevel < 98304) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    String join = TextUtils.join(", ", strArr);
                    if (str != null) {
                        str3 = currentTimeMillis + " " + C16880lQ.LLLLIIIILLL().getId() + " _/AppsFlyer_6.4.0 [" + str + "] " + str2 + " " + join;
                    } else {
                        str3 = currentTimeMillis + " " + C16880lQ.LLLLIIIILLL().getId() + " " + str2 + "/AppsFlyer_6.4.0 " + join;
                    }
                    this.AFVersionDeclaration.add(str3);
                    this.AFLogger$LogLevel += str3.length() << 1;
                } catch (Throwable unused) {
                }
            }
        }
    }

    private synchronized void AFInAppEventType(String str, String str2, String str3, String str4) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    this.AFInAppEventType.put("app_id", str);
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (str2 != null && str2.length() > 0) {
            this.AFInAppEventType.put("app_version", str2);
        }
        if (str3 != null && str3.length() > 0) {
            this.AFInAppEventType.put("channel", str3);
        }
        if (str4 != null && str4.length() > 0) {
            this.AFInAppEventType.put("preInstall", str4);
        }
    }

    private synchronized void AFKeystoreWrapper(String str, String str2, String str3, String str4) {
        try {
            this.AFInAppEventType.put("sdk_version", str);
            if (str2 != null && str2.length() > 0) {
                this.AFInAppEventType.put("devkey", str2);
            }
            if (str3 != null && str3.length() > 0) {
                this.AFInAppEventType.put("originalAppsFlyerId", str3);
            }
            if (str4 != null && str4.length() > 0) {
                this.AFInAppEventType.put("uid", str4);
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized void values(String str, String str2, String str3, String str4, String str5, String str6) {
        try {
            this.AFInAppEventType.put("brand", str);
            this.AFInAppEventType.put("model", str2);
            this.AFInAppEventType.put("platform", "Android");
            this.AFInAppEventType.put("platform_version", str3);
            if (str4 != null && str4.length() > 0) {
                this.AFInAppEventType.put("advertiserId", str4);
            }
            if (str5 != null && str5.length() > 0) {
                this.AFInAppEventType.put("imei", str5);
            }
            if (str6 != null && str6.length() > 0) {
                this.AFInAppEventType.put("android_id", str6);
            }
        } catch (Throwable unused) {
        }
    }
}
