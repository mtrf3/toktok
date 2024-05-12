package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import kotlin.jvm.internal.o;

/* renamed from: X.Hqm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45336Hqm {
    public static final IRetrofitFactory LIZ;
    public static final String LIZIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "get().getService(IRetrofitFactory::class.java)");
        LIZ = LIZLLL;
        LIZIZ = C42952GtQ.LIZ;
    }

    public static Object LIZ(Class cls) {
        return LIZ.LIZ(LIZIZ).LJFF().LIZ.LIZ(cls);
    }

    public static Object LIZIZ(Class cls, String baseUrl) {
        o.LJIIIZ(baseUrl, "baseUrl");
        return LIZ.LIZ(baseUrl).LJFF().LIZ.LIZ(cls);
    }
}
