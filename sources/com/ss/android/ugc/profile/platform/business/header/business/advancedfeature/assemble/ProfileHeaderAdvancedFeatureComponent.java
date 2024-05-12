package com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.assemble;

import X.C65352Pkq;
import com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business.HeaderAdvancedFeatureOrderCenterComponent;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business.HeaderAdvancedFeatureQAComponent;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business.ProfileAdvancedFeatureCollectionsComponent;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business.ProfileAdvancedFeatureGetLeadsComponent;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business.ProfileAdvancedFeatureLiveEventComponent;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business.ProfileAdvancedFeatureLiveSubscriptionComponent;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business.ProfileAdvancedFeatureShopComponent;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business.ProfileAdvancedFeatureShowcaseComponent;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business.ProfileAdvancedFeatureSocialConnectComponent;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business.ProfileAdvancedFeatureSupportingComponent;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business.ProfileAdvancedFeatureTippingComponent;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class ProfileHeaderAdvancedFeatureComponent extends ProfileHeaderAdvancedFeatureBaseComponent {
    public ProfileHeaderAdvancedFeatureComponent() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void v3() {
        BaseContainerComponent.x3(this, "advanced_feature_qna_profile", C65352Pkq.LIZ(HeaderAdvancedFeatureQAComponent.class), null, 0, 12);
        BaseContainerComponent.x3(this, "advanced_feature_order_center", C65352Pkq.LIZ(HeaderAdvancedFeatureOrderCenterComponent.class), null, 0, 12);
        BaseContainerComponent.x3(this, "advanced_feature_paid_collections", C65352Pkq.LIZ(ProfileAdvancedFeatureCollectionsComponent.class), null, 0, 12);
        BaseContainerComponent.x3(this, "advanced_feature_leads_gen", C65352Pkq.LIZ(ProfileAdvancedFeatureGetLeadsComponent.class), null, 0, 12);
        BaseContainerComponent.x3(this, "advanced_feature_live_events", C65352Pkq.LIZ(ProfileAdvancedFeatureLiveEventComponent.class), null, 0, 12);
        BaseContainerComponent.x3(this, "advanced_feature_social_entrance", C65352Pkq.LIZ(ProfileAdvancedFeatureSocialConnectComponent.class), null, 0, 12);
        BaseContainerComponent.x3(this, "advanced_feature_shop", C65352Pkq.LIZ(ProfileAdvancedFeatureShopComponent.class), null, 0, 12);
        BaseContainerComponent.x3(this, "advanced_feature_showcase", C65352Pkq.LIZ(ProfileAdvancedFeatureShowcaseComponent.class), null, 0, 12);
        BaseContainerComponent.x3(this, "advanced_feature_supporting", C65352Pkq.LIZ(ProfileAdvancedFeatureSupportingComponent.class), null, 0, 12);
        BaseContainerComponent.x3(this, "advanced_feature_tipping", C65352Pkq.LIZ(ProfileAdvancedFeatureTippingComponent.class), null, 0, 12);
        BaseContainerComponent.x3(this, "advanced_feature_live_subscription", C65352Pkq.LIZ(ProfileAdvancedFeatureLiveSubscriptionComponent.class), null, 0, 12);
    }
}
