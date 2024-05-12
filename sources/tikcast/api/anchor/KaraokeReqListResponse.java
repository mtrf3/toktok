package tikcast.api.anchor;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;
import webcast.data.ReqSong;

/* loaded from: classes14.dex */
public final class KaraokeReqListResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes14.dex */
    public static final class Data {

        @InterfaceC65349Pkn("has_more")
        public boolean hasMore;

        @InterfaceC65349Pkn("is_update")
        public boolean isUpdate;

        @InterfaceC65349Pkn("offset")
        public long offset;

        @InterfaceC65349Pkn("req_song_list")
        public List<ReqSong> reqSongList = new ArrayList();

        @InterfaceC65349Pkn("timestamp")
        public long timestamp;
    }
}
