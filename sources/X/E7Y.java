package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.setting.api.RegionStatusApi;

/* loaded from: classes7.dex */
public final class E7Y {
    public static final /* synthetic */ E7Y LIZ = new E7Y();
    public static final RegionStatusApi LIZIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZIZ = (RegionStatusApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(RegionStatusApi.class);
    }
}
