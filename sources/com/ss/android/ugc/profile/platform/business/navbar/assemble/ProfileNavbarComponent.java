package com.ss.android.ugc.profile.platform.business.navbar.assemble;

import X.C65352Pkq;
import com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.navbar.assemble.sub.ProfileNavBarCenterComponent;
import com.ss.android.ugc.profile.platform.business.navbar.assemble.sub.ProfileNavBarEndComponent;
import com.ss.android.ugc.profile.platform.business.navbar.assemble.sub.ProfileNavBarStartComponent;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class ProfileNavbarComponent extends ProfileNavBarRootComponent {
    public ProfileNavbarComponent() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void v3() {
        BaseContainerComponent.x3(this, "nav_bar_start", C65352Pkq.LIZ(ProfileNavBarStartComponent.class), null, 0, 4);
        BaseContainerComponent.x3(this, "nav_bar_center", C65352Pkq.LIZ(ProfileNavBarCenterComponent.class), null, 1, 4);
        BaseContainerComponent.x3(this, "nav_bar_end", C65352Pkq.LIZ(ProfileNavBarEndComponent.class), null, 2, 4);
    }
}
