package com.ss.android.ugc.aweme.search.performance.core.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class FirstVideoAutoPlayConfig extends F9E {

    @InterfaceC65349Pkn("enable_auto_play_logic_run_in_first_chunk")
    public final boolean enableAutoPlayLogicRunInFirstChunk;

    @InterfaceC65349Pkn("enable_auto_play_logic_run_once")
    public final boolean enableAutoPlayLogicRunOnce;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FirstVideoAutoPlayConfig() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.performance.core.config.FirstVideoAutoPlayConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableAutoPlayLogicRunOnce), Boolean.valueOf(this.enableAutoPlayLogicRunInFirstChunk)};
    }

    public FirstVideoAutoPlayConfig(boolean z, boolean z2) {
        this.enableAutoPlayLogicRunOnce = z;
        this.enableAutoPlayLogicRunInFirstChunk = z2;
    }

    public /* synthetic */ FirstVideoAutoPlayConfig(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
