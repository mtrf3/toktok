package com.bytedance.android.livesdk.livesetting.gift;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class ReceiveMsgConfig {
    public static final transient ReceiveMsgConfig LIZ = new ReceiveMsgConfig(0, 1, null);

    @InterfaceC65349Pkn("delay_enqueue_milliseconds")
    public int delayEnqueueSec;

    public ReceiveMsgConfig() {
        this(0, 1, null);
    }

    public ReceiveMsgConfig(int i) {
        this.delayEnqueueSec = i;
    }

    public /* synthetic */ ReceiveMsgConfig(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
