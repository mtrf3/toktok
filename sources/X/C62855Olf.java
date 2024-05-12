package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Olf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62855Olf extends AbstractC65781Prl implements InterfaceC88472Yns<C109544Rq, Boolean> {
    public static final C62855Olf LJLIL = new C62855Olf();

    public C62855Olf() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C109544Rq c109544Rq) {
        C109544Rq it = c109544Rq;
        o.LJIIIZ(it, "it");
        return Boolean.valueOf(!it.isRecalled());
    }
}
