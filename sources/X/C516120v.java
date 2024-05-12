package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.20v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C516120v extends AbstractC65781Prl implements InterfaceC88471Ynr<C0MK, C1RG, java.util.Map<String, ? extends List<? extends Object>>> {
    public static final C516120v LJLIL = new C516120v();

    public C516120v() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final java.util.Map<String, ? extends List<? extends Object>> invoke(C0MK Saver, C1RG c1rg) {
        C1RG it = c1rg;
        o.LJIIIZ(Saver, "$this$Saver");
        o.LJIIIZ(it, "it");
        java.util.Map<String, List<Object>> LIZJ = it.LIZJ();
        if (LIZJ.isEmpty()) {
            return null;
        }
        return LIZJ;
    }
}
