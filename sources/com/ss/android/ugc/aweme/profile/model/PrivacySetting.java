package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class PrivacySetting implements Serializable {

    @InterfaceC65349Pkn("following_visibility")
    public final int followingVisibility;

    public PrivacySetting() {
        this(0, 1, null);
    }

    public final int getFollowingVisibility() {
        return this.followingVisibility;
    }

    public PrivacySetting(int i) {
        this.followingVisibility = i;
    }

    public /* synthetic */ PrivacySetting(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
