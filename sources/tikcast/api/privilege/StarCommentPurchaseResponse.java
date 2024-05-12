package tikcast.api.privilege;

import X.InterfaceC65349Pkn;
import webcast.data.RechargeCustomError;

/* loaded from: classes6.dex */
public final class StarCommentPurchaseResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    @InterfaceC65349Pkn("extra")
    public Extra extra;

    /* loaded from: classes6.dex */
    public static final class Data {

        @InterfaceC65349Pkn("coins")
        public long coins;

        @InterfaceC65349Pkn("msg_id")
        public long msgId;

        @InterfaceC65349Pkn("pay_grade_info")
        public PayGradeInfo payGradeInfo;

        @InterfaceC65349Pkn("purchase_result")
        public int purchaseResult;

        @InterfaceC65349Pkn("queue")
        public StarCommentQueue queue;

        @InterfaceC65349Pkn("room_user_count")
        public long roomUserCount;

        @InterfaceC65349Pkn("server_cur_msg_start_time_ms")
        public long serverCurMsgStartTimeMs;
    }

    /* loaded from: classes14.dex */
    public static final class Extra {

        @InterfaceC65349Pkn("custom_error")
        public RechargeCustomError customError;
    }
}
