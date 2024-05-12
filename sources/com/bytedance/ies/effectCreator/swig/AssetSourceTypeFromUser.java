package com.bytedance.ies.effectcreator.swig;

import X.V0N;
import X.X1D;

/* loaded from: classes34.dex */
public enum AssetSourceTypeFromUser {
    AssetSourceTypeFromUser_Unknow(0),
    AssetSourceTypeFromUser_Album,
    AssetSourceTypeFromUser_Text,
    AssetSourceTypeFromUser_Draw,
    AssetSourceTypeFromUser_Camera;

    public final int swigValue;

    /* loaded from: classes34.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static AssetSourceTypeFromUser swigToEnum(int i) {
        AssetSourceTypeFromUser[] assetSourceTypeFromUserArr = (AssetSourceTypeFromUser[]) AssetSourceTypeFromUser.class.getEnumConstants();
        if (i < assetSourceTypeFromUserArr.length && i >= 0) {
            AssetSourceTypeFromUser assetSourceTypeFromUser = assetSourceTypeFromUserArr[i];
            if (assetSourceTypeFromUser.swigValue == i) {
                return assetSourceTypeFromUser;
            }
        }
        for (AssetSourceTypeFromUser assetSourceTypeFromUser2 : assetSourceTypeFromUserArr) {
            if (assetSourceTypeFromUser2.swigValue == i) {
                return assetSourceTypeFromUser2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No enum ");
        LIZ.append(AssetSourceTypeFromUser.class);
        LIZ.append(" with value ");
        LIZ.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static AssetSourceTypeFromUser valueOf(String str) {
        return (AssetSourceTypeFromUser) V0N.LJJJ(AssetSourceTypeFromUser.class, str);
    }

    AssetSourceTypeFromUser() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    AssetSourceTypeFromUser(AssetSourceTypeFromUser assetSourceTypeFromUser) {
        int i = assetSourceTypeFromUser.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    AssetSourceTypeFromUser(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
