package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.Q2m, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66356Q2m extends Q2V {
    public C66356Q2m() {
        super("&", 202, 2);
    }

    @Override // X.Q2V
    public final Object LIZ(List<? extends Object> list) {
        LIZJ(list, true);
        if ((ListProtector.get(list, 0) instanceof Integer) && (ListProtector.get(list, 1) instanceof Integer)) {
            Object obj = ListProtector.get(list, 0);
            if (obj != null) {
                int intValue = ((Integer) obj).intValue();
                Object obj2 = ListProtector.get(list, 1);
                if (obj2 != null) {
                    return Integer.valueOf(((Integer) obj2).intValue() & intValue);
                }
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.Int");
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.Int");
        }
        if ((ListProtector.get(list, 0) instanceof Long) && (ListProtector.get(list, 1) instanceof Long)) {
            Object obj3 = ListProtector.get(list, 0);
            if (obj3 != null) {
                long longValue = ((Long) obj3).longValue();
                Object obj4 = ListProtector.get(list, 1);
                if (obj4 != null) {
                    return Long.valueOf(((Long) obj4).longValue() & longValue);
                }
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.Long");
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.Long");
        }
        if ((ListProtector.get(list, 0) instanceof Boolean) && (ListProtector.get(list, 1) instanceof Boolean)) {
            Object obj5 = ListProtector.get(list, 0);
            if (obj5 != null) {
                boolean booleanValue = ((Boolean) obj5).booleanValue();
                Object obj6 = ListProtector.get(list, 1);
                if (obj6 != null) {
                    return Boolean.valueOf(((Boolean) obj6).booleanValue() & booleanValue);
                }
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.Boolean");
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.Boolean");
        }
        throw new C61596OFk(101, "not support");
    }
}
