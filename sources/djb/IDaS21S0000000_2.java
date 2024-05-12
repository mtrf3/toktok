package djb;

import X.AnonymousClass315;
import X.C16880lQ;
import X.C5Z2;
import X.C60903NvH;
import X.C6PB;
import X.MB6;
import X.MBA;
import X.X1D;
import android.util.Log;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes3.dex */
public class IDaS21S0000000_2 extends MB6 implements CoroutineExceptionHandler {
    public final int $t;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(MBA mba, Throwable th) {
        switch (this.$t) {
            case 0:
                handleException$0(this, mba, th);
                return;
            case 1:
                handleException$1(this, mba, th);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS21S0000000_2(AnonymousClass315 anonymousClass315, int i) {
        super(anonymousClass315);
        this.$t = i;
    }

    public static final void handleException$0(IDaS21S0000000_2 iDaS21S0000000_2, MBA mba, Throwable th) {
        C60903NvH.LJIIJJI().LJJIIJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditCapCut ; Thread[");
        LIZ.append(C16880lQ.LLLLIIIILLL().getName());
        LIZ.append("], exception: ");
        LIZ.append(Log.getStackTraceString(th));
        C5Z2.LIZ(X1D.LIZIZ(LIZ));
    }

    public static final void handleException$1(IDaS21S0000000_2 iDaS21S0000000_2, MBA mba, Throwable th) {
        C6PB.LIZJ().LIZIZ(th);
    }
}
