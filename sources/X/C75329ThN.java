package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ThN, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75329ThN extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC75179Tex, Boolean> {
    public static final C75329ThN LJLIL = new C75329ThN();

    public C75329ThN() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(InterfaceC75179Tex interfaceC75179Tex) {
        boolean z;
        InterfaceC75179Tex it = interfaceC75179Tex;
        o.LJIIIZ(it, "it");
        if (it.LJJ() != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
