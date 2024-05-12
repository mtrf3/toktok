package com.ss.android.ugc.aweme.profile.model;

import X.V0N;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public enum ClaimStatus {
    UNCLAIMED(0),
    UNDER_REVIEW(1),
    APPROVED(2),
    REJECTED(3);

    public static final Companion Companion = new Companion();
    public final int value;

    public static ClaimStatus valueOf(String str) {
        return (ClaimStatus) V0N.LJJJ(ClaimStatus.class, str);
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final ClaimStatus of(Integer num) {
            for (ClaimStatus claimStatus : ClaimStatus.values()) {
                int value = claimStatus.getValue();
                if (num != null && value == num.intValue()) {
                    return claimStatus;
                }
            }
            return ClaimStatus.UNCLAIMED;
        }
    }

    public final int getValue() {
        return this.value;
    }

    ClaimStatus(int i) {
        this.value = i;
    }
}
