package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.CYu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31524CYu {
    public static long LIZ;
    public static final HashMap<OSZ<Integer, Integer>, Long> LIZIZ = new HashMap<>();
    public static int LIZJ = -1;
    public static int LIZLLL = -1;
    public static final HashMap<OSZ<Integer, Integer>, Long> LJ = new HashMap<>();
    public static final HashMap<OSZ<Integer, Integer>, Long> LJFF = new HashMap<>();
    public static final HashMap<OSZ<Integer, Integer>, Long> LJI = new HashMap<>();
    public static final HashMap<OSZ<Integer, Integer>, Long> LJII = new HashMap<>();
    public static final HashMap<OSZ<Integer, Integer>, Integer> LJIIIIZZ = new HashMap<>();
    public static DataChannel LJIIIZ;

    public static void LJI() {
        LIZJ = -1;
        LIZ = 0L;
        LJ.clear();
        LJFF.clear();
        LJI.clear();
        LJII.clear();
        LIZIZ.clear();
        LJIIIIZZ.clear();
        LJIIIZ = null;
    }

    public static void LIZJ(int i, int i2) {
        LJ.put(new OSZ<>(Integer.valueOf(i), Integer.valueOf(i2)), Long.valueOf(System.currentTimeMillis()));
        LJIIIIZZ.put(new OSZ<>(Integer.valueOf(i), Integer.valueOf(i2)), Integer.valueOf(EnumC31525CYv.LOADING.getType()));
    }

    public static void LJ(int i, int i2, boolean z) {
        HashMap<OSZ<Integer, Integer>, Long> hashMap = LIZIZ;
        if (hashMap.get(new OSZ(Integer.valueOf(i), Integer.valueOf(i2))) == null) {
            hashMap.put(new OSZ<>(Integer.valueOf(i), Integer.valueOf(i2)), Long.valueOf(System.currentTimeMillis()));
            if (z) {
                LIZJ = i;
                LIZLLL = i2;
            }
        }
    }

    public static void LIZ(JSONObject jSONObject, int i, int i2, List list) {
        String str;
        long j;
        String str2;
        long j2;
        RoomAuthStatus roomAuthStatus;
        C05630Jz.LJII(jSONObject, "use_simple_user", true);
        C05630Jz.LJII(jSONObject, "layout_optimize", true);
        C05630Jz.LJII(jSONObject, "data_cache", true);
        if (i == LIZJ && i2 == LIZLLL) {
            str = "first_appear";
        } else {
            str = "switch_tab";
        }
        C05630Jz.LJI(jSONObject, "show_type", str);
        DataChannel dataChannel = LJIIIZ;
        if (dataChannel != null) {
            Room room = (Room) dataChannel.kv0(RoomChannel.class);
            long j3 = 0;
            if (room != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            C05630Jz.LJFF(jSONObject, "room_id", j);
            Room room2 = (Room) dataChannel.kv0(RoomChannel.class);
            if (room2 != null) {
                j3 = room2.getOwnerUserId();
            }
            C05630Jz.LJFF(jSONObject, "anchor_id", j3);
            C05630Jz.LJFF(jSONObject, "user_id", ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
            int i3 = -1;
            if (list != null) {
                StringBuilder sb = new StringBuilder();
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    sb.append(BPN.LIZ(((RankTabInfo) ListProtector.get(list, i4)).rankType, ((RankTabInfo) ListProtector.get(list, i4)).LJLILLLLZI).rankName);
                    if (i4 != list.size() - 1) {
                        sb.append(", ");
                    }
                }
                str2 = sb.toString();
                o.LJIIIIZZ(str2, "builder.toString()");
            } else {
                str2 = "";
            }
            C05630Jz.LJI(jSONObject, "current_all_rank_type", str2);
            if (C29306Beo.LJIIJ(dataChannel)) {
                C05630Jz.LIZ(1, "is_anchor", jSONObject);
                Room room3 = (Room) dataChannel.kv0(RoomChannel.class);
                if (room3 != null && (roomAuthStatus = room3.mRoomAuthStatus) != null) {
                    i3 = roomAuthStatus.getGiftRankSwitchStatus();
                }
                C05630Jz.LIZ(i3, "opt_out_enable", jSONObject);
                return;
            }
            C05630Jz.LIZ(0, "is_anchor", jSONObject);
            Long l = (Long) DataChannelGlobal.LJLJJI.mv0(C29025BaH.class);
            if (l != null) {
                j2 = l.longValue();
            } else {
                j2 = -1;
            }
            C05630Jz.LJFF(jSONObject, "opt_out_enable", j2);
        }
    }

    public static void LIZIZ(int i, int i2, EnumC31514CYk groupType, int i3, int i4, List list) {
        o.LJIIIZ(groupType, "groupType");
        HashMap<OSZ<Integer, Integer>, Long> hashMap = LJFF;
        if (!hashMap.containsKey(new OSZ(Integer.valueOf(i), Integer.valueOf(i2))) || !LJI.containsKey(new OSZ(Integer.valueOf(i), Integer.valueOf(i2)))) {
            hashMap.put(new OSZ<>(Integer.valueOf(i), Integer.valueOf(i2)), Long.valueOf(System.currentTimeMillis()));
            LJI.put(new OSZ<>(Integer.valueOf(i), Integer.valueOf(i2)), 0L);
            LJIIIIZZ.put(new OSZ<>(Integer.valueOf(i), Integer.valueOf(i2)), Integer.valueOf(EnumC31525CYv.ERROR.getType()));
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            C05630Jz.LJI(jSONObject, "current_entity_rank_type", BPN.LIZ(i, i2).rankName);
            C05630Jz.LJI(jSONObject, "current_entrance_rank_type", BPN.LIZ(i3, i4).rankName);
            C05630Jz.LIZ(groupType.getType(), "group_type", jSONObject);
            LIZ(jSONObject3, i, i2, list);
            Long l = hashMap.get(new OSZ(Integer.valueOf(i), Integer.valueOf(i2)));
            if (l == null) {
                l = 0L;
            }
            long longValue = l.longValue();
            HashMap<OSZ<Integer, Integer>, Long> hashMap2 = LJ;
            Long l2 = hashMap2.get(new OSZ(Integer.valueOf(i), Integer.valueOf(i2)));
            if (l2 == null) {
                l2 = 0L;
            }
            C05630Jz.LJFF(jSONObject2, "event_duration", longValue - l2.longValue());
            Long l3 = hashMap.get(new OSZ(Integer.valueOf(i), Integer.valueOf(i2)));
            if (l3 == null) {
                l3 = 0L;
            }
            long longValue2 = l3.longValue();
            Long l4 = hashMap2.get(new OSZ(Integer.valueOf(i), Integer.valueOf(i2)));
            if (l4 == null) {
                l4 = 0L;
            }
            C05630Jz.LJFF(jSONObject3, "event_duration", longValue2 - l4.longValue());
            Long l5 = hashMap.get(new OSZ(Integer.valueOf(i), Integer.valueOf(i2)));
            if (l5 == null) {
                l5 = 0L;
            }
            long longValue3 = l5.longValue();
            HashMap<OSZ<Integer, Integer>, Long> hashMap3 = LIZIZ;
            Long l6 = hashMap3.get(new OSZ(Integer.valueOf(i), Integer.valueOf(i2)));
            if (l6 == null) {
                l6 = 0L;
            }
            C05630Jz.LJFF(jSONObject2, "event_duration_all", longValue3 - l6.longValue());
            Long l7 = hashMap.get(new OSZ(Integer.valueOf(i), Integer.valueOf(i2)));
            if (l7 == null) {
                l7 = 0L;
            }
            long longValue4 = l7.longValue();
            Long l8 = hashMap3.get(new OSZ(Integer.valueOf(i), Integer.valueOf(i2)));
            if (l8 == null) {
                l8 = 0L;
            }
            C05630Jz.LJFF(jSONObject3, "event_duration_all", longValue4 - l8.longValue());
            C05630Jz.LIZJ("extra", jSONObject4, jSONObject3);
            C0K2.LJI("ttlive_ranklist_entity_is_null", jSONObject, jSONObject2, jSONObject4);
        }
    }

    public static void LIZLLL(int i, int i2, EnumC31514CYk groupType, int i3, int i4, List list, int i5) {
        o.LJIIIZ(groupType, "groupType");
        HashMap<OSZ<Integer, Integer>, Long> hashMap = LJFF;
        if (!hashMap.containsKey(new OSZ(Integer.valueOf(i), Integer.valueOf(i2)))) {
            hashMap.put(new OSZ<>(Integer.valueOf(i), Integer.valueOf(i2)), Long.valueOf(System.currentTimeMillis()));
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            C05630Jz.LJI(jSONObject, "current_entity_rank_type", BPN.LIZ(i, i2).rankName);
            C05630Jz.LJI(jSONObject, "current_entrance_rank_type", BPN.LIZ(i3, i4).rankName);
            C05630Jz.LIZ(groupType.getType(), "group_type", jSONObject);
            LIZ(jSONObject3, i, i2, list);
            C05630Jz.LJI(jSONObject, "event_name", "event_request");
            C05630Jz.LIZ(i5, "response_size", jSONObject3);
            Long l = hashMap.get(new OSZ(Integer.valueOf(i), Integer.valueOf(i2)));
            if (l == null) {
                l = 0L;
            }
            long longValue = l.longValue();
            HashMap<OSZ<Integer, Integer>, Long> hashMap2 = LJ;
            Long l2 = hashMap2.get(new OSZ(Integer.valueOf(i), Integer.valueOf(i2)));
            if (l2 == null) {
                l2 = 0L;
            }
            C05630Jz.LJFF(jSONObject2, "event_duration", longValue - l2.longValue());
            Long l3 = hashMap.get(new OSZ(Integer.valueOf(i), Integer.valueOf(i2)));
            if (l3 == null) {
                l3 = 0L;
            }
            long longValue2 = l3.longValue();
            Long l4 = hashMap2.get(new OSZ(Integer.valueOf(i), Integer.valueOf(i2)));
            if (l4 == null) {
                l4 = 0L;
            }
            C05630Jz.LJFF(jSONObject3, "event_duration", longValue2 - l4.longValue());
            Long l5 = hashMap.get(new OSZ(Integer.valueOf(i), Integer.valueOf(i2)));
            if (l5 == null) {
                l5 = 0L;
            }
            long longValue3 = l5.longValue();
            HashMap<OSZ<Integer, Integer>, Long> hashMap3 = LIZIZ;
            Long l6 = hashMap3.get(new OSZ(Integer.valueOf(i), Integer.valueOf(i2)));
            if (l6 == null) {
                l6 = 0L;
            }
            C05630Jz.LJFF(jSONObject2, "event_duration_all", longValue3 - l6.longValue());
            Long l7 = hashMap.get(new OSZ(Integer.valueOf(i), Integer.valueOf(i2)));
            if (l7 == null) {
                l7 = 0L;
            }
            long longValue4 = l7.longValue();
            Long l8 = hashMap3.get(new OSZ(Integer.valueOf(i), Integer.valueOf(i2)));
            if (l8 == null) {
                l8 = 0L;
            }
            C05630Jz.LJFF(jSONObject3, "event_duration_all", longValue4 - l8.longValue());
            C05630Jz.LIZJ("extra", jSONObject4, jSONObject3);
            C0K2.LJI("ttlive_ranklist_entity_show", jSONObject, jSONObject2, jSONObject4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x01ef, code lost:
    
        if (r0 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x026a, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x022b, code lost:
    
        if (r0 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0267, code lost:
    
        if (r0 == null) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x028d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(java.lang.Throwable r13, int r14, int r15, X.EnumC31514CYk r16, int r17, int r18, java.util.List r19) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31524CYu.LJFF(java.lang.Throwable, int, int, X.CYk, int, int, java.util.List):void");
    }
}
