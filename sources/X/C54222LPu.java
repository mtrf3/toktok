package X;

import Y.IDHandlerS9S0000000_9;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveBubbleDelayTimeSetting;

/* renamed from: X.LPu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54222LPu<T> implements InterfaceC64592gB {
    public static final C54222LPu<T> LJLIL = new C54222LPu<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        if (!(obj instanceof InterfaceC40262Fr8) || !LQM.LJIJ || LQM.LJIIZILJ) {
            return;
        }
        IDHandlerS9S0000000_9 iDHandlerS9S0000000_9 = LQM.LJJ;
        RunnableC54221LPt runnableC54221LPt = LQM.LJJI;
        iDHandlerS9S0000000_9.removeCallbacks(runnableC54221LPt);
        iDHandlerS9S0000000_9.postDelayed(runnableC54221LPt, LiveBubbleDelayTimeSetting.INSTANCE.delayTimeMill());
    }
}
