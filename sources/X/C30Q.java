package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.live.deeplink.UniqueIdApi;

/* renamed from: X.30Q, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C30Q {
    public static final UniqueIdApi LIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("https://");
        LIZ2.append(EF7.LJI.LIZ);
        LIZ = (UniqueIdApi) LIZLLL.LIZ(X1D.LIZIZ(LIZ2)).LJFF().LIZ.LIZ(UniqueIdApi.class);
    }
}
