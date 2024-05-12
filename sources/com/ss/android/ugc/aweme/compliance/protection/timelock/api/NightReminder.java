package com.ss.android.ugc.aweme.compliance.protection.timelock.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.compliance.protection.common.model.UserNightScreenTimeSettings;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NightReminder {

    @InterfaceC65349Pkn("sleep_time_settings")
    public final UserNightScreenTimeSettings userNightScreenTimeSettings;

    @InterfaceC65349Pkn("user_real_timestamp")
    public final int userTimeStamp;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NightReminder)) {
            return false;
        }
        NightReminder nightReminder = (NightReminder) obj;
        return o.LJ(this.userNightScreenTimeSettings, nightReminder.userNightScreenTimeSettings) && this.userTimeStamp == nightReminder.userTimeStamp;
    }

    public final int hashCode() {
        UserNightScreenTimeSettings userNightScreenTimeSettings = this.userNightScreenTimeSettings;
        return ((userNightScreenTimeSettings == null ? 0 : userNightScreenTimeSettings.hashCode()) * 31) + this.userTimeStamp;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NightReminder(userNightScreenTimeSettings=");
        LIZ.append(this.userNightScreenTimeSettings);
        LIZ.append(", userTimeStamp=");
        return b0.LIZJ(LIZ, this.userTimeStamp, ')', LIZ);
    }

    public NightReminder(UserNightScreenTimeSettings userNightScreenTimeSettings, int i) {
        this.userNightScreenTimeSettings = userNightScreenTimeSettings;
        this.userTimeStamp = i;
    }
}
