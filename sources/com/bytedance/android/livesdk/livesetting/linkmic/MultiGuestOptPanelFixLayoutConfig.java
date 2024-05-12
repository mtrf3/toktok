package com.bytedance.android.livesdk.livesetting.linkmic;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class MultiGuestOptPanelFixLayoutConfig {

    @InterfaceC65349Pkn("enable_layout_loading_change")
    public boolean enableLayoutLoadingChange;

    @InterfaceC65349Pkn("version")
    public int version;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiGuestOptPanelFixLayoutConfig() {
        this(0, 0 == true ? 1 : 0, 3, null);
    }

    public MultiGuestOptPanelFixLayoutConfig(int i, boolean z) {
        this.version = i;
        this.enableLayoutLoadingChange = z;
    }

    public /* synthetic */ MultiGuestOptPanelFixLayoutConfig(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 7 : i, (i2 & 2) != 0 ? true : z);
    }
}
