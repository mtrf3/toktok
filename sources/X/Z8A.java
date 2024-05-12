package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.IProfileAssemService;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public final class Z8A implements IProfileService {
    public static final Z8A LIZIZ = new Z8A();
    public final /* synthetic */ IProfileService LIZ = ProfileServiceImpl.LIZ();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean canShowProfileFixedEntrance() {
        return this.LIZ.canShowProfileFixedEntrance();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void checkAndRefreshUser(Fragment fragment) {
        this.LIZ.checkAndRefreshUser(fragment);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean checkIDLocal(String str, Context context) {
        return this.LIZ.checkIDLocal(str, context);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean checkIDNet(String status, String str, String str2, Context context) {
        o.LJIIIZ(status, "status");
        return this.LIZ.checkIDNet(status, str, str2, context);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final AbstractC51036K1g<Aweme, ?> createAwemeModel() {
        return this.LIZ.createAwemeModel();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String disLikeAweme(Aweme aweme, int i, String str) {
        return this.LIZ.disLikeAweme(aweme, i, str);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String disLikeAweme(Aweme aweme, LinkData linkData) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(linkData, "linkData");
        return this.LIZ.disLikeAweme(aweme, linkData);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void disLikeAwemeApi(String str, java.util.Map<String, String> map) {
        this.LIZ.disLikeAwemeApi(str, map);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean enableShowFeatureVideoEntrance() {
        return this.LIZ.enableShowFeatureVideoEntrance();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean getAdFakeUserProfileBugfixSetting() {
        return this.LIZ.getAdFakeUserProfileBugfixSetting();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean getAndResetPauseAvatarAnim() {
        return this.LIZ.getAndResetPauseAvatarAnim();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final InterfaceC51123K4p getAsyncInflater(Activity activity, int i) {
        o.LJIIIZ(activity, "activity");
        return this.LIZ.getAsyncInflater(activity, Integer.MAX_VALUE);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final InterfaceC248539pB getAvatarPresenter() {
        return this.LIZ.getAvatarPresenter();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final AbstractC53585L1h<? extends L4O, ? extends AUS> getAvatarProfileAdapter() {
        return this.LIZ.getAvatarProfileAdapter();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String getDownloadProfileUid() {
        return this.LIZ.getDownloadProfileUid();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Drawable getEaseInOutGradientDrawable(float f, int i, boolean z) {
        return this.LIZ.getEaseInOutGradientDrawable(f, i, z);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final int getEnterpriseType(User user) {
        return this.LIZ.getEnterpriseType(user);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final AmeBaseFragment getI18nMyProfileFragmentV2() {
        return this.LIZ.getI18nMyProfileFragmentV2();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final AmeBaseFragment getI18nUserProfileFragmentV2() {
        return this.LIZ.getI18nUserProfileFragmentV2();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final long getLastTimeShowPublishSuccessWindow(String userId, long j) {
        o.LJIIIZ(userId, "userId");
        return this.LIZ.getLastTimeShowPublishSuccessWindow(userId, 0L);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String getLiveEventsUrl() {
        return this.LIZ.getLiveEventsUrl();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final YFI getMTAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2, boolean z3, Bundle bundle) {
        return this.LIZ.getMTAwemeListFragment(i, i2, str, str2, z, z2, z3, bundle);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final int getMessageProfile() {
        return this.LIZ.getMessageProfile();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final IProfileAssemService getProfileAssemService() {
        return this.LIZ.getProfileAssemService();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final AbstractC60117Nib getProfileBioLinkTitleBarProvider() {
        return this.LIZ.getProfileBioLinkTitleBarProvider();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Class<? extends CommonPageFragment> getProfilePageFragmentClass() {
        return this.LIZ.getProfilePageFragmentClass();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final EE1 getProfilePageModelPreloadTask() {
        return this.LIZ.getProfilePageModelPreloadTask();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Object getPushSettingCallback() {
        return this.LIZ.getPushSettingCallback();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final InterfaceC65350Pko<? extends C8W0> getSocialActivityAssem() {
        return this.LIZ.getSocialActivityAssem();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String getTabNameInGuideUserUtil() {
        return this.LIZ.getTabNameInGuideUserUtil();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String getUserApi() {
        return this.LIZ.getUserApi();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String getUserPath(boolean z) {
        return this.LIZ.getUserPath(true);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String getUserPermissionsPath() {
        return this.LIZ.getUserPermissionsPath();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final AbstractC186377Td getVideoCollectionFavoriteTab(Context context, int i, Boolean bool) {
        o.LJIIIZ(context, "context");
        return this.LIZ.getVideoCollectionFavoriteTab(context, i, bool);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final AbstractC186347Ta getVideoCollectionFavoriteTabV2(Context context, int i, Boolean bool) {
        o.LJIIIZ(context, "context");
        return this.LIZ.getVideoCollectionFavoriteTabV2(context, i, bool);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final int getViewRawBottomY(View view) {
        return this.LIZ.getViewRawBottomY(view);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final EE1 getYoutubeRefreshTask() {
        return this.LIZ.getYoutubeRefreshTask();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void gotoCrop(Activity activity, String originalUrl, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(originalUrl, "originalUrl");
        this.LIZ.gotoCrop(activity, originalUrl, z, f, i, i2, i3, i4, i5, z2, bundle);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void gotoCrop(Fragment fragment, String originalUrl, boolean z, float f, int i, int i2, int i3, int i4, int i5, Bundle bundle) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(originalUrl, "originalUrl");
        this.LIZ.gotoCrop(fragment, originalUrl, z, f, i, i2, i3, i4, i5, bundle);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void gotoCropActivity(Activity activity, String originalUrl, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2) {
        o.LJIIIZ(originalUrl, "originalUrl");
        this.LIZ.gotoCropActivity(activity, originalUrl, false, f, i, 10004, i3, i4, i5, false);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2, Bundle bundle, boolean z3) {
        this.LIZ.gotoCropActivity(activity, str, false, 1.0f, i, 10001, LiveCoverMinSizeSetting.DEFAULT, LiveCoverMinSizeSetting.DEFAULT, 1101, false, null, false);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean hasLiveEventPermissionSettings() {
        return this.LIZ.hasLiveEventPermissionSettings();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isFromProfileLongPress(String str, String str2) {
        return this.LIZ.isFromProfileLongPress(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isI18nMyProfileFragmentV2(Fragment fragment) {
        return this.LIZ.isI18nMyProfileFragmentV2(fragment);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isI18nUserProfileFragmentV2(Fragment fragment) {
        return this.LIZ.isI18nUserProfileFragmentV2(fragment);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isInProfilePageForProfileDownload() {
        return this.LIZ.isInProfilePageForProfileDownload();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isNotificationEnabled(Context context) {
        o.LJIIIZ(context, "context");
        return this.LIZ.isNotificationEnabled(context);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isProfileViewersEnable() {
        return this.LIZ.isProfileViewersEnable();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isShowGuideCreateVideoInGuideUserUtil() {
        return this.LIZ.isShowGuideCreateVideoInGuideUserUtil();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isTooltipInGuideUserUtil() {
        return this.LIZ.isTooltipInGuideUserUtil();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isUserProfileFragment(Fragment fragment) {
        return this.LIZ.isUserProfileFragment(fragment);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void longPressProfileCell(String str, Aweme aweme, Activity activity, String profileUserId, String eneterFrom, int i, View view, Fragment fragment, InterfaceC72642tA<C50420Jqa> eventListener) {
        o.LJIIIZ(profileUserId, "profileUserId");
        o.LJIIIZ(eneterFrom, "eneterFrom");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(eventListener, "eventListener");
        this.LIZ.longPressProfileCell("shortcut_panel", aweme, activity, profileUserId, eneterFrom, i, view, fragment, eventListener);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void mobClickEnterProfileViewer() {
        this.LIZ.mobClickEnterProfileViewer();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void mobRefreshInProfileAweme(AbstractC51036K1g<?, ?> model, List<? extends Aweme> list) {
        o.LJIIIZ(model, "model");
        this.LIZ.mobRefreshInProfileAweme(model, list);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean needShowBindPhoneNumberNotice() {
        return this.LIZ.needShowBindPhoneNumberNotice();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean needShowCompleteProfileGuideBar() {
        return this.LIZ.needShowCompleteProfileGuideBar();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean needShowSafeInfoNotice() {
        return this.LIZ.needShowSafeInfoNotice();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final C9WG newUserPresenter() {
        return this.LIZ.newUserPresenter();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Fragment obtainMyProfileFragment() {
        return this.LIZ.obtainMyProfileFragment();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Fragment obtainUserProfileFragment() {
        return this.LIZ.obtainUserProfileFragment();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void postDarkModeStatusEvent(boolean z) {
        this.LIZ.postDarkModeStatusEvent(z);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void preloadProfile(ActivityC45651qj activity, String pageName) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(pageName, "pageName");
        this.LIZ.preloadProfile(activity, pageName);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void preloadProfileInfoAndAwemePost(Aweme aweme, Integer num, int i, String str) {
        this.LIZ.preloadProfileInfoAndAwemePost(aweme, num, i, "homepage_hot");
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Class<? extends Activity> profileActivityClz() {
        return this.LIZ.profileActivityClz();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final AbstractC200747uI<?, ?> provideAwemeModel() {
        return this.LIZ.provideAwemeModel();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Fragment providePushSettingNotificationChoiceFragment() {
        return this.LIZ.providePushSettingNotificationChoiceFragment();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void queryProfileResponse(Handler handler) {
        this.LIZ.queryProfileResponse(handler);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void queryProfileResponseWithDoubleId(Handler handler, String str, String str2, String str3, int i) {
        o.LJIIIZ(handler, "handler");
        this.LIZ.queryProfileResponseWithDoubleId(handler, str, str2, "", 0);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void queryProfileWithId(Handler handler, String str, int i) {
        this.LIZ.queryProfileWithId(handler, str, 0);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final User queryUser(String url, boolean z, String str) {
        o.LJIIIZ(url, "url");
        return this.LIZ.queryUser(url, z, str);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void queryUserResponse(String url, boolean z, String isPreload) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(isPreload, "isPreload");
        this.LIZ.queryUserResponse(url, true, isPreload);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void removeAllCache() {
        this.LIZ.removeAllCache();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void removeCacheByUser(String str, String str2) {
        this.LIZ.removeCacheByUser(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void requestUser(String str, String str2, InterfaceC251799uR interfaceC251799uR) {
        this.LIZ.requestUser(str, str2, interfaceC251799uR);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void runYoutubeRefreshTask(Context context) {
        this.LIZ.runYoutubeRefreshTask(context);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void setLastTimeShowPublishSuccessWindow(String str, long j) {
        this.LIZ.setLastTimeShowPublishSuccessWindow(str, j);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void setShownBarInCouponKeva(boolean z) {
        this.LIZ.setShownBarInCouponKeva(false);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void setShownBubbleInCouponKeva(boolean z) {
        this.LIZ.setShownBubbleInCouponKeva(z);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void setShownStarInCouponKeva(boolean z) {
        this.LIZ.setShownStarInCouponKeva(false);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean shouldShowProfileViewerPushItem() {
        return this.LIZ.shouldShowProfileViewerPushItem();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean showBubbleInCouponKeva() {
        return this.LIZ.showBubbleInCouponKeva();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void showCheckMultiAccountBottomSheet(FragmentManager fragmentManager, AV9 av9, String str) {
        this.LIZ.showCheckMultiAccountBottomSheet(fragmentManager, av9, "check_multi_account_dialog");
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean showCouponIconInCouponKeva(String str, int i) {
        return this.LIZ.showCouponIconInCouponKeva(str, i);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void showInChooseAccountBottomSheet(FragmentManager fragmentManager, AV9 av9, String str, Bundle bundle, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnCancelListener onCancelListener) {
        this.LIZ.showInChooseAccountBottomSheet(fragmentManager, av9, str, bundle, onDismissListener, onCancelListener);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean showRemindUserCompleteProfileDialog(Context context, String str, String str2, DialogInterface.OnDismissListener onDismissListener) {
        o.LJIIIZ(context, "context");
        return this.LIZ.showRemindUserCompleteProfileDialog(context, str, "comment", onDismissListener);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void startHeaderDetailActivity(Activity activity, Bundle bundle) {
        this.LIZ.startHeaderDetailActivity(activity, bundle);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void startHeaderDetailActivity(Activity activity, View view, float f, User user, boolean z, boolean z2, Challenge challenge, String... strArr) {
        this.LIZ.startHeaderDetailActivity(activity, view, f, null, false, false, null, strArr);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void startHeaderDetailActivity(Activity activity, View view, User user, boolean z) {
        o.LJIIIZ(user, "user");
        this.LIZ.startHeaderDetailActivity(activity, view, user, z);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void startHeaderDetailActivity(Activity activity, View view, User user, boolean z, boolean z2) {
        o.LJIIIZ(user, "user");
        this.LIZ.startHeaderDetailActivity(activity, view, user, z, z2);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void startProfileEditActivity(Activity activity, Bundle bundle) {
        this.LIZ.startProfileEditActivity(activity, bundle);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void startProfileEditBioUrlActivity(Activity activity, String str) {
        this.LIZ.startProfileEditBioUrlActivity(activity, str);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateCoverIfMyProfileVisible(ActivityC45651qj activityC45651qj, String str, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        this.LIZ.updateCoverIfMyProfileVisible(activityC45651qj, str, aweme);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateFirstTimeInCouponKeva(JSONObject jSONObject) {
        this.LIZ.updateFirstTimeInCouponKeva(jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateProfilePageFragmentParams(Fragment fragment, String str) {
        this.LIZ.updateProfilePageFragmentParams(fragment, str);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateProfilePageFragmentParams(Fragment fragment, String str, boolean z) {
        this.LIZ.updateProfilePageFragmentParams(fragment, str, z);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateProfilePermission(boolean z) {
        this.LIZ.updateProfilePermission(z);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateSavePostChoose(Activity activity, String realEnterMethod, AvatarUri avatarUri, String avatarSource, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88472Yns<? super Exception, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(realEnterMethod, "realEnterMethod");
        o.LJIIIZ(avatarUri, "avatarUri");
        o.LJIIIZ(avatarSource, "avatarSource");
        this.LIZ.updateSavePostChoose(activity, realEnterMethod, avatarUri, avatarSource, interfaceC65784Pro, interfaceC88472Yns);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateUserInfo(Fragment fragment, Aweme aweme) {
        this.LIZ.updateUserInfo(fragment, aweme);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean userNameLegitimate() {
        return this.LIZ.userNameLegitimate();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String userUrl(String str, String str2, String str3, int i) {
        return this.LIZ.userUrl(str, str2, str3, 0);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void queryAwemeWithID(boolean z, String str, String str2, int i, long j, int i2, String str3, int i3, int i4) {
        HH1.LIZ(str, "id", str2, "secUid", str3, "preloadKey");
        this.LIZ.queryAwemeWithID(true, str, str2, 0, 0L, 20, str3, 0, 0);
    }
}
