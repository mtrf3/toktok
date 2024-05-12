package com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.container;

import X.C65352Pkq;
import com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.business.RelationFollowerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.business.RelationFollowingComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.business.RelationLikeComponent;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class ProfileHeaderRelationInfoComponent extends ProfileHeaderRelationBaseComponent {
    public ProfileHeaderRelationInfoComponent() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void v3() {
        BaseContainerComponent.x3(this, "relation_info_following", C65352Pkq.LIZ(RelationFollowingComponent.class), null, 0, 4);
        BaseContainerComponent.x3(this, "relation_info_follower", C65352Pkq.LIZ(RelationFollowerComponent.class), null, 1, 4);
        BaseContainerComponent.x3(this, "relation_info_like", C65352Pkq.LIZ(RelationLikeComponent.class), null, 2, 4);
    }
}
