package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.o;

/* renamed from: X.Bn5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29819Bn5 implements InterfaceC31330CRi<RoomMessage> {
    @Override // X.InterfaceC31330CRi
    public final boolean LIZ(RoomMessage roomMessage, CQQ context) {
        Room room;
        User owner;
        RoomMessage message = roomMessage;
        o.LJIIIZ(message, "message");
        o.LJIIIZ(context, "context");
        if (message.source != 4) {
            return false;
        }
        if (!context.LJFF && (room = context.LJI) != null && (owner = room.getOwner()) != null && owner.isSubscribed()) {
            return false;
        }
        return true;
    }
}
