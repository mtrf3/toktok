package com.ss.android.ugc.feed.platform.componentmanager.data;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class GlobalComponentData {

    @InterfaceC65349Pkn("component_key")
    public String componentKey;
    public int customShowLimit;
    public String matchedContainerKey;
    public String parentContainerKey;

    @InterfaceC65349Pkn("show_strategy")
    public int showStrategy;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GlobalComponentData() {
        /*
            r8 = this;
            r1 = 0
            r2 = 0
            r6 = 31
            r0 = r8
            r3 = r1
            r4 = r1
            r5 = r2
            r7 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.componentmanager.data.GlobalComponentData.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlobalComponentData)) {
            return false;
        }
        GlobalComponentData globalComponentData = (GlobalComponentData) obj;
        return o.LJ(this.componentKey, globalComponentData.componentKey) && this.showStrategy == globalComponentData.showStrategy && o.LJ(this.matchedContainerKey, globalComponentData.matchedContainerKey) && o.LJ(this.parentContainerKey, globalComponentData.parentContainerKey) && this.customShowLimit == globalComponentData.customShowLimit;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.componentKey;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return C79062V1e.LJ(this.parentContainerKey, C79062V1e.LJ(this.matchedContainerKey, ((hashCode * 31) + this.showStrategy) * 31, 31), 31) + this.customShowLimit;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GlobalComponentData(componentKey=");
        LIZ.append(this.componentKey);
        LIZ.append(", showStrategy=");
        LIZ.append(this.showStrategy);
        LIZ.append(", matchedContainerKey=");
        LIZ.append(this.matchedContainerKey);
        LIZ.append(", parentContainerKey=");
        LIZ.append(this.parentContainerKey);
        LIZ.append(", customShowLimit=");
        return b0.LIZJ(LIZ, this.customShowLimit, ')', LIZ);
    }

    public GlobalComponentData(String str, int i, String matchedContainerKey, String parentContainerKey, int i2) {
        o.LJIIIZ(matchedContainerKey, "matchedContainerKey");
        o.LJIIIZ(parentContainerKey, "parentContainerKey");
        this.componentKey = str;
        this.showStrategy = i;
        this.matchedContainerKey = matchedContainerKey;
        this.parentContainerKey = parentContainerKey;
        this.customShowLimit = i2;
    }

    public /* synthetic */ GlobalComponentData(String str, int i, String str2, String str3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? 1 : i, (i3 & 4) != 0 ? "" : str2, (i3 & 8) == 0 ? str3 : "", (i3 & 16) != 0 ? 0 : i2);
    }
}
