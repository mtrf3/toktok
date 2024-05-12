package com.ss.android.ugc.aweme.experiment;

import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class TopicFeedTabConfig extends F9E {
    public final boolean LJLIL;

    @InterfaceC65349Pkn("event_tracking_name")
    public final String eventTrackingName;

    @InterfaceC65349Pkn("tab_title")
    public final String title;

    @InterfaceC65349Pkn("topic_feed_id")
    public final int topicFeedId;

    @InterfaceC65349Pkn("watched_all_string")
    public final String watchedAllString;

    /* JADX WARN: Multi-variable type inference failed */
    public TopicFeedTabConfig() {
        this(false, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Integer.valueOf(this.topicFeedId), this.title, this.eventTrackingName, this.watchedAllString};
    }

    public TopicFeedTabConfig(boolean z, int i, String str, String str2, String str3) {
        HH1.LIZ(str, "title", str2, "eventTrackingName", str3, "watchedAllString");
        this.LJLIL = z;
        this.topicFeedId = i;
        this.title = str;
        this.eventTrackingName = str2;
        this.watchedAllString = str3;
    }

    public /* synthetic */ TopicFeedTabConfig(boolean z, int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) == 0 ? str3 : "");
    }
}
