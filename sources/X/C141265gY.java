package X;

import com.ss.android.ugc.gamora.editor.audio.tts.network.TextToSpeechApi;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextV2Api;
import kotlin.jvm.internal.o;

/* renamed from: X.5gY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141265gY {
    public static TextToSpeechApi.FetchTextAudioResponse LIZ(Integer num, String reqText, String textSpeaker, String namespace) {
        int i;
        o.LJIIIZ(reqText, "reqText");
        o.LJIIIZ(textSpeaker, "textSpeaker");
        o.LJIIIZ(namespace, "namespace");
        ReadTextV2Api.Api api = (ReadTextV2Api.Api) C169696lJ.LIZ(C60903NvH.LJIIJJI().getNetworkService(), true, ReadTextV2Api.Api.class);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        C48153Iv7 c48153Iv7 = new C48153Iv7();
        c48153Iv7.LIZLLL = 30000L;
        c48153Iv7.LIZJ = 30000L;
        c48153Iv7.LJ = 30000L;
        TextToSpeechApi.FetchTextAudioResponse fetchTextAudioResponse = api.get(reqText, textSpeaker, i, namespace, c48153Iv7).execute().LIZIZ;
        o.LJIIIIZZ(fetchTextAudioResponse, "api.get(reqText, textSpe…      }).execute().body()");
        return fetchTextAudioResponse;
    }
}
