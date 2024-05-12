package com.ss.android.ugc.aweme.ecommercebase.ab;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class EcomPerfMonitorSwitchConfig extends F9E {

    @InterfaceC65349Pkn("draw_listener")
    public final boolean drawListener;

    @InterfaceC65349Pkn("start_click_time")
    public final boolean startClickTime;

    /* renamed from: switch, reason: not valid java name */
    @InterfaceC65349Pkn("switch")
    public final boolean f25switch;

    @InterfaceC65349Pkn("thread_free_check")
    public final boolean threadFreeCheck;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EcomPerfMonitorSwitchConfig() {
        /*
            r7 = this;
            r1 = 0
            r5 = 15
            r6 = 0
            r0 = r7
            r2 = r1
            r3 = r1
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercebase.ab.EcomPerfMonitorSwitchConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.f25switch), Boolean.valueOf(this.threadFreeCheck), Boolean.valueOf(this.drawListener), Boolean.valueOf(this.startClickTime)};
    }

    public EcomPerfMonitorSwitchConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f25switch = z;
        this.threadFreeCheck = z2;
        this.drawListener = z3;
        this.startClickTime = z4;
    }

    public /* synthetic */ EcomPerfMonitorSwitchConfig(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4);
    }
}
