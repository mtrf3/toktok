package com.ss.android.ugc.profile.platform.business.navbar.assemble.sub;

import X.C55096Ljo;
import X.C65352Pkq;
import com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.navbar.business.NavBarActivityComponent;
import com.ss.android.ugc.profile.platform.business.navbar.business.NavBarBackComponent;
import com.ss.android.ugc.profile.platform.business.navbar.business.NavBarFindFriendsComponent;
import com.ss.android.ugc.profile.platform.business.navbar.business.data.NavBarQrCodeComponent;
import com.ss.android.ugc.profile.platform.business.navbar.business.other.NavBarOtherBackComponent;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class ProfileNavBarStartComponent extends ProfileNavBarBaseComponent {
    public ProfileNavBarStartComponent() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void v3() {
        ProfileBaseAbility profileBaseAbility = (ProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileBaseAbility.class, null);
        if (profileBaseAbility != null && profileBaseAbility.L7()) {
            BaseContainerComponent.x3(this, "nav_bar_start_back", C65352Pkq.LIZ(NavBarBackComponent.class), null, 0, 4);
            BaseContainerComponent.x3(this, "nav_bar_start_find_friends", C65352Pkq.LIZ(NavBarFindFriendsComponent.class), null, 0, 12);
            BaseContainerComponent.x3(this, "nav_bar_start_share_profile", C65352Pkq.LIZ(NavBarQrCodeComponent.class), null, 0, 12);
            BaseContainerComponent.x3(this, "nav_bar_start_activity", C65352Pkq.LIZ(NavBarActivityComponent.class), null, 0, 12);
            BaseContainerComponent.x3(this, "nav_bar_base_item", C65352Pkq.LIZ(NavbarBaseUIComponent.class), null, 0, 12);
            return;
        }
        BaseContainerComponent.x3(this, "nav_bar_start_back", C65352Pkq.LIZ(NavBarOtherBackComponent.class), null, 0, 4);
    }
}
