package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.List;

/* renamed from: X.Q2j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66353Q2j extends Q2V {
    public C66353Q2j() {
        super("out", 700, 2);
    }

    @Override // X.Q2V
    public final Object LIZ(List<? extends Object> list) {
        LIZJ(list, true);
        if (ListProtector.get(list, 1) instanceof Collection) {
            return Boolean.valueOf(!((Collection) r1).contains(ListProtector.get(list, 0)));
        }
        throw new C61596OFk(101, "not support");
    }
}
