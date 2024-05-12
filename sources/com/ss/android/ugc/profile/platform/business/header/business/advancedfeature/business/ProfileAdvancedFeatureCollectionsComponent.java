package com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business;

import X.C0DC;
import X.C19N;
import X.C232409Ae;
import X.C232459Aj;
import X.C25589A2n;
import X.C44384HbQ;
import X.C55096Ljo;
import X.C8YN;
import X.HG3;
import X.RBX;
import X.TBT;
import X.X1D;
import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.data.Action;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileAdvancedFeatureCollectionsComponent extends HeaderAdvancedFeatureBaseUIComponent {
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
        C8YN.LJII(this, v3(), new TBT() { // from class: X.9Ad
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C2304292o) obj).LJLIL;
            }
        }, null, new AqS186S0100000_4(this, 219), 6);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent
    public final Map<String, Boolean> x3() {
        String lowerCase = "HAS_COLLECTIONS".toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return C0DC.LIZIZ(lowerCase, Boolean.valueOf(this.LJLJJI));
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void componentClick() {
        String str;
        String str2;
        C232459Aj c232459Aj;
        ProfileComponents profileComponents;
        ProfileComponents profileComponents2;
        List<Action> list;
        UserProfileInfo userProfileInfo;
        String uid;
        UserProfileInfo userProfileInfo2;
        Context context = getContext();
        if (context != null) {
            if (A3()) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            StringBuilder LIZ = X1D.LIZ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("aweme://paidcontent/collections?creator_uid=");
            ProfileCommonInfo commonInfo = getCommonInfo();
            String str3 = "";
            if (commonInfo == null || (userProfileInfo2 = commonInfo.getUserProfileInfo()) == null || (str2 = userProfileInfo2.getUid()) == null) {
                str2 = "";
            }
            LIZ2.append(str2);
            LIZ2.append("&enter_from=");
            LIZ2.append(str);
            LIZ.append(X1D.LIZIZ(LIZ2));
            String LIZIZ = X1D.LIZIZ(LIZ);
            o.LJIIIIZZ(LIZIZ, "StringBuilder()\n        …              .toString()");
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            o.LJIIIIZZ(curUserId, "userService().curUserId");
            ProfileCommonInfo commonInfo2 = getCommonInfo();
            if (commonInfo2 != null && (userProfileInfo = commonInfo2.getUserProfileInfo()) != null && (uid = userProfileInfo.getUid()) != null) {
                str3 = uid;
            }
            C25589A2n.LJIIL(A3() ? 1 : 0, "click_collections_profile_entrance", str, curUserId, str3);
            IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IProfileBaseAbility.class, null);
            if (iProfileBaseAbility != null) {
                iProfileBaseAbility.Cu("collections", A3());
            }
            if (((C19N.LJ("creator_m10n_paid_content_auto_advancing_is_enabled", false) && !A3()) || (C232409Ae.LIZ() && A3())) && (c232459Aj = this.profileComponentData) != null && (profileComponents = c232459Aj.LJLILLLLZI) != null && profileComponents.actions != null) {
                if (c232459Aj != null && (profileComponents2 = c232459Aj.LJLILLLLZI) != null && (list = profileComponents2.actions) != null) {
                    initActions(list);
                    return;
                }
                return;
            }
            SmartRouter.buildRoute(context, LIZIZ).open();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent
    public final Integer componentIcon() {
        Integer componentIcon = super.componentIcon();
        if (componentIcon == null) {
            return Integer.valueOf(R.raw.icon_series_dollar);
        }
        return componentIcon;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent
    public final String componentText() {
        String componentText = super.componentText();
        if (componentText == null) {
            return C44384HbQ.LJJZ(R.string.qnq);
        }
        return componentText;
    }
}
