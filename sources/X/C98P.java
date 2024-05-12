package X;

import kotlin.jvm.internal.o;

/* renamed from: X.98P, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C98P extends AbstractC65781Prl implements InterfaceC88472Yns<C98Q, C76800UCe> {
    public static final C98P LJLIL = new C98P();

    public C98P() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C98Q c98q) {
        String str;
        C98Q vmState = c98q;
        o.LJIIIZ(vmState, "vmState");
        int i = vmState.LJLILLLLZI;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    str = "";
                } else {
                    str = "auto";
                }
            } else {
                str = "follow";
            }
        } else {
            str = "click";
        }
        C26335AVf.LJIJJLI(str, "others_homepage");
        return C76800UCe.LIZ;
    }
}
