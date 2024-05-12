package com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.downloads;

import X.C71948SLo;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.settings.account.BasePrivacyUserSettingViewModelV3;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class DownloadsViewModel extends BasePrivacyUserSettingViewModelV3 {
    public DownloadsViewModel() {
        super("download");
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final void iv0(int i, BaseResponse response) {
        o.LJIIIZ(response, "response");
        C71948SLo.LIZ(i);
    }
}
