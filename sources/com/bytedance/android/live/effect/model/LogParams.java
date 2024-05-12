package com.bytedance.android.live.effect.model;

import X.C16880lQ;
import X.C30725C4b;
import X.C47135Ieh;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class LogParams {

    @InterfaceC65349Pkn("background_pos")
    public int backgroundPos;

    @InterfaceC65349Pkn("drag_mode")
    public int dragMode;

    @InterfaceC65349Pkn("entrance")
    public String entrance;

    @InterfaceC65349Pkn("gift_id")
    public String giftId;

    @InterfaceC65349Pkn("goal_type")
    public String goalType;

    @InterfaceC65349Pkn("is_adjust")
    public Integer isAdjust;

    @InterfaceC65349Pkn("is_first_guide")
    public Integer isFirstGuide;

    @InterfaceC65349Pkn("setting_status")
    public String settingStatus;

    @InterfaceC65349Pkn("start_time")
    public long startTime;

    @InterfaceC65349Pkn("stream_goal_id")
    public String streamGoalId;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LogParams() {
        /*
            r14 = this;
            r1 = 0
            r7 = 0
            r10 = 0
            r12 = 1023(0x3ff, float:1.434E-42)
            r0 = r14
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r8 = r1
            r9 = r7
            r13 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.model.LogParams.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogParams)) {
            return false;
        }
        LogParams logParams = (LogParams) obj;
        return o.LJ(this.entrance, logParams.entrance) && o.LJ(this.isFirstGuide, logParams.isFirstGuide) && o.LJ(this.settingStatus, logParams.settingStatus) && o.LJ(this.goalType, logParams.goalType) && o.LJ(this.streamGoalId, logParams.streamGoalId) && o.LJ(this.giftId, logParams.giftId) && this.backgroundPos == logParams.backgroundPos && o.LJ(this.isAdjust, logParams.isAdjust) && this.dragMode == logParams.dragMode && this.startTime == logParams.startTime;
    }

    public final int hashCode() {
        String str = this.entrance;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.isFirstGuide;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.settingStatus;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.goalType;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.streamGoalId;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.giftId;
        int hashCode6 = (((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.backgroundPos) * 31;
        Integer num2 = this.isAdjust;
        return C16880lQ.LLJIJIL(this.startTime) + ((((hashCode6 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.dragMode) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LogParams(entrance=");
        LIZ.append(this.entrance);
        LIZ.append(", isFirstGuide=");
        LIZ.append(this.isFirstGuide);
        LIZ.append(", settingStatus=");
        LIZ.append(this.settingStatus);
        LIZ.append(", goalType=");
        LIZ.append(this.goalType);
        LIZ.append(", streamGoalId=");
        LIZ.append(this.streamGoalId);
        LIZ.append(", giftId=");
        LIZ.append(this.giftId);
        LIZ.append(", backgroundPos=");
        LIZ.append(this.backgroundPos);
        LIZ.append(", isAdjust=");
        LIZ.append(this.isAdjust);
        LIZ.append(", dragMode=");
        LIZ.append(this.dragMode);
        LIZ.append(", startTime=");
        return C47135Ieh.LIZIZ(LIZ, this.startTime, ')', LIZ);
    }

    public LogParams(String str, Integer num, String str2, String str3, String str4, String str5, int i, Integer num2, int i2, long j) {
        this.entrance = str;
        this.isFirstGuide = num;
        this.settingStatus = str2;
        this.goalType = str3;
        this.streamGoalId = str4;
        this.giftId = str5;
        this.backgroundPos = i;
        this.isAdjust = num2;
        this.dragMode = i2;
        this.startTime = j;
    }

    public /* synthetic */ LogParams(String str, Integer num, String str2, String str3, String str4, String str5, int i, Integer num2, int i2, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : num, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? null : str4, (i3 & 32) == 0 ? str5 : null, (i3 & 64) != 0 ? 0 : i, (i3 & 128) != 0 ? 0 : num2, (i3 & 256) == 0 ? i2 : 0, (i3 & 512) != 0 ? C30725C4b.LIZ() : j);
    }
}
