package com.bytedance.ies.actionai.jni;

import X.AnonymousClass073;
import X.V0N;

/* loaded from: classes16.dex */
public enum ValueType {
    INT(0),
    FLOAT(1),
    BOOL(2),
    STRING(3),
    LIST(4),
    DICT(5);

    public final int swigValue;

    /* loaded from: classes16.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static ValueType swigToEnum(int i) {
        ValueType[] valueTypeArr = (ValueType[]) ValueType.class.getEnumConstants();
        if (i < valueTypeArr.length && i >= 0) {
            ValueType valueType = valueTypeArr[i];
            if (valueType.swigValue == i) {
                return valueType;
            }
        }
        for (ValueType valueType2 : valueTypeArr) {
            if (valueType2.swigValue == i) {
                return valueType2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", ValueType.class, " with value ", i));
    }

    public static ValueType valueOf(String str) {
        return (ValueType) V0N.LJJJ(ValueType.class, str);
    }

    ValueType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    ValueType(ValueType valueType) {
        int i = valueType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    ValueType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
