package com.bytedance.pns.scopedid;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class IdPair extends F9E {

    @InterfaceC65349Pkn("biz_id")
    public final String bizId;

    @InterfaceC65349Pkn("biz_user_id")
    public final String bizUserId;

    public static /* synthetic */ IdPair copy$default(IdPair idPair, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = idPair.bizId;
        }
        if ((i & 2) != 0) {
            str2 = idPair.bizUserId;
        }
        return idPair.copy(str, str2);
    }

    public final IdPair copy(String bizId, String bizUserId) {
        o.LJIIIZ(bizId, "bizId");
        o.LJIIIZ(bizUserId, "bizUserId");
        return new IdPair(bizId, bizUserId);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.bizId, this.bizUserId};
    }

    public final String getBizId() {
        return this.bizId;
    }

    public final String getBizUserId() {
        return this.bizUserId;
    }

    public IdPair(String bizId, String bizUserId) {
        o.LJIIIZ(bizId, "bizId");
        o.LJIIIZ(bizUserId, "bizUserId");
        this.bizId = bizId;
        this.bizUserId = bizUserId;
    }
}
