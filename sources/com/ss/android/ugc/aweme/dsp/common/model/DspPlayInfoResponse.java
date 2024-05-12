package com.ss.android.ugc.aweme.dsp.common.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.simkit.model.BaseResponse;

/* loaded from: classes22.dex */
public final class DspPlayInfoResponse extends BaseResponse {

    @InterfaceC65349Pkn("play_info")
    public final MusicPlayInfo playInfo = new MusicPlayInfo();

    public final MusicPlayInfo getPlayInfo() {
        return this.playInfo;
    }
}
