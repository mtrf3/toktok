package com.bytedance.android.livesdk.livesetting.game;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BannerInfo extends F9E {

    @InterfaceC65349Pkn("compatible")
    public final boolean compatible;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("priority")
    public final int priority;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.name, Boolean.valueOf(this.compatible), Integer.valueOf(this.priority)};
    }

    public BannerInfo(String name, boolean z, int i) {
        o.LJIIIZ(name, "name");
        this.name = name;
        this.compatible = z;
        this.priority = i;
    }
}
