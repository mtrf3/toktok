package com.appsflyer.internal;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class bc implements ba {
    public final SharedPreferences values;

    public bc(SharedPreferences sharedPreferences) {
        this.values = sharedPreferences;
    }

    @Override // com.appsflyer.internal.ba
    public final boolean AFInAppEventType(String str) {
        return this.values.getBoolean(str, false);
    }

    @Override // com.appsflyer.internal.ba
    public final void AFKeystoreWrapper(String str) {
        this.values.edit().putBoolean(str, true).apply();
    }
}
