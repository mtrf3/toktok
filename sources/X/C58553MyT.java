package X;

import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.MyT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58553MyT implements InterfaceC58548MyO<OSI<Aweme, JSONObject, String, String>> {
    public final InterfaceC58538MyE LIZ;
    public final Gson LIZIZ;

    @Override // X.InterfaceC58548MyO
    public final void invoke(OSI<Aweme, JSONObject, String, String> osi) {
        OSI<Aweme, JSONObject, String, String> osi2 = osi;
        JSONObject jSONObject = osi2.LIZIZ;
        String str = osi2.LIZJ;
        String str2 = osi2.LIZLLL;
        String str3 = str;
        JSONObject jSONObject2 = jSONObject;
        JSONObject LJJIJL = C79057V0z.LJJIJL(jSONObject2.optString("ad_extra_data"));
        if (LJJIJL.has("session_info")) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("session_info", new C58551MyR(this, str3, str2, jSONObject2));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str4 = (String) entry.getKey();
            Object invoke = ((InterfaceC65784Pro) entry.getValue()).invoke();
            if (invoke != null) {
                C79057V0z.LJJIJLIJ(LJJIJL, str4, invoke);
            }
        }
        C79057V0z.LJJIJLIJ(jSONObject2, "ad_extra_data", LJJIJL);
    }

    public C58553MyT(InterfaceC58538MyE adSessionProducer, Gson gson) {
        o.LJIIIZ(adSessionProducer, "adSessionProducer");
        this.LIZ = adSessionProducer;
        this.LIZIZ = gson;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ads_");
        LIZ.append(C16880lQ.LJLLJ(C58553MyT.class));
        X1D.LIZIZ(LIZ);
    }
}
