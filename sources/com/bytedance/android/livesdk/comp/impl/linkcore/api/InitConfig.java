package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class InitConfig extends F9E {

    @InterfaceC65349Pkn("pos_config")
    public PositionConfig positionConfig;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.positionConfig};
    }

    public InitConfig(PositionConfig positionConfig) {
        o.LJIIIZ(positionConfig, "positionConfig");
        this.positionConfig = positionConfig;
    }
}
