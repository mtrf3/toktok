package com.bytedance.android.livesdk.livesetting.linkmic;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SettingsParams {

    @InterfaceC65349Pkn("duration_opt_business_name")
    public String durationOptBusinessName;

    @InterfaceC65349Pkn("feature_collect_business_name")
    public String featureCollectBusinessName;

    @InterfaceC65349Pkn("status")
    public int status;

    /* JADX WARN: Multi-variable type inference failed */
    public SettingsParams() {
        this(0, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public SettingsParams(int i, String featureCollectBusinessName, String durationOptBusinessName) {
        o.LJIIIZ(featureCollectBusinessName, "featureCollectBusinessName");
        o.LJIIIZ(durationOptBusinessName, "durationOptBusinessName");
        this.status = i;
        this.featureCollectBusinessName = featureCollectBusinessName;
        this.durationOptBusinessName = durationOptBusinessName;
    }

    public /* synthetic */ SettingsParams(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2);
    }
}
