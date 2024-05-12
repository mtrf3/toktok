package com.bytedance.ies.effectcreator.swig;

import X.V0N;
import X.X1D;

/* loaded from: classes34.dex */
public enum AssetSourceType {
    AssetSourceType_Unknown(0),
    AssetSourceType_FromUser,
    AssetSourceType_FromInternalLibrary,
    AssetSourceType_FromExternalLibrary;

    public final int swigValue;

    /* loaded from: classes34.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static AssetSourceType swigToEnum(int i) {
        AssetSourceType[] assetSourceTypeArr = (AssetSourceType[]) AssetSourceType.class.getEnumConstants();
        if (i < assetSourceTypeArr.length && i >= 0) {
            AssetSourceType assetSourceType = assetSourceTypeArr[i];
            if (assetSourceType.swigValue == i) {
                return assetSourceType;
            }
        }
        for (AssetSourceType assetSourceType2 : assetSourceTypeArr) {
            if (assetSourceType2.swigValue == i) {
                return assetSourceType2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No enum ");
        LIZ.append(AssetSourceType.class);
        LIZ.append(" with value ");
        LIZ.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static AssetSourceType valueOf(String str) {
        return (AssetSourceType) V0N.LJJJ(AssetSourceType.class, str);
    }

    AssetSourceType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    AssetSourceType(AssetSourceType assetSourceType) {
        int i = assetSourceType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    AssetSourceType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
