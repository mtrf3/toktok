package Y;

import X.C65232Piu;
import X.C76272Twa;
import X.C770830u;
import X.C77134UPa;
import X.InterfaceC64592gB;
import X.UQ4;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;

/* loaded from: classes14.dex */
public class AfS22S1000000_13 implements InterfaceC64592gB {
    public final int $t;
    public String s0;

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

    public AfS22S1000000_13(int i) {
        this.$t = i;
        this.s0 = "cold_start";
    }

    public AfS22S1000000_13(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }

    public static final void accept$0(AfS22S1000000_13 afS22S1000000_13, Object obj) {
        LynxViewMonitor.Companion.getClass();
        LynxViewMonitor.INSTANCE.reportCustom(null, "match_x_show_result", afS22S1000000_13.s0, C770830u.LIZLLL("stage", 2), null, C65232Piu.LIZJ("message", "over time"), null, 0);
    }

    public static final void accept$1(AfS22S1000000_13 afS22S1000000_13, Object obj) {
        UQ4.LIZIZ(afS22S1000000_13.s0, "", "facebook", "", "", "auto", 1, null, 3840);
    }

    public static final void accept$2(AfS22S1000000_13 afS22S1000000_13, Object obj) {
        UQ4.LIZLLL(afS22S1000000_13.s0, "", "facebook", "", "", "auto", C77134UPa.LIZ.LIZLLL(), null, 320);
    }

    public static final void accept$3(AfS22S1000000_13 afS22S1000000_13, Object obj) {
        C76272Twa.LJJIIJ(afS22S1000000_13.s0, (Throwable) obj);
    }
}
