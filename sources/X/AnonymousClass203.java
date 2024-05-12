package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.203, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass203 extends AbstractC65781Prl implements InterfaceC88471Ynr<C0MK, C32541Pm, List<? extends Integer>> {
    public static final AnonymousClass203 LJLIL = new AnonymousClass203();

    public AnonymousClass203() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final List<? extends Integer> invoke(C0MK listSaver, C32541Pm c32541Pm) {
        C32541Pm it = c32541Pm;
        o.LJIIIZ(listSaver, "$this$listSaver");
        o.LJIIIZ(it, "it");
        return C47261Igj.LJJIJIIJI(Integer.valueOf(it.LIZLLL()), Integer.valueOf(((Number) it.LIZ.LIZIZ.getValue()).intValue()));
    }
}
