package X;

import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class PBQ implements PBM {
    @Override // X.PBM
    public final String getName() {
        return "log";
    }

    @Override // X.PBM
    public final List<String> LIZ() {
        PBX pbx = C64038PBi.LIZ;
        PBY pby = pbx.LJIIL;
        if (pby != null && !C78915Uy7.LJIJJ(pby.LIZIZ)) {
            return pbx.LJIIL.LIZIZ;
        }
        return pbx.LJFF;
    }

    @Override // X.PBM
    public final byte[] LIZIZ(HashMap<Long, JSONArray> hashMap) {
        PCA LIZ;
        try {
            JSONArray jSONArray = new JSONArray();
            for (Long l : hashMap.keySet()) {
                PCA LIZ2 = PC6.LIZIZ().LIZ(String.valueOf(l));
                if (LIZ2 == null) {
                    if (C78248UnM.LJIIJ()) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("HeaderInfo null for key ");
                        LIZ3.append(l);
                        X1D.LIZIZ(LIZ3);
                        InterfaceC64004PAa interfaceC64004PAa = C64028PAy.LIZ;
                        if (interfaceC64004PAa != null) {
                            interfaceC64004PAa.LIZ();
                        }
                    }
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("data", hashMap.get(l));
                    jSONObject.put("header", PC7.LIZIZ(LIZ2));
                    jSONArray.put(jSONObject);
                }
            }
            JSONArray LIZIZ = C61587OFb.LIZ.LIZIZ();
            if (LIZIZ.length() > 0 && (LIZ = PC6.LIZIZ().LIZ(String.valueOf(PC7.LIZ()))) != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("data", LIZIZ);
                jSONObject2.put("header", PC7.LIZIZ(LIZ));
                jSONArray.put(jSONObject2);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("list", jSONArray);
            if (C78248UnM.LJIIJ()) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("request:");
                LIZ4.append(jSONObject3);
                C64028PAy.LIZ("APM-Slardar", X1D.LIZIZ(LIZ4));
            }
            InterfaceC64044PBo interfaceC64044PBo = (InterfaceC64044PBo) PGH.LIZ(InterfaceC64044PBo.class);
            if (interfaceC64044PBo != null) {
                jSONObject3 = interfaceC64044PBo.LIZ();
            }
            return PAK.LIZ(jSONObject3.toString());
        } catch (Exception unused) {
            return null;
        }
    }
}
