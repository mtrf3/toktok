package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum SubtitleErrorCode {
    SUBTITLE_ERROR_CODE_UNKNOW(-1),
    SUBTITLE_ERROR_CODE_SUCCESS(0),
    SUBTITLE_ERROR_CODE_POST_PROCESS_ERROR(1),
    SUBTITLE_ERROR_CODE_ASR_CONNECTION_ERROR(2),
    SUBTITLE_ERROR_CODE_ASR_SERVICE_ERROR(3),
    SUBTITLE_ERROR_CODE_BEFORE_JOIN_ROOM(4),
    SUBTITLE_ERROR_CODE_ALREADY_ON(5),
    SUBTITLE_ERROR_CODE_UNSUPPORTED_LANGUAGE(6),
    SUBTITLE_ERROR_CODE_POST_PROCESS_TIMEOUT(7);

    public int value;

    public int value() {
        return this.value;
    }

    public static SubtitleErrorCode fromId(int i) {
        for (SubtitleErrorCode subtitleErrorCode : values()) {
            if (subtitleErrorCode.value() == i) {
                return subtitleErrorCode;
            }
        }
        return SUBTITLE_ERROR_CODE_UNKNOW;
    }

    public static SubtitleErrorCode valueOf(String str) {
        return (SubtitleErrorCode) V0N.LJJJ(SubtitleErrorCode.class, str);
    }

    SubtitleErrorCode(int i) {
        this.value = i;
    }
}
