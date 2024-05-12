package com.ss.android.ugc.aweme.canvas;

import X.C42069GfB;
import X.C47959Irz;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.UPJ;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CanvasExtra implements Serializable {
    public static final C42069GfB Companion = new C42069GfB();

    @InterfaceC65349Pkn(alternate = {"d"}, value = "duration")
    public final int duration;

    @InterfaceC65349Pkn("enableVVInteract")
    public final boolean enableVVInteract;

    @InterfaceC65349Pkn("forwardCanvasExtra")
    public final ForwardCanvasExtra forwardCanvasExtra;

    @InterfaceC65349Pkn("canvasGesture")
    public final CanvasGestureConfig gestureConfig;

    @InterfaceC65349Pkn(alternate = {"c"}, value = "height")
    public final int height;

    @InterfaceC65349Pkn("rotation")
    public final int rotation;

    @InterfaceC65349Pkn(alternate = {"g"}, value = "scaleMaxLimit")
    public final float scaleMaxLimit;

    @InterfaceC65349Pkn(alternate = {"f"}, value = "scaleMinLimit")
    public final float scaleMinLimit;

    @InterfaceC65349Pkn("speed")
    public final float speed;

    @InterfaceC65349Pkn("startTime")
    public final long startTime;

    @InterfaceC65349Pkn("streamEditConfigure")
    public final StreamEditConfigure streamEditConfigure;

    @InterfaceC65349Pkn(alternate = {"a"}, value = "type")
    public final int type;

    @InterfaceC65349Pkn(alternate = {"b"}, value = "width")
    public final int width;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CanvasExtra() {
        /*
            r17 = this;
            r1 = 0
            r5 = 0
            r8 = 0
            r12 = 0
            r15 = 8191(0x1fff, float:1.1478E-41)
            r0 = r17
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r5
            r7 = r1
            r9 = r8
            r10 = r8
            r11 = r5
            r14 = r1
            r16 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.canvas.CanvasExtra.<init>():void");
    }

    public static /* synthetic */ CanvasExtra copy$default(CanvasExtra canvasExtra, int i, int i2, int i3, int i4, float f, float f2, boolean z, CanvasGestureConfig canvasGestureConfig, ForwardCanvasExtra forwardCanvasExtra, StreamEditConfigure streamEditConfigure, float f3, long j, int i5, int i6, Object obj) {
        int i7 = i5;
        if ((i6 & 1) != 0) {
            i = canvasExtra.type;
        }
        if ((i6 & 2) != 0) {
            i2 = canvasExtra.width;
        }
        if ((i6 & 4) != 0) {
            i3 = canvasExtra.height;
        }
        if ((i6 & 8) != 0) {
            i4 = canvasExtra.duration;
        }
        if ((i6 & 16) != 0) {
            f = canvasExtra.scaleMinLimit;
        }
        if ((i6 & 32) != 0) {
            f2 = canvasExtra.scaleMaxLimit;
        }
        if ((i6 & 64) != 0) {
            z = canvasExtra.enableVVInteract;
        }
        if ((i6 & 128) != 0) {
            canvasGestureConfig = canvasExtra.gestureConfig;
        }
        if ((i6 & 256) != 0) {
            forwardCanvasExtra = canvasExtra.forwardCanvasExtra;
        }
        if ((i6 & 512) != 0) {
            streamEditConfigure = canvasExtra.streamEditConfigure;
        }
        if ((i6 & 1024) != 0) {
            f3 = canvasExtra.speed;
        }
        if ((i6 & 2048) != 0) {
            j = canvasExtra.startTime;
        }
        if ((i6 & 4096) != 0) {
            i7 = canvasExtra.rotation;
        }
        return canvasExtra.copy(i, i2, i3, i4, f, f2, z, canvasGestureConfig, forwardCanvasExtra, streamEditConfigure, f3, j, i7);
    }

    public final CanvasExtra copy(int i, int i2, int i3, int i4, float f, float f2, boolean z, CanvasGestureConfig gestureConfig, ForwardCanvasExtra forwardCanvasExtra, StreamEditConfigure streamEditConfigure, float f3, long j, int i5) {
        o.LJIIIZ(gestureConfig, "gestureConfig");
        return new CanvasExtra(i, i2, i3, i4, f, f2, z, gestureConfig, forwardCanvasExtra, streamEditConfigure, f3, j, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CanvasExtra)) {
            return false;
        }
        CanvasExtra canvasExtra = (CanvasExtra) obj;
        return this.type == canvasExtra.type && this.width == canvasExtra.width && this.height == canvasExtra.height && this.duration == canvasExtra.duration && Float.compare(this.scaleMinLimit, canvasExtra.scaleMinLimit) == 0 && Float.compare(this.scaleMaxLimit, canvasExtra.scaleMaxLimit) == 0 && this.enableVVInteract == canvasExtra.enableVVInteract && o.LJ(this.gestureConfig, canvasExtra.gestureConfig) && o.LJ(this.forwardCanvasExtra, canvasExtra.forwardCanvasExtra) && o.LJ(this.streamEditConfigure, canvasExtra.streamEditConfigure) && Float.compare(this.speed, canvasExtra.speed) == 0 && this.startTime == canvasExtra.startTime && this.rotation == canvasExtra.rotation;
    }

    public final long getEndTime() {
        return this.startTime + this.duration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int LIZIZ = C47959Irz.LIZIZ(this.scaleMaxLimit, C47959Irz.LIZIZ(this.scaleMinLimit, ((((((this.type * 31) + this.width) * 31) + this.height) * 31) + this.duration) * 31, 31), 31);
        boolean z = this.enableVVInteract;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (this.gestureConfig.hashCode() + ((LIZIZ + i) * 31)) * 31;
        ForwardCanvasExtra forwardCanvasExtra = this.forwardCanvasExtra;
        int i2 = 0;
        if (forwardCanvasExtra == null) {
            hashCode = 0;
        } else {
            hashCode = forwardCanvasExtra.hashCode();
        }
        int i3 = (hashCode2 + hashCode) * 31;
        StreamEditConfigure streamEditConfigure = this.streamEditConfigure;
        if (streamEditConfigure != null) {
            i2 = streamEditConfigure.hashCode();
        }
        return JBR.LIZJ(this.startTime, C47959Irz.LIZIZ(this.speed, (i3 + i2) * 31, 31), 31) + this.rotation;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CanvasExtra(type=");
        sb.append(this.type);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", scaleMinLimit=");
        sb.append(this.scaleMinLimit);
        sb.append(", scaleMaxLimit=");
        sb.append(this.scaleMaxLimit);
        sb.append(", enableVVInteract=");
        sb.append(this.enableVVInteract);
        sb.append(", gestureConfig=");
        sb.append(this.gestureConfig);
        sb.append(", forwardCanvasExtra=");
        sb.append(this.forwardCanvasExtra);
        sb.append(", streamEditConfigure=");
        sb.append(this.streamEditConfigure);
        sb.append(", speed=");
        sb.append(this.speed);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", rotation=");
        return UPJ.LIZLLL(sb, this.rotation, ')');
    }

    public final int getDuration() {
        return this.duration;
    }

    public final boolean getEnableVVInteract() {
        return this.enableVVInteract;
    }

    public final ForwardCanvasExtra getForwardCanvasExtra() {
        return this.forwardCanvasExtra;
    }

    public final CanvasGestureConfig getGestureConfig() {
        return this.gestureConfig;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getRotation() {
        return this.rotation;
    }

    public final float getScaleMaxLimit() {
        return this.scaleMaxLimit;
    }

    public final float getScaleMinLimit() {
        return this.scaleMinLimit;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final StreamEditConfigure getStreamEditConfigure() {
        return this.streamEditConfigure;
    }

    public final int getType() {
        return this.type;
    }

    public final int getWidth() {
        return this.width;
    }

    public CanvasExtra(int i, int i2, int i3, int i4, float f, float f2, boolean z, CanvasGestureConfig gestureConfig, ForwardCanvasExtra forwardCanvasExtra, StreamEditConfigure streamEditConfigure, float f3, long j, int i5) {
        o.LJIIIZ(gestureConfig, "gestureConfig");
        this.type = i;
        this.width = i2;
        this.height = i3;
        this.duration = i4;
        this.scaleMinLimit = f;
        this.scaleMaxLimit = f2;
        this.enableVVInteract = z;
        this.gestureConfig = gestureConfig;
        this.forwardCanvasExtra = forwardCanvasExtra;
        this.streamEditConfigure = streamEditConfigure;
        this.speed = f3;
        this.startTime = j;
        this.rotation = i5;
    }

    public /* synthetic */ CanvasExtra(int i, int i2, int i3, int i4, float f, float f2, boolean z, CanvasGestureConfig canvasGestureConfig, ForwardCanvasExtra forwardCanvasExtra, StreamEditConfigure streamEditConfigure, float f3, long j, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? 0.25f : f, (i6 & 32) != 0 ? 1.0f : f2, (i6 & 64) != 0 ? false : z, (i6 & 128) != 0 ? new CanvasGestureConfig(false, false, false, false, 0, false, 63, null) : canvasGestureConfig, (i6 & 256) != 0 ? null : forwardCanvasExtra, (i6 & 512) == 0 ? streamEditConfigure : null, (i6 & 1024) == 0 ? f3 : 1.0f, (i6 & 2048) != 0 ? 0L : j, (i6 & 4096) == 0 ? i5 : 0);
    }
}
