package X;

/* renamed from: X.RdM, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69984RdM {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Integer num, java.util.Map map) {
        Object obj;
        String str;
        if (map != null && (obj = map.get("source_button")) != null) {
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            if (C78685UuP.LJJJZ(str)) {
                return (String) obj;
            }
        }
        if (num != null) {
            if (num.intValue() == 0) {
                return "select_sku_specs";
            }
            if (num != null) {
                if (num.intValue() == 2 || num.intValue() == 8 || num.intValue() == 7) {
                    return "add_to_cart";
                }
                if (num.intValue() == 1) {
                    return "buy_now";
                }
                if (num.intValue() == 3) {
                    return "cart_select_sku_specs";
                }
                if (num.intValue() == 4) {
                    return "recall_box";
                }
                if (num.intValue() == 5) {
                    return "bottom_bar";
                }
                if (num.intValue() == 10) {
                    return "cart_replace_unavailable_sku";
                }
                if (num.intValue() == 9) {
                    return "top_voucher_remind";
                }
            }
        }
        return "unknow";
    }
}
