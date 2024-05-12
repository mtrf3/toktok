package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.TVe, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74746TVe {
    public static long LIZ;
    public static long LIZIZ;
    public static String LIZJ;
    public static String LIZLLL;
    public static String LJ;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0011, code lost:
    
        if (r3 != null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZ(com.bytedance.android.livesdkapi.depend.model.live.Room r3) {
        /*
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LJLJJI
            java.lang.Class<X.Baa> r0 = X.C29044Baa.class
            java.lang.Object r0 = r1.mv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            if (r0 != 0) goto L73
            if (r3 == 0) goto L63
        L13:
            long r0 = r3.getOwnerUserId()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "anchor_id"
            r2.put(r0, r1)
            java.lang.String r1 = r3.getIdStr()
            java.lang.String r0 = "room.idStr"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "room_id"
            r2.put(r0, r1)
            X.B83 r0 = X.B83.LIZ()
            X.BgP r1 = r0.LIZIZ()
            X.Bfu r1 = (X.C29374Bfu) r1
            java.lang.String r0 = "user_id"
            defpackage.t1.LJ(r1, r2, r0)
            int r0 = r3.liveRoomMode
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "live_room_mode"
            r2.put(r0, r1)
            java.lang.String r1 = X.BJM.LJIIIIZZ()
            java.lang.String r0 = "enter_method"
            r2.put(r0, r1)
            java.lang.String r1 = X.BJM.LJFF()
            java.lang.String r0 = "enter_from_merge"
            r2.put(r0, r1)
            java.lang.String r1 = X.BJM.LIZLLL()
            java.lang.String r0 = "action_type"
            r2.put(r0, r1)
        L63:
            X.TYs r0 = X.C74838TYs.LJ()
            int r0 = r0.LJJ
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "guest_cnt"
            r2.put(r0, r1)
            return r2
        L73:
            r3 = r0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74746TVe.LIZ(com.bytedance.android.livesdkapi.depend.model.live.Room):java.util.Map");
    }

    public static final void LIZLLL(String str) {
        int i;
        LIZIZ = SystemClock.uptimeMillis();
        java.util.Map LIZ2 = LIZ(null);
        HashMap hashMap = (HashMap) LIZ2;
        hashMap.put("trigger", str);
        LJIIIIZZ(null);
        TWL.LIZJ(LIZ2);
        TVD LJ2 = TWL.LJ();
        if (LJ2 != null) {
            i = LJ2.LJIIJJI;
        } else {
            i = 0;
        }
        hashMap.put("guest_cnt", String.valueOf(i));
        LJI("livesdk_guest_connection_status_view_start", LIZ2);
    }

    public static void LJII(String str) {
        if (str == null) {
            LIZLLL = null;
        } else {
            if (o.LJ(LIZLLL, "live_over")) {
                return;
            }
            LIZLLL = str;
        }
    }

    public static void LJIIIIZZ(String str) {
        if (str == null) {
            LJ = null;
        } else {
            if (o.LJ(LJ, "live_over")) {
                return;
            }
            LJ = str;
        }
    }

    public static final void LIZIZ(String str, String str2) {
        OSZ[] oszArr = new OSZ[4];
        String str3 = TTV.LIZ().LJJ;
        if (str3 == null) {
            str3 = "others";
        }
        oszArr[0] = new OSZ("guest_invite_type", str3);
        oszArr[1] = new OSZ("action_type", str);
        oszArr[2] = new OSZ("click_decision", str2);
        oszArr[3] = new OSZ("guest_connection_type", "voice");
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        C1DJ.LIZ(LJJLIIIIJ);
        C1DJ.LIZIZ(LJJLIIIIJ);
        LJI("livesdk_guest_cancel_connection_window", LJJLIIIIJ);
    }

    public static final void LJ(String str, String str2) {
        HashMap LIZ2 = C45243HpH.LIZ("popup_action_type", str, "popup_click_type", str2);
        LIZ2.put("layout_setting", TWL.LJFF().getFirst());
        LIZ2.put("window_setting", TWL.LJFF().getSecond());
        LJI("livesdk_guest_decline_invitation_popup", LIZ2);
    }

    public static void LJI(String str, java.util.Map map) {
        if (o.LJ("livesdk_guest_connection_mode_view_start", str) && !UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_guest_connection_mode_view_start")) {
            return;
        }
        BZI LIZ2 = C28787BRn.LIZ(str);
        LIZ2.LJJIFFI(map);
        LIZ2.LJIIZILJ();
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZJ(Integer num, Room room, int i) {
        String valueOf;
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            room = null;
        }
        if (LIZIZ <= 0) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - LIZIZ;
        java.util.Map LIZ2 = LIZ(room);
        String str = LJ;
        if (str == null) {
            str = "live_over";
        }
        HashMap hashMap = (HashMap) LIZ2;
        hashMap.put("trigger", str);
        LJIIIIZZ(null);
        TWL.LIZJ(LIZ2);
        hashMap.put("duration", String.valueOf(uptimeMillis));
        if (num == null || (valueOf = num.toString()) == null) {
            valueOf = String.valueOf(C74838TYs.LJ().LJJ);
        }
        hashMap.put("guest_cnt", valueOf);
        LJI("livesdk_guest_connection_status_view_duration", LIZ2);
        LIZIZ = 0L;
    }

    public static final void LJFF(String str, Long l, Boolean bool, String str2) {
        String str3;
        OSZ[] oszArr = new OSZ[5];
        oszArr[0] = new OSZ("action_type", str);
        oszArr[1] = new OSZ("guest_decision", str2);
        oszArr[2] = new OSZ("stay_duration", String.valueOf(l));
        oszArr[3] = new OSZ("receive_invitation_platform", "room");
        if (o.LJ(bool, Boolean.FALSE)) {
            str3 = "landscape";
        } else {
            str3 = "portrait";
        }
        oszArr[4] = new OSZ("room_orientation", str3);
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        C1DJ.LIZIZ(LJJLIIIIJ);
        C1DJ.LIZ(LJJLIIIIJ);
        C77125UOr.LJFF(LJJLIIIIJ);
        LJI("livesdk_guest_reply_anchor_invitation", LJJLIIIIJ);
    }
}
