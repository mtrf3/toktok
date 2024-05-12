package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.Q2u, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66364Q2u extends Q2V {
    public C66364Q2u() {
        super("||", 200, 2);
    }

    @Override // X.Q2V
    public final Object LIZ(List<? extends Object> list) {
        boolean z = true;
        LIZJ(list, true);
        if ((ListProtector.get(list, 0) instanceof Boolean) && (ListProtector.get(list, 1) instanceof Boolean)) {
            Object obj = ListProtector.get(list, 0);
            if (obj != null) {
                if (!((Boolean) obj).booleanValue()) {
                    Object obj2 = ListProtector.get(list, 1);
                    if (obj2 != null) {
                        if (!((Boolean) obj2).booleanValue()) {
                            z = false;
                        }
                    } else {
                        throw new C37692Eqm("null cannot be cast to non-null type kotlin.Boolean");
                    }
                }
                return Boolean.valueOf(z);
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.Boolean");
        }
        throw new C61596OFk(101, "params invalid");
    }
}
