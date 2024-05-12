package com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.stitch;

import X.SMU;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.settings.account.BasePrivacyUserSettingViewModelV3;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class StitchViewModel extends BasePrivacyUserSettingViewModelV3 {
    public String LJLJL;

    public StitchViewModel() {
        super("stitch");
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final void iv0(int i, BaseResponse response) {
        o.LJIIIZ(response, "response");
        SMU.LIZIZ(i, this.LJLJJLL, this.LJLJL);
    }
}
