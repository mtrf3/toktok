package tikcast.api.privilege;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;
import webcast.data.DiscordEntrance;
import webcast.data.SlotFansRecord;

/* loaded from: classes17.dex */
public final class FansRankListResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes17.dex */
    public static final class Rank {

        @InterfaceC65349Pkn("fans_level")
        public long fansLevel;

        @InterfaceC65349Pkn("fans_score")
        public long fansScore;

        @InterfaceC65349Pkn("live_online")
        public boolean liveOnline;

        @InterfaceC65349Pkn("rank")
        public long rank;

        @InterfaceC65349Pkn("room_id")
        public long roomId;

        @InterfaceC65349Pkn("user")
        public User user;

        @InterfaceC65349Pkn("user_level")
        public long userLevel;

        @InterfaceC65349Pkn("fans_tag_for_fans")
        public String fansTagForFans = "";

        @InterfaceC65349Pkn("fans_tag_for_anchor")
        public String fansTagForAnchor = "";
    }

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("discord_entrance")
        public DiscordEntrance discordEntrance;

        @InterfaceC65349Pkn("has_more")
        public boolean hasMore;

        @InterfaceC65349Pkn("next_offset")
        public long nextOffset;

        @InterfaceC65349Pkn("ranks")
        public List<Rank> ranks;

        @InterfaceC65349Pkn("slot_fans_record")
        public SlotFansRecord slotFansRecord;

        @InterfaceC65349Pkn("total")
        public long total;
    }
}
