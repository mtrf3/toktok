package X;

import com.ss.android.ugc.aweme.relation.auth.api.AuthApiService;
import com.ss.android.ugc.aweme.relation.auth.api.IAuthApi;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UT3 extends UTI {
    public final IAuthApi LIZ;

    public UT3() {
        AuthApiService authApiService = AuthApiService.LIZIZ;
        o.LJIIIZ(authApiService, "authApiService");
        this.LIZ = authApiService;
    }

    @Override // X.UTD
    public final Object LIZ(C77211URz c77211URz, InterfaceC67352kd<? super C77216USe> interfaceC67352kd) {
        if (c77211URz.LJLIL.LIZLLL.LIZIZ) {
            if (!c77211URz.LJLILLLLZI.LJLIL.LJLILLLLZI) {
                return V1M.LJJJJJL(new C3C3(new C77236USy(true, c77211URz, this, null)), interfaceC67352kd);
            }
            new URT(c77211URz).LIZLLL(null);
            return C77216USe.M(c77211URz.LJLILLLLZI, UQ0.SYNC);
        }
        return V1M.LJJJJJL(new C3C3(new C77236USy(false, c77211URz, this, null)), interfaceC67352kd);
    }
}
