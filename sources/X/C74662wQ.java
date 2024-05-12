package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import kotlin.jvm.internal.o;

/* renamed from: X.2wQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74662wQ {
    public static final IRetrofitFactory LIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "get().getService(IRetrofitFactory::class.java)");
        LIZ = LIZLLL;
    }

    public static Object LIZ(Class cls) {
        return LIZ.create("https://oec-api.tiktokv.com").create(cls);
    }
}
