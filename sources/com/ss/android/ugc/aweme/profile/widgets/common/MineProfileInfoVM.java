package com.ss.android.ugc.aweme.profile.widgets.common;

import X.C188727au;
import X.C214188as;
import X.C235049Ki;
import X.C237069Sc;
import X.C78404Ups;
import X.FMX;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.profile.model.User;

/* loaded from: classes5.dex */
public final class MineProfileInfoVM extends AssemViewModel<C235049Ki> {
    public final C214188as LJLIL = C78404Ups.LIZJ(this, C237069Sc.LJLIL);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C235049Ki defaultState() {
        return new C235049Ki(0);
    }

    public static void gv0(User user) {
        String str;
        C188727au c188727au = new C188727au();
        String str2 = null;
        if (user != null) {
            str2 = user.getUid();
        }
        c188727au.LJIIIZ("to_user_id", str2);
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        c188727au.LIZLLL(1, "is_success");
        if (user == null || (str = user.getRequestId()) == null) {
            str = "";
        }
        c188727au.LJIIIZ("log_pb", str);
        FMX.LJIIL("profile_request_response", c188727au.LIZ);
    }
}
