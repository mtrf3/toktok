package com.ss.android.ugc.feed.platform.popupclean;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PopupRuleData$OnlineControl implements Serializable {

    @InterfaceC65349Pkn("max_count_in_each_time_interval")
    public final Integer maxCountInTimeInterval;

    @InterfaceC65349Pkn("required_time_interval")
    public final Integer requiredTimeInterval;

    public static /* synthetic */ PopupRuleData$OnlineControl copy$default(PopupRuleData$OnlineControl popupRuleData$OnlineControl, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = popupRuleData$OnlineControl.requiredTimeInterval;
        }
        if ((i & 2) != 0) {
            num2 = popupRuleData$OnlineControl.maxCountInTimeInterval;
        }
        return popupRuleData$OnlineControl.copy(num, num2);
    }

    public final PopupRuleData$OnlineControl copy(Integer num, Integer num2) {
        return new PopupRuleData$OnlineControl(num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupRuleData$OnlineControl)) {
            return false;
        }
        PopupRuleData$OnlineControl popupRuleData$OnlineControl = (PopupRuleData$OnlineControl) obj;
        return o.LJ(this.requiredTimeInterval, popupRuleData$OnlineControl.requiredTimeInterval) && o.LJ(this.maxCountInTimeInterval, popupRuleData$OnlineControl.maxCountInTimeInterval);
    }

    public int hashCode() {
        Integer num = this.requiredTimeInterval;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.maxCountInTimeInterval;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OnlineControl(requiredTimeInterval=");
        LIZ.append(this.requiredTimeInterval);
        LIZ.append(", maxCountInTimeInterval=");
        return s0.LIZJ(LIZ, this.maxCountInTimeInterval, ')', LIZ);
    }

    public final Integer getMaxCountInTimeInterval() {
        return this.maxCountInTimeInterval;
    }

    public final Integer getRequiredTimeInterval() {
        return this.requiredTimeInterval;
    }

    public PopupRuleData$OnlineControl(Integer num, Integer num2) {
        this.requiredTimeInterval = num;
        this.maxCountInTimeInterval = num2;
    }
}
