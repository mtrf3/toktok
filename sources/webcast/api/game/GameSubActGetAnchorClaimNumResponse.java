package webcast.api.game;

import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class GameSubActGetAnchorClaimNumResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("can_claim")
        public boolean canClaim;

        @InterfaceC65349Pkn("can_not_claim_reason")
        public String canNotClaimReason = "";

        @InterfaceC65349Pkn("claim_num")
        public int claimNum;
    }
}
