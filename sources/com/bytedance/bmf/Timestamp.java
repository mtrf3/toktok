package com.bytedance.bmf;

import X.V0N;

/* loaded from: classes34.dex */
public enum Timestamp {
    UNSET(-1),
    BMF_PAUSE(9223372036854775802L),
    EOF(9223372036854775804L),
    EOS(9223372036854775805L),
    INF_SRC(9223372036854775806L),
    DONE(Long.MAX_VALUE);

    public long value;

    public long getValue() {
        return this.value;
    }

    public static Timestamp valueOf(String str) {
        return (Timestamp) V0N.LJJJ(Timestamp.class, str);
    }

    Timestamp(long j) {
        this.value = j;
    }
}
