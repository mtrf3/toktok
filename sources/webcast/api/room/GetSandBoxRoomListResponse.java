package webcast.api.room;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class GetSandBoxRoomListResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("sand_box_rooms")
        public List<SandBoxRoom> sandBoxRooms = new ArrayList();
    }

    /* loaded from: classes17.dex */
    public static final class SandBoxRoom {

        @InterfaceC65349Pkn("live_room_type")
        public int liveRoomType;

        @InterfaceC65349Pkn("room_id")
        public long roomId;

        @InterfaceC65349Pkn("user_id")
        public long userId;

        @InterfaceC65349Pkn("user_name")
        public String userName = "";

        @InterfaceC65349Pkn("image_model")
        public String imageModel = "";

        @InterfaceC65349Pkn("title")
        public String title = "";
    }
}
