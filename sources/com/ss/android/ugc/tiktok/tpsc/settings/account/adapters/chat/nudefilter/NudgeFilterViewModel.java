package com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.chat.nudefilter;

import X.C71976SMq;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.settings.account.BasePrivacyUserSettingViewModelV3;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class NudgeFilterViewModel extends BasePrivacyUserSettingViewModelV3 {
    public String LJLJL;

    public NudgeFilterViewModel() {
        super("dm_filter_nude");
        this.LJLJL = "privacy_and_safety_settings";
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final void iv0(int i, BaseResponse response) {
        o.LJIIIZ(response, "response");
        C71976SMq.LIZJ(i, this.LJLJL, "nude_filter", "user");
    }
}
