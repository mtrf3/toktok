package com.ss.android.ugc.aweme.compliance.protection.common.model;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class UserNightScreenTimeSettings implements Serializable {

    @InterfaceC65349Pkn("sleep_reminder_enabled")
    public final Boolean sleepReminderEnabled;

    @InterfaceC65349Pkn("sleep_time_end_hour")
    public final Integer sleepTimeEndHour;

    @InterfaceC65349Pkn("sleep_time_end_minute")
    public final Integer sleepTimeEndMinute;

    @InterfaceC65349Pkn("sleep_time_start_hour")
    public final Integer sleepTimeStartHour;

    @InterfaceC65349Pkn("sleep_time_start_minute")
    public final Integer sleepTimeStartMinute;

    /* JADX WARN: Multi-variable type inference failed */
    public UserNightScreenTimeSettings() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ UserNightScreenTimeSettings copy$default(UserNightScreenTimeSettings userNightScreenTimeSettings, Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            num = userNightScreenTimeSettings.sleepTimeStartHour;
        }
        if ((i & 2) != 0) {
            num2 = userNightScreenTimeSettings.sleepTimeStartMinute;
        }
        if ((i & 4) != 0) {
            num3 = userNightScreenTimeSettings.sleepTimeEndHour;
        }
        if ((i & 8) != 0) {
            num4 = userNightScreenTimeSettings.sleepTimeEndMinute;
        }
        if ((i & 16) != 0) {
            bool = userNightScreenTimeSettings.sleepReminderEnabled;
        }
        return userNightScreenTimeSettings.copy(num, num2, num3, num4, bool);
    }

    public final UserNightScreenTimeSettings copy(Integer num, Integer num2, Integer num3, Integer num4, Boolean bool) {
        return new UserNightScreenTimeSettings(num, num2, num3, num4, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserNightScreenTimeSettings)) {
            return false;
        }
        UserNightScreenTimeSettings userNightScreenTimeSettings = (UserNightScreenTimeSettings) obj;
        return o.LJ(this.sleepTimeStartHour, userNightScreenTimeSettings.sleepTimeStartHour) && o.LJ(this.sleepTimeStartMinute, userNightScreenTimeSettings.sleepTimeStartMinute) && o.LJ(this.sleepTimeEndHour, userNightScreenTimeSettings.sleepTimeEndHour) && o.LJ(this.sleepTimeEndMinute, userNightScreenTimeSettings.sleepTimeEndMinute) && o.LJ(this.sleepReminderEnabled, userNightScreenTimeSettings.sleepReminderEnabled);
    }

    public int hashCode() {
        Integer num = this.sleepTimeStartHour;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.sleepTimeStartMinute;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.sleepTimeEndHour;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.sleepTimeEndMinute;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool = this.sleepReminderEnabled;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserNightScreenTimeSettings(sleepTimeStartHour=");
        LIZ.append(this.sleepTimeStartHour);
        LIZ.append(", sleepTimeStartMinute=");
        LIZ.append(this.sleepTimeStartMinute);
        LIZ.append(", sleepTimeEndHour=");
        LIZ.append(this.sleepTimeEndHour);
        LIZ.append(", sleepTimeEndMinute=");
        LIZ.append(this.sleepTimeEndMinute);
        LIZ.append(", sleepReminderEnabled=");
        return C78920UyC.LIZIZ(LIZ, this.sleepReminderEnabled, ')', LIZ);
    }

    public final Boolean getSleepReminderEnabled() {
        return this.sleepReminderEnabled;
    }

    public final Integer getSleepTimeEndHour() {
        return this.sleepTimeEndHour;
    }

    public final Integer getSleepTimeEndMinute() {
        return this.sleepTimeEndMinute;
    }

    public final Integer getSleepTimeStartHour() {
        return this.sleepTimeStartHour;
    }

    public final Integer getSleepTimeStartMinute() {
        return this.sleepTimeStartMinute;
    }

    public UserNightScreenTimeSettings(Integer num, Integer num2, Integer num3, Integer num4, Boolean bool) {
        this.sleepTimeStartHour = num;
        this.sleepTimeStartMinute = num2;
        this.sleepTimeEndHour = num3;
        this.sleepTimeEndMinute = num4;
        this.sleepReminderEnabled = bool;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ UserNightScreenTimeSettings(java.lang.Integer r8, java.lang.Integer r9, java.lang.Integer r10, java.lang.Integer r11, java.lang.Boolean r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r7 = this;
            r6 = r12
            r4 = r10
            r2 = r8
            r3 = r9
            r1 = r13 & 1
            r0 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto Le
            r2 = r5
        Le:
            r0 = r13 & 2
            if (r0 == 0) goto L13
            r3 = r5
        L13:
            r0 = r13 & 4
            if (r0 == 0) goto L18
            r4 = r5
        L18:
            r0 = r13 & 8
            if (r0 == 0) goto L27
        L1c:
            r0 = r13 & 16
            if (r0 == 0) goto L22
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
        L22:
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return
        L27:
            r5 = r11
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.protection.common.model.UserNightScreenTimeSettings.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
