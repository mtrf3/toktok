package com.ss.android.ugc.profile.platform.business.header.assemble;

import X.C2318698c;
import X.C55096Ljo;
import X.C65352Pkq;
import X.C65776Prg;
import com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.assemble.ProfileHeaderAdvancedFeatureComponent;
import com.ss.android.ugc.profile.platform.business.header.business.avatar.assemble.ProfileHeaderAvatarComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.container.ProfileHeaderBioComponent;
import com.ss.android.ugc.profile.platform.business.header.business.cta.assemble.ProfileHeaderCTAComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.assemble.ProfileHeaderInfoComponent;
import com.ss.android.ugc.profile.platform.business.header.business.recommend.assemble.ProfileHeaderRecommendComponent;
import com.ss.android.ugc.profile.platform.business.header.business.toptips.assemble.ProfileHeaderTopTipsComponent;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class ProfileHeaderComponent extends ProfileHeaderBaseComponent {
    public ProfileHeaderComponent() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void v3() {
        int i;
        ProfileBaseAbility profileBaseAbility = (ProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileBaseAbility.class, null);
        if (profileBaseAbility != null && profileBaseAbility.L7()) {
            BaseContainerComponent.x3(this, "header_top_tips", C65352Pkq.LIZ(ProfileHeaderTopTipsComponent.class), null, 0, 4);
            BaseContainerComponent.x3(this, "header_avatar", C65352Pkq.LIZ(ProfileHeaderAvatarComponent.class), null, 1, 4);
            BaseContainerComponent.x3(this, "info", C65352Pkq.LIZ(ProfileHeaderInfoComponent.class), null, 2, 4);
            C65776Prg LIZ = C65352Pkq.LIZ(ProfileHeaderCTAComponent.class);
            if (C2318698c.LIZIZ()) {
                i = 5;
            } else {
                i = 3;
            }
            BaseContainerComponent.x3(this, "cta", LIZ, null, i, 4);
            BaseContainerComponent.x3(this, "recommend", C65352Pkq.LIZ(ProfileHeaderRecommendComponent.class), null, 0, 12);
            BaseContainerComponent.x3(this, "bio", C65352Pkq.LIZ(ProfileHeaderBioComponent.class), null, 0, 12);
            BaseContainerComponent.x3(this, "advanced_feature", C65352Pkq.LIZ(ProfileHeaderAdvancedFeatureComponent.class), null, 0, 12);
            return;
        }
        BaseContainerComponent.x3(this, "header_avatar", C65352Pkq.LIZ(ProfileHeaderAvatarComponent.class), null, 0, 4);
        BaseContainerComponent.x3(this, "info", C65352Pkq.LIZ(ProfileHeaderInfoComponent.class), null, 1, 4);
        BaseContainerComponent.x3(this, "cta", C65352Pkq.LIZ(ProfileHeaderCTAComponent.class), null, 2, 4);
        BaseContainerComponent.x3(this, "recommend", C65352Pkq.LIZ(ProfileHeaderRecommendComponent.class), null, 0, 12);
        BaseContainerComponent.x3(this, "bio", C65352Pkq.LIZ(ProfileHeaderBioComponent.class), null, 0, 12);
        BaseContainerComponent.x3(this, "advanced_feature", C65352Pkq.LIZ(ProfileHeaderAdvancedFeatureComponent.class), null, 0, 12);
    }
}
