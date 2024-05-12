package com.ss.android.ugc.aweme.compliance.protection.timelock.api;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class NightReminderResponse extends BaseResponse {

    @InterfaceC65349Pkn("delay_count")
    public final int delayCount;

    @InterfaceC65349Pkn("next_timestamp")
    public final int nextTimeStamps;

    @InterfaceC65349Pkn("show_delay")
    public final boolean showDelay;

    @InterfaceC65349Pkn("show_reminder")
    public final boolean showReminder;

    /* JADX WARN: Multi-variable type inference failed */
    public NightReminderResponse() {
        this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NightReminderResponse) {
            return C78966Uyw.LJIIIZ(((NightReminderResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.nextTimeStamps), Boolean.valueOf(this.showDelay), Boolean.valueOf(this.showReminder), Integer.valueOf(this.delayCount)};
    }

    public final int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("NightReminderResponse:%s,%s,%s,%s", getObjects());
    }

    public NightReminderResponse(int i, boolean z, boolean z2, int i2) {
        this.nextTimeStamps = i;
        this.showDelay = z;
        this.showReminder = z2;
        this.delayCount = i2;
    }

    public /* synthetic */ NightReminderResponse(int i, boolean z, boolean z2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? false : z2, (i3 & 8) != 0 ? 0 : i2);
    }
}
