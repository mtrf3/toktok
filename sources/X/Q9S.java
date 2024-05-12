package X;

import com.linecorp.linesdk.auth.LineLoginResult;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q9S {
    public final LineLoginResult LIZ;

    public final Q9T LIZ() {
        EnumC65312PkC enumC65312PkC = this.LIZ.responseCode;
        o.LJIIIIZZ(enumC65312PkC, "resultDelegate.responseCode");
        switch (C65313PkD.LIZ[enumC65312PkC.ordinal()]) {
            case 1:
                return Q9T.SUCCESS;
            case 2:
                return Q9T.CANCEL;
            case 3:
                return Q9T.NETWORK_ERROR;
            case 4:
                return Q9T.SERVER_ERROR;
            case 5:
                return Q9T.AUTHENTICATION_AGENT_ERROR;
            case 6:
                return Q9T.INTERNAL_ERROR;
            default:
                throw new C162476Zf();
        }
    }

    public Q9S(LineLoginResult lineLoginResult) {
        this.LIZ = lineLoginResult;
    }
}
