package com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.container;

import X.C65352Pkq;
import com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.business.BioBusinessAddressComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.business.BioBusinessAppDownloadComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.business.BioBusinessContactComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.business.BioBusinessCouponComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.business.BioBusinessEmailComponent;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class BioBusinessInfoComponent extends BioBusinessInfoBaseComponent {
    public BioBusinessInfoComponent() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void v3() {
        BaseContainerComponent.x3(this, "bio_business_account_email", C65352Pkq.LIZ(BioBusinessEmailComponent.class), null, 0, 12);
        BaseContainerComponent.x3(this, "bio_business_account_app_download", C65352Pkq.LIZ(BioBusinessAppDownloadComponent.class), null, 0, 12);
        BaseContainerComponent.x3(this, "bio_business_account_phone", C65352Pkq.LIZ(BioBusinessContactComponent.class), null, 0, 12);
        BaseContainerComponent.x3(this, "bio_business_account_address", C65352Pkq.LIZ(BioBusinessAddressComponent.class), null, 0, 12);
        BaseContainerComponent.x3(this, "bio_business_account_coupon", C65352Pkq.LIZ(BioBusinessCouponComponent.class), null, 0, 12);
    }
}
