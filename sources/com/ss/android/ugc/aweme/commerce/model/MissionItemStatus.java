package com.ss.android.ugc.aweme.commerce.model;

import X.V0N;

/* loaded from: classes9.dex */
public enum MissionItemStatus {
    UNKNOWN(0),
    IN_REVIEW(1),
    REJECTED_BY_MACHINE(2),
    PASS_BY_MACHINE(3),
    REJECTED_BY_AD_AUDIT(4),
    AWAITING_REWARD(5),
    HIDDEN(6),
    PASS_BY_AUDIT(7),
    GREY(8),
    CLOSED(9),
    REJECTED_BY_ADVERTISER(10),
    REJECTED_BY_TNS(11),
    IN_BRAND_SAFETY_REVIEW(12),
    PASS_BRAND_SAFETY(13),
    REJECTED_BY_BRAND_SAFETY(14),
    NONPUBLIC(15),
    NONPUBLIC_WITH_REWARD(16),
    CASH_REWARD_CALCULATED(17),
    NO_INCOME_PLUS(18),
    NO_TAX_INFO(19),
    WAITING_TRANSACTION(20),
    TRANSACTION_PROCESSING(21),
    TRANSACTION_FINISHED(22),
    TRANSACTION_FAILED(23),
    IN_TNS_REVIEW(24),
    PASS_BY_TNS(25),
    REMOVED_AFTER_SELECT(26),
    REMOVED_WITH_REWARD(27),
    STOPPED_AFTER_SELECT(28),
    STOPPED_WITH_REWARD(29);

    public final int LJLIL;

    public static MissionItemStatus valueOf(String str) {
        return (MissionItemStatus) V0N.LJJJ(MissionItemStatus.class, str);
    }

    public final int getStatus() {
        return this.LJLIL;
    }

    MissionItemStatus(int i) {
        this.LJLIL = i;
    }
}
