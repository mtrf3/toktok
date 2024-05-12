package X;

import Y.ARunnableS4S0001000_9;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveBubbleDelayTimeSetting;

/* renamed from: X.LPr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54219LPr implements LQR {
    @Override // X.LQR
    public final void LJJJLZIJ(int i) {
        boolean z;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        LQM.LIZIZ = z;
        new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS4S0001000_9(i, 2), LiveBubbleDelayTimeSetting.INSTANCE.delayTimeMill());
    }
}
