package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Q2h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66351Q2h extends Q2V {
    public C66351Q2h() {
        super("%", 700, 2);
    }

    @Override // X.Q2V
    public final Object LIZ(List<? extends Object> list) {
        LIZJ(list, true);
        if (o.LJ(LIZIZ(list), "param_type_number")) {
            Object obj = ListProtector.get(list, 0);
            if (obj != null) {
                long longValue = ((Number) obj).longValue();
                Object obj2 = ListProtector.get(list, 1);
                if (obj2 != null) {
                    return Long.valueOf(longValue % ((Number) obj2).longValue());
                }
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.Number");
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.Number");
        }
        throw new C61596OFk(101, "not support");
    }
}
