package X;

import java.util.concurrent.ExecutorService;

/* renamed from: X.EiW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37180EiW extends AbstractC65781Prl implements InterfaceC65784Pro<ExecutorService> {
    public static final C37180EiW LJLIL = new C37180EiW();

    public C37180EiW() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ExecutorService invoke() {
        if (((Boolean) DMW.LIZ.getValue()).booleanValue()) {
            C38027EwB c38027EwB = new C38027EwB(FSY.SERIAL);
            c38027EwB.LIZIZ = "LegoExecutor_executorWork_serial";
            return C37191Eih.LIZ(c38027EwB);
        }
        C38027EwB c38027EwB2 = new C38027EwB(FSY.FIXED);
        c38027EwB2.LIZIZ = "LegoExecutor_executorWork";
        c38027EwB2.LIZJ = Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4));
        return C37191Eih.LIZ(c38027EwB2);
    }
}
