package com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business;

import X.C234999Kd;
import X.C26335AVf;
import X.C44384HbQ;
import X.C46104I7o;
import X.C55096Ljo;
import X.C65352Pkq;
import X.C8VC;
import X.C8YN;
import X.InterfaceC235069Kk;
import X.TBT;
import android.view.View;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS186S0100000_4;

/* loaded from: classes5.dex */
public final class ProfileAdvancedFeatureLiveSubscriptionComponent extends HeaderAdvancedFeatureBaseUIComponent {
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
        C8YN.LJII(this, v3(), new TBT() { // from class: X.9AS
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C2304292o) obj).LJLIL;
            }
        }, null, new AqS186S0100000_4(this, 221), 6);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void componentClick() {
        User user;
        String str;
        super.componentClick();
        IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IProfileBaseAbility.class, null);
        if (iProfileBaseAbility != null) {
            iProfileBaseAbility.Cu("subscription", A3());
        }
        C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class));
        if (c234999Kd == null || (user = c234999Kd.LIZ) == null) {
            return;
        }
        if (A3()) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        C26335AVf.LJJIJIIJIL("livesdk_subscribe_icon_click", str, C46104I7o.LJJIIZI(user), "click_position", A3());
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent
    public final Integer componentIcon() {
        Integer componentIcon = super.componentIcon();
        if (componentIcon == null) {
            return Integer.valueOf(R.raw.icon_star_ring);
        }
        return componentIcon;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent
    public final String componentText() {
        String componentText = super.componentText();
        if (componentText == null) {
            return C44384HbQ.LJJZ(R.string.pd0);
        }
        return componentText;
    }
}
