package djb;

import X.AnonymousClass315;
import X.MB6;
import X.MBA;
import X.MCT;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes10.dex */
public class IDaS24S0000000_9 extends MB6 implements CoroutineExceptionHandler {
    public final int $t;

    public static final void handleException$1(IDaS24S0000000_9 iDaS24S0000000_9, MBA mba, Throwable th) {
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(MBA mba, Throwable th) {
        switch (this.$t) {
            case 0:
                MCT.LIZ("StoryWidgetMgr", " widgetCoroutineScope error ");
                return;
            case 1:
                handleException$1(this, mba, th);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS24S0000000_9(AnonymousClass315 anonymousClass315, int i) {
        super(anonymousClass315);
        this.$t = i;
    }
}
