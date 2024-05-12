package com.ss.android.ugc.profile.platform.business.navbar.business.other;

import X.AbstractC234519Ih;
import X.C234159Gx;
import X.C237429Tm;
import X.C55096Ljo;
import X.C65352Pkq;
import X.C8VC;
import X.C9H0;
import X.C9IL;
import X.C9KF;
import X.InterfaceC235069Kk;
import X.InterfaceC55235Lm3;
import X.T5U;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import com.google.gson.m;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility;
import com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.navbar.business.data.NickNameData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class NavBarOtherNicknameComponent extends NavbarBaseUIComponent<NickNameData> {
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();
    public final C9KF LJLIL = new C9KF();

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent
    public final AbstractC234519Ih initNavBarAction() {
        C9KF c9kf = this.LJLIL;
        c9kf.getClass();
        c9kf.LIZJ = "";
        return this.LJLIL;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void actionsAfterUpdateUI() {
        ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
        if (profilePlatformVM != null) {
            profilePlatformVM.ov0(new AqS170S0100000_4(this, 850));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void updateComponentUIAndData() {
        String str;
        String str2;
        Describe describe;
        String str3;
        String str4;
        C9H0 c9h0;
        UserProfileInfo userProfileInfo;
        super.updateComponentUIAndData();
        NickNameData nickNameData = (NickNameData) this.bizBaseData;
        String str5 = "";
        if (nickNameData == null || (str = nickNameData.getSubTitle()) == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new T5U(62, false), 0, spannableStringBuilder.length(), 33);
        ProfileCommonInfo commonInfo = getCommonInfo();
        if (commonInfo == null || (userProfileInfo = commonInfo.getUserProfileInfo()) == null || (str2 = userProfileInfo.getNickname()) == null) {
            T t = this.bizBaseData;
            if (t != 0 && (describe = t.getDescribe()) != null) {
                str2 = describe.getText();
            } else {
                str2 = null;
            }
        }
        InterfaceC235069Kk interfaceC235069Kk = (InterfaceC235069Kk) C8VC.LJFF(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), null);
        if (interfaceC235069Kk != null) {
            C9IL c9il = C9IL.NAV;
            String lowerCase = "HAS_PRONOUNS".toLowerCase();
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
            interfaceC235069Kk.y6(false, c9il, lowerCase, !TextUtils.isEmpty(spannableStringBuilder));
        }
        C9KF c9kf = this.LJLIL;
        if (str2 == null) {
            str2 = "";
        }
        c9kf.getClass();
        c9kf.LIZJ = str2;
        NickNameData nickNameData2 = (NickNameData) this.bizBaseData;
        if (nickNameData2 == null || (str3 = nickNameData2.getSubTitle()) == null) {
            str3 = "";
        }
        c9kf.LIZLLL = str3;
        InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
        C234159Gx data = getData();
        if (data == null || (c9h0 = data.LJLIL) == null || (str4 = c9h0.getValue()) == null) {
            str4 = "";
        }
        INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C55096Ljo.LIZ(LJIIZILJ, INavbarBaseAbility.class, str4);
        if (iNavbarBaseAbility != null) {
            C9KF c9kf2 = this.LJLIL;
            String str6 = this.assemTagInternal;
            if (str6 != null) {
                str5 = str6;
            }
            iNavbarBaseAbility.AC(c9kf2, str5);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void parseComponentBizData(m jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
        this.bizBaseData = (T) C237429Tm.LIZ(jsonObject.toString(), NickNameData.class);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC234089Gq
    public final void updateDataWhenUserUpdate(ProfileComponents profileComponents) {
        o.LJIIIZ(profileComponents, "profileComponents");
        m mVar = profileComponents.bizData;
        if (mVar != null) {
            parseComponentBizData(mVar);
            updateComponentUIAndData();
        }
    }
}
