package X;

import com.ss.android.ugc.aweme.commercialize.engagement.trace.EngagementTrace;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.MyU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58554MyU implements InterfaceC58548MyO<OSI<Aweme, JSONObject, String, String>> {
    public final EngagementTrace LIZ;

    public C58554MyU(EngagementTrace engagementTrace) {
        o.LJIIIZ(engagementTrace, "engagementTrace");
        this.LIZ = engagementTrace;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ads_");
        LIZ.append(C16880lQ.LJLLJ(C58554MyU.class));
        X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC58548MyO
    public final void invoke(OSI<Aweme, JSONObject, String, String> osi) {
        OSI<Aweme, JSONObject, String, String> osi2 = osi;
        JSONObject jSONObject = osi2.LIZIZ;
        String str = osi2.LIZJ;
        JSONObject jSONObject2 = jSONObject;
        o.LJIIIZ(str, "<this>");
        switch (str.hashCode()) {
            case -1408181836:
                if (!str.equals("realtime_click")) {
                    return;
                }
                break;
            case -178769800:
                if (!str.equals("otherclick")) {
                    return;
                }
                break;
            case 94750088:
                if (!str.equals("click")) {
                    return;
                }
                break;
            case 1503170220:
                if (!str.equals("challenge_click")) {
                    return;
                }
                break;
            case 1574250222:
                if (!str.equals("music_click")) {
                    return;
                }
                break;
            default:
                return;
        }
        JSONObject LJJIJL = C79057V0z.LJJIJL(jSONObject2.optString("ad_extra_data"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : this.LIZ.LIZ().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!LJJIJL.has(key)) {
                linkedHashMap.put(key, new AqS160S0100000_10(value, 3));
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str2 = (String) entry2.getKey();
            Object invoke = ((InterfaceC65784Pro) entry2.getValue()).invoke();
            if (invoke != null) {
                C79057V0z.LJJIJLIJ(LJJIJL, str2, invoke);
            }
        }
        C79057V0z.LJJIJLIJ(jSONObject2, "ad_extra_data", LJJIJL);
    }
}
