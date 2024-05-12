package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.20S, reason: invalid class name */
/* loaded from: classes.dex */
public final class C20S extends AbstractC65781Prl implements InterfaceC88471Ynr<C0MK, C1QP, List<? extends Integer>> {
    public static final C20S LJLIL = new C20S();

    public C20S() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final List<? extends Integer> invoke(C0MK listSaver, C1QP c1qp) {
        C1QP it = c1qp;
        o.LJIIIZ(listSaver, "$this$listSaver");
        o.LJIIIZ(it, "it");
        return C47261Igj.LJJIJIIJI(Integer.valueOf(it.LIZLLL()), Integer.valueOf(((Number) it.LIZ.LIZIZ.getValue()).intValue()));
    }
}
