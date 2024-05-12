package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.qa;

import X.AbstractC73672Svk;
import X.C2U8;
import X.C53833LAv;
import X.C77119UOl;
import X.C9VE;
import X.EA9;
import X.SLD;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class QAProfileEntranceViewModel extends BasePrivacySettingViewModel {
    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final AbstractC73672Svk<BaseResponse> jv0(int i) {
        return C77119UOl.LJIJ(EA9.LIZ.setQAStatus(i), "/tiktok/v1/forum/user/settings/").LJIJJLI(C53833LAv.LJLIL).LJIJJ(SLD.LJLIL);
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final void iv0(int i, BaseResponse response) {
        o.LJIIIZ(response, "response");
        C2U8.LIZ(new C9VE());
    }
}
