package com.ss.android.ugc.aweme.profile;

import X.AGU;
import X.ASL;
import X.AUA;
import X.AV6;
import X.AV9;
import X.AW4;
import X.AWL;
import X.AXO;
import X.AbstractC186347Ta;
import X.AbstractC186377Td;
import X.AbstractC200747uI;
import X.AbstractC60117Nib;
import X.ActivityC45651qj;
import X.AnonymousClass949;
import X.C04270Et;
import X.C16880lQ;
import X.C19N;
import X.C1JI;
import X.C213898aP;
import X.C221018lt;
import X.C227548wQ;
import X.C243119gR;
import X.C244309iM;
import X.C244319iN;
import X.C244329iO;
import X.C251759uN;
import X.C251769uO;
import X.C251809uS;
import X.C251839uV;
import X.C255199zv;
import X.C26132ANk;
import X.C26347AVr;
import X.C26348AVs;
import X.C26354AVy;
import X.C26360AWe;
import X.C2U8;
import X.C2YJ;
import X.C3EA;
import X.C40322Fs6;
import X.C40471FuV;
import X.C55693LtR;
import X.C58096Mr6;
import X.C59784NdE;
import X.C63077OpF;
import X.C65352Pkq;
import X.C76800UCe;
import X.C78866UxK;
import X.C78983UzD;
import X.C79062V1e;
import X.C86179Xrz;
import X.C87277YNd;
import X.C8SG;
import X.C8W0;
import X.C9N5;
import X.C9NG;
import X.C9WB;
import X.EE1;
import X.EF7;
import X.F30;
import X.FGR;
import X.HG3;
import X.HandlerC26188APo;
import X.InterfaceC248539pB;
import X.InterfaceC251799uR;
import X.InterfaceC26189APp;
import X.InterfaceC26353AVx;
import X.InterfaceC51123K4p;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.KUN;
import X.L9Z;
import X.LKQ;
import X.MFV;
import X.RBX;
import X.U26;
import X.X1D;
import X.YFI;
import Y.ACallableS82S0101000_11;
import Y.AObjectS46S0101000_15;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.experiment.ProfileViewersExpConfig;
import com.ss.android.ugc.aweme.favorites.base.FavoriteTabItemV2;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionAgent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homeobserver.SocialActivityAssem;
import com.ss.android.ugc.aweme.net.preload.PowerPreloadServiceImpl;
import com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceFragment;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.ss.android.ugc.aweme.profile.api.AwemeApi;
import com.ss.android.ugc.aweme.profile.edit.YoutubeRefreshTask;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.AvatarPresenter;
import com.ss.android.ugc.aweme.profile.presenter.UserResponse;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragment;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl;
import com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity;
import com.ss.android.ugc.aweme.profile.ui.MTAwemeListFragment;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity;
import com.ss.android.ugc.aweme.profile.ui.UserProfileFragment;
import com.ss.android.ugc.aweme.profile.ui.multiaccount.CheckAccountBottomSheetFragment;
import com.ss.android.ugc.aweme.profile.ui.v2.I18nMyProfileFragmentV2;
import com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.profile.platform.base.cache.ProfilePageModelPreloadTask;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import defpackage.q;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class ProfileServiceImpl extends BaseProfileServiceImpl {

    /* loaded from: classes4.dex */
    public static final class FavoriteVideoCollectionFragmentData extends PowerViewPagerFragmentItem<AwemeListFragmentImpl> {
        public static final Parcelable.Creator<FavoriteVideoCollectionFragmentData> CREATOR = new Parcelable.Creator<FavoriteVideoCollectionFragmentData>() { // from class: X.8Zk
            @Override // android.os.Parcelable.Creator
            public final ProfileServiceImpl.FavoriteVideoCollectionFragmentData createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                o.LJIIIZ(parcel, "parcel");
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return new ProfileServiceImpl.FavoriteVideoCollectionFragmentData(readInt, readInt2, readString, readString2, parcel.readString(), z, z2, z3);
            }

            @Override // android.os.Parcelable.Creator
            public final ProfileServiceImpl.FavoriteVideoCollectionFragmentData[] newArray(int i) {
                return new ProfileServiceImpl.FavoriteVideoCollectionFragmentData[i];
            }
        };
        public final int awemeListType;
        public final int bottomBarHeight;
        public final boolean isMyProfile;
        public final boolean shouldRefreshOnInitData;
        public final boolean showCover;
        public final String suid;
        public final String tabName;
        public final String uid;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FavoriteVideoCollectionFragmentData)) {
                return false;
            }
            FavoriteVideoCollectionFragmentData favoriteVideoCollectionFragmentData = (FavoriteVideoCollectionFragmentData) obj;
            return this.bottomBarHeight == favoriteVideoCollectionFragmentData.bottomBarHeight && this.awemeListType == favoriteVideoCollectionFragmentData.awemeListType && o.LJ(this.uid, favoriteVideoCollectionFragmentData.uid) && o.LJ(this.suid, favoriteVideoCollectionFragmentData.suid) && this.isMyProfile == favoriteVideoCollectionFragmentData.isMyProfile && this.shouldRefreshOnInitData == favoriteVideoCollectionFragmentData.shouldRefreshOnInitData && this.showCover == favoriteVideoCollectionFragmentData.showCover && o.LJ(this.tabName, favoriteVideoCollectionFragmentData.tabName);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            out.writeInt(this.bottomBarHeight);
            out.writeInt(this.awemeListType);
            out.writeString(this.uid);
            out.writeString(this.suid);
            out.writeInt(this.isMyProfile ? 1 : 0);
            out.writeInt(this.shouldRefreshOnInitData ? 1 : 0);
            out.writeInt(this.showCover ? 1 : 0);
            out.writeString(this.tabName);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int hashCode;
            int LJ = C79062V1e.LJ(this.uid, ((this.bottomBarHeight * 31) + this.awemeListType) * 31, 31);
            String str = this.suid;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i = (LJ + hashCode) * 31;
            boolean z = this.isMyProfile;
            int i2 = 1;
            int i3 = z;
            if (z != 0) {
                i3 = 1;
            }
            int i4 = (i + i3) * 31;
            boolean z2 = this.shouldRefreshOnInitData;
            int i5 = z2;
            if (z2 != 0) {
                i5 = 1;
            }
            int i6 = (i4 + i5) * 31;
            if (!this.showCover) {
                i2 = 0;
            }
            return this.tabName.hashCode() + ((i6 + i2) * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FavoriteVideoCollectionFragmentData(bottomBarHeight=");
            LIZ.append(this.bottomBarHeight);
            LIZ.append(", awemeListType=");
            LIZ.append(this.awemeListType);
            LIZ.append(", uid=");
            LIZ.append(this.uid);
            LIZ.append(", suid=");
            LIZ.append(this.suid);
            LIZ.append(", isMyProfile=");
            LIZ.append(this.isMyProfile);
            LIZ.append(", shouldRefreshOnInitData=");
            LIZ.append(this.shouldRefreshOnInitData);
            LIZ.append(", showCover=");
            LIZ.append(this.showCover);
            LIZ.append(", tabName=");
            return q.LIZIZ(LIZ, this.tabName, ')', LIZ);
        }

        public FavoriteVideoCollectionFragmentData(int i, int i2, String uid, String str, String tabName, boolean z, boolean z2, boolean z3) {
            o.LJIIIZ(uid, "uid");
            o.LJIIIZ(tabName, "tabName");
            this.bottomBarHeight = i;
            this.awemeListType = i2;
            this.uid = uid;
            this.suid = str;
            this.isMyProfile = z;
            this.shouldRefreshOnInitData = z2;
            this.showCover = z3;
            this.tabName = tabName;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean enableShowFeatureVideoEntrance() {
        try {
            SettingsManager.LIZLLL().getClass();
            return SettingsManager.LIZ("show_feature_video_entrance", true);
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return true;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean getAdFakeUserProfileBugfixSetting() {
        try {
            SettingsManager.LIZLLL().getClass();
            return SettingsManager.LIZ("enable_ad_fake_user_profile_bugfix", true);
        } catch (Throwable unused) {
            return true;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl
    public final Class<? extends Fragment> getMyProfileClass() {
        return I18nMyProfileFragmentV2.class;
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final Class<? extends CommonPageFragment> getProfilePageFragmentClass() {
        return ProfilePageFragment.class;
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final InterfaceC65350Pko<? extends C8W0> getSocialActivityAssem() {
        return C65352Pkq.LIZ(SocialActivityAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final String getUserPermissionsPath() {
        return "/tiktok/user/permission/get/v1/";
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final Class<? extends Activity> profileActivityClz() {
        return ProfileEditActivity.class;
    }

    public static IProfileService LIZ() {
        Object LIZ = C58096Mr6.LIZ(IProfileService.class, false);
        if (LIZ != null) {
            return (IProfileService) LIZ;
        }
        return new ProfileServiceImpl();
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean canShowProfileFixedEntrance() {
        C26354AVy.LIZ.getClass();
        return C26354AVy.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean getAndResetPauseAvatarAnim() {
        boolean z = AUA.LJI;
        AUA.LJI = false;
        return z;
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final InterfaceC248539pB getAvatarPresenter() {
        return new AvatarPresenter();
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final AmeBaseFragment getI18nMyProfileFragmentV2() {
        return new I18nMyProfileFragmentV2();
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final AmeBaseFragment getI18nUserProfileFragmentV2() {
        return new I18nUserProfileFragmentV2();
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final IProfileAssemService getProfileAssemService() {
        return new IProfileAssemService() { // from class: X.9lW
            @Override // com.ss.android.ugc.aweme.profile.IProfileAssemService
            public final void changeTabFragments(C8W0 assem) {
                o.LJIIIZ(assem, "assem");
                InterfaceC235069Kk interfaceC235069Kk = (InterfaceC235069Kk) C8VC.LJFF(assem, C65352Pkq.LIZ(InterfaceC235069Kk.class), null);
                if (interfaceC235069Kk != null) {
                    interfaceC235069Kk.xg();
                }
            }

            @Override // com.ss.android.ugc.aweme.profile.IProfileAssemService
            public final void selectSubscribeProfileInfoServiceUserUpdateEvent(C8W0 assem, InterfaceC88472Yns<? super C43I<? extends User>, C76800UCe> observer) {
                o.LJIIIZ(assem, "assem");
                o.LJIIIZ(observer, "observer");
                C8VC.LJIIJJI(assem, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9lX
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C234999Kd) obj).LIZIZ;
                    }
                }, observer);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final AbstractC60117Nib getProfileBioLinkTitleBarProvider() {
        return new C59784NdE();
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final String getUserApi() {
        return UriProtector.parse(C251809uS.LIZ).buildUpon().toString();
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final EE1 getYoutubeRefreshTask() {
        return new YoutubeRefreshTask();
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl
    public final boolean hasLiveEventPermission() {
        return C19N.LJ("live_event_permission", false);
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean hasLiveEventPermissionSettings() {
        return C19N.LJ("live_event_permission", false);
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isProfileViewersEnable() {
        C26354AVy.LIZ.getClass();
        return C26354AVy.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void mobClickEnterProfileViewer() {
        C243119gR.LIZ(C227548wQ.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final AbstractC200747uI provideAwemeModel() {
        return new C55693LtR();
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final Fragment providePushSettingNotificationChoiceFragment() {
        return new PushSettingNotificationChoiceFragment();
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean shouldShowProfileViewerPushItem() {
        boolean z;
        boolean z2;
        Integer num;
        boolean z3;
        Boolean bool;
        C26354AVy.LIZ.getClass();
        boolean LIZIZ = C26354AVy.LIZIZ();
        ProfileViewersExpConfig profileViewersExpConfig = (ProfileViewersExpConfig) C26354AVy.LIZJ.getValue();
        if (profileViewersExpConfig != null && (bool = profileViewersExpConfig.profileViewersPushEnable) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        boolean z4 = true;
        if (LIZIZ && z) {
            z2 = true;
        } else {
            z2 = false;
        }
        IPrivacyService LJIIIIZZ = PrivacyServiceImpl.LJIIIIZZ();
        PrivacySettingsRestrictionItem LIZJ = LJIIIIZZ.LIZJ(0, "profile_view_history");
        Integer num2 = null;
        if (LIZJ != null) {
            num = Integer.valueOf(LIZJ.getShowType());
        } else {
            num = null;
        }
        PrivacyUserSettingsV2 privacyUserSettings = LJIIIIZZ.getPrivacyUserSettings();
        if (privacyUserSettings != null) {
            num2 = privacyUserSettings.M("profile_view_history");
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("profileViewerRestrictionShowType is ");
        LIZ.append(num);
        LIZ.append(" \n profileViewerSwitchStatus is ");
        LIZ.append(num2);
        LIZ.append("\ncanShowPushSettings is ");
        U26.LIZLLL(LIZ, z2, LIZ, "ProfileViewerHelper");
        if (num == null || num.intValue() != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (num2 == null || num2.intValue() != 1) {
            z4 = false;
        }
        if (!z2 || !z3 || !z4) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final String getLiveEventsUrl() {
        return C9N5.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final EE1 getProfilePageModelPreloadTask() {
        if (AXO.LIZ()) {
            return new ProfilePageModelPreloadTask();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean needShowBindPhoneNumberNotice() {
        if (C255199zv.LJIIL() && !C255199zv.LIZJ) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void removeAllCache() {
        PowerPreloadServiceImpl.LIZIZ().LIZ("/aweme/v1/user/profile/other/", null);
        PowerPreloadServiceImpl.LIZIZ().LIZ("/aweme/v1/aweme/post/", null);
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean showBubbleInCouponKeva() {
        return !C26132ANk.LIZ().LIZJ.getBoolean("show_bubble", true);
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean userNameLegitimate() {
        return C9NG.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final String getTabNameInGuideUserUtil() {
        return C255199zv.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isShowGuideCreateVideoInGuideUserUtil() {
        return C255199zv.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isTooltipInGuideUserUtil() {
        return C255199zv.LJFF;
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void checkAndRefreshUser(Fragment fragment) {
        if (fragment instanceof I18nMyProfileFragmentV2) {
            ((I18nMyProfileFragmentV2) fragment).xm(AWL.TAB_CHANGE);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final int getEnterpriseType(User user) {
        if (user == null) {
            return 0;
        }
        return user.getCommerceUserLevel();
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final String getUserPath(boolean z) {
        if (z) {
            return "/aweme/v1/user/profile/self/";
        }
        return "/aweme/v1/user/profile/other/";
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final int getViewRawBottomY(View view) {
        o.LJIIIZ(view, "view");
        return C1JI.LJIILIIL(view);
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isI18nMyProfileFragmentV2(Fragment fragment) {
        return fragment instanceof I18nMyProfileFragmentV2;
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isI18nUserProfileFragmentV2(Fragment fragment) {
        return fragment instanceof I18nUserProfileFragmentV2;
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isNotificationEnabled(Context context) {
        o.LJIIIZ(context, "context");
        return C40322Fs6.LIZJ(context);
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean isUserProfileFragment(Fragment fragment) {
        return fragment instanceof UserProfileFragment;
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void postDarkModeStatusEvent(boolean z) {
        C2U8.LIZ(new AGU());
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void queryProfileResponse(Handler handler) {
        o.LJIIIZ(handler, "handler");
        C251839uV.LIZ().getClass();
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        C251839uV.LIZJ(handler, C251809uS.LIZJ(0, Boolean.FALSE, ((RBX) HG3.LJIILL()).getCurSecUserId(), curUserId, null));
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void runYoutubeRefreshTask(Context context) {
        o.LJIIIZ(context, "context");
        new YoutubeRefreshTask().run(context);
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void setShownBarInCouponKeva(boolean z) {
        C26132ANk.LIZ().LIZIZ(z);
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void setShownBubbleInCouponKeva(boolean z) {
        C26132ANk LIZ = C26132ANk.LIZ();
        if (!z && LIZ.LIZJ.getBoolean("show_bubble", false)) {
            return;
        }
        LIZ.LIZJ.storeBoolean("show_bubble", z);
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void setShownStarInCouponKeva(boolean z) {
        C26132ANk LIZ = C26132ANk.LIZ();
        if (LIZ.LIZJ.getBoolean("show_star", false)) {
            return;
        }
        LIZ.LIZJ.storeBoolean("show_star", false);
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateFirstTimeInCouponKeva(JSONObject jSONObject) {
        C26132ANk LIZ = C26132ANk.LIZ();
        LIZ.getClass();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("updateFirstTime:");
        LIZ2.append(jSONObject.toString());
        X1D.LIZIZ(LIZ2);
        try {
            String string = JSONObjectProtectorUtils.getString(jSONObject, "activity_id");
            Date date = new Date();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("setFirstTime:");
            LIZ3.append(date.toString());
            LIZ3.append("activityId:");
            LIZ3.append(string);
            X1D.LIZIZ(LIZ3);
            LIZ.LIZJ.storeString(string, LIZ.LIZ.format(date));
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean checkIDLocal(String str, Context context) {
        o.LJIIIZ(str, "str");
        o.LJIIIZ(context, "context");
        return u.LIZJ(str, context);
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final String disLikeAweme(Aweme aweme, LinkData linkData) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(linkData, "linkData");
        String LIZIZ = AwemeApi.LIZIZ(aweme, C63077OpF.LIZ(aweme));
        o.LJIIIIZZ(LIZIZ, "disLikeAweme(aweme, Link…Cache.getLinkData(aweme))");
        return LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void disLikeAwemeApi(String awemeId, Map<String, String> map) {
        o.LJIIIZ(awemeId, "awemeId");
        AwemeApi.LIZJ(awemeId, map);
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final InterfaceC51123K4p getAsyncInflater(Activity activity, int i) {
        o.LJIIIZ(activity, "activity");
        return new L9Z(activity, i);
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final long getLastTimeShowPublishSuccessWindow(String userId, long j) {
        o.LJIIIZ(userId, "userId");
        KUN kun = C9NG.LIZ;
        return kun.LIZ.getLong(i0.LJFF("last_time_show_publish_success_window_", userId), 0L);
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void removeCacheByUser(String str, String str2) {
        boolean z;
        Integer secIdSwitch;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            linkedHashMap.put("sec_user_id", str);
            linkedHashMap.put("user_id", "");
            linkedHashMap.put("unique_id", "");
        } else if (str2 == null || str2.length() == 0) {
            C221018lt.LIZIZ("profile_preload", "both secUid and uid are null, unable to remove cache");
        } else {
            linkedHashMap.put("user_id", str2);
            linkedHashMap.put("sec_user_id", "");
            linkedHashMap.put("unique_id", "");
        }
        PowerPreloadServiceImpl.LIZIZ().LIZ("/aweme/v1/user/profile/other/", linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if ((str == null || str.length() == 0 || ((secIdSwitch = C2YJ.LIZIZ.LIZ.getSecIdSwitch()) != null && secIdSwitch.intValue() == 0)) && str2 != null && str2.length() != 0) {
            linkedHashMap2.put("user_id", str2);
            linkedHashMap2.put("sec_user_id", "");
        }
        if (str != null && str.length() != 0) {
            linkedHashMap2.put("sec_user_id", str);
            linkedHashMap2.put("user_id", "");
        }
        if (!linkedHashMap2.isEmpty()) {
            PowerPreloadServiceImpl.LIZIZ().LIZ("/aweme/v1/aweme/post/", linkedHashMap2);
        } else {
            C221018lt.LIZIZ("aweme_post_preload", "both secUid and uid are null, unable to remove cache");
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void setLastTimeShowPublishSuccessWindow(String userId, long j) {
        o.LJIIIZ(userId, "userId");
        long currentTimeMillis = System.currentTimeMillis();
        KUN kun = C9NG.LIZ;
        kun.LIZLLL().putLong(i0.LJFF("last_time_show_publish_success_window_", userId), currentTimeMillis).apply();
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean showCouponIconInCouponKeva(String activityId, int i) {
        o.LJIIIZ(activityId, "activityId");
        C26132ANk LIZ = C26132ANk.LIZ();
        String string = LIZ.LIZJ.getString(activityId, "");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("showCouponIcon,activityId:");
        LIZ2.append(activityId);
        X1D.LIZIZ(LIZ2);
        if (TextUtils.equals(string, "")) {
            return false;
        }
        try {
            if ((new Date().getTime() - LIZ.LIZ.parse(string).getTime()) / TimeUnit.DAYS.toMillis(1L) >= i) {
                return false;
            }
            return true;
        } catch (ParseException e) {
            C16880lQ.LLLLIIL(e);
            LIZ.LIZJ.storeString(activityId, "");
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void startHeaderDetailActivity(Activity activity, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        HeaderDetailActivity.LLIIIJ(activity, bundle);
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void startProfileEditActivity(Activity activity, Bundle bundle) {
        if (activity == null) {
            return;
        }
        if (bundle == null) {
            C16880lQ.LIZIZ(activity, new Intent(activity, (Class<?>) ProfileEditActivity.class));
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) ProfileEditActivity.class);
        intent.putExtras(bundle);
        C16880lQ.LIZIZ(activity, intent);
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void startProfileEditBioUrlActivity(Activity activity, String str) {
        if (activity == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//profile/edit_bio");
        buildRoute.withParam("bio_url", str);
        buildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateProfilePageFragmentParams(Fragment fragment, String str) {
        I18nUserProfileFragmentV2 i18nUserProfileFragmentV2;
        if ((fragment instanceof ProfilePageFragment) && (i18nUserProfileFragmentV2 = ((ProfilePageFragment) fragment).LJLILLLLZI) != null) {
            i18nUserProfileFragmentV2.LJJIJ(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final String disLikeAweme(Aweme aweme, int i, String commitType) {
        o.LJIIIZ(commitType, "commitType");
        return AwemeApi.LIZ(aweme, i, commitType);
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final Drawable getEaseInOutGradientDrawable(float f, int i, boolean z) {
        float f2;
        if (z) {
            if (((Boolean) C26360AWe.LIZIZ.getValue()).booleanValue()) {
                int intValue = ((Number) C26360AWe.LIZ.getValue()).intValue();
                if (intValue != 2) {
                    if (intValue != 3) {
                        f2 = 0.5f;
                    } else {
                        f2 = 0.15f;
                    }
                } else {
                    f2 = 0.3f;
                }
                Integer VIDEO_MASK_BASE_COLOR = MFV.LLIIJI;
                o.LJIIIIZZ(VIDEO_MASK_BASE_COLOR, "VIDEO_MASK_BASE_COLOR");
                return AnonymousClass949.LIZ(f2, VIDEO_MASK_BASE_COLOR.intValue());
            }
            return C04270Et.LIZIZ(EF7.LIZIZ(), R.drawable.bze);
        }
        return AnonymousClass949.LIZ(f, i);
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final AbstractC186377Td getVideoCollectionFavoriteTab(Context context, int i, Boolean bool) {
        int i2;
        o.LJIIIZ(context, "context");
        if (C8SG.LIZIZ.LJJIFFI()) {
            i2 = R.string.jlh;
        } else {
            i2 = R.string.dgr;
        }
        String it = context.getString(i2);
        if (!o.LJ(it, "video")) {
            StringBuilder LIZ = X1D.LIZ();
            o.LJIIIIZZ(it, "it");
            String substring = it.substring(0, 1);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Locale ROOT = Locale.ROOT;
            o.LJIIIIZZ(ROOT, "ROOT");
            String upperCase = substring.toUpperCase(ROOT);
            o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(locale)");
            LIZ.append(upperCase);
            String substring2 = it.substring(1);
            o.LJIIIIZZ(substring2, "this as java.lang.String).substring(startIndex)");
            o.LJIIIIZZ(ROOT, "ROOT");
            String lowerCase = substring2.toLowerCase(ROOT);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            LIZ.append(lowerCase);
            it = X1D.LIZIZ(LIZ);
        } else {
            o.LJIIIIZZ(it, "it");
        }
        return new C213898aP(this, i, bool, it, context);
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final AbstractC186347Ta getVideoCollectionFavoriteTabV2(final Context context, final int i, final Boolean bool) {
        int i2;
        o.LJIIIZ(context, "context");
        if (C8SG.LIZIZ.LJJIFFI()) {
            i2 = R.string.jlh;
        } else {
            i2 = R.string.dgr;
        }
        final String it = context.getString(i2);
        if (!o.LJ(it, "video")) {
            StringBuilder LIZ = X1D.LIZ();
            o.LJIIIIZZ(it, "it");
            String substring = it.substring(0, 1);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Locale ROOT = Locale.ROOT;
            o.LJIIIIZZ(ROOT, "ROOT");
            String upperCase = substring.toUpperCase(ROOT);
            o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(locale)");
            LIZ.append(upperCase);
            String substring2 = it.substring(1);
            o.LJIIIIZZ(substring2, "this as java.lang.String).substring(startIndex)");
            o.LJIIIIZZ(ROOT, "ROOT");
            String lowerCase = substring2.toLowerCase(ROOT);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            LIZ.append(lowerCase);
            it = X1D.LIZIZ(LIZ);
        } else {
            o.LJIIIIZZ(it, "it");
        }
        return new AbstractC186347Ta(i, bool, it, context) { // from class: X.8Zf
            public final C213448Zg LJLILLLLZI = new C213448Zg(this);
            public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 797));
            public final FavoriteTabItemV2 LJLJJI;

            @Override // X.AbstractC186347Ta
            public final FavoriteTabItemV2 LIZ() {
                return this.LJLJJI;
            }

            @Override // X.AbstractC186347Ta
            public final void LIZJ(Lifecycle.Event event) {
                o.LJIIIZ(event, "event");
                super.LIZJ(event);
                if (C52535Kjb.LIZ()) {
                    int i3 = C213468Zi.LIZ[event.ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            return;
                        }
                        if (C52535Kjb.LIZIZ()) {
                            AwemeCollectionAgent.LJIILLIIL().LIZJ(this.LJLILLLLZI);
                            return;
                        } else {
                            AwemeCollectionAgent.LJIILLIIL().LJIIIIZZ((C213458Zh) this.LJLJI.getValue());
                            return;
                        }
                    }
                    if (C52535Kjb.LIZIZ()) {
                        AwemeCollectionAgent.LJIILLIIL().LJFF(this.LJLILLLLZI);
                    } else {
                        AwemeCollectionAgent.LJIILLIIL().LJI((C213458Zh) this.LJLJI.getValue());
                    }
                }
            }

            @QD3(threadMode = ThreadMode.MAIN)
            public final void onVideoCollect(C193087hw ev) {
                o.LJIIIZ(ev, "ev");
                if (ev.LJLILLLLZI == 1) {
                    LIZLLL(this.LJLIL);
                } else {
                    LIZIZ(this.LJLIL);
                }
            }

            {
                boolean z;
                String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
                o.LJIIIIZZ(curUserId, "userService().curUserId");
                String curSecUserId = ((RBX) HG3.LJIILL()).getCurSecUserId();
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = false;
                }
                this.LJLJJI = new FavoriteTabItemV2(new ProfileServiceImpl.FavoriteVideoCollectionFragmentData(i, 4, curUserId, curSecUserId, C79234V7u.LJIJI(8), z, true, true), it, "video", "videos", context.getString(R.string.gap));
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void queryProfileWithId(Handler handler, String str, int i) {
        C251839uV.LIZ().getClass();
        String LIZJ = C251809uS.LIZJ(i, Boolean.TRUE, null, str, null);
        C3EA.LIZ(LIZJ);
        FGR.LIZIZ().LIZ(handler, new ACallableS82S0101000_11(2, LIZJ, 1), 0);
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void queryUserResponse(String url, boolean z, String isPreload) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(isPreload, "isPreload");
        C251809uS.LIZIZ(null, url, isPreload, z);
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void requestUser(String str, String str2, final InterfaceC251799uR interfaceC251799uR) {
        C251759uN c251759uN = new C251759uN() { // from class: X.9uQ
            @Override // X.C8BR, X.C8BT
            public final void onSuccess() {
                UserResponse userResponse = (UserResponse) this.LJLIL.getData();
                if (userResponse == null) {
                    InterfaceC251799uR interfaceC251799uR2 = InterfaceC251799uR.this;
                    if (interfaceC251799uR2 != null) {
                        interfaceC251799uR2.LIZ(null);
                        return;
                    }
                    return;
                }
                User user = userResponse.getUser();
                InterfaceC251799uR interfaceC251799uR3 = InterfaceC251799uR.this;
                if (interfaceC251799uR3 != null) {
                    interfaceC251799uR3.LIZ(user);
                }
            }

            @Override // X.C251759uN, X.C8BR, X.C8BT
            public final void onFailed(Exception e) {
                o.LJIIIZ(e, "e");
                InterfaceC251799uR interfaceC251799uR2 = InterfaceC251799uR.this;
                if (interfaceC251799uR2 != null) {
                    interfaceC251799uR2.onFailed(e);
                }
                super.onFailed(e);
            }
        };
        c251759uN.LJJ(new C251769uO(c251759uN));
        c251759uN.LJIILL(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void showCheckMultiAccountBottomSheet(FragmentManager fm, AV9 av9, String tag) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(tag, "tag");
        ASL asl = new ASL();
        CheckAccountBottomSheetFragment checkAccountBottomSheetFragment = new CheckAccountBottomSheetFragment();
        Bundle bundle = new Bundle();
        if (av9 != null) {
            bundle.putString("enter_from", av9.LIZ);
            bundle.putString("enter_method", av9.LIZIZ);
        }
        checkAccountBottomSheetFragment.setArguments(bundle);
        asl.LIZ.LJLLILLLL = checkAccountBottomSheetFragment;
        asl.LJI(1);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLJ = true;
        tuxSheet.LJZI = false;
        tuxSheet.show(fm, tag);
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateCoverIfMyProfileVisible(ActivityC45651qj activity, String aid, Aweme aweme) {
        Fragment fragment;
        HomeTabAbility LJIL;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(aid, "aid");
        o.LJIIIZ(aweme, "aweme");
        MainActivityScope LJJLIIIJJI = C78866UxK.LJJLIIIJJI(activity);
        if (LJJLIIIJJI != null && (LJIL = C87277YNd.LJIL(LJJLIIIJJI)) != null) {
            fragment = LJIL.QU();
        } else {
            fragment = null;
        }
        if (fragment instanceof I18nMyProfileFragmentV2) {
            I18nMyProfileFragmentV2 i18nMyProfileFragmentV2 = (I18nMyProfileFragmentV2) fragment;
            if (!i18nMyProfileFragmentV2.isVisible()) {
                return;
            }
            i18nMyProfileFragmentV2.Em(aid, aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateProfilePageFragmentParams(Fragment fragment, String str, boolean z) {
        LKQ lkq;
        Fragment fragment2;
        if (fragment instanceof ProfilePageFragment) {
            ProfilePageFragment profilePageFragment = (ProfilePageFragment) fragment;
            profilePageFragment.LLD = str;
            LKQ lkq2 = profilePageFragment.LLII;
            if (lkq2 != null) {
                lkq2.LIZLLL(str);
                if (C40471FuV.LIZ() && !TextUtils.equals(str, "scroll_to_slide") && !TextUtils.equals(str, "click_top_icon") && (fragment2 = (lkq = profilePageFragment.LLII).LJFF) != null && !fragment2.isHidden() && lkq.LJII) {
                    profilePageFragment.o9();
                }
            }
            String str2 = profilePageFragment.LJLL;
            str2.getClass();
            if (!str2.equals("page_user_fragment")) {
                if (str2.equals("page_fake_user_fragment")) {
                    AObjectS46S0101000_15 aObjectS46S0101000_15 = new AObjectS46S0101000_15(1, str, 0);
                    Object Il = profilePageFragment.Il(AW4.class, "page_fake_user_fragment");
                    if (Il != null) {
                        aObjectS46S0101000_15.invoke(Il);
                    }
                }
            } else {
                I18nUserProfileFragmentV2 i18nUserProfileFragmentV2 = profilePageFragment.LJLILLLLZI;
                if (i18nUserProfileFragmentV2 != null) {
                    i18nUserProfileFragmentV2.LJJLL(str);
                }
            }
            if (z) {
                profilePageFragment.LJLLL = "main_head";
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final boolean checkIDNet(String status, String errorMsg, String str, Context context) {
        o.LJIIIZ(status, "status");
        o.LJIIIZ(errorMsg, "errorMsg");
        o.LJIIIZ(str, "str");
        o.LJIIIZ(context, "context");
        return u.LIZLLL(status, errorMsg, str, context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b2, code lost:
    
        if (r12 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ad, code lost:
    
        if (r12 != null) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void preloadProfileInfoAndAwemePost(com.ss.android.ugc.aweme.feed.model.Aweme r12, final java.lang.Integer r13, final int r14, final java.lang.String r15) {
        /*
            r11 = this;
            r2 = 0
            if (r12 == 0) goto Lac
            com.ss.android.ugc.aweme.profile.model.User r0 = r12.getAuthor()
            if (r0 == 0) goto Lac
            java.lang.String r10 = r0.getSecUid()
        Ld:
            com.ss.android.ugc.aweme.profile.model.User r0 = r12.getAuthor()
            if (r0 == 0) goto Lb1
            java.lang.String r9 = r0.getUid()
        L17:
            com.ss.android.ugc.aweme.profile.model.User r0 = r12.getAuthor()
            if (r0 == 0) goto Lb6
            java.lang.String r4 = r0.getUniqueId()
        L21:
            X.2YJ r3 = X.C2YJ.LIZIZ
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r0 = r3.LIZ
            java.lang.Integer r0 = r0.getSecIdSwitch()
            r1 = 0
            if (r0 != 0) goto L9a
        L2c:
            if (r10 == 0) goto L34
            int r0 = r10.length()
            if (r0 != 0) goto L93
        L34:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.String r5 = X.C251809uS.LIZJ(r1, r0, r2, r9, r4)
        L3a:
            java.lang.String r0 = "{\n            // 开关打开进行判…)\n            }\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)
        L3f:
            X.Ol8 r4 = X.C778133p.LIZIZ
            java.lang.Object r0 = r4.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r6 = r14
            r8 = r15
            r7 = r13
            if (r0 != 0) goto L85
        L50:
            if (r10 == 0) goto L58
            int r0 = r10.length()
            if (r0 != 0) goto L74
        L58:
        L59:
            java.lang.Object r0 = r4.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L66
        L65:
            return
        L66:
            X.79g r5 = new X.79g
            r5.<init>()
            X.X8e r0 = X.C84339X8d.LIZJ
            r0.getClass()
            X.C84340X8e.LIZIZ(r5)
            goto L65
        L74:
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r0 = r3.LIZ
            java.lang.Integer r0 = r0.getSecIdSwitch()
            if (r0 != 0) goto L7e
        L7c:
            r9 = r2
            goto L58
        L7e:
            int r0 = r0.intValue()
            if (r0 != 0) goto L7c
            goto L58
        L85:
            X.79f r1 = new X.79f
            r1.<init>()
            X.X8e r0 = X.C84339X8d.LIZJ
            r0.getClass()
            X.C84340X8e.LIZIZ(r1)
            goto L50
        L93:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.String r5 = X.C251809uS.LIZJ(r1, r0, r10, r2, r2)
            goto L3a
        L9a:
            int r0 = r0.intValue()
            if (r0 != 0) goto L2c
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.String r5 = X.C251809uS.LIZJ(r1, r0, r10, r9, r4)
            java.lang.String r0 = "{\n            // 开关关闭，同时…i.OTHERS, true)\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)
            goto L3f
        Lac:
            r10 = r2
            if (r12 == 0) goto Lb1
            goto Ld
        Lb1:
            r9 = r2
            if (r12 == 0) goto Lb6
            goto L17
        Lb6:
            r4 = r2
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ProfileServiceImpl.preloadProfileInfoAndAwemePost(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Integer, int, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void startHeaderDetailActivity(android.app.Activity r11, android.view.View r12, com.ss.android.ugc.aweme.profile.model.User r13, boolean r14) {
        /*
            r10 = this;
            java.lang.String r0 = "user"
            r5 = r13
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = X.AV1.LJ(r5)
            boolean r0 = X.C79043V0l.LJJI(r5, r3)
            if (r0 == 0) goto L37
        L11:
            if (r3 == 0) goto L53
        L13:
            java.util.List r0 = r3.getUrlList()
            boolean r0 = X.C38891fp.LJJIFFI(r0)
            if (r0 == 0) goto L53
            java.util.List r0 = r3.getUrlList()
            int r2 = r0.size()
            java.lang.String[] r9 = new java.lang.String[r2]
            r1 = 0
        L28:
            if (r1 >= r2) goto L43
            java.util.List r0 = r3.getUrlList()
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r1)
            r9[r1] = r0
            int r1 = r1 + 1
            goto L28
        L37:
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = X.AV1.LJIIJ(r5)
            if (r3 == 0) goto L3e
            goto L13
        L3e:
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = X.AV1.LJ(r5)
            goto L11
        L43:
            r4 = 1065353216(0x3f800000, float:1.0)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r5.getAvatarVideoUri()
            if (r0 != r3) goto L54
            r7 = 1
        L4c:
            r8 = 0
            r3 = r12
            r2 = r11
            r6 = r14
            com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity.LLIIIZ(r2, r3, r4, r5, r6, r7, r8, r9)
        L53:
            return
        L54:
            r7 = 0
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ProfileServiceImpl.startHeaderDetailActivity(android.app.Activity, android.view.View, com.ss.android.ugc.aweme.profile.model.User, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl
    public final void startHeaderDetailActivity(Activity activity, View view, float f, String... uri) {
        o.LJIIIZ(uri, "uri");
        HeaderDetailActivity.LLIIIZ(activity, view, f, null, false, false, null, (String[]) Arrays.copyOf(uri, uri.length));
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl
    public final InterfaceC26353AVx newProfileTagLayoutManager(LinearLayout profileTagContainer, int i, boolean z, boolean z2, boolean z3) {
        o.LJIIIZ(profileTagContainer, "profileTagContainer");
        return new C26348AVs(profileTagContainer, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void startHeaderDetailActivity(android.app.Activity r7, android.view.View r8, com.ss.android.ugc.aweme.profile.model.User r9, boolean r10, boolean r11) {
        /*
            r6 = this;
            java.lang.String r0 = "user"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = X.AV1.LJ(r9)
            boolean r0 = X.C79043V0l.LJJI(r9, r5)
            if (r0 == 0) goto L37
        L10:
            if (r5 == 0) goto L74
        L12:
            java.util.List r0 = r5.getUrlList()
            boolean r0 = X.C38891fp.LJJIFFI(r0)
            if (r0 == 0) goto L74
            java.util.List r0 = r5.getUrlList()
            int r2 = r0.size()
            java.lang.String[] r4 = new java.lang.String[r2]
            r3 = 0
            r1 = 0
        L28:
            if (r1 >= r2) goto L43
            java.util.List r0 = r5.getUrlList()
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r1)
            r4[r1] = r0
            int r1 = r1 + 1
            goto L28
        L37:
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = X.AV1.LJIIJ(r9)
            if (r5 == 0) goto L3e
            goto L12
        L3e:
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = X.AV1.LJ(r9)
            goto L10
        L43:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            com.ss.android.ugc.aweme.utils.ZoomAnimationUtils$ZoomInfo r1 = com.ss.android.ugc.aweme.utils.ZoomAnimationUtils.LIZ(r8)
            java.lang.String r0 = "extra_zoom_info"
            r2.putParcelable(r0, r1)
            java.lang.String r0 = "uri"
            r2.putStringArray(r0, r4)
            java.lang.String r0 = "enable_edit_img"
            r2.putBoolean(r0, r11)
            java.lang.String r1 = "wh_ratio"
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.putFloat(r1, r0)
            java.lang.String r0 = "enable_download_img"
            r2.putBoolean(r0, r10)
            java.lang.String r0 = "handle_with_video_avatar"
            r2.putBoolean(r0, r3)
            java.lang.String r0 = "share_info"
            r2.putSerializable(r0, r9)
            com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity.LLIIIJ(r7, r2)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ProfileServiceImpl.startHeaderDetailActivity(android.app.Activity, android.view.View, com.ss.android.ugc.aweme.profile.model.User, boolean, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void showInChooseAccountBottomSheet(FragmentManager fm, AV9 av9, String tag, Bundle bundle, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnCancelListener onCancelListener) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(tag, "tag");
        AV6.LIZ(fm, av9, tag, bundle, onDismissListener, onCancelListener);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.9iP] */
    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void updateSavePostChoose(final Activity activity, String realEnterMethod, AvatarUri avatarUri, String avatarSource, final InterfaceC65784Pro<C76800UCe> updateSuccess, final InterfaceC88472Yns<? super Exception, C76800UCe> updateFail) {
        o.LJIIIZ(realEnterMethod, "realEnterMethod");
        o.LJIIIZ(avatarUri, "avatarUri");
        o.LJIIIZ(avatarSource, "avatarSource");
        o.LJIIIZ(updateSuccess, "updateSuccess");
        o.LJIIIZ(updateFail, "updateFail");
        C244329iO c244329iO = new C244329iO(realEnterMethod, C9WB.PHOTO_AVATAR);
        c244329iO.LIZLLL = "checked";
        C244309iM.LJ(new C244319iN(c244329iO));
        HashMap hashMap = new HashMap();
        String str = avatarUri.uri;
        o.LJIIIIZZ(str, "avatarUri.uri");
        hashMap.put("avatar_uri", str);
        hashMap.put("avatar_source", avatarSource);
        ((RBX) HG3.LJIILL()).updateUserInfo(new HandlerC26188APo(activity, new InterfaceC26189APp() { // from class: X.9iP
            @Override // X.InterfaceC26189APp
            public final void FI(boolean z) {
            }

            @Override // X.InterfaceC26189APp
            public final void vb0(String str2, boolean z) {
            }

            @Override // X.InterfaceC26189APp
            public final void Pp0(User user, int i) {
                updateSuccess.invoke();
            }

            @Override // X.InterfaceC26189APp
            public final void Xa(Exception exc, int i) {
                String str2;
                Activity activity2 = activity;
                if (activity2 != null) {
                    AnonymousClass114.LIZ(activity2, R.string.dto);
                }
                if (exc != null) {
                    str2 = exc.getMessage();
                } else {
                    str2 = null;
                }
                C78598Ut0.LJIIZILJ(str2, "stage: edit_page_post_to_story result: user update fail");
                if (exc != null) {
                    C16880lQ.LLLLIIL(exc);
                }
                updateFail.invoke(exc);
            }
        }), hashMap);
        C86179Xrz.LIZ(true);
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl
    public final AwemeListFragment newAwemeListFragment(int i, int i2, String uid, String str, boolean z, boolean z2, Bundle args) {
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(args, "args");
        return MTAwemeListFragment.Vm(i, i2, uid, str, z, false, false, args);
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final YFI getMTAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2, boolean z3, Bundle bundle) {
        return MTAwemeListFragment.Vm(i, i2, str, str2, z, z2, z3, new Bundle());
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void startHeaderDetailActivity(Activity activity, View view, float f, User user, boolean z, boolean z2, Challenge challenge, String... uri) {
        o.LJIIIZ(uri, "uri");
        HeaderDetailActivity.LLIIIZ(activity, view, f, user, z, false, challenge, (String[]) Arrays.copyOf(uri, uri.length));
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void queryAwemeWithID(boolean z, String id, String secUid, int i, long j, int i2, String preloadKey, int i3, int i4) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(secUid, "secUid");
        o.LJIIIZ(preloadKey, "preloadKey");
        AwemeApi.LJ(z, id, secUid, i, j, i2, preloadKey, 0, 0, null, new F30(), false, "");
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void gotoCrop(Fragment fragment, String originalUrl, boolean z, float f, int i, int i2, int i3, int i4, int i5, Bundle bundle) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(originalUrl, "originalUrl");
        SmartRoute buildFragmentRoute = SmartRouter.buildFragmentRoute(fragment, "//profile/crop");
        buildFragmentRoute.withParam("original_url", originalUrl);
        buildFragmentRoute.withParam("is_oval", z);
        buildFragmentRoute.withParam("rect_ratio", f);
        buildFragmentRoute.withParam("rect_margin", i);
        buildFragmentRoute.withParam("extra_min_width", i3);
        buildFragmentRoute.withParam("extra_min_height", i4);
        buildFragmentRoute.withParam("extra_source_type", i5);
        buildFragmentRoute.withParam(bundle);
        buildFragmentRoute.open(i2);
    }

    @Override // com.ss.android.ugc.aweme.profile.BaseProfileServiceImpl, com.ss.android.ugc.aweme.profile.IProfileService
    public final void gotoCrop(Activity activity, String originalUrl, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(originalUrl, "originalUrl");
        C26347AVr.LIZIZ(activity, originalUrl, z, f, i, i2, i3, i4, i5, z2, bundle);
    }
}
