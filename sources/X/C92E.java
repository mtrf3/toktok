package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.92E, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C92E extends AbstractC65781Prl implements InterfaceC88472Yns<IPH, C76800UCe> {
    public static final C92E LJLIL = new C92E();

    public C92E() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(IPH iph) {
        Iterator it = ((LinkedHashMap) C2MX.LIZ().LIZ).entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            if (((Boolean) entry.getValue()).booleanValue()) {
                C2U8.LIZ(new C245249js(C9XV.SWITCH_PAGE.getType(), "", false));
                break;
            }
        }
        return C76800UCe.LIZ;
    }
}
