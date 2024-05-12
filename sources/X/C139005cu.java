package X;

import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.gamora.editor.audio.tts.network.TextToSpeechApi;
import kotlin.jvm.internal.o;

/* renamed from: X.5cu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139005cu extends AbstractC65781Prl implements InterfaceC65784Pro<TextToSpeechApi.Api> {
    public static final C139005cu LJLIL = new C139005cu();

    public C139005cu() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.ss.android.ugc.gamora.editor.audio.tts.network.TextToSpeechApi$Api] */
    @Override // X.InterfaceC65784Pro
    public final TextToSpeechApi.Api invoke() {
        InterfaceC36395EQd networkService = C60903NvH.LJIIJJI().getNetworkService();
        String LIZ = AVApiImpl.LIZJ().LIZ();
        o.LJIIIIZZ(LIZ, "get().getService(AVApi::…s.java).apI_URL_PREFIX_SI");
        return networkService.createRetrofit(LIZ, true, TextToSpeechApi.Api.class);
    }
}
