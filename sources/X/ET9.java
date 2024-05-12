package X;

import com.bytedance.keva.Keva;

/* loaded from: classes7.dex */
public final class ET9 extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final ET9 LJLIL = new ET9();

    public ET9() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("draft-lost-monitor-log-");
        LIZ.append(C60903NvH.LJIIJJI().getAccountService().getCurrentUserID());
        return Keva.getRepo(X1D.LIZIZ(LIZ));
    }
}
