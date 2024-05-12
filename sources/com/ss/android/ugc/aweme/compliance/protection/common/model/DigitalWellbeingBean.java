package com.ss.android.ugc.aweme.compliance.protection.common.model;

import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class DigitalWellbeingBean {

    @InterfaceC65349Pkn("algo_refresh_status")
    public final Boolean algoRefreshStatus;

    @InterfaceC65349Pkn("do_not_disturb_settings")
    public final DoNotDisturbSettings doNotDisturbSettings;

    @InterfaceC65349Pkn("restrict_mode")
    public final Integer restrictMode;

    @InterfaceC65349Pkn("session_duration_type")
    public final Integer screenDurationType;

    @InterfaceC65349Pkn("session_duration_reminder")
    public final Integer screenTimeBreaks;

    @InterfaceC65349Pkn("screen_time_management")
    public final Integer screenTimeManagement;

    @InterfaceC65349Pkn("screen_time_management_eligible")
    public final Integer screenTimeManagementEligible;

    @InterfaceC65349Pkn("screen_time_management_status")
    public final int screenTimeManagementEnabled;

    @InterfaceC65349Pkn("screen_time_management_repeat_type")
    public final Integer screenTimeManagementRepeatType;

    @InterfaceC65349Pkn("screen_time_management_type")
    public final Integer screenTimeManagementType;

    @InterfaceC65349Pkn("screen_time_management_week_settings")
    public final List<ScreenTimeManagementDaySetting> screenTimeManagementWeekSettings;

    @InterfaceC65349Pkn("sleep_time_settings")
    public final UserNightScreenTimeSettings sleepTimeSettings;

    @InterfaceC65349Pkn("system_mute_settings")
    public final DoNotDisturbSettings systemMuteSettings;

    @InterfaceC65349Pkn("screen_time_update")
    public final Integer weeklyUpdate;

    /* JADX WARN: Multi-variable type inference failed */
    public DigitalWellbeingBean() {
        this(null, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16383, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DigitalWellbeingBean)) {
            return false;
        }
        DigitalWellbeingBean digitalWellbeingBean = (DigitalWellbeingBean) obj;
        return o.LJ(this.screenTimeManagement, digitalWellbeingBean.screenTimeManagement) && this.screenTimeManagementEnabled == digitalWellbeingBean.screenTimeManagementEnabled && o.LJ(this.screenTimeManagementType, digitalWellbeingBean.screenTimeManagementType) && o.LJ(this.screenTimeManagementEligible, digitalWellbeingBean.screenTimeManagementEligible) && o.LJ(this.restrictMode, digitalWellbeingBean.restrictMode) && o.LJ(this.weeklyUpdate, digitalWellbeingBean.weeklyUpdate) && o.LJ(this.screenTimeBreaks, digitalWellbeingBean.screenTimeBreaks) && o.LJ(this.screenDurationType, digitalWellbeingBean.screenDurationType) && o.LJ(this.algoRefreshStatus, digitalWellbeingBean.algoRefreshStatus) && o.LJ(this.sleepTimeSettings, digitalWellbeingBean.sleepTimeSettings) && o.LJ(this.doNotDisturbSettings, digitalWellbeingBean.doNotDisturbSettings) && o.LJ(this.systemMuteSettings, digitalWellbeingBean.systemMuteSettings) && o.LJ(this.screenTimeManagementRepeatType, digitalWellbeingBean.screenTimeManagementRepeatType) && o.LJ(this.screenTimeManagementWeekSettings, digitalWellbeingBean.screenTimeManagementWeekSettings);
    }

    public final int hashCode() {
        Integer num = this.screenTimeManagement;
        int hashCode = (((num == null ? 0 : num.hashCode()) * 31) + this.screenTimeManagementEnabled) * 31;
        Integer num2 = this.screenTimeManagementType;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.screenTimeManagementEligible;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.restrictMode;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.weeklyUpdate;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.screenTimeBreaks;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.screenDurationType;
        int hashCode7 = (hashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Boolean bool = this.algoRefreshStatus;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        UserNightScreenTimeSettings userNightScreenTimeSettings = this.sleepTimeSettings;
        int hashCode9 = (hashCode8 + (userNightScreenTimeSettings == null ? 0 : userNightScreenTimeSettings.hashCode())) * 31;
        DoNotDisturbSettings doNotDisturbSettings = this.doNotDisturbSettings;
        int hashCode10 = (hashCode9 + (doNotDisturbSettings == null ? 0 : doNotDisturbSettings.hashCode())) * 31;
        DoNotDisturbSettings doNotDisturbSettings2 = this.systemMuteSettings;
        int hashCode11 = (hashCode10 + (doNotDisturbSettings2 == null ? 0 : doNotDisturbSettings2.hashCode())) * 31;
        Integer num8 = this.screenTimeManagementRepeatType;
        int hashCode12 = (hashCode11 + (num8 == null ? 0 : num8.hashCode())) * 31;
        List<ScreenTimeManagementDaySetting> list = this.screenTimeManagementWeekSettings;
        return hashCode12 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "DigitalWellbeingBean(screenTimeManagement=" + this.screenTimeManagement + ", screenTimeManagementEnabled=" + this.screenTimeManagementEnabled + ", screenTimeManagementType=" + this.screenTimeManagementType + ", screenTimeManagementEligible=" + this.screenTimeManagementEligible + ", restrictMode=" + this.restrictMode + ", weeklyUpdate=" + this.weeklyUpdate + ", screenTimeBreaks=" + this.screenTimeBreaks + ", screenDurationType=" + this.screenDurationType + ", algoRefreshStatus=" + this.algoRefreshStatus + ", sleepTimeSettings=" + this.sleepTimeSettings + ", doNotDisturbSettings=" + this.doNotDisturbSettings + ", systemMuteSettings=" + this.systemMuteSettings + ", screenTimeManagementRepeatType=" + this.screenTimeManagementRepeatType + ", screenTimeManagementWeekSettings=" + this.screenTimeManagementWeekSettings + ')';
    }

    public DigitalWellbeingBean(Integer num, int i, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool, UserNightScreenTimeSettings userNightScreenTimeSettings, DoNotDisturbSettings doNotDisturbSettings, DoNotDisturbSettings doNotDisturbSettings2, Integer num8, List<ScreenTimeManagementDaySetting> list) {
        this.screenTimeManagement = num;
        this.screenTimeManagementEnabled = i;
        this.screenTimeManagementType = num2;
        this.screenTimeManagementEligible = num3;
        this.restrictMode = num4;
        this.weeklyUpdate = num5;
        this.screenTimeBreaks = num6;
        this.screenDurationType = num7;
        this.algoRefreshStatus = bool;
        this.sleepTimeSettings = userNightScreenTimeSettings;
        this.doNotDisturbSettings = doNotDisturbSettings;
        this.systemMuteSettings = doNotDisturbSettings2;
        this.screenTimeManagementRepeatType = num8;
        this.screenTimeManagementWeekSettings = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ DigitalWellbeingBean(java.lang.Integer r25, int r26, java.lang.Integer r27, java.lang.Integer r28, java.lang.Integer r29, java.lang.Integer r30, java.lang.Integer r31, java.lang.Integer r32, java.lang.Boolean r33, com.ss.android.ugc.aweme.compliance.protection.common.model.UserNightScreenTimeSettings r34, com.ss.android.ugc.aweme.compliance.protection.common.model.DoNotDisturbSettings r35, com.ss.android.ugc.aweme.compliance.protection.common.model.DoNotDisturbSettings r36, java.lang.Integer r37, java.util.List r38, int r39, kotlin.jvm.internal.DefaultConstructorMarker r40) {
        /*
            r24 = this;
            r1 = r39
            r15 = r38
            r13 = r36
            r12 = r35
            r11 = r34
            r10 = r33
            r9 = r32
            r4 = r27
            r2 = r25
            r5 = r28
            r6 = r29
            r7 = r30
            r8 = r31
            r0 = r1 & 1
            r3 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
            if (r0 == 0) goto L24
            r2 = r14
        L24:
            r0 = r1 & 2
            if (r0 == 0) goto L99
        L28:
            r0 = r1 & 4
            if (r0 == 0) goto L2d
            r4 = r14
        L2d:
            r0 = r1 & 8
            if (r0 == 0) goto L32
            r5 = r14
        L32:
            r0 = r1 & 16
            if (r0 == 0) goto L37
            r6 = r14
        L37:
            r0 = r1 & 32
            if (r0 == 0) goto L3c
            r7 = r14
        L3c:
            r0 = r1 & 64
            if (r0 == 0) goto L41
            r8 = r14
        L41:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L46
            r9 = r14
        L46:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L4c
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
        L4c:
            r0 = r1 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L51
            r11 = 0
        L51:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L6a
            com.ss.android.ugc.aweme.compliance.protection.common.model.DoNotDisturbSettings r12 = new com.ss.android.ugc.aweme.compliance.protection.common.model.DoNotDisturbSettings
            r17 = 0
            r22 = 31
            r16 = r12
            r18 = r17
            r19 = r17
            r20 = r17
            r21 = r17
            r23 = r17
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
        L6a:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L83
            com.ss.android.ugc.aweme.compliance.protection.common.model.DoNotDisturbSettings r13 = new com.ss.android.ugc.aweme.compliance.protection.common.model.DoNotDisturbSettings
            r17 = 0
            r22 = 31
            r16 = r13
            r18 = r17
            r19 = r17
            r20 = r17
            r21 = r17
            r23 = r17
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
        L83:
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L96
        L87:
            r0 = r1 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L90
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
        L90:
            r1 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L96:
            r14 = r37
            goto L87
        L99:
            r3 = r26
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.protection.common.model.DigitalWellbeingBean.<init>(java.lang.Integer, int, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Boolean, com.ss.android.ugc.aweme.compliance.protection.common.model.UserNightScreenTimeSettings, com.ss.android.ugc.aweme.compliance.protection.common.model.DoNotDisturbSettings, com.ss.android.ugc.aweme.compliance.protection.common.model.DoNotDisturbSettings, java.lang.Integer, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
