package com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.stitch;

import X.AbstractC73672Svk;
import X.C220858ld;
import X.C79146V4k;
import X.SPF;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.base.BaseVideoPrivacySettingViewModel;

/* loaded from: classes13.dex */
public final class VideoStitchViewModel extends BaseVideoPrivacySettingViewModel {
    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.video.base.BaseVideoPrivacySettingViewModel
    public final int ov0() {
        if (C79146V4k.LJJII(2, nv0()) || C220858ld.LJ(nv0())) {
            return 1;
        }
        return nv0().getStitchSetting();
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final AbstractC73672Svk<BaseResponse> jv0(int i) {
        return SPF.LIZ(nv0().getAid(), "stitch", Integer.valueOf(i));
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.video.base.BaseVideoPrivacySettingViewModel
    public final void pv0(int i) {
        nv0().setStitchSetting(i);
    }
}
