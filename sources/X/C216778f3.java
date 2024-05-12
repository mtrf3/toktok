package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8f3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216778f3 extends AbstractC65781Prl implements InterfaceC88472Yns<AbstractC216708ew<AbstractC216018dp>, Comparable<?>> {
    public static final C216778f3 LJLIL = new C216778f3();

    public C216778f3() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Comparable<?> invoke(AbstractC216708ew<AbstractC216018dp> abstractC216708ew) {
        AbstractC216708ew<AbstractC216018dp> it = abstractC216708ew;
        o.LJIIIZ(it, "it");
        AbstractC216018dp abstractC216018dp = it.LIZ;
        if (abstractC216018dp == null) {
            return null;
        }
        return Integer.valueOf(abstractC216018dp.LJFF);
    }
}
