package webcast.api.room;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.RoomMessage;

/* loaded from: classes6.dex */
public final class FirstScreenResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes6.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("anchor")
        public User anchor;

        @InterfaceC65349Pkn("room")
        public FirstScreenRoom room;

        @InterfaceC65349Pkn("room_msg")
        public RoomMessage roomMsg;

        @InterfaceC65349Pkn("user")
        public User user;
    }
}
