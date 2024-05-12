package com.ss.android.ugc.aweme.ad.experiment;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class FixVideoProgressSettingModel {

    @InterfaceC65349Pkn("enable_auto_fix_player_event")
    public final boolean enableFixPlayerEvent;

    @InterfaceC65349Pkn("reuse_loop_for_play_seconds")
    public final boolean enableReuseLoopForPlaySeconds;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FixVideoProgressSettingModel() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.experiment.FixVideoProgressSettingModel.<init>():void");
    }

    public FixVideoProgressSettingModel(boolean z, boolean z2) {
        this.enableReuseLoopForPlaySeconds = z;
        this.enableFixPlayerEvent = z2;
    }

    public /* synthetic */ FixVideoProgressSettingModel(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
