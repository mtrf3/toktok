package com.ss.android.ugc.aweme.legoImp;

import X.C0RN;
import X.C58096Mr6;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.ss.android.ugc.aweme.anchor.service.CustomAnchorViewServicImpl;
import com.ss.android.ugc.aweme.anchor.service.ICustomAnchorViewService;
import com.ss.android.ugc.aweme.commercialize.ecommerce.service.ShoppingAdsServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import com.ss.android.ugc.aweme.experiment.IPaidContentAnchorService;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.paid.content.consumption.PaidContentAnchorService;
import com.ss.android.ugc.aweme.poi.service.PoiServiceImpl;
import java.util.List;

/* loaded from: classes11.dex */
public final class CustomAnchorInitTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "CustomAnchorInitTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        ICustomAnchorViewService iCustomAnchorViewService;
        IPaidContentAnchorService paidContentAnchorService;
        Object LIZ = C58096Mr6.LIZ(ICustomAnchorViewService.class, false);
        if (LIZ != null) {
            iCustomAnchorViewService = (ICustomAnchorViewService) LIZ;
        } else {
            if (C58096Mr6.LLIIIILZ == null) {
                synchronized (ICustomAnchorViewService.class) {
                    if (C58096Mr6.LLIIIILZ == null) {
                        C58096Mr6.LLIIIILZ = new CustomAnchorViewServicImpl();
                    }
                }
            }
            iCustomAnchorViewService = C58096Mr6.LLIIIILZ;
        }
        iCustomAnchorViewService.LIZ(ECommerceAnchorService.LJJJJI().LIZ());
        iCustomAnchorViewService.LIZ(ECommerceAnchorService.LJJJJI().LJIIIZ());
        iCustomAnchorViewService.LIZ(PoiServiceImpl.LIZIZ().LJJLJ());
        iCustomAnchorViewService.LIZ(CommonFeedServiceImpl.LJJIJLIJ().LIZ());
        iCustomAnchorViewService.LIZ(CommonFeedServiceImpl.LJJIJLIJ().LJIL());
        iCustomAnchorViewService.LIZ(CommonFeedServiceImpl.LJJIJLIJ().LJIJJ());
        iCustomAnchorViewService.LIZ(ShoppingAdsServiceImpl.LJIIIZ().LJII());
        Object LIZ2 = C58096Mr6.LIZ(IPaidContentAnchorService.class, false);
        if (LIZ2 != null) {
            paidContentAnchorService = (IPaidContentAnchorService) LIZ2;
        } else {
            paidContentAnchorService = new PaidContentAnchorService();
        }
        iCustomAnchorViewService.LIZ(paidContentAnchorService.LIZ());
    }
}
