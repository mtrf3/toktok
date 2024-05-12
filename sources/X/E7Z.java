package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.localnotify.api.LocalNotifyInfoApi;

/* loaded from: classes7.dex */
public final class E7Z {
    public static final /* synthetic */ E7Z LIZ = new E7Z();
    public static final LocalNotifyInfoApi LIZIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZIZ = (LocalNotifyInfoApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(LocalNotifyInfoApi.class);
    }
}
