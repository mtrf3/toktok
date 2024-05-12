package tikcast.api.anchor;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;
import webcast.data.MusicSong;

/* loaded from: classes17.dex */
public final class FavouritesSongsResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("has_more")
        public boolean hasMore;

        @InterfaceC65349Pkn("songs")
        public List<MusicSong> songs = new ArrayList();

        @InterfaceC65349Pkn("total")
        public long total;
    }
}
