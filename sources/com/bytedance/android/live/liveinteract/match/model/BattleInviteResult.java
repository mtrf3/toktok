package com.bytedance.android.live.liveinteract.match.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class BattleInviteResult extends F9E {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes14.dex */
    public static final class ResponseData extends F9E {

        @InterfaceC65349Pkn("battle_id")
        public Long battleId;

        @InterfaceC65349Pkn("inviter_gift_permission_type")
        public int inviterGiftPermissionType;

        @Override // X.F9E
        public final Object[] getObjects() {
            Long l = this.battleId;
            return new Object[]{l, l, Integer.valueOf(this.inviterGiftPermissionType)};
        }
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        ResponseData responseData = this.data;
        return new Object[]{responseData, responseData};
    }
}
