package com.bytedance.ies.effectcreator.swig;

import X.V0N;
import X.X1D;

/* loaded from: classes34.dex */
public enum AssetType {
    AssetType_RawAsset(0),
    AssetType_ImageTexture,
    AssetType_AnimSeq,
    AssetType_Gif;

    public final int swigValue;

    /* loaded from: classes34.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static AssetType swigToEnum(int i) {
        AssetType[] assetTypeArr = (AssetType[]) AssetType.class.getEnumConstants();
        if (i < assetTypeArr.length && i >= 0) {
            AssetType assetType = assetTypeArr[i];
            if (assetType.swigValue == i) {
                return assetType;
            }
        }
        for (AssetType assetType2 : assetTypeArr) {
            if (assetType2.swigValue == i) {
                return assetType2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No enum ");
        LIZ.append(AssetType.class);
        LIZ.append(" with value ");
        LIZ.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static AssetType valueOf(String str) {
        return (AssetType) V0N.LJJJ(AssetType.class, str);
    }

    AssetType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    AssetType(AssetType assetType) {
        int i = assetType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    AssetType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
