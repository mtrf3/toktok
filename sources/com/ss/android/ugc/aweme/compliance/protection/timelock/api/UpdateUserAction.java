package com.ss.android.ugc.aweme.compliance.protection.timelock.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.compliance.protection.common.model.UserNightScreenTimeSettings;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class UpdateUserAction {

    @InterfaceC65349Pkn("user_action")
    public final int userAction;

    @InterfaceC65349Pkn("sleep_time_settings")
    public final UserNightScreenTimeSettings userNightScreenTimeSettings;

    @InterfaceC65349Pkn("user_real_timestamp")
    public final int userTimeStamp;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateUserAction)) {
            return false;
        }
        UpdateUserAction updateUserAction = (UpdateUserAction) obj;
        return this.userAction == updateUserAction.userAction && o.LJ(this.userNightScreenTimeSettings, updateUserAction.userNightScreenTimeSettings) && this.userTimeStamp == updateUserAction.userTimeStamp;
    }

    public final int hashCode() {
        int i = this.userAction * 31;
        UserNightScreenTimeSettings userNightScreenTimeSettings = this.userNightScreenTimeSettings;
        return ((i + (userNightScreenTimeSettings == null ? 0 : userNightScreenTimeSettings.hashCode())) * 31) + this.userTimeStamp;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpdateUserAction(userAction=");
        LIZ.append(this.userAction);
        LIZ.append(", userNightScreenTimeSettings=");
        LIZ.append(this.userNightScreenTimeSettings);
        LIZ.append(", userTimeStamp=");
        return b0.LIZJ(LIZ, this.userTimeStamp, ')', LIZ);
    }

    public UpdateUserAction(int i, UserNightScreenTimeSettings userNightScreenTimeSettings, int i2) {
        this.userAction = i;
        this.userNightScreenTimeSettings = userNightScreenTimeSettings;
        this.userTimeStamp = i2;
    }
}
