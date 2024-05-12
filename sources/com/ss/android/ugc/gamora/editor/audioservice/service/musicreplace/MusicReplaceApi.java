package com.ss.android.ugc.gamora.editor.audioservice.service.musicreplace;

import X.E4Q;
import X.E4T;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes3.dex */
public final class MusicReplaceApi {
    public static final /* synthetic */ int LIZ = 0;

    /* loaded from: classes3.dex */
    public interface Api {
        @E4Q("/tiktok/music/separate_audiotrack/get/v1/")
        InterfaceC37276Ek4<MusicReplaceResponse> getSeparateAudioTrack(@InterfaceC64986Pew("origin_vid") String str);

        @E4T("/tiktok/music/separate_audiotrack/v1/")
        InterfaceC37276Ek4<BaseResponse> startSeparateAudioTrack(@InterfaceC64986Pew("origin_vid") String str, @InterfaceC64986Pew("match_details") String str2);
    }
}
