package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.List;

/* renamed from: X.Q2i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66352Q2i extends Q2V {
    public C66352Q2i() {
        super("in", 700, 2);
    }

    @Override // X.Q2V
    public final Object LIZ(List<? extends Object> list) {
        LIZJ(list, true);
        Object obj = ListProtector.get(list, 1);
        if (obj instanceof Collection) {
            return Boolean.valueOf(((Collection) obj).contains(ListProtector.get(list, 0)));
        }
        throw new C61596OFk(101, "not support");
    }
}
