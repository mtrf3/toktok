package com.ss.android.ugc.gamora.editor.sticker.read.voiceclone;

import X.E4T;
import X.InterfaceC195737mD;
import X.InterfaceC27211Am7;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;
import com.google.gson.m;

/* loaded from: classes7.dex */
public final class VoiceCloneTTSApi {
    public static final /* synthetic */ int LIZ = 0;

    /* loaded from: classes7.dex */
    public interface Api {
        @E4T("/internal/api/v1/invoke")
        InterfaceC37276Ek4<TTSLokiInfoResponse> getLokiInfoFromSpeakerId(@InterfaceC64986Pew("appkey") String str, @InterfaceC64986Pew("namespace") String str2, @InterfaceC27211Am7 m mVar, @InterfaceC195737mD Object obj);

        @E4T("/internal/api/v1/invoke")
        InterfaceC37276Ek4<TTSSpeakerInfoResponse> getSpeakerInfoFromUid(@InterfaceC64986Pew("appkey") String str, @InterfaceC64986Pew("namespace") String str2, @InterfaceC27211Am7 m mVar, @InterfaceC195737mD Object obj);
    }
}
