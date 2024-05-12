package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FBO implements F9Q {
    @Override // X.F9Q
    public final F9P LIZ(String baseUrl) {
        InterfaceC789838c create;
        o.LJIIIZ(baseUrl, "baseUrl");
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        if (LIZLLL != null && (create = LIZLLL.create(baseUrl)) != null) {
            return new FBN(create);
        }
        return null;
    }
}
