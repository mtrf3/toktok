package X;

import kotlin.jvm.internal.o;

/* renamed from: X.85B, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C85B extends AbstractC65781Prl implements InterfaceC88472Yns<AnonymousClass852<C85M>, Iterable<? extends AnonymousClass852<C85M>>> {
    public static final C85B LJLIL = new C85B();

    public C85B() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Iterable<? extends AnonymousClass852<C85M>> invoke(AnonymousClass852<C85M> anonymousClass852) {
        AnonymousClass852<C85M> it = anonymousClass852;
        o.LJIIIZ(it, "it");
        String LIZJ = it.LIZJ();
        if ((o.LJ(LIZJ, "as") || o.LJ(LIZJ, "rs")) && (it instanceof C85E)) {
            return ((C85E) it).LIZLLL();
        }
        return C47261Igj.LJJIJ(it);
    }
}
