package com.ss.android.ugc.profile.platform.business.header.business.bio.container;

import X.C65352Pkq;
import X.C9NI;
import com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.container.BioBusinessInfoComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.container.BioUserMailLinkComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.relationlabel.ProfileHeaderRelationLabelComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.ProfileHeaderAddBioComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.ProfileHeaderTapToAddBioComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.ProfileHeaderBaseSignatureComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.ProfileHeaderSignatureTranslationComponent;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class ProfileHeaderBioComponent extends ProfileHeaderBioBaseComponent {
    public ProfileHeaderBioComponent() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void v3() {
        if (C9NI.LIZ()) {
            BaseContainerComponent.x3(this, "bio_signature", C65352Pkq.LIZ(ProfileHeaderSignatureTranslationComponent.class), null, 0, 12);
        } else {
            BaseContainerComponent.x3(this, "bio_signature", C65352Pkq.LIZ(ProfileHeaderBaseSignatureComponent.class), null, 0, 12);
        }
        BaseContainerComponent.x3(this, "bio_add_bio", C65352Pkq.LIZ(ProfileHeaderAddBioComponent.class), null, 0, 12);
        BaseContainerComponent.x3(this, "bio_tap_to_add_bio", C65352Pkq.LIZ(ProfileHeaderTapToAddBioComponent.class), null, 0, 12);
        BaseContainerComponent.x3(this, "bio_mail_link", C65352Pkq.LIZ(BioUserMailLinkComponent.class), null, 0, 12);
        BaseContainerComponent.x3(this, "bio_business_account", C65352Pkq.LIZ(BioBusinessInfoComponent.class), null, 0, 12);
        BaseContainerComponent.x3(this, "bio_relation_label", C65352Pkq.LIZ(ProfileHeaderRelationLabelComponent.class), null, 0, 12);
    }
}
