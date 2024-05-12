package com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.permission;

import X.AbstractC73672Svk;
import X.C187227Wk;
import X.C221108m2;
import X.C2U8;
import X.C62822Ol8;
import X.C72036SOy;
import X.Z89;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class NowVisibilityViewModel extends BaseVisibilityViewModel {
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(C72036SOy.LJLIL);

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.video.base.BaseVideoPrivacySettingViewModel
    public final int ov0() {
        Aweme i6 = ((IAwemeService) this.LJLL.getValue()).i6(nv0().getAid());
        if (i6 == null) {
            i6 = nv0();
        }
        NowPostInfo nowPostInfo = i6.nowPostInfo;
        if (nowPostInfo != null) {
            return nowPostInfo.getPrivateStatus();
        }
        return 1;
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final AbstractC73672Svk<? extends BaseResponse> jv0(int i) {
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    i2 = 3;
                }
            } else {
                i2 = 2;
            }
        }
        return Z89.LIZIZ.setNowVisibility(nv0().getAid(), i2);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.video.base.BaseVideoPrivacySettingViewModel
    public final void pv0(int i) {
        int i2;
        NowPostInfo nowPostInfo;
        if (i == 2) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        NowPostInfo nowPostInfo2 = nv0().nowPostInfo;
        if (nowPostInfo2 != null) {
            nowPostInfo = NowPostInfo.copy$default(nowPostInfo2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(i2), null, null, 0, 0, null, false, null, null, null, null, 2146435071, null);
        } else {
            nowPostInfo = null;
        }
        nv0().nowPostInfo = nowPostInfo;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.video.base.BaseVideoPrivacySettingViewModel, com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final void iv0(int i, BaseResponse response) {
        o.LJIIIZ(response, "response");
        pv0(i);
        ((IAwemeService) this.LJLL.getValue()).R1(nv0());
        Aweme nv0 = nv0();
        Integer num = this.LJLILLLLZI;
        if (num != null) {
            num.intValue();
        }
        C2U8.LIZ(new C187227Wk(nv0, null));
    }
}
