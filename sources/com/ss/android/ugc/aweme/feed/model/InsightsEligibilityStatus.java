package com.ss.android.ugc.aweme.feed.model;

import X.V0N;

/* loaded from: classes10.dex */
public enum InsightsEligibilityStatus {
    CONTROL(null, false, false),
    AVAILABLE("clickable", false, true),
    NOT_AVAILABLE_NEW("not_available_new", true, true),
    NOT_AVAILABLE_TTL("not_available_ttl", true, true);

    public final String eventParam;
    public final boolean isIneligible;
    public final boolean isTest;

    public static InsightsEligibilityStatus valueOf(String str) {
        return (InsightsEligibilityStatus) V0N.LJJJ(InsightsEligibilityStatus.class, str);
    }

    public final String getEventParam() {
        return this.eventParam;
    }

    public final boolean isIneligible() {
        return this.isIneligible;
    }

    public final boolean isTest() {
        return this.isTest;
    }

    InsightsEligibilityStatus(String str, boolean z, boolean z2) {
        this.eventParam = str;
        this.isIneligible = z;
        this.isTest = z2;
    }
}
