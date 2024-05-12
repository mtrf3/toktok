package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.SubscribeBadge;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.TimerDetail;
import com.bytedance.android.livesdk.dataChannel.PreviewSubOnlyLiveSwitchChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewSubOnlyMusicSwitchChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewSubOnlyTrialLiveSwitchChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.subscription.EnableSubOnlyLiveSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubOnlyChatConfig;
import com.bytedance.android.livesdk.livesetting.subscription.SubscribeRoomPositionSetting;
import com.bytedance.android.livesdk.livesetting.subscription.SubscriptionAnchorToolbarEntranceSetting;
import com.bytedance.android.livesdk.livesetting.wallet.CanRechargeSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Bdc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29232Bdc {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        Boolean bool = (Boolean) DataChannelGlobal.LJLJJI.mv0(PreviewSubOnlyMusicSwitchChannel.class);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean LIZIZ() {
        Boolean bool = (Boolean) DataChannelGlobal.LJLJJI.mv0(PreviewSubOnlyLiveSwitchChannel.class);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean LIZJ() {
        Boolean bool = (Boolean) DataChannelGlobal.LJLJJI.mv0(PreviewSubOnlyTrialLiveSwitchChannel.class);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final boolean LJIIL() {
        return LJIILIIL((Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class));
    }

    public static final boolean LJIILJJIL() {
        return SubscribeRoomPositionSetting.INSTANCE.isNewPosition();
    }

    public static boolean LJIJI() {
        Boolean bool;
        String valueOf = String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        java.util.Map<String, Boolean> LIZJ = InterfaceC30442Bx8.LJJZ.LIZJ();
        if (LIZJ != null && (bool = LIZJ.get(valueOf)) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static String LIZLLL(TimerDetail timerDetail) {
        Integer valueOf;
        if (timerDetail != null && (valueOf = Integer.valueOf(timerDetail.timerStatus)) != null) {
            if (valueOf.intValue() == 0) {
                return "not_start";
            }
            if (valueOf.intValue() == 1) {
                return "on_going";
            }
            if (valueOf.intValue() == 2) {
                return "suspended";
            }
            if (valueOf.intValue() != 3) {
                valueOf.intValue();
            }
        }
        return "not_set";
    }

    public static final ImageModel LJ(Room room) {
        User owner;
        SubscribeInfo subscribeInfo;
        SubscribeBadge subscribeBadge;
        if (room != null && (owner = room.getOwner()) != null && (subscribeInfo = owner.getSubscribeInfo()) != null && (subscribeBadge = subscribeInfo.getSubscribeBadge()) != null) {
            return subscribeBadge.getOriginImage();
        }
        return null;
    }

    public static final boolean LJFF(DataChannel dataChannel) {
        Room room;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        UserAttr userAttr;
        java.util.Map<Integer, Integer> map;
        Integer num;
        User owner;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        if (room != null && room.liveSubOnly == 1) {
            z = true;
        } else {
            z = false;
        }
        if (dataChannel != null) {
            z2 = o.LJ(dataChannel.kv0(UserIsAnchorChannel.class), Boolean.TRUE);
        } else {
            z2 = false;
        }
        if (room != null && (owner = room.getOwner()) != null && owner.isSubscribed()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (dataChannel != null && C79146V4k.LJJJI(dataChannel)) {
            z4 = true;
        } else {
            z4 = false;
        }
        User LIZIZ = C05200Ii.LIZIZ();
        if (LIZIZ == null || (userAttr = LIZIZ.getUserAttr()) == null || (map = userAttr.adminPermissions) == null || (num = map.get(11)) == null || num.intValue() != 1) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z && !z2 && !z3 && (!z4 || !z5)) {
            return true;
        }
        return false;
    }

    public static final boolean LJI(BKI status) {
        o.LJIIIZ(status, "status");
        if (status == BKI.NON_SUBSCRIBER_TRIAL_LIVE || status == BKI.NON_SUBSCRIBER_FORBIDDEN_LIVE) {
            return true;
        }
        return false;
    }

    public static final boolean LJII(DataChannel dataChannel) {
        boolean z;
        Room room;
        User owner;
        SubscribeInfo subscribeInfo;
        Boolean bool;
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
            if (dataChannel == null) {
                room = null;
                if (C78609UtB.LJJJZ(z) || z || room == null || (owner = room.getOwner()) == null || (subscribeInfo = owner.getSubscribeInfo()) == null || !subscribeInfo.isAnchorQualified()) {
                    return false;
                }
                return true;
            }
        }
        room = (Room) dataChannel.kv0(RoomChannel.class);
        if (C78609UtB.LJJJZ(z)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIIIZZ(DataChannel dataChannel) {
        Object obj;
        User owner;
        Boolean bool = null;
        if (dataChannel != null) {
            obj = dataChannel.kv0(UserIsAnchorChannel.class);
            Room room = (Room) dataChannel.kv0(RoomChannel.class);
            if (room != null && (owner = room.getOwner()) != null) {
                bool = Boolean.valueOf(owner.isAnchorHasSubQualification());
            }
        } else {
            obj = null;
        }
        Boolean bool2 = Boolean.TRUE;
        if (o.LJ(obj, bool2) && o.LJ(bool, bool2) && SubscriptionAnchorToolbarEntranceSetting.INSTANCE.isEnable()) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIIZ(DataChannel dataChannel) {
        Room room;
        boolean z;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
            Boolean bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class);
            if (bool != null) {
                z = bool.booleanValue();
                return LJIIJ(z, room);
            }
        } else {
            room = null;
        }
        z = false;
        return LJIIJ(z, room);
    }

    public static final boolean LJIIJJI(DataChannel dataChannel) {
        Room room;
        Object obj;
        Boolean bool;
        boolean z;
        boolean z2;
        Boolean bool2;
        RoomAuthStatus roomAuthStatus;
        User owner;
        Object obj2 = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
            obj = dataChannel.kv0(UserIsAnchorChannel.class);
        } else {
            room = null;
            obj = null;
        }
        if (room != null && (owner = room.getOwner()) != null) {
            bool = Boolean.valueOf(owner.isAnchorHasSubQualification());
        } else {
            bool = null;
        }
        if ((room != null && (roomAuthStatus = room.getRoomAuthStatus()) != null && !roomAuthStatus.enableChat) || !LiveSubOnlyChatConfig.INSTANCE.onLiveSwitchEnable()) {
            z = false;
        } else {
            z = true;
        }
        if (EnableSubOnlyLiveSetting.INSTANCE.isEnable()) {
            if (dataChannel != null) {
                obj2 = dataChannel.kv0(BCX.class);
            }
            if (obj2 != LiveMode.THIRD_PARTY) {
                z2 = true;
                bool2 = Boolean.TRUE;
                if (!o.LJ(obj, bool2) && o.LJ(bool, bool2) && (z || z2)) {
                    return true;
                }
                return false;
            }
        }
        z2 = false;
        bool2 = Boolean.TRUE;
        if (!o.LJ(obj, bool2)) {
        }
        return false;
    }

    public static final boolean LJIILIIL(Room room) {
        if (room == null || room.liveSubOnly != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILL(Room room) {
        User owner;
        if (room == null || (owner = room.getOwner()) == null || !owner.isSubscribed()) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILLIIL(DataChannel dataChannel) {
        boolean z;
        boolean z2;
        boolean z3;
        User owner;
        if (dataChannel != null) {
            Room room = (Room) dataChannel.kv0(RoomChannel.class);
            if (room != null && room.liveSubOnly == 1) {
                z = true;
            } else {
                z = false;
            }
            if (dataChannel != null) {
                z2 = o.LJ(dataChannel.kv0(UserIsAnchorChannel.class), Boolean.TRUE);
            } else {
                z2 = false;
            }
            if (room != null && (owner = room.getOwner()) != null && owner.isSubscribed()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z && !z2 && z3) {
                return true;
            }
        }
        return false;
    }

    public static final java.util.Map<String, String> LJIIZILJ(GetSubInfoResponse getSubInfoResponse) {
        String str;
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (getSubInfoResponse != null) {
            if (getSubInfoResponse.qualification) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap2.put("is_opt_in", str2);
        }
        linkedHashMap.putAll(linkedHashMap2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        if (getSubInfoResponse != null) {
            if (getSubInfoResponse.enable) {
                str = "yes";
            } else {
                str = "no";
            }
            linkedHashMap3.put("subscribe_privilege", str);
        }
        linkedHashMap.putAll(linkedHashMap3);
        return linkedHashMap;
    }

    public static void LJIJ(boolean z) {
        String valueOf = String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        C48459J0d<java.util.Map<String, Boolean>> c48459J0d = InterfaceC30442Bx8.LJJZ;
        java.util.Map<String, Boolean> LIZJ = c48459J0d.LIZJ();
        if (LIZJ != null) {
            LIZJ.put(valueOf, Boolean.valueOf(z));
        }
        c48459J0d.LIZ(c48459J0d.LIZJ());
    }

    public static final java.util.Map<String, String> LJIJJ(DataChannel dataChannel) {
        Room room;
        boolean z;
        Boolean bool;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        return LJIJJLI(z, false, room);
    }

    public static final String LJIL(Room room) {
        Boolean bool;
        User owner;
        SubscribeInfo subscribeInfo;
        User owner2;
        Boolean bool2 = null;
        if (room != null && (owner2 = room.getOwner()) != null) {
            bool = Boolean.valueOf(owner2.isSubscribed());
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            return "subscribed_not_expired";
        }
        if (room != null && (owner = room.getOwner()) != null && (subscribeInfo = owner.getSubscribeInfo()) != null) {
            bool2 = Boolean.valueOf(subscribeInfo.isInGracePeriod());
        }
        if (!C29306Beo.LJIL(bool2)) {
            return "subscribed_expired_grace_period";
        }
        return "not_subscribed";
    }

    public static final boolean LJIIJ(boolean z, Room room) {
        RoomAuthStatus roomAuthStatus;
        if (!C78609UtB.LJJJZ(z) || room == null || (roomAuthStatus = room.getRoomAuthStatus()) == null || !roomAuthStatus.chatSubOnly) {
            return false;
        }
        return true;
    }

    public static final java.util.Map LJIJJLI(boolean z, boolean z2, Room room) {
        String str;
        User owner;
        SubscribeInfo subscribeInfo;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            return linkedHashMap;
        }
        if (z2) {
            return linkedHashMap;
        }
        if (room != null && (owner = room.getOwner()) != null && (subscribeInfo = owner.getSubscribeInfo()) != null && subscribeInfo.isAnchorQualified() && CanRechargeSetting.INSTANCE.getValue() && C78609UtB.LJJJZ(z)) {
            str = "no";
        } else {
            str = "yes";
        }
        linkedHashMap.put("subscribe_limit", str);
        return linkedHashMap;
    }
}
