package com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business;

import X.C113554cx;
import X.C17J;
import X.C234589Io;
import X.C243799hX;
import X.C243819hZ;
import X.C243839hb;
import X.C44384HbQ;
import X.C55096Ljo;
import X.C75792yF;
import X.C87059YEt;
import X.C9J3;
import X.C9J7;
import X.C9PM;
import X.HG3;
import X.OSZ;
import X.RBX;
import Y.ACListenerS39S0200000_4;
import android.view.View;
import com.google.gson.m;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.data.SocialConnect;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.data.SocialEntranceData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileAdvancedFeatureSocialConnectComponent extends HeaderAdvancedFeatureBaseUIComponent {
    public SocialEntranceData LJLJLJ;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public Map<Integer, C243819hZ> LJLJLLL = C113554cx.LJJJLIIL();

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent
    public final Map<String, Boolean> x3() {
        boolean z;
        boolean z2;
        boolean z3;
        OSZ[] oszArr = new OSZ[4];
        Locale locale = Locale.ROOT;
        String lowerCase = "HAS_TWITTER_FUNCTION".toLowerCase(locale);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        boolean z4 = true;
        if (this.LJLJJI && this.LJLJLLL.containsKey(3)) {
            z = true;
        } else {
            z = false;
        }
        oszArr[0] = new OSZ(lowerCase, Boolean.valueOf(z));
        String lowerCase2 = "HAS_YOUTUBE_FUNCTION".toLowerCase(locale);
        o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (this.LJLJJI && this.LJLJLLL.containsKey(2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        oszArr[1] = new OSZ(lowerCase2, Boolean.valueOf(z2));
        String lowerCase3 = "HAS_INSTAGRAM_FUNCTION".toLowerCase(locale);
        o.LJIIIIZZ(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (this.LJLJJI && this.LJLJLLL.containsKey(1)) {
            z3 = true;
        } else {
            z3 = false;
        }
        oszArr[2] = new OSZ(lowerCase3, Boolean.valueOf(z3));
        String lowerCase4 = "HAS_SOCIAL_BUTTON".toLowerCase(locale);
        o.LJIIIIZZ(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (!this.LJLJJI || this.LJLJLLL.size() <= 1) {
            z4 = false;
        }
        oszArr[3] = new OSZ(lowerCase4, Boolean.valueOf(z4));
        return C113554cx.LJJL(oszArr);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent
    public final Integer componentIcon() {
        return Integer.valueOf(R.raw.icon_instagram);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent
    public final String componentText() {
        return C44384HbQ.LJJZ(R.string.hhy);
    }

    public final User getCurUser() {
        if (A3()) {
            return HG3.LJIILL().getCurUser();
        }
        UserProfileAbility userProfileAbility = (UserProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), UserProfileAbility.class, null);
        if (userProfileAbility == null) {
            return null;
        }
        return userProfileAbility.getUser();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final boolean shouldShowAfterDoubleCheck() {
        if (C234589Io.LIZ()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void updateComponentUIAndData() {
        String str;
        UserProfileInfo userProfileInfo;
        C87059YEt Qd;
        Aweme aweme;
        C9PM state;
        String str2;
        String str3;
        String str4;
        String str5;
        SocialConnect socialConnect;
        SocialConnect socialConnect2;
        SocialConnect socialConnect3;
        User curUser = getCurUser();
        String str6 = null;
        if (curUser != null) {
            SocialEntranceData socialEntranceData = this.LJLJLJ;
            if (socialEntranceData != null && (socialConnect3 = socialEntranceData.getSocialConnect()) != null) {
                str3 = socialConnect3.getTwitterId();
            } else {
                str3 = null;
            }
            curUser.setTwitterId(str3);
            SocialEntranceData socialEntranceData2 = this.LJLJLJ;
            if (socialEntranceData2 != null && (socialConnect2 = socialEntranceData2.getSocialConnect()) != null) {
                str4 = socialConnect2.getYoutubeChannelId();
            } else {
                str4 = null;
            }
            curUser.setYoutubeChannelId(str4);
            SocialEntranceData socialEntranceData3 = this.LJLJLJ;
            if (socialEntranceData3 != null && (socialConnect = socialEntranceData3.getSocialConnect()) != null) {
                str5 = socialConnect.getInsId();
            } else {
                str5 = null;
            }
            curUser.setInsId(str5);
        }
        if (!shouldShowAfterDoubleCheck()) {
            C3(false);
            return;
        }
        if (!this._isViewValid || this.LJLJLJ == null) {
            C3(false);
            return;
        }
        if (A3()) {
            str = ((RBX) HG3.LJIILL()).getCurUserId();
        } else {
            ProfileCommonInfo commonInfo = getCommonInfo();
            if (commonInfo != null && (userProfileInfo = commonInfo.getUserProfileInfo()) != null) {
                str = userProfileInfo.getUid();
            } else {
                str = null;
            }
        }
        String str7 = "";
        if (A3()) {
            str6 = "";
        } else {
            UserProfileAbility userProfileAbility = (UserProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), UserProfileAbility.class, null);
            if (userProfileAbility != null && (Qd = userProfileAbility.Qd()) != null && (aweme = Qd.LIZJ) != null) {
                str6 = aweme.getAid();
            }
        }
        String LJJ = C17J.LJJ(this, A3());
        if (str == null) {
            str = "";
        }
        if (str6 == null) {
            str6 = "";
        }
        ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
        if (profilePlatformVM != null && (state = profilePlatformVM.getState()) != null && (str2 = state.LJZL) != null) {
            str7 = str2;
        }
        C243839hb c243839hb = new C243839hb(LJJ, str, str6, str7);
        if (this.LJLJLLL.isEmpty()) {
            C3(false);
            return;
        }
        C243799hX.LJII(this.LJLJLLL.keySet(), new C9J3(this), new C9J7(this));
        E3(new ACListenerS39S0200000_4(this, c243839hb, 40));
        requestShow();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void parseComponentBizData(m jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
        SocialEntranceData socialEntranceData = (SocialEntranceData) C75792yF.LIZ(jsonObject.toString(), SocialEntranceData.class);
        this.LJLJLJ = socialEntranceData;
        this.LJLJLLL = C243799hX.LIZIZ(socialEntranceData);
    }
}
