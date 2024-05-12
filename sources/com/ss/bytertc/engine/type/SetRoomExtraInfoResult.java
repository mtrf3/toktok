package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum SetRoomExtraInfoResult {
    SUCCESS(0),
    NOT_JOIN_ROOM(-1),
    KEY_IS_NULL(-2),
    VALUE_IS_NULL(-3),
    UNKNOW(-99),
    KEY_IS_EMPTY(-400),
    TOO_OFTEN(-406),
    SILENT_USER(-412),
    KEY_TOO_LONG(-413),
    VALUE_TOO_LONG(-414),
    SERVER_ERROR(-500);

    public final int value;

    public int value() {
        return this.value;
    }

    public static SetRoomExtraInfoResult fromId(int i) {
        for (SetRoomExtraInfoResult setRoomExtraInfoResult : values()) {
            if (setRoomExtraInfoResult.value() == i) {
                return setRoomExtraInfoResult;
            }
        }
        return UNKNOW;
    }

    public static SetRoomExtraInfoResult valueOf(String str) {
        return (SetRoomExtraInfoResult) V0N.LJJJ(SetRoomExtraInfoResult.class, str);
    }

    SetRoomExtraInfoResult(int i) {
        this.value = i;
    }
}
