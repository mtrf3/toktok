package com.ss.android.ugc.aweme.account.security;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SafeInfoNoticeMsg {

    @InterfaceC65349Pkn("has_notice")
    public final boolean hasNotice;

    @InterfaceC65349Pkn("highlight")
    public final List<SafeInfoNoticeMsgHighlight> highlight;

    @InterfaceC65349Pkn("notice")
    public final String notice;

    @InterfaceC65349Pkn("notice_id_str")
    public final String noticeId;

    @InterfaceC65349Pkn("notice_model")
    public final String noticeModel;

    @InterfaceC65349Pkn("notice_type")
    public final String noticeType;

    @InterfaceC65349Pkn("scheme")
    public final String scheme;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeInfoNoticeMsg() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SafeInfoNoticeMsg)) {
            return false;
        }
        SafeInfoNoticeMsg safeInfoNoticeMsg = (SafeInfoNoticeMsg) obj;
        return o.LJ(this.noticeId, safeInfoNoticeMsg.noticeId) && o.LJ(this.notice, safeInfoNoticeMsg.notice) && o.LJ(this.highlight, safeInfoNoticeMsg.highlight) && this.hasNotice == safeInfoNoticeMsg.hasNotice && o.LJ(this.noticeType, safeInfoNoticeMsg.noticeType) && o.LJ(this.noticeModel, safeInfoNoticeMsg.noticeModel) && o.LJ(this.scheme, safeInfoNoticeMsg.scheme);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.notice, this.noticeId.hashCode() * 31, 31);
        List<SafeInfoNoticeMsgHighlight> list = this.highlight;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i = (LJ + hashCode) * 31;
        boolean z = this.hasNotice;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return this.scheme.hashCode() + C79062V1e.LJ(this.noticeModel, C79062V1e.LJ(this.noticeType, (i + i2) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SafeInfoNoticeMsg(noticeId=");
        LIZ.append(this.noticeId);
        LIZ.append(", notice=");
        LIZ.append(this.notice);
        LIZ.append(", highlight=");
        LIZ.append(this.highlight);
        LIZ.append(", hasNotice=");
        LIZ.append(this.hasNotice);
        LIZ.append(", noticeType=");
        LIZ.append(this.noticeType);
        LIZ.append(", noticeModel=");
        LIZ.append(this.noticeModel);
        LIZ.append(", scheme=");
        return q.LIZIZ(LIZ, this.scheme, ')', LIZ);
    }

    public SafeInfoNoticeMsg(String noticeId, String notice, List<SafeInfoNoticeMsgHighlight> list, boolean z, String noticeType, String noticeModel, String scheme) {
        o.LJIIIZ(noticeId, "noticeId");
        o.LJIIIZ(notice, "notice");
        o.LJIIIZ(noticeType, "noticeType");
        o.LJIIIZ(noticeModel, "noticeModel");
        o.LJIIIZ(scheme, "scheme");
        this.noticeId = noticeId;
        this.notice = notice;
        this.highlight = list;
        this.hasNotice = z;
        this.noticeType = noticeType;
        this.noticeModel = noticeModel;
        this.scheme = scheme;
    }

    public /* synthetic */ SafeInfoNoticeMsg(String str, String str2, List list, boolean z, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? false : z, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) == 0 ? str5 : "");
    }
}
