package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.compliance.privacy.paprompt.api.PaPromptApi;

/* loaded from: classes7.dex */
public final class E7W {
    public static final /* synthetic */ E7W LIZ = new E7W();
    public static final PaPromptApi LIZIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZIZ = (PaPromptApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(PaPromptApi.class);
    }
}
