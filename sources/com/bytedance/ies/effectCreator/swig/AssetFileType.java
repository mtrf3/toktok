package com.bytedance.ies.effectcreator.swig;

import X.V0N;
import X.X1D;

/* loaded from: classes34.dex */
public enum AssetFileType {
    AssetFileType_Empty(0),
    AssetFileType_File,
    AssetFileType_Directory;

    public final int swigValue;

    /* loaded from: classes34.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static AssetFileType swigToEnum(int i) {
        AssetFileType[] assetFileTypeArr = (AssetFileType[]) AssetFileType.class.getEnumConstants();
        if (i < assetFileTypeArr.length && i >= 0) {
            AssetFileType assetFileType = assetFileTypeArr[i];
            if (assetFileType.swigValue == i) {
                return assetFileType;
            }
        }
        for (AssetFileType assetFileType2 : assetFileTypeArr) {
            if (assetFileType2.swigValue == i) {
                return assetFileType2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No enum ");
        LIZ.append(AssetFileType.class);
        LIZ.append(" with value ");
        LIZ.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static AssetFileType valueOf(String str) {
        return (AssetFileType) V0N.LJJJ(AssetFileType.class, str);
    }

    AssetFileType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    AssetFileType(AssetFileType assetFileType) {
        int i = assetFileType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    AssetFileType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
