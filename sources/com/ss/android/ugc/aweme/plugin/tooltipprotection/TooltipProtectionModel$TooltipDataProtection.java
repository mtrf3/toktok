package com.ss.android.ugc.aweme.plugin.tooltipprotection;

import X.C61878OQg;
import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class TooltipProtectionModel$TooltipDataProtection {

    @InterfaceC65349Pkn("enable_flow")
    public final Boolean enabled;

    @InterfaceC65349Pkn("protection")
    public final List<Integer> protection;

    @InterfaceC65349Pkn("remove")
    public final List<TooltipProtectionModel$TooltipsByScene> removeTooltips;

    @InterfaceC65349Pkn("priority")
    public final List<TooltipProtectionModel$TooltipsByScene> tooltipPriority;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TooltipProtectionModel$TooltipDataProtection)) {
            return false;
        }
        TooltipProtectionModel$TooltipDataProtection tooltipProtectionModel$TooltipDataProtection = (TooltipProtectionModel$TooltipDataProtection) obj;
        return o.LJ(this.tooltipPriority, tooltipProtectionModel$TooltipDataProtection.tooltipPriority) && o.LJ(this.removeTooltips, tooltipProtectionModel$TooltipDataProtection.removeTooltips) && o.LJ(this.protection, tooltipProtectionModel$TooltipDataProtection.protection) && o.LJ(this.enabled, tooltipProtectionModel$TooltipDataProtection.enabled);
    }

    public final int hashCode() {
        int hashCode = this.tooltipPriority.hashCode() * 31;
        List<TooltipProtectionModel$TooltipsByScene> list = this.removeTooltips;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Integer> list2 = this.protection;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.enabled;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TooltipDataProtection(tooltipPriority=");
        LIZ.append(this.tooltipPriority);
        LIZ.append(", removeTooltips=");
        LIZ.append(this.removeTooltips);
        LIZ.append(", protection=");
        LIZ.append(this.protection);
        LIZ.append(", enabled=");
        return C78920UyC.LIZIZ(LIZ, this.enabled, ')', LIZ);
    }

    public TooltipProtectionModel$TooltipDataProtection(List<TooltipProtectionModel$TooltipsByScene> tooltipPriority, List<TooltipProtectionModel$TooltipsByScene> list, List<Integer> list2, Boolean bool) {
        o.LJIIIZ(tooltipPriority, "tooltipPriority");
        this.tooltipPriority = tooltipPriority;
        this.removeTooltips = list;
        this.protection = list2;
        this.enabled = bool;
    }

    public TooltipProtectionModel$TooltipDataProtection(List list, List list2, List list3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? C61878OQg.INSTANCE : list2, (i & 4) != 0 ? C61878OQg.INSTANCE : list3, (i & 8) != 0 ? Boolean.FALSE : bool);
    }
}
