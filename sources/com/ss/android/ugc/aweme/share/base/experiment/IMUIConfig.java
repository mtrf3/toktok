package com.ss.android.ugc.aweme.share.base.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class IMUIConfig extends F9E {

    @InterfaceC65349Pkn("orientation")
    public final int orientation;

    @InterfaceC65349Pkn("orientation_in_long_press")
    public final int orientationInLongPress;

    @InterfaceC65349Pkn("orientation_in_share")
    public final int orientationInShare;

    @InterfaceC65349Pkn("position")
    public final int position;

    @InterfaceC65349Pkn("position_in_long_press")
    public final int positionInLongPress;

    @InterfaceC65349Pkn("position_in_share")
    public final int positionInShare;

    @InterfaceC65349Pkn("im_undo_style_in_long_press")
    public final int undoStyleInLongPress;

    @InterfaceC65349Pkn("im_undo_style_in_share")
    public final int undoStyleInShare;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public IMUIConfig() {
        /*
            r11 = this;
            r1 = 0
            r9 = 255(0xff, float:3.57E-43)
            r10 = 0
            r0 = r11
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.base.experiment.IMUIConfig.<init>():void");
    }

    public static /* synthetic */ IMUIConfig copy$default(IMUIConfig iMUIConfig, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i = iMUIConfig.position;
        }
        if ((i9 & 2) != 0) {
            i2 = iMUIConfig.orientation;
        }
        if ((i9 & 4) != 0) {
            i3 = iMUIConfig.positionInShare;
        }
        if ((i9 & 8) != 0) {
            i4 = iMUIConfig.positionInLongPress;
        }
        if ((i9 & 16) != 0) {
            i5 = iMUIConfig.undoStyleInShare;
        }
        if ((i9 & 32) != 0) {
            i6 = iMUIConfig.undoStyleInLongPress;
        }
        if ((i9 & 64) != 0) {
            i7 = iMUIConfig.orientationInShare;
        }
        if ((i9 & 128) != 0) {
            i8 = iMUIConfig.orientationInLongPress;
        }
        return iMUIConfig.copy(i, i2, i3, i4, i5, i6, i7, i8);
    }

    public final IMUIConfig copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return new IMUIConfig(i, i2, i3, i4, i5, i6, i7, i8);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.orientation), Integer.valueOf(this.positionInShare), Integer.valueOf(this.positionInLongPress), Integer.valueOf(this.undoStyleInShare), Integer.valueOf(this.undoStyleInLongPress), Integer.valueOf(this.orientationInShare), Integer.valueOf(this.orientationInLongPress)};
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final int getOrientationInLongPress() {
        return this.orientationInLongPress;
    }

    public final int getOrientationInShare() {
        return this.orientationInShare;
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

    public final int getUndoStyleInLongPress() {
        return this.undoStyleInLongPress;
    }

    public final int getUndoStyleInShare() {
        return this.undoStyleInShare;
    }

    public IMUIConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.position = i;
        this.orientation = i2;
        this.positionInShare = i3;
        this.positionInLongPress = i4;
        this.undoStyleInShare = i5;
        this.undoStyleInLongPress = i6;
        this.orientationInShare = i7;
        this.orientationInLongPress = i8;
    }

    public /* synthetic */ IMUIConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? 0 : i, (i9 & 2) != 0 ? 0 : i2, (i9 & 4) != 0 ? 0 : i3, (i9 & 8) != 0 ? 0 : i4, (i9 & 16) != 0 ? 0 : i5, (i9 & 32) != 0 ? 0 : i6, (i9 & 64) != 0 ? 0 : i7, (i9 & 128) == 0 ? i8 : 0);
    }
}
