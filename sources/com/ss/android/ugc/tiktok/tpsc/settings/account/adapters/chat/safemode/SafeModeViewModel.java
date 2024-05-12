package com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.chat.safemode;

import X.C71909SKb;
import X.C71976SMq;
import X.C72028SOq;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.settings.account.BasePrivacyUserSettingViewModelV3;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SafeModeViewModel extends BasePrivacyUserSettingViewModelV3 {
    public boolean LJLJL;
    public final String LJLJLJ;

    public SafeModeViewModel() {
        super("dm_safe_mode");
        this.LJLJLJ = "privacy_and_safety_settings";
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final void iv0(int i, BaseResponse response) {
        o.LJIIIZ(response, "response");
        C71976SMq.LIZJ(i, this.LJLJLJ, "filtered_request", "user");
        C71909SKb.LIZ.getClass();
        C71909SKb.LIZJ().LIZ();
        C72028SOq.LJIILIIL();
    }
}
