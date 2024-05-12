package com.bytedance.pumbaa.hybrid.base;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.InterfaceC65784Pro;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class NavigationConfig extends F9E {
    public InterfaceC65784Pro<Boolean> LJLIL;

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    @InterfaceC65349Pkn("enable_rasp")
    public final boolean enableRasp;

    @InterfaceC65349Pkn("enable_rasp_monitor")
    public final boolean enableRaspMonitor;

    @InterfaceC65349Pkn("enable_router_record")
    public final boolean enableRouterRecord;

    @InterfaceC65349Pkn("enable_url_record")
    public final boolean enableUrlRecord;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NavigationConfig() {
        /*
            r9 = this;
            r1 = 0
            r6 = 0
            r7 = 63
            r0 = r9
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r8 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pumbaa.hybrid.base.NavigationConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable), Boolean.valueOf(this.enableRasp), Boolean.valueOf(this.enableRaspMonitor), Boolean.valueOf(this.enableRouterRecord), Boolean.valueOf(this.enableUrlRecord), this.LJLIL};
    }

    public NavigationConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        this.enable = z;
        this.enableRasp = z2;
        this.enableRaspMonitor = z3;
        this.enableRouterRecord = z4;
        this.enableUrlRecord = z5;
        this.LJLIL = interfaceC65784Pro;
    }

    public /* synthetic */ NavigationConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, InterfaceC65784Pro interfaceC65784Pro, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) == 0 ? z5 : false, (i & 32) != 0 ? null : interfaceC65784Pro);
    }
}
