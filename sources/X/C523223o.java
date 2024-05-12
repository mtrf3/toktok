package X;

import kotlin.jvm.internal.o;

/* renamed from: X.23o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C523223o extends AbstractC65781Prl implements InterfaceC88472Yns<C1YW, InterfaceC14750hz> {
    public static final C523223o LJLIL = new C523223o();

    public C523223o() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final InterfaceC14750hz invoke(C1YW c1yw) {
        Integer valueOf;
        C1YW deleteIfSelectedOr = c1yw;
        o.LJIIIZ(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
        C0VG c0vg = deleteIfSelectedOr.LIZJ;
        if (c0vg == null || (valueOf = Integer.valueOf(deleteIfSelectedOr.LIZLLL(c0vg, deleteIfSelectedOr.LIZLLL.LIZIZ(C08350Ul.LIZJ(deleteIfSelectedOr.LJFF))))) == null) {
            return null;
        }
        return new C1U1(C08350Ul.LIZJ(deleteIfSelectedOr.LJFF) - valueOf.intValue(), 0);
    }
}
