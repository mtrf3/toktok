package com.bytedance.android.live.effect.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class VideoSize extends F9E {

    @InterfaceC65349Pkn("is_full_screen")
    public boolean isFullScreen;

    @InterfaceC65349Pkn("real_height")
    public int realHeight;

    @InterfaceC65349Pkn("real_width")
    public int realWidth;

    @InterfaceC65349Pkn("surface_height")
    public int surfaceHeight;

    @InterfaceC65349Pkn("surface_width")
    public int surfaceWidth;

    /* JADX WARN: Multi-variable type inference failed */
    public VideoSize() {
        this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.realWidth), Integer.valueOf(this.surfaceWidth), Integer.valueOf(this.realHeight), Integer.valueOf(this.surfaceHeight), Boolean.valueOf(this.isFullScreen)};
    }

    public VideoSize(int i, int i2, int i3, int i4, boolean z) {
        this.realWidth = i;
        this.surfaceWidth = i2;
        this.realHeight = i3;
        this.surfaceHeight = i4;
        this.isFullScreen = z;
    }

    public /* synthetic */ VideoSize(int i, int i2, int i3, int i4, boolean z, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) == 0 ? i4 : 0, (i5 & 16) != 0 ? true : z);
    }
}
