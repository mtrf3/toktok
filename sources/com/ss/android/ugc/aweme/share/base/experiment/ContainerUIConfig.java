package com.ss.android.ugc.aweme.share.base.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class ContainerUIConfig extends F9E {

    @InterfaceC65349Pkn("ab_group")
    public final int abGroup;

    @InterfaceC65349Pkn("background_in_long_press")
    public final int backgroundInLongPress;

    @InterfaceC65349Pkn("background_in_share")
    public final int backgroundInShare;

    @InterfaceC65349Pkn("peek_height_ratio")
    public final float peekHeightRatio;

    @InterfaceC65349Pkn("should_show_header_in_long_press")
    public final boolean shouldShowHeaderInLongPress;

    @InterfaceC65349Pkn("should_show_header_in_share")
    public final boolean shouldShowHeaderInShare;

    @InterfaceC65349Pkn("uplift")
    public final boolean uplift;

    @InterfaceC65349Pkn("use_new_style")
    public final boolean useNewPanelStyle;

    /* JADX WARN: Multi-variable type inference failed */
    public ContainerUIConfig() {
        this(false, 0 == true ? 1 : 0, 0.0f, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, null);
    }

    public static /* synthetic */ ContainerUIConfig copy$default(ContainerUIConfig containerUIConfig, boolean z, boolean z2, float f, int i, int i2, int i3, boolean z3, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = containerUIConfig.useNewPanelStyle;
        }
        if ((i4 & 2) != 0) {
            z2 = containerUIConfig.uplift;
        }
        if ((i4 & 4) != 0) {
            f = containerUIConfig.peekHeightRatio;
        }
        if ((i4 & 8) != 0) {
            i = containerUIConfig.abGroup;
        }
        if ((i4 & 16) != 0) {
            i2 = containerUIConfig.backgroundInShare;
        }
        if ((i4 & 32) != 0) {
            i3 = containerUIConfig.backgroundInLongPress;
        }
        if ((i4 & 64) != 0) {
            z3 = containerUIConfig.shouldShowHeaderInShare;
        }
        if ((i4 & 128) != 0) {
            z4 = containerUIConfig.shouldShowHeaderInLongPress;
        }
        return containerUIConfig.copy(z, z2, f, i, i2, i3, z3, z4);
    }

    public final ContainerUIConfig copy(boolean z, boolean z2, float f, int i, int i2, int i3, boolean z3, boolean z4) {
        return new ContainerUIConfig(z, z2, f, i, i2, i3, z3, z4);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.useNewPanelStyle), Boolean.valueOf(this.uplift), Float.valueOf(this.peekHeightRatio), Integer.valueOf(this.abGroup), Integer.valueOf(this.backgroundInShare), Integer.valueOf(this.backgroundInLongPress), Boolean.valueOf(this.shouldShowHeaderInShare), Boolean.valueOf(this.shouldShowHeaderInLongPress)};
    }

    public final int getAbGroup() {
        return this.abGroup;
    }

    public final int getBackgroundInLongPress() {
        return this.backgroundInLongPress;
    }

    public final int getBackgroundInShare() {
        return this.backgroundInShare;
    }

    public final float getPeekHeightRatio() {
        return this.peekHeightRatio;
    }

    public final boolean getShouldShowHeaderInLongPress() {
        return this.shouldShowHeaderInLongPress;
    }

    public final boolean getShouldShowHeaderInShare() {
        return this.shouldShowHeaderInShare;
    }

    public final boolean getUplift() {
        return this.uplift;
    }

    public final boolean getUseNewPanelStyle() {
        return this.useNewPanelStyle;
    }

    public ContainerUIConfig(boolean z, boolean z2, float f, int i, int i2, int i3, boolean z3, boolean z4) {
        this.useNewPanelStyle = z;
        this.uplift = z2;
        this.peekHeightRatio = f;
        this.abGroup = i;
        this.backgroundInShare = i2;
        this.backgroundInLongPress = i3;
        this.shouldShowHeaderInShare = z3;
        this.shouldShowHeaderInLongPress = z4;
    }

    public /* synthetic */ ContainerUIConfig(boolean z, boolean z2, float f, int i, int i2, int i3, boolean z3, boolean z4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? false : z2, (i4 & 4) != 0 ? 0.5f : f, (i4 & 8) != 0 ? 0 : i, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) == 0 ? i3 : 0, (i4 & 64) != 0 ? true : z3, (i4 & 128) == 0 ? z4 : true);
    }
}
