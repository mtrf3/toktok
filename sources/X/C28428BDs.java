package X;

import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.viewmodule.FullVideoButtonWidgetV2;

/* renamed from: X.BDs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28428BDs<T> implements InterfaceC28471BFj {
    public final /* synthetic */ FullVideoButtonWidgetV2 LJLIL;

    public C28428BDs(FullVideoButtonWidgetV2 fullVideoButtonWidgetV2) {
        this.LJLIL = fullVideoButtonWidgetV2;
    }

    @Override // X.InterfaceC28471BFj
    public final void onChanged(Object obj) {
        Integer num = (Integer) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("linkStateObserver state = ");
        LIZ.append(num);
        C0NB.LJIIIZ("DebugFullVideoButton", X1D.LIZIZ(LIZ));
        if (num == null) {
            return;
        }
        if (num.intValue() == 1 || num.intValue() == 2) {
            FullVideoButtonWidgetV2 fullVideoButtonWidgetV2 = this.LJLIL;
            fullVideoButtonWidgetV2.LJLJI = true;
            LiveIconView liveIconView = fullVideoButtonWidgetV2.LJLJJI;
            if (liveIconView == null) {
                return;
            }
            liveIconView.setAlpha(0.5f);
            return;
        }
        FullVideoButtonWidgetV2 fullVideoButtonWidgetV22 = this.LJLIL;
        fullVideoButtonWidgetV22.LJLJI = false;
        LiveIconView liveIconView2 = fullVideoButtonWidgetV22.LJLJJI;
        if (liveIconView2 == null) {
            return;
        }
        liveIconView2.setAlpha(1.0f);
    }
}
