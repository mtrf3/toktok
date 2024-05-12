package com.appsflyer.internal;

import X.V0N;
import com.appsflyer.AFLogger;

/* loaded from: classes.dex */
public final class an {
    public a AFInAppEventType = new a() { // from class: com.appsflyer.internal.an.3
        @Override // com.appsflyer.internal.an.a
        public final Class<?> values(String str) {
            return Class.forName(str);
        }
    };

    /* loaded from: classes.dex */
    public interface a {
        Class<?> values(String str);
    }

    public final String AFKeystoreWrapper() {
        for (d dVar : d.values()) {
            if (AFInAppEventParameterName(dVar.onInstallConversionFailureNative)) {
                return dVar.onAttributionFailureNative;
            }
        }
        return d.DEFAULT.onAttributionFailureNative;
    }

    /* loaded from: classes.dex */
    public enum d {
        ADOBE_AIR("android_adobe_air", "com.appsflyer.adobeair.AppsFlyerExtension"),
        ADOBE_MOBILE_SDK("android_adobe_mobile", "com.appsflyer.adobeextension.AppsFlyerAdobeExtension"),
        COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
        CORDOVA("android_cordova", "com.appsflyer.cordova.plugin.AppsFlyerPlugin"),
        DEFAULT("android_native", "android_native"),
        FLUTTER("android_flutter", "com.appsflyer.appsflyersdk.AppsflyerSdkPlugin"),
        M_PARTICLE("android_mparticle", "com.mparticle.kits.AppsFlyerKit"),
        NATIVE_SCRIPT("android_native_script", "com.tns.NativeScriptActivity"),
        REACT_NATIVE("android_reactNative", "com.appsflyer.reactnative.RNAppsFlyerModule"),
        SEGMENT("android_segment", "com.segment.analytics.android.integrations.appsflyer.AppsflyerIntegration"),
        UNITY("android_unity", "com.appsflyer.unity.AppsFlyerAndroidWrapper"),
        UNREAL_ENGINE("android_unreal", "com.epicgames.ue4.GameActivity"),
        XAMARIN("android_xamarin", "mono.android.Runtime");

        public String onAttributionFailureNative;
        public String onInstallConversionFailureNative;

        public static d valueOf(String str) {
            return (d) V0N.LJJJ(d.class, str);
        }

        d(String str, String str2) {
            this.onAttributionFailureNative = str;
            this.onInstallConversionFailureNative = str2;
        }
    }

    private boolean AFInAppEventParameterName(String str) {
        try {
            this.AFInAppEventType.values(str);
            AFLogger.AFInAppEventParameterName("Class: " + str + " is found.");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        } catch (Throwable th) {
            AFLogger.valueOf(th.getMessage(), th);
            return false;
        }
    }
}
