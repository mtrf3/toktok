package com.ss.android.ugc.aweme.feed.assem.duetbutton;

import X.C208928Hw;
import X.C220858ld;
import X.C235779Nd;
import X.C33Q;
import X.C78996UzQ;
import X.C80S;
import X.C85990Xow;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.DuetHelperKt;
import com.ss.android.ugc.aweme.services.BaseUserService;

/* loaded from: classes4.dex */
public final class VideoDuetButtonViewModel extends FeedBaseViewModel<C208928Hw> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C208928Hw();
    }

    public static boolean kv0(Aweme aweme) {
        boolean z;
        boolean z2;
        if (aweme == null || !BaseUserService.createIUserServicebyMonsterPlugin(false).isLogin() || aweme.getAwemeRawAd() != null) {
            return false;
        }
        boolean LJJIIZI = C78996UzQ.LJJIIZI(aweme);
        boolean LIZ = C220858ld.LIZ(aweme);
        if (C85990Xow.LJIIIZ() && !C235779Nd.LIZ.LIZ().LIZ().booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        boolean LJIILLIIL = CommerceMediaServiceImpl.LIZJ().LJIILLIIL(aweme.getMusic());
        boolean LIZJ = C80S.LIZJ(aweme);
        if (aweme.getAwemeType() == 13) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((LIZJ && !LJJIIZI) || z2 || !DuetHelperKt.canAddDuet(aweme, LJJIIZI) || DuetHelperKt.setGrayForDuet(aweme, LJJIIZI, LIZ, z, LJIILLIIL)) {
            return false;
        }
        return true;
    }
}
