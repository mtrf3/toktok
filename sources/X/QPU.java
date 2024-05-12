package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.wschannel.model.SocketState;
import com.ss.android.ugc.aweme.websocket.api.ab.EventSampleRateExp;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes12.dex */
public final class QPU {
    public static QPW LIZIZ;
    public static EnumC66933QOr LIZJ;
    public static int LJ;
    public static long LIZ = SystemClock.uptimeMillis();
    public static boolean LIZLLL = true;

    public static String LIZ(QPW qpw) {
        if (qpw != null) {
            if (!TextUtils.isEmpty(qpw.LJI)) {
                return qpw.LJI;
            }
            if (!TextUtils.isEmpty(qpw.LJFF)) {
                return qpw.LJFF;
            }
        }
        C67128QWe c67128QWe = C67128QWe.LIZIZ;
        String LJLLLL = s.LJLLLL(c67128QWe.LJI(), '?');
        if (LJLLLL.length() > 0) {
            return LJLLLL;
        }
        return c67128QWe.LJI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public static void LIZIZ(int i, SocketState socketState, QPW qpw) {
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
            Object LIZ2 = LIZ(qpw);
            Object obj = "";
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
            int i3 = 0;
            if (i != 1) {
                if (qpw != null) {
                    jSONObject.put("ws_state", qpw.LIZ);
                    jSONObject.put("error_code", qpw.LIZJ);
                    Object obj2 = qpw.LIZIZ;
                    if (obj2 != null) {
                        obj = obj2;
                    }
                    jSONObject.put("error_msg", obj);
                    jSONObject.put("net_error", qpw.LJ);
                }
            } else {
                jSONObject.put("ws_state", 0);
            }
            if (!C84763XOl.LJIIJJI) {
                i2 = 0;
            }
            jSONObject.put("is_background", i2);
            jSONObject.put("network_code", C48208Iw0.LIZ());
            EF7.LIZIZ();
            try {
                i3 = C2NU.LIZ.LIZIZ();
            } catch (Exception unused) {
            }
            jSONObject.put("is_network_available", i3);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("event = ws_connectivity, json = ");
            LIZ3.append(jSONObject);
            QPY.LIZ("WsStateReport", X1D.LIZIZ(LIZ3));
            FMX.LJIILJJIL("ws_connectivity", jSONObject);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}
