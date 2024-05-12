package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.854, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass854 extends AbstractC65781Prl implements InterfaceC88472Yns<AnonymousClass850, AnonymousClass850> {
    public static final AnonymousClass854 LJLIL = new AnonymousClass854();

    public AnonymousClass854() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final AnonymousClass850 invoke(AnonymousClass850 anonymousClass850) {
        AnonymousClass850 it = anonymousClass850;
        o.LJIIIZ(it, "it");
        List<Object> list = it.LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C2055484w) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            it.LIZIZ.removeAll(arrayList);
        }
        return it;
    }
}
