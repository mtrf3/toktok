package X;

import com.bytedance.ies.xbridge.base.runtime.depend.XIRetrofit;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EZH implements XIRetrofit {
    public final C65019PfT LIZ;

    public EZH(C65019PfT c65019PfT) {
        this.LIZ = c65019PfT;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.XIRetrofit
    public final <T> T create(Class<T> service) {
        o.LJIIJ(service, "service");
        return (T) this.LIZ.LIZ(service);
    }
}
