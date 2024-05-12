package com.ss.android.ugc.aweme.influencer.ecommercelive.framework.serviceimpl;

import X.ASL;
import X.C221108m2;
import X.C27162AlK;
import X.C36576EXc;
import X.C48841JEv;
import X.C57093Mav;
import X.C58096Mr6;
import X.C62822Ol8;
import X.C62872dP;
import X.C88743e2;
import X.XKX;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.influencer.ecommercelive.IEcommerceInfluencerService;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.BillboardV2Fragment;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.HighlightsFragment;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class EcommerceInfluencerServiceImpl implements IEcommerceInfluencerService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C57093Mav.LJLIL);

    public static IEcommerceInfluencerService LJ() {
        Object LIZ = C58096Mr6.LIZ(IEcommerceInfluencerService.class, false);
        if (LIZ != null) {
            return (IEcommerceInfluencerService) LIZ;
        }
        if (C58096Mr6.w1 == null) {
            synchronized (IEcommerceInfluencerService.class) {
                if (C58096Mr6.w1 == null) {
                    C58096Mr6.w1 = new EcommerceInfluencerServiceImpl();
                }
            }
        }
        return C58096Mr6.w1;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.IEcommerceInfluencerService
    public final List<IInterceptor> LIZ() {
        return (List) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.IEcommerceInfluencerService
    public final void LIZIZ(String str, String productId) {
        o.LJIIIZ(productId, "productId");
        XKX.LIZLLL(C48841JEv.LIZ(C36576EXc.LIZIZ), null, null, new C62872dP(new C88743e2(), str, productId, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.IEcommerceInfluencerService
    public final void LIZJ(FragmentManager fragmentManager, Bundle bundle) {
        bundle.putLong("start_click_time", System.currentTimeMillis());
        ASL asl = new ASL();
        BillboardV2Fragment billboardV2Fragment = new BillboardV2Fragment();
        billboardV2Fragment.setArguments(bundle);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLILLLL = billboardV2Fragment;
        tuxSheet.LJZI = false;
        asl.LJI(1);
        int LIZIZ = (int) C27162AlK.LIZIZ();
        TuxSheet tuxSheet2 = asl.LIZ;
        tuxSheet2.LJLLLLLL = LIZIZ;
        tuxSheet2.LJZL = true;
        tuxSheet2.show(fragmentManager, BillboardV2Fragment.class.getName());
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.IEcommerceInfluencerService
    public final void LIZLLL(FragmentManager fragmentManager, Bundle bundle) {
        ASL asl = new ASL();
        HighlightsFragment highlightsFragment = new HighlightsFragment();
        highlightsFragment.setArguments(bundle);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLILLLL = highlightsFragment;
        tuxSheet.LJZI = false;
        tuxSheet.LLD = false;
        tuxSheet.LJLLJ = false;
        asl.LJI(1);
        int LIZIZ = (int) C27162AlK.LIZIZ();
        TuxSheet tuxSheet2 = asl.LIZ;
        tuxSheet2.LJLLLLLL = LIZIZ;
        tuxSheet2.LJZL = true;
        tuxSheet2.show(fragmentManager, HighlightsFragment.class.getName());
    }
}
