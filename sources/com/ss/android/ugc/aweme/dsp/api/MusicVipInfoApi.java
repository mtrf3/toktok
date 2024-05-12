package com.ss.android.ugc.aweme.dsp.api;

import X.AbstractC73672Svk;
import X.E8L;
import X.InterfaceC195737mD;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.dsp.subscribe.model.DspVipInfoResponse;

/* loaded from: classes10.dex */
public final class MusicVipInfoApi {
    public static MusicVipInfoOperatorApi LIZ;

    /* loaded from: classes10.dex */
    public interface MusicVipInfoOperatorApi {
        @E8L("tiktok/music/dsp/ttm/vip_info/v2/")
        AbstractC73672Svk<DspVipInfoResponse> getVipInfo(@InterfaceC64986Pew("scene") int i, @InterfaceC64986Pew("track_id") String str, @InterfaceC64986Pew("allow_play_full_song_in_tt") Boolean bool, @InterfaceC64986Pew("scene_context") String str2, @InterfaceC195737mD Object obj);
    }
}
