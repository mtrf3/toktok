package com.ss.android.ugc.aweme.childhook;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class MajorComponentsAllowList extends F9E {

    @InterfaceC65349Pkn("Activity")
    public final List<String> activities;

    @InterfaceC65349Pkn("BroadcastReceiver")
    public final List<String> broadcastReceivers;

    @InterfaceC65349Pkn("ContentProvider")
    public final List<String> contentProviders;

    @InterfaceC65349Pkn("LaunchActivity")
    public final String launchActivity;

    public MajorComponentsAllowList() {
        this(null, null, null, null, 15, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.launchActivity, this.activities, this.contentProviders, this.broadcastReceivers};
    }

    public MajorComponentsAllowList(String launchActivity, List<String> activities, List<String> contentProviders, List<String> broadcastReceivers) {
        o.LJIIIZ(launchActivity, "launchActivity");
        o.LJIIIZ(activities, "activities");
        o.LJIIIZ(contentProviders, "contentProviders");
        o.LJIIIZ(broadcastReceivers, "broadcastReceivers");
        this.launchActivity = launchActivity;
        this.activities = activities;
        this.contentProviders = contentProviders;
        this.broadcastReceivers = broadcastReceivers;
    }

    public MajorComponentsAllowList(String str, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C61878OQg.INSTANCE : list, (i & 4) != 0 ? C61878OQg.INSTANCE : list2, (i & 8) != 0 ? C61878OQg.INSTANCE : list3);
    }
}
