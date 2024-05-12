package X;

import android.os.Trace;

/* renamed from: X.26o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C531026o extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC24420xa<?>, C24570xp, InterfaceC24350xT, C76800UCe> {
    public final /* synthetic */ int LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C531026o(int i) {
        super(3);
        this.LJLIL = i;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(InterfaceC24420xa<?> interfaceC24420xa, C24570xp c24570xp, InterfaceC24350xT interfaceC24350xT) {
        C24570xp c24570xp2 = c24570xp;
        C1JX.LJIIIZ(interfaceC24420xa, "<anonymous parameter 0>", c24570xp2, "slots", interfaceC24350xT, "<anonymous parameter 2>");
        int i = this.LJLIL;
        Trace.beginSection("composeChange:slots_moveGroup");
        try {
            c24570xp2.LJIL(i);
            Trace.endSection();
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
