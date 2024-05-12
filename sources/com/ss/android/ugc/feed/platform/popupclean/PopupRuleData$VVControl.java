package com.ss.android.ugc.feed.platform.popupclean;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PopupRuleData$VVControl implements Serializable {

    @InterfaceC65349Pkn("max_count_in_each_vv_interval")
    public final Integer maxCountInVVInterval;

    @InterfaceC65349Pkn("required_vv_interval")
    public final Integer requiredVVInterval;

    public static /* synthetic */ PopupRuleData$VVControl copy$default(PopupRuleData$VVControl popupRuleData$VVControl, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = popupRuleData$VVControl.requiredVVInterval;
        }
        if ((i & 2) != 0) {
            num2 = popupRuleData$VVControl.maxCountInVVInterval;
        }
        return popupRuleData$VVControl.copy(num, num2);
    }

    public final PopupRuleData$VVControl copy(Integer num, Integer num2) {
        return new PopupRuleData$VVControl(num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupRuleData$VVControl)) {
            return false;
        }
        PopupRuleData$VVControl popupRuleData$VVControl = (PopupRuleData$VVControl) obj;
        return o.LJ(this.requiredVVInterval, popupRuleData$VVControl.requiredVVInterval) && o.LJ(this.maxCountInVVInterval, popupRuleData$VVControl.maxCountInVVInterval);
    }

    public int hashCode() {
        Integer num = this.requiredVVInterval;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.maxCountInVVInterval;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VVControl(requiredVVInterval=");
        LIZ.append(this.requiredVVInterval);
        LIZ.append(", maxCountInVVInterval=");
        return s0.LIZJ(LIZ, this.maxCountInVVInterval, ')', LIZ);
    }

    public final Integer getMaxCountInVVInterval() {
        return this.maxCountInVVInterval;
    }

    public final Integer getRequiredVVInterval() {
        return this.requiredVVInterval;
    }

    public PopupRuleData$VVControl(Integer num, Integer num2) {
        this.requiredVVInterval = num;
        this.maxCountInVVInterval = num2;
    }
}
