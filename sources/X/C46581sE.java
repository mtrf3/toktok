package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1sE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46581sE extends AbstractC65781Prl implements InterfaceC88472Yns<C76800UCe, C76800UCe> {
    public static final C46581sE LJLIL = new C46581sE();

    public C46581sE() {
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
