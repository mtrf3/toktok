package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.List;

/* renamed from: X.Q2k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66354Q2k extends Q2V {
    public C66354Q2k() {
        super("isIntersect", 700, 2);
    }

    @Override // X.Q2V
    public final Object LIZ(List<? extends Object> list) {
        LIZJ(list, true);
        Object obj = ListProtector.get(list, 0);
        Object obj2 = ListProtector.get(list, 1);
        if ((obj instanceof Collection) && (obj2 instanceof Collection)) {
            return Boolean.valueOf(!ORZ.LJZI((Iterable) obj, (Iterable) obj2).isEmpty());
        }
        throw new C61596OFk(101, "not support");
    }
}
