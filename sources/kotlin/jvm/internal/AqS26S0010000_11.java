package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C0DC;
import X.C2NU;
import X.C57139Mbf;
import X.C66532Q9g;
import X.C66607QCd;
import X.C76800UCe;
import X.C85999Xp5;
import X.E2C;
import X.EF7;
import X.InterfaceC65784Pro;
import X.Q96;
import X.Q9D;
import X.QPY;
import X.R1V;
import X.R1W;
import X.X1D;
import com.appsflyer.AppsFlyerLib;

/* loaded from: classes12.dex */
public class AqS26S0010000_11 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public boolean z0;

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
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            default:
                return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS26S0010000_11(int r3) {
        /*
            r2 = this;
            r2.$t = r3
            switch(r3) {
                case 1: goto Le;
                case 2: goto L5;
                case 3: goto Le;
                default: goto L5;
            }
        L5:
            r1 = r2
            r0 = 1
            r1.z0 = r0
            r0 = 0
        La:
            r1.<init>(r0)
            return
        Le:
            r1 = r2
            r0 = 0
            r1.z0 = r0
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS26S0010000_11.<init>(int):void");
    }

    public static final Object invoke$0(AqS26S0010000_11 aqS26S0010000_11) {
        AppsFlyerLib.getInstance().setCollectIMEI(aqS26S0010000_11.z0);
        return C66532Q9g.LIZ(C76800UCe.LIZ);
    }

    public static final Object invoke$1(AqS26S0010000_11 aqS26S0010000_11) {
        Q96 q96 = new Q96();
        q96.LIZ = "AppsFlyer";
        q96.LIZIZ = "setCollectIMEI";
        q96.LIZJ = C0DC.LIZIZ("collected", Boolean.valueOf(aqS26S0010000_11.z0));
        q96.LIZLLL = E2C.LIZJ("x-tt-dataflow-id", "939524105");
        return C85999Xp5.LJ(new Q9D(q96), C66607QCd.LJLIL, new AqS26S0010000_11(aqS26S0010000_11.z0, 0));
    }

    public static final Object invoke$2(AqS26S0010000_11 aqS26S0010000_11) {
        AppsFlyerLib.getInstance().setCollectOaid(aqS26S0010000_11.z0);
        return C66532Q9g.LIZ(C76800UCe.LIZ);
    }

    public static final Object invoke$3(AqS26S0010000_11 aqS26S0010000_11) {
        Q96 q96 = new Q96();
        q96.LIZ = "AppsFlyer";
        q96.LIZIZ = "setCollectOaid";
        q96.LIZJ = C0DC.LIZIZ("collected", Boolean.valueOf(aqS26S0010000_11.z0));
        q96.LIZLLL = E2C.LIZJ("x-tt-dataflow-id", "939524104");
        return C85999Xp5.LJ(new Q9D(q96), C66607QCd.LJLIL, new AqS26S0010000_11(aqS26S0010000_11.z0, 2));
    }

    public static final Object invoke$4(AqS26S0010000_11 aqS26S0010000_11) {
        String str;
        if (aqS26S0010000_11.z0) {
            str = "background_count_by_others";
        } else {
            str = "foreground_count_by_others";
        }
        R1W.LIZIZ().storeInt(str, R1W.LIZIZ().getInt(str, 0) + 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS26S0010000_11 aqS26S0010000_11) {
        String str;
        if (aqS26S0010000_11.z0) {
            str = "background_count_by_network";
        } else {
            str = "foreground_count_by_network";
        }
        R1W.LIZIZ().storeInt(str, R1W.LIZIZ().getInt(str, 0) + 1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS26S0010000_11 aqS26S0010000_11) {
        boolean z;
        EF7.LIZIZ();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            C57139Mbf.LIZ(new AqS26S0010000_11(aqS26S0010000_11.z0, 4));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[storeDisconnectedCount], isAppBackground = ");
            LIZ.append(aqS26S0010000_11.z0);
            LIZ.append(", disconnected caused by other reason");
            QPY.LIZ("WsOnlineRateMonitor", X1D.LIZIZ(LIZ));
        } else {
            C57139Mbf.LIZ(new AqS26S0010000_11(aqS26S0010000_11.z0, 5));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[storeDisconnectedCount], isAppBackground = ");
            LIZ2.append(aqS26S0010000_11.z0);
            LIZ2.append(", disconnected caused by unavailable network");
            QPY.LIZ("WsOnlineRateMonitor", X1D.LIZIZ(LIZ2));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS26S0010000_11 aqS26S0010000_11) {
        R1V.LIZIZ().storeInt("if_once_connected", aqS26S0010000_11.z0 ? 1 : 0);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS26S0010000_11(boolean z, int i) {
        super(0);
        this.$t = i;
        this.z0 = z;
    }
}
