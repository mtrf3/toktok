package com.bytedance.hmp;

import X.V0N;

/* loaded from: classes34.dex */
public enum ChannelFormat {
    kNCHW(0),
    kNHWC(1);

    public final int value;

    public int getValue() {
        return this.value;
    }

    public static ChannelFormat valueOf(String str) {
        return (ChannelFormat) V0N.LJJJ(ChannelFormat.class, str);
    }

    ChannelFormat(int i) {
        this.value = i;
    }
}
