package com.ss.android.ugc.aweme.friendstab.experiment;

import X.Q7K;

/* loaded from: classes10.dex */
public final class FriendsTabPreloadIntervalSettings {
    public static final int DEFAULT = 600000;
    public static final FriendsTabPreloadIntervalSettings INSTANCE = new FriendsTabPreloadIntervalSettings();

    public final int getValue() {
        return Q7K.LIZIZ("friends_tab_preload_polling_interval_setting", 600000);
    }
}
