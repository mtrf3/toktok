package X;

import com.ss.android.ugc.aweme.push.downgrade.OptimizePushProcessImpl;

/* loaded from: classes7.dex */
public final class EI1 implements Runnable {
    public static final EI1 LJLIL = new EI1();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C36093EEn.LIZ.getClass();
            EI0 ei0 = new EI0();
            ei0.LIZIZ(new OptimizePushProcessImpl.StartPushProcessTask(), true);
            ei0.LIZJ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
