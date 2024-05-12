package com.ss.android.ugc.aweme.canvas;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes15.dex */
public final class CanvasGestureConfig extends F9E implements Serializable {

    @InterfaceC65349Pkn("enableFakeFeedView")
    public final boolean enableFakeFeedView;

    @InterfaceC65349Pkn("enableGesture")
    public final boolean enableGesture;

    @InterfaceC65349Pkn("enableMove")
    public final boolean enableMove;

    @InterfaceC65349Pkn("enableRotate")
    public final boolean enableRotate;

    @InterfaceC65349Pkn("enableScale")
    public final boolean enableScale;

    @InterfaceC65349Pkn("fingerCountForMove")
    public final int fingerCountForMove;

    /* JADX WARN: Multi-variable type inference failed */
    public CanvasGestureConfig() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, null);
    }

    public static /* synthetic */ CanvasGestureConfig copy$default(CanvasGestureConfig canvasGestureConfig, boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = canvasGestureConfig.enableGesture;
        }
        if ((i2 & 2) != 0) {
            z2 = canvasGestureConfig.enableMove;
        }
        if ((i2 & 4) != 0) {
            z3 = canvasGestureConfig.enableScale;
        }
        if ((i2 & 8) != 0) {
            z4 = canvasGestureConfig.enableRotate;
        }
        if ((i2 & 16) != 0) {
            i = canvasGestureConfig.fingerCountForMove;
        }
        if ((i2 & 32) != 0) {
            z5 = canvasGestureConfig.enableFakeFeedView;
        }
        return canvasGestureConfig.copy(z, z2, z3, z4, i, z5);
    }

    public final CanvasGestureConfig copy(boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5) {
        return new CanvasGestureConfig(z, z2, z3, z4, i, z5);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableGesture), Boolean.valueOf(this.enableMove), Boolean.valueOf(this.enableScale), Boolean.valueOf(this.enableRotate), Integer.valueOf(this.fingerCountForMove), Boolean.valueOf(this.enableFakeFeedView)};
    }

    public final boolean getEnableFakeFeedView() {
        return this.enableFakeFeedView;
    }

    public final boolean getEnableGesture() {
        return this.enableGesture;
    }

    public final boolean getEnableMove() {
        return this.enableMove;
    }

    public final boolean getEnableRotate() {
        return this.enableRotate;
    }

    public final boolean getEnableScale() {
        return this.enableScale;
    }

    public final int getFingerCountForMove() {
        return this.fingerCountForMove;
    }

    public CanvasGestureConfig(boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5) {
        this.enableGesture = z;
        this.enableMove = z2;
        this.enableScale = z3;
        this.enableRotate = z4;
        this.fingerCountForMove = i;
        this.enableFakeFeedView = z5;
    }

    public /* synthetic */ CanvasGestureConfig(boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? true : z2, (i2 & 4) != 0 ? true : z3, (i2 & 8) == 0 ? z4 : true, (i2 & 16) != 0 ? 2 : i, (i2 & 32) != 0 ? false : z5);
    }
}
