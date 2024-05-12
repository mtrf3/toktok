package X;

import Y.ACallableS114S0100000_11;
import Y.ARunnableS47S0100000_11;
import android.os.SystemClock;
import com.google.android.play.core.assetpacks.s0;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.websocket.api.ab.WsMonitorConfigExp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS25S0000100_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QWY {
    public static final C67143QWt LJIIIZ = new C67143QWt();
    public static QWY LJIIJ;
    public volatile EnumC66933QOr LIZLLL;
    public volatile boolean LJ;
    public volatile String LIZ = "unknown";
    public final C56258M6c LIZIZ = new C56258M6c();
    public String LIZJ = "";
    public final QWX LJFF = new QWX(this);
    public final List<QOQ> LJI = FII.LIZ();
    public final List<InterfaceC66944QPc> LJII = FII.LIZ();
    public final ConcurrentHashMap<M50, InterfaceC67147QWx> LJIIIIZZ = new ConcurrentHashMap<>();

    public static int LIZ() {
        EnumC48210Iw2 networkType = NetworkUtils.getNetworkType(EF7.LIZIZ());
        if (networkType == EnumC48210Iw2.WIFI) {
            return 1;
        }
        if (networkType == EnumC48210Iw2.MOBILE_2G) {
            return 2;
        }
        if (networkType == EnumC48210Iw2.MOBILE_3G) {
            return 3;
        }
        if (networkType == EnumC48210Iw2.MOBILE_4G) {
            return 4;
        }
        return 0;
    }

    public static final void LIZIZ(s0 s0Var) {
        QMR qmr = new QMR(1239108);
        C67134QWk c67134QWk = (C67134QWk) s0Var.LIZIZ;
        qmr.LIZJ = c67134QWk.LIZJ;
        qmr.LJIIIIZZ = c67134QWk.LIZIZ;
        qmr.LJ = c67134QWk.LJ;
        qmr.LIZLLL = c67134QWk.LIZLLL;
        qmr.LJFF = c67134QWk.LIZ;
        qmr.LJI = c67134QWk.LJFF;
        qmr.LJII = c67134QWk.LJI;
        c67134QWk.getClass();
        new C66640QDk("", "");
        java.util.Map<String, String> map = c67134QWk.LJII;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                ((HashMap) qmr.LIZIZ).put(entry.getKey(), entry.getValue());
            }
        }
        QOW.LJFF(qmr.LIZ());
    }

    public final void LIZJ(InterfaceC66944QPc listener) {
        o.LJIIIZ(listener, "listener");
        this.LJII.add(listener);
    }

    @QD3
    public final void onCloseWs(C67137QWn event) {
        o.LJIIIZ(event, "event");
        String enterFrom = event.LJLILLLLZI;
        C2U8.LIZ(new C67142QWs(new C0HK(this.LIZJ, EnumC67133QWj.CLOSING)));
        o.LJIIIZ(enterFrom, "enterFrom");
        if (WsMonitorConfigExp.LJFF() && R1V.LJIIIIZZ != 1) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[recordActivelyCloseConnection], enterFrom=");
            LIZ.append(enterFrom);
            C221018lt.LJFF("WsOnlineRateMonitor", X1D.LIZIZ(LIZ));
            if (!R1V.LJIILJJIL) {
                R1V.LJIILJJIL = true;
                MS5.LJI(new AqS25S0000100_11(SystemClock.uptimeMillis(), 2));
            }
        }
        QOW.LJI();
    }

    @QD3
    public final void onOpenWs(B8E event) {
        o.LJIIIZ(event, "event");
        C10K.LIZIZ(new ACallableS114S0100000_11(this, 6), C38995FSd.LIZLLL(), null);
    }

    @QD3
    public final void onSendWs(C115124fU e) {
        o.LJIIIZ(e, "e");
        s0 s0Var = e.LJLIL;
        if (s0Var.LIZIZ != null) {
            if (C33806DOo.LIZ()) {
                C38995FSd.LIZJ().submit(new ARunnableS47S0100000_11(s0Var, 141));
            } else {
                LIZIZ(s0Var);
            }
        }
    }

    public final void LIZLLL(M50 psm, InterfaceC67147QWx listener) {
        o.LJIIIZ(psm, "psm");
        o.LJIIIZ(listener, "listener");
        this.LJIIIIZZ.put(psm, listener);
    }
}
