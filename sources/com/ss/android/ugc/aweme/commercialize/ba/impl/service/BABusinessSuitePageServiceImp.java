package com.ss.android.ugc.aweme.commercialize.ba.impl.service;

import X.A20;
import X.C237559Tz;
import X.C243079gN;
import X.C2T8;
import X.C58096Mr6;
import X.C58909NAb;
import X.C59895Nf1;
import X.NH3;
import X.NJP;
import X.OSZ;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBABusinessSuitePageService;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commerce.PotentialBizAccountInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BABusinessSuitePageServiceImp implements IBABusinessSuitePageService {
    public static IBABusinessSuitePageService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IBABusinessSuitePageService.class, false);
        if (LIZ != null) {
            return (IBABusinessSuitePageService) LIZ;
        }
        if (C58096Mr6.LLLIZZ == null) {
            synchronized (IBABusinessSuitePageService.class) {
                if (C58096Mr6.LLLIZZ == null) {
                    C58096Mr6.LLLIZZ = new BABusinessSuitePageServiceImp();
                }
            }
        }
        return C58096Mr6.LLLIZZ;
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBABusinessSuitePageService
    public final void LIZIZ() {
        List<String> list = C2T8.LIZ;
        if (list == null || list.isEmpty()) {
            return;
        }
        String accessKey = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getAccessKey();
        C58909NAb.LIZ.getClass();
        A20 LIZIZ = NH3.LIZIZ();
        if (LIZIZ != null) {
            ((NJP) LIZIZ).LJI(accessKey, list);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBABusinessSuitePageService
    public final void LIZ(Context context, User user) {
        PotentialBizAccountInfo potentialBizAccountInfo;
        o.LJIIIZ(user, "user");
        if (user.getAccountType() != 3 && (potentialBizAccountInfo = user.getPotentialBizAccountInfo()) != null && potentialBizAccountInfo.isPotentialBA()) {
            SmartRouter.buildRoute(context, C243079gN.LIZ(4, "business_suite_setting")).open();
        } else {
            C59895Nf1.LIZLLL(context, "//setting/business_suite", "enter_from", "personal_homepage");
        }
        new C237559Tz().LJI("ttelite_setting_business_entry_clicked", new OSZ[0]);
    }
}
