package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.GuideMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CPN extends AbstractC31313CQr<GuideMessage> {
    public static final CPN LIZJ = new CPN();

    @Override // X.InterfaceC31317CQv
    public final User LIZ(Object t, User user) {
        o.LJIIIZ(t, "t");
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            return room.getOwner();
        }
        return null;
    }
}
