package com.ss.android.ugc.aweme.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class ImagePreloadConfig extends F9E {

    @InterfaceC65349Pkn("default_horizontal_count")
    public final int defaultHorizontalCount;

    @InterfaceC65349Pkn("detail_vertical_count")
    public final int detailVerticalCount;

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    @InterfaceC65349Pkn("fyp_vertical_count")
    public final int fypVerticalCount;

    /* JADX WARN: Multi-variable type inference failed */
    public ImagePreloadConfig() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, null);
    }

    public static /* synthetic */ ImagePreloadConfig copy$default(ImagePreloadConfig imagePreloadConfig, boolean z, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = imagePreloadConfig.enable;
        }
        if ((i4 & 2) != 0) {
            i = imagePreloadConfig.fypVerticalCount;
        }
        if ((i4 & 4) != 0) {
            i2 = imagePreloadConfig.detailVerticalCount;
        }
        if ((i4 & 8) != 0) {
            i3 = imagePreloadConfig.defaultHorizontalCount;
        }
        return imagePreloadConfig.copy(z, i, i2, i3);
    }

    public final ImagePreloadConfig copy(boolean z, int i, int i2, int i3) {
        return new ImagePreloadConfig(z, i, i2, i3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable), Integer.valueOf(this.fypVerticalCount), Integer.valueOf(this.detailVerticalCount), Integer.valueOf(this.defaultHorizontalCount)};
    }

    public final int getDefaultHorizontalCount() {
        return this.defaultHorizontalCount;
    }

    public final int getDetailVerticalCount() {
        return this.detailVerticalCount;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final int getFypVerticalCount() {
        return this.fypVerticalCount;
    }

    public ImagePreloadConfig(boolean z, int i, int i2, int i3) {
        this.enable = z;
        this.fypVerticalCount = i;
        this.detailVerticalCount = i2;
        this.defaultHorizontalCount = i3;
    }

    public /* synthetic */ ImagePreloadConfig(boolean z, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3);
    }
}
