package webcast.api.partnership;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.game.model.EsportsTournamentInfo;
import com.bytedance.android.livesdk.game.model.GameActivity;
import com.bytedance.android.livesdk.game.model.GameInfo;

/* loaded from: classes17.dex */
public final class GameDetailResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("esports_tournament_info")
        public EsportsTournamentInfo esportsTournamentInfo;

        @InterfaceC65349Pkn("game_activity")
        public GameActivity gameActivity;

        @InterfaceC65349Pkn("game_info")
        public GameInfo gameInfo;
    }
}
