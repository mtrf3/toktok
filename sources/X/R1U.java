package X;

import android.os.SystemClock;
import kotlin.jvm.internal.AqS46S0001000_11;

/* loaded from: classes12.dex */
public final class R1U extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final R1U LJLIL = new R1U();

    public R1U() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        long j;
        String str;
        if (R1V.LJIIIIZZ != 1) {
            long uptimeMillis = SystemClock.uptimeMillis();
            switch (R1V.LJIIIIZZ) {
                case 100:
                    j = R1V.LIZJ;
                    R1V.LIZJ = uptimeMillis;
                    str = "foreground_online_time";
                    break;
                case 101:
                    j = R1V.LJ;
                    R1V.LJ = uptimeMillis;
                    str = "foreground_offline_time";
                    break;
                case 102:
                    long j2 = uptimeMillis - R1V.LJIIL;
                    R1V.LJIILIIL(j2, "foreground_close_time");
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("<LOOP> eventName=foreground_close_time, currentTime=");
                    LIZ.append(uptimeMillis);
                    LIZ.append(", startTime=");
                    LIZ.append(R1V.LJIIL);
                    LIZ.append(", duration=");
                    LIZ.append(j2);
                    C221018lt.LJFF("WsOnlineRateMonitor", X1D.LIZIZ(LIZ));
                    R1V.LJIIL = uptimeMillis;
                    j = R1V.LJ;
                    R1V.LJ = uptimeMillis;
                    str = "foreground_offline_time";
                    break;
                case 103:
                    j = R1V.LIZLLL;
                    R1V.LIZLLL = uptimeMillis;
                    str = "background_online_time";
                    break;
                case 104:
                    j = R1V.LJFF;
                    R1V.LJFF = uptimeMillis;
                    str = "background_offline_time";
                    break;
                case 105:
                    long j3 = uptimeMillis - R1V.LJIILIIL;
                    R1V.LJIILIIL(j3, "background_close_time");
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("<LOOP> eventName=background_close_time, currentTime=");
                    LIZ2.append(uptimeMillis);
                    LIZ2.append(", startTime=");
                    LIZ2.append(R1V.LJIILIIL);
                    LIZ2.append(", duration=");
                    LIZ2.append(j3);
                    C221018lt.LJFF("WsOnlineRateMonitor", X1D.LIZIZ(LIZ2));
                    R1V.LJIILIIL = uptimeMillis;
                    j = R1V.LJFF;
                    R1V.LJFF = uptimeMillis;
                    str = "background_offline_time";
                    break;
                default:
                    str = "";
                    j = 0;
                    break;
            }
            MS5.LJI(new AqS46S0001000_11(106, 3));
            if (j != 0) {
                long j4 = uptimeMillis - j;
                R1V.LJIILIIL(j4, str);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("<LOOP> eventName=");
                LIZ3.append(str);
                LIZ3.append(", currentTime=");
                LIZ3.append(uptimeMillis);
                C0MT.LIZLLL(LIZ3, ", startTime=", j, ", duration=");
                LIZ3.append(j4);
                C221018lt.LJFF("WsOnlineRateMonitor", X1D.LIZIZ(LIZ3));
                R1V.LJIILIIL(uptimeMillis - R1V.LJII, "total_time");
                R1V.LJIIJ(uptimeMillis, j, str);
            }
        }
        return C76800UCe.LIZ;
    }
}
