package com.bytedance.ies.effecteditor.swig;

import X.AnonymousClass073;
import X.V0N;

/* loaded from: classes3.dex */
public enum UIAnnotationAssetType {
    UIAnnotationAssetType_Unknown(0),
    UIAnnotationAssetType_Texture,
    UIAnnotationAssetType_Sequence,
    UIAnnotationAssetType_Video;

    public final int swigValue;

    /* loaded from: classes3.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static UIAnnotationAssetType swigToEnum(int i) {
        UIAnnotationAssetType[] uIAnnotationAssetTypeArr = (UIAnnotationAssetType[]) UIAnnotationAssetType.class.getEnumConstants();
        if (i < uIAnnotationAssetTypeArr.length && i >= 0) {
            UIAnnotationAssetType uIAnnotationAssetType = uIAnnotationAssetTypeArr[i];
            if (uIAnnotationAssetType.swigValue == i) {
                return uIAnnotationAssetType;
            }
        }
        for (UIAnnotationAssetType uIAnnotationAssetType2 : uIAnnotationAssetTypeArr) {
            if (uIAnnotationAssetType2.swigValue == i) {
                return uIAnnotationAssetType2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", UIAnnotationAssetType.class, " with value ", i));
    }

    public static UIAnnotationAssetType valueOf(String str) {
        return (UIAnnotationAssetType) V0N.LJJJ(UIAnnotationAssetType.class, str);
    }

    UIAnnotationAssetType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    UIAnnotationAssetType(UIAnnotationAssetType uIAnnotationAssetType) {
        int i = uIAnnotationAssetType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    UIAnnotationAssetType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
