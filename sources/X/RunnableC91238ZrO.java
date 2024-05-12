package X;

import com.ss.android.ugc.aweme.dsp.common.model.BaseDspFeedResponse;

/* renamed from: X.ZrO, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class RunnableC91238ZrO implements Runnable {
    public static final RunnableC91238ZrO LJLIL = new RunnableC91238ZrO();

    public static void LIZ() {
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("preloadDspVideoAfterFeedPlay ");
        LIZ.append(C91432ZuW.LJLJI);
        LIZ.append(' ');
        if (C91432ZuW.LJLJJI == null) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        LIZ.append(' ');
        X1D.LIZIZ(LIZ);
        if (C91432ZuW.LJLJI) {
            return;
        }
        C91432ZuW.LJLJI = true;
        BaseDspFeedResponse baseDspFeedResponse = C91432ZuW.LJLJJI;
        if (baseDspFeedResponse == null) {
            return;
        }
        C91432ZuW.LIZLLL(baseDspFeedResponse);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
