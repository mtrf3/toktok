package X;

import kotlin.jvm.internal.o;

/* renamed from: X.23r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C523523r extends AbstractC65781Prl implements InterfaceC88472Yns<C1YW, InterfaceC14750hz> {
    public static final C523523r LJLIL = new C523523r();

    public C523523r() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final InterfaceC14750hz invoke(C1YW c1yw) {
        C1YW deleteIfSelectedOr = c1yw;
        o.LJIIIZ(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
        Integer LIZIZ = deleteIfSelectedOr.LIZIZ();
        if (LIZIZ != null) {
            return new C1U1(C08350Ul.LIZJ(deleteIfSelectedOr.LJFF) - LIZIZ.intValue(), 0);
        }
        return null;
    }
}
