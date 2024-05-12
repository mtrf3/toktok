package com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.story;

import X.SMV;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.settings.account.BasePrivacyUserSettingViewModelV3;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class StoryViewModel extends BasePrivacyUserSettingViewModelV3 {
    public StoryViewModel() {
        super("share_to_story");
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final void iv0(int i, BaseResponse response) {
        o.LJIIIZ(response, "response");
        SMV.LIZ(i);
    }
}
