package webcast.api.referral;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class ReferralMentorRankListResp {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes17.dex */
    public static final class Data {

        @InterfaceC65349Pkn("current_rank_number")
        public long currentRankNumber;

        @InterfaceC65349Pkn("current_rank_score")
        public long currentRankScore;

        @InterfaceC65349Pkn("mentor_ranklist")
        public List<MentorRankItem> mentorRanklist = new ArrayList();

        @InterfaceC65349Pkn("rank_text")
        public String rankText = "";

        @InterfaceC65349Pkn("user_info")
        public UserInfoMeta userInfo;

        @InterfaceC65349Pkn("user_live_info")
        public LiveInfo userLiveInfo;
    }

    /* loaded from: classes17.dex */
    public static final class MentorRankItem {

        @InterfaceC65349Pkn("live_info")
        public LiveInfo liveInfo;

        @InterfaceC65349Pkn("mentor_id")
        public long mentorId;

        @InterfaceC65349Pkn("mentor_info")
        public UserInfoMeta mentorInfo;

        @InterfaceC65349Pkn("rank_number")
        public int rankNumber;

        @InterfaceC65349Pkn("score")
        public long score;
    }
}
