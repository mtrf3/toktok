package com.ss.android.ugc.aweme.voiceconversion.repo;

import X.C64797Pbt;
import X.C76L;
import X.E8L;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import X.T9E;
import com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionDetailsResponse;

/* loaded from: classes13.dex */
public interface VoiceConversionApi {
    public static final T9E LIZ = T9E.LIZ;

    @E8L("/tiktok/sami/vcfilter/info/v1/")
    Object getVoiceDetailsInfo(@InterfaceC64986Pew("vc_filter_id") String str, InterfaceC67352kd<? super C64797Pbt<VoiceConversionDetailsResponse>> interfaceC67352kd);

    @E8L("/tiktok/sami/vcfilter/videolist/v1/")
    C76L<VoiceConversionDetailsResponse> getVoiceDetailsVideoListFuture(@InterfaceC64986Pew("vc_filter_id") String str, @InterfaceC64986Pew("video_list_count") Long l, @InterfaceC64986Pew("video_list_offset") Long l2);
}
