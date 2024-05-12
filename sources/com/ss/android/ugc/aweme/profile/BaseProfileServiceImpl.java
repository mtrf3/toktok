package com.ss.android.ugc.aweme.profile;

import X.AOI;
import X.AUS;
import X.AV9;
import X.AW2;
import X.AW3;
import X.AbstractC186347Ta;
import X.AbstractC186377Td;
import X.AbstractC200747uI;
import X.AbstractC51036K1g;
import X.AbstractC53585L1h;
import X.AbstractC60117Nib;
import X.ActivityC45651qj;
import X.C10K;
import X.C251809uS;
import X.C251839uV;
import X.C25789AAf;
import X.C26347AVr;
import X.C3SZ;
import X.C4LD;
import X.C50420Jqa;
import X.C55693LtR;
import X.C62825OlB;
import X.C76800UCe;
import X.C78841Uwv;
import X.C8W0;
import X.EE1;
import X.EF7;
import X.HG3;
import X.InterfaceC248539pB;
import X.InterfaceC251799uR;
import X.InterfaceC26353AVx;
import X.InterfaceC51123K4p;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC72642tA;
import X.InterfaceC88472Yns;
import X.L4O;
import X.YFI;
import X.YFM;
import Y.ACallableS107S0100000_4;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.UserPresenter;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragment;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl;
import com.ss.android.ugc.aweme.profile.ui.v2.I18nMyProfileFragmentV2;
import com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2;
import com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS9S0010000_4;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class BaseProfileServiceImpl implements IProfileService {
    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean canShowProfileFixedEntrance();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void checkAndRefreshUser(Fragment fragment);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean checkIDLocal(String str, Context context);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean checkIDNet(String str, String str2, String str3, Context context);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ String disLikeAweme(Aweme aweme, int i, String str);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ String disLikeAweme(Aweme aweme, LinkData linkData);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void disLikeAwemeApi(String str, Map<String, String> map);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean enableShowFeatureVideoEntrance();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean getAdFakeUserProfileBugfixSetting();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean getAndResetPauseAvatarAnim();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ InterfaceC51123K4p getAsyncInflater(Activity activity, int i);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ InterfaceC248539pB getAvatarPresenter();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ Drawable getEaseInOutGradientDrawable(float f, int i, boolean z);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ int getEnterpriseType(User user);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ AmeBaseFragment getI18nMyProfileFragmentV2();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ AmeBaseFragment getI18nUserProfileFragmentV2();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ long getLastTimeShowPublishSuccessWindow(String str, long j);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ String getLiveEventsUrl();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ YFI getMTAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2, boolean z3, Bundle bundle);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public int getMessageProfile() {
        return 0;
    }

    public abstract /* synthetic */ Class<? extends Fragment> getMyProfileClass();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ IProfileAssemService getProfileAssemService();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ AbstractC60117Nib getProfileBioLinkTitleBarProvider();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ Class<? extends CommonPageFragment> getProfilePageFragmentClass();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ EE1 getProfilePageModelPreloadTask();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ InterfaceC65350Pko<? extends C8W0> getSocialActivityAssem();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ String getTabNameInGuideUserUtil();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ String getUserApi();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ String getUserPath(boolean z);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ String getUserPermissionsPath();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ AbstractC186377Td getVideoCollectionFavoriteTab(Context context, int i, Boolean bool);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ AbstractC186347Ta getVideoCollectionFavoriteTabV2(Context context, int i, Boolean bool);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ int getViewRawBottomY(View view);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ EE1 getYoutubeRefreshTask();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void gotoCrop(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2, Bundle bundle);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void gotoCrop(Fragment fragment, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, Bundle bundle);

    public abstract /* synthetic */ boolean hasLiveEventPermission();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean hasLiveEventPermissionSettings();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean isI18nMyProfileFragmentV2(Fragment fragment);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean isI18nUserProfileFragmentV2(Fragment fragment);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean isNotificationEnabled(Context context);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean isProfileViewersEnable();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean isShowGuideCreateVideoInGuideUserUtil();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean isTooltipInGuideUserUtil();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean isUserProfileFragment(Fragment fragment);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void mobClickEnterProfileViewer();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean needShowBindPhoneNumberNotice();

    public boolean needShowCompleteProfileGuide() {
        return false;
    }

    public abstract /* synthetic */ AwemeListFragment newAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2, Bundle bundle);

    public abstract /* synthetic */ InterfaceC26353AVx newProfileTagLayoutManager(LinearLayout linearLayout, int i, boolean z, boolean z2, boolean z3);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void postDarkModeStatusEvent(boolean z);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void preloadProfileInfoAndAwemePost(Aweme aweme, Integer num, int i, String str);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ Class<? extends Activity> profileActivityClz();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ AbstractC200747uI<?, ?> provideAwemeModel();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ Fragment providePushSettingNotificationChoiceFragment();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void queryAwemeWithID(boolean z, String str, String str2, int i, long j, int i2, String str3, int i3, int i4);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void queryProfileResponse(Handler handler);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void queryProfileWithId(Handler handler, String str, int i);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void queryUserResponse(String str, boolean z, String str2);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void removeAllCache();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void removeCacheByUser(String str, String str2);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void requestUser(String str, String str2, InterfaceC251799uR interfaceC251799uR);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void runYoutubeRefreshTask(Context context);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void setLastTimeShowPublishSuccessWindow(String str, long j);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void setShownBarInCouponKeva(boolean z);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void setShownBubbleInCouponKeva(boolean z);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void setShownStarInCouponKeva(boolean z);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean shouldShowProfileViewerPushItem();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean showBubbleInCouponKeva();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void showCheckMultiAccountBottomSheet(FragmentManager fragmentManager, AV9 av9, String str);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean showCouponIconInCouponKeva(String str, int i);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void showInChooseAccountBottomSheet(FragmentManager fragmentManager, AV9 av9, String str, Bundle bundle, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnCancelListener onCancelListener);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public boolean showRemindUserCompleteProfileDialog(Context context, String str, String str2, DialogInterface.OnDismissListener onDismissListener) {
        o.LJIIIZ(context, "context");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void startHeaderDetailActivity(Activity activity, Bundle bundle);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void startHeaderDetailActivity(Activity activity, View view, float f, User user, boolean z, boolean z2, Challenge challenge, String... strArr);

    public abstract /* synthetic */ void startHeaderDetailActivity(Activity activity, View view, float f, String... strArr);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void startHeaderDetailActivity(Activity activity, View view, User user, boolean z);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void startHeaderDetailActivity(Activity activity, View view, User user, boolean z, boolean z2);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void startProfileEditActivity(Activity activity, Bundle bundle);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void startProfileEditBioUrlActivity(Activity activity, String str);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void updateCoverIfMyProfileVisible(ActivityC45651qj activityC45651qj, String str, Aweme aweme);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void updateFirstTimeInCouponKeva(JSONObject jSONObject);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void updateProfilePageFragmentParams(Fragment fragment, String str);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void updateProfilePageFragmentParams(Fragment fragment, String str, boolean z);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ void updateSavePostChoose(Activity activity, String str, AvatarUri avatarUri, String str2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88472Yns<? super Exception, C76800UCe> interfaceC88472Yns);

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public abstract /* synthetic */ boolean userNameLegitimate();

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public AbstractC51036K1g<Aweme, ?> createAwemeModel() {
        return new C55693LtR();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public boolean isInProfilePageForProfileDownload() {
        if (C62825OlB.LJLLILLLL || C62825OlB.LJLLI) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public boolean needShowSafeInfoNotice() {
        return YFM.LIZIZ.needShowSafeInfoNotice();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public UserPresenter newUserPresenter() {
        return new UserPresenter();
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public boolean needShowCompleteProfileGuideBar() {
        boolean z;
        User curUser = HG3.LJIILL().getCurUser();
        if (curUser.getProfileCompletion() > 0.0f && curUser.getProfileCompletion() <= 0.7f) {
            z = true;
        } else {
            z = false;
        }
        if (needShowCompleteProfileGuide() && (z || curUser.nicknameUpdateReminder() || curUser.avatarUpdateReminder())) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public Fragment obtainMyProfileFragment() {
        if (MSAdaptionService.LJIIL().LIZLLL(EF7.LIZIZ())) {
            return new I18nMyProfileFragmentV2();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public Fragment obtainUserProfileFragment() {
        if (MSAdaptionService.LJIIL().LIZLLL(EF7.LIZIZ())) {
            I18nUserProfileFragmentV2 i18nUserProfileFragmentV2 = new I18nUserProfileFragmentV2();
            if (MSAdaptionService.LJIIL().LIZIZ(EF7.LIZIZ())) {
                i18nUserProfileFragmentV2.LLII("homepage_hot");
                return i18nUserProfileFragmentV2;
            }
            return i18nUserProfileFragmentV2;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public AbstractC53585L1h<? extends L4O, ? extends AUS> getAvatarProfileAdapter() {
        return AW3.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public String getDownloadProfileUid() {
        return C62825OlB.LJLL;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public Object getPushSettingCallback() {
        return C25789AAf.LJLIL;
    }

    public boolean isFromProfilePage(String str) {
        if (o.LJ(str, "personal_homepage") || o.LJ(str, "others_homepage")) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public void updateProfilePermission(boolean z) {
        MyProfileGuideViewModel myProfileGuideViewModel;
        WeakReference<MyProfileGuideViewModel> weakReference = AOI.LIZIZ;
        if (weakReference != null && (myProfileGuideViewModel = weakReference.get()) != null) {
            myProfileGuideViewModel.setState(new AqS9S0010000_4(z, 64));
        }
        AOI.LIZ = z;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public boolean isFromProfileLongPress(String str, String str2) {
        if (isFromProfilePage(str) && (o.LJ(str2, "shortcut_panel") || o.LJ(str2, "retry"))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public void mobRefreshInProfileAweme(AbstractC51036K1g<?, ?> model, List<? extends Aweme> items) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(items, "items");
        if (model instanceof C55693LtR) {
            model.setItems(new ArrayList(items));
            ((FeedItemList) model.mData).cursor = items.size();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public void preloadProfile(ActivityC45651qj activity, String pageName) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(pageName, "pageName");
        Aweme aweme = C3SZ.LIZ(activity).LJLJJL;
        if (aweme != null && !aweme.getIsPreloadScroll() && TextUtils.equals(pageName, "page_profile")) {
            aweme.setIsPreloadScroll(true);
            C10K.LIZJ(new ACallableS107S0100000_4(aweme, 15));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public void updateUserInfo(Fragment fragment, Aweme aweme) {
        if (MSAdaptionService.LJIIL().LIZLLL(EF7.LIZIZ()) && (fragment instanceof AW2)) {
            ((AW2) fragment).q5(aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public User queryUser(String url, boolean z, String str) {
        o.LJIIIZ(url, "url");
        User LIZ = C251809uS.LIZ(url, z, str);
        o.LJIIIIZZ(LIZ, "queryUser(url, cache, isPreload)");
        return LIZ;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public String userUrl(String str, String str2, String str3, int i) {
        String LIZJ = C251809uS.LIZJ(i, Boolean.TRUE, str, str2, null);
        o.LJIIIIZZ(LIZJ, "userUrl(sid, uid, from, true)");
        return LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public void queryProfileResponseWithDoubleId(Handler handler, String str, String str2, String uniqueId, int i) {
        o.LJIIIZ(handler, "handler");
        o.LJIIIZ(uniqueId, "uniqueId");
        C251839uV LIZ = C251839uV.LIZ();
        Boolean bool = Boolean.TRUE;
        LIZ.getClass();
        C251839uV.LIZJ(handler, C251809uS.LIZJ(i, bool, str2, str, uniqueId));
    }

    public boolean showRemindUserCompleteProfileDialogAfterFollow(Context context, String str, String str2, User user, int i) {
        int followerCount;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(user, "user");
        if (o.LJ(str2, "follow") || o.LJ(str2, "follow_guide")) {
            if (C78841Uwv.LJJJ(user)) {
                followerCount = user.getFansCount();
            } else {
                followerCount = user.getFollowerCount();
            }
            if (followerCount < 1000 && (i == 1 || i == 2 || i == 4)) {
                return showRemindUserCompleteProfileDialog(context, str, "follow_guide", null);
            }
        }
        return false;
    }

    public AwemeListFragment newBasicAwemeListFragment(int i, int i2, String uid, String str, boolean z, boolean z2) {
        o.LJIIIZ(uid, "uid");
        if (str == null) {
            str = "";
        }
        Bundle bundle = new Bundle();
        AwemeListFragmentImpl awemeListFragmentImpl = new AwemeListFragmentImpl();
        bundle.putInt("type", i2);
        bundle.putString("uid", uid);
        bundle.putString("sec_user_id", str);
        bundle.putBoolean("is_my_profile", z);
        bundle.putBoolean("is_scene_transition_enable", false);
        bundle.putInt("bottom_bar_height", i);
        bundle.putBoolean("should_refresh_on_init_data", z2);
        awemeListFragmentImpl.setArguments(bundle);
        return awemeListFragmentImpl;
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public void longPressProfileCell(String str, Aweme aweme, Activity activity, String profileUserId, String eneterFrom, int i, View view, Fragment fragment, InterfaceC72642tA<C50420Jqa> eventListener) {
        o.LJIIIZ(profileUserId, "profileUserId");
        o.LJIIIZ(eneterFrom, "eneterFrom");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(eventListener, "eventListener");
        C4LD.LIZIZ.LJIIJJI(aweme, activity, profileUserId, eneterFrom, i, view, fragment, eventListener);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public void gotoCropActivity(Activity activity, String originalUrl, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(originalUrl, "originalUrl");
        C26347AVr.LIZ(activity, originalUrl, z, f, i, i2, i3, i4, i5, z2, null, true);
    }

    @Override // com.ss.android.ugc.aweme.profile.IProfileService
    public void gotoCropActivity(Activity activity, String originalUrl, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2, Bundle bundle, boolean z3) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(originalUrl, "originalUrl");
        C26347AVr.LIZ(activity, originalUrl, z, f, i, i2, i3, i4, i5, z2, bundle, z3);
    }
}
