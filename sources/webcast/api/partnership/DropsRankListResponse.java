package webcast.api.partnership;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.game.model.PartnershipDropsRankItem;
import java.util.List;

/* loaded from: classes17.dex */
public final class DropsRankListResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("has_more")
        public boolean hasMore;

        @InterfaceC65349Pkn("rank_list")
        public List<PartnershipDropsRankItem> rankList;
    }
}
