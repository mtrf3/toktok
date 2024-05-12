package com.mammon.audiosdk.enums;

import X.V0N;

/* loaded from: classes16.dex */
public enum SAMICoreVopSpeakerInfoCommand {
    SIGN_AGREEMENT(0),
    START_RECORD_TASK(1),
    START_BUILD_TASK(2),
    SET_PUBLIC(3),
    SET_PRIVATE(4),
    DELETE(5);

    public int value;

    public int getValue() {
        return this.value;
    }

    public static SAMICoreVopSpeakerInfoCommand valueOf(String str) {
        return (SAMICoreVopSpeakerInfoCommand) V0N.LJJJ(SAMICoreVopSpeakerInfoCommand.class, str);
    }

    SAMICoreVopSpeakerInfoCommand(int i) {
        this.value = i;
    }
}
