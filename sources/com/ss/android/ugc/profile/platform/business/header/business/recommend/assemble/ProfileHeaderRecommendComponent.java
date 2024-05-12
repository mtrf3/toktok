package com.ss.android.ugc.profile.platform.business.header.business.recommend.assemble;

import X.C65352Pkq;
import com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.recommend.business.HeaderRecommendUserCardMineComponent;
import com.ss.android.ugc.profile.platform.business.header.business.recommend.business.HeaderRecommendUserCardUserComponent;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class ProfileHeaderRecommendComponent extends ProfileHeaderRecommendBaseComponent {
    public ProfileHeaderRecommendComponent() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void v3() {
        Class cls;
        ProfilePlatformViewModel E3 = E3();
        if (E3 != null && !E3.LJLJJL) {
            cls = HeaderRecommendUserCardUserComponent.class;
        } else {
            cls = HeaderRecommendUserCardMineComponent.class;
        }
        BaseContainerComponent.x3(this, "recommend_user_card", C65352Pkq.LIZ(cls), null, 0, 12);
    }
}
