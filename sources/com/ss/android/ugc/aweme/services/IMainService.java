package com.ss.android.ugc.aweme.services;

import X.C76800UCe;
import X.EE1;
import X.EFM;
import X.InterfaceC42037Gef;
import X.InterfaceC56220M4q;
import X.InterfaceC88472Yns;
import X.M56;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public interface IMainService {

    /* loaded from: classes10.dex */
    public interface DownLoadFinishListener {
        void doAfterDownLoad(int i, Boolean bool);
    }

    AVMusic avMusicApply(MusicModel musicModel);

    void changeStatusBarMainTab(Activity activity, String str);

    void checkAmplify(Activity activity, int i);

    boolean checkIsMinAppVersionNotSatisfied(Activity activity, String str, String str2);

    void downloadStickerHelper(String str, String str2, Activity activity, boolean z, DownLoadFinishListener downLoadFinishListener);

    String getAccessKey();

    EFM getAnchorListRequest();

    String getAnywhereChannelPath(String str);

    String getApiUrlPrefix();

    Class<? extends Activity> getAppLinkHandlerActivityClass(boolean z);

    int getAppVersionCode();

    Intent getAwemeWebIntent(Context context, Uri uri, Boolean bool, Boolean bool2);

    EE1 getCleanEffectsTask();

    EE1 getCookieMonitorTask();

    Class<? extends Activity> getDeepLinkHandlerActivityClass(boolean z);

    List<M56> getDeeplinkCommands();

    Long getFeedCount(Integer num);

    String getFeedOrder(Aweme aweme, Integer num);

    EE1 getFetchImUnder16RequestTask();

    EFM getFetchUnifiedSettingRequest();

    Fragment getFollowFragmentCache();

    int getLauncherIconRes();

    boolean getLeakUploadEnableExperimentValue();

    EE1 getLikoInitTask();

    Class<? extends Activity> getMainActivityClass();

    Intent getMainActivityIntent(Context context);

    EE1 getPreloadActicityTask();

    EE1 getPreloadInstanceTask();

    EE1 getPreloadResourcesTask();

    IEvent getPublishConcatMessage();

    Fragment getRecommendFragmentCache();

    EE1 getRegisterStorageTask();

    String getSecurityUrl(String str);

    Map<String, Object> getSettings(List<String> list);

    Class<? extends Activity> getSplashActivityClass();

    Intent handleAmeWebViewBrowserForDeeplink(Context context, Uri uri, Boolean bool, Boolean bool2);

    boolean handleLiveSchema(String str, Context context);

    void hideUploadRecover();

    boolean isAppHot();

    boolean isAwemeAppDataEmpty();

    boolean isContainsKeyWithLruEntries();

    boolean isDeepLinkHandlerActivity(Context context);

    boolean isLastPublishFailed();

    boolean isLimitAdTrackingEnabled();

    boolean isMainPage(Context context);

    boolean isOnFollowPage(Activity activity);

    boolean isReplaceAwemeCache();

    boolean isUseJediAwemelistFragment();

    Fragment obtainMainPageFragment();

    Fragment obtainSecondTabFragment();

    boolean openAdOpenUrl(Context context, String str, boolean z);

    boolean openAdTestUrl(Context context, String str, int i);

    boolean openAdWebUrl(Context context, String str, String str2);

    Boolean openAppLinkHandlerV2ActivityClass(Context context, String str, String str2);

    void openDeepLinkActivity(Context context, String str, String str2);

    boolean openGpByPackageName(Context context, String str);

    boolean openSystemBrowser(Context context, String str);

    void pendingDeepLinkLog(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns);

    void preloadStageTask(int i, Context context);

    void registerModerationResultPush(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns);

    void releaseWindowBackgroundTask(Activity activity);

    void restartApp(Bundle bundle);

    InterfaceC56220M4q routerDepend();

    boolean searchAdTransformOpen(Context context, Aweme aweme, int i);

    void setLastPublishFailed(boolean z);

    void setOptSmartAvatarBorderView(boolean z);

    void setSwitchAccountRestartPending(boolean z);

    boolean shouldShowCommerceTagOnFeed(Aweme aweme, Integer num);

    IAVPublishService.PublishProgressFragment showPublishDialogFragmentForParallelPublish(Object obj, FragmentManager fragmentManager, InterfaceC42037Gef interfaceC42037Gef);

    boolean startAdsAppActivity(Context context, String str, String str2);

    void startBulletActivity(Context context, String str, String str2, Bundle bundle);

    void startCleanEffect(Context context);

    void startVideoPlayActivity(Context context, String str, String str2, boolean z, String str3, String str4, String str5, String str6, float f);

    void startupTestColdBootEnd();

    void trackAppsFlyerEvent(String str, String str2);

    boolean tryShowIllegalUsernameDialog(String str, Runnable runnable, Runnable runnable2);

    void tryToShowPromoteNotification(Activity activity, int i);

    void tryToShowPromoteProgram(Activity activity);

    void unRegisterModerationResultPush();

    void updateIMUserFollowStatus(User user);
}
