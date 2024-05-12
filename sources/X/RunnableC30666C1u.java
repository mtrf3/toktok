package X;

import com.bytedance.android.livesdk.livesetting.broadcast.FluencyNegativeTestExperiment;

/* renamed from: X.C1u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC30666C1u implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C15610jN.LIZJ(this, 1000L);
            Thread.sleep((long) (FluencyNegativeTestExperiment.INSTANCE.dropFrames() * 16.6d));
        } finally {
            if (LIZ) {
            }
        }
    }
}
