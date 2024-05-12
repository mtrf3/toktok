package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS152S0100000_2;

/* renamed from: X.54V, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C54V extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C54U LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54V(C54U c54u) {
        super(0);
        this.LJLIL = c54u;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C54U c54u = this.LJLIL;
        for (Map.Entry entry : ((LinkedHashMap) c54u.LIZIZ).entrySet()) {
            entry.getKey();
            entry.getValue();
            C1297757l c1297757l = c54u.LIZ;
            c1297757l.getClass();
            C2ND.LIZIZ(new AqS152S0100000_2(c1297757l, 49), 0L);
        }
        return C76800UCe.LIZ;
    }
}
