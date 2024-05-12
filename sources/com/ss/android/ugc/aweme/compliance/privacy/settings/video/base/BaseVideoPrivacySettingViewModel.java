package com.ss.android.ugc.aweme.compliance.privacy.settings.video.base;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.api.model.VideoItemSettings;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class BaseVideoPrivacySettingViewModel extends BasePrivacySettingViewModel {
    public Aweme LJLJJL;
    public VideoItemSettings LJLJJLL;

    public abstract int ov0();

    public abstract void pv0(int i);

    public final Aweme nv0() {
        Aweme aweme = this.LJLJJL;
        if (aweme != null) {
            return aweme;
        }
        o.LJIJI("aweme");
        throw null;
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public void iv0(int i, BaseResponse response) {
        o.LJIIIZ(response, "response");
        pv0(i);
    }
}
