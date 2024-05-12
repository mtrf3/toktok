package com.ss.android.ugc.aweme.model;

import X.V0N;

/* loaded from: classes5.dex */
public enum ManagementPagePaidVideoStatus {
    UNKNOWN,
    PUBLISHED,
    PROCESSING;

    public static ManagementPagePaidVideoStatus valueOf(String str) {
        return (ManagementPagePaidVideoStatus) V0N.LJJJ(ManagementPagePaidVideoStatus.class, str);
    }
}
