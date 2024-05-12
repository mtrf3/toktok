package X;

import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PCP implements PCW {
    public final /* synthetic */ PCQ LIZ;

    public PCP(PCQ pcq) {
        this.LIZ = pcq;
    }

    @Override // X.PCW
    public final void LIZ(JSONObject jSONObject) {
        PCQ pcq = this.LIZ;
        pcq.getClass();
        JSONObject optJSONObject = jSONObject.optJSONObject("custom_event_settings");
        if (optJSONObject != null) {
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("allow_service_name");
            HashSet hashSet = new HashSet();
            if (optJSONObject2 != null) {
                Iterator<String> keys = optJSONObject2.keys();
                while (keys.hasNext()) {
                    hashSet.add(keys.next());
                }
            }
            HashSet hashSet2 = new HashSet();
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("allow_log_type");
            if (optJSONObject3 != null) {
                Iterator<String> keys2 = optJSONObject3.keys();
                while (keys2.hasNext()) {
                    String next = keys2.next();
                    if (optJSONObject3.optInt(next) == 1) {
                        hashSet2.add(next);
                    }
                }
            }
            pcq.LIZ = new C1FC(2, hashSet, hashSet2);
            if (C78248UnM.LJIIJ()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("received customEventSettings=");
                LIZ.append(optJSONObject);
                C64028PAy.LIZ("APM-Config", X1D.LIZIZ(LIZ));
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("parsed CommonEventConfig=");
                LIZ2.append(pcq.LIZ);
                C64028PAy.LIZ("APM-Config", X1D.LIZIZ(LIZ2));
            }
            PCE.LJIIIIZZ(pcq.LIZ);
        }
    }
}
