package com.ss.android.ugc.aweme.shortvideo.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AutoSelectedAnchorInfos implements Serializable {
    public static final Companion Companion = new Companion();
    public static final long serialVersionUID = -5818;

    @InterfaceC65349Pkn("anchor_shoot_way")
    public String anchorShootWay;

    @InterfaceC65349Pkn("anchor_source_type")
    public String anchorSourceType;

    @InterfaceC65349Pkn("open_platform_extra")
    public String openPlatFormExtra;

    @InterfaceC65349Pkn("open_platform_add_from")
    public Integer openPlatformAddFrom;

    @InterfaceC65349Pkn("open_platform_client_key")
    public String openPlatformClientKey;

    @InterfaceC65349Pkn("open_platform_share_id")
    public String openPlatformShareId;

    /* JADX WARN: Multi-variable type inference failed */
    public AutoSelectedAnchorInfos() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AutoSelectedAnchorInfos(String str) {
        this(str, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 62, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AutoSelectedAnchorInfos(String str, String str2) {
        this(str, str2, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 60, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AutoSelectedAnchorInfos(String str, String str2, String str3) {
        this(str, str2, str3, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 56, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AutoSelectedAnchorInfos(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, null, 0 == true ? 1 : 0, 48, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AutoSelectedAnchorInfos(String str, String str2, String str3, String str4, Integer num) {
        this(str, str2, str3, str4, num, null, 32, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AutoSelectedAnchorInfos copy$default(AutoSelectedAnchorInfos autoSelectedAnchorInfos, String str, String str2, String str3, String str4, Integer num, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autoSelectedAnchorInfos.openPlatformClientKey;
        }
        if ((i & 2) != 0) {
            str2 = autoSelectedAnchorInfos.openPlatFormExtra;
        }
        if ((i & 4) != 0) {
            str3 = autoSelectedAnchorInfos.anchorSourceType;
        }
        if ((i & 8) != 0) {
            str4 = autoSelectedAnchorInfos.openPlatformShareId;
        }
        if ((i & 16) != 0) {
            num = autoSelectedAnchorInfos.openPlatformAddFrom;
        }
        if ((i & 32) != 0) {
            str5 = autoSelectedAnchorInfos.anchorShootWay;
        }
        return autoSelectedAnchorInfos.copy(str, str2, str3, str4, num, str5);
    }

    public final AutoSelectedAnchorInfos copy(String str, String str2, String str3, String str4, Integer num, String str5) {
        return new AutoSelectedAnchorInfos(str, str2, str3, str4, num, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoSelectedAnchorInfos)) {
            return false;
        }
        AutoSelectedAnchorInfos autoSelectedAnchorInfos = (AutoSelectedAnchorInfos) obj;
        return o.LJ(this.openPlatformClientKey, autoSelectedAnchorInfos.openPlatformClientKey) && o.LJ(this.openPlatFormExtra, autoSelectedAnchorInfos.openPlatFormExtra) && o.LJ(this.anchorSourceType, autoSelectedAnchorInfos.anchorSourceType) && o.LJ(this.openPlatformShareId, autoSelectedAnchorInfos.openPlatformShareId) && o.LJ(this.openPlatformAddFrom, autoSelectedAnchorInfos.openPlatformAddFrom) && o.LJ(this.anchorShootWay, autoSelectedAnchorInfos.anchorShootWay);
    }

    public int hashCode() {
        String str = this.openPlatformClientKey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.openPlatFormExtra;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.anchorSourceType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.openPlatformShareId;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.openPlatformAddFrom;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.anchorShootWay;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoSelectedAnchorInfos(openPlatformClientKey=");
        LIZ.append(this.openPlatformClientKey);
        LIZ.append(", openPlatFormExtra=");
        LIZ.append(this.openPlatFormExtra);
        LIZ.append(", anchorSourceType=");
        LIZ.append(this.anchorSourceType);
        LIZ.append(", openPlatformShareId=");
        LIZ.append(this.openPlatformShareId);
        LIZ.append(", openPlatformAddFrom=");
        LIZ.append(this.openPlatformAddFrom);
        LIZ.append(", anchorShootWay=");
        return q.LIZIZ(LIZ, this.anchorShootWay, ')', LIZ);
    }

    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final String getAnchorShootWay() {
        return this.anchorShootWay;
    }

    public final String getAnchorSourceType() {
        return this.anchorSourceType;
    }

    public final String getOpenPlatFormExtra() {
        return this.openPlatFormExtra;
    }

    public final Integer getOpenPlatformAddFrom() {
        return this.openPlatformAddFrom;
    }

    public final String getOpenPlatformClientKey() {
        return this.openPlatformClientKey;
    }

    public final String getOpenPlatformShareId() {
        return this.openPlatformShareId;
    }

    public final void setAnchorShootWay(String str) {
        this.anchorShootWay = str;
    }

    public final void setAnchorSourceType(String str) {
        this.anchorSourceType = str;
    }

    public final void setOpenPlatFormExtra(String str) {
        this.openPlatFormExtra = str;
    }

    public final void setOpenPlatformAddFrom(Integer num) {
        this.openPlatformAddFrom = num;
    }

    public final void setOpenPlatformClientKey(String str) {
        this.openPlatformClientKey = str;
    }

    public final void setOpenPlatformShareId(String str) {
        this.openPlatformShareId = str;
    }

    public AutoSelectedAnchorInfos(String str, String str2, String str3, String str4, Integer num, String str5) {
        this.openPlatformClientKey = str;
        this.openPlatFormExtra = str2;
        this.anchorSourceType = str3;
        this.openPlatformShareId = str4;
        this.openPlatformAddFrom = num;
        this.anchorShootWay = str5;
    }

    public /* synthetic */ AutoSelectedAnchorInfos(String str, String str2, String str3, String str4, Integer num, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) == 0 ? str5 : null);
    }
}
