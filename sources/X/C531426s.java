package X;

import android.os.Trace;

/* renamed from: X.26s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C531426s extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC24420xa<?>, C24570xp, InterfaceC24350xT, C76800UCe> {
    public static final C531426s LJLIL = new C531426s();

    public C531426s() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(InterfaceC24420xa<?> interfaceC24420xa, C24570xp c24570xp, InterfaceC24350xT interfaceC24350xT) {
        C24570xp c24570xp2 = c24570xp;
        C1JX.LJIIIZ(interfaceC24420xa, "<anonymous parameter 0>", c24570xp2, "slots", interfaceC24350xT, "<anonymous parameter 2>");
        Trace.beginSection("change:skipToGroupEndInstance");
        try {
            c24570xp2.LJJIJLIJ();
            Trace.endSection();
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
