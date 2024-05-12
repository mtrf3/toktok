package X;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Add missing generic type declarations: [E] */
/* renamed from: X.Po8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65556Po8<E> extends AbstractC65554Po6<InterfaceC65712Pqe<E>> {
    public final Iterator<Map.Entry<E, AtomicInteger>> LJLJI;

    @Override // X.AbstractC65554Po6
    public final Object LIZ() {
        while (this.LJLJI.hasNext()) {
            Map.Entry<E, AtomicInteger> next = this.LJLJI.next();
            int i = next.getValue().get();
            if (i != 0) {
                return new C65648Ppc(i, next.getKey());
            }
        }
        this.LJLIL = EnumC65555Po7.DONE;
        return null;
    }

    public C65556Po8(C65649Ppd c65649Ppd) {
        this.LJLJI = c65649Ppd.countMap.entrySet().iterator();
    }
}
