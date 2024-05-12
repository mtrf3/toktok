package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.commercialize.profile.impl.ad.CommerceProfileAdApi;

/* renamed from: X.30R, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C30R {
    public static final /* synthetic */ C30R LIZ = new C30R();
    public static final CommerceProfileAdApi LIZIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("https://");
        LIZ2.append(EF7.LJI.LIZ);
        LIZIZ = (CommerceProfileAdApi) LIZLLL.LIZ(X1D.LIZIZ(LIZ2)).LJFF().LIZ.LIZ(CommerceProfileAdApi.class);
    }
}
