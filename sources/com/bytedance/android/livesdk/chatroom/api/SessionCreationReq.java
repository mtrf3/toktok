package com.bytedance.android.livesdk.chatroom.api;

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
    public Long itemType;

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
        int hashCode = this.organizationId.hashCode() * 31;
        Long l = this.itemType;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.itemId;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.secUid;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.extraJsonString;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
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

    public SessionCreationReq(String organizationId, Long l, Long l2, String str, String str2) {
        o.LJIIIZ(organizationId, "organizationId");
        this.organizationId = organizationId;
        this.itemType = l;
        this.itemId = l2;
        this.secUid = str;
        this.extraJsonString = str2;
    }

    public /* synthetic */ SessionCreationReq(String str, Long l, Long l2, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, l, l2, (i & 8) != 0 ? null : str2, (i & 16) == 0 ? str3 : null);
    }
}
