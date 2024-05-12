package com.bytedance.android.livesdk.livesetting.gift;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class TrayShowConfig {
    public static final transient TrayShowConfig LIZ = new TrayShowConfig(null, 1, null);

    @InterfaceC65349Pkn("animation_duration")
    public List<Integer> animationDuration;

    public TrayShowConfig() {
        this(null, 1, null);
    }

    public TrayShowConfig(List<Integer> animationDuration) {
        o.LJIIIZ(animationDuration, "animationDuration");
        this.animationDuration = animationDuration;
    }

    public TrayShowConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list);
    }
}
