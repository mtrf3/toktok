package X;

import com.orbu.core.TTKOrbu;
import com.orbu.core.adapter.TTKResponse;
import com.orbu.core.adapter.TTKResponseKt;
import com.orbu.core.adapter.TTKSDKRequest;
import java.util.LinkedHashMap;

/* renamed from: X.XpY, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86028XpY implements InterfaceC86026XpW {
    @Override // X.InterfaceC86026XpW
    public final C86031Xpb LIZ(C86027XpX c86027XpX) {
        Q9D q9d = c86027XpX.LIZJ;
        TTKOrbu tTKOrbu = TTKOrbu.INSTANCE;
        if (tTKOrbu.enableInterceptor()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            java.util.Map<String, Object> map = q9d.LIZLLL;
            if (map != null) {
                Object obj = map.get("x-tt-dataflow-id");
                if ((obj instanceof String) && obj != null) {
                    linkedHashMap.put("x-tt-dataflow-id", obj);
                }
            }
            TTKResponse shouldInterceptTTKRequest = tTKOrbu.shouldInterceptTTKRequest(new TTKSDKRequest(q9d.LIZ, q9d.LIZIZ, q9d.LIZJ, linkedHashMap));
            if (shouldInterceptTTKRequest != null && TTKResponseKt.isBlock(shouldInterceptTTKRequest)) {
                C86030Xpa c86030Xpa = new C86030Xpa();
                c86030Xpa.LIZ = q9d;
                c86030Xpa.LIZIZ = shouldInterceptTTKRequest.getStatusCode();
                c86030Xpa.LIZJ = shouldInterceptTTKRequest.getDescription();
                return new C86031Xpb(c86030Xpa);
            }
        }
        return c86027XpX.LIZ(q9d);
    }
}
