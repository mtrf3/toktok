package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum EchoTestErrorCode {
    ECHO_TEST_RESULT_SUCCESS(0),
    ECHO_TEST_RESULT_TIMEOUT(1),
    ECHO_TEST_RESULT_SHORT_INTERVAL(2),
    ECHO_TEST_RESULT_AUDIO_DEVICE_ERROR(3),
    ECHO_TEST_RESULT_VIDEO_DEVICE_ERROR(4),
    ECHO_TEST_RESULT_AUDIO_RECEIVE_ERROR(5),
    ECHO_TEST_RESULT_VIDEO_RECEIVE_ERROR(6),
    ECHO_TEST_RESULT_INTERNAL_ERROR(7);

    public int value;

    public int value() {
        return this.value;
    }

    public static EchoTestErrorCode fromId(int i) {
        for (EchoTestErrorCode echoTestErrorCode : values()) {
            if (echoTestErrorCode.value() == i) {
                return echoTestErrorCode;
            }
        }
        return ECHO_TEST_RESULT_SUCCESS;
    }

    public static EchoTestErrorCode valueOf(String str) {
        return (EchoTestErrorCode) V0N.LJJJ(EchoTestErrorCode.class, str);
    }

    EchoTestErrorCode(int i) {
        this.value = i;
    }
}
