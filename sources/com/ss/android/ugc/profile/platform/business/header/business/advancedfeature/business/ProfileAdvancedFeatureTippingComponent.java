package com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business;

import X.C0DC;
import X.C188727au;
import X.C44384HbQ;
import X.C55096Ljo;
import X.C72264SXs;
import X.C8YN;
import X.FMX;
import X.HG3;
import X.Q8U;
import X.RBX;
import X.TBT;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileAdvancedFeatureTippingComponent extends HeaderAdvancedFeatureBaseUIComponent {
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
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
        C8YN.LJII(this, v3(), new TBT() { // from class: X.9AL
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C2304292o) obj).LJLIL;
            }
        }, null, new AqS186S0100000_4(this, 226), 6);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent
    public final Map<String, Boolean> x3() {
        String lowerCase = "HAS_TIPS".toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return C0DC.LIZIZ(lowerCase, Boolean.valueOf(this.LJLJJI));
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void componentClick() {
        String str;
        UserProfileInfo userProfileInfo;
        super.componentClick();
        Context context = getContext();
        if (context != null) {
            ProfileCommonInfo commonInfo = getCommonInfo();
            if (commonInfo == null || (userProfileInfo = commonInfo.getUserProfileInfo()) == null || (str = userProfileInfo.getUid()) == null) {
                str = "";
            }
            C72264SXs.LIZ(context).LJIIIIZZ(str, "tip_uid");
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", getEnterFrom());
            c188727au.LJIIIZ("to_user_id", str);
            c188727au.LJIIIZ("enter_method", "click_button");
            c188727au.LJIIIZ("from_user_id", ((RBX) HG3.LJIILL()).getCurUserId());
            FMX.LJIIL("click_tips_button", c188727au.LIZ);
            IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IProfileBaseAbility.class, null);
            if (iProfileBaseAbility != null) {
                iProfileBaseAbility.Cu("tips", A3());
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent
    public final Integer componentIcon() {
        Integer componentIcon = super.componentIcon();
        if (componentIcon == null) {
            return Integer.valueOf(R.raw.icon_tips);
        }
        return componentIcon;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent
    public final String componentText() {
        String componentText = super.componentText();
        if (componentText == null) {
            return C44384HbQ.LJJZ(R.string.scm);
        }
        return componentText;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void updateComponentUIAndData() {
        Resources resources;
        String string;
        UserProfileInfo userProfileInfo;
        String username;
        Resources resources2;
        String string2;
        super.updateComponentUIAndData();
        String str = "";
        if (!A3()) {
            ProfileCommonInfo commonInfo = getCommonInfo();
            if (commonInfo != null && (userProfileInfo = commonInfo.getUserProfileInfo()) != null && (username = userProfileInfo.getUsername()) != null) {
                Context context = getContext();
                if (context != null && (resources2 = context.getResources()) != null && (string2 = resources2.getString(R.string.a6i)) != null) {
                    str = Q8U.LIZIZ(new Object[]{username}, 1, string2, "format(this, *args)");
                }
                F3(str);
                return;
            }
            return;
        }
        Context context2 = getContext();
        if (context2 != null && (resources = context2.getResources()) != null && (string = resources.getString(R.string.a6h)) != null) {
            str = string;
        }
        F3(str);
    }
}
