package com.ss.android.ugc.aweme.ttsvoice.repo;

import X.C64797Pbt;
import X.C76L;
import X.E8L;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import X.T9D;
import com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceDetailsResponse;
import java.util.List;

/* loaded from: classes13.dex */
public interface TTSVoiceApi {
    public static final T9D LIZ = T9D.LIZ;

    @E8L("/tiktok/sami/multi/ttsvoice/info/v1/")
    Object getVoiceDetails(@InterfaceC64986Pew("tts_voice_ids") List<String> list, @InterfaceC64986Pew("need_tts_voice_details") Boolean bool, @InterfaceC64986Pew("need_total_video_count") Boolean bool2, @InterfaceC64986Pew("need_video_list") Boolean bool3, @InterfaceC64986Pew("video_list_count") Long l, @InterfaceC64986Pew("video_list_offset") Long l2, InterfaceC67352kd<? super C64797Pbt<TTSVoiceDetailsResponse>> interfaceC67352kd);

    @E8L("/tiktok/sami/multi/ttsvoice/info/v1/")
    C76L<TTSVoiceDetailsResponse> getVoiceDetailsFuture(@InterfaceC64986Pew("tts_voice_ids") List<String> list, @InterfaceC64986Pew("need_tts_voice_details") Boolean bool, @InterfaceC64986Pew("need_total_video_count") Boolean bool2, @InterfaceC64986Pew("need_video_list") Boolean bool3, @InterfaceC64986Pew("video_list_count") Long l, @InterfaceC64986Pew("video_list_offset") Long l2);
}
