package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.model.LiveFixRoomGlobalDataSetting;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BM1 {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static int LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static long LJI;
    public static boolean LJII;
    public static boolean LJIIIIZZ;
    public static boolean LJIIIZ;
    public static boolean LJIIJ;
    public static boolean LJIIJJI;
    public static boolean LJIIL;
    public static boolean LJIILIIL;
    public static java.util.Map<String, String> LJIIZILJ;
    public static String LJIJI;
    public static boolean LJIJJ;
    public static String LJIILJJIL = "idle";
    public static String LJIILL = "";
    public static String LJIILLIIL = "";
    public static String LJIJ = "";

    public static void LIZJ() {
        LIZLLL = 0L;
        LJ = 0L;
        LJFF = 0L;
        LJI = 0L;
        LIZJ = 0;
        LJII = false;
        LJIIIZ = false;
        LJIIJ = false;
        LJIIJJI = false;
        LJIIL = false;
    }

    public static void LIZIZ(java.util.Map map) {
        map.put("lineup_anchor_type", CardStruct.IStatusCode.DEFAULT);
        int i = 1;
        if (LJIILIIL) {
            map.put("live_lineup_type", "normal");
            if (LIZ) {
                if (LIZIZ) {
                    i = 2;
                }
                map.put("lineup_anchor_type", String.valueOf(i));
                map.put("live_lineup_type", "live_house");
                return;
            }
            return;
        }
        if (LJII) {
            if (LJIIIIZZ) {
                i = 2;
            }
            map.put("lineup_anchor_type", String.valueOf(i));
        }
        if (LJII && LJIIIZ) {
            long j = LIZLLL;
            if (j != 0) {
                map.put("room_id", String.valueOf(j));
            }
            long j2 = LJ;
            if (j2 != 0) {
                map.put("anchor_id", String.valueOf(j2));
            }
        }
    }

    public static void LIZ(List list, java.util.Map map) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        String valueOf;
        boolean z7;
        String str;
        boolean z8;
        String str2;
        boolean z9;
        Object obj;
        boolean z10;
        String str3;
        boolean z11;
        boolean z12;
        if (LJIILIIL) {
            return;
        }
        String str4 = LJIJI;
        if (str4 != null) {
            map.put("task_id", str4);
        }
        boolean z13 = false;
        if (list == null || ((ArrayList) list).isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if ((z || ((ArrayList) list).contains("room_id")) && LIZLLL > 0 && (!LiveFixRoomGlobalDataSetting.INSTANCE.getValue() ? LIZLLL > 0 || map.get("room_id") == null : LIZLLL > 0 && map.get("room_id") == null)) {
            map.put("room_id", String.valueOf(LIZLLL));
        }
        if (list == null || ((ArrayList) list).isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str5 = "-1";
        if ((z2 || ((ArrayList) list).contains("live_play_session_id")) && map.get("live_play_session_id") == null) {
            String str6 = B57.LIZ.LIZIZ;
            if (str6 == null) {
                str6 = "-1";
            }
            map.put("live_play_session_id", str6);
        }
        if (list == null || ((ArrayList) list).isEmpty()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((z3 || ((ArrayList) list).contains("live_session_id")) && map.get("live_session_id") == null) {
            String str7 = B57.LIZ.LIZLLL;
            if (str7 != null) {
                str5 = str7;
            }
            map.put("live_session_id", str5);
        }
        if (list == null || ((ArrayList) list).isEmpty()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((z4 || ((ArrayList) list).contains("anchor_id")) && LJ > 0 && (!LiveFixRoomGlobalDataSetting.INSTANCE.getValue() ? LJ > 0 || map.get("anchor_id") == null : LJ > 0 && map.get("anchor_id") == null)) {
            map.put("anchor_id", String.valueOf(LJ));
        }
        if (list == null || ((ArrayList) list).isEmpty()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if ((z5 || ((ArrayList) list).contains("actual_room_id")) && (LJFF > 0 || LIZLLL > 0 || map.get("actual_room_id") == null)) {
            long j = LJFF;
            if (j <= 0) {
                j = LIZLLL;
            }
            map.put("actual_room_id", String.valueOf(j));
        }
        if (list == null || ((ArrayList) list).isEmpty()) {
            z6 = true;
        } else {
            z6 = false;
        }
        if ((z6 || ((ArrayList) list).contains("actual_anchor_id")) && (LJI > 0 || LJ > 0 || map.get("actual_anchor_id") == null)) {
            long j2 = LJI;
            if (j2 > 0) {
                valueOf = String.valueOf(j2);
            } else {
                valueOf = String.valueOf(LJ);
            }
            map.put("actual_anchor_id", valueOf);
        }
        if (list == null || ((ArrayList) list).isEmpty()) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7 || ((ArrayList) list).contains("live_lineup_type")) {
            if (LJII) {
                str = "live_house";
            } else if (LJIJJ) {
                str = "program_live";
            } else {
                str = "normal";
            }
            map.put("live_lineup_type", str);
        }
        if (list == null || ((ArrayList) list).isEmpty()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8 || ((ArrayList) list).contains("live_lineup_user_type")) {
            if (LJIIIZ) {
                str2 = "live_house_user";
            } else {
                str2 = "basic_user";
            }
            map.put("live_lineup_user_type", str2);
        }
        if (list == null || ((ArrayList) list).isEmpty()) {
            z9 = true;
        } else {
            z9 = false;
        }
        String str8 = "1";
        if (z9 || ((ArrayList) list).contains("is_backup_room")) {
            if (LJIIJ) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_backup_room", obj);
        }
        if (list == null || ((ArrayList) list).isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        String str9 = "";
        if (z10 || ((ArrayList) list).contains("live_lineup_change_type")) {
            if (LJII) {
                if (LJIIJJI) {
                    str3 = "auto_into";
                } else {
                    if (!LJIIJJI) {
                        str3 = "positive_into";
                    }
                    str3 = "";
                }
                map.put("live_lineup_change_type", str3);
            } else {
                if (LJIIJJI) {
                    str3 = "auto_exit";
                } else {
                    if (!LJIIJJI) {
                        if (LJIIL) {
                            str3 = "positive_exit";
                        } else {
                            str3 = "non_lineup";
                        }
                    }
                    str3 = "";
                }
                map.put("live_lineup_change_type", str3);
            }
        }
        if (list == null || ((ArrayList) list).isEmpty()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 || ((ArrayList) list).contains("is_commerce_inner_flow")) {
            if (!B4T.LIZ().LIZIZ()) {
                str8 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_commerce_inner_flow", str8);
        }
        if (list == null || ((ArrayList) list).isEmpty()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 || ((ArrayList) list).contains("commerce_inner_flow_id")) {
            String LIZ2 = C28655BMl.LIZ(B4T.LIZ(), null, true, 1);
            if (LIZ2 == null) {
                LIZ2 = "";
            }
            map.put("commerce_inner_flow_id", LIZ2);
        }
        if (list == null || ((ArrayList) list).isEmpty()) {
            z13 = true;
        }
        if (z13 || ((ArrayList) list).contains("commerce_inner_source")) {
            String str10 = B4T.LIZ().LJI;
            if (str10 != null) {
                str9 = str10;
            }
            map.put("commerce_inner_source", str9);
        }
    }

    public static void LIZLLL(String str, String str2) {
        if (str == null) {
            str = "";
        }
        LJIILLIIL = str;
        if (str2 == null) {
            str2 = "";
        }
        LJIILL = str2;
    }

    public static void LJ(boolean z, boolean z2, Room room) {
        User user;
        o.LJIIIZ(room, "room");
        if (z && z2) {
            OfficialChannelInfo officialChannelInfo = room.officialChannelInfo;
            if (officialChannelInfo != null && (user = officialChannelInfo.channelUser) != null) {
                LIZLLL = officialChannelInfo.backupRoomId;
                LJ = user.getId();
            }
        } else {
            LIZLLL = room.getId();
            LJ = room.getOwnerUserId();
        }
        LJFF = room.getId();
        LJI = room.getOwnerUserId();
    }
}
