package com.kakao.sdk.common.model;

import X.C16880lQ;
import X.F9J;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.gson.m;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.common.util.Utility;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ApplicationContextInfo implements ApplicationInfo, ContextInfo {
    public final String mAppVer;
    public final Context mApplicationContext;
    public final String mClientId;
    public final String mCustomScheme;
    public final m mExtras;
    public final String mKaHeader;
    public final String mKeyHash;
    public final byte[] mSalt;
    public final SharedPreferences mSharedPreferences;

    @Override // com.kakao.sdk.common.model.ApplicationInfo
    public String getRedirectUri() {
        return o.LJIILLIIL("://oauth", this.mCustomScheme);
    }

    @Override // com.kakao.sdk.common.model.ApplicationInfo
    public String getAppKey() {
        return this.mClientId;
    }

    @Override // com.kakao.sdk.common.model.ContextInfo
    public String getAppVer() {
        return this.mAppVer;
    }

    public final Context getApplicationContext() {
        return this.mApplicationContext;
    }

    @Override // com.kakao.sdk.common.model.ApplicationInfo
    public String getCustomScheme() {
        return this.mCustomScheme;
    }

    @Override // com.kakao.sdk.common.model.ContextInfo
    public m getExtras() {
        return this.mExtras;
    }

    @Override // com.kakao.sdk.common.model.ContextInfo
    public String getKaHeader() {
        return this.mKaHeader;
    }

    @Override // com.kakao.sdk.common.model.ContextInfo
    public byte[] getSalt() {
        return this.mSalt;
    }

    public final SharedPreferences getSharedPreferences() {
        return this.mSharedPreferences;
    }

    @Override // com.kakao.sdk.common.model.ContextInfo
    public String getSigningKeyHash() {
        return this.mKeyHash;
    }

    public ApplicationContextInfo(Context context, String appKey, String customScheme, KakaoSdk.Type sdkType, SdkIdentifier sdkIdentifier) {
        String str;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(appKey, "appKey");
        o.LJIIIZ(customScheme, "customScheme");
        o.LJIIIZ(sdkType, "sdkType");
        o.LJIIIZ(sdkIdentifier, "sdkIdentifier");
        this.mClientId = appKey;
        this.mCustomScheme = customScheme;
        Utility utility = Utility.INSTANCE;
        this.mKaHeader = utility.getKAHeader(context, sdkType, sdkIdentifier);
        this.mKeyHash = utility.getKeyHash(context);
        this.mExtras = utility.getExtras(context, sdkType);
        SharedPreferences LIZIZ = F9J.LIZIZ(context, 0, appKey);
        o.LJIIIIZZ(LIZIZ, "context.getSharedPreferences(appKey, Context.MODE_PRIVATE)");
        this.mSharedPreferences = LIZIZ;
        if (Build.VERSION.SDK_INT >= 33) {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L)).versionName;
            o.LJIIIIZZ(str, "{\n        context.packageManager.getPackageInfo(\n            context.packageName,\n            PackageManager.PackageInfoFlags.of(0)\n        ).versionName\n    }");
        } else {
            str = C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 0).versionName;
            o.LJIIIIZZ(str, "{\n        @Suppress(\"DEPRECATION\")\n        context.packageManager.getPackageInfo(context.packageName, 0).versionName\n    }");
        }
        this.mAppVer = str;
        this.mSalt = utility.androidId(context);
        Context LLLLL = C16880lQ.LLLLL(context);
        o.LJIIIIZZ(LLLLL, "context.applicationContext");
        this.mApplicationContext = LLLLL;
    }
}
