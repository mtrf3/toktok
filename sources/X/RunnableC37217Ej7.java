package X;

import com.bytedance.retrofit2.client.Request;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ej7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC37217Ej7 implements Runnable {
    public final /* synthetic */ C68322mC<String> LJLIL;
    public final /* synthetic */ Request LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public RunnableC37217Ej7(C68322mC<String> c68322mC, Request request, long j, String str, String str2) {
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = request;
        this.LJLJI = j;
        this.LJLJJI = str;
        this.LJLJJL = str2;
    }

    public final void LIZ() {
        String key = this.LJLIL.element;
        o.LJIIIIZZ(key, "key");
        String path = this.LJLILLLLZI.getPath();
        o.LJIIIIZZ(path, "request.path");
        String method = this.LJLILLLLZI.getMethod();
        o.LJIIIIZZ(method, "request.method");
        long j = this.LJLJI;
        String logId = this.LJLJJI;
        o.LJIIIIZZ(logId, "logId");
        String str = this.LJLJJL;
        java.util.Map<String, Long> map = C37219Ej9.LIZLLL;
        Long l = (Long) ((LinkedHashMap) map).get(key);
        if (l != null) {
            long longValue = j - l.longValue();
            if (longValue < C37219Ej9.LIZIZ()) {
                C09900aA.LJI("repeat_request_quickly", new JSONObject().put("limitTime", C37219Ej9.LIZIZ()).put("urlPath", path).put("method", method).put("activityName", str), new JSONObject().put("passTime", (int) longValue), new JSONObject().put("logId", logId));
            }
        }
        map.put(key, Long.valueOf(j));
        C37219Ej9.LIZLLL();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
