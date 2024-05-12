package com.bytedance.pitaya.api.bean;

import X.C48164IvI;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class PTYNDArray extends PTYClass {
    public static final C48164IvI Companion = new C48164IvI();
    public final int bits;
    public final int deviceID;
    public final int deviceType;
    public final int index;
    public final int lanes;
    public final byte[] rawBytes;
    public final int rawDataType;
    public final float[] rawFloats;
    public final int[] shapes;
    public final int type;

    public static /* synthetic */ void rawDataType$annotations() {
    }

    public final int getBits() {
        return this.bits;
    }

    public final int getDeviceID() {
        return this.deviceID;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getLanes() {
        return this.lanes;
    }

    public final byte[] getRawBytes() {
        return this.rawBytes;
    }

    public final float[] getRawFloats() {
        return this.rawFloats;
    }

    public final int[] getShapes() {
        return this.shapes;
    }

    public final int getType() {
        return this.type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PTYNDArray(int i, byte[] bArr, float[] fArr, int[] shapes, int i2, int i3, int i4, int i5, int i6) {
        super(3);
        o.LJIIJ(shapes, "shapes");
        int i7 = 3;
        this.index = i;
        this.rawBytes = bArr;
        this.rawFloats = fArr;
        this.shapes = shapes;
        this.type = i2;
        this.bits = i3;
        this.lanes = i4;
        this.deviceID = i5;
        this.deviceType = i6;
        if (bArr != null) {
            i7 = 2;
        } else if (fArr == null) {
            throw new IllegalArgumentException("NDArray has no data!");
        }
        this.rawDataType = i7;
    }

    public /* synthetic */ PTYNDArray(int i, byte[] bArr, float[] fArr, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? -1 : i, (i7 & 2) != 0 ? null : bArr, (i7 & 4) == 0 ? fArr : null, (i7 & 8) != 0 ? new int[0] : iArr, i2, i3, (i7 & 64) != 0 ? 1 : i4, (i7 & 128) != 0 ? 0 : i5, (i7 & 256) != 0 ? 1 : i6);
    }
}
