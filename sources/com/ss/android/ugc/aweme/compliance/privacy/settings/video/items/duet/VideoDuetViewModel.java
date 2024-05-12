package com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.duet;

import X.AbstractC73672Svk;
import X.C2U8;
import X.C55330Lna;
import X.C79146V4k;
import X.SPF;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.base.BaseVideoPrivacySettingViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class VideoDuetViewModel extends BaseVideoPrivacySettingViewModel {
    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.video.base.BaseVideoPrivacySettingViewModel
    public final int ov0() {
        if (C79146V4k.LJJII(1, nv0())) {
            return 1;
        }
        return nv0().getDuetSetting();
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final AbstractC73672Svk<BaseResponse> jv0(int i) {
        return SPF.LIZ(nv0().getAid(), "duet", Integer.valueOf(i));
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.video.base.BaseVideoPrivacySettingViewModel
    public final void pv0(int i) {
        nv0().setDuetSetting(i);
        nv0().setReactSetting(i);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.video.base.BaseVideoPrivacySettingViewModel, com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final void iv0(int i, BaseResponse response) {
        o.LJIIIZ(response, "response");
        pv0(i);
        C2U8.LIZ(new C55330Lna(nv0()));
    }
}
