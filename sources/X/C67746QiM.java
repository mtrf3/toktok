package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;

/* renamed from: X.QiM, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67746QiM implements InterfaceC67745QiL {
    public final /* synthetic */ AbstractC67744QiK LIZ;
    public final /* synthetic */ C67649Qgn LIZIZ;
    public final /* synthetic */ InterfaceC67743QiJ LIZJ;

    public C67746QiM(BasePendingResult basePendingResult, C67649Qgn c67649Qgn, InterfaceC67743QiJ interfaceC67743QiJ) {
        this.LIZ = basePendingResult;
        this.LIZIZ = c67649Qgn;
        this.LIZJ = interfaceC67743QiJ;
    }

    @Override // X.InterfaceC67745QiL
    public final void LIZ(Status status) {
        if (status.LJJJJL()) {
            AbstractC67744QiK abstractC67744QiK = this.LIZ;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) abstractC67744QiK;
            QH7.LJIIJ("Result has already been consumed.", !basePendingResult.LJIIIZ);
            try {
                if (!basePendingResult.LIZLLL.await(0L, timeUnit)) {
                    basePendingResult.LJFF(Status.RESULT_TIMEOUT);
                }
            } catch (InterruptedException unused) {
                basePendingResult.LJFF(Status.RESULT_INTERRUPTED);
            }
            QH7.LJIIJ("Result is not ready.", basePendingResult.LJII());
            this.LIZIZ.LIZIZ(this.LIZJ.LIZ(basePendingResult.LJIIIZ()));
            return;
        }
        this.LIZIZ.LIZ(C1GE.LIZJ(status));
    }
}
