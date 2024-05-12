package com.bytedance.android.livesdk.activity.quiz.model;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes17.dex */
public final class QuizRewardRule {

    @InterfaceC65349Pkn("send_amount")
    public int sendAmount;

    @InterfaceC65349Pkn("settler_code")
    public String settlerCode = "";

    @InterfaceC65349Pkn("reward_list")
    public List<RewardItem> rewardList = C61878OQg.INSTANCE;

    /* loaded from: classes17.dex */
    public static final class RewardItem {

        @InterfaceC65349Pkn("reward_name")
        public String rewardName = "";

        @InterfaceC65349Pkn("reward_amount")
        public String rewardAmount = "";
    }
}
