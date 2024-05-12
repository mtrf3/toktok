package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class MultiGuestSeiAbnormalDetectorSetting {

    @InterfaceC65349Pkn("open_detector")
    public boolean isOpenDetector;

    @InterfaceC65349Pkn("max_upload_times")
    public int maxUploadTimes;

    @InterfaceC65349Pkn("no_sei_app_data_threshold")
    public int noSeiAppDataThreshold;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiGuestSeiAbnormalDetectorSetting() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null);
    }

    public MultiGuestSeiAbnormalDetectorSetting(boolean z, int i, int i2) {
        this.isOpenDetector = z;
        this.maxUploadTimes = i;
        this.noSeiAppDataThreshold = i2;
    }

    public /* synthetic */ MultiGuestSeiAbnormalDetectorSetting(boolean z, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 3 : i, (i3 & 4) != 0 ? 7 : i2);
    }
}
