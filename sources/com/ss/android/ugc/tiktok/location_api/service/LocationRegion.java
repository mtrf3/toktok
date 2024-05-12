package com.ss.android.ugc.tiktok.location_api.service;

import X.C16880lQ;
import X.InterfaceC57784Mm4;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LocationRegion implements InterfaceC57784Mm4, Serializable {

    @InterfaceC65349Pkn("en_name")
    public final String enName;

    @InterfaceC65349Pkn("id")
    public final long id;

    @InterfaceC65349Pkn("l0_code")
    public final String l0Code;

    @InterfaceC65349Pkn("level")
    public final LocationLevel level;

    @InterfaceC65349Pkn("locate_method")
    public final Integer locateMethod;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("parent_en_name")
    public final String parentEnName;

    @InterfaceC65349Pkn("parent_id")
    public final long parentId;

    @InterfaceC65349Pkn("parent_level")
    public final LocationLevel parentLevel;

    @InterfaceC65349Pkn("parent_name")
    public final String parentName;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LocationRegion() {
        /*
            r15 = this;
            r1 = 0
            r3 = 0
            r13 = 1023(0x3ff, float:1.434E-42)
            r0 = r15
            r4 = r3
            r5 = r3
            r6 = r1
            r8 = r3
            r9 = r3
            r10 = r3
            r11 = r3
            r12 = r3
            r14 = r3
            r0.<init>(r1, r3, r4, r5, r6, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.location_api.service.LocationRegion.<init>():void");
    }

    public static /* synthetic */ LocationRegion copy$default(LocationRegion locationRegion, long j, String str, String str2, LocationLevel locationLevel, long j2, String str3, String str4, LocationLevel locationLevel2, String str5, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            j = locationRegion.id;
        }
        if ((i & 2) != 0) {
            str = locationRegion.name;
        }
        if ((i & 4) != 0) {
            str2 = locationRegion.enName;
        }
        if ((i & 8) != 0) {
            locationLevel = locationRegion.level;
        }
        if ((i & 16) != 0) {
            j2 = locationRegion.parentId;
        }
        if ((i & 32) != 0) {
            str3 = locationRegion.parentName;
        }
        if ((i & 64) != 0) {
            str4 = locationRegion.parentEnName;
        }
        if ((i & 128) != 0) {
            locationLevel2 = locationRegion.parentLevel;
        }
        if ((i & 256) != 0) {
            str5 = locationRegion.l0Code;
        }
        if ((i & 512) != 0) {
            num = locationRegion.locateMethod;
        }
        return locationRegion.copy(j, str, str2, locationLevel, j2, str3, str4, locationLevel2, str5, num);
    }

    public final LocationRegion copy(long j, String str, String str2, LocationLevel level, long j2, String str3, String str4, LocationLevel parentLevel, String str5, Integer num) {
        o.LJIIIZ(level, "level");
        o.LJIIIZ(parentLevel, "parentLevel");
        return new LocationRegion(j, str, str2, level, j2, str3, str4, parentLevel, str5, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRegion)) {
            return false;
        }
        LocationRegion locationRegion = (LocationRegion) obj;
        return this.id == locationRegion.id && o.LJ(this.name, locationRegion.name) && o.LJ(this.enName, locationRegion.enName) && this.level == locationRegion.level && this.parentId == locationRegion.parentId && o.LJ(this.parentName, locationRegion.parentName) && o.LJ(this.parentEnName, locationRegion.parentEnName) && this.parentLevel == locationRegion.parentLevel && o.LJ(this.l0Code, locationRegion.l0Code) && o.LJ(this.locateMethod, locationRegion.locateMethod);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int LLJIJIL = C16880lQ.LLJIJIL(this.id) * 31;
        String str = this.name;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LLJIJIL + hashCode) * 31;
        String str2 = this.enName;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.parentId, (this.level.hashCode() + ((i2 + hashCode2) * 31)) * 31, 31);
        String str3 = this.parentName;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (LIZJ + hashCode3) * 31;
        String str4 = this.parentEnName;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int hashCode6 = (this.parentLevel.hashCode() + ((i3 + hashCode4) * 31)) * 31;
        String str5 = this.l0Code;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i4 = (hashCode6 + hashCode5) * 31;
        Integer num = this.locateMethod;
        if (num != null) {
            i = num.hashCode();
        }
        return i4 + i;
    }

    public final String getRegionCode() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.l0Code);
        LIZ.append('_');
        LIZ.append(this.id);
        LIZ.append('_');
        LIZ.append(this.level.getLevel());
        return X1D.LIZIZ(LIZ);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocationRegion(id=");
        LIZ.append(this.id);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", enName=");
        LIZ.append(this.enName);
        LIZ.append(", level=");
        LIZ.append(this.level);
        LIZ.append(", parentId=");
        LIZ.append(this.parentId);
        LIZ.append(", parentName=");
        LIZ.append(this.parentName);
        LIZ.append(", parentEnName=");
        LIZ.append(this.parentEnName);
        LIZ.append(", parentLevel=");
        LIZ.append(this.parentLevel);
        LIZ.append(", l0Code=");
        LIZ.append(this.l0Code);
        LIZ.append(", locateMethod=");
        return s0.LIZJ(LIZ, this.locateMethod, ')', LIZ);
    }

    public final String getEnName() {
        return this.enName;
    }

    public final long getId() {
        return this.id;
    }

    public final String getL0Code() {
        return this.l0Code;
    }

    public final LocationLevel getLevel() {
        return this.level;
    }

    public final Integer getLocateMethod() {
        return this.locateMethod;
    }

    public final String getName() {
        return this.name;
    }

    public final String getParentEnName() {
        return this.parentEnName;
    }

    public final long getParentId() {
        return this.parentId;
    }

    public final LocationLevel getParentLevel() {
        return this.parentLevel;
    }

    public final String getParentName() {
        return this.parentName;
    }

    @Override // X.InterfaceC57784Mm4
    public boolean areContentsTheSame(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        return o.LJ(other, this);
    }

    @Override // X.InterfaceC57784Mm4
    public boolean areItemTheSame(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        return o.LJ(other, this);
    }

    @Override // X.InterfaceC57784Mm4
    public Object getChangePayload(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        return null;
    }

    public LocationRegion(long j, String str, String str2, LocationLevel level, long j2, String str3, String str4, LocationLevel parentLevel, String str5, Integer num) {
        o.LJIIIZ(level, "level");
        o.LJIIIZ(parentLevel, "parentLevel");
        this.id = j;
        this.name = str;
        this.enName = str2;
        this.level = level;
        this.parentId = j2;
        this.parentName = str3;
        this.parentEnName = str4;
        this.parentLevel = parentLevel;
        this.l0Code = str5;
        this.locateMethod = num;
    }

    public /* synthetic */ LocationRegion(long j, String str, String str2, LocationLevel locationLevel, long j2, String str3, String str4, LocationLevel locationLevel2, String str5, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? LocationLevel.LEVEL_L0 : locationLevel, (i & 16) == 0 ? j2 : 0L, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? LocationLevel.LEVEL_L0 : locationLevel2, (i & 256) == 0 ? str5 : null, (i & 512) != 0 ? -1 : num);
    }
}
