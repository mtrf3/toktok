package webcast.api.game;

import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class SubActAnchorActInfoResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("activity_finish_num")
        public long activityFinishNum;

        @InterfaceC65349Pkn("activity_have_finished")
        public boolean activityHaveFinished;

        @InterfaceC65349Pkn("anchor_can_claim")
        public boolean anchorCanClaim;

        @InterfaceC65349Pkn("anchor_claim_num")
        public long anchorClaimNum;

        @InterfaceC65349Pkn("anchor_have_claimed")
        public boolean anchorHaveClaimed;

        @InterfaceC65349Pkn("audience_can_claim")
        public boolean audienceCanClaim;

        @InterfaceC65349Pkn("audience_have_claimed")
        public boolean audienceHaveClaimed;

        @InterfaceC65349Pkn("can_subscribe")
        public boolean canSubscribe;

        @InterfaceC65349Pkn("claim_num")
        public long claimNum;

        @InterfaceC65349Pkn("expired")
        public boolean expired;

        @InterfaceC65349Pkn("in_activity")
        public boolean inActivity;

        @InterfaceC65349Pkn("reward_claimed_num")
        public long rewardClaimedNum;

        @InterfaceC65349Pkn("reward_unclaimed_num")
        public long rewardUnclaimedNum;

        @InterfaceC65349Pkn("subscribe_audience_num")
        public long subscribeAudienceNum;

        @InterfaceC65349Pkn("anchor_id")
        public String anchorId = "";

        @InterfaceC65349Pkn("anchor_avatar")
        public String anchorAvatar = "";

        @InterfaceC65349Pkn("anchor_name")
        public String anchorName = "";
    }
}
