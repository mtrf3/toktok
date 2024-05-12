package com.ss.android.ugc.aweme.settingsrequest;

import X.AbstractC36700Eam;
import X.C09900aA;
import X.C31094CIg;
import X.C35232DsC;
import X.C36089EEj;
import X.C36093EEn;
import X.C36698Eak;
import X.C36826Eco;
import X.C38458F7m;
import X.C38459F7n;
import X.C51784KUa;
import X.C58096Mr6;
import X.FGR;
import X.FH5;
import Y.ACallableS83S0200000_6;
import android.content.Context;
import com.ss.android.ugc.aweme.request_combine.request.individual.FetchUnifiedSettingRequest;
import com.ss.android.ugc.aweme.setting.ISettingManagerService;
import com.ss.android.ugc.aweme.settingsrequest.api.FetchABTestCommonRequest;

/* loaded from: classes7.dex */
public final class SettingManagerServiceImpl implements ISettingManagerService {
    public static ISettingManagerService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(ISettingManagerService.class, false);
        if (LIZ != null) {
            return (ISettingManagerService) LIZ;
        }
        if (C58096Mr6.F6 == null) {
            synchronized (ISettingManagerService.class) {
                if (C58096Mr6.F6 == null) {
                    C58096Mr6.F6 = new SettingManagerServiceImpl();
                }
            }
        }
        return C58096Mr6.F6;
    }

    @Override // com.ss.android.ugc.aweme.setting.ISettingManagerService
    public final void LIZ(int i) {
        if (!C35232DsC.LIZ()) {
            FH5.LIZIZ().getClass();
            C36093EEn.LIZ.getClass();
            C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
            LJIIIZ.LIZIZ(new FetchUnifiedSettingRequest(i), true);
            LJIIIZ.LIZJ();
        } else if (i == 1 || i == 2) {
            C51784KUa.LIZ();
        }
        C36093EEn.LIZ.getClass();
        C36089EEj LJIIIZ2 = C36093EEn.LJIIIZ();
        LJIIIZ2.LIZIZ(new FetchABTestCommonRequest(), true);
        LJIIIZ2.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.setting.ISettingManagerService
    public final void LIZIZ(Context context) {
        C36826Eco c36826Eco = AbstractC36700Eam.LJLJJL;
        c36826Eco.getClass();
        FH5.LIZIZ().getClass();
        C38458F7m c38458F7m = new C38458F7m();
        c38458F7m.LIZ = "settings_v3_fallback_to_v1";
        C09900aA.LJII(new C38459F7n(c38458F7m));
        C36698Eak.LIZIZ();
        C31094CIg LIZ = C31094CIg.LIZ();
        LIZ.getClass();
        synchronized (C31094CIg.class) {
            LIZ.LIZ = false;
        }
        FGR.LIZIZ().LIZ(c36826Eco.LJLILLLLZI, new ACallableS83S0200000_6(c36826Eco, context, 18), 0);
    }
}
