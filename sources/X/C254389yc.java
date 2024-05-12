package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.paidcontent.api.PromoteApi;

/* renamed from: X.9yc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C254389yc {
    public static final /* synthetic */ C254389yc LIZ = new C254389yc();

    public static PromoteApi LIZ() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = com.ss.android.ugc.aweme.app.api.Api.LIZ;
        return (PromoteApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, PromoteApi.class);
    }
}
