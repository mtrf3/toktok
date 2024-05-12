package com.ss.android.ugc.aweme.live.notification.repository;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class NudgeInfo extends F9E {

    @InterfaceC65349Pkn("can_nudge")
    public boolean canNudge;

    @InterfaceC65349Pkn("show_nudge")
    public boolean showNudge;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NudgeInfo() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.notification.repository.NudgeInfo.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.showNudge), Boolean.valueOf(this.canNudge)};
    }

    public NudgeInfo(boolean z, boolean z2) {
        this.showNudge = z;
        this.canNudge = z2;
    }

    public /* synthetic */ NudgeInfo(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
