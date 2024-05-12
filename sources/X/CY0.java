package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class CY0 {
    public static boolean LIZ;
    public static boolean LIZIZ = true;
    public static int LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static long LJI;

    public static void LIZ(DataChannel dataChannel, HashMap hashMap) {
        long j;
        boolean z;
        if (dataChannel != null) {
            Room room = (Room) dataChannel.kv0(RoomChannel.class);
            long j2 = 0;
            if (room != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            hashMap.put("room_id", Long.valueOf(j));
            Room room2 = (Room) dataChannel.kv0(RoomChannel.class);
            if (room2 != null) {
                j2 = room2.getOwnerUserId();
            }
            hashMap.put("anchor_id", Long.valueOf(j2));
            hashMap.put("user_id", Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
            Boolean bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            hashMap.put("is_anchor", Boolean.valueOf(z));
            hashMap.put("opt_out_enable", Integer.valueOf(C28652BMi.LIZIZ(dataChannel)));
            hashMap.put("user_count", Integer.valueOf(C28652BMi.LIZJ));
        }
    }

    public static void LIZIZ(DataChannel dataChannel, JSONObject jSONObject) {
        long j;
        boolean z;
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
            Boolean bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class);
            int i = 0;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            C05630Jz.LJII(jSONObject, "is_anchor", z);
            C05630Jz.LIZ(C28652BMi.LIZIZ(dataChannel), "opt_out_enable", jSONObject);
            Room room3 = (Room) dataChannel.kv0(RoomChannel.class);
            if (room3 != null) {
                i = room3.getUserCount();
            }
            C05630Jz.LIZ(i, "user_count", jSONObject);
        }
    }

    public static void LIZLLL(DataChannel dataChannel, Throwable th) {
        String message;
        Long l;
        long j = 0;
        if (LJ == 0) {
            LJ = System.currentTimeMillis();
            HashMap LIZJ2 = C03660Ck.LIZJ("data_source", "entrance");
            LIZJ2.put("duration", Long.valueOf(LJ - LIZLLL));
            LIZJ2.put("is_error", Boolean.TRUE);
            if (dataChannel != null && (l = (Long) dataChannel.kv0(C28394BCk.class)) != null) {
                j = l.longValue();
            }
            LIZJ2.put("room_duration", Long.valueOf(LJ - j));
            String str = "";
            if (th instanceof C29401Dk) {
                LIZJ2.put("error_type", "api_error");
                C29401Dk c29401Dk = (C29401Dk) th;
                LIZJ2.put("error_code", Integer.valueOf(c29401Dk.getErrorCode()));
                String errorMsg = c29401Dk.getErrorMsg();
                if (errorMsg != null) {
                    str = errorMsg;
                }
                LIZJ2.put("error_msg", str);
            } else if (th instanceof C0TL) {
                LIZJ2.put("error_type", "net_error");
                C0TL c0tl = (C0TL) th;
                LIZJ2.put("error_code", Integer.valueOf(c0tl.getCronetError()));
                String message2 = c0tl.getMessage();
                if (message2 != null) {
                    str = message2;
                }
                LIZJ2.put("error_msg", str);
            } else {
                LIZJ2.put("error_type", "un_know");
                LIZJ2.put("error_code", -1);
                if (th != null && (message = th.getMessage()) != null) {
                    str = message;
                }
                LIZJ2.put("error_msg", str);
            }
            LIZ(dataChannel, LIZJ2);
            C0K2.LJIIL(LJ - LIZLLL, 1, "ttlive_audience_rank_entrance_error", LIZJ2);
            if (!C32777Cth.LIZ(0.1f, "ttlive_audience_rank_entrance_show_all") || !LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_audience_rank_entrance_show_all", 0.1d)) {
                return;
            }
            C0K2.LJIIL(LJ - LIZLLL, 1, "ttlive_audience_rank_entrance_show_all", LIZJ2);
        }
    }

    public static void LIZJ(int i, DataChannel dataChannel, boolean z) {
        int type;
        boolean z2 = false;
        if (z) {
            if (LIZIZ) {
                type = CYC.SHOW.getType();
                LIZIZ = false;
                LIZ = true;
                LIZJ = i;
            } else if (z != LIZ) {
                type = CYC.TURNTOSHOW.getType();
                LIZ = z;
                LIZJ = i;
            } else {
                if (LIZ && LIZJ != i) {
                    type = CYC.COUNTCHANGE.getType();
                    LIZJ = i;
                }
                if (z != LIZ && LIZJ == i) {
                    return;
                } else {
                    type = -1;
                }
            }
        } else if (LIZIZ) {
            type = CYC.HIDE.getType();
            LIZIZ = false;
            LIZ = false;
            LIZJ = 0;
        } else {
            if (z != LIZ) {
                type = CYC.TURNTOHIDE.getType();
                LIZ = z;
                LIZJ = 0;
            }
            if (z != LIZ) {
            }
            type = -1;
        }
        if (!LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_audience_rank_entrance_profile_pic_show", 0.2d)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        C05630Jz.LIZ(type, "viewer_profile_pic_status", jSONObject);
        C05630Jz.LIZ(i, "viewer_profile_pic_count", jSONObject);
        C05630Jz.LJII(jSONObject3, "use_new_display_strategy", true);
        if (dataChannel != null) {
            z2 = o.LJ(dataChannel.kv0(BCW.class), Boolean.TRUE);
        }
        C05630Jz.LJII(jSONObject3, "is_portrait", z2);
        LIZIZ(dataChannel, jSONObject3);
        C05630Jz.LIZJ("extra", jSONObject4, jSONObject3);
        C0K2.LJI("ttlive_audience_rank_entrance_profile_pic_show", jSONObject, jSONObject2, jSONObject4);
    }
}
