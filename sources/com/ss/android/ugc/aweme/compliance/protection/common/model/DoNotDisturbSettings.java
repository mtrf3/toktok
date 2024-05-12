package com.ss.android.ugc.aweme.compliance.protection.common.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class DoNotDisturbSettings {

    @InterfaceC65349Pkn("pause_notification_enabled")
    public final Boolean pauseNotificationEnabled;

    @InterfaceC65349Pkn("pause_end_hour")
    public final Integer pauseNotificationEndHour;

    @InterfaceC65349Pkn("pause_end_minute")
    public final Integer pauseNotificationEndMinute;

    @InterfaceC65349Pkn("pause_start_hour")
    public final Integer pauseNotificationStartHour;

    @InterfaceC65349Pkn("pause_start_minute")
    public final Integer pauseNotificationStartMinute;

    /* JADX WARN: Multi-variable type inference failed */
    public DoNotDisturbSettings() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DoNotDisturbSettings)) {
            return false;
        }
        DoNotDisturbSettings doNotDisturbSettings = (DoNotDisturbSettings) obj;
        return o.LJ(this.pauseNotificationEnabled, doNotDisturbSettings.pauseNotificationEnabled) && o.LJ(this.pauseNotificationStartHour, doNotDisturbSettings.pauseNotificationStartHour) && o.LJ(this.pauseNotificationStartMinute, doNotDisturbSettings.pauseNotificationStartMinute) && o.LJ(this.pauseNotificationEndHour, doNotDisturbSettings.pauseNotificationEndHour) && o.LJ(this.pauseNotificationEndMinute, doNotDisturbSettings.pauseNotificationEndMinute);
    }

    public final int hashCode() {
        Boolean bool = this.pauseNotificationEnabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.pauseNotificationStartHour;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.pauseNotificationStartMinute;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.pauseNotificationEndHour;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.pauseNotificationEndMinute;
        return hashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DoNotDisturbSettings(pauseNotificationEnabled=");
        LIZ.append(this.pauseNotificationEnabled);
        LIZ.append(", pauseNotificationStartHour=");
        LIZ.append(this.pauseNotificationStartHour);
        LIZ.append(", pauseNotificationStartMinute=");
        LIZ.append(this.pauseNotificationStartMinute);
        LIZ.append(", pauseNotificationEndHour=");
        LIZ.append(this.pauseNotificationEndHour);
        LIZ.append(", pauseNotificationEndMinute=");
        return s0.LIZJ(LIZ, this.pauseNotificationEndMinute, ')', LIZ);
    }

    public DoNotDisturbSettings(Boolean bool, Integer num, Integer num2, Integer num3, Integer num4) {
        this.pauseNotificationEnabled = bool;
        this.pauseNotificationStartHour = num;
        this.pauseNotificationStartMinute = num2;
        this.pauseNotificationEndHour = num3;
        this.pauseNotificationEndMinute = num4;
    }

    public /* synthetic */ DoNotDisturbSettings(Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? 0 : num, (i & 4) != 0 ? 0 : num2, (i & 8) != 0 ? 0 : num3, (i & 16) != 0 ? 0 : num4);
    }
}
