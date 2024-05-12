package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1sF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46591sF extends AbstractC65781Prl implements InterfaceC88472Yns<C76800UCe, C76800UCe> {
    public static final C46591sF LJLIL = new C46591sF();

    public C46591sF() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C76800UCe it) {
        o.LJIIIZ(it, "it");
        if (C0GB.LIZLLL) {
            C0GC c0gc = C0GB.LIZJ;
            if (c0gc != null) {
                c0gc.cancel();
            }
            C0GB.LIZLLL = false;
        }
        return C76800UCe.LIZ;
    }
}
