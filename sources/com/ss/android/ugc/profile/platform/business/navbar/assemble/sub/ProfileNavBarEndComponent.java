package com.ss.android.ugc.profile.platform.business.navbar.assemble.sub;

import X.C55096Ljo;
import X.C65352Pkq;
import com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.navbar.business.NavBarLiveComponent;
import com.ss.android.ugc.profile.platform.business.navbar.business.NavBarSettingComponent;
import com.ss.android.ugc.profile.platform.business.navbar.business.NavBarViewerEntranceComponent;
import com.ss.android.ugc.profile.platform.business.navbar.business.other.NavBarBellComponent;
import com.ss.android.ugc.profile.platform.business.navbar.business.other.NavBarMoreComponent;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class ProfileNavBarEndComponent extends ProfileNavBarBaseComponent {
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void v3() {
        ProfileBaseAbility profileBaseAbility = (ProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileBaseAbility.class, null);
        if (profileBaseAbility != null && profileBaseAbility.L7()) {
            BaseContainerComponent.x3(this, "nav_bar_end_live", C65352Pkq.LIZ(NavBarLiveComponent.class), null, 0, 12);
            BaseContainerComponent.x3(this, "nav_bar_end_viewer_entrance", C65352Pkq.LIZ(NavBarViewerEntranceComponent.class), null, 0, 12);
            BaseContainerComponent.x3(this, "nav_bar_end_settings", C65352Pkq.LIZ(NavBarSettingComponent.class), null, 2, 4);
            BaseContainerComponent.x3(this, "nav_bar_base_item", C65352Pkq.LIZ(NavbarBaseUIComponent.class), null, 0, 12);
            return;
        }
        BaseContainerComponent.x3(this, "nav_bar_end_bell", C65352Pkq.LIZ(NavBarBellComponent.class), null, 0, 12);
        BaseContainerComponent.x3(this, "nav_bar_end_more", C65352Pkq.LIZ(NavBarMoreComponent.class), null, 1, 4);
    }

    public ProfileNavBarEndComponent() {
        new LinkedHashMap();
    }
}
