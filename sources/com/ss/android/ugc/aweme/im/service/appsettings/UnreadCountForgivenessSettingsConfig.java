package com.ss.android.ugc.aweme.im.service.appsettings;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class UnreadCountForgivenessSettingsConfig extends F9E {

    @InterfaceC65349Pkn("unread_message_forgiveness_expired_day")
    public final int expiredDay;

    @InterfaceC65349Pkn("update_session_timestamp_every_refresh")
    public final boolean shouldUpdateTimestampAfterRefresh;

    /* JADX WARN: Multi-variable type inference failed */
    public UnreadCountForgivenessSettingsConfig() {
        this(0, 0 == true ? 1 : 0, 3, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.expiredDay), Boolean.valueOf(this.shouldUpdateTimestampAfterRefresh)};
    }

    public UnreadCountForgivenessSettingsConfig(int i, boolean z) {
        this.expiredDay = i;
        this.shouldUpdateTimestampAfterRefresh = z;
    }

    public /* synthetic */ UnreadCountForgivenessSettingsConfig(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 14 : i, (i2 & 2) != 0 ? true : z);
    }
}
