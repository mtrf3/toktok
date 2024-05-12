package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SNO implements InterfaceC72053SPp {
    @Override // X.InterfaceC72053SPp
    public final C71995SNj LIZJ() {
        return new C71995SNj();
    }

    @Override // X.InterfaceC72053SPp
    public final boolean LIZ() {
        return C53332KwS.LIZ();
    }

    @Override // X.InterfaceC72053SPp
    public final <T> T LIZLLL(Class<T> cls) {
        return (T) RetrofitFactory.LIZLLL().create(C778533t.LIZ).create(cls);
    }

    @Override // X.InterfaceC72053SPp
    public final C73390SrC LIZIZ(AbstractC73672Svk source, String str) {
        o.LJIIIZ(source, "source");
        return C77119UOl.LJIJ(source, str);
    }
}
