package X;

import Y.ARunnableS42S0100000_6;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.legoImp.task.MonitorInitTask;
import com.ss.android.ugc.aweme.legoImp.task.RedBadgeUpdateTask;

/* loaded from: classes7.dex */
public final class FM6 implements InterfaceC64592gB<FM3> {
    public boolean LJLIL;

    public final void LIZ() {
        if (!this.LJLIL) {
            EI0 LIZJ = C40328FsC.LIZJ(C36093EEn.LIZ);
            LIZJ.LIZIZ(new MonitorInitTask(), true);
            LIZJ.LIZJ();
            this.LJLIL = true;
        }
        if (!C38354F3m.LJ(AppLog.getClientId()) && !C38354F3m.LJ(FVR.LIZJ())) {
            EI0 LIZJ2 = C40328FsC.LIZJ(C36093EEn.LIZ);
            LIZJ2.LIZIZ(new RedBadgeUpdateTask(), true);
            LIZJ2.LIZJ();
        }
    }

    @Override // X.InterfaceC64592gB
    public final void accept(FM3 fm3) {
        if ((((Number) DOH.LIZ.getValue()).intValue() & 1) == 1) {
            C37179EiV.LJFF.post(new ARunnableS42S0100000_6(this, 105));
        } else {
            LIZ();
        }
    }
}
