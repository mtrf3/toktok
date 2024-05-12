package com.bytedance.ies.nle.editor_jni;

import X.AnonymousClass073;
import X.C84291X6h;
import X.V0N;

/* loaded from: classes16.dex */
public enum KeyframeType {
    AudioKeyframe(0),
    ChromaKeyframe(1),
    FilterKeyframe(2),
    MaskKeyframe(3),
    StickerKeyframe(4),
    TextKeyframe(5),
    VideoKeyframe(6);

    public final int swigValue;

    public final int swigValue() {
        return this.swigValue;
    }

    public static KeyframeType swigToEnum(int i) {
        KeyframeType[] keyframeTypeArr = (KeyframeType[]) KeyframeType.class.getEnumConstants();
        if (i < keyframeTypeArr.length && i >= 0) {
            KeyframeType keyframeType = keyframeTypeArr[i];
            if (keyframeType.swigValue == i) {
                return keyframeType;
            }
        }
        for (KeyframeType keyframeType2 : keyframeTypeArr) {
            if (keyframeType2.swigValue == i) {
                return keyframeType2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", KeyframeType.class, " with value ", i));
    }

    public static KeyframeType valueOf(String str) {
        return (KeyframeType) V0N.LJJJ(KeyframeType.class, str);
    }

    KeyframeType() {
        int i = C84291X6h.LIZ;
        C84291X6h.LIZ = i + 1;
        this.swigValue = i;
    }

    KeyframeType(KeyframeType keyframeType) {
        int i = keyframeType.swigValue;
        this.swigValue = i;
        C84291X6h.LIZ = i + 1;
    }

    KeyframeType(int i) {
        this.swigValue = i;
        C84291X6h.LIZ = i + 1;
    }
}
