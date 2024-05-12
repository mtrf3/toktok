package X;

import java.util.HashMap;

/* loaded from: classes12.dex */
public class PDT {
    public String LIZ;
    public final java.util.Map<String, String> LIZIZ = new HashMap();

    public PDT(String str) {
        this.LIZ = str;
    }

    public final C58330Mus LIZ(java.util.Map<String, String> map) {
        ((HashMap) map).put("minor_version", "1");
        this.LIZ = EZS.LIZ(this.LIZ, map);
        ((HashMap) this.LIZIZ).put("Content-Type", "application/json; charset=utf-8");
        return new C58330Mus(this.LIZ, this.LIZIZ);
    }
}
