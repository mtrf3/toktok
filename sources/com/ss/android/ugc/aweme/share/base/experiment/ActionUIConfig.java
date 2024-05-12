package com.ss.android.ugc.aweme.share.base.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class ActionUIConfig extends F9E {

    @InterfaceC65349Pkn("fillMode")
    public final int fillMode;

    @InterfaceC65349Pkn("fillMode_in_long_press")
    public final int fillModeInLongPress;

    @InterfaceC65349Pkn("fillMode_in_share")
    public final int fillModeInShare;

    @InterfaceC65349Pkn("long_press_use_online_action")
    public final boolean longPressUseOnlineAction;

    @InterfaceC65349Pkn("orientation")
    public final int orientation;

    @InterfaceC65349Pkn("position")
    public final int position;

    @InterfaceC65349Pkn("position_in_long_press")
    public final int positionInLongPress;

    @InterfaceC65349Pkn("position_in_share")
    public final int positionInShare;

    /* JADX WARN: Multi-variable type inference failed */
    public ActionUIConfig() {
        this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, null);
    }

    public static /* synthetic */ ActionUIConfig copy$default(ActionUIConfig actionUIConfig, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = actionUIConfig.position;
        }
        if ((i8 & 2) != 0) {
            i2 = actionUIConfig.orientation;
        }
        if ((i8 & 4) != 0) {
            i3 = actionUIConfig.fillMode;
        }
        if ((i8 & 8) != 0) {
            i4 = actionUIConfig.positionInShare;
        }
        if ((i8 & 16) != 0) {
            i5 = actionUIConfig.positionInLongPress;
        }
        if ((i8 & 32) != 0) {
            i6 = actionUIConfig.fillModeInShare;
        }
        if ((i8 & 64) != 0) {
            i7 = actionUIConfig.fillModeInLongPress;
        }
        if ((i8 & 128) != 0) {
            z = actionUIConfig.longPressUseOnlineAction;
        }
        return actionUIConfig.copy(i, i2, i3, i4, i5, i6, i7, z);
    }

    public final ActionUIConfig copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        return new ActionUIConfig(i, i2, i3, i4, i5, i6, i7, z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.orientation), Integer.valueOf(this.fillMode), Integer.valueOf(this.positionInShare), Integer.valueOf(this.positionInLongPress), Integer.valueOf(this.fillModeInShare), Integer.valueOf(this.fillModeInLongPress), Boolean.valueOf(this.longPressUseOnlineAction)};
    }

    public final int getFillMode() {
        return this.fillMode;
    }

    public final int getFillModeInLongPress() {
        return this.fillModeInLongPress;
    }

    public final int getFillModeInShare() {
        return this.fillModeInShare;
    }

    public final boolean getLongPressUseOnlineAction() {
        return this.longPressUseOnlineAction;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final int getPosition() {
        return this.position;
    }

    public final int getPositionInLongPress() {
        return this.positionInLongPress;
    }

    public final int getPositionInShare() {
        return this.positionInShare;
    }

    public ActionUIConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.position = i;
        this.orientation = i2;
        this.fillMode = i3;
        this.positionInShare = i4;
        this.positionInLongPress = i5;
        this.fillModeInShare = i6;
        this.fillModeInLongPress = i7;
        this.longPressUseOnlineAction = z;
    }

    public /* synthetic */ ActionUIConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 2 : i, (i8 & 2) != 0 ? 0 : i2, (i8 & 4) != 0 ? 0 : i3, (i8 & 8) != 0 ? 2 : i4, (i8 & 16) == 0 ? i5 : 2, (i8 & 32) != 0 ? 0 : i6, (i8 & 64) != 0 ? 0 : i7, (i8 & 128) == 0 ? z : false);
    }
}
