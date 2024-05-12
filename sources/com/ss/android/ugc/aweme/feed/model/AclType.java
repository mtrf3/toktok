package com.ss.android.ugc.aweme.feed.model;

import X.V0N;

/* loaded from: classes11.dex */
public enum AclType {
    SHARE_THIRD_PLATFORM,
    PLATFORM_LIST,
    SHARE_GENERAL;

    public static AclType valueOf(String str) {
        return (AclType) V0N.LJJJ(AclType.class, str);
    }
}
