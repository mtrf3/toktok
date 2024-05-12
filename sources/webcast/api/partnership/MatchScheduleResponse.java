package webcast.api.partnership;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.game.model.EsportsMatchInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class MatchScheduleResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("tournament_type")
        public int tournamentType;

        @InterfaceC65349Pkn("tournament_name")
        public String tournamentName = "";

        @InterfaceC65349Pkn("batch_match_info_list")
        public List<EsportsMatchInfo> batchMatchInfoList = new ArrayList();
    }
}
