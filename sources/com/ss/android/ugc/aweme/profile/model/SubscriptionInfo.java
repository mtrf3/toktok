package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class SubscriptionInfo implements Serializable {

    @InterfaceC65349Pkn("audience_sub_info")
    public final AudienceSubInfo audienceSubInfo;

    @InterfaceC65349Pkn("creator_sub_info")
    public final CreatorSubInfo creatorSubInfo;

    @InterfaceC65349Pkn("url")
    public final String url;

    public final AudienceSubInfo getAudienceSubInfo() {
        return this.audienceSubInfo;
    }

    public final CreatorSubInfo getCreatorSubInfo() {
        return this.creatorSubInfo;
    }

    public final String getUrl() {
        return this.url;
    }

    public SubscriptionInfo(CreatorSubInfo creatorSubInfo, AudienceSubInfo audienceSubInfo, String str) {
        this.creatorSubInfo = creatorSubInfo;
        this.audienceSubInfo = audienceSubInfo;
        this.url = str;
    }
}
