package X;

import kotlin.jvm.internal.o;

/* renamed from: X.23t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C523723t extends AbstractC65781Prl implements InterfaceC88472Yns<C1YW, InterfaceC14750hz> {
    public static final C523723t LJLIL = new C523723t();

    public C523723t() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final InterfaceC14750hz invoke(C1YW c1yw) {
        C1YW deleteIfSelectedOr = c1yw;
        o.LJIIIZ(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
        Integer LIZ = deleteIfSelectedOr.LIZ();
        if (LIZ != null) {
            return new C1U1(0, LIZ.intValue() - C08350Ul.LIZJ(deleteIfSelectedOr.LJFF));
        }
        return null;
    }
}
