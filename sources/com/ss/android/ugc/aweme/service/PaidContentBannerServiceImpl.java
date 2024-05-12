package com.ss.android.ugc.aweme.service;

import X.C19N;
import X.C235769Nc;
import X.C254639z1;
import X.C254649z2;
import X.C47261Igj;
import X.C58096Mr6;
import X.C65777Prh;
import X.HG3;
import X.RBX;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.profile.model.PaidContentBannerCampaign;
import com.ss.android.ugc.aweme.profile.model.PaidContentBannerSetting;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class PaidContentBannerServiceImpl implements IPaidContentBannerService {
    public List<PaidContentBannerCampaign> LIZ = new ArrayList();
    public boolean LIZIZ;

    public static IPaidContentBannerService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IPaidContentBannerService.class, false);
        if (LIZ != null) {
            return (IPaidContentBannerService) LIZ;
        }
        if (C58096Mr6.Z4 == null) {
            synchronized (IPaidContentBannerService.class) {
                if (C58096Mr6.Z4 == null) {
                    C58096Mr6.Z4 = new PaidContentBannerServiceImpl();
                }
            }
        }
        return C58096Mr6.Z4;
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentBannerService
    public final void LIZ(C235769Nc c235769Nc) {
        if (!this.LIZ.isEmpty()) {
            this.LIZIZ = true;
            PopupManager.LJIIL(new C254639z1(c235769Nc, (PaidContentBannerCampaign) ListProtector.get(this.LIZ, 0)));
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentBannerService
    public final boolean LIZIZ(boolean z) {
        List<PaidContentBannerCampaign> list;
        PaidContentBannerSetting paidContentBannerSetting = ((RBX) HG3.LJIILL()).getCurUser().getPaidContentBannerSetting();
        if (paidContentBannerSetting != null) {
            list = paidContentBannerSetting.getPaidContentBannerCampaignList();
        } else {
            list = null;
        }
        if (list != null && (!list.isEmpty())) {
            int size = list.size();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (PaidContentBannerCampaign paidContentBannerCampaign : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    PaidContentBannerCampaign paidContentBannerCampaign2 = paidContentBannerCampaign;
                    if (i < size && !C254649z2.LIZ(paidContentBannerCampaign2.getPaidContentBannerCampaignId())) {
                        arrayList.add(paidContentBannerCampaign);
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            this.LIZ = C65777Prh.LIZIZ(arrayList);
        }
        if (!this.LIZIZ && z && C19N.LJ("creator_m10n_android_paid_content_paid_content_profile_banner_is_enabled", false) && (!this.LIZ.isEmpty()) && ((PaidContentBannerCampaign) ListProtector.get(this.LIZ, 0)).getPaidContentBannerCampaignId().length() > 0) {
            return true;
        }
        return false;
    }
}
