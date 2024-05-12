package X;

import android.net.NetworkInfo;
import com.ss.android.ugc.aweme.notice.api.ab.WsConnectTimeoutReconnectExp;
import com.ss.android.ugc.aweme.notice.api.ab.WsNetAvailableDelayConnectExp;
import com.ss.android.ugc.aweme.websocket.api.ab.WsPingExp;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.QWa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67124QWa {
    public static ScheduledFuture<?> LIZIZ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static final C67124QWa LIZ = new C67124QWa();
    public static EnumC48190Ivi LIZJ = C2NU.LIZ.LIZIZ;

    public static void LIZJ() {
        C221018lt.LJFF("WsReconnectUtils", "[stopReconnectTimer]");
        ScheduledFuture<?> scheduledFuture = LIZIZ;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        LIZIZ = null;
    }

    public static void LIZ(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[reconnect], enterFrom = ");
        LIZ2.append(enterFrom);
        C221018lt.LJFF("WsReconnectUtils", X1D.LIZIZ(LIZ2));
        C67143QWt c67143QWt = QWY.LJIIIZ;
        c67143QWt.LIZ().onCloseWs(new C67137QWn(new C47766Ios(c67143QWt.LIZ().LIZJ), enterFrom));
        c67143QWt.LIZ().onOpenWs(new B8E(new BLB(c67143QWt.LIZ().LIZJ)));
    }

    public static void LIZIZ(EnumC66933QOr enumC66933QOr) {
        if (LIZIZ == null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[startReconnectTimer], state = ");
            LIZ2.append(enumC66933QOr.name());
            C221018lt.LJFF("WsReconnectUtils", X1D.LIZIZ(LIZ2));
            LIZIZ = C38995FSd.LJ().schedule(RunnableC67129QWf.LJLIL, ((Number) WsConnectTimeoutReconnectExp.LIZLLL.getValue()).longValue(), TimeUnit.SECONDS);
        }
    }

    @QD3
    public final void onNetworkChange(C56842Ky event) {
        NetworkInfo networkInfo;
        o.LJIIIZ(event, "event");
        C48202Ivu c48202Ivu = C2NU.LIZ;
        c48202Ivu.getClass();
        synchronized (C48202Ivu.class) {
            networkInfo = c48202Ivu.LIZ;
        }
        if (networkInfo != null && (networkInfo.getState() == NetworkInfo.State.CONNECTING || networkInfo.getState() == NetworkInfo.State.DISCONNECTING)) {
            return;
        }
        if (c48202Ivu.LIZIZ()) {
            if (((Boolean) WsPingExp.LIZJ.getValue()).booleanValue() && !LJ) {
                LJ = true;
                EnumC48190Ivi networkStateBeforePing = LIZJ;
                J1X j1x = J1X.LIZ;
                String host = (String) WsPingExp.LJ.getValue();
                o.LJIIIIZZ(networkStateBeforePing, "networkStateBeforePing");
                long longValue = ((Number) WsPingExp.LIZLLL.getValue()).longValue();
                int intValue = ((Number) WsPingExp.LJFF.getValue()).intValue();
                C67144QWu c67144QWu = new C67144QWu();
                j1x.getClass();
                o.LJIIIZ(host, "host");
                C10K.LIZJ(new J1V(intValue, longValue, networkStateBeforePing, c67144QWu, host));
            }
            if (((Boolean) WsNetAvailableDelayConnectExp.LIZJ.getValue()).booleanValue() && !LIZLLL) {
                LIZLLL = true;
                MS5.LIZIZ(C67131QWh.LJLIL, ((Number) WsNetAvailableDelayConnectExp.LIZLLL.getValue()).longValue());
            }
        }
        LIZJ = c48202Ivu.LIZIZ;
    }
}
