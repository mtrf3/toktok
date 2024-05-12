package X;

import java.util.HashMap;

/* renamed from: X.RkT, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC70425RkT extends AbstractC70115RfT {
    @Override // X.AbstractC70115RfT, X.AbstractC70114RfS, X.AbstractC28083B0l, X.AbstractC69312nn
    public final HashMap<String, Object> LIZ() {
        return new HashMap<>();
    }

    public AbstractC70425RkT(String str) {
        super(str);
    }

    public final void LJFF(Integer num) {
        if (num != null) {
            num.intValue();
            this.LIZIZ.put("coupon_order", num);
        }
    }
}
