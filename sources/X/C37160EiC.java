package X;

import java.util.concurrent.ExecutorService;

/* renamed from: X.EiC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37160EiC extends AbstractC65781Prl implements InterfaceC65784Pro<ExecutorService> {
    public static final C37160EiC LJLIL = new C37160EiC();

    public C37160EiC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ExecutorService invoke() {
        C38027EwB LIZ = C38028EwC.LIZ(FSY.SERIAL);
        LIZ.LIZIZ = "serial-now-distribute";
        return C38995FSd.LIZ(LIZ.LIZ());
    }
}
