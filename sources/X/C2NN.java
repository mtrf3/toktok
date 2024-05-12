package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2NN, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2NN extends F9E {
    public final List<BFR> LJLIL;
    public final java.util.Map<String, Object> LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C2NN(List<BFR> triggerConfigList, java.util.Map<String, ? extends Object> map) {
        o.LJIIIZ(triggerConfigList, "triggerConfigList");
        this.LJLIL = triggerConfigList;
        this.LJLILLLLZI = map;
    }
}
