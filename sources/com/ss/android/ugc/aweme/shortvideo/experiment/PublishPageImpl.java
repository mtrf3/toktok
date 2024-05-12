package com.ss.android.ugc.aweme.shortvideo.experiment;

import X.C00F;
import X.C44296Ha0;
import X.C58096Mr6;
import X.C60903NvH;
import X.GTE;
import android.view.View;
import com.ss.android.ugc.aweme.publish.IPublishPageService;
import com.zhiliaoapp.musically.R;

/* loaded from: classes8.dex */
public final class PublishPageImpl implements IPublishPageService {
    public static IPublishPageService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IPublishPageService.class, false);
        if (LIZ != null) {
            return (IPublishPageService) LIZ;
        }
        if (C58096Mr6.Y6 == null) {
            synchronized (IPublishPageService.class) {
                if (C58096Mr6.Y6 == null) {
                    C58096Mr6.Y6 = new PublishPageImpl();
                }
            }
        }
        return C58096Mr6.Y6;
    }

    @Override // com.ss.android.ugc.aweme.publish.IPublishPageService
    public final boolean LIZ() {
        if (C00F.LIZ(31744, 0, "kcc_notice_show_in_KR", true) != 1) {
            return false;
        }
        C60903NvH.LJIIJJI().getRegionService();
        if (!C44296Ha0.LIZ().equals("KR")) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.publish.IPublishPageService
    public final void LIZIZ(GTE gte) {
        boolean z = true;
        if (C00F.LIZ(31744, 0, "kcc_notice_show_in_KR", true) == 0) {
            return;
        }
        C60903NvH.LJIIJJI().getRegionService();
        if (!C44296Ha0.LIZ().equals("KR")) {
            return;
        }
        if (gte.getVisibility() != 0) {
            z = false;
        }
        View findViewById = gte.getRootView().findViewById(R.id.fdn);
        if (findViewById == null) {
            return;
        }
        if (z) {
            findViewById.setVisibility(8);
        } else {
            findViewById.setVisibility(0);
        }
    }
}
