package X;

import kotlin.jvm.internal.o;

/* renamed from: X.23p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C523323p extends AbstractC65781Prl implements InterfaceC88472Yns<C1YW, InterfaceC14750hz> {
    public static final C523323p LJLIL = new C523323p();

    public C523323p() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final InterfaceC14750hz invoke(C1YW c1yw) {
        Integer valueOf;
        C1YW deleteIfSelectedOr = c1yw;
        o.LJIIIZ(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
        C0VG c0vg = deleteIfSelectedOr.LIZJ;
        if (c0vg == null || (valueOf = Integer.valueOf(deleteIfSelectedOr.LIZJ(c0vg, deleteIfSelectedOr.LIZLLL.LIZIZ(C08350Ul.LIZJ(deleteIfSelectedOr.LJFF))))) == null) {
            return null;
        }
        return new C1U1(0, valueOf.intValue() - C08350Ul.LIZJ(deleteIfSelectedOr.LJFF));
    }
}
