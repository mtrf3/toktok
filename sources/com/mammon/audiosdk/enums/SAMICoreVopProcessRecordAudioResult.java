package com.mammon.audiosdk.enums;

import X.V0N;

/* loaded from: classes7.dex */
public enum SAMICoreVopProcessRecordAudioResult {
    INTERNAL_ERROR(0),
    NETWORK_ERROR(1),
    PASSED(2),
    SNR_FAILED(3),
    WER_FAILED(4),
    SKIPPED(5);

    public int value;

    public int getValue() {
        return this.value;
    }

    public static SAMICoreVopProcessRecordAudioResult valueOf(String str) {
        return (SAMICoreVopProcessRecordAudioResult) V0N.LJJJ(SAMICoreVopProcessRecordAudioResult.class, str);
    }

    SAMICoreVopProcessRecordAudioResult(int i) {
        this.value = i;
    }
}
