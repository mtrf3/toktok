package com.ss.android.ugc.aweme.compliance.protection.common.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class GuardianRestrictionBean {

    @InterfaceC65349Pkn("do_not_disturb_settings")
    public final DoNotDisturbSettings doNotDisturbSettings;

    @InterfaceC65349Pkn("restrict_mode")
    public final Integer restrictMode;

    @InterfaceC65349Pkn("screen_time_management")
    public final Integer screenTimeManagement;

    @InterfaceC65349Pkn("screen_time_management_repeat_type")
    public final int screenTimeManagementRepeatType;

    @InterfaceC65349Pkn("screen_time_management_status")
    public final Integer screenTimeManagementStatus;

    @InterfaceC65349Pkn("screen_time_management_type")
    public final Integer screenTimeManagementType;

    @InterfaceC65349Pkn("screen_time_management_week_settings")
    public final List<ScreenTimeManagementDaySetting> screenTimeManagementWeekSettings;

    @InterfaceC65349Pkn("search_restriction")
    public final Integer searchRestriction;

    /* JADX WARN: Multi-variable type inference failed */
    public GuardianRestrictionBean() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuardianRestrictionBean)) {
            return false;
        }
        GuardianRestrictionBean guardianRestrictionBean = (GuardianRestrictionBean) obj;
        return o.LJ(this.screenTimeManagement, guardianRestrictionBean.screenTimeManagement) && o.LJ(this.restrictMode, guardianRestrictionBean.restrictMode) && o.LJ(this.searchRestriction, guardianRestrictionBean.searchRestriction) && o.LJ(this.doNotDisturbSettings, guardianRestrictionBean.doNotDisturbSettings) && o.LJ(this.screenTimeManagementStatus, guardianRestrictionBean.screenTimeManagementStatus) && o.LJ(this.screenTimeManagementType, guardianRestrictionBean.screenTimeManagementType) && this.screenTimeManagementRepeatType == guardianRestrictionBean.screenTimeManagementRepeatType && o.LJ(this.screenTimeManagementWeekSettings, guardianRestrictionBean.screenTimeManagementWeekSettings);
    }

    public final int hashCode() {
        Integer num = this.screenTimeManagement;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.restrictMode;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.searchRestriction;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        DoNotDisturbSettings doNotDisturbSettings = this.doNotDisturbSettings;
        int hashCode4 = (hashCode3 + (doNotDisturbSettings == null ? 0 : doNotDisturbSettings.hashCode())) * 31;
        Integer num4 = this.screenTimeManagementStatus;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.screenTimeManagementType;
        int hashCode6 = (((hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31) + this.screenTimeManagementRepeatType) * 31;
        List<ScreenTimeManagementDaySetting> list = this.screenTimeManagementWeekSettings;
        return hashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GuardianRestrictionBean(screenTimeManagement=");
        LIZ.append(this.screenTimeManagement);
        LIZ.append(", restrictMode=");
        LIZ.append(this.restrictMode);
        LIZ.append(", searchRestriction=");
        LIZ.append(this.searchRestriction);
        LIZ.append(", doNotDisturbSettings=");
        LIZ.append(this.doNotDisturbSettings);
        LIZ.append(", screenTimeManagementStatus=");
        LIZ.append(this.screenTimeManagementStatus);
        LIZ.append(", screenTimeManagementType=");
        LIZ.append(this.screenTimeManagementType);
        LIZ.append(", screenTimeManagementRepeatType=");
        LIZ.append(this.screenTimeManagementRepeatType);
        LIZ.append(", screenTimeManagementWeekSettings=");
        return C1NE.LIZIZ(LIZ, this.screenTimeManagementWeekSettings, ')', LIZ);
    }

    public GuardianRestrictionBean(Integer num, Integer num2, Integer num3, DoNotDisturbSettings doNotDisturbSettings, Integer num4, Integer num5, int i, List<ScreenTimeManagementDaySetting> list) {
        this.screenTimeManagement = num;
        this.restrictMode = num2;
        this.searchRestriction = num3;
        this.doNotDisturbSettings = doNotDisturbSettings;
        this.screenTimeManagementStatus = num4;
        this.screenTimeManagementType = num5;
        this.screenTimeManagementRepeatType = i;
        this.screenTimeManagementWeekSettings = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ GuardianRestrictionBean(java.lang.Integer r19, java.lang.Integer r20, java.lang.Integer r21, com.ss.android.ugc.aweme.compliance.protection.common.model.DoNotDisturbSettings r22, java.lang.Integer r23, java.lang.Integer r24, int r25, java.util.List r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r18 = this;
            r1 = r27
            r3 = r20
            r2 = r19
            r9 = r26
            r4 = r21
            r5 = r22
            r6 = r23
            r0 = r1 & 1
            r8 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            if (r0 == 0) goto L18
            r2 = r7
        L18:
            r0 = r1 & 2
            if (r0 == 0) goto L1d
            r3 = r7
        L1d:
            r0 = r1 & 4
            if (r0 == 0) goto L22
            r4 = r7
        L22:
            r0 = r1 & 8
            if (r0 == 0) goto L35
            com.ss.android.ugc.aweme.compliance.protection.common.model.DoNotDisturbSettings r5 = new com.ss.android.ugc.aweme.compliance.protection.common.model.DoNotDisturbSettings
            r11 = 0
            r16 = 31
            r10 = r5
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r17 = r11
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
        L35:
            r0 = r1 & 16
            if (r0 == 0) goto L3a
            r6 = r7
        L3a:
            r0 = r1 & 32
            if (r0 == 0) goto L54
        L3e:
            r0 = r1 & 64
            if (r0 == 0) goto L51
        L42:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L4b
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L4b:
            r1 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L51:
            r8 = r25
            goto L42
        L54:
            r7 = r24
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.protection.common.model.GuardianRestrictionBean.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer, com.ss.android.ugc.aweme.compliance.protection.common.model.DoNotDisturbSettings, java.lang.Integer, java.lang.Integer, int, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
