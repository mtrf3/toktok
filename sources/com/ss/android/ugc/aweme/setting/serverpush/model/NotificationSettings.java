package com.ss.android.ugc.aweme.setting.serverpush.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NotificationSettings extends BaseResponse {

    @InterfaceC65349Pkn("notification_settings_info")
    public final NotificationSettingsInfo notificationSettingsInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NotificationSettings) && o.LJ(this.notificationSettingsInfo, ((NotificationSettings) obj).notificationSettingsInfo);
    }

    public final int hashCode() {
        NotificationSettingsInfo notificationSettingsInfo = this.notificationSettingsInfo;
        if (notificationSettingsInfo == null) {
            return 0;
        }
        return notificationSettingsInfo.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NotificationSettings(notificationSettingsInfo=");
        LIZ.append(this.notificationSettingsInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public NotificationSettings(NotificationSettingsInfo notificationSettingsInfo) {
        this.notificationSettingsInfo = notificationSettingsInfo;
    }
}
