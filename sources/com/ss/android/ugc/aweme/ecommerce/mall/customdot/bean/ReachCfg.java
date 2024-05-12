package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ReachCfg {

    @InterfaceC65349Pkn("data")
    public final String data;

    @InterfaceC65349Pkn("notice_id")
    public final String noticeId;

    @InterfaceC65349Pkn("style")
    public final String style;

    public static /* synthetic */ ReachCfg copy$default(ReachCfg reachCfg, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reachCfg.style;
        }
        if ((i & 2) != 0) {
            str2 = reachCfg.data;
        }
        if ((i & 4) != 0) {
            str3 = reachCfg.noticeId;
        }
        return reachCfg.copy(str, str2, str3);
    }

    public final ReachCfg copy(String str, String str2, String str3) {
        return new ReachCfg(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReachCfg)) {
            return false;
        }
        ReachCfg reachCfg = (ReachCfg) obj;
        return o.LJ(this.style, reachCfg.style) && o.LJ(this.data, reachCfg.data) && o.LJ(this.noticeId, reachCfg.noticeId);
    }

    public int hashCode() {
        String str = this.style;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.data;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.noticeId;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReachCfg(style=");
        LIZ.append(this.style);
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(", noticeId=");
        return q.LIZIZ(LIZ, this.noticeId, ')', LIZ);
    }

    public final String getData() {
        return this.data;
    }

    public final String getNoticeId() {
        return this.noticeId;
    }

    public final String getStyle() {
        return this.style;
    }

    public ReachCfg(String str, String str2, String str3) {
        this.style = str;
        this.data = str2;
        this.noticeId = str3;
    }
}
