package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class CYZ {
    public static boolean LIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static long LJI;
    public static String LIZIZ = "";
    public static final HashSet<Integer> LJII = new HashSet<>();
    public static final HashSet<Integer> LJIIIIZZ = new HashSet<>();

    public static String LIZJ(List list) {
        if (list != null) {
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append(BPN.LIZ(((RankTabInfo) ListProtector.get(list, i)).rankType, ((RankTabInfo) ListProtector.get(list, i)).LJLILLLLZI).rankName);
                if (i != list.size() - 1) {
                    sb.append(", ");
                }
            }
            String sb2 = sb.toString();
            o.LJIIIIZZ(sb2, "builder.toString()");
            return sb2;
        }
        return "";
    }

    public static void LIZ(long j, long j2, JSONObject jSONObject) {
        C05630Jz.LJFF(jSONObject, "room_id", j);
        C05630Jz.LJFF(jSONObject, "anchor_id", j2);
        C05630Jz.LJFF(jSONObject, "user_id", ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        C05630Jz.LJI(jSONObject, "current_all_rank_type", LIZJ(null));
    }

    public static void LIZIZ(DataChannel dataChannel, JSONObject jSONObject, List list) {
        long j;
        if (dataChannel != null) {
            Room room = (Room) dataChannel.kv0(RoomChannel.class);
            long j2 = 0;
            if (room != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            C05630Jz.LJFF(jSONObject, "room_id", j);
            Room room2 = (Room) dataChannel.kv0(RoomChannel.class);
            if (room2 != null) {
                j2 = room2.getOwnerUserId();
            }
            C05630Jz.LJFF(jSONObject, "anchor_id", j2);
            C05630Jz.LJFF(jSONObject, "user_id", ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
            C05630Jz.LIZ(C28652BMi.LIZIZ(dataChannel), "opt_out_enable", jSONObject);
            C05630Jz.LJI(jSONObject, "current_all_rank_type", LIZJ(list));
        }
    }

    public static void LJ(DataChannel dataChannel, RankTypeV2 rankType, EnumC31514CYk groupType) {
        o.LJIIIZ(rankType, "rankType");
        o.LJIIIZ(groupType, "groupType");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        C05630Jz.LJI(jSONObject, "current_entrance_rank_type", rankType.rankName);
        C05630Jz.LIZ(groupType.getType(), "group_type", jSONObject);
        LIZIZ(dataChannel, jSONObject3, null);
        C05630Jz.LIZJ("extra", jSONObject4, jSONObject3);
        C0K2.LJI("ttlive_ranklist_notification_message_reward_show", jSONObject, jSONObject2, jSONObject4);
    }

    public static void LIZLLL(boolean z, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        JSONObject jSONObject4 = new JSONObject();
        if (((LIZ ^ z) && !o.LJ(LIZIZ, "") && LIZLLL != 0 && LJ != 0) || (!z && o.LJ(LIZIZ, "change_by_mic_room"))) {
            C05630Jz.LIZ(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0, "display", jSONObject3);
            C05630Jz.LJI(jSONObject3, "reason", LIZIZ);
            C05630Jz.LIZJ("extra", jSONObject4, jSONObject3);
            C0K2.LJI("ttlive_ranklist_entrance_display", jSONObject, jSONObject2, jSONObject4);
        }
        LIZ = z;
        LIZIZ = "";
    }
}
