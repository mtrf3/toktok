package X;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveSparkFixCommonParamsSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Be6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29262Be6 {
    public static final C29262Be6 LIZ = new C29262Be6();
    public static volatile boolean LIZIZ;
    public static volatile java.util.Map<String, Object> LIZJ;

    public static java.util.Map LIZ() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        User owner;
        FollowInfo followInfo;
        String LIZJ2;
        User owner2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Room room = null;
        if (!C29306Beo.LJJI()) {
            room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        }
        String str6 = CardStruct.IStatusCode.DEFAULT;
        if (room == null || (str = C17280m4.LIZ(room)) == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("room_id", str);
        linkedHashMap.put("user_id", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        if (room == null || (owner2 = room.getOwner()) == null || (str2 = C278817o.LIZIZ(owner2)) == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("anchor_id", str2);
        String str7 = "";
        if (room == null) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        } else if (room.getOwner() == null) {
            str3 = "";
        } else {
            str3 = room.getOwner().getSecUid();
        }
        o.LJIIIIZZ(str3, "when {\n             curr…             }\n         }");
        linkedHashMap.put("sec_anchor_id", str3);
        String secUid = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getSecUid();
        if (secUid == null) {
            secUid = "";
        }
        linkedHashMap.put("sec_user_id", secUid);
        if (room != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null && (LIZJ2 = Q4K.LIZJ(followInfo)) != null) {
            str6 = LIZJ2;
        }
        linkedHashMap.put("follow_status", str6);
        if (room == null || (str4 = room.getLog_pb()) == null) {
            str4 = "";
        }
        linkedHashMap.put("log_pb", str4);
        if (room == null || (str5 = room.getRequestId()) == null) {
            str5 = "";
        }
        linkedHashMap.put("request_id", str5);
        Long l = (Long) DataChannelGlobal.LJLJJI.mv0(C29263Be7.class);
        if (l != null) {
            linkedHashMap.put("mock_room_id", String.valueOf(l.longValue()));
        }
        if (LiveSparkFixCommonParamsSetting.INSTANCE.getValue()) {
            linkedHashMap.put("enter_from_merge", BJM.LJFF());
            linkedHashMap.put("enter_method", BJM.LJIIIIZZ());
            linkedHashMap.put("action_type", BJM.LIZLLL());
        } else {
            EnterRoomConfig.RoomsData roomsData = B57.LIZ.LIZ().mEnterRoomConfig.mRoomsData;
            String str8 = roomsData.enterFromMerge;
            if (str8 == null) {
                str8 = "";
            }
            linkedHashMap.put("enter_from_merge", str8);
            String str9 = roomsData.enterMethod;
            if (str9 == null) {
                str9 = "";
            }
            linkedHashMap.put("enter_method", str9);
            String str10 = roomsData.actionType;
            if (str10 != null) {
                str7 = str10;
            }
            linkedHashMap.put("action_type", str7);
        }
        linkedHashMap.put("video_id", BJM.LJIJ());
        linkedHashMap.put("gd_label", BJM.LJIIIZ());
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ef, code lost:
    
        if (X.C65124PhA.LIZLLL() == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f1, code lost:
    
        r1 = X.C65124PhA.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f5, code lost:
    
        if (r1 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f7, code lost:
    
        X.C29262Be6.LIZJ = new java.util.HashMap(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.Object> LIZIZ() {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29262Be6.LIZIZ():java.util.Map");
    }
}
