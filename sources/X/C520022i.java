package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.22i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C520022i extends AbstractC65781Prl implements InterfaceC88471Ynr<C1WN, List<? extends AbstractC17560mW>, C76800UCe> {
    public static final C520022i LJLIL = new C520022i();

    public C520022i() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(C1WN c1wn, List<? extends AbstractC17560mW> list) {
        C1WN set = c1wn;
        List<? extends AbstractC17560mW> it = list;
        o.LJIIIZ(set, "$this$set");
        o.LJIIIZ(it, "it");
        set.LIZLLL = it;
        set.LJIILIIL = true;
        set.LIZJ();
        return C76800UCe.LIZ;
    }
}
