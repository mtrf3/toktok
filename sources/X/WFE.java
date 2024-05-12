package X;

import java.util.concurrent.ExecutorService;

/* loaded from: classes15.dex */
public final class WFE extends AbstractC65781Prl implements InterfaceC65784Pro<ExecutorService> {
    public static final WFE LJLIL = new WFE();

    public WFE() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ExecutorService invoke() {
        C38027EwB LIZ = C38028EwC.LIZ(FSY.SERIAL);
        LIZ.LIZIZ = "ConsumeManager";
        return C38995FSd.LIZ(LIZ.LIZ());
    }
}
