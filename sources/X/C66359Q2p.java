package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.List;
import ujb.o;

/* renamed from: X.Q2p, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66359Q2p extends Q2V {
    public C66359Q2p() {
        super("notendwith", 800, 2);
    }

    @Override // X.Q2V
    public final Object LIZ(List<? extends Object> list) {
        LIZJ(list, true);
        Object obj = ListProtector.get(list, 0);
        Object obj2 = ListProtector.get(list, 1);
        if (obj instanceof String) {
            if (obj2 instanceof Collection) {
                for (Object obj3 : (Iterable) obj2) {
                    if (obj3 != null && o.LJJJJ((String) obj, obj3.toString(), false)) {
                        return Boolean.FALSE;
                    }
                }
                return Boolean.TRUE;
            }
            if (obj2 instanceof String) {
                return Boolean.valueOf(!o.LJJJJ((String) obj, (String) obj2, false));
            }
            throw new C61596OFk(101, "params invalid");
        }
        throw new C61596OFk(101, "params invalid");
    }
}
