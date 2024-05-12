package com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.videoviews;

import X.C07250Qf;
import X.C0N3;
import X.C71909SKb;
import X.C71969SMj;
import X.C72028SOq;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.settings.account.BasePrivacyUserSettingViewModelV3;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class VideoViewHistorySettingViewModel extends BasePrivacyUserSettingViewModelV3 {
    public VideoViewHistorySettingViewModel() {
        super("video_view_history");
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final void iv0(int i, BaseResponse response) {
        String str;
        o.LJIIIZ(response, "response");
        if (i != 1) {
            if (i != 2) {
                str = "";
            } else {
                str = "off";
            }
        } else {
            str = "on";
        }
        C72028SOq LIZ = C0N3.LIZ(C71909SKb.LIZ);
        C71969SMj c71969SMj = new C71969SMj();
        c71969SMj.LIZIZ("enter_from", "privacy_and_safety_settings");
        c71969SMj.LIZIZ("to_status", str);
        Map<String, String> map = c71969SMj.LIZ;
        C07250Qf.LIZLLL(map, "newBuilder()\n           …               .builder()", LIZ, "change_video_views_status", map);
    }
}
