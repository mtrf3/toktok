package X;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IVX {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    public final void LIZ() {
        int i;
        try {
            if (TextUtils.isEmpty(this.LIZIZ)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("vid", this.LIZIZ);
            if (this.LIZJ) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_hit", i);
            String str = this.LIZLLL;
            if (str != null) {
                jSONObject.put("miss_reason", str);
            }
            String str2 = this.LJ;
            if (str2 != null) {
                jSONObject.put("hit_config_id", str2);
            }
            String str3 = this.LJFF;
            if (str3 != null) {
                jSONObject.put("business_related_id", str3);
            }
            String str4 = this.LIZ;
            if (str4 != null) {
                jSONObject.put("source_id", str4);
            }
            C46982IcE.LIZJ().onEvent("solaria_ab", jSONObject);
        } catch (Exception unused) {
        }
    }

    public IVX(String str, String str2, boolean z, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
    }
}
