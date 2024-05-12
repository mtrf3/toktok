package X;

import Y.IDHandlerS9S0000000_9;
import android.widget.PopupWindow;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.BubbleSettingData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.business.ILiveBubblePopService;

/* loaded from: classes10.dex */
public final class LQL implements PopupWindow.OnDismissListener {
    public static final LQL LJLIL = new LQL();

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        long j;
        IDHandlerS9S0000000_9 iDHandlerS9S0000000_9 = LQM.LJJ;
        LQK lqk = LQK.LJLIL;
        BubbleSettingData bubbleSettingData = LQM.LJIILL;
        if (bubbleSettingData != null) {
            j = bubbleSettingData.getCacheInterval();
        } else {
            j = 0;
        }
        iDHandlerS9S0000000_9.postDelayed(lqk, j * 1000);
        LQM.LJIJI = false;
        ((ILiveBubblePopService) ServiceManager.get().getService(ILiveBubblePopService.class)).unregisterObserverInnerPush();
    }
}
