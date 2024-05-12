package com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.container;

import X.C65352Pkq;
import com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.business.BioUserWebEmailComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.business.BioUserWebSiteComponent;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class BioUserMailLinkComponent extends BioUserMailLinkBaseComponent {
    public BioUserMailLinkComponent() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void v3() {
        BaseContainerComponent.x3(this, "bio_email", C65352Pkq.LIZ(BioUserWebEmailComponent.class), null, 0, 12);
        BaseContainerComponent.x3(this, "bio_link", C65352Pkq.LIZ(BioUserWebSiteComponent.class), null, 0, 12);
    }
}
