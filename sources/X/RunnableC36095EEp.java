package X;

import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.EEp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC36095EEp implements Runnable {
    public static final RunnableC36095EEp LJLIL = new RunnableC36095EEp();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C36093EEn.LIZ.getClass();
            InterfaceC36096EEq interfaceC36096EEq = C36093EEn.LJII;
            if (interfaceC36096EEq != null) {
                if (interfaceC36096EEq.LIZ()) {
                    EEW.LIZ.LIZIZ(1205, LivePlayEnforceIntervalSetting.DEFAULT);
                    return;
                }
                return;
            }
            o.LJIJI("legoConfig");
            throw null;
        } finally {
            if (LIZ) {
            }
        }
    }
}
