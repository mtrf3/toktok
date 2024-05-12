package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C47261Igj;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class MultiGuestThresholdConfig {

    @InterfaceC65349Pkn("max_coins")
    public int maxCoins;

    @InterfaceC65349Pkn("options")
    public List<Integer> options;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiGuestThresholdConfig() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public MultiGuestThresholdConfig(List<Integer> options, int i) {
        o.LJIIIZ(options, "options");
        this.options = options;
        this.maxCoins = i;
    }

    public /* synthetic */ MultiGuestThresholdConfig(List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C47261Igj.LJJIJIIJI(1, 5, 10, 30, 50) : list, (i2 & 2) != 0 ? 39999 : i);
    }
}
