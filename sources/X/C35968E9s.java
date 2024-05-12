package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.setting.api.IChangePhoneHelperApi;

/* renamed from: X.E9s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35968E9s {
    public static final /* synthetic */ C35968E9s LIZ = new C35968E9s();
    public static final IChangePhoneHelperApi LIZIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZIZ = (IChangePhoneHelperApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(IChangePhoneHelperApi.class);
    }
}
