package X;

import java.util.HashMap;

/* renamed from: X.B0j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28081B0j extends AbstractC28083B0l {
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final Boolean LJ;
    public final String LJFF;

    @Override // X.AbstractC28083B0l, X.AbstractC69312nn
    public final HashMap<String, Object> LIZ() {
        Object obj;
        Object obj2;
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.putAll(super.LIZ());
        String str = "yes";
        if (this.LIZJ) {
            obj = "yes";
        } else {
            obj = "no";
        }
        hashMap.put("is_retry", obj);
        if (this.LIZLLL) {
            obj2 = "yes";
        } else {
            obj2 = "no";
        }
        hashMap.put("is_success", obj2);
        Boolean bool = this.LJ;
        if (bool != null) {
            if (!bool.booleanValue()) {
                str = "no";
            }
            hashMap.put("is_incomplete_data", str);
        }
        String str2 = this.LJFF;
        if (str2 != null) {
            hashMap.put("error_code", str2);
        }
        return hashMap;
    }

    public C28081B0j(boolean z, boolean z2, String str, Boolean bool) {
        super("rd_tiktokec_first_bill_info_request_result");
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = bool;
        this.LJFF = str;
    }
}
