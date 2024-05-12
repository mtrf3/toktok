package djb;

import X.AnonymousClass315;
import X.C63337OtR;
import X.MB6;
import X.MBA;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes11.dex */
public class IDaS25S0000000_10 extends MB6 implements CoroutineExceptionHandler {
    public final int $t;

    public static final void handleException$1(IDaS25S0000000_10 iDaS25S0000000_10, MBA mba, Throwable th) {
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(MBA mba, Throwable th) {
        switch (this.$t) {
            case 0:
                C63337OtR.LJ("IMUseCaseClient", th);
                return;
            case 1:
                handleException$1(this, mba, th);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS25S0000000_10(AnonymousClass315 anonymousClass315, int i) {
        super(anonymousClass315);
        this.$t = i;
    }
}
