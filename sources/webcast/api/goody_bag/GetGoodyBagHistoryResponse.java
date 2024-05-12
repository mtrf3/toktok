package webcast.api.goody_bag;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class GetGoodyBagHistoryResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes17.dex */
    public static final class CoinHistoryItem {

        @InterfaceC65349Pkn("refunded_coin")
        public int refundedCoin;

        @InterfaceC65349Pkn("total_coin")
        public int totalCoin;
    }

    /* loaded from: classes17.dex */
    public static final class HistoryItem {

        @InterfaceC65349Pkn("actual_winner_headcount")
        public int actualWinnerHeadcount;

        @InterfaceC65349Pkn("biz")
        public int biz;

        @InterfaceC65349Pkn("coin_history_item")
        public CoinHistoryItem coinHistoryItem;

        @InterfaceC65349Pkn("expect_winner_headcount")
        public int expectWinnerHeadcount;

        @InterfaceC65349Pkn("goody_bag_id")
        public String goodyBagId = "";

        @InterfaceC65349Pkn("participate_method")
        public int participateMethod;

        @InterfaceC65349Pkn("sent_timestamp_sec")
        public int sentTimestampSec;
    }

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("has_more")
        public boolean hasMore;

        @InterfaceC65349Pkn("history")
        public List<HistoryItem> history = new ArrayList();

        @InterfaceC65349Pkn("next_offset")
        public long nextOffset;
    }
}
