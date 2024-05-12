package com.twitter.sdk.android.core.internal.scribe;

import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes12.dex */
public class SyndicationClientEvent extends ScribeEvent {

    @InterfaceC65349Pkn("event_info")
    public final String eventInfo;

    @InterfaceC65349Pkn("external_ids")
    public final ExternalIds externalIds;

    @InterfaceC65349Pkn("language")
    public final String language;

    /* loaded from: classes12.dex */
    public class ExternalIds {

        @InterfaceC65349Pkn("6")
        public final String adId;

        public ExternalIds(SyndicationClientEvent syndicationClientEvent, String str) {
            this.adId = str;
        }
    }

    public SyndicationClientEvent(EventNamespace eventNamespace, String str, long j, String str2, String str3, List<Object> list) {
        super("tfw_client_event", eventNamespace, j, list);
        this.language = str2;
        this.eventInfo = str;
        this.externalIds = new ExternalIds(this, str3);
    }
}
