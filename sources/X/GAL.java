package X;

import java.util.concurrent.ExecutorService;

/* loaded from: classes8.dex */
public final class GAL extends AbstractC65781Prl implements InterfaceC65784Pro<ExecutorService> {
    public static final GAL LJLIL = new GAL();

    public GAL() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ExecutorService invoke() {
        C38027EwB LIZ = C38028EwC.LIZ(FSY.SERIAL);
        LIZ.LIZIZ = "PublishEventDispatcher";
        return C38995FSd.LIZ(LIZ.LIZ());
    }
}
