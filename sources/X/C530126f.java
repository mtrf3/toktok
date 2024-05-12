package X;

import android.os.Trace;

/* renamed from: X.26f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C530126f extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC24420xa<?>, C24570xp, InterfaceC24350xT, C76800UCe> {
    public static final C530126f LJLIL = new C530126f();

    public C530126f() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(InterfaceC24420xa<?> interfaceC24420xa, C24570xp c24570xp, InterfaceC24350xT interfaceC24350xT) {
        InterfaceC24420xa<?> interfaceC24420xa2 = interfaceC24420xa;
        C24570xp c24570xp2 = c24570xp;
        C1JX.LJIIIZ(interfaceC24420xa2, "applier", c24570xp2, "slots", interfaceC24350xT, "<anonymous parameter 2>");
        Trace.beginSection("composeChange:positionToParentOf");
        try {
            C35931b3.LJJJLZIJ(c24570xp2, interfaceC24420xa2, 0);
            c24570xp2.LJIIIIZZ();
            Trace.endSection();
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
