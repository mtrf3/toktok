package com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business;

import X.C0DC;
import X.C113554cx;
import X.C237429Tm;
import X.C246079lD;
import X.C55096Ljo;
import X.C8YN;
import X.C9JM;
import X.C9JN;
import X.OSZ;
import X.TBT;
import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.view.View;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.data.Icon;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.IHeaderAdvancedFeatureAbility;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business.data.OrderCenterData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class HeaderAdvancedFeatureOrderCenterComponent extends HeaderAdvancedFeatureBaseUIComponent {
    public boolean LJLJLJ;
    public String LJLJLLL;
    public OrderCenterData LJLL;
    public boolean LJLLI;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();

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
    public final void actionsAfterUpdateUI() {
        super.actionsAfterUpdateUI();
        C8YN.LJII(this, v3(), new TBT() { // from class: X.9HW
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C2304292o) obj).LJLIL;
            }
        }, null, new AqS186S0100000_4(this, 218), 6);
        ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
        if (profilePlatformVM != null) {
            profilePlatformVM.rv0(new AqS170S0100000_4(this, 820));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void componentClick() {
        String str;
        OrderCenterData orderCenterData = this.LJLL;
        if (orderCenterData != null && orderCenterData.getShowRedDot()) {
            this.LJLLI = true;
        }
        IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IProfileBaseAbility.class, null);
        if (iProfileBaseAbility != null) {
            iProfileBaseAbility.Cu("ordercenter", A3());
        }
        Context context = getContext();
        if (context != null) {
            C9JN LIZ = C246079lD.LIZ();
            String LIZ2 = C9JM.LIZ();
            Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("page_name", "personal_home_page"), new OSZ("previous_page", getEnterFrom()));
            OrderCenterData orderCenterData2 = this.LJLL;
            if (orderCenterData2 != null && orderCenterData2.getShowRedDot()) {
                str = "red_dot";
            } else {
                str = "";
            }
            LJJLIIIIJ.put("notice_type", str);
            LIZ.LJFF(context, LIZ2, this.LJLJLLL, LJJLIIIIJ);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void updateComponentUIAndData() {
        Icon icon;
        OrderCenterData orderCenterData = this.LJLL;
        if (orderCenterData != null) {
            icon = orderCenterData.getIcon();
        } else {
            icon = null;
        }
        IHeaderAdvancedFeatureAbility iHeaderAdvancedFeatureAbility = (IHeaderAdvancedFeatureAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderAdvancedFeatureAbility.class, null);
        if (iHeaderAdvancedFeatureAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderAdvancedFeatureAbility.yl(icon, str);
        }
        I3(C9JM.LIZIZ(null));
        E3(new ACListenerS24S0100000_4(this, 198));
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent
    public final Map<String, Boolean> x3() {
        String lowerCase = "HAS_MY_ORDER".toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return C0DC.LIZIZ(lowerCase, Boolean.valueOf(this.LJLJJI));
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent
    public final Integer componentIcon() {
        int i;
        Integer componentIcon = super.componentIcon();
        if (componentIcon != null) {
            i = componentIcon.intValue();
        } else {
            i = R.raw.icon_shopping_bag_tick;
        }
        return Integer.valueOf(i);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent
    public final String componentText() {
        String componentText = super.componentText();
        if (componentText == null) {
            return C9JM.LIZIZ(null);
        }
        return componentText;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final boolean shouldShowAfterDoubleCheck() {
        int LJI = C246079lD.LIZ().LJI();
        IECommerceService.LIZ.getClass();
        if (LJI != 2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void parseComponentBizData(m jsonObject) {
        String str;
        String str2;
        o.LJIIIZ(jsonObject, "jsonObject");
        OrderCenterData orderCenterData = (OrderCenterData) C237429Tm.LIZ(jsonObject.toString(), OrderCenterData.class);
        this.LJLL = orderCenterData;
        String str3 = null;
        if (orderCenterData != null) {
            str = orderCenterData.getOrderCenterSchema();
        } else {
            str = null;
        }
        this.LJLJLLL = str;
        C246079lD.LIZ().LJII(this.LJLJLLL);
        OrderCenterData orderCenterData2 = this.LJLL;
        if (orderCenterData2 != null) {
            str2 = orderCenterData2.getOrderCenterTitle();
        } else {
            str2 = null;
        }
        OrderCenterData orderCenterData3 = this.LJLL;
        if (orderCenterData3 != null) {
            str3 = orderCenterData3.getEntryName();
        }
        C9JM.LIZ = str2;
        C9JM.LIZIZ = str3;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC234089Gq
    public final void updateDataWhenUserUpdate(ProfileComponents profileComponents) {
        OrderCenterData orderCenterData;
        o.LJIIIZ(profileComponents, "profileComponents");
        if (!shouldShowAfterDoubleCheck()) {
            return;
        }
        super.updateDataWhenUserUpdate(profileComponents);
        boolean z = false;
        if (!this.LJLLI && (orderCenterData = this.LJLL) != null && orderCenterData.getShowRedDot()) {
            z = true;
        }
        IHeaderAdvancedFeatureAbility iHeaderAdvancedFeatureAbility = (IHeaderAdvancedFeatureAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderAdvancedFeatureAbility.class, null);
        if (iHeaderAdvancedFeatureAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderAdvancedFeatureAbility.Za0(str, z);
        }
    }
}
