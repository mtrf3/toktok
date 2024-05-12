package X;

import com.bytedance.ies.xbridge.base.runtime.depend.XIRetrofit;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EZE implements XIRetrofit {
    public final InterfaceC789838c LIZ;

    public EZE(InterfaceC789838c interfaceC789838c) {
        this.LIZ = interfaceC789838c;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.XIRetrofit
    public final <T> T create(Class<T> service) {
        o.LJIIIZ(service, "service");
        return (T) this.LIZ.create(service);
    }
}
