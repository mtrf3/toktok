package X;

import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import kotlin.jvm.internal.o;

/* renamed from: X.Na3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59587Na3 extends C59658NbC {
    public final F3T LIZ;

    @Override // X.InterfaceC60257Nkr
    public final InterfaceC48694J9e LJI() {
        LocalTestApi localTestApi;
        C37091Eh5 c37091Eh5 = C37090Eh4.LIZ;
        LocalTestApi localTestApi2 = c37091Eh5.LIZ;
        if ((localTestApi2 != null && localTestApi2.enableBoe()) || ((localTestApi = c37091Eh5.LIZ) != null && localTestApi.isPPEEnable())) {
            LocalTestApi localTestApi3 = c37091Eh5.LIZ;
            if (localTestApi3 != null) {
                return localTestApi3.getWebViewLoadUrlInterceptorDelegate();
            }
            return null;
        }
        return new C48693J9d();
    }

    @Override // X.InterfaceC60257Nkr
    public final C59458NVe LJII() {
        NW3 nw3;
        Object LIZJ = this.LIZ.LIZJ(InterfaceC60179Njb.class);
        C59458NVe c59458NVe = null;
        if ((LIZJ instanceof NW3) && (nw3 = (NW3) LIZJ) != null) {
            c59458NVe = nw3.LIZIZ();
        }
        return new NVY(c59458NVe);
    }

    @Override // X.InterfaceC60257Nkr
    public final C59827Ndv LJIIIZ() {
        NW3 nw3;
        Object LIZJ = this.LIZ.LIZJ(InterfaceC60179Njb.class);
        C59827Ndv c59827Ndv = null;
        if ((LIZJ instanceof NW3) && (nw3 = (NW3) LIZJ) != null) {
            c59827Ndv = nw3.LIZ();
        }
        return new C59824Nds(c59827Ndv);
    }

    public C59587Na3(F3T providerFactory) {
        o.LJIIIZ(providerFactory, "providerFactory");
        this.LIZ = providerFactory;
    }
}
