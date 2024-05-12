package com.ss.android.ugc.profile.platform.business.navbar.business.other;

import X.AbstractC234519Ih;
import X.C175256uH;
import X.C2068389v;
import X.C214298b3;
import X.C214528bQ;
import X.C234159Gx;
import X.C234999Kd;
import X.C235079Kl;
import X.C235929Ns;
import X.C237429Tm;
import X.C245329k0;
import X.C245349k2;
import X.C245479kF;
import X.C26074ALe;
import X.C26175APb;
import X.C47704Ins;
import X.C55096Ljo;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C86034Xpe;
import X.C8BR;
import X.C8BS;
import X.C8VC;
import X.C8YN;
import X.C9H0;
import X.C9PM;
import X.HG3;
import X.InterfaceC235069Kk;
import X.InterfaceC55235Lm3;
import X.InterfaceC85901XnV;
import X.QD3;
import X.TBT;
import X.ViewOnClickListenerC13880ga;
import Y.ACListenerS39S0200000_4;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.google.gson.m;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.notification.NotificationLiveAssemViewModel;
import com.ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility;
import com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.navbar.business.data.NavBarBellData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.IDqS429S0100000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes5.dex */
public final class NavBarBellComponent extends NavbarBaseUIComponent<NavBarBellData> implements InterfaceC85901XnV {
    public final C214298b3 LJLILLLLZI;
    public final C55749LuL LJLJI;
    public final C8BR<C8BS<PushSettings>, InterfaceC85901XnV> LJLJJI;
    public C245479kF LJLJJL;
    public boolean LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final C235929Ns LJLIL = new C235929Ns();

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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
        C234159Gx data = getData();
        if (data != null && (c9h0 = data.LJLIL) != null) {
            InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
            String value = c9h0.getValue();
            if (value == null) {
                value = "";
            }
            INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C55096Ljo.LIZ(LJIIZILJ, INavbarBaseAbility.class, value);
            if (iNavbarBaseAbility != null) {
                iNavbarBaseAbility.LG(c9h0, this.index, this.LJLIL, uniqueId());
            }
        }
        EventBus.LIZJ().LJIILJJIL(this);
        C8YN.LJIIJ(this, (AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.9kB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C245469kE) obj).LJLJI;
            }
        }, new TBT() { // from class: X.9k9
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C245469kE) obj).LJLIL);
            }
        }, null, new IDqS429S0100000_4(this, 12), 12);
    }

    @Override // X.InterfaceC85901XnV
    public final void onFailed(Exception exc) {
    }

    public NavBarBellComponent() {
        C65776Prg LIZ = C65352Pkq.LIZ(NotificationLiveAssemViewModel.class);
        this.LJLILLLLZI = new C214298b3(new AqS154S0100000_4(LIZ, 969), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C245329k0.INSTANCE, LIZ);
        this.LJLJI = new C55749LuL(C47704Ins.LJ(this, C26175APb.class, null), checkSupervisorPrepared());
        this.LJLJJI = C86034Xpe.LIZIZ.providePushSettingFetchPresenter();
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent
    public final AbstractC234519Ih initNavBarAction() {
        Context context = getContext();
        if (context != null) {
            LiveOuterService.LJJJLL().LJJIZ().LJJJZ().getClass();
            C245479kF c245479kF = new C245479kF(context);
            this.LJLJJL = c245479kF;
            c245479kF.setBellIcon(v3(2));
            C245479kF c245479kF2 = this.LJLJJL;
            if (c245479kF2 != null) {
                c245479kF2.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS39S0200000_4(this, context, 34)));
            }
            C235929Ns c235929Ns = this.LJLIL;
            C245479kF c245479kF3 = this.LJLJJL;
            o.LJII(c245479kF3, "null cannot be cast to non-null type android.view.View");
            c235929Ns.getClass();
            c235929Ns.LIZJ = c245479kF3;
        }
        return this.LJLIL;
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        this.LJLJJI.LIZIZ();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final boolean shouldShowAfterDoubleCheck() {
        return HG3.LJIILL().isLogin();
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void updateComponentUIAndData() {
        C9H0 c9h0;
        C234159Gx data = getData();
        if (data != null && (c9h0 = data.LJLIL) != null) {
            InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
            String value = c9h0.getValue();
            if (value == null) {
                value = "";
            }
            INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C55096Ljo.LIZ(LJIIZILJ, INavbarBaseAbility.class, value);
            if (iNavbarBaseAbility != null) {
                iNavbarBaseAbility.LG(c9h0, this.index, this.LJLIL, uniqueId());
            }
        }
    }

    @Override // X.InterfaceC85901XnV
    public final void A1(PushSettings pushSettings) {
        LiveOuterService.LJJJLL().LJJIZ().LJJJZ();
        boolean z = true;
        if (pushSettings.livePush != 1) {
            z = false;
        }
        C26074ALe.LIZJ(z);
    }

    @QD3
    public final void onEvent(C245349k2 event) {
        String str;
        User user;
        CommerceUserInfo commerceUserInfo;
        C9PM state;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        o.LJIIIZ(event, "event");
        String str2 = event.LJLIL;
        ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
        if (profilePlatformVM != null && (state = profilePlatformVM.getState()) != null && (aweme = state.LJLJLLL) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            str = awemeRawAd.getCreativeIdStr();
        } else {
            str = null;
        }
        if (!o.LJ(str2, str)) {
            return;
        }
        C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class));
        if (c234999Kd != null) {
            user = c234999Kd.LIZ;
            if (user != null && (commerceUserInfo = user.getCommerceUserInfo()) != null) {
                commerceUserInfo.setNotificationConfig(event.LJLILLLLZI ? 1 : 0);
            }
        } else {
            user = null;
        }
        C235079Kl.LIZIZ((InterfaceC235069Kk) C8VC.LIZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), null), user, null, false, 6);
    }

    @QD3
    public final void onUserLoginSuccessfully(C175256uH c175256uH) {
        C234159Gx data;
        C9H0 c9h0;
        if (HG3.LJIILL().isLogin() && (data = getData()) != null && (c9h0 = data.LJLIL) != null) {
            InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
            String value = c9h0.getValue();
            if (value == null) {
                value = "";
            }
            INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C55096Ljo.LIZ(LJIIZILJ, INavbarBaseAbility.class, value);
            if (iNavbarBaseAbility != null) {
                iNavbarBaseAbility.LG(c9h0, this.index, this.LJLIL, uniqueId());
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void parseComponentBizData(m jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
        this.bizBaseData = (T) C237429Tm.LIZ(jsonObject.toString(), NavBarBellData.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b4, code lost:
    
        if (r9 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c6, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r0.isGeoBlocked(), java.lang.Boolean.TRUE) != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fc  */
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC234089Gq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateDataWhenUserUpdate(com.ss.android.ugc.profile.platform.base.data.ProfileComponents r12) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.navbar.business.other.NavBarBellComponent.updateDataWhenUserUpdate(com.ss.android.ugc.profile.platform.base.data.ProfileComponents):void");
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

    public final C2068389v v3(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = R.raw.icon_bell;
                    c2068389v.LJ = Integer.valueOf(R.attr.go);
                    return c2068389v;
                }
                C2068389v c2068389v2 = new C2068389v();
                c2068389v2.LIZ = R.raw.icon_bell_slash;
                c2068389v2.LJ = Integer.valueOf(R.attr.go);
                return c2068389v2;
            }
            C2068389v c2068389v3 = new C2068389v();
            c2068389v3.LIZ = R.raw.icon_bell;
            c2068389v3.LJ = Integer.valueOf(R.attr.go);
            return c2068389v3;
        }
        C2068389v c2068389v4 = new C2068389v();
        c2068389v4.LIZ = R.raw.icon_bell_activation;
        c2068389v4.LJ = Integer.valueOf(R.attr.go);
        return c2068389v4;
    }
}
