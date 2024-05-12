package X;

import java.util.concurrent.ExecutorService;

/* renamed from: X.Ei7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37155Ei7 extends AbstractC65781Prl implements InterfaceC65784Pro<ExecutorService> {
    public static final C37155Ei7 LJLIL = new C37155Ei7();

    public C37155Ei7() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ExecutorService invoke() {
        C38027EwB LIZ = C38028EwC.LIZ(FSY.SERIAL);
        LIZ.LIZJ = 1;
        LIZ.LIZIZ = "SessionDataMediator";
        return C38995FSd.LIZ(LIZ.LIZ());
    }
}
