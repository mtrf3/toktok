package com.ss.android.ugc.aweme.notificationlive.ui;

import X.C61878OQg;
import X.C72909SjR;
import X.F9E;
import X.InterfaceC61312at;
import com.bytedance.jedi.arch.ext.list.ListState;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class NotificationChoiceState extends F9E implements InterfaceC61312at {
    public final String hotsoonText;
    public final boolean isHotsoonHasMore;
    public final boolean isSelf;
    public final ListState listState;
    public final boolean pushSwitchState;
    public final String secUserId;
    public final HashMap<String, Integer> unreadCountMap;
    public final List<String> unreadUidList;
    public final String userId;
    public final int vcdCount;

    public NotificationChoiceState() {
        this(null, null, false, null, false, 0, null, false, null, null, 1023, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationChoiceState copy$default(NotificationChoiceState notificationChoiceState, String str, String str2, boolean z, ListState listState, boolean z2, int i, String str3, boolean z3, HashMap hashMap, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = notificationChoiceState.userId;
        }
        if ((i2 & 2) != 0) {
            str2 = notificationChoiceState.secUserId;
        }
        if ((i2 & 4) != 0) {
            z = notificationChoiceState.isSelf;
        }
        if ((i2 & 8) != 0) {
            listState = notificationChoiceState.listState;
        }
        if ((i2 & 16) != 0) {
            z2 = notificationChoiceState.isHotsoonHasMore;
        }
        if ((i2 & 32) != 0) {
            i = notificationChoiceState.vcdCount;
        }
        if ((i2 & 64) != 0) {
            str3 = notificationChoiceState.hotsoonText;
        }
        if ((i2 & 128) != 0) {
            z3 = notificationChoiceState.pushSwitchState;
        }
        if ((i2 & 256) != 0) {
            hashMap = notificationChoiceState.unreadCountMap;
        }
        if ((i2 & 512) != 0) {
            list = notificationChoiceState.unreadUidList;
        }
        return notificationChoiceState.copy(str, str2, z, listState, z2, i, str3, z3, hashMap, list);
    }

    public final NotificationChoiceState copy(String userId, String secUserId, boolean z, ListState listState, boolean z2, int i, String hotsoonText, boolean z3, HashMap<String, Integer> unreadCountMap, List<String> unreadUidList) {
        o.LJIIIZ(userId, "userId");
        o.LJIIIZ(secUserId, "secUserId");
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(hotsoonText, "hotsoonText");
        o.LJIIIZ(unreadCountMap, "unreadCountMap");
        o.LJIIIZ(unreadUidList, "unreadUidList");
        return new NotificationChoiceState(userId, secUserId, z, listState, z2, i, hotsoonText, z3, unreadCountMap, unreadUidList);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.userId, this.secUserId, Boolean.valueOf(this.isSelf), this.listState, Boolean.valueOf(this.isHotsoonHasMore), Integer.valueOf(this.vcdCount), this.hotsoonText, Boolean.valueOf(this.pushSwitchState), this.unreadCountMap, this.unreadUidList};
    }

    public final String getHotsoonText() {
        return this.hotsoonText;
    }

    public final ListState getListState() {
        return this.listState;
    }

    public final boolean getPushSwitchState() {
        return this.pushSwitchState;
    }

    public final String getSecUserId() {
        return this.secUserId;
    }

    public final HashMap<String, Integer> getUnreadCountMap() {
        return this.unreadCountMap;
    }

    public final List<String> getUnreadUidList() {
        return this.unreadUidList;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int getVcdCount() {
        return this.vcdCount;
    }

    public final boolean isHotsoonHasMore() {
        return this.isHotsoonHasMore;
    }

    public final boolean isSelf() {
        return this.isSelf;
    }

    public NotificationChoiceState(String userId, String secUserId, boolean z, ListState listState, boolean z2, int i, String hotsoonText, boolean z3, HashMap<String, Integer> unreadCountMap, List<String> unreadUidList) {
        o.LJIIIZ(userId, "userId");
        o.LJIIIZ(secUserId, "secUserId");
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(hotsoonText, "hotsoonText");
        o.LJIIIZ(unreadCountMap, "unreadCountMap");
        o.LJIIIZ(unreadUidList, "unreadUidList");
        this.userId = userId;
        this.secUserId = secUserId;
        this.isSelf = z;
        this.listState = listState;
        this.isHotsoonHasMore = z2;
        this.vcdCount = i;
        this.hotsoonText = hotsoonText;
        this.pushSwitchState = z3;
        this.unreadCountMap = unreadCountMap;
        this.unreadUidList = unreadUidList;
    }

    public NotificationChoiceState(String str, String str2, boolean z, ListState listState, boolean z2, int i, String str3, boolean z3, HashMap hashMap, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? new ListState(new C72909SjR(false, 0, 0L, false, 0, 0, false, 255), null, null, null, null, 30, null) : listState, (i2 & 16) != 0 ? false : z2, (i2 & 32) == 0 ? i : 0, (i2 & 64) == 0 ? str3 : "", (i2 & 128) != 0 ? true : z3, (i2 & 256) != 0 ? new HashMap() : hashMap, (i2 & 512) != 0 ? C61878OQg.INSTANCE : list);
    }
}
