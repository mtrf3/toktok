package djb;

import X.AnonymousClass315;
import X.C0NB;
import X.MB6;
import X.MBA;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes14.dex */
public class IDaS26S0000000_13 extends MB6 implements CoroutineExceptionHandler {
    public final int $t;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(MBA mba, Throwable th) {
        switch (this.$t) {
            case 0:
                C0NB.LJFF("PostSendGiftChecker", "CoroutineException", th);
                return;
            case 1:
                C0NB.LJFF("PreSendGiftChecker", "CoroutineException", th);
                return;
            case 2:
                C0NB.LJFF("SendGiftResultHandlerManager", "CoroutineException", th);
                return;
            case 3:
                C0NB.LJFF("SendGiftTransactionTaskBuffer", "CoroutineException", th);
                return;
            case 4:
                C0NB.LJFF("SendGiftExecutor", "CoroutineException", th);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS26S0000000_13(AnonymousClass315 anonymousClass315, int i) {
        super(anonymousClass315);
        this.$t = i;
    }
}
