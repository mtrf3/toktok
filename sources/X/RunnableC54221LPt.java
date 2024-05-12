package X;

import com.bytedance.android.livesdkapi.depend.model.live.bubble.LiveBubbleData;

/* renamed from: X.LPt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC54221LPt implements Runnable {
    public static final RunnableC54221LPt LJLIL = new RunnableC54221LPt();

    public static void LIZ() {
        if (LQM.LJIJ && LQM.LJFF != null && !LQM.LJIIZILJ) {
            LiveBubbleData liveBubbleData = LQM.LJFF;
            if (liveBubbleData != null) {
                LQM.LIZ(liveBubbleData);
                if (!LQM.LIZLLL) {
                    LQM.LIZLLL = true;
                    LQ2.LJ("livesdk_back_homepage_stay");
                    return;
                }
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
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
