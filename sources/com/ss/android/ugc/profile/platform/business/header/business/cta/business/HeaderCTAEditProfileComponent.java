package com.ss.android.ugc.profile.platform.business.header.business.cta.business;

import X.AFB;
import X.C188727au;
import X.C212428Vi;
import X.C232459Aj;
import X.C255199zv;
import X.C255209zw;
import X.C43I;
import X.C44384HbQ;
import X.C55096Ljo;
import X.C55230Lly;
import X.C9MU;
import X.EnumC234309Hm;
import X.EnumC26164AOq;
import X.FMX;
import X.HG3;
import X.InterfaceC26189APp;
import X.OSZ;
import X.QD3;
import X.QZP;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.UserPresenter;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.aweme.profile.widgets.header.IMineProfileEditAbility;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.ISignatureAbility;
import com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes5.dex */
public final class HeaderCTAEditProfileComponent extends HeaderCTABaseUIComponent implements InterfaceC26189APp, IMineProfileEditAbility {
    public UserPresenter LJLIL;
    public ProfileViewModel LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    @Override // X.InterfaceC26189APp
    public final void FI(boolean z) {
    }

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

    @Override // X.InterfaceC26189APp
    public final void vb0(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void componentClick() {
        ProfileComponents profileComponents;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", "click_edit_profile");
        FMX.LJIIL("enter_profile_edit", c188727au.LIZ);
        C255209zw.LIZJ();
        C232459Aj c232459Aj = this.baseData;
        if (c232459Aj == null || (profileComponents = c232459Aj.LJLILLLLZI) == null || profileComponents.actions == null) {
            SmartRouter.buildRoute(getContext(), "aweme://profile_edit").open();
        } else {
            super.componentClick();
        }
        SharePrefCache.inst().getIsProfileBubbleShown().LIZLLL(Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent
    public final String componentText() {
        Describe describe;
        String text;
        BizBaseData bizBaseData = this.bizBaseData;
        if (bizBaseData == null || (describe = bizBaseData.getDescribe()) == null || (text = describe.getText()) == null) {
            return C44384HbQ.LJJZ(R.string.fk6);
        }
        return text;
    }

    public final void v3() {
        String LJJZ;
        Describe describe;
        String str = this.assemTagInternal;
        BizBaseData bizBaseData = this.bizBaseData;
        if (bizBaseData == null || (describe = bizBaseData.getDescribe()) == null || (LJJZ = describe.getText()) == null) {
            LJJZ = C44384HbQ.LJJZ(R.string.fk6);
        }
        updateText(str, LJJZ);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void actionsAfterUpdateUI() {
        requestShow();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            this.LJLILLLLZI = AFB.LIZ(LIZLLL);
        }
        Fragment LIZLLL2 = C212428Vi.LIZLLL(this);
        if (LIZLLL2 != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL2, null), this, IMineProfileEditAbility.class, null);
        }
        EventBus.LIZJ().LJIILJJIL(this);
        ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
        if (profilePlatformVM != null) {
            profilePlatformVM.qv0(new AqS170S0100000_4(this, 1059));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZJ(LIZLLL, null), IMineProfileEditAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void updateComponentUIAndData() {
        v3();
        updateClickFunc(this.assemTagInternal, new AqS154S0100000_4(this, 946));
        updateAccessibilityClassName(Button.class.getName());
    }

    public final void x3() {
        C255199zv.LIZJ();
        ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
        if (profilePlatformVM != null) {
            ProfilePlatformViewModel.lv0(profilePlatformVM, 0, null, "onGuideUserUpdate", 7);
        }
        ProfileViewModel profileViewModel = this.LJLILLLLZI;
        if (profileViewModel != null) {
            profileViewModel.Hv0(C255199zv.LJIILL());
        }
        v3();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent
    public final EnumC234309Hm componentStyle() {
        return EnumC234309Hm.TEXT;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.header.IMineProfileEditAbility
    public final boolean Ad(String signature) {
        String str;
        User curUser;
        o.LJIIIZ(signature, "signature");
        IAccountUserService LJIILL = HG3.LJIILL();
        if (LJIILL != null && (curUser = LJIILL.getCurUser()) != null) {
            str = curUser.getSignature();
        } else {
            str = null;
        }
        if (!TextUtils.equals(signature, str)) {
            String LIZIZ = QZP.LIZIZ("\n+", signature, "\n");
            int length = LIZIZ.length() - 1;
            if (length >= 0 && LIZIZ.charAt(length) == '\n') {
                LIZIZ = LIZIZ.substring(0, length);
                o.LJIIIIZZ(LIZIZ, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            if (this.LJLIL == null) {
                UserPresenter userPresenter = new UserPresenter(EnumC26164AOq.PROFILE.getValue());
                this.LJLIL = userPresenter;
                userPresenter.bindView(this);
            }
            UserPresenter userPresenter2 = this.LJLIL;
            if (userPresenter2 != null) {
                userPresenter2.updateSignature(LIZIZ);
            }
        }
        return true;
    }

    @QD3
    public final void onClickGuideCardEvent(C9MU c9mu) {
        if (c9mu != null && c9mu.LJLIL == 3) {
            Ad(c9mu.LJLILLLLZI);
        }
    }

    @Override // X.InterfaceC26189APp
    public final void Pp0(User user, int i) {
        if (i != 0) {
            if (i != 2) {
                return;
            }
            String str = null;
            ISignatureAbility iSignatureAbility = (ISignatureAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ISignatureAbility.class, null);
            if (iSignatureAbility != null) {
                if (user != null) {
                    str = user.getSignature();
                }
                iSignatureAbility.W8(0, str);
            }
            x3();
            return;
        }
        x3();
    }

    @Override // X.InterfaceC26189APp
    public final void Xa(Exception exc, int i) {
        ProfilePlatformViewModel profilePlatformVM;
        if (i == 4 && (profilePlatformVM = getProfilePlatformVM()) != null) {
            profilePlatformVM.setState(new AqS167S0100000_1(new C43I(new OSZ(exc, Integer.valueOf(i))), (C43I<Boolean>) 488));
        }
    }
}
