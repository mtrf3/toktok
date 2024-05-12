package com.ss.android.ugc.aweme.service.proactive;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ProactiveLoginConfig {

    @InterfaceC65349Pkn("day_limit_login_panel")
    public final Integer dayLimitLoginPanel;

    @InterfaceC65349Pkn("decision")
    public final String decision;

    @InterfaceC65349Pkn("design")
    public final int design;

    @InterfaceC65349Pkn("min_hours_interval_login_panel")
    public final Integer minHoursIntervalLoginPanel;

    @InterfaceC65349Pkn("vv")
    public final int vv;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProactiveLoginConfig)) {
            return false;
        }
        ProactiveLoginConfig proactiveLoginConfig = (ProactiveLoginConfig) obj;
        return o.LJ(this.decision, proactiveLoginConfig.decision) && this.design == proactiveLoginConfig.design && this.vv == proactiveLoginConfig.vv && o.LJ(this.minHoursIntervalLoginPanel, proactiveLoginConfig.minHoursIntervalLoginPanel) && o.LJ(this.dayLimitLoginPanel, proactiveLoginConfig.dayLimitLoginPanel);
    }

    public final int hashCode() {
        int hashCode = ((((this.decision.hashCode() * 31) + this.design) * 31) + this.vv) * 31;
        Integer num = this.minHoursIntervalLoginPanel;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.dayLimitLoginPanel;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProactiveLoginConfig(decision=");
        LIZ.append(this.decision);
        LIZ.append(", design=");
        LIZ.append(this.design);
        LIZ.append(", vv=");
        LIZ.append(this.vv);
        LIZ.append(", minHoursIntervalLoginPanel=");
        LIZ.append(this.minHoursIntervalLoginPanel);
        LIZ.append(", dayLimitLoginPanel=");
        return s0.LIZJ(LIZ, this.dayLimitLoginPanel, ')', LIZ);
    }

    public ProactiveLoginConfig(String decision, int i, int i2, Integer num, Integer num2) {
        o.LJIIIZ(decision, "decision");
        this.decision = decision;
        this.design = i;
        this.vv = i2;
        this.minHoursIntervalLoginPanel = num;
        this.dayLimitLoginPanel = num2;
    }
}
