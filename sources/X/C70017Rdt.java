package X;

import java.util.HashMap;

/* renamed from: X.Rdt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70017Rdt extends AbstractC28083B0l {
    public final String LIZJ;
    public final Boolean LIZLLL;

    @Override // X.AbstractC28083B0l, X.AbstractC69312nn
    public final HashMap<String, Object> LIZ() {
        String str;
        HashMap<String, Object> LJJJLZIJ = C113554cx.LJJJLZIJ(new OSZ("action_sheet_for", this.LIZJ));
        Boolean bool = this.LIZLLL;
        if (bool != null) {
            if (bool.booleanValue()) {
                str = "yes";
            } else {
                str = "no";
            }
            LJJJLZIJ.put("has_shipping_address", str);
        }
        return LJJJLZIJ;
    }

    public C70017Rdt(String str, Boolean bool) {
        super("tiktokec_product_detail_page_action_sheet_show");
        this.LIZJ = str;
        this.LIZLLL = bool;
    }
}
