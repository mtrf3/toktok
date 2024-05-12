package tikcast.api.privilege;

import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class StarCommentPurchasePageResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes6.dex */
    public static final class Data {

        @InterfaceC65349Pkn("error_code")
        public long errorCode;

        @InterfaceC65349Pkn("not_allow_reason")
        public String notAllowReason = "";

        @InterfaceC65349Pkn("purchase_page_status")
        public int purchasePageStatus;

        @InterfaceC65349Pkn("queue")
        public StarCommentQueue queue;

        @InterfaceC65349Pkn("word_limit")
        public int wordLimit;
    }
}
