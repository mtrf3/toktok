package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.wschannel.model.SocketState;
import com.ss.android.ugc.aweme.websocket.api.ab.EventSampleRateExp;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes12.dex */
public final class QPQ {
    public static QPS LIZIZ;
    public static EnumC66933QOr LIZJ;
    public static int LJ;
    public static long LIZ = SystemClock.uptimeMillis();
    public static boolean LIZLLL = true;

    public static String LIZ(QPS qps) {
        if (qps != null) {
            if (!TextUtils.isEmpty(qps.LJI)) {
                return qps.LJI;
            }
            if (!TextUtils.isEmpty(qps.LJFF)) {
                return qps.LJFF;
            }
        }
        C67143QWt c67143QWt = QWY.LJIIIZ;
        String LJLLLL = s.LJLLLL(c67143QWt.LIZ().LIZJ, '?');
        if (LJLLLL.length() > 0) {
            return LJLLLL;
        }
        return c67143QWt.LIZ().LIZJ;
    }

    public static void LIZIZ(int i, SocketState socketState, QPS qps) {
        if (!EventSampleRateExp.LIZ("ws_connectivity")) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", i);
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = LIZ;
            long j2 = uptimeMillis - j;
            if (j > 0 || j2 > 0) {
                jSONObject.put("duration", j2);
            }
            String LIZ2 = LIZ(qps);
            String str = "";
            if (LIZ2 == null) {
                LIZ2 = "";
            }
            jSONObject.put("url", LIZ2);
            jSONObject.put("connection_type", socketState.connectionType);
            jSONObject.put("connection_state", socketState.connectionState);
            jSONObject.put("channel_id", socketState.channelId);
            jSONObject.put("channel_type", socketState.channelType);
            jSONObject.put("retry_times", LJ);
            int i2 = 1;
            if (i != 1) {
                o.LJI(qps);
                jSONObject.put("ws_state", qps.LIZ);
                jSONObject.put("error_code", qps.LIZJ);
                String str2 = qps.LIZIZ;
                if (str2 != null) {
                    str = str2;
                }
                jSONObject.put("error_msg", str);
                jSONObject.put("net_error", qps.LJ);
            } else {
                jSONObject.put("ws_state", 0);
            }
            if (!C84763XOl.LJIIJJI) {
                i2 = 0;
            }
            jSONObject.put("is_background", i2);
            QWY.LJIIIZ.LIZ();
            jSONObject.put("network_code", QWY.LIZ());
            jSONObject.put("is_network_available", C48203Ivv.LJ(EF7.LIZIZ()) ? 1 : 0);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("ws_connectivity: ");
            LIZ3.append(jSONObject);
            C221018lt.LIZ("WsPerfTracker", X1D.LIZIZ(LIZ3));
            FMX.LJIILJJIL("ws_connectivity", jSONObject);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}
