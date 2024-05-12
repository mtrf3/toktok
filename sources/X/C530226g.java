package X;

import android.os.Trace;

/* renamed from: X.26g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C530226g extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC24420xa<?>, C24570xp, InterfaceC24350xT, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C530226g(int i, int i2) {
        super(3);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(InterfaceC24420xa<?> interfaceC24420xa, C24570xp c24570xp, InterfaceC24350xT interfaceC24350xT) {
        InterfaceC24420xa<?> interfaceC24420xa2 = interfaceC24420xa;
        C1JX.LJIIIZ(interfaceC24420xa2, "applier", c24570xp, "<anonymous parameter 1>", interfaceC24350xT, "<anonymous parameter 2>");
        int i = this.LJLIL;
        int i2 = this.LJLILLLLZI;
        Trace.beginSection("change:applier_remove");
        try {
            interfaceC24420xa2.LJ(i, i2);
            Trace.endSection();
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
