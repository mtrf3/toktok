package X;

import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* loaded from: classes6.dex */
public class B36 implements Runnable {
    public boolean LJLIL;
    public Room LJLILLLLZI;
    public final /* synthetic */ LivePlayFragment LJLJI;

    public final void LIZ() {
        AbsAudienceInteractionFragment absAudienceInteractionFragment;
        if (this.LJLJI.dn()) {
            LivePlayFragment livePlayFragment = this.LJLJI;
            if (livePlayFragment.LLJIJIL == null) {
                if (((LiveRoomFragment) livePlayFragment.r).Dl(livePlayFragment)) {
                    LivePlayFragment livePlayFragment2 = this.LJLJI;
                    livePlayFragment2.jn(false, livePlayFragment2.wl());
                    Room room = this.LJLILLLLZI;
                    if (room != null) {
                        this.LJLJI.tn(room);
                    }
                    if (this.LJLIL && (absAudienceInteractionFragment = this.LJLJI.LLJIJIL) != null) {
                        absAudienceInteractionFragment.loadAfterRoomEnter();
                        return;
                    }
                    return;
                }
                this.LJLJI.LLLLLJLJLL.removeCallbacks(this);
                this.LJLJI.LLLLLJLJLL.postDelayed(this, 20L);
            }
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

    public B36(LivePlayFragment livePlayFragment) {
        this.LJLJI = livePlayFragment;
    }
}
