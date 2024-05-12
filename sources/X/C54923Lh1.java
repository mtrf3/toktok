package X;

import com.ss.android.ugc.aweme.launcher.service.launcher.ExitBackgroundSpi;
import com.ss.android.ugc.aweme.legoImpl.task.ExitBackgroundImpl;

/* renamed from: X.Lh1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54923Lh1 implements ExitBackgroundSpi {
    public static final C54923Lh1 LIZIZ = new C54923Lh1();
    public final /* synthetic */ ExitBackgroundSpi LIZ;

    @Override // com.ss.android.ugc.aweme.launcher.service.launcher.ExitBackgroundSpi
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    public C54923Lh1() {
        ExitBackgroundSpi exitBackgroundSpi;
        Object LIZ = C58096Mr6.LIZ(ExitBackgroundSpi.class, false);
        if (LIZ != null) {
            exitBackgroundSpi = (ExitBackgroundSpi) LIZ;
        } else {
            if (C58096Mr6.q2 == null) {
                synchronized (ExitBackgroundSpi.class) {
                    if (C58096Mr6.q2 == null) {
                        C58096Mr6.q2 = new ExitBackgroundImpl();
                    }
                }
            }
            exitBackgroundSpi = C58096Mr6.q2;
        }
        this.LIZ = exitBackgroundSpi;
    }
}
