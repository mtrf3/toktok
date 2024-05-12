package com.bytedance.android.livesdk.livesetting.gift;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class MsgEnqueueConfig {
    public static final transient MsgEnqueueConfig LIZ = new MsgEnqueueConfig("time");

    @InterfaceC65349Pkn("sort_type")
    public String sortType;

    /* JADX WARN: Multi-variable type inference failed */
    public MsgEnqueueConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public MsgEnqueueConfig(String sortType) {
        o.LJIIIZ(sortType, "sortType");
        this.sortType = sortType;
    }

    public /* synthetic */ MsgEnqueueConfig(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
