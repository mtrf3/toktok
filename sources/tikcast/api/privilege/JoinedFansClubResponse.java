package tikcast.api.privilege;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;

/* loaded from: classes17.dex */
public final class JoinedFansClubResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes17.dex */
    public static final class FansClub {

        @InterfaceC65349Pkn("anchor")
        public User anchor;

        @InterfaceC65349Pkn("fans_club_name")
        public String fansClubName = "";

        @InterfaceC65349Pkn("fans_level")
        public long fansLevel;

        @InterfaceC65349Pkn("room_id")
        public long roomId;
    }

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("fans_clubs")
        public List<FansClub> fansClubs;

        @InterfaceC65349Pkn("has_more")
        public boolean hasMore;

        @InterfaceC65349Pkn("next_offset")
        public long nextOffset;

        @InterfaceC65349Pkn("total")
        public long total;
    }
}
