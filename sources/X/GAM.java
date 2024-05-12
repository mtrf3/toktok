package X;

import java.util.concurrent.ExecutorService;

/* loaded from: classes8.dex */
public final class GAM extends AbstractC65781Prl implements InterfaceC65784Pro<ExecutorService> {
    public static final GAM LJLIL = new GAM();

    public GAM() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ExecutorService invoke() {
        C38027EwB LIZ = C38028EwC.LIZ(FSY.SERIAL);
        LIZ.LIZIZ = "serial-social-distribute";
        return C38995FSd.LIZ(LIZ.LIZ());
    }
}
