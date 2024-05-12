package com.ss.android.ugc.aweme.authorize;

import X.C2NU;
import X.C38995FSd;
import X.C76L;
import X.C770830u;
import X.E8L;
import X.E8M;
import X.EF7;
import X.EFJ;
import X.FMX;
import X.InterfaceC195747mE;
import X.InterfaceC195757mF;
import X.InterfaceC36163EHf;
import X.InterfaceC36229EJt;
import X.OTX;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class AwemeAuthorizePlatformDepend implements OTX {
    public final AuthorizeApi LIZ;
    public final ExecutorService LIZIZ;

    /* loaded from: classes7.dex */
    public interface AuthorizeApi {
        @E8L
        C76L<String> doGet(@InterfaceC195747mE String str);

        @E8M
        @InterfaceC195757mF
        C76L<String> doPost(@InterfaceC195747mE String str, @InterfaceC36229EJt Map<String, String> map);
    }

    @Override // X.OTX
    public final void LIZIZ() {
    }

    @Override // X.OTX
    public final boolean LJ() {
        EF7.LIZIZ();
        try {
            return C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // X.OTX
    public final void LIZ() {
    }

    public AwemeAuthorizePlatformDepend(InterfaceC36163EHf interfaceC36163EHf) {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        this.LIZ = (AuthorizeApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(AuthorizeApi.class);
        this.LIZIZ = C38995FSd.LIZLLL();
        if (interfaceC36163EHf != null) {
            new WeakReference(interfaceC36163EHf);
        }
    }

    @Override // X.OTX
    public final String executeGet(String str) {
        String str2 = this.LIZ.doGet(str).get();
        o.LJIIIIZZ(str2, "mAuthorizeApi.doGet(p0).get()");
        return str2;
    }

    @Override // X.OTX
    public final String LIZJ(String str, Map<String, String> map) {
        String str2 = this.LIZ.doPost(str, map).get();
        o.LJIIIIZZ(str2, "mAuthorizeApi.doPost(p0, p1).get()");
        return str2;
    }

    @Override // X.OTX
    public final void LIZLLL(String str, JSONObject jSONObject) {
        FMX.LJIILJJIL(str, jSONObject);
    }
}
