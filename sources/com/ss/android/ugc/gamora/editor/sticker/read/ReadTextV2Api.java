package com.ss.android.ugc.gamora.editor.sticker.read;

import X.C141265gY;
import X.E4T;
import X.InterfaceC195737mD;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.gamora.editor.audio.tts.network.TextToSpeechApi;

/* loaded from: classes3.dex */
public final class ReadTextV2Api {
    public static final /* synthetic */ int LIZ = 0;

    /* loaded from: classes3.dex */
    public interface Api {
        @E4T("/media/api/text/speech/invoke/")
        InterfaceC37276Ek4<TextToSpeechApi.FetchTextAudioResponse> get(@InterfaceC64986Pew("req_text") String str, @InterfaceC64986Pew("text_speaker") String str2, @InterfaceC64986Pew("speaker_map_type") int i, @InterfaceC64986Pew("namespace") String str3, @InterfaceC195737mD Object obj);
    }

    static {
        new C141265gY();
    }
}
