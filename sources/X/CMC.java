package X;

import android.os.CountDownTimer;
import com.bytedance.android.livesdk.chatroom.widget.LiveCloseWidget;

/* loaded from: classes6.dex */
public final class CMC extends CountDownTimer {
    public final /* synthetic */ LiveCloseWidget LIZ;

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        LiveCloseWidget liveCloseWidget = this.LIZ;
        liveCloseWidget.LJLILLLLZI = true;
        C72818Shy.LJII("live_anchor_room_intro_switch", liveCloseWidget);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CMC(LiveCloseWidget liveCloseWidget) {
        super(30000L, 1000L);
        this.LIZ = liveCloseWidget;
    }
}
