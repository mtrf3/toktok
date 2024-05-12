package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S14 implements InterfaceC53894LDe {
    @Override // X.InterfaceC53894LDe
    public final void LJLJL(String str, String to) {
        DialogC71377Rzp dialogC71377Rzp;
        o.LJIIIZ(to, "to");
        if ((o.LJ(to, "SHOP_MALL") || o.LJ(to, "Shop")) && (dialogC71377Rzp = S1B.LJLILLLLZI) != null && dialogC71377Rzp.isShowing()) {
            dialogC71377Rzp.dismiss();
        }
    }
}
