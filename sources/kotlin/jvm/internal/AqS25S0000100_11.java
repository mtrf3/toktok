package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C0MT;
import X.C221018lt;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.QPY;
import X.R1V;
import X.R1W;
import X.X1D;

/* loaded from: classes12.dex */
public class AqS25S0000100_11 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public long j0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS25S0000100_11 aqS25S0000100_11) {
        if (R1W.LIZIZ) {
            R1W.LJIILIIL = aqS25S0000100_11.j0;
        } else {
            R1W.LJIIL = aqS25S0000100_11.j0;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS25S0000100_11 aqS25S0000100_11) {
        long j;
        String str;
        if (R1W.LIZIZ) {
            j = R1W.LJIILIIL;
            R1W.LJIILIIL = 0L;
            str = "background_close_time";
        } else {
            j = R1W.LJIIL;
            R1W.LJIIL = 0L;
            str = "foreground_close_time";
        }
        if (j != 0) {
            long j2 = aqS25S0000100_11.j0 - j;
            R1W.LJIIL(j2, str);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[recordStartConnection], eventName = ");
            LIZ.append(str);
            LIZ.append(", currentTime = ");
            LIZ.append(aqS25S0000100_11.j0);
            C0MT.LIZLLL(LIZ, ", startTime = ", j, ", duration = ");
            LIZ.append(j2);
            QPY.LIZ("WsOnlineRateMonitor", X1D.LIZIZ(LIZ));
            R1W.LJIIIIZZ(aqS25S0000100_11.j0, j, str);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS25S0000100_11 aqS25S0000100_11) {
        if (R1V.LIZIZ) {
            R1V.LJIILIIL = aqS25S0000100_11.j0;
        } else {
            R1V.LJIIL = aqS25S0000100_11.j0;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS25S0000100_11 aqS25S0000100_11) {
        long j;
        String str;
        if (R1V.LIZIZ) {
            j = R1V.LJIILIIL;
            R1V.LJIILIIL = 0L;
            str = "background_close_time";
        } else {
            j = R1V.LJIIL;
            R1V.LJIIL = 0L;
            str = "foreground_close_time";
        }
        if (j != 0) {
            long j2 = aqS25S0000100_11.j0 - j;
            R1V.LJIILIIL(j2, str);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[recordStartConnection], eventName=");
            LIZ.append(str);
            LIZ.append(", currentTime=");
            LIZ.append(aqS25S0000100_11.j0);
            C0MT.LIZLLL(LIZ, ", startTime=", j, ", duration=");
            LIZ.append(j2);
            C221018lt.LJFF("WsOnlineRateMonitor", X1D.LIZIZ(LIZ));
            R1V.LJIIJ(aqS25S0000100_11.j0, j, str);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS25S0000100_11(long j, int i) {
        super(0);
        this.$t = i;
        this.j0 = j;
    }
}
