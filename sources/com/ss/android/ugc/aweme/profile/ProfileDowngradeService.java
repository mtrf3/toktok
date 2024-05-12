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
import X.C39427Fdf;
import X.C50420Jqa;
import X.C65352Pkq;
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
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import defpackage.i0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class ProfileDowngradeService implements IProfileService {
    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean canShowProfileFixedEntrance() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean checkIDLocal(String str, Context context) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean checkIDNet(String status, String str, String str2, Context context) {
        o.LJIIIZ(status, "status");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean enableShowFeatureVideoEntrance() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean getAndResetPauseAvatarAnim() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final AbstractC53585L1h<? extends L4O, ? extends AUS> getAvatarProfileAdapter() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final int getEnterpriseType(User user) {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String getLiveEventsUrl() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final int getMessageProfile() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final IProfileAssemService getProfileAssemService() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final EE1 getProfilePageModelPreloadTask() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final InterfaceC65350Pko<? extends C8W0> getSocialActivityAssem() {
        return C65352Pkq.LIZ(BaseMainContainerAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String getUserApi() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String getUserPath(boolean z) {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String getUserPermissionsPath() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final AbstractC186377Td getVideoCollectionFavoriteTab(Context context, int i, Boolean bool) {
        o.LJIIIZ(context, "context");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final AbstractC186347Ta getVideoCollectionFavoriteTabV2(Context context, int i, Boolean bool) {
        o.LJIIIZ(context, "context");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final int getViewRawBottomY(View view) {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void gotoCropActivity(Activity activity, String originalUrl, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2) {
        o.LJIIIZ(originalUrl, "originalUrl");
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2, Bundle bundle, boolean z3) {
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean hasLiveEventPermissionSettings() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isNotificationEnabled(Context context) {
        o.LJIIIZ(context, "context");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isProfileViewersEnable() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void mobClickEnterProfileViewer() {
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void mobRefreshInProfileAweme(AbstractC51036K1g<?, ?> model, List<? extends Aweme> list) {
        o.LJIIIZ(model, "model");
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean needShowCompleteProfileGuideBar() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean needShowSafeInfoNotice() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Fragment obtainMyProfileFragment() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Fragment obtainUserProfileFragment() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void preloadProfile(ActivityC45651qj activity, String pageName) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(pageName, "pageName");
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Class<? extends Activity> profileActivityClz() {
        return Activity.class;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void queryProfileResponseWithDoubleId(Handler handler, String str, String str2, String str3, int i) {
        o.LJIIIZ(handler, "handler");
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean shouldShowProfileViewerPushItem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void showCheckMultiAccountBottomSheet(FragmentManager fragmentManager, AV9 av9, String str) {
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean showRemindUserCompleteProfileDialog(Context context, String str, String str2, DialogInterface.OnDismissListener onDismissListener) {
        o.LJIIIZ(context, "context");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateCoverIfMyProfileVisible(ActivityC45651qj activityC45651qj, String str, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateProfilePermission(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateSavePostChoose(Activity activity, String realEnterMethod, AvatarUri avatarUri, String avatarSource, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88472Yns<? super Exception, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(realEnterMethod, "realEnterMethod");
        o.LJIIIZ(avatarUri, "avatarUri");
        o.LJIIIZ(avatarSource, "avatarSource");
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateUserInfo(Fragment fragment, Aweme aweme) {
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final AbstractC51036K1g<Aweme, ?> createAwemeModel() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean getAdFakeUserProfileBugfixSetting() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final InterfaceC248539pB getAvatarPresenter() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String getDownloadProfileUid() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final AmeBaseFragment getI18nMyProfileFragmentV2() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final AmeBaseFragment getI18nUserProfileFragmentV2() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final AbstractC60117Nib getProfileBioLinkTitleBarProvider() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Class<? extends CommonPageFragment> getProfilePageFragmentClass() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Object getPushSettingCallback() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String getTabNameInGuideUserUtil() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final EE1 getYoutubeRefreshTask() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isInProfilePageForProfileDownload() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isShowGuideCreateVideoInGuideUserUtil() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isTooltipInGuideUserUtil() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean needShowBindPhoneNumberNotice() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final C9WG newUserPresenter() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final AbstractC200747uI provideAwemeModel() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Fragment providePushSettingNotificationChoiceFragment() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void removeAllCache() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean showBubbleInCouponKeva() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean userNameLegitimate() {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void checkAndRefreshUser(Fragment fragment) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isI18nMyProfileFragmentV2(Fragment fragment) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isI18nUserProfileFragmentV2(Fragment fragment) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isUserProfileFragment(Fragment fragment) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void postDarkModeStatusEvent(boolean z) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void queryProfileResponse(Handler handler) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void runYoutubeRefreshTask(Context context) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void setShownBarInCouponKeva(boolean z) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void setShownBubbleInCouponKeva(boolean z) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void setShownStarInCouponKeva(boolean z) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateFirstTimeInCouponKeva(JSONObject jSONObject) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String disLikeAweme(Aweme aweme, LinkData linkData) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(linkData, "linkData");
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void disLikeAwemeApi(String str, Map<String, String> map) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final InterfaceC51123K4p getAsyncInflater(Activity activity, int i) {
        o.LJIIIZ(activity, "activity");
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final long getLastTimeShowPublishSuccessWindow(String userId, long j) {
        o.LJIIIZ(userId, "userId");
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isFromProfileLongPress(String str, String str2) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void removeCacheByUser(String str, String str2) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void setLastTimeShowPublishSuccessWindow(String str, long j) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean showCouponIconInCouponKeva(String str, int i) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void startHeaderDetailActivity(Activity activity, Bundle bundle) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void startProfileEditActivity(Activity activity, Bundle bundle) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void startProfileEditBioUrlActivity(Activity activity, String str) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateProfilePageFragmentParams(Fragment fragment, String str) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String disLikeAweme(Aweme aweme, int i, String str) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final Drawable getEaseInOutGradientDrawable(float f, int i, boolean z) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void queryProfileWithId(Handler handler, String str, int i) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final User queryUser(String url, boolean z, String str) {
        o.LJIIIZ(url, "url");
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void queryUserResponse(String url, boolean z, String isPreload) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(isPreload, "isPreload");
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void requestUser(String str, String str2, InterfaceC251799uR interfaceC251799uR) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateProfilePageFragmentParams(Fragment fragment, String str, boolean z) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void preloadProfileInfoAndAwemePost(Aweme aweme, Integer num, int i, String str) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void startHeaderDetailActivity(Activity activity, View view, User user, boolean z) {
        o.LJIIIZ(user, "user");
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final String userUrl(String str, String str2, String str3, int i) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void startHeaderDetailActivity(Activity activity, View view, User user, boolean z, boolean z2) {
        o.LJIIIZ(user, "user");
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void showInChooseAccountBottomSheet(FragmentManager fragmentManager, AV9 av9, String str, Bundle bundle, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnCancelListener onCancelListener) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final YFI getMTAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2, boolean z3, Bundle bundle) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void startHeaderDetailActivity(Activity activity, View view, float f, User user, boolean z, boolean z2, Challenge challenge, String... strArr) {
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void longPressProfileCell(String str, Aweme aweme, Activity activity, String profileUserId, String eneterFrom, int i, View view, Fragment fragment, InterfaceC72642tA<C50420Jqa> eventListener) {
        o.LJIIIZ(profileUserId, "profileUserId");
        o.LJIIIZ(eneterFrom, "eneterFrom");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(eventListener, "eventListener");
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void queryAwemeWithID(boolean z, String id, String secUid, int i, long j, int i2, String preloadKey, int i3, int i4) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(secUid, "secUid");
        o.LJIIIZ(preloadKey, "preloadKey");
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void gotoCrop(Fragment fragment, String originalUrl, boolean z, float f, int i, int i2, int i3, int i4, int i5, Bundle bundle) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(originalUrl, "originalUrl");
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public final void gotoCrop(Activity activity, String originalUrl, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(originalUrl, "originalUrl");
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }
}
