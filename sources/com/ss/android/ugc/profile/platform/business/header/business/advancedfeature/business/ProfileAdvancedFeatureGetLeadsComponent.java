package com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business;

import X.C0DC;
import X.C188727au;
import X.C237429Tm;
import X.C44384HbQ;
import X.C55096Ljo;
import X.C6ZT;
import X.C73318Sq2;
import X.C78609UtB;
import X.C9PM;
import X.FMX;
import X.HG3;
import X.J9P;
import X.RBX;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.gson.m;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commerce.LeadsGenModel;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAProfilePageServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business.data.GetQuoteData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileAdvancedFeatureGetLeadsComponent extends HeaderAdvancedFeatureBaseUIComponent {
    public boolean LJLJLLL;
    public boolean LJLL;
    public GetQuoteData LJLLI;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public final C73318Sq2 LJLJLJ = new C73318Sq2();

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
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

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void componentClick() {
        String str;
        boolean z;
        String str2;
        LeadsGenModel leadsGen;
        Activity activity;
        String aid;
        if (C6ZT.LIZ((View) this.LJLJJL.getValue())) {
            return;
        }
        IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IProfileBaseAbility.class, null);
        if (iProfileBaseAbility != null) {
            iProfileBaseAbility.Cu("get_leads", A3());
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", getEnterFrom());
        String currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
        String str3 = "";
        if (currentUserID == null) {
            currentUserID = "";
        }
        c188727au.LJIIIZ("from_uid_id", currentUserID);
        User user = getUser();
        if (user == null || (str = user.getUid()) == null) {
            str = "";
        }
        c188727au.LJIIIZ("to_user_id", str);
        Aweme aweme = getAweme();
        if (aweme != null && aweme.isAd()) {
            z = true;
        } else {
            z = false;
        }
        String str4 = "1";
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_ad", str2);
        Aweme aweme2 = getAweme();
        if (aweme2 != null && (aid = aweme2.getAid()) != null) {
            str3 = aid;
        }
        c188727au.LJIIIZ("item_id", str3);
        FMX.LJIIL("ttelite_ba_lead_tt_click_cta", c188727au.LIZ);
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            Context context = getContext();
            if (context != null) {
                activity = C78609UtB.LJJLIIIJ(context);
            } else {
                activity = null;
            }
            J9P.LIZIZ(activity, "getLeads", "getLeads", null, null);
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("enter_from", getEnterFrom());
            Aweme aweme3 = getAweme();
            if (aweme3 == null || !aweme3.isAd()) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au2.LJIIIZ("is_ad", str4);
            c188727au2.LIZLLL(-1, "result");
            FMX.LJIIL("ttelite_ba_lead_tt_enter_instantform", c188727au2.LIZ);
            return;
        }
        GetQuoteData getQuoteData = this.LJLLI;
        if (getQuoteData != null && (leadsGen = getQuoteData.getLeadsGen()) != null) {
            BAProfilePageServiceImpl.LJIIJJI().LIZJ(getContext(), leadsGen, getUser(), getAweme());
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent
    public final Map<String, Boolean> x3() {
        String lowerCase = "HAS_GET_LEADS".toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return C0DC.LIZIZ(lowerCase, Boolean.valueOf(this.LJLJJI));
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void actionsAfterUpdateUI() {
        super.actionsAfterUpdateUI();
        ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
        if (profilePlatformVM != null) {
            profilePlatformVM.sv0(new AqS170S0100000_4(this, 821));
        }
        ProfilePlatformViewModel profilePlatformVM2 = getProfilePlatformVM();
        if (profilePlatformVM2 != null) {
            profilePlatformVM2.pv0(new AqS170S0100000_4(this, 822));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent
    public final Integer componentIcon() {
        Integer componentIcon = super.componentIcon();
        if (componentIcon == null) {
            return Integer.valueOf(R.raw.icon_pen_on_paper);
        }
        return componentIcon;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent
    public final String componentText() {
        String componentText = super.componentText();
        if (componentText == null) {
            return C44384HbQ.LJJZ(R.string.eco);
        }
        return componentText;
    }

    public final Aweme getAweme() {
        C9PM state;
        ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
        if (profilePlatformVM != null && (state = profilePlatformVM.getState()) != null) {
            return state.LJLJLLL;
        }
        return null;
    }

    public final User getUser() {
        ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
        if (profilePlatformVM != null) {
            return profilePlatformVM.hv0();
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        this.LJLJLJ.dispose();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void parseComponentBizData(m jsonObject) {
        LeadsGenModel leadsGen;
        String str;
        String uid;
        LeadsGenModel leadsGen2;
        String actionName;
        BizAccountInfo bizAccountInfo;
        o.LJIIIZ(jsonObject, "jsonObject");
        this.LJLLI = (GetQuoteData) C237429Tm.LIZ(jsonObject.toString(), GetQuoteData.class);
        User user = getUser();
        LeadsGenModel leadsGenModel = null;
        if (user != null && (bizAccountInfo = user.getBizAccountInfo()) != null) {
            GetQuoteData getQuoteData = this.LJLLI;
            if (getQuoteData != null) {
                leadsGenModel = getQuoteData.getLeadsGen();
            }
            bizAccountInfo.setLeadsGenModel(leadsGenModel);
        }
        GetQuoteData getQuoteData2 = this.LJLLI;
        if (getQuoteData2 != null && (leadsGen2 = getQuoteData2.getLeadsGen()) != null && (actionName = leadsGen2.getActionName()) != null) {
            I3(actionName);
        }
        GetQuoteData getQuoteData3 = this.LJLLI;
        if (getQuoteData3 != null && (leadsGen = getQuoteData3.getLeadsGen()) != null && leadsGen.getHasLeadsGen() && this.LJLJLLL && !this.LJLL) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", getEnterFrom());
            String currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
            String str2 = "";
            if (currentUserID == null) {
                currentUserID = "";
            }
            c188727au.LJIIIZ("from_uid_id", currentUserID);
            User user2 = getUser();
            if (user2 != null && (uid = user2.getUid()) != null) {
                str2 = uid;
            }
            c188727au.LJIIIZ("to_user_id", str2);
            Aweme aweme = getAweme();
            if (aweme != null && aweme.isAd()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au.LJIIIZ("is_ad", str);
            FMX.LJIIL("ttelite_ba_lead_tt_show_cta", c188727au.LIZ);
            this.LJLL = true;
        }
    }
}
