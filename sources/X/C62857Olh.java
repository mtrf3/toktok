package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Olh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62857Olh extends AbstractC65781Prl implements InterfaceC88472Yns<C109544Rq, Boolean> {
    public static final C62857Olh LJLIL = new C62857Olh();

    public C62857Olh() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C109544Rq c109544Rq) {
        C109544Rq it = c109544Rq;
        o.LJIIIZ(it, "it");
        return Boolean.valueOf(!it.isDeleted());
    }
}
