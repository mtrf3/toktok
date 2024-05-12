package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Q2g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66350Q2g extends Q2V {
    public C66350Q2g() {
        super("+", 600, 2);
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
                    return Double.valueOf(((Number) obj2).doubleValue() + doubleValue);
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
                    return Long.valueOf(((Number) obj4).longValue() + longValue);
                }
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.Number");
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.Number");
        }
        if ((ListProtector.get(list, 0) instanceof Collection) && (ListProtector.get(list, 1) instanceof Collection)) {
            Object obj5 = ListProtector.get(list, 0);
            if (obj5 != null) {
                Collection collection = (Collection) obj5;
                Object obj6 = ListProtector.get(list, 1);
                if (obj6 != null) {
                    return ORZ.LLIIIZ((Iterable) obj6, collection);
                }
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.Collection<*>");
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.Collection<*>");
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(String.valueOf(ListProtector.get(list, 0)));
        LIZ.append(String.valueOf(ListProtector.get(list, 1)));
        return X1D.LIZIZ(LIZ);
    }
}
