package X;

import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ADB extends AbstractC65781Prl implements InterfaceC88472Yns<C25859ACx, C25859ACx> {
    public static final ADB LJLIL = new ADB();

    public ADB() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C25859ACx invoke(C25859ACx c25859ACx) {
        boolean z;
        C25859ACx it = c25859ACx;
        o.LJIIIZ(it, "it");
        if (AD7.LIZ() || ((RBX) HG3.LJIILL()).getCurUser().proAccountTcmRedDot) {
            z = true;
        } else {
            z = false;
        }
        return C25859ACx.LJIILJJIL(it, null, null, false, null, null, false, z, null, false, false, false, false, 8388095);
    }
}
