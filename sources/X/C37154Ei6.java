package X;

import java.util.concurrent.ExecutorService;

/* renamed from: X.Ei6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37154Ei6 extends AbstractC65781Prl implements InterfaceC65784Pro<ExecutorService> {
    public static final C37154Ei6 LJLIL = new C37154Ei6();

    public C37154Ei6() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ExecutorService invoke() {
        C38027EwB LIZ = C38028EwC.LIZ(FSY.SERIAL);
        LIZ.LIZIZ = "assem-serial-t";
        return C38995FSd.LIZ(LIZ.LIZ());
    }
}
