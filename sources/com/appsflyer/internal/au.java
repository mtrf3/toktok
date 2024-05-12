package com.appsflyer.internal;

import X.C16880lQ;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class au {
    public final Map<String, Object> AFKeystoreWrapper = new ConcurrentHashMap();
    public final Application valueOf;
    public final SharedPreferences values;

    public final boolean valueOf() {
        ai.valueOf();
        if (ai.AFInAppEventParameterName(this.values, "appsFlyerCount", false) != 0) {
            return false;
        }
        return true;
    }

    public au(Context context) {
        Application application = (Application) C16880lQ.LLLLL(context);
        this.valueOf = application;
        this.values = ai.values(application);
    }
}
