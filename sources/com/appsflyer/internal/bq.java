package com.appsflyer.internal;

import X.C16880lQ;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.appsflyer.internal.c;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class bq extends bu {
    public static String onInstallConversionFailureNative = "https://%sregister.%s/api/v" + ai.values;
    public final SharedPreferences onInstallConversionDataLoadedNative;

    public aa values() {
        String string;
        String string2;
        String string3 = this.onInstallConversionDataLoadedNative.getString("afUninstallToken", null);
        long j = this.onInstallConversionDataLoadedNative.getLong("afUninstallToken_received_time", 0L);
        boolean z = this.onInstallConversionDataLoadedNative.getBoolean("afUninstallToken_queued", false);
        this.onInstallConversionDataLoadedNative.edit().putBoolean("afUninstallToken_queued", false).apply();
        if (string3 == null && (string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            string3 = string2.split(",")[r6.length - 1];
        }
        if (j == 0 && (string = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] split = string.split(",");
            if (split.length >= 2) {
                try {
                    j = CastLongProtector.parseLong(split[split.length - 2]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (string3 == null) {
            return null;
        }
        return new aa(string3, j, z);
    }

    public bq(Context context) {
        super(null, C16880lQ.LLLZ(onInstallConversionFailureNative, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName()}) + context.getPackageName(), null, null, null, context);
        this.onInstallConversionDataLoadedNative = ai.values(context);
    }

    private void AFInAppEventParameterName(aa aaVar) {
        this.onInstallConversionDataLoadedNative.edit().putString("afUninstallToken", aaVar.AFKeystoreWrapper).putLong("afUninstallToken_received_time", aaVar.AFInAppEventParameterName).putBoolean("afUninstallToken_queued", aaVar.valueOf()).apply();
    }

    public static void valueOf(bq bqVar) {
        bqVar.onInstallConversionDataLoadedNative.edit().putBoolean("sentRegisterRequestToAF", true).apply();
        AFLogger.AFInAppEventType("Successfully registered for Uninstall Tracking");
    }

    public void AFInAppEventType(String str) {
        Application application = this.valueOf;
        final ai valueOf = ai.valueOf();
        if (valueOf.AFInAppEventType()) {
            AFLogger.values("CustomerUserId not set, Tracking is disabled", true);
            return;
        }
        String valueOf2 = ai.valueOf("AppsFlyerKey");
        if (valueOf2 == null) {
            AFLogger.values("[registerUninstall] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        PackageManager packageManager = application.getPackageManager();
        try {
            PackageInfo LLLLLLZ = C16880lQ.LLLLLLZ(packageManager, application.getPackageName(), 0);
            this.AFInAppEventType.put("app_version_code", Integer.toString(LLLLLLZ.versionCode));
            this.AFInAppEventType.put("app_version_name", LLLLLLZ.versionName);
            this.AFInAppEventType.put("app_name", packageManager.getApplicationLabel(LLLLLLZ.applicationInfo).toString());
            long j = LLLLLLZ.firstInstallTime;
            this.AFInAppEventType.put("installDate", ai.AFInAppEventParameterName(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), j));
        } catch (Throwable th) {
            AFLogger.valueOf("Exception while collecting application version info.", th);
        }
        ai.AFKeystoreWrapper(application, (Map<String, ? super String>) this.AFInAppEventType);
        String string = AppsFlyerProperties.getInstance().getString("AppUserId");
        if (string != null) {
            this.AFInAppEventType.put("appUserId", string);
        }
        try {
            this.AFInAppEventType.put("model", Build.MODEL);
            this.AFInAppEventType.put("brand", Build.BRAND);
        } catch (Throwable th2) {
            AFLogger.valueOf("Exception while collecting device brand and model.", th2);
        }
        if (AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false)) {
            this.AFInAppEventType.put("deviceTrackingDisabled", "true");
        }
        c.d.b AFInAppEventParameterName = ad.AFInAppEventParameterName(application.getContentResolver());
        if (AFInAppEventParameterName != null) {
            this.AFInAppEventType.put("amazon_aid", AFInAppEventParameterName.values);
            this.AFInAppEventType.put("amazon_aid_limit", String.valueOf(AFInAppEventParameterName.AFKeystoreWrapper));
        }
        String string2 = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string2 != null) {
            this.AFInAppEventType.put("advertiserId", string2);
        }
        this.AFInAppEventType.put("devkey", valueOf2);
        this.AFInAppEventType.put("uid", ak.AFInAppEventParameterName((WeakReference<Context>) new WeakReference(application)));
        this.AFInAppEventType.put("af_gcm_token", str);
        this.AFInAppEventType.put("launch_counter", Integer.toString(ai.AFInAppEventParameterName(this.onInstallConversionDataLoadedNative, "appsFlyerCount", false)));
        this.AFInAppEventType.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        String valueOf3 = valueOf.valueOf(application);
        if (valueOf3 != null) {
            this.AFInAppEventType.put("channel", valueOf3);
        }
        new PthreadThread(new Runnable() { // from class: com.appsflyer.internal.bq.5
            @Override // java.lang.Runnable
            public final void run() {
                com_appsflyer_internal_bq$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public final void com_appsflyer_internal_bq$5__run$___twin___() {
                try {
                    bq bqVar = bq.this;
                    bqVar.onConversionDataSuccess = valueOf.isStopped();
                    HttpURLConnection AFInAppEventParameterName2 = new ah(bqVar).AFInAppEventParameterName();
                    if (AFInAppEventParameterName2 != null) {
                        if (AFInAppEventParameterName2.getResponseCode() == 200) {
                            bq.valueOf(bq.this);
                        }
                        AFInAppEventParameterName2.disconnect();
                    }
                } catch (Throwable th3) {
                    AFLogger.valueOf(th3.getMessage(), th3);
                }
            }

            public static void com_appsflyer_internal_bq$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
                boolean LIZ;
                try {
                    anonymousClass5.com_appsflyer_internal_bq$5__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        }, "r/internal/bq").start();
    }

    public final void values(String str) {
        boolean z;
        if (str != null) {
            AFLogger.valueOf("Firebase Refreshed Token = ".concat(str));
            aa values = values();
            if (values == null || !str.equals(values.AFKeystoreWrapper)) {
                long currentTimeMillis = System.currentTimeMillis();
                if (ai.valueOf(this.onInstallConversionDataLoadedNative) && (values == null || currentTimeMillis - values.AFInAppEventParameterName > TimeUnit.SECONDS.toMillis(2L))) {
                    z = true;
                } else {
                    z = false;
                }
                AFInAppEventParameterName(new aa(str, currentTimeMillis, !z));
                if (z) {
                    AFInAppEventType(str);
                }
            }
        }
    }

    public static boolean values(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            Class.forName("com.google.firebase.messaging.FirebaseMessagingService");
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            AFLogger.valueOf("An error occurred while trying to verify manifest declarations: ", th);
        }
        if (!ac.AFKeystoreWrapper(context, new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class))) {
            return false;
        }
        return true;
    }

    public static boolean values(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean("sentRegisterRequestToAF", false);
    }
}
