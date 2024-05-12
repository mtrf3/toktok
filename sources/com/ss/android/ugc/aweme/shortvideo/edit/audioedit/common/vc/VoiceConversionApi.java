package com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc;

import X.E4T;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class VoiceConversionApi {
    public static final /* synthetic */ int LIZ = 0;

    /* loaded from: classes3.dex */
    public interface Api {
        @E4T("/tiktok/v1/voice/conversion/")
        InterfaceC37276Ek4<VCAudioResponse> downloadVoiceConversion(@InterfaceC64986Pew("vids") JSONArray jSONArray, @InterfaceC64986Pew("speakers") JSONArray jSONArray2, @InterfaceC64986Pew("response_type") Integer num, @InterfaceC64986Pew("params") String str);
    }
}
