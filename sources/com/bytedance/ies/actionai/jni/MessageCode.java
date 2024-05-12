package com.bytedance.ies.actionai.jni;

import X.AnonymousClass073;
import X.V0N;

/* loaded from: classes15.dex */
public enum MessageCode {
    SUCCESS(0),
    FAIL(1);

    public final int swigValue;

    /* loaded from: classes15.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static MessageCode swigToEnum(int i) {
        MessageCode[] messageCodeArr = (MessageCode[]) MessageCode.class.getEnumConstants();
        if (i < messageCodeArr.length && i >= 0) {
            MessageCode messageCode = messageCodeArr[i];
            if (messageCode.swigValue == i) {
                return messageCode;
            }
        }
        for (MessageCode messageCode2 : messageCodeArr) {
            if (messageCode2.swigValue == i) {
                return messageCode2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", MessageCode.class, " with value ", i));
    }

    public static MessageCode valueOf(String str) {
        return (MessageCode) V0N.LJJJ(MessageCode.class, str);
    }

    MessageCode() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    MessageCode(MessageCode messageCode) {
        int i = messageCode.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    MessageCode(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
