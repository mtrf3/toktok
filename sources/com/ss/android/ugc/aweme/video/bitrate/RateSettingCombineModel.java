package com.ss.android.ugc.aweme.video.bitrate;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.android.ugc.aweme.simkit.model.hwdec.PlayerTypeAbConfigV2;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class RateSettingCombineModel extends BaseCombineMode {

    @InterfaceC65349Pkn("body")
    public RateSettingsResponse<PlayerTypeAbConfigV2> rateSetting;

    public final RateSettingsResponse<PlayerTypeAbConfigV2> getRateSetting() {
        return this.rateSetting;
    }

    public RateSettingCombineModel(RateSettingsResponse<PlayerTypeAbConfigV2> rateSetting) {
        o.LJIIIZ(rateSetting, "rateSetting");
        this.rateSetting = rateSetting;
    }

    public final void setRateSetting(RateSettingsResponse<PlayerTypeAbConfigV2> rateSettingsResponse) {
        o.LJIIIZ(rateSettingsResponse, "<set-?>");
        this.rateSetting = rateSettingsResponse;
    }
}
