package com.bytedance.android.livesdk.livesetting.performance;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class FacialGiftTrackingModel {

    @InterfaceC65349Pkn("link_tracking_min_version")
    public Integer linkTrackingMinVersion;

    @InterfaceC65349Pkn("enable_tracking")
    public Boolean trackingEnabled;

    /* JADX WARN: Multi-variable type inference failed */
    public FacialGiftTrackingModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public FacialGiftTrackingModel(Boolean bool, Integer num) {
        this.trackingEnabled = bool;
        this.linkTrackingMinVersion = num;
    }

    public /* synthetic */ FacialGiftTrackingModel(Boolean bool, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.TRUE : bool, (i & 2) != 0 ? 270900 : num);
    }
}
