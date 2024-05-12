package X;

import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreloadInteractionLayerSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.PreLoadInteractionLayer;

/* loaded from: classes6.dex */
public final class B3B implements PreLoadInteractionLayer.CallBack {
    public final /* synthetic */ LivePlayFragment LIZ;

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.PreLoadInteractionLayer.CallBack
    public final void onFistFrame() {
        if (LivePreloadInteractionLayerSetting.INSTANCE.isECEnablePreload(this.LIZ.LLLIIL)) {
            LivePlayFragment livePlayFragment = this.LIZ;
            if (livePlayFragment.dn() && livePlayFragment.LLJIJIL == null) {
                livePlayFragment.jn(false, livePlayFragment.wl());
                return;
            }
            return;
        }
        this.LIZ.Gn(false, null);
    }

    public B3B(LivePlayFragment livePlayFragment) {
        this.LIZ = livePlayFragment;
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.PreLoadInteractionLayer.CallBack
    public final void delayShowWithRoomInfo(Room room) {
        LivePlayFragment livePlayFragment = this.LIZ;
        if (livePlayFragment.LLJIJIL == null && livePlayFragment.dn()) {
            LivePlayFragment livePlayFragment2 = this.LIZ;
            if (livePlayFragment2.dn() && livePlayFragment2.LLJIJIL == null) {
                livePlayFragment2.jn(false, livePlayFragment2.wl());
            }
            if (room != null) {
                this.LIZ.tn(room);
            }
            AbsAudienceInteractionFragment absAudienceInteractionFragment = this.LIZ.LLJIJIL;
            if (absAudienceInteractionFragment != null) {
                absAudienceInteractionFragment.loadAfterRoomEnter();
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.PreLoadInteractionLayer.CallBack
    public final void onRoomEnter(Room room) {
        LivePlayFragment livePlayFragment = this.LIZ;
        if (livePlayFragment.LLJIJIL == null) {
            livePlayFragment.Gn(true, room);
            return;
        }
        if (room != null) {
            livePlayFragment.tn(room);
        }
        LivePlayFragment livePlayFragment2 = this.LIZ;
        if (livePlayFragment2.LLJIJIL != null && livePlayFragment2.dn()) {
            this.LIZ.LLJIJIL.loadAfterRoomEnter();
        }
    }
}
