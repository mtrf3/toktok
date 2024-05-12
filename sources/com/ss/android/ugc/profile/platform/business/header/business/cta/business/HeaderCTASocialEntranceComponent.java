package com.ss.android.ugc.profile.platform.business.header.business.cta.business;

import X.C113554cx;
import X.C17J;
import X.C234589Io;
import X.C237429Tm;
import X.C243799hX;
import X.C243819hZ;
import X.C243839hb;
import X.C55096Ljo;
import X.C9IL;
import X.C9J4;
import X.C9J5;
import X.C9PM;
import X.EnumC234309Hm;
import X.HG3;
import X.ORZ;
import X.RBX;
import android.view.View;
import com.google.gson.m;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility;
import com.ss.android.ugc.aweme.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.profile.platform.base.data.Icon;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.data.SocialEntranceData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class HeaderCTASocialEntranceComponent extends HeaderCTABaseUIComponent {
    public SocialEntranceData LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public Map<Integer, C243819hZ> LJLIL = C113554cx.LJJJLIIL();

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent
    public final Integer componentIcon() {
        Icon icon;
        Integer iconInt$default;
        SocialEntranceData socialEntranceData = this.LJLILLLLZI;
        int i = R.raw.icon_instagram;
        if (socialEntranceData != null && (icon = socialEntranceData.getIcon()) != null && (iconInt$default = Icon.getIconInt$default(icon, null, Integer.valueOf(R.raw.icon_instagram), 1, null)) != null) {
            i = iconInt$default.intValue();
        }
        return Integer.valueOf(i);
    }

    public final boolean L7() {
        ProfileBaseAbility profileBaseAbility = (ProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileBaseAbility.class, null);
        if (profileBaseAbility != null) {
            return profileBaseAbility.L7();
        }
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void actionsBeforeUpdateUI() {
        ProfilePlatformViewModel profilePlatformVM;
        if (!L7() && (profilePlatformVM = getProfilePlatformVM()) != null) {
            profilePlatformVM.ov0(new AqS170S0100000_4(this, 1060));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void addComponentToParent() {
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderCTAAbility.tW(this.index + 1, str);
        }
    }

    public final User getCurUser() {
        if (L7()) {
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

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void updateComponentUIAndData() {
        String str;
        UserProfileInfo userProfileInfo;
        String str2;
        C9PM state;
        C9PM state2;
        String str3;
        if (!shouldShowAfterDoubleCheck()) {
            requestHide();
            return;
        }
        if (!this._isViewValid || this.LJLILLLLZI == null) {
            requestHide();
            return;
        }
        if (L7()) {
            str = ((RBX) HG3.LJIILL()).getCurUserId();
        } else {
            ProfileCommonInfo commonInfo = getCommonInfo();
            if (commonInfo != null && (userProfileInfo = commonInfo.getUserProfileInfo()) != null) {
                str = userProfileInfo.getUid();
            } else {
                str = null;
            }
        }
        String str4 = "";
        if (L7()) {
            str2 = "";
        } else {
            ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
            if (profilePlatformVM != null && (state = profilePlatformVM.getState()) != null) {
                str2 = state.LLF;
            } else {
                str2 = null;
            }
        }
        String LJJ = C17J.LJJ(this, L7());
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        ProfilePlatformViewModel profilePlatformVM2 = getProfilePlatformVM();
        if (profilePlatformVM2 != null && (state2 = profilePlatformVM2.getState()) != null && (str3 = state2.LJZL) != null) {
            str4 = str3;
        }
        C243839hb c243839hb = new C243839hb(LJJ, str, str2, str4);
        if (this.LJLIL.isEmpty()) {
            requestHide();
            return;
        }
        C243799hX.LJII(this.LJLIL.keySet(), new C9J5(this), new C9J4(this));
        HeaderCTABaseUIComponent.updateClickFunc$default(this, null, new AqS151S0200000_4(this, c243839hb, 40), 1, null);
        boolean L7 = L7();
        C9IL c9il = C9IL.CTA;
        Locale locale = Locale.ROOT;
        String lowerCase = "HAS_TWITTER_FUNCTION".toLowerCase(locale);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        C17J.LJIILLIIL(this, L7, c9il, lowerCase, this.LJLIL.containsKey(3));
        boolean L72 = L7();
        String lowerCase2 = "HAS_YOUTUBE_FUNCTION".toLowerCase(locale);
        o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        C17J.LJIILLIIL(this, L72, c9il, lowerCase2, this.LJLIL.containsKey(2));
        boolean L73 = L7();
        String lowerCase3 = "HAS_INSTAGRAM_FUNCTION".toLowerCase(locale);
        o.LJIIIIZZ(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        C17J.LJIILLIIL(this, L73, c9il, lowerCase3, this.LJLIL.containsKey(1));
        if (this.LJLIL.size() > 1) {
            boolean L74 = L7();
            String lowerCase4 = "HAS_SOCIAL_BUTTON".toLowerCase(locale);
            o.LJIIIIZZ(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            C17J.LJIILLIIL(this, L74, c9il, lowerCase4, true);
        }
        requestShow();
        User curUser = getCurUser();
        if (curUser == null) {
            return;
        }
        updateActionList(ORZ.LLJILJILJ(C243799hX.LIZ(getContext(), curUser, c243839hb, this.LJLIL)));
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent
    public final EnumC234309Hm componentStyle() {
        return EnumC234309Hm.ICON;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void parseComponentBizData(m jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
        if (!shouldShowAfterDoubleCheck()) {
            requestHide();
            return;
        }
        SocialEntranceData socialEntranceData = (SocialEntranceData) C237429Tm.LIZ(jsonObject.toString(), SocialEntranceData.class);
        this.LJLILLLLZI = socialEntranceData;
        this.LJLIL = C243799hX.LIZIZ(socialEntranceData);
    }
}
