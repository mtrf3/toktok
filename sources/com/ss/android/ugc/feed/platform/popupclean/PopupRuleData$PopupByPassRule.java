package com.ss.android.ugc.feed.platform.popupclean;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PopupRuleData$PopupByPassRule implements Serializable {

    @InterfaceC65349Pkn("max_active_days")
    public final Integer maxActiveDay;

    public static /* synthetic */ PopupRuleData$PopupByPassRule copy$default(PopupRuleData$PopupByPassRule popupRuleData$PopupByPassRule, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = popupRuleData$PopupByPassRule.maxActiveDay;
        }
        return popupRuleData$PopupByPassRule.copy(num);
    }

    public final PopupRuleData$PopupByPassRule copy(Integer num) {
        return new PopupRuleData$PopupByPassRule(num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PopupRuleData$PopupByPassRule) && o.LJ(this.maxActiveDay, ((PopupRuleData$PopupByPassRule) obj).maxActiveDay);
    }

    public int hashCode() {
        Integer num = this.maxActiveDay;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PopupByPassRule(maxActiveDay=");
        return s0.LIZJ(LIZ, this.maxActiveDay, ')', LIZ);
    }

    public final Integer getMaxActiveDay() {
        return this.maxActiveDay;
    }

    public PopupRuleData$PopupByPassRule(Integer num) {
        this.maxActiveDay = num;
    }
}
