package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3VF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3VF extends AbstractC65781Prl implements InterfaceC88472Yns<C3VZ, Boolean> {
    public static final C3VF LJLIL = new C3VF();

    public C3VF() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C3VZ c3vz) {
        C3VZ preloadMessage = c3vz;
        o.LJIIIZ(preloadMessage, "preloadMessage");
        List<C3VP> list = preloadMessage.LJLILLLLZI;
        boolean z = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<C3VP> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next().LJLILLLLZI != 0) {
                    z = false;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
