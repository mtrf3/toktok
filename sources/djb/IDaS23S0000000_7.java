package djb;

import X.AnonymousClass315;
import X.C78983UzD;
import X.MB6;
import X.MBA;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes8.dex */
public class IDaS23S0000000_7 extends MB6 implements CoroutineExceptionHandler {
    public final int $t;

    public static final void handleException$1(IDaS23S0000000_7 iDaS23S0000000_7, MBA mba, Throwable th) {
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(MBA mba, Throwable th) {
        switch (this.$t) {
            case 0:
                C78983UzD.LJIJ(th, "edit photo mode post");
                return;
            case 1:
                handleException$1(this, mba, th);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS23S0000000_7(AnonymousClass315 anonymousClass315, int i) {
        super(anonymousClass315);
        this.$t = i;
    }
}
