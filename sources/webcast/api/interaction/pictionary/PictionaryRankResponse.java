package webcast.api.interaction.pictionary;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.PictionaryInfo;
import com.bytedance.android.livesdkapi.depend.model.live.PictionaryStatistics;
import java.util.List;

/* loaded from: classes6.dex */
public final class PictionaryRankResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes6.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("curr_user")
        public User currUser;

        @InterfaceC65349Pkn("curr_user_duration")
        public long currUserDuration;

        @InterfaceC65349Pkn("curr_user_rank")
        public long currUserRank;

        @InterfaceC65349Pkn("is_correct")
        public boolean isCorrect;

        @InterfaceC65349Pkn("pictionary_info")
        public PictionaryInfo pictionaryInfo;

        @InterfaceC65349Pkn("pictionary_statistics")
        public PictionaryStatistics pictionaryStatistics;

        @InterfaceC65349Pkn("rank_list")
        public List<RankEntry> rankList;
    }
}
