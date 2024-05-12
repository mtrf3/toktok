package com.bytedance.android.livesdk.livesetting.linkmic;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class PanelStyle {

    @InterfaceC65349Pkn("panel_type")
    public int panelType;

    @InterfaceC65349Pkn("show_view_more")
    public boolean showViewMore;

    /* JADX WARN: Multi-variable type inference failed */
    public PanelStyle() {
        this(0, 0 == true ? 1 : 0, 3, null);
    }

    public PanelStyle(int i, boolean z) {
        this.panelType = i;
        this.showViewMore = z;
    }

    public /* synthetic */ PanelStyle(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z);
    }
}
