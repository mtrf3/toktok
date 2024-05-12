package X;

import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* loaded from: classes6.dex */
public final class B38 extends AbstractC30130Bs6 {
    public final /* synthetic */ LivePlayFragment LIZ;

    public B38(LivePlayFragment livePlayFragment) {
        this.LIZ = livePlayFragment;
    }

    @Override // X.AbstractC30130Bs6
    public final void LIZ(RemindMessage remindMessage) {
        if (remindMessage != null) {
            LivePlayFragment livePlayFragment = this.LIZ;
            if (livePlayFragment.LLII != B5V.LIVE_STARTED) {
                return;
            }
            livePlayFragment.Am(remindMessage);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Boolean, O] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Boolean, O] */
    @Override // X.AbstractC30130Bs6
    public final void LIZIZ(int i) {
        if (this.LIZ.LLII != B5V.LIVE_STARTED) {
            return;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (i == 3) {
            ((C32537Cpp) dataChannelGlobal.gv0(C29031BaN.class)).LIZ = Boolean.TRUE;
            if (room != null) {
                room.setStatus(3);
            }
            this.LIZ.LLIIJI = true;
            return;
        }
        if (i != 2) {
            return;
        }
        ((C32537Cpp) dataChannelGlobal.gv0(C29031BaN.class)).LIZ = Boolean.FALSE;
        if (room != null) {
            room.setStatus(2);
        }
        this.LIZ.LLIIJI = false;
    }
}
