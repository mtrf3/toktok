package X;

import com.ss.android.ugc.aweme.IKnownWeakPasswordService;
import com.ss.android.ugc.aweme.account.passwordcheck.service.KnownWeakPasswordService;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T0T implements T0W {
    public final IKnownWeakPasswordService LIZ;

    public T0T() {
        IKnownWeakPasswordService LIZJ = KnownWeakPasswordService.LIZJ();
        o.LJIIIIZZ(LIZJ, "get().getService(IKnownW…swordService::class.java)");
        this.LIZ = LIZJ;
    }

    @Override // X.T0W
    public final T0Q getType() {
        return T0Q.KNOWN_WEAK_PASSWORD;
    }

    @Override // X.T0W
    public final EnumC72824Si4 LIZ(String password, EnumC72824Si4 previousComplexity) {
        o.LJIIIZ(password, "password");
        o.LJIIIZ(previousComplexity, "previousComplexity");
        if (this.LIZ.LIZ(password)) {
            return EnumC72824Si4.INSTANT_WEAK;
        }
        return previousComplexity;
    }
}
