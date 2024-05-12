package X;

import java.util.HashMap;

/* loaded from: classes5.dex */
public final class B0K extends B0M {
    public final String LIZJ;
    public final Boolean LIZLLL;
    public final Boolean LJ;
    public final Object LJFF;

    @Override // X.AbstractC69312nn
    public final HashMap<String, Object> LIZ() {
        Object obj;
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("button_for", this.LIZJ);
        Boolean bool = this.LIZLLL;
        String str = "yes";
        if (bool != null) {
            if (bool.booleanValue()) {
                obj = "yes";
            } else {
                obj = "no";
            }
            hashMap.put("is_address_deliverable", obj);
        }
        Boolean bool2 = this.LJ;
        if (bool2 != null) {
            if (!bool2.booleanValue()) {
                str = "no";
            }
            hashMap.put("is_delivery_info_complete", str);
        }
        Object obj2 = this.LJFF;
        if (obj2 != null) {
            hashMap.put("order_summary_info", obj2);
        }
        return hashMap;
    }

    public B0K(String str, Boolean bool, Boolean bool2, Object obj) {
        super("tiktokec_order_submit_button_click");
        this.LIZJ = str;
        this.LIZLLL = bool;
        this.LJ = bool2;
        this.LJFF = obj;
    }
}
