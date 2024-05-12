package X;

import android.os.MessageQueue;
import java.util.List;

/* renamed from: X.Kzp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53541Kzp implements MessageQueue.IdleHandler {
    public final /* synthetic */ List LJLIL;

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        try {
            for (C54356LUy c54356LUy : this.LJLIL) {
                if (PEI.LJI) {
                    C74215TAt.LIZIZ(c54356LUy);
                }
                if (C51926KZm.LIZ) {
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("leak_object_name", c54356LUy.LIZIZ);
                    FMX.LJIIL("prf_object_leak", c188727au.LIZ);
                }
            }
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
        PEI.LJ = true;
        return false;
    }

    public C53541Kzp(List list) {
        this.LJLIL = list;
    }
}
