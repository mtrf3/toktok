package X;

import java.util.concurrent.ExecutorService;

/* loaded from: classes8.dex */
public final class GUK extends AbstractC65781Prl implements InterfaceC65784Pro<ExecutorService> {
    public static final GUK LJLIL = new GUK();

    public GUK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ExecutorService invoke() {
        int LIZ = C00F.LIZ(31744, -1, "studio_wave_task_executor_thread_count", true);
        if (LIZ <= 0) {
            return C38995FSd.LIZLLL();
        }
        C38027EwB c38027EwB = new C38027EwB(FSY.FIXED);
        c38027EwB.LIZIZ = "WaveTaskExecutor";
        c38027EwB.LIZJ = LIZ;
        return C37191Eih.LIZ(c38027EwB);
    }
}
