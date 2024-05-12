package com.bytedance.pitaya.api.bean;

import X.C48163IvH;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class PTYTensor extends PTYClass {
    public static final C48163IvH Companion = new C48163IvH();
    public final int dataFormat;
    public final int dataType;
    public final int[] dims;
    public final int fraction;
    public final String name;
    public final byte[] rawBytes;
    public final int rawDataType;
    public final float[] rawFloats;

    private final int dataTypeSize(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 20) {
                    if (i == 22) {
                        return 8;
                    }
                    switch (i) {
                        case 10:
                            return 1;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                            break;
                        case 12:
                            break;
                        default:
                            return 0;
                    }
                }
            }
            return 4;
        }
        return 2;
    }

    public static /* synthetic */ void rawDataType$annotations() {
    }

    public final int getDataFormat() {
        return this.dataFormat;
    }

    public final int getDataType() {
        return this.dataType;
    }

    public final int[] getDims() {
        return this.dims;
    }

    public final int getFraction() {
        return this.fraction;
    }

    public final String getName() {
        return this.name;
    }

    public final byte[] getRawBytes() {
        return this.rawBytes;
    }

    public final float[] getRawFloats() {
        return this.rawFloats;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PTYTensor(byte[] bArr, float[] fArr, int i, int i2, int[] iArr, int i3, String name) {
        super(0);
        int i4;
        o.LJIIJ(name, "name");
        this.rawBytes = bArr;
        this.rawFloats = fArr;
        this.dataType = i;
        this.dataFormat = i2;
        this.dims = iArr;
        this.fraction = i3;
        this.name = name;
        if (bArr != null) {
            i4 = 2;
        } else if (fArr != null) {
            i4 = 3;
        } else {
            throw new IllegalArgumentException("Tensor has no data!");
        }
        this.rawDataType = i4;
    }

    public /* synthetic */ PTYTensor(byte[] bArr, float[] fArr, int i, int i2, int[] iArr, int i3, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : bArr, (i4 & 2) == 0 ? fArr : null, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0 : i2, iArr, (i4 & 32) != 0 ? 0 : i3, str);
    }
}
