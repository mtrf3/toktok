package com.ss.android.ugc.aweme.inbox;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class InboxCollapseMeta extends F9E {

    @InterfaceC65349Pkn("limit_days")
    public final int limitDays;

    @InterfaceC65349Pkn("max_limit_times")
    public final int limitTimes;

    @InterfaceC65349Pkn("trigger_times")
    public final int triggerTimes;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InboxCollapseMeta() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.InboxCollapseMeta.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.triggerTimes), Integer.valueOf(this.limitDays), Integer.valueOf(this.limitTimes)};
    }

    public InboxCollapseMeta(int i, int i2, int i3) {
        this.triggerTimes = i;
        this.limitDays = i2;
        this.limitTimes = i3;
    }

    public /* synthetic */ InboxCollapseMeta(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 3 : i, (i4 & 2) != 0 ? 14 : i2, (i4 & 4) != 0 ? 3 : i3);
    }
}
