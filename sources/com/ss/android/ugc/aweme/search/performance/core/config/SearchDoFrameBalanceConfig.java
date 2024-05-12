package com.ss.android.ugc.aweme.search.performance.core.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.WM7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchDoFrameBalanceConfig extends F9E {

    @InterfaceC65349Pkn("max_threshold")
    public final int maxThreshold;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final String scene;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchDoFrameBalanceConfig() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.maxThreshold), this.scene};
    }

    public SearchDoFrameBalanceConfig(int i, String scene) {
        o.LJIIIZ(scene, "scene");
        this.maxThreshold = i;
        this.scene = scene;
    }

    public /* synthetic */ SearchDoFrameBalanceConfig(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
    }
}
