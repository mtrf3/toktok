package com.ss.android.ugc.aweme.profile;

import X.AUS;
import X.AV9;
import X.AbstractC186347Ta;
import X.AbstractC186377Td;
import X.AbstractC200747uI;
import X.AbstractC51036K1g;
import X.AbstractC53585L1h;
import X.AbstractC60117Nib;
import X.ActivityC45651qj;
import X.C50420Jqa;
import X.C76800UCe;
import X.C8W0;
import X.C9WG;
import X.EE1;
import X.InterfaceC248539pB;
import X.InterfaceC251799uR;
import X.InterfaceC51123K4p;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC72642tA;
import X.InterfaceC88472Yns;
import X.L4O;
import X.YFI;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface IProfileService {
    boolean canShowProfileFixedEntrance();

    void checkAndRefreshUser(Fragment fragment);

    boolean checkIDLocal(String str, Context context);

    boolean checkIDNet(String str, String str2, String str3, Context context);

    AbstractC51036K1g<Aweme, ?> createAwemeModel();

    String disLikeAweme(Aweme aweme, int i, String str);

    String disLikeAweme(Aweme aweme, LinkData linkData);

    void disLikeAwemeApi(String str, Map<String, String> map);

    boolean enableShowFeatureVideoEntrance();

    boolean getAdFakeUserProfileBugfixSetting();

    boolean getAndResetPauseAvatarAnim();

    InterfaceC51123K4p getAsyncInflater(Activity activity, int i);

    InterfaceC248539pB getAvatarPresenter();

    AbstractC53585L1h<? extends L4O, ? extends AUS> getAvatarProfileAdapter();

    String getDownloadProfileUid();

    Drawable getEaseInOutGradientDrawable(float f, int i, boolean z);

    int getEnterpriseType(User user);

    AmeBaseFragment getI18nMyProfileFragmentV2();

    AmeBaseFragment getI18nUserProfileFragmentV2();

    long getLastTimeShowPublishSuccessWindow(String str, long j);

    String getLiveEventsUrl();

    YFI getMTAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2, boolean z3, Bundle bundle);

    int getMessageProfile();

    IProfileAssemService getProfileAssemService();

    AbstractC60117Nib getProfileBioLinkTitleBarProvider();

    Class<? extends CommonPageFragment> getProfilePageFragmentClass();

    EE1 getProfilePageModelPreloadTask();

    Object getPushSettingCallback();

    InterfaceC65350Pko<? extends C8W0> getSocialActivityAssem();

    String getTabNameInGuideUserUtil();

    String getUserApi();

    String getUserPath(boolean z);

    String getUserPermissionsPath();

    AbstractC186377Td getVideoCollectionFavoriteTab(Context context, int i, Boolean bool);

    AbstractC186347Ta getVideoCollectionFavoriteTabV2(Context context, int i, Boolean bool);

    int getViewRawBottomY(View view);

    EE1 getYoutubeRefreshTask();

    void gotoCrop(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2, Bundle bundle);

    void gotoCrop(Fragment fragment, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, Bundle bundle);

    void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2);

    void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2, Bundle bundle, boolean z3);

    boolean hasLiveEventPermissionSettings();

    boolean isFromProfileLongPress(String str, String str2);

    boolean isI18nMyProfileFragmentV2(Fragment fragment);

    boolean isI18nUserProfileFragmentV2(Fragment fragment);

    boolean isInProfilePageForProfileDownload();

    boolean isNotificationEnabled(Context context);

    boolean isProfileViewersEnable();

    boolean isShowGuideCreateVideoInGuideUserUtil();

    boolean isTooltipInGuideUserUtil();

    boolean isUserProfileFragment(Fragment fragment);

    void longPressProfileCell(String str, Aweme aweme, Activity activity, String str2, String str3, int i, View view, Fragment fragment, InterfaceC72642tA<C50420Jqa> interfaceC72642tA);

    void mobClickEnterProfileViewer();

    void mobRefreshInProfileAweme(AbstractC51036K1g<?, ?> abstractC51036K1g, List<? extends Aweme> list);

    boolean needShowBindPhoneNumberNotice();

    boolean needShowCompleteProfileGuideBar();

    boolean needShowSafeInfoNotice();

    C9WG newUserPresenter();

    Fragment obtainMyProfileFragment();

    Fragment obtainUserProfileFragment();

    void postDarkModeStatusEvent(boolean z);

    void preloadProfile(ActivityC45651qj activityC45651qj, String str);

    void preloadProfileInfoAndAwemePost(Aweme aweme, Integer num, int i, String str);

    Class<? extends Activity> profileActivityClz();

    AbstractC200747uI<?, ?> provideAwemeModel();

    Fragment providePushSettingNotificationChoiceFragment();

    void queryAwemeWithID(boolean z, String str, String str2, int i, long j, int i2, String str3, int i3, int i4);

    void queryProfileResponse(Handler handler);

    void queryProfileResponseWithDoubleId(Handler handler, String str, String str2, String str3, int i);

    void queryProfileWithId(Handler handler, String str, int i);

    User queryUser(String str, boolean z, String str2);

    void queryUserResponse(String str, boolean z, String str2);

    void removeAllCache();

    void removeCacheByUser(String str, String str2);

    void requestUser(String str, String str2, InterfaceC251799uR interfaceC251799uR);

    void runYoutubeRefreshTask(Context context);

    void setLastTimeShowPublishSuccessWindow(String str, long j);

    void setShownBarInCouponKeva(boolean z);

    void setShownBubbleInCouponKeva(boolean z);

    void setShownStarInCouponKeva(boolean z);

    boolean shouldShowProfileViewerPushItem();

    boolean showBubbleInCouponKeva();

    void showCheckMultiAccountBottomSheet(FragmentManager fragmentManager, AV9 av9, String str);

    boolean showCouponIconInCouponKeva(String str, int i);

    void showInChooseAccountBottomSheet(FragmentManager fragmentManager, AV9 av9, String str, Bundle bundle, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnCancelListener onCancelListener);

    boolean showRemindUserCompleteProfileDialog(Context context, String str, String str2, DialogInterface.OnDismissListener onDismissListener);

    void startHeaderDetailActivity(Activity activity, Bundle bundle);

    void startHeaderDetailActivity(Activity activity, View view, float f, User user, boolean z, boolean z2, Challenge challenge, String... strArr);

    void startHeaderDetailActivity(Activity activity, View view, User user, boolean z);

    void startHeaderDetailActivity(Activity activity, View view, User user, boolean z, boolean z2);

    void startProfileEditActivity(Activity activity, Bundle bundle);

    void startProfileEditBioUrlActivity(Activity activity, String str);

    void updateCoverIfMyProfileVisible(ActivityC45651qj activityC45651qj, String str, Aweme aweme);

    void updateFirstTimeInCouponKeva(JSONObject jSONObject);

    void updateProfilePageFragmentParams(Fragment fragment, String str);

    void updateProfilePageFragmentParams(Fragment fragment, String str, boolean z);

    void updateProfilePermission(boolean z);

    void updateSavePostChoose(Activity activity, String str, AvatarUri avatarUri, String str2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88472Yns<? super Exception, C76800UCe> interfaceC88472Yns);

    void updateUserInfo(Fragment fragment, Aweme aweme);

    boolean userNameLegitimate();

    String userUrl(String str, String str2, String str3, int i);
}
