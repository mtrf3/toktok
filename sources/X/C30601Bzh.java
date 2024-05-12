package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import org.json.JSONObject;

/* renamed from: X.Bzh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30601Bzh extends AbstractC38127Exn<JSONObject, Object> {
    @Override // X.AbstractC38127Exn
    public final Object invoke(JSONObject jSONObject, C38131Exr c38131Exr) {
        char c;
        JSONObject jSONObject2 = jSONObject;
        String optString = jSONObject2.optString("type");
        JSONObject jSONObject3 = JSONObjectProtectorUtils.getJSONObject(jSONObject2, "args");
        optString.getClass();
        int hashCode = optString.hashCode();
        if (hashCode != -1853762817) {
            if (hashCode != -858688242) {
                if (hashCode == 1821543916 && optString.equals("monitorStatus")) {
                    c = 2;
                }
                c = 65535;
            } else {
                if (optString.equals("monitorDuration")) {
                    c = 1;
                }
                c = 65535;
            }
        } else {
            if (optString.equals("monitorStatusAndDuration")) {
                c = 0;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    return null;
                }
                C0K2.LJIIIIZZ(jSONObject3.optString("service"), jSONObject3.optInt("status"), jSONObject3.optJSONObject("ext_json"));
                return null;
            }
            String optString2 = jSONObject3.optString("service");
            long optLong = jSONObject3.optLong("duration");
            JSONObject optJSONObject = jSONObject3.optJSONObject("ext_json");
            InterfaceC31203CMl interfaceC31203CMl = C0K2.LIZ;
            if (interfaceC31203CMl == null) {
                return null;
            }
            interfaceC31203CMl.LJIIJ(optString2, optLong, optJSONObject);
            return null;
        }
        C0K2.LJIIJ(jSONObject3.optInt("status"), jSONObject3.optLong("duration"), jSONObject3.optString("service"), jSONObject3.optJSONObject("ext_json"));
        return null;
    }
}
