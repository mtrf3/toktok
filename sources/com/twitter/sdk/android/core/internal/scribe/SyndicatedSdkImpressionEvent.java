package com.twitter.sdk.android.core.internal.scribe;

import X.InterfaceC65349Pkn;
import java.util.Collections;
import java.util.List;

/* loaded from: classes12.dex */
public class SyndicatedSdkImpressionEvent extends ScribeEvent {

    @InterfaceC65349Pkn("device_id_created_at")
    public final long deviceIdCreatedAt;

    @InterfaceC65349Pkn("external_ids")
    public final ExternalIds externalIds;

    @InterfaceC65349Pkn("language")
    public final String language;

    /* loaded from: classes12.dex */
    public class ExternalIds {

        @InterfaceC65349Pkn("AD_ID")
        public final String adId;

        public ExternalIds(SyndicatedSdkImpressionEvent syndicatedSdkImpressionEvent, String str) {
            this.adId = str;
        }
    }

    public SyndicatedSdkImpressionEvent(EventNamespace eventNamespace, long j, String str, String str2) {
        this(eventNamespace, j, str, str2, Collections.emptyList());
    }

    public SyndicatedSdkImpressionEvent(EventNamespace eventNamespace, long j, String str, String str2, List<Object> list) {
        super("syndicated_sdk_impression", eventNamespace, j, list);
        this.language = str;
        this.externalIds = new ExternalIds(this, str2);
        this.deviceIdCreatedAt = 0L;
    }
}
