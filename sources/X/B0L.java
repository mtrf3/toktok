package X;

import java.util.HashMap;

/* loaded from: classes5.dex */
public final class B0L extends B0M {
    public final String LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    @Override // X.AbstractC69312nn
    public final HashMap<String, Object> LIZ() {
        Object obj;
        HashMap<String, Object> hashMap = new HashMap<>();
        String str = this.LIZJ;
        if (str != null) {
            hashMap.put("error_code", str);
        }
        String str2 = "yes";
        if (this.LIZLLL) {
            obj = "yes";
        } else {
            obj = "no";
        }
        hashMap.put("is_retry", obj);
        if (!this.LJ) {
            str2 = "no";
        }
        hashMap.put("is_first_enter", str2);
        return hashMap;
    }

    public B0L(String str, boolean z, boolean z2) {
        super("tiktokec_order_submit_load_fail");
        this.LIZJ = str;
        this.LIZLLL = z;
        this.LJ = z2;
    }
}
