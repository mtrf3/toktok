package X;

import java.util.concurrent.ExecutorService;

/* loaded from: classes8.dex */
public final class GAO extends AbstractC65781Prl implements InterfaceC65784Pro<ExecutorService> {
    public static final GAO LJLIL = new GAO();

    public GAO() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ExecutorService invoke() {
        C38027EwB LIZ = C38028EwC.LIZ(FSY.SERIAL);
        LIZ.LIZIZ = "WaveDispatchExecutor";
        return C38995FSd.LIZ(LIZ.LIZ());
    }
}
