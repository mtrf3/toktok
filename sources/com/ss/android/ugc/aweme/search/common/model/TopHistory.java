package com.ss.android.ugc.aweme.search.common.model;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class TopHistory {

    @InterfaceC65349Pkn("appear_time")
    public String appearTime;

    @InterfaceC65349Pkn("group_id")
    public String groupId;

    @InterfaceC65349Pkn("icon_type")
    public String iconType;

    @InterfaceC65349Pkn("log_id")
    public String logId;

    @InterfaceC65349Pkn("recent_click_time")
    public String recentClickTime;

    @InterfaceC65349Pkn("word")
    public String word;

    /* JADX WARN: Multi-variable type inference failed */
    public TopHistory() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopHistory)) {
            return false;
        }
        TopHistory topHistory = (TopHistory) obj;
        return o.LJ(this.word, topHistory.word) && o.LJ(this.appearTime, topHistory.appearTime) && o.LJ(this.recentClickTime, topHistory.recentClickTime) && o.LJ(this.iconType, topHistory.iconType) && o.LJ(this.groupId, topHistory.groupId) && o.LJ(this.logId, topHistory.logId);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.word;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LJ = C79062V1e.LJ(this.recentClickTime, C79062V1e.LJ(this.appearTime, hashCode * 31, 31), 31);
        String str2 = this.iconType;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (LJ + hashCode2) * 31;
        String str3 = this.groupId;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        String str4 = this.logId;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TopHistory(word=");
        LIZ.append(this.word);
        LIZ.append(", appearTime=");
        LIZ.append(this.appearTime);
        LIZ.append(", recentClickTime=");
        LIZ.append(this.recentClickTime);
        LIZ.append(", iconType=");
        LIZ.append(this.iconType);
        LIZ.append(", groupId=");
        LIZ.append(this.groupId);
        LIZ.append(", logId=");
        return q.LIZIZ(LIZ, this.logId, ')', LIZ);
    }

    public TopHistory(String str, String appearTime, String recentClickTime, String str2, String str3, String str4) {
        o.LJIIIZ(appearTime, "appearTime");
        o.LJIIIZ(recentClickTime, "recentClickTime");
        this.word = str;
        this.appearTime = appearTime;
        this.recentClickTime = recentClickTime;
        this.iconType = str2;
        this.groupId = str3;
        this.logId = str4;
    }

    public /* synthetic */ TopHistory(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) == 0 ? str6 : null);
    }
}
