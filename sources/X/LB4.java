package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LB4 extends AbstractC65781Prl implements InterfaceC88471Ynr<List<Object>, List<Object>, List<Object>> {
    public static final LB4 LJLIL = new LB4();

    public LB4() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final List<Object> invoke(List<Object> list, List<Object> list2) {
        List<Object> refresh = list2;
        o.LJIIJ(list, "list");
        o.LJIIJ(refresh, "refresh");
        if (!refresh.isEmpty()) {
            return refresh;
        }
        return list;
    }
}
