package webcast.api.room;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* loaded from: classes6.dex */
public final class MockResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes6.dex */
    public static final class Data {

        @InterfaceC65349Pkn("guide_videos")
        public GuideVideoURL guideVideos;

        @InterfaceC65349Pkn("mock_room_id")
        public long mockRoomId;

        @InterfaceC65349Pkn("room")
        public Room room;
    }

    /* loaded from: classes6.dex */
    public static final class GuideVideoURL {

        @InterfaceC65349Pkn("match_url")
        public String matchUrl = "";

        @InterfaceC65349Pkn("interact_url")
        public String interactUrl = "";

        @InterfaceC65349Pkn("cohost_url")
        public String cohostUrl = "";

        @InterfaceC65349Pkn("gift_url")
        public String giftUrl = "";

        @InterfaceC65349Pkn("multiguest_url")
        public String multiguestUrl = "";
    }
}
