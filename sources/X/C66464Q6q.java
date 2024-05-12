package X;

import Y.ARunnableS15S0101000_11;
import android.text.TextUtils;
import com.bytedance.ies.safemode.SmartProtected.state.BaseState;
import com.bytedance.ies.safemode.SmartProtected.state.ExceptionManager;
import com.bytedance.ies.safemode.SmartProtected.state.StateParam;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;

/* renamed from: X.Q6q, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66464Q6q extends BaseState {
    public ScheduledFuture<?> LIZIZ;

    @Override // X.Q7F
    public final String getName() {
        return "CheckingState";
    }

    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState, X.Q7F
    public final void LIZJ(Q7F q7f) {
        this.LIZIZ.cancel(false);
    }

    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState
    public final void LJI(Q7F q7f, StateParam stateParam) {
        PSY.LJFF("CheckingState", C16880lQ.LLLZ("enterState maxCrashCount: %d", new Object[]{Integer.valueOf(C66465Q6r.LJIILLIIL.LJ.LIZ().intValue())}));
        this.LIZIZ = this.LIZ.LJI.scheduleWithFixedDelay(new ARunnableS15S0101000_11(2, this, 14), 1L, 1L, TimeUnit.SECONDS);
    }

    @Override // com.bytedance.ies.safemode.SmartProtected.state.BaseState, X.Q7F
    public final void LIZ(long j, String str, String str2) {
        int i;
        int i2;
        ExceptionManager LIZJ = ExceptionManager.LIZJ(this.LIZ.LJ);
        ExceptionManager.ExceptionRecord LJI = LIZJ.LJI(str, str2, j, LIZJ.LIZ.LIZ(), LIZJ.LJII, C66465Q6r.LJIILLIIL.LJ.LIZ().intValue());
        int size = LIZJ.LIZ.LIZ().size();
        if (size > 0) {
            ExceptionManager.ExceptionRecord exceptionRecord = (ExceptionManager.ExceptionRecord) ListProtector.get(LIZJ.LIZ.LIZ(), size - 1);
            Iterator it = ((ArrayList) LIZJ.LJ).iterator();
            while (it.hasNext()) {
                if (((Q7G) it.next()).isSameException(exceptionRecord)) {
                    PSY.LJFF("ExceptionManager", C16880lQ.LLLZ("immediatelyRollBack crashType(%s) stack(%s)", new Object[]{exceptionRecord.getCrashType(), exceptionRecord.getCrashReason()}));
                    i = -2;
                    break;
                }
            }
        }
        if (size < C66465Q6r.LJIILLIIL.LJFF.LIZ().intValue()) {
            return;
        }
        ExceptionManager.ExceptionRecord exceptionRecord2 = (ExceptionManager.ExceptionRecord) ListProtector.get(LIZJ.LIZ.LIZ(), 0);
        for (int i3 = 1; i3 < LIZJ.LIZ.LIZ().size(); i3++) {
            if (!exceptionRecord2.isSameException((ExceptionManager.ExceptionRecord) ListProtector.get(LIZJ.LIZ.LIZ(), i3))) {
                return;
            }
        }
        i = -1;
        ExceptionManager LIZJ2 = ExceptionManager.LIZJ(this.LIZ.LJ);
        LIZJ2.getClass();
        try {
            FileUtils.writeStringToFile(LIZJ2.LJIIL, LIZJ2.LJIILJJIL.LJIILL(LJI), Charset.forName("UTF-8"));
        } catch (Exception e) {
            PP9.LIZJ(13, e);
            C16880lQ.LLLLIIL(e);
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Iterator<ExceptionManager.ExceptionRecord> it2 = LIZJ.LIZIZ.LIZ().iterator();
            while (it2.hasNext()) {
                if (it2.next().isSameException(str, str2)) {
                    PSY.LJFF("ExceptionManager", C16880lQ.LLLZ("localSkipSmartProtected crashType(%s) stack(%s)", new Object[]{str, str2}));
                }
            }
            Iterator it3 = ((ArrayList) LIZJ.LJFF).iterator();
            while (it3.hasNext()) {
                if (((Q7G) it3.next()).isSameException(str, str2)) {
                    PSY.LJFF("ExceptionManager", C16880lQ.LLLZ("cloudSkipSmartProtected crashType(%s) stack(%s)", new Object[]{str, str2}));
                    i2 = 8;
                    if (i == -2 && i2 == 2) {
                        i2 = 20;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(str);
                    LIZ.append(str2);
                    PSY.LJFF("CheckingState", C16880lQ.LLLZ("skip exception: %s in smart boot and try to enter boot protected reason code(%d)", new Object[]{PP9.LIZIZ(X1D.LIZIZ(LIZ)), Integer.valueOf(i2)}));
                    LJIIIIZZ(this.LIZ.mRollBackState, new StateParam(2, i2));
                }
            }
            LJIIIIZZ(this.LIZ.mRollBackState, new StateParam(4, i));
            return;
        }
        i2 = 2;
        if (i == -2) {
            i2 = 20;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(str2);
        PSY.LJFF("CheckingState", C16880lQ.LLLZ("skip exception: %s in smart boot and try to enter boot protected reason code(%d)", new Object[]{PP9.LIZIZ(X1D.LIZIZ(LIZ2)), Integer.valueOf(i2)}));
        LJIIIIZZ(this.LIZ.mRollBackState, new StateParam(2, i2));
    }
}
