package djb;

import X.AnonymousClass315;
import X.C170666ms;
import X.C83175Wkd;
import X.InterfaceC83176Wke;
import X.MB6;
import X.MBA;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes15.dex */
public class IDaS27S0000000_14 extends MB6 implements CoroutineExceptionHandler {
    public final int $t;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(MBA mba, Throwable th) {
        switch (this.$t) {
            case 0:
                handleException$0(this, mba, th);
                return;
            case 1:
                C170666ms.LIZJ(th);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS27S0000000_14(AnonymousClass315 anonymousClass315, int i) {
        super(anonymousClass315);
        this.$t = i;
    }

    public static final void handleException$0(IDaS27S0000000_14 iDaS27S0000000_14, MBA mba, Throwable th) {
        InterfaceC83176Wke interfaceC83176Wke = C83175Wkd.LIZ;
        if (interfaceC83176Wke != null) {
            interfaceC83176Wke.LIZIZ(th);
        } else {
            if (th == null) {
                return;
            }
            th.getMessage();
        }
    }
}
