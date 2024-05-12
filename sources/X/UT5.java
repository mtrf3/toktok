package X;

import com.ss.android.ugc.aweme.relation.auth.api.AuthApiService;
import com.ss.android.ugc.aweme.relation.auth.api.IAuthApi;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UT5 extends UTI {
    public final IAuthApi LIZ;

    public UT5() {
        AuthApiService authApiService = AuthApiService.LIZIZ;
        o.LJIIIZ(authApiService, "authApiService");
        this.LIZ = authApiService;
    }

    @Override // X.UTD
    public final Object LIZ(C77211URz c77211URz, InterfaceC67352kd<? super C77216USe> interfaceC67352kd) {
        if (c77211URz.LJLIL.LIZLLL.LIZIZ) {
            C77217USf c77217USf = c77211URz.LJLILLLLZI.LJLIL;
            if (!c77217USf.LJLILLLLZI) {
                return V1M.LJJJJJL(new C3C3(new UT1(true, this, c77211URz, null)), interfaceC67352kd);
            }
            return C77216USe.L(c77217USf, UQ0.SYNC);
        }
        return V1M.LJJJJJL(new C3C3(new UT1(false, this, c77211URz, null)), interfaceC67352kd);
    }
}
