package com.ss.android.ugc.profile.platform.business.navbar.business;

import X.AVS;
import X.AbstractC234519Ih;
import X.C113554cx;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C234159Gx;
import X.C234529Ii;
import X.C237429Tm;
import X.C244719j1;
import X.C244729j2;
import X.C244769j6;
import X.C244809jA;
import X.C244839jD;
import X.C244849jE;
import X.C244989jS;
import X.C55096Ljo;
import X.C60829Nu5;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73040SlY;
import X.C78926UyI;
import X.C86V;
import X.C8VC;
import X.C8YN;
import X.C9H0;
import X.C9XN;
import X.FMX;
import X.InterfaceC244909jK;
import X.InterfaceC55235Lm3;
import X.OSZ;
import X.TBT;
import android.view.View;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.SmartRouter;
import com.google.gson.m;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BABusinessSuitePageServiceImp;
import com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.mine.CreatorToolsNavBarSettingViewModel;
import com.ss.android.ugc.aweme.setting.services.ICreatorCenterPreloadService;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility;
import com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.navbar.business.data.NavBarSettingsData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class NavBarSettingComponent extends NavbarBaseUIComponent<NavBarSettingsData> {
    public final C214298b3 LJLILLLLZI;
    public AVS LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final C234529Ii LJLIL = new C234529Ii();

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void actionsAfterUpdateUI() {
        C9H0 c9h0;
        C9H0 c9h02;
        String str = null;
        if (isFromMain()) {
            InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
            C234159Gx data = getData();
            if (data != null && (c9h02 = data.LJLIL) != null) {
                str = c9h02.getValue();
            }
            INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C55096Ljo.LIZ(LJIIZILJ, INavbarBaseAbility.class, str);
            if (iNavbarBaseAbility != null) {
                iNavbarBaseAbility.tm(uniqueId());
            }
            ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
            if (profilePlatformVM != null) {
                C8YN.LJII(this, profilePlatformVM, new TBT() { // from class: X.9Vd
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C9PM) obj).LJLLJ;
                    }
                }, null, new AqS186S0100000_4(this, 232), 6);
            }
            if (C244839jD.LIZ()) {
                C8YN.LJII(this, (AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.9j3
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C244749j4) obj).LJLIL;
                    }
                }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 233), 4);
            }
        } else {
            InterfaceC55235Lm3 LJIIZILJ2 = C55096Ljo.LJIIZILJ(this);
            C234159Gx data2 = getData();
            if (data2 != null && (c9h0 = data2.LJLIL) != null) {
                str = c9h0.getValue();
            }
            INavbarBaseAbility iNavbarBaseAbility2 = (INavbarBaseAbility) C55096Ljo.LIZ(LJIIZILJ2, INavbarBaseAbility.class, str);
            if (iNavbarBaseAbility2 != null) {
                iNavbarBaseAbility2.BV(uniqueId());
            }
        }
        ((ICreatorCenterPreloadService) this.LJLJJI.getValue()).LIZ();
        int LIZ = C244849jE.LIZ();
        if (C244809jA.LIZ()) {
            if (LIZ == 2 || LIZ == 5) {
                C60829Nu5.LIZIZ(new C244989jS(true));
            }
        }
    }

    public NavBarSettingComponent() {
        C9XN c9xn = C9XN.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(CreatorToolsNavBarSettingViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9xn, new AqS154S0100000_4(LIZ, 967), C244729j2.INSTANCE, null);
        this.LJLJJI = C221108m2.LIZIZ(C244769j6.LJLIL);
        this.LJLJJL = C221108m2.LIZIZ(C244719j1.LJLIL);
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent
    public final AbstractC234519Ih initNavBarAction() {
        String str;
        C9H0 c9h0;
        C9H0 c9h02;
        C234529Ii c234529Ii = this.LJLIL;
        AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4(this, 847);
        c234529Ii.LIZJ();
        c234529Ii.LJFF = aqS170S0100000_4;
        c234529Ii.LIZIZ(new AqS154S0100000_4(this, 966));
        C234159Gx data = getData();
        if (data != null && (c9h02 = data.LJLIL) != null) {
            InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
            String value = c9h02.getValue();
            if (value == null) {
                value = "";
            }
            INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C55096Ljo.LIZ(LJIIZILJ, INavbarBaseAbility.class, value);
            if (iNavbarBaseAbility != null) {
                iNavbarBaseAbility.LG(c9h02, this.index, this.LJLIL, uniqueId());
            }
        }
        if (SettingServiceImpl.LIZ().shouldShowBusinessAccount()) {
            BABusinessSuitePageServiceImp.LIZJ().LIZIZ();
        }
        InterfaceC55235Lm3 LJIIZILJ2 = C55096Ljo.LJIIZILJ(this);
        C234159Gx data2 = getData();
        if (data2 != null && (c9h0 = data2.LJLIL) != null) {
            str = c9h0.getValue();
        } else {
            str = null;
        }
        INavbarBaseAbility iNavbarBaseAbility2 = (INavbarBaseAbility) C55096Ljo.LIZ(LJIIZILJ2, INavbarBaseAbility.class, str);
        if (iNavbarBaseAbility2 != null) {
            String uniqueId = uniqueId();
            String LJFF = C86V.LJFF(R.string.ams);
            o.LJIIIIZZ(LJFF, "getString(R.string.acces…yLabels_profile_btn_menu)");
            iNavbarBaseAbility2.in(uniqueId, LJFF);
        }
        return this.LJLIL;
    }

    public final IWalletService v3() {
        return (IWalletService) this.LJLJJL.getValue();
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent
    public final void afterUpdateNavbarActions() {
        String str;
        C9H0 c9h0;
        InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
        C234159Gx data = getData();
        if (data != null && (c9h0 = data.LJLIL) != null) {
            str = c9h0.getValue();
        } else {
            str = null;
        }
        INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C55096Ljo.LIZ(LJIIZILJ, INavbarBaseAbility.class, str);
        if (iNavbarBaseAbility != null) {
            String uniqueId = uniqueId();
            String LJFF = C86V.LJFF(R.string.ams);
            o.LJIIIIZZ(LJFF, "getString(R.string.acces…yLabels_profile_btn_menu)");
            iNavbarBaseAbility.in(uniqueId, LJFF);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        ((ICreatorCenterPreloadService) this.LJLJJI.getValue()).LIZIZ();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final boolean shouldShowAfterDoubleCheck() {
        return isFromMain();
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void parseComponentBizData(m jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
        this.bizBaseData = (T) C237429Tm.LIZ(jsonObject.toString(), NavBarSettingsData.class);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC234089Gq
    public final void updateIndexAtContainer(int i) {
        C9H0 c9h0;
        if (this.index == i) {
            return;
        }
        super.updateIndexAtContainer(i);
        C234159Gx data = getData();
        if (data != null && (c9h0 = data.LJLIL) != null) {
            InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
            String value = c9h0.getValue();
            if (value == null) {
                value = "";
            }
            INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C55096Ljo.LIZ(LJIIZILJ, INavbarBaseAbility.class, value);
            if (iNavbarBaseAbility != null) {
                iNavbarBaseAbility.LG(c9h0, i, this.LJLIL, uniqueId());
            }
        }
    }

    public final void x3(String str) {
        FMX.LJIIL("enter_setting_page", C113554cx.LJJLIIIIJ(new OSZ("previous_page", "personal_homepage"), new OSZ("enter_from", "personal_homepage"), new OSZ("enter_method", str)));
        C73040SlY.LJII(getContext(), "set", "personal_homepage");
        InterfaceC244909jK interfaceC244909jK = (InterfaceC244909jK) C8VC.LJII(this, C65352Pkq.LIZ(InterfaceC244909jK.class));
        if (interfaceC244909jK != null) {
            interfaceC244909jK.LLLIILIL();
        }
        SmartRouter.buildRoute(getContext(), "//setting").open();
    }
}
