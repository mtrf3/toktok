package com.ss.android.ugc.aweme.notification.bean;

import X.C79062V1e;
import X.JBR;
import X.MZM;
import X.X1D;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MusNotificationDetailArg implements IRouteArg {
    public static final Parcelable.Creator<MusNotificationDetailArg> CREATOR = new MZM();
    public final String enterFrom;
    public final int groupType;
    public final boolean mergeTikTokShop;
    public final String nid;
    public final long startClickTime;
    public final String tabName;
    public final String title;
    public final int unReadMessageCount;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MusNotificationDetailArg() {
        /*
            r12 = this;
            r1 = 0
            r3 = 0
            r7 = 0
            r10 = 255(0xff, float:3.57E-43)
            r0 = r12
            r2 = r1
            r4 = r3
            r5 = r3
            r6 = r1
            r9 = r3
            r11 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg.<init>():void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MusNotificationDetailArg(int r13) {
        /*
            r12 = this;
            r2 = 0
            r3 = 0
            r7 = 0
            r10 = 254(0xfe, float:3.56E-43)
            r0 = r12
            r1 = r13
            r4 = r3
            r5 = r3
            r6 = r2
            r9 = r3
            r11 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg.<init>(int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MusNotificationDetailArg(int i, int i2) {
        this(i, i2, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0L, 0 == true ? 1 : 0, 252, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MusNotificationDetailArg(int i, int i2, String str) {
        this(i, i2, str, null, 0 == true ? 1 : 0, false, 0L, 0 == true ? 1 : 0, 248, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MusNotificationDetailArg(int i, int i2, String str, String title) {
        this(i, i2, str, title, null, false, 0L, 0 == true ? 1 : 0, 240, 0 == true ? 1 : 0);
        o.LJIIIZ(title, "title");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MusNotificationDetailArg(int i, int i2, String str, String title, String str2) {
        this(i, i2, str, title, str2, false, 0L, null, 224, 0 == true ? 1 : 0);
        o.LJIIIZ(title, "title");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MusNotificationDetailArg(int i, int i2, String str, String title, String str2, boolean z) {
        this(i, i2, str, title, str2, z, 0L, null, 192, 0 == true ? 1 : 0);
        o.LJIIIZ(title, "title");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MusNotificationDetailArg(int i, int i2, String str, String title, String str2, boolean z, long j) {
        this(i, i2, str, title, str2, z, j, null, 128, 0 == true ? 1 : 0);
        o.LJIIIZ(title, "title");
    }

    public static MusNotificationDetailArg __fromBundle(Bundle bundle) {
        Integer num;
        Integer num2;
        String str;
        String str2;
        String str3;
        Boolean bool;
        Long l;
        String str4 = null;
        if (bundle == null) {
            return null;
        }
        int i = 1;
        if (bundle.containsKey("from_where")) {
            num = (Integer) RouteParser.INSTANCE.parse(bundle.get("from_where"), Integer.class);
            if (num != null) {
                i = 0;
            }
        } else {
            num = null;
        }
        if (bundle.containsKey("unRead_message_count")) {
            num2 = (Integer) RouteParser.INSTANCE.parse(bundle.get("unRead_message_count"), Integer.class);
            if (num2 == null) {
                i += 2;
            }
        } else {
            i += 2;
            num2 = null;
        }
        if (bundle.containsKey("second_tab_name")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("second_tab_name"), String.class);
        } else {
            i += 4;
            str = null;
        }
        if (bundle.containsKey("title")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("title"), String.class);
        } else {
            i += 8;
            str2 = null;
        }
        if (bundle.containsKey("nid")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("nid"), String.class);
        } else {
            i += 16;
            str3 = null;
        }
        if (bundle.containsKey("ec_merged_tiktok_shop")) {
            bool = (Boolean) RouteParser.INSTANCE.parse(bundle.get("ec_merged_tiktok_shop"), Boolean.class);
            if (bool == null) {
                i += 32;
            }
        } else {
            i += 32;
            bool = null;
        }
        if (bundle.containsKey("start_click_time")) {
            l = (Long) RouteParser.INSTANCE.parse(bundle.get("start_click_time"), Long.class);
            if (l == null) {
                i += 64;
            }
        } else {
            i += 64;
            l = null;
        }
        if (bundle.containsKey("enter_from")) {
            str4 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_from"), String.class);
        } else {
            i += 128;
        }
        return new MusNotificationDetailArg(num != null ? num.intValue() : 0, num2 != null ? num2.intValue() : 0, str, str2, str3, bool != null ? bool.booleanValue() : false, l != null ? l.longValue() : 0L, str4, i, null);
    }

    public static /* synthetic */ MusNotificationDetailArg copy$default(MusNotificationDetailArg musNotificationDetailArg, int i, int i2, String str, String str2, String str3, boolean z, long j, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = musNotificationDetailArg.groupType;
        }
        if ((i3 & 2) != 0) {
            i2 = musNotificationDetailArg.unReadMessageCount;
        }
        if ((i3 & 4) != 0) {
            str = musNotificationDetailArg.tabName;
        }
        if ((i3 & 8) != 0) {
            str2 = musNotificationDetailArg.title;
        }
        if ((i3 & 16) != 0) {
            str3 = musNotificationDetailArg.nid;
        }
        if ((i3 & 32) != 0) {
            z = musNotificationDetailArg.mergeTikTokShop;
        }
        if ((i3 & 64) != 0) {
            j = musNotificationDetailArg.startClickTime;
        }
        if ((i3 & 128) != 0) {
            str4 = musNotificationDetailArg.enterFrom;
        }
        return musNotificationDetailArg.copy(i, i2, str, str2, str3, z, j, str4);
    }

    public final MusNotificationDetailArg copy(int i, int i2, String str, String title, String str2, boolean z, long j, String str3) {
        o.LJIIIZ(title, "title");
        return new MusNotificationDetailArg(i, i2, str, title, str2, z, j, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusNotificationDetailArg)) {
            return false;
        }
        MusNotificationDetailArg musNotificationDetailArg = (MusNotificationDetailArg) obj;
        return this.groupType == musNotificationDetailArg.groupType && this.unReadMessageCount == musNotificationDetailArg.unReadMessageCount && o.LJ(this.tabName, musNotificationDetailArg.tabName) && o.LJ(this.title, musNotificationDetailArg.title) && o.LJ(this.nid, musNotificationDetailArg.nid) && this.mergeTikTokShop == musNotificationDetailArg.mergeTikTokShop && this.startClickTime == musNotificationDetailArg.startClickTime && o.LJ(this.enterFrom, musNotificationDetailArg.enterFrom);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.groupType);
        out.writeInt(this.unReadMessageCount);
        out.writeString(this.tabName);
        out.writeString(this.title);
        out.writeString(this.nid);
        out.writeInt(this.mergeTikTokShop ? 1 : 0);
        out.writeLong(this.startClickTime);
        out.writeString(this.enterFrom);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i = ((this.groupType * 31) + this.unReadMessageCount) * 31;
        String str = this.tabName;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LJ = C79062V1e.LJ(this.title, (i + hashCode) * 31, 31);
        String str2 = this.nid;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (LJ + hashCode2) * 31;
        boolean z = this.mergeTikTokShop;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int LIZJ = JBR.LIZJ(this.startClickTime, (i3 + i4) * 31, 31);
        String str3 = this.enterFrom;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return LIZJ + i2;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusNotificationDetailArg(groupType=");
        LIZ.append(this.groupType);
        LIZ.append(", unReadMessageCount=");
        LIZ.append(this.unReadMessageCount);
        LIZ.append(", tabName=");
        LIZ.append(this.tabName);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", nid=");
        LIZ.append(this.nid);
        LIZ.append(", mergeTikTokShop=");
        LIZ.append(this.mergeTikTokShop);
        LIZ.append(", startClickTime=");
        LIZ.append(this.startClickTime);
        LIZ.append(", enterFrom=");
        return q.LIZIZ(LIZ, this.enterFrom, ')', LIZ);
    }

    public MusNotificationDetailArg(int i, int i2, String str, String title, String str2, boolean z, long j, String str3) {
        o.LJIIIZ(title, "title");
        this.groupType = i;
        this.unReadMessageCount = i2;
        this.tabName = str;
        this.title = title;
        this.nid = str2;
        this.mergeTikTokShop = z;
        this.startClickTime = j;
        this.enterFrom = str3;
    }

    public /* synthetic */ MusNotificationDetailArg(int i, int i2, String str, String str2, String str3, boolean z, long j, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? null : str3, (i3 & 32) == 0 ? z : false, (i3 & 64) != 0 ? 0L : j, (i3 & 128) == 0 ? str4 : null);
    }
}
