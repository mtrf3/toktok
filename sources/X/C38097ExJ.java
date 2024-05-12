package X;

import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.ExJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38097ExJ {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(Integer num) {
        if (num == null) {
            return 3;
        }
        if (num.intValue() == 1) {
            return 0;
        }
        if (num.intValue() == -1) {
            return 1;
        }
        if (num.intValue() != -2) {
            return 3;
        }
        return 2;
    }

    public static void LIZLLL(C60726NsQ c60726NsQ, C37977EvN c37977EvN, long j) {
        long j2;
        C38162EyM c38162EyM = new C38162EyM();
        c38162EyM.LJLILLLLZI = c37977EvN.LIZ;
        c38162EyM.LJLJI = LIZ(c37977EvN.LIZIZ);
        String str = c37977EvN.LIZJ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(", isRunInMainThread: ");
        LIZ2.append(c37977EvN.LJII);
        c38162EyM.LJLJJI = o.LJIILLIIL(X1D.LIZIZ(LIZ2), str);
        Long l = c37977EvN.LJ;
        if (l != null) {
            j2 = l.longValue();
        } else {
            j2 = 0;
        }
        c38162EyM.LJLJJLL = j2;
        if (j2 != 0) {
            c38162EyM.LJLJL = j;
            c38162EyM.LJLJJL = j - j2;
        }
        LynxViewMonitor.Companion.getClass();
        LynxViewMonitor.INSTANCE.reportJsbInfo(c60726NsQ, c38162EyM);
    }

    public static void LIZIZ(String str, C60737Nsb c60737Nsb, String url, JSONObject jSONObject) {
        String str2;
        String str3;
        o.LJIIJ(url, "url");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject put = jSONObject.put("timestamp", System.currentTimeMillis());
        if (c60737Nsb != null) {
            str2 = c60737Nsb.containerId;
        } else {
            str2 = null;
        }
        C79605VMb c79605VMb = new C79605VMb(str);
        if (c60737Nsb == null || (str3 = c60737Nsb.bid) == null) {
            str3 = "hybridkit_default_bid";
        }
        c79605VMb.LIZIZ = str3;
        c79605VMb.LIZ = url;
        c79605VMb.LIZLLL = put;
        c79605VMb.LIZIZ(0);
        FD5.LJ(str2, c79605VMb.LIZ());
    }

    public static void LIZJ(C60737Nsb context, String str, int i, String str2, Integer num) {
        InterfaceC60710NsA interfaceC60710NsA;
        android.net.Uri LIZIZ;
        o.LJIIJ(context, "context");
        if (str == null && ((interfaceC60710NsA = context.hybridParams) == null || (LIZIZ = interfaceC60710NsA.LIZIZ()) == null || (str = LIZIZ.toString()) == null)) {
            str = "";
        }
        JSONObject LIZLLL = C770830u.LIZLLL("state", i);
        if (num != null) {
            LIZLLL.put("errorCode", num.intValue());
        }
        if (str2 != null) {
            LIZLLL.put("mode", "segmenting");
            LIZLLL.put("segmentingID", str2);
        } else {
            LIZLLL.put("mode", "legacy");
        }
        LIZIZ("hybrid_prefetch_cache_state", context, str, LIZLLL);
        FD5.LJIIIZ(context.containerId, "lynx_prefetch", "getResult", null, context.url, context.bid, null, String.valueOf(i), 72);
    }
}
