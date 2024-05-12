package X;

import Y.IDHandlerS9S0000000_9;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveBubbleDelayTimeSetting;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import kotlin.jvm.internal.o;

/* renamed from: X.LPs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54220LPs implements InterfaceC53896LDg {
    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        if (LiveOuterService.LJJJLL().LJJJJLL(false) != null) {
            LQM.LJIJ = false;
            if (LQM.LJ) {
                LQM.LJJ.removeCallbacks(LQM.LJJI);
            }
            LQM.LIZJ("bottom_tab", false);
        }
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle bundle) {
        o.LJIIIZ(bundle, "bundle");
        if (LiveOuterService.LJJJLL().LJJJJLL(false) != null) {
            LQM.LJIJ = true;
            if (!LQM.LJ || LQM.LJFF == null || LQM.LJIIZILJ) {
                return;
            }
            IDHandlerS9S0000000_9 iDHandlerS9S0000000_9 = LQM.LJJ;
            RunnableC54221LPt runnableC54221LPt = LQM.LJJI;
            iDHandlerS9S0000000_9.removeCallbacks(runnableC54221LPt);
            iDHandlerS9S0000000_9.postDelayed(runnableC54221LPt, LiveBubbleDelayTimeSetting.INSTANCE.delayTimeMill());
        }
    }
}
