package com.bytedance.android.live.liveinteract.matchx.models;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class XPanelDetail extends F9E {

    @InterfaceC65349Pkn("draw_animation_finish")
    public final int finish;

    public XPanelDetail() {
        this(0, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.finish)};
    }

    public XPanelDetail(int i) {
        this.finish = i;
    }

    public /* synthetic */ XPanelDetail(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
