package tikcast.api.anchor;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public final class PlaylistAddReq {

    @InterfaceC65349Pkn("last_song_id")
    public long lastSongId;

    @InterfaceC65349Pkn("last_song_offset")
    public long lastSongOffset;

    @InterfaceC65349Pkn("song_ids")
    public List<Long> songIds = new ArrayList();
}
