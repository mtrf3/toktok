package com.ss.android.ugc.aweme.ecommerce.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PanelOpenInfo extends F9E implements Serializable {

    @InterfaceC65349Pkn("panel_click_method")
    public final int panelClickMethod;

    @InterfaceC65349Pkn("panel_need_maybe_you_like")
    public final boolean panelNeedMaybeYouLike;

    @InterfaceC65349Pkn("panel_open_source")
    public final String panelOpenSource;

    @InterfaceC65349Pkn("panel_open_way")
    public final int panelOpenWay;

    @InterfaceC65349Pkn("panel_style")
    public final int panelStyle;

    /* JADX WARN: Multi-variable type inference failed */
    public PanelOpenInfo() {
        this(0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PanelOpenInfo copy$default(PanelOpenInfo panelOpenInfo, int i, String str, int i2, boolean z, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = panelOpenInfo.panelOpenWay;
        }
        if ((i4 & 2) != 0) {
            str = panelOpenInfo.panelOpenSource;
        }
        if ((i4 & 4) != 0) {
            i2 = panelOpenInfo.panelStyle;
        }
        if ((i4 & 8) != 0) {
            z = panelOpenInfo.panelNeedMaybeYouLike;
        }
        if ((i4 & 16) != 0) {
            i3 = panelOpenInfo.panelClickMethod;
        }
        return panelOpenInfo.copy(i, str, i2, z, i3);
    }

    public final PanelOpenInfo copy(int i, String panelOpenSource, int i2, boolean z, int i3) {
        o.LJIIIZ(panelOpenSource, "panelOpenSource");
        return new PanelOpenInfo(i, panelOpenSource, i2, z, i3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.panelOpenWay), this.panelOpenSource, Integer.valueOf(this.panelStyle), Boolean.valueOf(this.panelNeedMaybeYouLike), Integer.valueOf(this.panelClickMethod)};
    }

    public final int getPanelClickMethod() {
        return this.panelClickMethod;
    }

    public final boolean getPanelNeedMaybeYouLike() {
        return this.panelNeedMaybeYouLike;
    }

    public final String getPanelOpenSource() {
        return this.panelOpenSource;
    }

    public final int getPanelOpenWay() {
        return this.panelOpenWay;
    }

    public final int getPanelStyle() {
        return this.panelStyle;
    }

    public PanelOpenInfo(int i, String panelOpenSource, int i2, boolean z, int i3) {
        o.LJIIIZ(panelOpenSource, "panelOpenSource");
        this.panelOpenWay = i;
        this.panelOpenSource = panelOpenSource;
        this.panelStyle = i2;
        this.panelNeedMaybeYouLike = z;
        this.panelClickMethod = i3;
    }

    public /* synthetic */ PanelOpenInfo(int i, String str, int i2, boolean z, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? "video_anchor" : str, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? 0 : i3);
    }
}
