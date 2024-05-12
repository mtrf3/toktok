package com.ss.android.ugc.aweme.feed.model;

import X.X1D;
import defpackage.q;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class AnchorCustomData implements Serializable {
    public final String ecEntranceFormMall;
    public final String exposureItems;
    public final boolean openOnLaunch;
    public final boolean openPdp;
    public final String pageName;
    public boolean shouldOpen;
    public final String sourceModule;
    public final Map<String, String> trackingData;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AnchorCustomData() {
        /*
            r10 = this;
            r1 = 0
            r3 = 0
            r8 = 127(0x7f, float:1.78E-43)
            r0 = r10
            r2 = r1
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            r9 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.AnchorCustomData.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnchorCustomData copy$default(AnchorCustomData anchorCustomData, boolean z, boolean z2, Map map, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = anchorCustomData.openOnLaunch;
        }
        if ((i & 2) != 0) {
            z2 = anchorCustomData.openPdp;
        }
        if ((i & 4) != 0) {
            map = anchorCustomData.trackingData;
        }
        if ((i & 8) != 0) {
            str = anchorCustomData.ecEntranceFormMall;
        }
        if ((i & 16) != 0) {
            str2 = anchorCustomData.sourceModule;
        }
        if ((i & 32) != 0) {
            str3 = anchorCustomData.exposureItems;
        }
        if ((i & 64) != 0) {
            str4 = anchorCustomData.pageName;
        }
        return anchorCustomData.copy(z, z2, map, str, str2, str3, str4);
    }

    public final AnchorCustomData copy(boolean z, boolean z2, Map<String, String> map, String str, String str2, String str3, String str4) {
        return new AnchorCustomData(z, z2, map, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchorCustomData)) {
            return false;
        }
        AnchorCustomData anchorCustomData = (AnchorCustomData) obj;
        return this.openOnLaunch == anchorCustomData.openOnLaunch && this.openPdp == anchorCustomData.openPdp && o.LJ(this.trackingData, anchorCustomData.trackingData) && o.LJ(this.ecEntranceFormMall, anchorCustomData.ecEntranceFormMall) && o.LJ(this.sourceModule, anchorCustomData.sourceModule) && o.LJ(this.exposureItems, anchorCustomData.exposureItems) && o.LJ(this.pageName, anchorCustomData.pageName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    public int hashCode() {
        boolean z = this.openOnLaunch;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = ((r0 * 31) + (this.openPdp ? 1 : 0)) * 31;
        Map<String, String> map = this.trackingData;
        int hashCode = (i + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.ecEntranceFormMall;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sourceModule;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.exposureItems;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pageName;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnchorCustomData(openOnLaunch=");
        LIZ.append(this.openOnLaunch);
        LIZ.append(", openPdp=");
        LIZ.append(this.openPdp);
        LIZ.append(", trackingData=");
        LIZ.append(this.trackingData);
        LIZ.append(", ecEntranceFormMall=");
        LIZ.append(this.ecEntranceFormMall);
        LIZ.append(", sourceModule=");
        LIZ.append(this.sourceModule);
        LIZ.append(", exposureItems=");
        LIZ.append(this.exposureItems);
        LIZ.append(", pageName=");
        return q.LIZIZ(LIZ, this.pageName, ')', LIZ);
    }

    public final String getEcEntranceFormMall() {
        return this.ecEntranceFormMall;
    }

    public final String getExposureItems() {
        return this.exposureItems;
    }

    public final boolean getOpenOnLaunch() {
        return this.openOnLaunch;
    }

    public final boolean getOpenPdp() {
        return this.openPdp;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final boolean getShouldOpen() {
        return this.shouldOpen;
    }

    public final String getSourceModule() {
        return this.sourceModule;
    }

    public final Map<String, String> getTrackingData() {
        return this.trackingData;
    }

    public final void setShouldOpen(boolean z) {
        this.shouldOpen = z;
    }

    public AnchorCustomData(boolean z, boolean z2, Map<String, String> map, String str, String str2, String str3, String str4) {
        this.openOnLaunch = z;
        this.openPdp = z2;
        this.trackingData = map;
        this.ecEntranceFormMall = str;
        this.sourceModule = str2;
        this.exposureItems = str3;
        this.pageName = str4;
        this.shouldOpen = z;
    }

    public /* synthetic */ AnchorCustomData(boolean z, boolean z2, Map map, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) == 0 ? z2 : false, (i & 4) != 0 ? null : map, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) == 0 ? str4 : null);
    }
}
