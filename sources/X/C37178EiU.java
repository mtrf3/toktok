package X;

import java.util.concurrent.ExecutorService;

/* renamed from: X.EiU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37178EiU extends AbstractC65781Prl implements InterfaceC65784Pro<ExecutorService> {
    public static final C37178EiU LJLIL = new C37178EiU();

    public C37178EiU() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ExecutorService invoke() {
        if (((Boolean) DMY.LIZIZ.getValue()).booleanValue()) {
            return C38995FSd.LIZJ();
        }
        C38027EwB c38027EwB = new C38027EwB(FSY.FIXED);
        c38027EwB.LIZIZ = "LegoExecutor_executorWork";
        c38027EwB.LIZJ = 4;
        return C37191Eih.LIZ(c38027EwB);
    }
}
