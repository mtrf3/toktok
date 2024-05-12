package com.bytedance.touchpoint.core.model;

import X.C78966Uyw;
import X.C95U;
import X.InterfaceC65349Pkn;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ActivityTask extends C95U {

    @InterfaceC65349Pkn("auto_done_task")
    public Boolean autoDone;

    @InterfaceC65349Pkn("award_cnt")
    public Integer awardCount;

    @InterfaceC65349Pkn("task_count")
    public int count;

    @InterfaceC65349Pkn("display_cash_amount")
    public Float displayCashAmount;

    @InterfaceC65349Pkn("finish_push")
    public String finishPush;

    @InterfaceC65349Pkn("is_auto")
    public boolean isAuto;

    @InterfaceC65349Pkn("notification_id")
    public String notificationId;

    @InterfaceC65349Pkn("reward_layer")
    public List<Integer> rewardLayer;

    @InterfaceC65349Pkn("round_time")
    public Integer roundTime;

    @InterfaceC65349Pkn("round_time_done")
    public Boolean roundTimeDone;

    @InterfaceC65349Pkn("display_score_amount")
    public final Integer scoreAmount;

    @InterfaceC65349Pkn("stop_auto_after_days")
    public int stopAutoDays;

    @InterfaceC65349Pkn("task_key")
    public String taskKey;

    @InterfaceC65349Pkn("task_type")
    public int taskType;

    @InterfaceC65349Pkn("time")
    public int time;

    @InterfaceC65349Pkn("upload_switch")
    public Boolean uploadSwitch;

    public final Object[] LIZIZ() {
        return new Object[]{this.taskKey, Integer.valueOf(this.taskType), Boolean.valueOf(this.isAuto), this.finishPush, Integer.valueOf(this.time), this.roundTime, this.rewardLayer, Integer.valueOf(this.count), this.scoreAmount, this.notificationId, this.uploadSwitch, Integer.valueOf(this.stopAutoDays), this.awardCount, this.autoDone, this.roundTimeDone, this.displayCashAmount};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActivityTask) {
            return C78966Uyw.LJIIIZ(((ActivityTask) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("ActivityTask:%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", LIZIZ());
    }

    public ActivityTask(String taskKey, int i, boolean z, String str, int i2, Integer num, List<Integer> list, int i3, Integer num2, String str2, Boolean bool, int i4, Integer num3, Boolean bool2, Boolean bool3, Float f) {
        o.LJIIIZ(taskKey, "taskKey");
        this.taskKey = taskKey;
        this.taskType = i;
        this.isAuto = z;
        this.finishPush = str;
        this.time = i2;
        this.roundTime = num;
        this.rewardLayer = list;
        this.count = i3;
        this.scoreAmount = num2;
        this.notificationId = str2;
        this.uploadSwitch = bool;
        this.stopAutoDays = i4;
        this.awardCount = num3;
        this.autoDone = bool2;
        this.roundTimeDone = bool3;
        this.displayCashAmount = f;
    }

    public /* synthetic */ ActivityTask(String str, int i, boolean z, String str2, int i2, Integer num, List list, int i3, Integer num2, String str3, Boolean bool, int i4, Integer num3, Boolean bool2, Boolean bool3, Float f, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, z, (i5 & 8) != 0 ? "" : str2, i2, num, list, i3, num2, (i5 & 512) == 0 ? str3 : "", (i5 & 1024) != 0 ? Boolean.FALSE : bool, i4, num3, bool2, bool3, f);
    }
}
