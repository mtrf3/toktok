package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.OIr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61681OIr extends AbstractC61685OIv {
    public C66906QNq LIZIZ;

    public C61681OIr() {
        super("is_sample_rate");
    }

    @Override // X.PQ5
    public final Object LIZ(List<? extends Object> list) {
        if (list != null) {
            boolean z = true;
            if (list.size() == 1 && (ListProtector.get(list, 0) instanceof Double)) {
                if (this.LIZIZ == null) {
                    this.LIZIZ = C78841Uwv.LIZ(System.currentTimeMillis());
                }
                C66906QNq c66906QNq = this.LIZIZ;
                if (c66906QNq != null) {
                    double nextDouble = c66906QNq.nextDouble();
                    Object obj = ListProtector.get(list, 0);
                    if (obj != null) {
                        if (nextDouble >= ((Double) obj).doubleValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.Double");
                }
                return Boolean.FALSE;
            }
        }
        throw new C61596OFk(105, "params error");
    }
}
