package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class ShortTouchWidgetRecycleConfig {

    @InterfaceC65349Pkn("preview_widget")
    public boolean previewWidgetRecycle;

    @InterfaceC65349Pkn("view_widget")
    public boolean viewWidgetRecycle;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ShortTouchWidgetRecycleConfig() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.roomfunction.ShortTouchWidgetRecycleConfig.<init>():void");
    }

    public ShortTouchWidgetRecycleConfig(boolean z, boolean z2) {
        this.viewWidgetRecycle = z;
        this.previewWidgetRecycle = z2;
    }

    public /* synthetic */ ShortTouchWidgetRecycleConfig(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2);
    }
}
