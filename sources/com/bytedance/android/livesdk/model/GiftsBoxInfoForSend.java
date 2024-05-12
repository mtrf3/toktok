package com.bytedance.android.livesdk.model;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GiftsBoxInfoForSend {

    @InterfaceC65349Pkn("gifts")
    public List<GiftInfoInBox> gifts;

    /* JADX WARN: Multi-variable type inference failed */
    public GiftsBoxInfoForSend() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public GiftsBoxInfoForSend(List<GiftInfoInBox> gifts) {
        o.LJIIIZ(gifts, "gifts");
        this.gifts = gifts;
    }

    public /* synthetic */ GiftsBoxInfoForSend(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
