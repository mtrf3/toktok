package com.ss.android.ugc.aweme.legoImp.task.pumbaa.settings;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public final class BPEACacheSwitch extends F9E {

    @InterfaceC65349Pkn("enableCarrierCache")
    public final boolean enableCarrierCache;

    @InterfaceC65349Pkn("enableGAIDCache")
    public final boolean enableGAIDCache;

    @InterfaceC65349Pkn("enableLocaleCache")
    public final boolean enableLocaleCache;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BPEACacheSwitch() {
        /*
            r6 = this;
            r1 = 0
            r4 = 7
            r5 = 0
            r0 = r6
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.pumbaa.settings.BPEACacheSwitch.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableCarrierCache), Boolean.valueOf(this.enableGAIDCache), Boolean.valueOf(this.enableLocaleCache)};
    }

    public BPEACacheSwitch(boolean z, boolean z2, boolean z3) {
        this.enableCarrierCache = z;
        this.enableGAIDCache = z2;
        this.enableLocaleCache = z3;
    }

    public /* synthetic */ BPEACacheSwitch(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3);
    }
}
