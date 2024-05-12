package com.ss.android.ugc.aweme.services;

import X.C58096Mr6;
import X.EFJ;
import X.FX1;
import X.HG3;
import X.JBR;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.sdk.webview.di.IMainServiceForJsb;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class MainServiceForJsb implements IMainServiceForJsb {
    public static final String JS_SDK_CONFIG_URL;

    static {
        StringBuilder LIZ = X1D.LIZ();
        JS_SDK_CONFIG_URL = JBR.LJFF(LIZ, EFJ.LIZ, "/client_auth/js_sdk/config/v1/", LIZ);
    }

    @Override // com.ss.android.sdk.webview.di.IMainServiceForJsb
    public String getSSLocalScheme() {
        return "sslocal";
    }

    public String getPlayNameMobile() {
        return FX1.LIZIZ.LJFF();
    }

    public boolean hasPlatformBinded() {
        return FX1.LIZIZ.LIZ();
    }

    public long getUserId() {
        return CastLongProtector.parseLong(HG3.LJIILL().getCurUserId());
    }

    public boolean isLogin() {
        return HG3.LJIILL().isLogin();
    }

    @Override // com.ss.android.sdk.webview.di.IMainServiceForJsb
    public String getJSSDKConfigUrl() {
        return JS_SDK_CONFIG_URL;
    }

    public static IMainServiceForJsb createIMainServiceForJsbbyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IMainServiceForJsb.class, z);
        if (LIZ != null) {
            return (IMainServiceForJsb) LIZ;
        }
        if (C58096Mr6.M5 == null) {
            synchronized (IMainServiceForJsb.class) {
                if (C58096Mr6.M5 == null) {
                    C58096Mr6.M5 = new MainServiceForJsb();
                }
            }
        }
        return C58096Mr6.M5;
    }

    @Override // com.ss.android.sdk.webview.di.IMainServiceForJsb
    public boolean isApiSuccess(JSONObject jSONObject) {
        if (jSONObject != null && "success".equals(jSONObject.optString("message"))) {
            return true;
        }
        return false;
    }

    public boolean isBrowserActivity(Context context) {
        return CrossPlatformActivity.class.isInstance(context);
    }

    public boolean isPlatformBinded(String str) {
        return FX1.LIZIZ.LIZIZ(str);
    }

    @Override // com.ss.android.sdk.webview.di.IMainServiceForJsb
    public void startAdsAppActivity(Activity activity, String str) {
        MainServiceImpl.createIMainServicebyMonsterPlugin(false).startAdsAppActivity(activity, str, "");
    }
}
