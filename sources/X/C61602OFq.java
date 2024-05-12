package X;

import Y.AgS113S0200000_10;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.brdatagift.api.BaseBemobiResponse;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.OFq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61602OFq implements InterfaceC61605OFt {
    @Override // X.InterfaceC61605OFt
    public final void LIZ(BaseBemobiResponse baseBemobiResponse) {
        o.LJIIIZ(baseBemobiResponse, "baseBemobiResponse");
    }

    @Override // X.InterfaceC61605OFt
    public final void LIZIZ(BaseBemobiResponse baseBemobiResponse) {
        o.LJIIIZ(baseBemobiResponse, "baseBemobiResponse");
    }

    @Override // X.InterfaceC61605OFt
    public final void LIZJ(BaseBemobiResponse baseBemobiResponse) {
        o.LJIIIZ(baseBemobiResponse, "baseBemobiResponse");
        Callable callable = new Callable() { // from class: X.6uU
            @Override // java.util.concurrent.Callable
            public final Object call() {
                FMX.onEventV3("bemobi_eligibility_request");
                return C76800UCe.LIZ;
            }
        };
        ExecutorService executorService = C10K.LJI;
        C10K.LIZIZ(callable, executorService, null);
        C61608OFw c61608OFw = C61608OFw.LIZLLL;
        if (c61608OFw.LIZ) {
            return;
        }
        c61608OFw.LIZ = true;
        C10K.LIZIZ(CallableC61607OFv.LJLIL, executorService, null).LJ(new AgS113S0200000_10(SystemClock.elapsedRealtime(), 3), C10K.LJIIIIZZ, null);
    }

    @Override // X.InterfaceC61605OFt
    public final void onFailed(Exception exc) {
    }
}
