package tikcast.api.anchor;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.KaraokeSong;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class KaraokeTabListResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes17.dex */
    public static final class Data {

        @InterfaceC65349Pkn("has_more")
        public boolean hasMore;

        @InterfaceC65349Pkn("offset")
        public long offset;

        @InterfaceC65349Pkn("song_list")
        public List<KaraokeSong> songList = new ArrayList();
    }
}
