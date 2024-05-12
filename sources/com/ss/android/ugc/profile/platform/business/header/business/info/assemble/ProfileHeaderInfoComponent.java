package com.ss.android.ugc.profile.platform.business.header.business.info.assemble;

import X.C65352Pkq;
import com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.container.ProfileHeaderRelationInfoComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.container.ProfileHeaderAccountInfoComponent;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class ProfileHeaderInfoComponent extends ProfileHeaderInfoBaseComponent {
    public ProfileHeaderInfoComponent() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void v3() {
        BaseContainerComponent.x3(this, "user_info", C65352Pkq.LIZ(ProfileHeaderAccountInfoComponent.class), null, 0, 4);
        BaseContainerComponent.x3(this, "user_relation_info", C65352Pkq.LIZ(ProfileHeaderRelationInfoComponent.class), null, 1, 4);
    }
}
