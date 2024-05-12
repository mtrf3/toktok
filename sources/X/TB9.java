package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.translation.api.ObservableTranslationApi;

/* loaded from: classes13.dex */
public final class TB9 extends AbstractC65781Prl implements InterfaceC65784Pro<ObservableTranslationApi.ITranslationAPI> {
    public static final TB9 LJLIL = new TB9();

    public TB9() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.aweme.translation.api.ObservableTranslationApi$ITranslationAPI] */
    @Override // X.InterfaceC65784Pro
    public final ObservableTranslationApi.ITranslationAPI invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, ObservableTranslationApi.ITranslationAPI.class);
    }
}
