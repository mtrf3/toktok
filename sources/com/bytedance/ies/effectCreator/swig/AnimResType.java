package com.bytedance.ies.effectcreator.swig;

import X.V0N;
import X.X1D;

/* loaded from: classes34.dex */
public enum AnimResType {
    AnimResType_Images(0),
    AnimResType_Seq,
    AnimResType_Unknown;

    public final int swigValue;

    /* loaded from: classes34.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static AnimResType swigToEnum(int i) {
        AnimResType[] animResTypeArr = (AnimResType[]) AnimResType.class.getEnumConstants();
        if (i < animResTypeArr.length && i >= 0) {
            AnimResType animResType = animResTypeArr[i];
            if (animResType.swigValue == i) {
                return animResType;
            }
        }
        for (AnimResType animResType2 : animResTypeArr) {
            if (animResType2.swigValue == i) {
                return animResType2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No enum ");
        LIZ.append(AnimResType.class);
        LIZ.append(" with value ");
        LIZ.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static AnimResType valueOf(String str) {
        return (AnimResType) V0N.LJJJ(AnimResType.class, str);
    }

    AnimResType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    AnimResType(AnimResType animResType) {
        int i = animResType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    AnimResType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
