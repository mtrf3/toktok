package com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.user;

import X.C212428Vi;
import X.C237429Tm;
import X.C26045AKb;
import X.C36922EeM;
import X.C45804HyK;
import X.C55096Ljo;
import X.C55230Lly;
import X.C72972SkS;
import X.C78857UxB;
import X.C8YN;
import X.C9AC;
import X.C9AE;
import X.C9T4;
import X.OHT;
import X.Q0C;
import X.TBT;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.m;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountUserInfoBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.user.ability.IUserNameAbility;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.data.NickNameData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;
import o3.IDaS88S0000000_1;
import o3.h0;

/* loaded from: classes5.dex */
public final class AccountUserNameComponent extends AccountUserInfoBaseUIComponent<NickNameData> implements IUserNameAbility {
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountUserInfoBaseUIComponent, com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountUserInfoBaseUIComponent, com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
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
        ProfilePlatformViewModel profilePlatformVM;
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, IUserNameAbility.class, null);
        }
        if (C9T4.LIZ() && (profilePlatformVM = getProfilePlatformVM()) != null) {
            C8YN.LJII(this, profilePlatformVM, new TBT() { // from class: X.9Gd
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C9PM) obj).LLFF;
                }
            }, null, new AqS186S0100000_4(this, 230), 6);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.user.ability.IUserNameAbility
    public final TuxTextView Qa() {
        View view = this.componentView;
        o.LJII(view, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
        return (TuxTextView) view;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.user.ability.IUserNameAbility
    public final float lO() {
        View view = this.componentView;
        o.LJII(view, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
        return ((TextView) view).getTextSize();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void updateComponentUIAndData() {
        String str;
        String LIZIZ;
        UserProfileInfo userProfileInfo;
        Describe describe;
        C9AE.LIZ(this.componentView, C9AC.ALPHA, 0.0f);
        if (getContext() != null) {
            T t = this.LJLILLLLZI;
            if (t == 0 || (describe = t.getDescribe()) == null || (LIZIZ = describe.getText()) == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append('@');
                ProfileCommonInfo commonInfo = getCommonInfo();
                if (commonInfo == null || (userProfileInfo = commonInfo.getUserProfileInfo()) == null || (str = userProfileInfo.getUsername()) == null) {
                    str = "";
                }
                LIZ.append(str);
                LIZIZ = X1D.LIZIZ(LIZ);
            }
            View view = this.componentView;
            o.LJII(view, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
            if (o.LJ(LIZIZ, ((AppCompatTextView) view).getText())) {
                return;
            }
            View view2 = this.componentView;
            o.LJII(view2, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
            ((TextView) view2).setText(LIZIZ);
            View view3 = this.componentView;
            o.LJII(view3, "null cannot be cast to non-null type android.view.View");
            h0.LJIJI(view3, new IDaS88S0000000_1(9));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void componentClick() {
        String str;
        UserProfileInfo userProfileInfo;
        ProfileCommonInfo commonInfo = getCommonInfo();
        if (commonInfo == null || (userProfileInfo = commonInfo.getUserProfileInfo()) == null || (str = userProfileInfo.getUsername()) == null) {
            str = "";
        }
        Context context = getContext();
        if (context != null) {
            try {
                OHT.LIZ("user_id", str, context, C78857UxB.LJJIIJ(1476399109, "bpea-profile_copy_user_name"));
                Activity LJIJJ = C45804HyK.LJIJJ(context);
                if (LJIJJ != null) {
                    C26045AKb c26045AKb = new C26045AKb(LJIJJ);
                    c26045AKb.LJIIIIZZ(R.string.dfw);
                    c26045AKb.LJIIJ();
                }
            } catch (Q0C e) {
                C36922EeM.LIZ(e);
            } catch (SecurityException e2) {
                C36922EeM.LIZ(e2);
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View generateComponentView() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        Integer LIZJ = C72972SkS.LIZJ(tuxTextView, "context", R.attr.gu);
        if (LIZJ != null) {
            tuxTextView.setTextColor(LIZJ.intValue());
        }
        tuxTextView.setTuxFont(42);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        tuxTextView.setLayoutParams(layoutParams);
        return tuxTextView;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZJ(LIZLLL, null), IUserNameAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.user.ability.IUserNameAbility
    public final void kv(int i) {
        View view = this.componentView;
        if (view != null && (view instanceof TuxTextView)) {
            o.LJII(view, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
            ((TextView) view).setTextColor(i);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void parseComponentBizData(m jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
        this.LJLILLLLZI = (T) C237429Tm.LIZ(jsonObject.toString(), NickNameData.class);
    }
}
