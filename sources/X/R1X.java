package X;

import android.os.SystemClock;
import kotlin.jvm.internal.AqS46S0001000_11;

/* loaded from: classes12.dex */
public final class R1X extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final R1X LJLIL = new R1X();

    public R1X() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        long j;
        if (R1W.LJIIIIZZ != R1Y.UNKNOWN) {
            long uptimeMillis = SystemClock.uptimeMillis();
            String str = "foreground_offline_time";
            switch (R1Z.LIZ[R1W.LJIIIIZZ.ordinal()]) {
                case 1:
                    j = R1W.LIZJ;
                    R1W.LIZJ = uptimeMillis;
                    str = "foreground_online_time";
                    break;
                case 2:
                    j = R1W.LJ;
                    R1W.LJ = uptimeMillis;
                    break;
                case 3:
                    j = R1W.LIZLLL;
                    R1W.LIZLLL = uptimeMillis;
                    str = "background_online_time";
                    break;
                case 4:
                    j = R1W.LJFF;
                    R1W.LJFF = uptimeMillis;
                    str = "background_offline_time";
                    break;
                case 5:
                    long j2 = uptimeMillis - R1W.LJIIL;
                    R1W.LJIIL(j2, "foreground_close_time");
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("<LOOP> eventName = foreground_close_time, currentTime = ");
                    LIZ.append(uptimeMillis);
                    LIZ.append(", startTime = ");
                    LIZ.append(R1W.LJIIL);
                    LIZ.append(", duration = ");
                    LIZ.append(j2);
                    QPY.LIZ("WsOnlineRateMonitor", X1D.LIZIZ(LIZ));
                    R1W.LJIIL = uptimeMillis;
                    j = R1W.LJ;
                    R1W.LJ = uptimeMillis;
                    break;
                case 6:
                    long j3 = uptimeMillis - R1W.LJIILIIL;
                    R1W.LJIIL(j3, "background_close_time");
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("<LOOP> eventName=background_close_time, currentTime=");
                    LIZ2.append(uptimeMillis);
                    LIZ2.append(", startTime=");
                    LIZ2.append(R1W.LJIILIIL);
                    LIZ2.append(", duration=");
                    LIZ2.append(j3);
                    QPY.LIZ("WsOnlineRateMonitor", X1D.LIZIZ(LIZ2));
                    R1W.LJIILIIL = uptimeMillis;
                    j = R1W.LJFF;
                    R1W.LJFF = uptimeMillis;
                    str = "background_offline_time";
                    break;
                default:
                    str = "";
                    j = 0;
                    break;
            }
            C57139Mbf.LIZ(new AqS46S0001000_11(R1Y.LOOP.getValue(), 2));
            if (j != 0) {
                long j4 = uptimeMillis - j;
                R1W.LJIIL(j4, str);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("<LOOP> eventName = ");
                LIZ3.append(str);
                LIZ3.append(", currentTime = ");
                LIZ3.append(uptimeMillis);
                C0MT.LIZLLL(LIZ3, ", startTime = ", j, ", duration = ");
                LIZ3.append(j4);
                QPY.LIZ("WsOnlineRateMonitor", X1D.LIZIZ(LIZ3));
                R1W.LJIIL(uptimeMillis - R1W.LJII, "total_time");
                R1W.LJIIIIZZ(uptimeMillis, j, str);
            }
        }
        return C76800UCe.LIZ;
    }
}
