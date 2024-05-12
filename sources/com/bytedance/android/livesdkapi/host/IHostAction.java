package com.bytedance.android.livesdkapi.host;

import X.ActivityC45651qj;
import X.B4D;
import X.BMP;
import X.C28486BFy;
import X.C76800UCe;
import X.FQE;
import X.InterfaceC06390Mx;
import X.InterfaceC29613Bjl;
import X.InterfaceC60521Np7;
import X.InterfaceC60523Np9;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.HandlerThread;
import android.view.View;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public interface IHostAction extends InterfaceC06390Mx {
    void addPauseTask(Runnable runnable);

    float calcTargetLoudness();

    Intent createBroadcastEndSafetyToolsIntent(ActivityC45651qj activityC45651qj, Uri uri);

    void createNewNavi(String str, InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns);

    Intent createStartBroadcastIntent(ActivityC45651qj activityC45651qj, int i);

    void finishLivePlayActivity();

    String getBgBroadcastServiceName();

    Class getHostActivity(int i);

    FQE getHostClientAiService();

    HandlerThread getHostHandlerThread();

    List<Class> getLiveActivityClass();

    List<BMP> getLiveActivityTasksSetting();

    B4D getLivePreloadService();

    View getNaviSkinToneView(Context context, List<Effect> list, int i, boolean z, InterfaceC88472Yns<Effect, C76800UCe> interfaceC88472Yns);

    boolean getPushLiveState();

    Fragment getSubOnlyVideoContentFragment(boolean z, long j, String str, String str2);

    Activity getTopActivity();

    ActivityC45651qj getTopFragmentActivity();

    void goEditDoBAgeGatePage(Activity activity, String str, InterfaceC60523Np9 interfaceC60523Np9);

    boolean handleIntentSchema(WebView webView, String str);

    boolean handleSchema(Context context, String str, Bundle bundle);

    boolean handleSchema(Context context, String str, Bundle bundle, boolean z);

    void hideNotificationTipDialog(Context context);

    boolean hostInterceptSpark(String str);

    void initLynxEnv();

    boolean isNotificationEnabled(Context context);

    void jumpLivePlayActivityClearTop(Context context);

    void jumpToAgsStatusPage(Context context, String str);

    void jumpToFeedBack(Activity activity, long j);

    void notifyShowLiveIconEntrance(boolean z);

    @Override // X.InterfaceC06390Mx
    /* bridge */ /* synthetic */ void onInit();

    void onNaviMessageReceived(int i, int i2, int i3, String str, InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<Integer, C76800UCe> interfaceC88472Yns2);

    void openCamera(Activity activity, int i, Uri uri, Boolean bool);

    void openFeedBack(String str, Context context);

    void openLiveBrowser(String str, Bundle bundle, Context context);

    void openLiveBrowser(String str, String str2, Context context);

    void openLiveLynx(String str, Bundle bundle, Context context);

    void openLiveNewHybrid(Uri uri, Context context, Bundle bundle);

    void openRegionListPage(Activity activity, InterfaceC60521Np7 interfaceC60521Np7);

    void openUserProfilePage(long j, Map<String, String> map);

    void openWallet(Activity activity);

    void reportPushImprDurationTrack(HashMap<String, String> hashMap, boolean z);

    void setCurrentPage(int i);

    void showNotificationTipDialog(int i, String str, String str2, String str3, String str4, int i2, View view, String str5, C28486BFy c28486BFy, boolean z, InterfaceC29613Bjl interfaceC29613Bjl);

    void showNotificationTipDialog(String str, String str2, String str3, String str4, int i, View view, String str5, C28486BFy c28486BFy, boolean z, InterfaceC29613Bjl interfaceC29613Bjl);

    void startNaviOnboarding(Activity activity, View view, String str);

    void uploadNaviAsset(Context context, Bitmap bitmap, InterfaceC88471Ynr<List<String>, String, C76800UCe> interfaceC88471Ynr);
}
