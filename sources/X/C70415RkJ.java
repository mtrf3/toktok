package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* renamed from: X.RkJ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70415RkJ extends AbstractC28083B0l {
    public final String LIZJ;
    public final Boolean LIZLLL;
    public final Boolean LJ;
    public final String LJFF;
    public final Integer LJI;

    @Override // X.AbstractC28083B0l, X.AbstractC69312nn
    public final HashMap<String, Object> LIZ() {
        Object obj;
        HashMap<String, Object> LJJJLZIJ = C113554cx.LJJJLZIJ(new OSZ("button_for", this.LIZJ));
        Boolean bool = this.LIZLLL;
        String str = "1";
        if (bool != null) {
            if (bool.booleanValue()) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            LJJJLZIJ.put("is_clickable", obj);
        }
        Boolean bool2 = this.LJ;
        if (bool2 != null) {
            if (!bool2.booleanValue()) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            LJJJLZIJ.put("is_buy_with_coupon", str);
        }
        String str2 = this.LJFF;
        if (str2 != null) {
            LJJJLZIJ.put("red_dot_type", str2);
        }
        Integer num = this.LJI;
        if (num != null) {
            LJJJLZIJ.put("red_dot_number", Integer.valueOf(num.intValue()));
        }
        return LJJJLZIJ;
    }

    public C70415RkJ(Boolean bool, Boolean bool2, Integer num, String str, String str2) {
        super("tiktokec_product_detail_page_button_click");
        this.LIZJ = str;
        this.LIZLLL = bool;
        this.LJ = bool2;
        this.LJFF = str2;
        this.LJI = num;
    }
}
