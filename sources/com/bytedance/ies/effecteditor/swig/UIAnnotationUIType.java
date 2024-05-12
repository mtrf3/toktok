package com.bytedance.ies.effecteditor.swig;

import X.AnonymousClass073;
import X.V0N;

/* loaded from: classes16.dex */
public enum UIAnnotationUIType {
    UIAnnotationUIType_Unknown(0),
    UIAnnotationUIType_Asset,
    UIAnnotationUIType_Slider,
    UIAnnotationUIType_TextInput,
    UIAnnotationUIType_OptionList,
    UIAnnotationUIType_Cache,
    UIAnnotationUIType_AssetTexture,
    UIAnnotationUIType_Transform2D,
    UIAnnotationUIType_ScriptTransform2D,
    UIAnnotationUIType_AnchorAlignment,
    UIAnnotationUIType_Color,
    UIAnnotationUIType_FacePoints,
    UIAnnotationUIType_Float,
    UIAnnotationUIType_Transform3D,
    UIAnnotationUIType_Bool,
    UIAnnotationUIType_Pulse;

    public final int swigValue;

    /* loaded from: classes16.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static UIAnnotationUIType swigToEnum(int i) {
        UIAnnotationUIType[] uIAnnotationUITypeArr = (UIAnnotationUIType[]) UIAnnotationUIType.class.getEnumConstants();
        if (i < uIAnnotationUITypeArr.length && i >= 0) {
            UIAnnotationUIType uIAnnotationUIType = uIAnnotationUITypeArr[i];
            if (uIAnnotationUIType.swigValue == i) {
                return uIAnnotationUIType;
            }
        }
        for (UIAnnotationUIType uIAnnotationUIType2 : uIAnnotationUITypeArr) {
            if (uIAnnotationUIType2.swigValue == i) {
                return uIAnnotationUIType2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", UIAnnotationUIType.class, " with value ", i));
    }

    public static UIAnnotationUIType valueOf(String str) {
        return (UIAnnotationUIType) V0N.LJJJ(UIAnnotationUIType.class, str);
    }

    UIAnnotationUIType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    UIAnnotationUIType(UIAnnotationUIType uIAnnotationUIType) {
        int i = uIAnnotationUIType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    UIAnnotationUIType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
