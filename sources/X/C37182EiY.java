package X;

import java.util.concurrent.ExecutorService;

/* renamed from: X.EiY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37182EiY extends AbstractC65781Prl implements InterfaceC65784Pro<ExecutorService> {
    public static final C37182EiY LJLIL = new C37182EiY();

    public C37182EiY() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ExecutorService invoke() {
        C38027EwB c38027EwB = new C38027EwB(FSY.FIXED);
        c38027EwB.LIZIZ = "homepage-main-preload-serial-t";
        c38027EwB.LIZJ = 4;
        if (((Number) C37195Eil.LIZ.getValue()).intValue() == 3) {
            c38027EwB.LJI = ThreadFactoryC36533EVl.LJLIL;
        }
        return C37191Eih.LIZ(c38027EwB);
    }
}
