package com.bytedance.android.livesdk.livesetting.gift;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class TrayDismissConfig {
    public static final transient TrayDismissConfig LIZ = new TrayDismissConfig(null, 1, null);

    @InterfaceC65349Pkn("animation_duration")
    public List<Integer> _animationDuration;

    public TrayDismissConfig() {
        this(null, 1, null);
    }

    public TrayDismissConfig(List<Integer> _animationDuration) {
        o.LJIIIZ(_animationDuration, "_animationDuration");
        this._animationDuration = _animationDuration;
    }

    public TrayDismissConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list);
    }
}
