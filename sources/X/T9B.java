package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.ttsvoice.repo.TTSVoiceApi;

/* loaded from: classes13.dex */
public final class T9B extends AbstractC65781Prl implements InterfaceC65784Pro<TTSVoiceApi> {
    public static final T9B LJLIL = new T9B();

    public T9B() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.ttsvoice.repo.TTSVoiceApi] */
    @Override // X.InterfaceC65784Pro
    public final TTSVoiceApi invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(TTSVoiceApi.class);
    }
}
