package Y;

import X.C1DH;
import X.C232469Ak;
import X.C33862DQs;
import X.C35871E5z;
import X.C36089EEj;
import X.C36093EEn;
import X.C38989FRx;
import X.C40438Fty;
import X.C40445Fu5;
import X.C40449Fu9;
import X.C84763XOl;
import X.EnumC40442Fu2;
import X.InterfaceC55058LjC;
import X.InterfaceC64592gB;
import com.ss.android.ugc.aweme.video.PlayerPluginInstallTask;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class AfS18S0001000_6 implements InterfaceC64592gB {
    public final int $t;
    public int i0;

    public static final void accept$0(AfS18S0001000_6 afS18S0001000_6, Object obj) {
        switch (afS18S0001000_6.i0) {
            case 0:
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            default:
                return;
        }
    }

    public AfS18S0001000_6(int i, int i2) {
        this.$t = i2;
        this.i0 = i;
    }

    public static final void accept$1(AfS18S0001000_6 afS18S0001000_6, Object obj) {
        switch (afS18S0001000_6.i0) {
            case 0:
                return;
            case 1:
                C40449Fu9 c40449Fu9 = (C40449Fu9) obj;
                C40445Fu5 c40445Fu5 = C40445Fu5.LIZIZ;
                c40445Fu5.getClass();
                String str = c40449Fu9.LIZJ;
                if (str == null) {
                    return;
                }
                if (!c40445Fu5.LIZ.containsKey(str)) {
                    c40445Fu5.LIZ.put(c40449Fu9.LIZJ, new ArrayList<>());
                }
                c40445Fu5.LIZ.get(c40449Fu9.LIZJ).add(c40449Fu9);
                return;
            default:
                if (((Boolean) obj).booleanValue()) {
                    if (C40438Fty.LJI("system_launch_1_minute", null)) {
                        C1DH.LIZJ(C40438Fty.LJIIIIZZ);
                        if (((Boolean) C33862DQs.LJ.getValue()).booleanValue()) {
                            C232469Ak.LJFF("SystemLaunch1Minute");
                        }
                    }
                    if (C40438Fty.LJI("system_launch_1_minute_feed", null)) {
                        C1DH.LIZJ(C40438Fty.LJIIIZ);
                    }
                    if (C40438Fty.LJI("system_launch_1_to_2_minute", null)) {
                        C1DH.LIZJ(C40438Fty.LJIIJ);
                    }
                    if (C40438Fty.LJI("system_launch_1_to_2_minute_feed", null)) {
                        C1DH.LIZJ(C40438Fty.LJIIJJI);
                    }
                    C40438Fty.LJI("three_vv", null);
                    ((HashMap) C40438Fty.LIZ).put("three_vv", EnumC40442Fu2.NOT_MONITORED);
                    return;
                }
                return;
        }
    }

    public static final void accept$2(AfS18S0001000_6 afS18S0001000_6, Object obj) {
        switch (afS18S0001000_6.i0) {
            case 0:
                return;
            default:
                if (C84763XOl.LJIIJJI) {
                    PlayerPluginInstallTask playerPluginInstallTask = new PlayerPluginInstallTask();
                    C36093EEn.LIZ.getClass();
                    C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
                    LJIIIZ.LIZIZ(playerPluginInstallTask, true);
                    LJIIIZ.LIZJ();
                    C36093EEn.LJ(playerPluginInstallTask);
                    C35871E5z.LIZ.dispose();
                    return;
                }
                return;
        }
    }

    public static final void accept$3(AfS18S0001000_6 afS18S0001000_6, Object obj) {
        switch (afS18S0001000_6.i0) {
            case 0:
                return;
            default:
                if ((obj instanceof InterfaceC55058LjC) && C38989FRx.LIZ) {
                    C38989FRx.LIZIZ("1", null);
                    return;
                }
                return;
        }
    }
}
