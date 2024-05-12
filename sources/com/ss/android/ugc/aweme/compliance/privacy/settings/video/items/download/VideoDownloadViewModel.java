package com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.download;

import X.AbstractC73672Svk;
import X.SPF;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.base.BaseVideoPrivacySettingViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoControl;

/* loaded from: classes13.dex */
public final class VideoDownloadViewModel extends BaseVideoPrivacySettingViewModel {
    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.video.base.BaseVideoPrivacySettingViewModel
    public final int ov0() {
        VideoControl videoControl = nv0().getVideoControl();
        if (videoControl != null) {
            return videoControl.preventDownloadType;
        }
        return 3;
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final AbstractC73672Svk<BaseResponse> jv0(int i) {
        return SPF.LIZ(nv0().getAid(), "download", Integer.valueOf(i));
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.video.base.BaseVideoPrivacySettingViewModel
    public final void pv0(int i) {
        VideoControl videoControl = nv0().getVideoControl();
        if (videoControl == null) {
            return;
        }
        videoControl.preventDownloadType = i;
    }
}
