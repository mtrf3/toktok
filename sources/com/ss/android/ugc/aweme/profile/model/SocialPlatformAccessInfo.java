package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class SocialPlatformAccessInfo implements Serializable {

    @InterfaceC65349Pkn("token_status")
    public Integer tokenStatus;

    /* JADX WARN: Multi-variable type inference failed */
    public SocialPlatformAccessInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Integer getTokenStatus() {
        return this.tokenStatus;
    }

    public SocialPlatformAccessInfo(Integer num) {
        this.tokenStatus = num;
    }

    public final void setTokenStatus(Integer num) {
        this.tokenStatus = num;
    }

    public /* synthetic */ SocialPlatformAccessInfo(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num);
    }
}
