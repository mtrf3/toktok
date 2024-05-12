package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.PGz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64185PGz implements PE2 {
    public final HashMap<String, PH1> LJLILLLLZI = new HashMap<>();
    public boolean LJLIL = true;

    public C64185PGz() {
        F9U.LIZ.LIZ(this);
    }

    @Override // X.PE2
    public final void LIZIZ(long j) {
        float f;
        if (!this.LJLILLLLZI.isEmpty()) {
            Iterator<Map.Entry<String, PH1>> it = this.LJLILLLLZI.entrySet().iterator();
            int i = PH9.LIZIZ;
            while (it.hasNext()) {
                Map.Entry<String, PH1> next = it.next();
                String key = next.getKey();
                PH1 value = next.getValue();
                boolean z = true;
                if (j - value.LIZIZ > 120000) {
                    it.remove();
                    int i2 = value.LIZJ;
                    if (i2 > 0) {
                        f = value.LIZ / i2;
                    } else {
                        f = -1.0f;
                    }
                    if (C09970aH.LJII()) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("aggregate fps: ");
                        LIZ.append(key);
                        LIZ.append(" , value: ");
                        LIZ.append(f);
                        X1D.LIZIZ(LIZ);
                    }
                    if (f > 0.0f) {
                        float f2 = i;
                        if (f > f2) {
                            f = f2;
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("fps", f);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(WM7.SCENE_SERVICE, key);
                            PEF pef = new PEF("fps", key, jSONObject, jSONObject2, null);
                            C78866UxK.LJLI(pef, true);
                            JSONObject jSONObject3 = pef.LJFF;
                            jSONObject3.put("refresh_rate", i);
                            if (this.LJLIL) {
                                this.LJLIL = false;
                                jSONObject3.put("device_max_refresh_rate", PH9.LIZJ);
                                if (PH9.LIZLLL) {
                                    z = false;
                                }
                                jSONObject3.put("refresh_rate_restricted", z);
                            }
                            C64089PDh.LJIIJ().LIZLLL(pef);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }
}
