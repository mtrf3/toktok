package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.creatortools.AdAuthorizationApi;

/* renamed from: X.ADu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25882ADu {
    public static final /* synthetic */ C25882ADu LIZ = new C25882ADu();
    public static final AdAuthorizationApi LIZIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZIZ = (AdAuthorizationApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, AdAuthorizationApi.class);
    }
}
