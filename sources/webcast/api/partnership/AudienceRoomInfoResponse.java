package webcast.api.partnership;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.game.model.BriefGameTask;
import com.bytedance.android.livesdk.game.model.EsportsParticipant;
import com.bytedance.android.livesdk.game.model.UserInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class AudienceRoomInfoResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes6.dex */
    public static final class DropsInfo {

        @InterfaceC65349Pkn("reward_count")
        public long rewardCount;

        @InterfaceC65349Pkn("promoting_drops_id")
        public String promotingDropsId = "";

        @InterfaceC65349Pkn("gift_icon")
        public String giftIcon = "";
    }

    /* loaded from: classes6.dex */
    public static final class EsportsBriefMatchInfo {

        @InterfaceC65349Pkn("participants")
        public List<EsportsParticipant> participants = new ArrayList();

        @InterfaceC65349Pkn("total_participants")
        public int totalParticipants;
    }

    /* loaded from: classes6.dex */
    public static final class EsportsBriefTournamentInfo {

        @InterfaceC65349Pkn("brief_match_info")
        public EsportsBriefMatchInfo briefMatchInfo;

        @InterfaceC65349Pkn("esports_tournament_type")
        public int esportsTournamentType;

        @InterfaceC65349Pkn("tournament_id")
        public String tournamentId = "";

        @InterfaceC65349Pkn("tournament_name")
        public String tournamentName = "";
    }

    /* loaded from: classes6.dex */
    public static final class PartnershipInfo {

        @InterfaceC65349Pkn("downloaded_count")
        public long downloadedCount;

        @InterfaceC65349Pkn("info")
        public UserInfo info;

        @InterfaceC65349Pkn("game_tasks")
        public List<BriefGameTask> gameTasks = new ArrayList();

        @InterfaceC65349Pkn("display_task_id")
        public String displayTaskId = "";
    }

    /* loaded from: classes6.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("drops_info")
        public DropsInfo dropsInfo;

        @InterfaceC65349Pkn("esports_tournament_brief_info")
        public EsportsBriefTournamentInfo esportsTournamentBriefInfo;

        @InterfaceC65349Pkn("partnership_info")
        public PartnershipInfo partnershipInfo;
    }
}
