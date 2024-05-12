package com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business;

import X.C0DC;
import X.C44384HbQ;
import X.C55096Ljo;
import X.C75792yF;
import X.C8YN;
import X.TBT;
import android.content.Context;
import android.view.View;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ecommerce.showcase.ECommerceShowcaseService;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business.data.ShowCaseData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileAdvancedFeatureShowcaseComponent extends HeaderAdvancedFeatureBaseUIComponent {
    public boolean LJLJLJ;
    public String LJLLI;
    public String LJLLILLLL;
    public String LJLLJ;
    public ShowCaseData LJLLL;
    public final Map<Integer, View> LJLLLL = new LinkedHashMap();
    public final Map<String, Object> LJLJLLL = new LinkedHashMap();
    public String LJLL = "";

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLLL).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLL;
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
        C8YN.LJII(this, v3(), new TBT() { // from class: X.9HO
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C2304292o) obj).LJLIL;
            }
        }, null, new AqS186S0100000_4(this, 223), 6);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent
    public final Map<String, Boolean> x3() {
        String lowerCase = "HAS_SHOWCASE".toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return C0DC.LIZIZ(lowerCase, Boolean.valueOf(this.LJLJJI));
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void componentClick() {
        String str;
        String str2;
        User hv0;
        String uid;
        IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IProfileBaseAbility.class, null);
        if (iProfileBaseAbility != null) {
            iProfileBaseAbility.Cu("showcase", A3());
        }
        this.LJLJLLL.put("start_click_time", Long.valueOf(System.currentTimeMillis()));
        Context context = getContext();
        if (context != null) {
            IECommerceShowcaseService LJIIIZ = ECommerceShowcaseService.LJIIIZ();
            ShowCaseData showCaseData = this.LJLLL;
            String str3 = "";
            if (showCaseData == null || (str = showCaseData.getShowCaseSchema()) == null) {
                str = "";
            }
            ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
            if (profilePlatformVM != null && (hv0 = profilePlatformVM.hv0()) != null && (uid = hv0.getUid()) != null) {
                str3 = uid;
            }
            String str4 = this.LJLL;
            if (A3()) {
                str2 = "personal_homepage";
            } else {
                str2 = "others_homepage";
            }
            LJIIIZ.LJ(context, str, str3, str4, str2, "showcase_icon", A3(), 0, this.LJLL, this.LJLLI, this.LJLLILLLL, this.LJLLJ, this.LJLJLLL);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent
    public final Integer componentIcon() {
        Integer componentIcon = super.componentIcon();
        if (componentIcon == null) {
            return Integer.valueOf(R.raw.icon_bag);
        }
        return componentIcon;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent
    public final String componentText() {
        String componentText = super.componentText();
        if (componentText == null) {
            return C44384HbQ.LJJZ(R.string.fg2);
        }
        return componentText;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void updateComponentUIAndData() {
        String str;
        super.updateComponentUIAndData();
        ShowCaseData showCaseData = this.LJLLL;
        if (showCaseData != null) {
            str = showCaseData.getShowCaseSchema();
        } else {
            str = null;
        }
        if (str == null || ujb.o.LJJJJJL(str)) {
            C3(false);
        } else {
            requestShow();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void parseComponentBizData(m jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
        this.LJLLL = (ShowCaseData) C75792yF.LIZ(jsonObject.toString(), ShowCaseData.class);
    }
}
