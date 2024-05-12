package com.ss.android.ugc.aweme.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class PreloadWidgetsData extends F9E {

    @InterfaceC65349Pkn("disable_recycle_image")
    public final boolean disableRecycleImage;

    @InterfaceC65349Pkn("enable_recycle_widget")
    public final boolean enableRecycleWidget;

    @InterfaceC65349Pkn("live_hot_level")
    public final int liveHotLevel;

    /* JADX WARN: Multi-variable type inference failed */
    public PreloadWidgetsData() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.disableRecycleImage), Boolean.valueOf(this.enableRecycleWidget), Integer.valueOf(this.liveHotLevel)};
    }

    public PreloadWidgetsData(boolean z, boolean z2, int i) {
        this.disableRecycleImage = z;
        this.enableRecycleWidget = z2;
        this.liveHotLevel = i;
    }

    public /* synthetic */ PreloadWidgetsData(boolean z, boolean z2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? true : z2, (i2 & 4) != 0 ? 999 : i);
    }
}
