package com.appsflyer.internal;

import X.C16880lQ;
import android.app.Application;
import android.content.Context;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class j {
    public AppsFlyerRequestListener AFInAppEventParameterName;
    public final Map<String, Object> AFInAppEventType;
    public Map<String, Object> AFKeystoreWrapper;
    public String AFLogger$LogLevel;
    public String AFVersionDeclaration;
    public String AppsFlyer2dXConversionCallback;
    public String getLevel;
    public byte[] init;
    public String onAppOpenAttributionNative;
    public int onAttributionFailureNative;
    public boolean onDeepLinkingNative;
    public final boolean onInstallConversionDataLoadedNative;
    public Application valueOf;
    public String values;

    public j() {
        this(null, null, null, null);
    }

    public final Map<String, Object> AFInAppEventParameterName() {
        return this.AFInAppEventType;
    }

    public final boolean AFInAppEventType() {
        return this.onInstallConversionDataLoadedNative;
    }

    public final boolean AFKeystoreWrapper() {
        return this.onDeepLinkingNative;
    }

    public final byte[] valueOf() {
        return this.init;
    }

    public final String AFInAppEventParameterName(String str) {
        String valueOf = ai.valueOf().valueOf(this.valueOf);
        if (valueOf != null) {
            return UriProtector.parse(str).buildUpon().appendQueryParameter("channel", valueOf).build().toString();
        }
        return str;
    }

    public final j AFInAppEventType(Map<String, ?> map) {
        this.AFInAppEventType.putAll(map);
        return this;
    }

    public j valueOf(String str) {
        this.onAppOpenAttributionNative = str;
        return this;
    }

    public j(String str, String str2, Boolean bool, Context context) {
        boolean z;
        this.AFInAppEventType = new HashMap();
        this.AFLogger$LogLevel = str;
        this.onAppOpenAttributionNative = str2;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        this.onInstallConversionDataLoadedNative = z;
        if (context != null) {
            this.valueOf = (Application) C16880lQ.LLLLL(context);
        }
    }
}
