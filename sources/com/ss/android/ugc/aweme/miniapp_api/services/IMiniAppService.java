package com.ss.android.ugc.aweme.miniapp_api.services;

import X.C227898wz;
import X.InterfaceC31074CHm;
import X.OBE;
import X.OBF;
import X.OBG;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import com.ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public interface IMiniAppService {
    String addScene(String str, String str2);

    boolean checkMiniAppEnable(Context context);

    String getJsSdkVersion(Application application);

    InterfaceC31074CHm getMobClickCombinerIpcService();

    void getShareInfo(String str, OBF obf);

    OBG getTTDownloaderIpcService();

    void handleActivityImageResult(int i, int i2, Intent intent);

    void initMiniApp(OBE obe);

    void initWebViewSuffix(ContextWrapper contextWrapper, String str);

    boolean isMinAppAvailable(Context context, String str);

    void jumpToMiniApp(Context context, String str, String str2, boolean z, String str3, String str4);

    void logExcitingVideoAd(Context context, String str, long j, String str2);

    void notifyFollowAwemeState(int i);

    void notifyLocaleChange(Locale locale);

    void onRequestPermissionsResult(Activity activity, String[] strArr, int[] iArr);

    boolean openMiniApp(Context context, MicroAppInfo microAppInfo, C227898wz c227898wz);

    boolean openMiniApp(Context context, String str, C227898wz c227898wz);

    boolean openShortcut(Context context, Intent intent);

    void preloadMiniApp(String str);

    void preloadMiniApp(String str, int i);

    void remoteMobV3(String str, JSONObject jSONObject);

    String setLaunchModeHostTask(String str);

    void tryMoveMiniAppActivityToFront(String str);
}
