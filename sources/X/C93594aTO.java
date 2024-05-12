package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.repo.VoiceSearchSugApi;

/* renamed from: X.aTO, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93594aTO {
    public static final /* synthetic */ C93594aTO LIZ = new C93594aTO();
    public static final VoiceSearchSugApi LIZIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("https://");
        LIZ2.append(EF7.LJI.LIZ);
        LIZIZ = (VoiceSearchSugApi) LIZLLL.create(X1D.LIZIZ(LIZ2)).create(VoiceSearchSugApi.class);
    }
}
