package com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.sticker;

import X.AbstractC73672Svk;
import X.SPF;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.api.model.VideoItemSettings;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.base.BaseVideoPrivacySettingViewModel;

/* loaded from: classes13.dex */
public final class VideoStickerViewModel extends BaseVideoPrivacySettingViewModel {
    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.video.base.BaseVideoPrivacySettingViewModel
    public final void pv0(int i) {
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.video.base.BaseVideoPrivacySettingViewModel
    public final int ov0() {
        VideoItemSettings videoItemSettings = this.LJLJJLL;
        if (videoItemSettings != null) {
            return videoItemSettings.getSticker();
        }
        return 2;
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final AbstractC73672Svk<? extends BaseResponse> jv0(int i) {
        return SPF.LIZ(nv0().getAid(), "create_sticker", Integer.valueOf(i));
    }
}
