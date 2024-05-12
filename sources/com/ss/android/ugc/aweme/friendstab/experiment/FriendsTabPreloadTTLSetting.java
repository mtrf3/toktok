package com.ss.android.ugc.aweme.friendstab.experiment;

import X.Q7K;

/* loaded from: classes4.dex */
public final class FriendsTabPreloadTTLSetting {
    public static final int DEFAULT = 600000;
    public static final FriendsTabPreloadTTLSetting INSTANCE = new FriendsTabPreloadTTLSetting();

    public final int getValue() {
        return Q7K.LIZIZ("friends_tab_preload_ttl_setting", 600000);
    }
}
