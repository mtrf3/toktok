package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.journey.JourneyApi;

/* renamed from: X.39s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C794039s {
    public static final JourneyApi LIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = com.ss.android.ugc.aweme.app.api.Api.LIZ;
        LIZ = (JourneyApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, JourneyApi.class);
    }
}
