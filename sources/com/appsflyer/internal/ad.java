package com.appsflyer.internal;

import X.AV1;
import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import X.C65928Pu8;
import X.E77;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.compat.function.Consumer;
import com.appsflyer.compat.function.Function;
import com.appsflyer.internal.c;
import java.util.List;
import java.util.Map;
import p83.a;

/* loaded from: classes.dex */
public final class ad {
    public static String AFInAppEventParameterName;
    public static Boolean AFKeystoreWrapper;
    public final Consumer<String> AFInAppEventType;
    public final boolean init;
    public final Consumer<String> valueOf;
    public final Function<List<Purchase>, Map<String, String>> values;

    public ad() {
    }

    public static String com_appsflyer_internal_ad_android_provider_Settings$Secure_getString(ContentResolver contentResolver, String str) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {contentResolver, str};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;", "-2188558172191876282");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(102004, "android/provider/Settings$Secure", "getString", Settings.Secure.class, objArr, "java.lang.String", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(102004, "android/provider/Settings$Secure", "getString", null, objArr, Settings.Secure.class, c65300Pk0, false);
            return (String) LIZJ.LIZIZ;
        }
        String string = Settings.Secure.getString(contentResolver, str);
        c03880Dg.LIZIZ(102004, "android/provider/Settings$Secure", "getString", string, objArr, Settings.Secure.class, c65300Pk0, true);
        return string;
    }

    public static a.C0043a com_appsflyer_internal_ad_com_google_android_gms_ads_identifier_AdvertisingIdClient_getAdvertisingIdInfo(Context context) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {context};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;", "-2188558172191876282");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(103000, "com/google/android/gms/ads/identifier/AdvertisingIdClient", "getAdvertisingIdInfo", a.class, objArr, "com.google.android.gms.ads.identifier.AdvertisingIdClient$Info", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(103000, "com/google/android/gms/ads/identifier/AdvertisingIdClient", "getAdvertisingIdInfo", null, objArr, a.class, c65300Pk0, false);
            return (a.C0043a) LIZJ.LIZIZ;
        }
        a.C0043a LIZIZ = a.LIZIZ(context);
        c03880Dg.LIZIZ(103000, "com/google/android/gms/ads/identifier/AdvertisingIdClient", "getAdvertisingIdInfo", LIZIZ, objArr, a.class, c65300Pk0, true);
        return LIZIZ;
    }

    public static boolean values() {
        Boolean bool = AFKeystoreWrapper;
        if (bool == null || bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        Function<List<Purchase>, Map<String, String>> function = this.values;
        int i3 = 0;
        if (function != null) {
            i = function.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Consumer<String> consumer = this.AFInAppEventType;
        if (consumer != null) {
            i2 = consumer.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Consumer<String> consumer2 = this.valueOf;
        if (consumer2 != null) {
            i3 = consumer2.hashCode();
        }
        return ((i5 + i3) * 31) + (this.init ? 1 : 0);
    }

    public final String toString() {
        return "ArsFeatureParams{additionalParameters=" + this.values + ", success=" + this.AFInAppEventType + ", failure=" + this.valueOf + ", sandbox=" + this.init + '}';
    }

    public static c.d.b AFInAppEventParameterName(ContentResolver contentResolver) {
        String str;
        if (!values() || contentResolver == null || AppsFlyerProperties.getInstance().getString("amazon_aid") != null || !"Amazon".equals(Build.MANUFACTURER)) {
            return null;
        }
        int i = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
        if (i == 0) {
            return new c.d.b(INVOKESTATIC_com_appsflyer_internal_ad_com_ss_android_ugc_aweme_lancet_process_AnndroidIdSecureLancet_getString(contentResolver, "advertising_id"), Boolean.FALSE);
        }
        if (i == 2) {
            return null;
        }
        try {
            str = INVOKESTATIC_com_appsflyer_internal_ad_com_ss_android_ugc_aweme_lancet_process_AnndroidIdSecureLancet_getString(contentResolver, "advertising_id");
        } catch (Throwable th) {
            AFLogger.valueOf("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th);
            str = "";
        }
        return new c.d.b(str, Boolean.TRUE);
    }

    public static a.C0043a INVOKESTATIC_com_appsflyer_internal_ad_com_ss_android_ugc_aweme_lancet_process_GoogleAdvertisingInfoLancet_getAdvertisingIdInfo(Context context) {
        if (AV1.LJIILLIIL() && C65928Pu8.LIZIZ.LIZ().strictModeConfigs.get("kids_mode_overseas_scene").fuseApiIds.contains(103000)) {
            return new a.C0043a("00000000-0000-0000-0000-000000000000", true);
        }
        return com_appsflyer_internal_ad_com_google_android_gms_ads_identifier_AdvertisingIdClient_getAdvertisingIdInfo(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.appsflyer.internal.c.d.b values(android.content.Context r6) {
        /*
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = com.appsflyer.internal.ad.AFInAppEventParameterName
            r4 = 1
            if (r1 == 0) goto L54
            r3 = 1
        La:
            r2 = 0
            if (r3 == 0) goto L1c
        Ld:
            r0 = r2
        Le:
            if (r1 == 0) goto L56
            com.appsflyer.internal.c$d$b r2 = new com.appsflyer.internal.c$d$b
            r2.<init>(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.valueOf = r0
            return r2
        L1c:
            java.lang.Boolean r0 = com.appsflyer.internal.ad.AFKeystoreWrapper
            if (r0 == 0) goto L26
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L32
        L26:
            java.lang.Boolean r0 = com.appsflyer.internal.ad.AFKeystoreWrapper
            if (r0 != 0) goto L56
            java.lang.String r0 = "collectOAID"
            boolean r0 = r5.getBoolean(r0, r4)
            if (r0 == 0) goto L56
        L32:
            com.appsflyer.oaid.OaidClient r1 = new com.appsflyer.oaid.OaidClient     // Catch: java.lang.Throwable -> L4d
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L4d
            boolean r0 = r5.isEnableLog()     // Catch: java.lang.Throwable -> L4d
            r1.setLogging(r0)     // Catch: java.lang.Throwable -> L4d
            com.appsflyer.oaid.OaidClient$Info r0 = r1.fetch()     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L56
            java.lang.String r1 = r0.getId()     // Catch: java.lang.Throwable -> L4d
            java.lang.Boolean r0 = r0.getLat()     // Catch: java.lang.Throwable -> L4e
            goto Le
        L4d:
            r1 = r2
        L4e:
            java.lang.String r0 = "No OAID library"
            com.appsflyer.AFLogger.AFInAppEventType(r0)
            goto Ld
        L54:
            r3 = 0
            goto La
        L56:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.ad.values(android.content.Context):com.appsflyer.internal.c$d$b");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ad.class == obj.getClass()) {
            ad adVar = (ad) obj;
            if (this.init != adVar.init) {
                return false;
            }
            Function<List<Purchase>, Map<String, String>> function = this.values;
            if (function == null ? adVar.values != null : !function.equals(adVar.values)) {
                return false;
            }
            Consumer<String> consumer = this.AFInAppEventType;
            if (consumer == null ? adVar.AFInAppEventType != null : !consumer.equals(adVar.AFInAppEventType)) {
                return false;
            }
            Consumer<String> consumer2 = this.valueOf;
            Consumer<String> consumer3 = adVar.valueOf;
            if (consumer2 != null) {
                return consumer2.equals(consumer3);
            }
            if (consumer3 == null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x003a, code lost:
    
        if (r2.length() == 0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0137 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.appsflyer.internal.c.d.b AFInAppEventType(android.content.Context r12, java.util.Map<java.lang.String, java.lang.Object> r13) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.ad.AFInAppEventType(android.content.Context, java.util.Map):com.appsflyer.internal.c$d$b");
    }

    public static String INVOKESTATIC_com_appsflyer_internal_ad_com_ss_android_ugc_aweme_lancet_process_AnndroidIdSecureLancet_getString(ContentResolver contentResolver, String str) {
        if (TextUtils.equals(str, "android_id")) {
            if (AV1.LJIILLIIL() && C65928Pu8.LIZIZ.LIZ().strictModeConfigs.get("kids_mode_overseas_scene").fuseApiIds.contains(102004)) {
                return "";
            }
            if (TextUtils.isEmpty(E77.LIZ)) {
                E77.LIZ = com_appsflyer_internal_ad_android_provider_Settings$Secure_getString(contentResolver, str);
            }
            return E77.LIZ;
        }
        return com_appsflyer_internal_ad_android_provider_Settings$Secure_getString(contentResolver, str);
    }

    public ad(Function<List<Purchase>, Map<String, String>> function, Consumer<String> consumer, Consumer<String> consumer2, boolean z) {
        this.values = function;
        this.AFInAppEventType = consumer;
        this.valueOf = consumer2;
        this.init = z;
    }
}
