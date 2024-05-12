package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.OIo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61678OIo extends AbstractC61685OIv {
    public C61678OIo() {
        super("getProperty");
    }

    @Override // X.PQ5
    public final Object LIZ(List<? extends Object> list) {
        if (list != null && list.size() == 2 && (ListProtector.get(list, 0) instanceof java.util.Map)) {
            Object obj = ListProtector.get(list, 0);
            if (obj != null) {
                return ((java.util.Map) obj).get(ListProtector.get(list, 1));
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        }
        throw new C61596OFk(105, "params error");
    }
}
