package com.ss.android.ugc.aweme.compliance.protection.common.model;

import X.EnumC2060986z;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ScreenTimeManagementDaySetting {

    @InterfaceC65349Pkn("day")
    public final Integer dayOfWeek;

    @InterfaceC65349Pkn("screen_time_limit")
    public final Integer screenTimeLimitForWeek;

    @InterfaceC65349Pkn("screen_time_setting_type")
    public final Integer screenTimeSettingTypeForWeek;

    @InterfaceC65349Pkn("status")
    public final Integer screenTimeStatusForWeek;

    /* JADX WARN: Multi-variable type inference failed */
    public ScreenTimeManagementDaySetting() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenTimeManagementDaySetting)) {
            return false;
        }
        ScreenTimeManagementDaySetting screenTimeManagementDaySetting = (ScreenTimeManagementDaySetting) obj;
        return o.LJ(this.screenTimeLimitForWeek, screenTimeManagementDaySetting.screenTimeLimitForWeek) && o.LJ(this.screenTimeSettingTypeForWeek, screenTimeManagementDaySetting.screenTimeSettingTypeForWeek) && o.LJ(this.screenTimeStatusForWeek, screenTimeManagementDaySetting.screenTimeStatusForWeek) && o.LJ(this.dayOfWeek, screenTimeManagementDaySetting.dayOfWeek);
    }

    public final int hashCode() {
        Integer num = this.screenTimeLimitForWeek;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.screenTimeSettingTypeForWeek;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.screenTimeStatusForWeek;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.dayOfWeek;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ScreenTimeManagementDaySetting(screenTimeLimitForWeek=");
        LIZ.append(this.screenTimeLimitForWeek);
        LIZ.append(", screenTimeSettingTypeForWeek=");
        LIZ.append(this.screenTimeSettingTypeForWeek);
        LIZ.append(", screenTimeStatusForWeek=");
        LIZ.append(this.screenTimeStatusForWeek);
        LIZ.append(", dayOfWeek=");
        return s0.LIZJ(LIZ, this.dayOfWeek, ')', LIZ);
    }

    public ScreenTimeManagementDaySetting(Integer num, Integer num2, Integer num3, Integer num4) {
        this.screenTimeLimitForWeek = num;
        this.screenTimeSettingTypeForWeek = num2;
        this.screenTimeStatusForWeek = num3;
        this.dayOfWeek = num4;
    }

    public /* synthetic */ ScreenTimeManagementDaySetting(Integer num, Integer num2, Integer num3, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? 0 : num2, (i & 4) != 0 ? 0 : num3, (i & 8) != 0 ? Integer.valueOf(EnumC2060986z.NON.getValue()) : num4);
    }
}
