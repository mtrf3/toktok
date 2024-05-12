package com.ss.android.ugc.profile.platform.business.header.business.cta.business.addfriends;

import X.C1799074g;
import X.C184077Kh;
import X.C212428Vi;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C235389Lq;
import X.C235399Lr;
import X.C235419Lt;
import X.C235429Lu;
import X.C235469Ly;
import X.C237429Tm;
import X.C55096Ljo;
import X.C55230Lly;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C77266UUc;
import X.C78926UyI;
import X.C8W0;
import X.C9HK;
import X.C9IL;
import X.EnumC234309Hm;
import X.InterfaceC1798974f;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.gson.m;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.ProfileMafRedPointsVM;
import com.ss.android.ugc.aweme.relation.ffp.FindFriendsPageArg;
import com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.Icon;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.data.AddFriendsData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class HeaderCTAAddFriendsComponent extends HeaderCTABaseUIComponent implements ICTAAddFriendsAbility {
    public final C214378bB LJLIL;
    public int LJLILLLLZI;
    public AddFriendsData LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    public HeaderCTAAddFriendsComponent() {
        InterfaceC65784Pro LJIILJJIL;
        C235419Lt c235419Lt = C235419Lt.LJLIL;
        C65776Prg LIZ = C65352Pkq.LIZ(ProfileMafRedPointsVM.class);
        C235389Lq c235389Lq = C235389Lq.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS154S0100000_4((C8W0) this, 947);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLIL = new C214378bB(LIZ, c235419Lt, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c235389Lq, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent
    public final Integer componentIcon() {
        Icon icon;
        Integer iconInt$default;
        AddFriendsData addFriendsData = this.LJLJI;
        int i = R.raw.icon_person_plus;
        if (addFriendsData != null && (icon = addFriendsData.getIcon()) != null && (iconInt$default = Icon.getIconInt$default(icon, null, Integer.valueOf(R.raw.icon_person_plus), 1, null)) != null) {
            i = iconInt$default.intValue();
        }
        return Integer.valueOf(i);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent
    public final String componentText() {
        Describe describe;
        String text;
        AddFriendsData addFriendsData = this.LJLJI;
        if (addFriendsData == null || (describe = addFriendsData.getDescribe()) == null || (text = describe.getText()) == null) {
            Fragment LIZLLL = C212428Vi.LIZLLL(this);
            if (LIZLLL != null) {
                return LIZLLL.getString(R.string.pet);
            }
            return null;
        }
        return text;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final boolean shouldShowAfterDoubleCheck() {
        if (C77266UUc.LIZIZ.LJJIZ()) {
            return false;
        }
        return true;
    }

    public final ProfileMafRedPointsVM v3() {
        return (ProfileMafRedPointsVM) this.LJLIL.getValue();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void actionsAfterUpdateUI() {
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, ICTAAddFriendsAbility.class, null);
        }
        requestShow();
        ProfileMafRedPointsVM v3 = v3();
        AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4(this, 837);
        v3.getClass();
        AssemViewModel.selectSubscribe$default(v3, C235429Lu.LJLIL, null, null, null, new AqS167S0100000_1(aqS170S0100000_4, (InterfaceC88472Yns<? super FrameLayout, C76800UCe>) LiveCoverMinSizeSetting.DEFAULT), 14, null);
        ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
        if (profilePlatformVM != null) {
            profilePlatformVM.rv0(new AqS170S0100000_4(this, 838));
        }
        IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IProfileBaseAbility.class, null);
        if (iProfileBaseAbility != null) {
            C9IL c9il = C9IL.CTA;
            String lowerCase = "HAS_ADD_FRIENDS".toLowerCase();
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
            iProfileBaseAbility.y6(true, c9il, lowerCase, true);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void componentClick() {
        int i;
        String str;
        String str2;
        if (v3().LJLILLLLZI) {
            i = C235469Ly.LIZIZ(this.LJLILLLLZI);
        } else {
            i = 0;
        }
        this.LJLILLLLZI = i;
        FindFriendsPageArg findFriendsPageArg = new FindFriendsPageArg(false, 0, "personal_homepage", null, null, this.LJLILLLLZI, !C77266UUc.LIZIZ.LJJIZ(), 27, null);
        SmartRoute buildRoute = SmartRouter.buildRoute(getContext(), "//friends/ffp");
        buildRoute.withNavArg(findFriendsPageArg);
        buildRoute.open();
        C235399Lr c235399Lr = new C235399Lr("click_add_friends");
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        c235399Lr.LJ("enter_from", "personal_homepage", c1799074g);
        c235399Lr.LJ("event_type", "normal_way", c1799074g);
        if (getComponentCurStyle() == C9HK.ICON) {
            str = "icon";
        } else {
            str = "add_friends";
        }
        c235399Lr.LJIILL("button_type", str);
        if (v3().LJLILLLLZI) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c235399Lr.LJIILL("has_notice", str2);
        if (v3().LJLILLLLZI) {
            c235399Lr.LJIILL("notice_cnt", String.valueOf(this.LJLILLLLZI));
        }
        c235399Lr.LJIILIIL();
        IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IProfileBaseAbility.class, null);
        if (iProfileBaseAbility != null) {
            iProfileBaseAbility.Cu("find_friends", true);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.business.addfriends.ICTAAddFriendsAbility
    public final void nK() {
        User curUser = AccountService.LJIJ().LJFF().getCurUser();
        if (!C77266UUc.LIZIZ.LJJIZ()) {
            v3().gv0(C235469Ly.LIZIZ(curUser.mafRedCount));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZJ(LIZLLL, null), ICTAAddFriendsAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void updateComponentUIAndData() {
        if (!shouldShowAfterDoubleCheck()) {
            return;
        }
        super.updateComponentUIAndData();
        updateAccessibilityClassName(Button.class.getName());
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent
    public final EnumC234309Hm componentStyle() {
        return EnumC234309Hm.TEXT;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void parseComponentBizData(m jsonObject) {
        int i;
        Integer mafRedCount;
        o.LJIIIZ(jsonObject, "jsonObject");
        if (!shouldShowAfterDoubleCheck()) {
            return;
        }
        AddFriendsData addFriendsData = (AddFriendsData) C237429Tm.LIZ(jsonObject.toString(), AddFriendsData.class);
        this.LJLJI = addFriendsData;
        if (addFriendsData != null && (mafRedCount = addFriendsData.getMafRedCount()) != null) {
            i = mafRedCount.intValue();
        } else {
            i = 0;
        }
        this.LJLILLLLZI = C235469Ly.LIZIZ(i);
    }
}
