package com.ss.android.ugc.aweme.commercialize.measurement.video;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class VideoMeasurementConfig {

    @InterfaceC65349Pkn("enable_record_pos_before_stop")
    public final boolean enableRecordPosBeforeStop;

    public VideoMeasurementConfig() {
        this(false, 1, null);
    }

    public VideoMeasurementConfig(boolean z) {
        this.enableRecordPosBeforeStop = z;
    }

    public /* synthetic */ VideoMeasurementConfig(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
