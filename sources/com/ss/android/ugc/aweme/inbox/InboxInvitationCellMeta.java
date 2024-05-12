package com.ss.android.ugc.aweme.inbox;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class InboxInvitationCellMeta extends F9E {

    @InterfaceC65349Pkn("hide_days")
    public final int hideDays;

    @InterfaceC65349Pkn("max_delete_times")
    public final int maxDeleteTimes;

    @InterfaceC65349Pkn("max_no_action_times")
    public final int maxNoActionTimes;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InboxInvitationCellMeta() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.InboxInvitationCellMeta.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.hideDays), Integer.valueOf(this.maxDeleteTimes), Integer.valueOf(this.maxNoActionTimes)};
    }

    public InboxInvitationCellMeta(int i, int i2, int i3) {
        this.hideDays = i;
        this.maxDeleteTimes = i2;
        this.maxNoActionTimes = i3;
    }

    public /* synthetic */ InboxInvitationCellMeta(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 14 : i, (i4 & 2) != 0 ? 3 : i2, (i4 & 4) != 0 ? 3 : i3);
    }
}
