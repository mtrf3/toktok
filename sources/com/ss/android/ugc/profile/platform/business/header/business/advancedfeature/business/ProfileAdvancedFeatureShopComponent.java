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
import com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business.data.ShopData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileAdvancedFeatureShopComponent extends HeaderAdvancedFeatureBaseUIComponent {
    public boolean LJLJLLL;
    public String LJLL;
    public ShopData LJLLI;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public final Map<String, Object> LJLJLJ = new LinkedHashMap();

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
        C8YN.LJII(this, v3(), new TBT() { // from class: X.9HN
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C2304292o) obj).LJLIL;
            }
        }, null, new AqS186S0100000_4(this, 222), 6);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent
    public final Map<String, Boolean> x3() {
        String lowerCase = "HAS_SHOP".toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return C0DC.LIZIZ(lowerCase, Boolean.valueOf(this.LJLJJI));
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void componentClick() {
        String str;
        String str2;
        IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IProfileBaseAbility.class, null);
        if (iProfileBaseAbility != null) {
            iProfileBaseAbility.Cu("shop", A3());
        }
        Context context = getContext();
        if (context != null) {
            IECommerceShowcaseService LJIIIZ = ECommerceShowcaseService.LJIIIZ();
            ShopData shopData = this.LJLLI;
            if (shopData == null || (str = shopData.getShopSchema()) == null) {
                str = "";
            }
            String str3 = this.LJLL;
            boolean A3 = A3();
            if (A3()) {
                str2 = "personal_homepage";
            } else {
                str2 = "others_homepage";
            }
            LJIIIZ.LJI(context, str, str3, A3, str2, null, null, this.LJLJLJ);
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
            return C44384HbQ.LJJZ(R.string.feg);
        }
        return componentText;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void parseComponentBizData(m jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
        this.LJLLI = (ShopData) C75792yF.LIZ(jsonObject.toString(), ShopData.class);
    }
}
