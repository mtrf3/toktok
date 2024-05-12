package com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.comment;

import X.AbstractC73672Svk;
import X.C174046sK;
import X.C2U8;
import X.SPF;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.base.BaseVideoPrivacySettingViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class VideoCommentViewModel extends BaseVideoPrivacySettingViewModel {
    public Integer LJLJL;

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.video.base.BaseVideoPrivacySettingViewModel
    public final int ov0() {
        return nv0().getCommentSetting();
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final AbstractC73672Svk<BaseResponse> jv0(int i) {
        return SPF.LIZ(nv0().getAid(), "comment", Integer.valueOf(i));
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.video.base.BaseVideoPrivacySettingViewModel
    public final void pv0(int i) {
        nv0().setCommentSetting(i);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.video.base.BaseVideoPrivacySettingViewModel, com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final void iv0(int i, BaseResponse response) {
        o.LJIIIZ(response, "response");
        pv0(i);
        String aid = nv0().getAid();
        if (aid == null) {
            aid = "";
        }
        C174046sK c174046sK = new C174046sK(8, aid);
        c174046sK.LIZ(this.LJLJL.intValue());
        c174046sK.LJLJI = nv0();
        C2U8.LIZ(c174046sK);
    }
}
