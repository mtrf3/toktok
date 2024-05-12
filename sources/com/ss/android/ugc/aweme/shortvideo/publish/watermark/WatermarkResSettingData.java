package com.ss.android.ugc.aweme.shortvideo.publish.watermark;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes14.dex */
public final class WatermarkResSettingData implements Serializable {
    public final int height;

    @InterfaceC65349Pkn("min_allow_disk_mb")
    public final int minAllowDiskMB;
    public final int width;

    public final int getHeight() {
        return this.height;
    }

    public final int getMinAllowDiskMB() {
        return this.minAllowDiskMB;
    }

    public final int getWidth() {
        return this.width;
    }

    public WatermarkResSettingData(int i, int i2, int i3) {
        this.width = i;
        this.height = i2;
        this.minAllowDiskMB = i3;
    }
}
