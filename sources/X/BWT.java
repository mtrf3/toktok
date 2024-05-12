package X;

import Y.AfS57S0100000_5;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BWT {
    public final DataChannel LIZ;

    public final void onEvent(BNB event) {
        Room room;
        User user;
        o.LJIIIZ(event, "event");
        if (event.LIZ != null && (room = (Room) this.LIZ.kv0(RoomChannel.class)) != null && (user = (User) this.LIZ.kv0(RoomUserChannel.class)) != null && event.LIZ.getDeltaIntimacy() > 0) {
            SocialMessage LJIJI = C31309CQn.LJIJI(room.getId(), event.LIZ.getDisplayText(), user);
            IMessageManager iMessageManager = (IMessageManager) this.LIZ.kv0(C29927Bop.class);
            if (iMessageManager != null) {
                iMessageManager.insertMessage(LJIJI, true);
            }
        }
    }

    public BWT(Fragment fragment, DataChannel dataChannel) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LIZ = dataChannel;
        C73943T0h LIZ = C73943T0h.LIZ();
        LIZ.getClass();
        LIZ.LIZLLL(fragment, BNB.class, new C19U()).LIZIZ(new AfS57S0100000_5(this, 310));
    }
}
