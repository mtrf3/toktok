package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.RfS, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC70114RfS extends AbstractC28083B0l {
    @Override // X.AbstractC28083B0l, X.AbstractC69312nn
    public HashMap<String, Object> LIZ() {
        return C113554cx.LJJJLZIJ(new OSZ("module_name", "price"));
    }

    public AbstractC70114RfS(String str) {
        super(str);
    }

    public final void LIZLLL(java.util.Map commonParams) {
        o.LJIIIZ(commonParams, "commonParams");
        this.LIZIZ.putAll(commonParams);
    }

    public final void LJ(Integer num) {
        if (num != null) {
            num.intValue();
            this.LIZIZ.put("module_coupon_cnt", num);
        }
    }
}
