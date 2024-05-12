package X;

import com.google.gson.Gson;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS41S1300000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.MyS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58552MyS implements InterfaceC58548MyO<OSH<M95, java.util.Map<String, Object>, String>> {
    public final InterfaceC58538MyE LIZ;
    public final Gson LIZIZ;

    @Override // X.InterfaceC58548MyO
    public final void invoke(OSH<M95, java.util.Map<String, Object>, String> osh) {
        String str;
        OSH<M95, java.util.Map<String, Object>, String> osh2 = osh;
        M95 m95 = osh2.LIZ;
        java.util.Map map = osh2.LIZIZ;
        String str2 = osh2.LIZJ;
        java.util.Map map2 = map;
        M95 m952 = m95;
        Object obj = map2.get("ad_extra_data");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        JSONObject LJJIJL = C79057V0z.LJJIJL(str);
        if (LJJIJL.has("session_info")) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("session_info", new AqS41S1300000_10(this, (C58552MyS) str2, (String) map2, (java.util.Map<String, Object>) m952, (M95) 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            Object invoke = ((InterfaceC65784Pro) entry.getValue()).invoke();
            if (invoke != null) {
                C79057V0z.LJJIJLIJ(LJJIJL, str3, invoke);
            }
        }
        map2.put("ad_extra_data", LJJIJL);
    }

    public C58552MyS(InterfaceC58538MyE adSessionProducer, Gson gson) {
        o.LJIIIZ(adSessionProducer, "adSessionProducer");
        this.LIZ = adSessionProducer;
        this.LIZIZ = gson;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ads_");
        LIZ.append(C16880lQ.LJLLJ(C58552MyS.class));
        X1D.LIZIZ(LIZ);
    }
}
