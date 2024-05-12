package com.ss.android.ugc.aweme.im.service.appsettings;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ActivityStatusAccuracyAnalysisConfig extends F9E {

    @InterfaceC65349Pkn("activity_status_accuracy_polling_config_list")
    public final List<ActivityStatusAccuracyPollingConfig> activityStatusAccuracyPollingConfigList;

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    public ActivityStatusAccuracyAnalysisConfig() {
        this(false, null, 3, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable), this.activityStatusAccuracyPollingConfigList};
    }

    public ActivityStatusAccuracyAnalysisConfig(boolean z, List<ActivityStatusAccuracyPollingConfig> activityStatusAccuracyPollingConfigList) {
        o.LJIIIZ(activityStatusAccuracyPollingConfigList, "activityStatusAccuracyPollingConfigList");
        this.enable = z;
        this.activityStatusAccuracyPollingConfigList = activityStatusAccuracyPollingConfigList;
    }

    public ActivityStatusAccuracyAnalysisConfig(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C61878OQg.INSTANCE : list);
    }
}
