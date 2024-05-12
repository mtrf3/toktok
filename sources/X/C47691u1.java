package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1u1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47691u1 extends AbstractC65781Prl implements InterfaceC88471Ynr<C0MK, C1HU, java.util.Map<Object, java.util.Map<String, ? extends List<? extends Object>>>> {
    public static final C47691u1 LJLIL = new C47691u1();

    public C47691u1() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final java.util.Map<Object, java.util.Map<String, ? extends List<? extends Object>>> invoke(C0MK Saver, C1HU c1hu) {
        C1HU it = c1hu;
        o.LJIIIZ(Saver, "$this$Saver");
        o.LJIIIZ(it, "it");
        java.util.Map<Object, java.util.Map<String, List<Object>>> LJJLIL = C113554cx.LJJLIL(it.LIZ);
        Iterator it2 = ((LinkedHashMap) it.LIZIZ).values().iterator();
        while (it2.hasNext()) {
            ((C0ME) it2.next()).LIZ(LJJLIL);
        }
        if (LJJLIL.isEmpty()) {
            return null;
        }
        return LJJLIL;
    }
}
