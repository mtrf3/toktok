package com.ss.android.ugc.aweme.di;

import X.C100623xC;
import X.C30Z;
import X.C35154Dqw;
import X.C67125QWb;
import X.C77876UhM;
import X.EF7;
import X.FKM;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IIMEntranceService;
import com.ss.android.ugc.aweme.im.service.IIMService;

/* loaded from: classes2.dex */
public class ImEntranceService implements IIMEntranceService {
    @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IIMEntranceService
    public final void init(IIMService iIMService) {
        AwemeHostApplication LIZ = FKM.LIZ();
        if (iIMService == null) {
            return;
        }
        C100623xC c100623xC = new C100623xC();
        EF7.LIZJ();
        c100623xC.LIZJ = "https://api-va.tiktokv.com/aweme/v1/";
        c100623xC.LIZIZ = "https://im-va.tiktokv.com/";
        if (C35154Dqw.LIZ()) {
            c100623xC.LIZ = C30Z.LIZ;
        } else {
            c100623xC.LIZ = C67125QWb.LJLJL;
        }
        EF7.LIZ();
        iIMService.initialize(LIZ, c100623xC, new C77876UhM());
    }
}
