package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.voiceconversion.repo.VoiceConversionApi;

/* loaded from: classes13.dex */
public final class T96 extends AbstractC65781Prl implements InterfaceC65784Pro<VoiceConversionApi> {
    public static final T96 LJLIL = new T96();

    public T96() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.voiceconversion.repo.VoiceConversionApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final VoiceConversionApi invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(VoiceConversionApi.class);
    }
}
