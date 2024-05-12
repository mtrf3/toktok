package com.ss.android.ugc.aweme.model;

import X.V0N;

/* loaded from: classes5.dex */
public enum ManagementPagePaidCollectionStatus {
    UNKNOWN(0),
    DRAFT(1),
    REVIEW(2),
    REVIEW_FAILED(3),
    PUBLISHED(4),
    DELISTED(5),
    LOCKED(6);

    public static ManagementPagePaidCollectionStatus valueOf(String str) {
        return (ManagementPagePaidCollectionStatus) V0N.LJJJ(ManagementPagePaidCollectionStatus.class, str);
    }

    ManagementPagePaidCollectionStatus(int i) {
    }
}
