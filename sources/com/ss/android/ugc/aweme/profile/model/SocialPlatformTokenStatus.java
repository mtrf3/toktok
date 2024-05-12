package com.ss.android.ugc.aweme.profile.model;

import X.V0N;

/* loaded from: classes13.dex */
public enum SocialPlatformTokenStatus {
    STATUS_UNKNOWN(0),
    STATUS_VALID(1),
    STATUS_INVALID(2);

    public final int value;

    public static SocialPlatformTokenStatus valueOf(String str) {
        return (SocialPlatformTokenStatus) V0N.LJJJ(SocialPlatformTokenStatus.class, str);
    }

    public final int getValue() {
        return this.value;
    }

    SocialPlatformTokenStatus(int i) {
        this.value = i;
    }
}
