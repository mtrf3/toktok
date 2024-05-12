package com.bytedance.android.live.broadcast.mirror.message;

import X.C15C;
import X.C15D;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class DualCameraStateMessage implements C15D {

    @InterfaceC65349Pkn("camera_state")
    public int cameraState;

    public DualCameraStateMessage() {
        this(0, 1, null);
    }

    @Override // X.C15D
    public final String getMethodName() {
        return C15C.DualCameraState.getMethod();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cameraState = ");
        LIZ.append(this.cameraState);
        return X1D.LIZIZ(LIZ);
    }

    public DualCameraStateMessage(int i) {
        this.cameraState = i;
    }

    public /* synthetic */ DualCameraStateMessage(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i);
    }
}
