package com.ss.android.ugc.aweme.service.newusermode;

import X.C10K;
import X.C58096Mr6;
import X.E63;
import X.E6M;
import X.HG3;
import X.RBX;
import com.bytedance.keva.Keva;

/* loaded from: classes7.dex */
public final class NewUserModeService implements INewUserModeService {
    @Override // com.ss.android.ugc.aweme.service.newusermode.INewUserModeService
    public final void LIZIZ() {
        C10K.LIZJ(E6M.LJLIL);
    }

    public static INewUserModeService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(INewUserModeService.class, false);
        if (LIZ != null) {
            return (INewUserModeService) LIZ;
        }
        if (C58096Mr6.r5 == null) {
            synchronized (INewUserModeService.class) {
                if (C58096Mr6.r5 == null) {
                    C58096Mr6.r5 = new NewUserModeService();
                }
            }
        }
        return C58096Mr6.r5;
    }

    @Override // com.ss.android.ugc.aweme.service.newusermode.INewUserModeService
    public final void LIZ() {
        Keva keva = E63.LIZ;
        int i = keva.getInt("active_days", 1);
        if (((RBX) HG3.LJIILL()).isLogin() && !E63.LIZIZ() && !keva.contains("new_user_mode_days")) {
            keva.storeInt("new_user_mode_days", i);
        }
    }
}
