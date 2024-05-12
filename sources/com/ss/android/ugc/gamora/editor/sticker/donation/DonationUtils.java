package com.ss.android.ugc.gamora.editor.sticker.donation;

import X.C58096Mr6;
import com.ss.android.ugc.aweme.services.external.IDonationVendorService;
import defpackage.e1;

/* loaded from: classes7.dex */
public final class DonationUtils implements IDonationVendorService {
    public static IDonationVendorService LIZ() {
        Object LIZ = C58096Mr6.LIZ(IDonationVendorService.class, false);
        if (LIZ != null) {
            return (IDonationVendorService) LIZ;
        }
        if (C58096Mr6.B8 == null) {
            synchronized (IDonationVendorService.class) {
                if (C58096Mr6.B8 == null) {
                    C58096Mr6.B8 = new DonationUtils();
                }
            }
        }
        return C58096Mr6.B8;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IDonationVendorService
    public final boolean enableDonationPercentService() {
        return e1.LIZ(31744, "enable_tiktok_percent_migration", true, false);
    }
}
