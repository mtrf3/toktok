package com.bytedance.android.live.liveinteract.multilive.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.List;

/* loaded from: classes14.dex */
public final class ListByTypeResponse extends F9E {

    @InterfaceC65349Pkn("data")
    public MultiLiveGuestInfoList data;

    @InterfaceC65349Pkn("extra")
    public Extra extra;

    /* loaded from: classes14.dex */
    public static final class Extra {

        @InterfaceC65349Pkn("now")
        public long now;
    }

    /* loaded from: classes14.dex */
    public static final class GiftScoreAppliedUser {

        @InterfaceC65349Pkn("gift_score")
        public long giftScore;

        @InterfaceC65349Pkn("list_user")
        public LinkPlayerInfo listUser;
    }

    /* loaded from: classes14.dex */
    public static final class MultiGuestBonus {

        @InterfaceC65349Pkn("is_success")
        public boolean isSuccess;

        @InterfaceC65349Pkn("multi_guest_bonus_value")
        public long multiGuestBonusValue;

        @InterfaceC65349Pkn("multi_guest_bonus_value_string")
        public String multiGuestBonusValueString = "";

        @InterfaceC65349Pkn("multi_guest_bonus_note_string")
        public String multiGuestBonusNoteString = "";
    }

    /* loaded from: classes14.dex */
    public static final class ReservedUser {

        @InterfaceC65349Pkn("reserve_id")
        public long reserveId;

        @InterfaceC65349Pkn("reserve_type")
        public int reserveType;

        @InterfaceC65349Pkn("tag_list")
        public List<String> tagList;

        @InterfaceC65349Pkn("update_time")
        public long updateTime;

        @InterfaceC65349Pkn("user")
        public User user;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        MultiLiveGuestInfoList multiLiveGuestInfoList = this.data;
        return new Object[]{multiLiveGuestInfoList, multiLiveGuestInfoList};
    }
}
