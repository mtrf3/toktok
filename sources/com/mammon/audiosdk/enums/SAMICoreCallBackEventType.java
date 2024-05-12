package com.mammon.audiosdk.enums;

import X.V0N;
import java.util.HashMap;

/* loaded from: classes9.dex */
public enum SAMICoreCallBackEventType {
    TTS_Started(0),
    TTS_GetResulted(1),
    TTS_Finished(2),
    TTS_Failed(3),
    TTS_WebSocketStateChanged(4),
    ASR_Started(5),
    ASR_GetResulted(6),
    ASR_Finished(7),
    ASR_Failed(8),
    ASR_WebSocketStateChanged(9),
    VC_Started(10),
    VC_GetResulted(11),
    VC_Finished(12),
    VC_Failed(13),
    VC_WebSocketStateChanged(14),
    VC_Player_Finished(15);

    public static final HashMap<Integer, SAMICoreCallBackEventType> intToEnumMap = new HashMap<>();
    public int value;

    static {
        for (SAMICoreCallBackEventType sAMICoreCallBackEventType : values()) {
            intToEnumMap.put(Integer.valueOf(sAMICoreCallBackEventType.getValue()), sAMICoreCallBackEventType);
        }
    }

    public int getValue() {
        return this.value;
    }

    public static SAMICoreCallBackEventType fromInt(int i) {
        return intToEnumMap.get(Integer.valueOf(i));
    }

    public static SAMICoreCallBackEventType valueOf(String str) {
        return (SAMICoreCallBackEventType) V0N.LJJJ(SAMICoreCallBackEventType.class, str);
    }

    SAMICoreCallBackEventType(int i) {
        this.value = i;
    }
}
