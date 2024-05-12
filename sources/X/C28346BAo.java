package X;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveSparkFixCommonParamsSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.BAo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28346BAo {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(LiveDialog liveDialog) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", liveDialog, new Object[0], "void", new C65300Pk0(false, "()V", "1885654500922538353")).LIZ) {
            return;
        }
        liveDialog.show();
    }

    public static java.util.Map LIZIZ() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        User owner;
        FollowInfo followInfo;
        String LIZJ;
        User owner2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
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
        o.LJIIIIZZ(str3, "when {\n            curre…\"\n            }\n        }");
        linkedHashMap.put("sec_anchor_id", str3);
        String secUid = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getSecUid();
        if (secUid == null) {
            secUid = "";
        }
        linkedHashMap.put("sec_user_id", secUid);
        if (room != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null && (LIZJ = Q4K.LIZJ(followInfo)) != null) {
            str6 = LIZJ;
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
}
