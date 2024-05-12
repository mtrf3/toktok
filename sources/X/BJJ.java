package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes6.dex */
public final class BJJ implements BU3<Room> {
    public static void LIZIZ(java.util.Map map, Room room) {
        Object obj;
        String str;
        String str2;
        Object obj2;
        Object obj3;
        if (room == null) {
            return;
        }
        if (room.getId() != 0) {
            map.put("room_id", String.valueOf(room.getId()));
        }
        map.put("orientation", String.valueOf(room.getOrientation()));
        String str3 = "1";
        if (room.hasCommerceGoods) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_sale", obj);
        if (room.hasCommerceGoods) {
            str = "1";
        } else {
            CommerceStruct commerceStruct = room.getCommerceStruct();
            if (commerceStruct != null && commerceStruct.commercePermission == 1) {
                str = "2";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
        }
        map.put("is_ecom", str);
        LiveEventInfo liveEventInfo = room.liveEventInfo;
        if (liveEventInfo != null) {
            map.put("live_event_id", String.valueOf(liveEventInfo.eventId));
            if (room.liveEventInfo.subscribed.booleanValue()) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_registered", obj2);
            if (!room.liveEventInfo.isPaidEvent.booleanValue()) {
                obj3 = "1";
            } else {
                obj3 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_free_event", obj3);
        }
        if (!TextUtils.isEmpty(room.getRequestId())) {
            map.put("request_id", room.getRequestId());
        }
        if (!TextUtils.isEmpty(room.getLog_pb())) {
            map.put("log_pb", room.getLog_pb());
        } else {
            map.remove("log_pb");
        }
        if (room.getOwner() != null) {
            map.put("anchor_id", String.valueOf(room.getOwner().getId()));
            if (room.getOwner().getFollowInfo() != null) {
                map.put("follow_status", String.valueOf(room.getOwner().getFollowInfo().getFollowStatus()));
            }
        } else {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
        }
        if (!TextUtils.isEmpty(room.getSourceType())) {
            map.put("moment_room_source", room.getSourceType());
        }
        map.put("live_type", C28509BGv.LIZ(room.getStreamType()));
        map.put("room_orientation", String.valueOf(room.getRoomOrientation()));
        Hashtag hashtag = room.hashtag;
        if (hashtag != null) {
            if (!hashtag.isUseGameTagAsHashTag()) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            if (TextUtils.isEmpty(room.hashtag.title)) {
                str2 = LiveGiftNewGifterBadgeSetting.DEFAULT;
            } else {
                str2 = room.hashtag.title;
            }
            map.put("hashtag_id", String.valueOf(room.hashtag.id));
            map.put("hashtag_type", str2);
            map.put("hashtag_name", str2);
            map.put("hashtag_is_game", str3);
        }
    }

    @Override // X.BU3
    public final /* bridge */ /* synthetic */ void LIZ(Object obj, java.util.Map map) {
        LIZIZ(map, (Room) obj);
    }
}
