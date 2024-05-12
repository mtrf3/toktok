package com.bytedance.android.live.broadcast.mirror.message;

import X.C15C;
import X.C15D;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class DualCameraCaptureSizeMessage implements C15D {

    @InterfaceC65349Pkn("height")
    public int height;

    @InterfaceC65349Pkn("width")
    public int width;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DualCameraCaptureSizeMessage() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.mirror.message.DualCameraCaptureSizeMessage.<init>():void");
    }

    @Override // X.C15D
    public final String getMethodName() {
        return C15C.DualCameraCaptureSize.getMethod();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("width = ");
        LIZ.append(this.width);
        LIZ.append(", height = ");
        LIZ.append(this.height);
        return X1D.LIZIZ(LIZ);
    }

    public DualCameraCaptureSizeMessage(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public /* synthetic */ DualCameraCaptureSizeMessage(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
