package com.ss.android.ugc.aweme.roaming;

import X.C2U8;
import X.InterfaceC65349Pkn;
import X.ORZ;
import X.X1D;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.governance.eventbus.IEvent;
import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes10.dex */
public final class RoamingLocationInfo implements IEvent {

    @InterfaceC65349Pkn("is_manual_select")
    public final boolean isManual;

    @InterfaceC65349Pkn("manual_region")
    public final String manualRegion;

    @InterfaceC65349Pkn("manual_region_name")
    public final String manualRegionName;

    @InterfaceC65349Pkn("source")
    public final int source;

    public static /* synthetic */ RoamingLocationInfo copy$default(RoamingLocationInfo roamingLocationInfo, String str, String str2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = roamingLocationInfo.manualRegion;
        }
        if ((i2 & 2) != 0) {
            str2 = roamingLocationInfo.manualRegionName;
        }
        if ((i2 & 4) != 0) {
            z = roamingLocationInfo.isManual;
        }
        if ((i2 & 8) != 0) {
            i = roamingLocationInfo.source;
        }
        return roamingLocationInfo.copy(str, str2, z, i);
    }

    public final RoamingLocationInfo copy(String str, String str2, boolean z, int i) {
        return new RoamingLocationInfo(str, str2, z, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoamingLocationInfo)) {
            return false;
        }
        RoamingLocationInfo roamingLocationInfo = (RoamingLocationInfo) obj;
        return o.LJ(this.manualRegion, roamingLocationInfo.manualRegion) && o.LJ(this.manualRegionName, roamingLocationInfo.manualRegionName) && this.isManual == roamingLocationInfo.isManual && this.source == roamingLocationInfo.source;
    }

    public final String getLevel() {
        try {
            String str = this.manualRegion;
            if (str == null) {
                return null;
            }
            boolean z = false;
            List LJLJJL = s.LJLJJL(str, new String[]{"_"}, 0, 6);
            if (LJLJJL.size() == 3) {
                z = true;
            }
            if (!z) {
                LJLJJL = null;
            }
            if (LJLJJL != null) {
                return (String) ORZ.LJLLLLLL(2, LJLJJL);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.manualRegion;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.manualRegionName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.isManual;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode2 + i) * 31) + this.source;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C2U8.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C2U8.LIZIZ(this);
        return this;
    }

    public final String getCityCode() {
        try {
            String str = this.manualRegion;
            if (str != null) {
                return (String) ListProtector.get(s.LJLJJL(str, new String[]{"_"}, 0, 6), 1);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final String getL0Code() {
        try {
            String str = this.manualRegion;
            if (str != null) {
                return (String) ListProtector.get(s.LJLJJL(str, new String[]{"_"}, 0, 6), 0);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RoamingLocationInfo(manualRegion=");
        LIZ.append(this.manualRegion);
        LIZ.append(", manualRegionName=");
        LIZ.append(this.manualRegionName);
        LIZ.append(", isManual=");
        LIZ.append(this.isManual);
        LIZ.append(", source=");
        return b0.LIZJ(LIZ, this.source, ')', LIZ);
    }

    public final String getManualRegion() {
        return this.manualRegion;
    }

    public final String getManualRegionName() {
        return this.manualRegionName;
    }

    public final int getSource() {
        return this.source;
    }

    public final boolean isManual() {
        return this.isManual;
    }

    public RoamingLocationInfo(String str, String str2, boolean z, int i) {
        this.manualRegion = str;
        this.manualRegionName = str2;
        this.isManual = z;
        this.source = i;
    }
}
