package X;

import com.bytedance.retrofit2.client.Request;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EOa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36340EOa implements InterfaceC65104Pgq {
    public static final /* synthetic */ int LIZ = 0;

    @Override // X.InterfaceC65104Pgq
    public final void LIZJ(Request request) {
        o.LJIIIZ(request, "request");
    }

    @Override // X.InterfaceC65104Pgq
    public final void LJFF(C64797Pbt<?> response) {
        o.LJIIIZ(response, "response");
    }

    @Override // X.InterfaceC65104Pgq
    public final void LJII(Request request) {
        o.LJIIIZ(request, "request");
    }

    @Override // X.InterfaceC65104Pgq
    public final void LJIIIIZZ(Request request, C64797Pbt<?> c64797Pbt, Throwable th) {
        o.LJIIIZ(request, "request");
    }

    @Override // X.InterfaceC65104Pgq
    public final void onException(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
    }

    public static void LJIIJ(C36341EOb c36341EOb, String str, String str2) {
        c36341EOb.LJI.clear();
        HashMap<String, Long> hashMap = c36341EOb.LJI;
        C36341EOb.LIZIZ(hashMap, c36341EOb.LIZJ);
        C36341EOb.LIZIZ(hashMap, c36341EOb.LIZLLL);
        C36341EOb.LIZIZ(hashMap, c36341EOb.LJ);
        C36341EOb.LIZIZ(hashMap, c36341EOb.LJFF);
        Iterator<Map.Entry<String, Long>> it = hashMap.entrySet().iterator();
        long j = 0;
        while (it.hasNext()) {
            j += it.next().getValue().longValue();
        }
        JSONObject put = new JSONObject().put("all_handler_duration", j).put("chain_proceed_duration", c36341EOb.LIZ).put("partner_interceptor_duration", c36341EOb.LIZIZ).put("partner_interceptor_self_duration", c36341EOb.LIZIZ - c36341EOb.LIZ).put("partner_process_duration", (c36341EOb.LIZIZ - j) - c36341EOb.LIZ);
        for (Map.Entry<String, Long> entry : c36341EOb.LIZJ.entrySet()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(entry.getKey());
            LIZ2.append('_');
            LIZ2.append("request");
            LIZ2.append("_duration");
            put.put(X1D.LIZIZ(LIZ2), entry.getValue().longValue());
        }
        for (Map.Entry<String, Long> entry2 : c36341EOb.LIZLLL.entrySet()) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(entry2.getKey());
            LIZ3.append('_');
            LIZ3.append("response");
            LIZ3.append("_duration");
            put.put(X1D.LIZIZ(LIZ3), entry2.getValue().longValue());
        }
        for (Map.Entry<String, Long> entry3 : c36341EOb.LJ.entrySet()) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(entry3.getKey());
            LIZ4.append('_');
            LIZ4.append("exception");
            LIZ4.append("_duration");
            put.put(X1D.LIZIZ(LIZ4), entry3.getValue().longValue());
        }
        for (Map.Entry<String, Long> entry4 : c36341EOb.LJFF.entrySet()) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(entry4.getKey());
            LIZ5.append('_');
            LIZ5.append("block");
            LIZ5.append("_duration");
            put.put(X1D.LIZIZ(LIZ5), entry4.getValue().longValue());
        }
        C09900aA.LJI("network_partner_log", new JSONObject().put("path", str), put, new JSONObject().put("x-tt-logid", str2));
    }
}
