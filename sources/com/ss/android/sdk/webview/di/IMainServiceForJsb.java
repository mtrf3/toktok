package com.ss.android.sdk.webview.di;

import android.app.Activity;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public interface IMainServiceForJsb {
    String getJSSDKConfigUrl();

    String getSSLocalScheme();

    boolean isApiSuccess(JSONObject jSONObject);

    void startAdsAppActivity(Activity activity, String str);
}
