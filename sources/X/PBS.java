package X;

import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class PBS implements PBM {
    @Override // X.PBM
    public final String getName() {
        return "double_send";
    }

    @Override // X.PBM
    public final List<String> LIZ() {
        PBX pbx = C64038PBi.LIZ;
        PBY pby = pbx.LJIIL;
        if (pby != null && !C78915Uy7.LJIJJ(pby.LIZJ)) {
            return pbx.LJIIL.LIZJ;
        }
        return pbx.LJI;
    }

    @Override // X.PBM
    public final byte[] LIZIZ(HashMap<Long, JSONArray> hashMap) {
        try {
            JSONArray jSONArray = new JSONArray();
            for (Long l : hashMap.keySet()) {
                PCA LIZ = PC6.LIZIZ().LIZ(String.valueOf(l));
                if (LIZ == null) {
                    if (C78248UnM.LJIIJ()) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("HeaderInfo null for key ");
                        LIZ2.append(l);
                        X1D.LIZIZ(LIZ2);
                        InterfaceC64004PAa interfaceC64004PAa = C64028PAy.LIZ;
                        if (interfaceC64004PAa != null) {
                            interfaceC64004PAa.LIZ();
                        }
                    }
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("data", hashMap.get(l));
                    jSONObject.put("header", PC7.LIZIZ(LIZ));
                    jSONArray.put(jSONObject);
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("list", jSONArray);
            if (C78248UnM.LJIIJ()) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("request:");
                LIZ3.append(jSONObject2);
                C64028PAy.LIZ("APM-Slardar", X1D.LIZIZ(LIZ3));
            }
            InterfaceC64044PBo interfaceC64044PBo = (InterfaceC64044PBo) PGH.LIZ(InterfaceC64044PBo.class);
            if (interfaceC64044PBo != null) {
                jSONObject2 = interfaceC64044PBo.LIZ();
            }
            return PAK.LIZ(jSONObject2.toString());
        } catch (Exception unused) {
            return null;
        }
    }
}
