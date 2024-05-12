package com.ss.android.ugc.profile.platform.business.navbar.assemble.sub;

import X.C55096Ljo;
import X.C65352Pkq;
import com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.navbar.business.NavBarNicknameComponent;
import com.ss.android.ugc.profile.platform.business.navbar.business.other.NavBarOtherNicknameComponent;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class ProfileNavBarCenterComponent extends ProfileNavBarBaseComponent {
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void v3() {
        ProfileBaseAbility profileBaseAbility = (ProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileBaseAbility.class, null);
        if (profileBaseAbility != null && profileBaseAbility.L7()) {
            BaseContainerComponent.x3(this, "nav_bar_center_nickname", C65352Pkq.LIZ(NavBarNicknameComponent.class), null, 0, 4);
        } else {
            BaseContainerComponent.x3(this, "nav_bar_center_nickname", C65352Pkq.LIZ(NavBarOtherNicknameComponent.class), null, 0, 4);
        }
        BaseContainerComponent.x3(this, "nav_bar_base_item", C65352Pkq.LIZ(NavbarBaseUIComponent.class), null, 0, 12);
    }

    public ProfileNavBarCenterComponent() {
        new LinkedHashMap();
    }
}
