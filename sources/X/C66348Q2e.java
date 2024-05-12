package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Q2e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66348Q2e extends Q2V {
    public C66348Q2e() {
        super("*", 700, 2);
    }

    @Override // X.Q2V
    public final Object LIZ(List<? extends Object> list) {
        LIZJ(list, true);
        String LIZIZ = LIZIZ(list);
        if (o.LJ(LIZIZ, "param_type_double")) {
            Object obj = ListProtector.get(list, 0);
            if (obj != null) {
                double doubleValue = ((Number) obj).doubleValue();
                Object obj2 = ListProtector.get(list, 1);
                if (obj2 != null) {
                    return Double.valueOf(((Number) obj2).doubleValue() * doubleValue);
                }
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.Number");
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.Number");
        }
        if (o.LJ(LIZIZ, "param_type_number")) {
            Object obj3 = ListProtector.get(list, 0);
            if (obj3 != null) {
                long longValue = ((Number) obj3).longValue();
                Object obj4 = ListProtector.get(list, 1);
                if (obj4 != null) {
                    return Long.valueOf(((Number) obj4).longValue() * longValue);
                }
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.Number");
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.Number");
        }
        throw new C61596OFk(101, "not support");
    }
}
