package com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.user;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C00F;
import X.C07290Qj;
import X.C188727au;
import X.C212428Vi;
import X.C214298b3;
import X.C214528bQ;
import X.C235689Mu;
import X.C235729My;
import X.C237429Tm;
import X.C32151Nz;
import X.C40883G2t;
import X.C55096Ljo;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9AC;
import X.C9AE;
import X.C9NG;
import X.C9PM;
import X.C9XU;
import X.FMX;
import X.G27;
import X.InterfaceC82683Wch;
import X.O6R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.BaseBundle;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.google.gson.m;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.profile.viewmodel.MainActivityProfileSwitchAccountViewModel;
import com.ss.android.ugc.aweme.profile.widgets.userId.MyProfileUserIdVM;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountUserInfoBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.user.ability.IUserNameAbility;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.data.ModifyUserNameData;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes5.dex */
public final class AccountModifyUserNameComponent extends AccountUserInfoBaseUIComponent<ModifyUserNameData> implements G27 {
    public boolean LJLJJLL;
    public final C214298b3 LJLJL;
    public InterfaceC82683Wch LJLJLJ;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountUserInfoBaseUIComponent, com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountUserInfoBaseUIComponent, com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
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

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void updateComponentUIAndData() {
        C9PM state;
        String str;
        int i;
        UserProfileInfo userProfileInfo;
        ModifyUserNameData modifyUserNameData;
        if (getContext() != null) {
            int i2 = 0;
            if (!C9NG.LIZIZ() || ((modifyUserNameData = (ModifyUserNameData) this.LJLILLLLZI) != null && o.LJ(modifyUserNameData.getUserNameUpdateReminder(), Boolean.TRUE))) {
                ModifyUserNameData modifyUserNameData2 = (ModifyUserNameData) this.LJLILLLLZI;
                if (modifyUserNameData2 != null && o.LJ(modifyUserNameData2.getUserNameUpdateReminder(), Boolean.TRUE)) {
                    ActivityC45651qj LIZ = C212428Vi.LIZ(this);
                    if (LIZ != null && LIZ.isFinishing()) {
                        return;
                    }
                    ProfileCommonInfo commonInfo = getCommonInfo();
                    if (commonInfo == null || (userProfileInfo = commonInfo.getUserProfileInfo()) == null || (str = userProfileInfo.getUid()) == null) {
                        str = "";
                    }
                    long j = C9NG.LIZ.LIZ.getLong(i0.LJFF("last_time_show_change_username_bubble_", str), 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (C00F.LIZ(31744, 1, "username_modify_tip_interval", true) == 1) {
                        i = 168;
                    } else if (C00F.LIZ(31744, 1, "username_modify_tip_interval", true) == 2) {
                        i = 72;
                    } else {
                        i = 24;
                    }
                    if (LIZ != null) {
                        i2 = LIZ.hashCode();
                    }
                    C9XU.LIZ(i2, this);
                    withState((AssemViewModel) this.LJLJL.getValue(), new C235729My(this, currentTimeMillis, j, i));
                    return;
                }
                C9AE.LIZ(this.componentView, C9AC.ALPHA, 0.0f);
                v3(R.drawable.bxw);
                ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
                if (profilePlatformVM == null || (state = profilePlatformVM.getState()) == null || !state.LJLJJL || !this.LJLJJLL || x3()) {
                    return;
                }
                MainServiceImpl.createIMainServicebyMonsterPlugin(false).tryShowIllegalUsernameDialog("profile", null, null);
            }
        }
    }

    public AccountModifyUserNameComponent() {
        C65776Prg LIZ = C65352Pkq.LIZ(MyProfileUserIdVM.class);
        this.LJLJL = new C214298b3(new AqS154S0100000_4(LIZ, 954), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C235689Mu.INSTANCE, LIZ);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void componentClick() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", "click_edit_username");
        FMX.LJIIL("enter_profile_username", c188727au.LIZ);
        C40883G2t c40883G2t = new C40883G2t();
        ((BaseBundle) c40883G2t.LIZ).putInt("need_focus_id_input", 1);
        Bundle bundle = (Bundle) c40883G2t.LIZ;
        if (getContext() == null) {
            return;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(getContext(), "aweme://profile_edit");
        o.LJIIIIZZ(buildRoute, "buildRoute(context, \"aweme://profile_edit\")");
        if (bundle != null) {
            buildRoute.withParam(bundle);
        }
        buildRoute.open();
        SharePrefCache.inst().getIsProfileBubbleShown().LIZLLL(Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View generateComponentView() {
        Context context = getContext();
        if (context != null) {
            TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            layoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
            tuxIconView.setLayoutParams(layoutParams);
            tuxIconView.setVisibility(8);
            return tuxIconView;
        }
        return null;
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        this.LJLJJLL = false;
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        this.LJLJJLL = true;
        a.LJ().LJ(4);
    }

    public final boolean x3() {
        Fragment LIZLLL;
        Fragment LIZLLL2;
        Fragment LIZLLL3;
        boolean z;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return true;
        }
        boolean isFinishing = LIZ.isFinishing();
        Fragment LIZLLL4 = C212428Vi.LIZLLL(this);
        if ((LIZLLL4 != null && LIZLLL4.isRemoving()) || (((LIZLLL = C212428Vi.LIZLLL(this)) != null && LIZLLL.isDetached()) || (LIZLLL2 = C212428Vi.LIZLLL(this)) == null || LIZLLL2.getView() == null || (LIZLLL3 = C212428Vi.LIZLLL(this)) == null || LIZLLL3.getFragmentManager() == null)) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = ((MainActivityProfileSwitchAccountViewModel) ViewModelProviders.of(LIZ).get(MainActivityProfileSwitchAccountViewModel.class)).LJLIL;
        if (isFinishing || z || z2) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void parseComponentBizData(m jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
        this.LJLILLLLZI = (T) C237429Tm.LIZ(jsonObject.toString(), ModifyUserNameData.class);
    }

    public final void v3(int i) {
        Context context = getContext();
        if (context != null) {
            View view = this.componentView;
            o.LJII(view, "null cannot be cast to non-null type com.bytedance.tux.icon.TuxIconView");
            ((AppCompatImageView) view).setImageResource(i);
            View view2 = this.componentView;
            if (view2 != null) {
                view2.setVisibility(0);
                IUserNameAbility iUserNameAbility = (IUserNameAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IUserNameAbility.class, null);
                if (iUserNameAbility != null) {
                    iUserNameAbility.kv(C07290Qj.LJIIL(AnonymousClass636.LJIIIIZZ(R.attr.ca, context), 84));
                }
            }
        }
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        InterfaceC82683Wch interfaceC82683Wch = this.LJLJLJ;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
        }
    }
}
