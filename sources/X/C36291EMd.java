package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.account.reactive.ReactiveAccountApi;

/* renamed from: X.EMd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36291EMd {
    public static final /* synthetic */ C36291EMd LIZ = new C36291EMd();
    public static final ReactiveAccountApi LIZIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = com.ss.android.ugc.aweme.app.api.Api.LIZ;
        LIZIZ = (ReactiveAccountApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, ReactiveAccountApi.class);
    }
}
