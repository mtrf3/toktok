package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.PollEndContent;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.android.livesdk.model.message.PollStartContent;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.0Ef */
/* loaded from: classes.dex */
public final class C04130Ef {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(User user) {
        Boolean bool;
        UserAttr userAttr;
        if (user != null && (userAttr = user.getUserAttr()) != null) {
            bool = Boolean.valueOf(userAttr.isAdmin);
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            return "moderator";
        }
        return "host";
    }

    public static void LIZIZ(DataChannel dataChannel, C04120Ee pollInfo, String enterFrom) {
        String str;
        User user;
        String str2;
        Long l;
        String str3;
        PollStartContent pollStartContent;
        PollStartContent pollStartContent2;
        Room room;
        LiveMode streamType;
        PollStartContent pollStartContent3;
        o.LJIIIZ(pollInfo, "pollInfo");
        o.LJIIIZ(enterFrom, "enterFrom");
        if (C79146V4k.LJJJI(dataChannel) || C29306Beo.LJIIJ(dataChannel)) {
            str = "livesdk_anchor_custom_poll_card_show";
        } else {
            str = "livesdk_poll_card_show";
        }
        PollMessage pollMessage = pollInfo.LJI;
        Long l2 = null;
        if (pollMessage != null && (pollStartContent3 = pollMessage.startContent) != null) {
            user = pollStartContent3.operator;
        } else {
            user = null;
        }
        String LIZ2 = LIZ(user);
        BZI LIZ3 = C28787BRn.LIZ(str);
        LIZ3.LJIILLIIL(dataChannel);
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && (streamType = room.getStreamType()) != null) {
            str2 = C28509BGv.LIZ(streamType);
        } else {
            str2 = null;
        }
        LIZ3.LJIJ(str2);
        PollMessage pollMessage2 = pollInfo.LJI;
        if (pollMessage2 != null) {
            l = Long.valueOf(pollMessage2.pollId);
        } else {
            l = null;
        }
        LIZ3.LJIJJ(l, "poll_id");
        PollMessage pollMessage3 = pollInfo.LJI;
        if (pollMessage3 != null && (pollStartContent2 = pollMessage3.startContent) != null) {
            str3 = pollStartContent2.title;
        } else {
            str3 = null;
        }
        LIZ3.LJIJJ(str3, "poll_title");
        LIZ3.LJIJJ(LIZ2, "poll_sponsor");
        LIZ3.LJIJJ(enterFrom, "enter_from");
        if (C79146V4k.LJJJI(dataChannel)) {
            User LIZIZ = C05200Ii.LIZIZ();
            if (LIZIZ != null) {
                l2 = Long.valueOf(LIZIZ.getId());
            }
            LIZ3.LJIJJ(l2, "moderator_id");
            LIZ3.LJIJJ("moderator", "user_type");
        } else if (C29306Beo.LJIIJ(dataChannel)) {
            LIZ3.LJIJJ("anchor", "user_type");
        }
        long j = pollInfo.LIZIZ;
        if (j > 0) {
            PollMessage pollMessage4 = pollInfo.LJI;
            if (pollMessage4 != null && (pollStartContent = pollMessage4.startContent) != null) {
                LIZ3.LJIJJ(Long.valueOf(Math.max(0L, pollStartContent.endTime - C31012CFc.LIZIZ())), "time_remain");
            }
        } else {
            LIZ3.LJIJJ(Long.valueOf(j), "time_remain");
        }
        LIZ3.LJJIIJZLJL();
    }

    public static void LJII(DataChannel dataChannel, C04120Ee c04120Ee, String str) {
        String str2;
        User user;
        Long l;
        String str3;
        PollStartContent pollStartContent;
        PollStartContent pollStartContent2;
        PollEndContent pollEndContent;
        PollStartContent pollStartContent3;
        if (C79146V4k.LJJJI(dataChannel) || C29306Beo.LJIIJ(dataChannel)) {
            str2 = "livesdk_anchor_custom_poll_end";
        } else {
            str2 = "livesdk_audience_poll_end";
        }
        PollMessage pollMessage = c04120Ee.LJI;
        if (pollMessage != null && (pollStartContent3 = pollMessage.startContent) != null) {
            user = pollStartContent3.operator;
        } else {
            user = null;
        }
        String LIZ2 = LIZ(user);
        JSONArray jSONArray = new JSONArray();
        PollMessage pollMessage2 = c04120Ee.LJI;
        boolean z = true;
        String str4 = "";
        if (pollMessage2 != null && (pollEndContent = pollMessage2.endContent) != null) {
            int i = 0;
            long j = 0;
            long j2 = 0;
            for (PollOptionInfo pollOptionInfo : pollEndContent.optionList) {
                int i2 = i + 1;
                if (i >= 0) {
                    PollOptionInfo pollOptionInfo2 = pollOptionInfo;
                    if (pollOptionInfo2 != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(pollOptionInfo2.displayContent, String.valueOf(pollOptionInfo2.votes));
                        jSONArray.put(jSONObject);
                        if (i == 0) {
                            j = pollOptionInfo2.votes;
                        } else if (j != pollOptionInfo2.votes) {
                            z = false;
                        }
                        long j3 = pollOptionInfo2.votes;
                        if (j2 < j3) {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append('{');
                            LIZ3.append(pollOptionInfo2.displayContent);
                            LIZ3.append(':');
                            str4 = C47135Ieh.LIZIZ(LIZ3, pollOptionInfo2.votes, '}', LIZ3);
                            j2 = j3;
                        }
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        Long l2 = null;
        if (z) {
            str4 = "tie_up";
        }
        BZI LIZ4 = C28787BRn.LIZ(str2);
        LIZ4.LJIILLIIL(dataChannel);
        PollMessage pollMessage3 = c04120Ee.LJI;
        if (pollMessage3 != null) {
            l = Long.valueOf(pollMessage3.pollId);
        } else {
            l = null;
        }
        LIZ4.LJIJJ(l, "poll_id");
        PollMessage pollMessage4 = c04120Ee.LJI;
        if (pollMessage4 != null && (pollStartContent2 = pollMessage4.startContent) != null) {
            str3 = pollStartContent2.title;
        } else {
            str3 = null;
        }
        LIZ4.LJIJJ(str3, "poll_title");
        LIZ4.LJIJJ(LIZ2, "poll_sponsor");
        if (C79146V4k.LJJJI(dataChannel)) {
            User LIZIZ = C05200Ii.LIZIZ();
            if (LIZIZ != null) {
                l2 = Long.valueOf(LIZIZ.getId());
            }
            LIZ4.LJIJJ(l2, "moderator_id");
            LIZ4.LJIJJ("moderator", "user_type");
        } else if (C29306Beo.LJIIJ(dataChannel)) {
            LIZ4.LJIJJ("anchor", "user_type");
        } else {
            LIZ4.LJIJJ(str4, "winner");
        }
        long j4 = c04120Ee.LIZIZ;
        if (j4 >= 0) {
            PollMessage pollMessage5 = c04120Ee.LJI;
            if (pollMessage5 != null && (pollStartContent = pollMessage5.startContent) != null) {
                LIZ4.LJIJJ(Long.valueOf(Math.max(0L, pollStartContent.endTime - C31012CFc.LIZIZ())), "time_remain");
            }
        } else {
            LIZ4.LJIJJ(Long.valueOf(j4), "time_remain");
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("poll_result", jSONArray);
        LIZ4.LJJ(jSONObject2);
        LIZ4.LJIJJ(str, "end_reason");
        LIZ4.LJIJJ("1", "is_custom");
        LIZ4.LJJIIJZLJL();
    }

    public static void LIZJ(DataChannel dataChannel, C04120Ee pollInfo, long j, String hideType, String enterFrom) {
        o.LJIIIZ(pollInfo, "pollInfo");
        o.LJIIIZ(hideType, "hideType");
        o.LJIIIZ(enterFrom, "enterFrom");
        C70657RoD.LJJI(0.01d, new C46471s3(dataChannel, pollInfo, j, hideType, enterFrom));
    }

    public static /* synthetic */ void LJI(DataChannel dataChannel, String str, boolean z, boolean z2, int i) {
        String str2;
        boolean z3 = z;
        boolean z4 = z2;
        if ((i & 4) != 0) {
            z3 = false;
        }
        if ((i & 16) != 0) {
            z4 = false;
        }
        if ((i & 32) != 0) {
            str2 = "video_live";
        } else {
            str2 = null;
        }
        LJFF(dataChannel, str, str2, z3, false, z4);
    }

    public static void LJFF(DataChannel dataChannel, String str, String previewLiveMode, boolean z, boolean z2, boolean z3) {
        o.LJIIIZ(previewLiveMode, "previewLiveMode");
        C70657RoD.LJJI(0.01d, new C46481s4(dataChannel, str, previewLiveMode, z3, z, z2));
    }

    public static /* synthetic */ void LJ(DataChannel dataChannel, String str, boolean z, boolean z2, boolean z3, String str2, int i) {
        String str3 = str2;
        boolean z4 = z3;
        boolean z5 = z;
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z5 = false;
        }
        if ((i & 8) != 0) {
            z6 = false;
        }
        if ((i & 32) != 0) {
            z4 = false;
        }
        if ((i & 64) != 0) {
            str3 = "video_live";
        }
        LIZLLL(dataChannel, str, z5, z6, false, z4, str3, 0);
    }

    public static void LIZLLL(DataChannel dataChannel, String str, boolean z, boolean z2, boolean z3, boolean z4, String previewLiveMode, int i) {
        boolean z5;
        String str2;
        Room room;
        LiveMode streamType;
        Object obj;
        o.LJIIIZ(previewLiveMode, "previewLiveMode");
        if (C29306Beo.LJIIJ(dataChannel) || z4) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (C79146V4k.LJJJI(dataChannel)) {
            str2 = "livesdk_moderator_poll_entrance_click";
        } else if (z5) {
            str2 = "livesdk_anchor_custom_poll_entrance_click";
        } else {
            str2 = "livesdk_poll_entrance_click";
        }
        BZI LIZ2 = C28787BRn.LIZ(str2);
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(str, "enter_from");
        if (!z5) {
            if (z) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ2.LJIJJ(obj, "is_end_show");
        }
        String str3 = null;
        Object obj2 = null;
        str3 = null;
        str3 = null;
        if (C79146V4k.LJJJI(dataChannel)) {
            User LIZIZ = C05200Ii.LIZIZ();
            if (LIZIZ != null) {
                obj2 = Long.valueOf(LIZIZ.getId());
            }
            LIZ2.LJIJJ(obj2, "moderator_id");
        } else if (z5) {
            if (z4) {
                LIZ2.LJIJ(previewLiveMode);
                LIZ2.LJIJJ(Integer.valueOf(i), "index");
            } else {
                if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && (streamType = room.getStreamType()) != null) {
                    str3 = C28509BGv.LIZ(streamType);
                }
                LIZ2.LJIJ(str3);
            }
            LIZ2.LJIJJ(Integer.valueOf(z2 ? 1 : 0), "has_red_dot");
            LIZ2.LJIJJ(Integer.valueOf(z3 ? 1 : 0), "has_bubble_guidance");
        }
        LIZ2.LJJIIJZLJL();
    }
}
