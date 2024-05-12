package com.ss.android.ugc.aweme.donation.token;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SessionCreationReq {

    @InterfaceC65349Pkn("extra")
    public String extraJsonString;

    @InterfaceC65349Pkn("item_id")
    public Long itemId;

    @InterfaceC65349Pkn("item_type")
    public Integer itemType;

    @InterfaceC65349Pkn("organization_id")
    public String organizationId;

    @InterfaceC65349Pkn("sec_uid")
    public String secUid;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionCreationReq)) {
            return false;
        }
        SessionCreationReq sessionCreationReq = (SessionCreationReq) obj;
        return o.LJ(this.organizationId, sessionCreationReq.organizationId) && o.LJ(this.itemType, sessionCreationReq.itemType) && o.LJ(this.itemId, sessionCreationReq.itemId) && o.LJ(this.secUid, sessionCreationReq.secUid) && o.LJ(this.extraJsonString, sessionCreationReq.extraJsonString);
    }

    public final int hashCode() {
        String str = this.organizationId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.itemType;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.itemId;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.secUid;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.extraJsonString;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SessionCreationReq(organizationId=");
        LIZ.append(this.organizationId);
        LIZ.append(", itemType=");
        LIZ.append(this.itemType);
        LIZ.append(", itemId=");
        LIZ.append(this.itemId);
        LIZ.append(", secUid=");
        LIZ.append(this.secUid);
        LIZ.append(", extraJsonString=");
        return q.LIZIZ(LIZ, this.extraJsonString, ')', LIZ);
    }

    public SessionCreationReq(String str, Integer num, Long l, String str2, String str3) {
        this.organizationId = str;
        this.itemType = num;
        this.itemId = l;
        this.secUid = str2;
        this.extraJsonString = str3;
    }

    public /* synthetic */ SessionCreationReq(String str, Integer num, Long l, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, num, l, (i & 8) != 0 ? null : str2, (i & 16) == 0 ? str3 : null);
    }
}
