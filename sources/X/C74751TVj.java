package X;

import android.os.SystemClock;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3PipSetting;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.TVj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74751TVj {
    public static long LIZ;
    public static long LIZIZ;
    public static String LIZJ;
    public static String LIZLLL;
    public static String LJ;

    public static final void LIZJ() {
        if (LIZ <= 0) {
            return;
        }
        if (UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_guest_connection_mode_view_duration")) {
            long uptimeMillis = SystemClock.uptimeMillis() - LIZ;
            java.util.Map LIZ2 = LIZ(null);
            String str = LIZLLL;
            if (str == null) {
                str = "live_over";
            }
            HashMap hashMap = (HashMap) LIZ2;
            hashMap.put("trigger", str);
            LJIIJJI(null);
            C74824TYe.LIZIZ(LIZ2, C74824TYe.LJIIJ());
            hashMap.put("duration", String.valueOf(uptimeMillis));
            hashMap.put("permission_type", C74776TWi.LJ());
            LJIIJ("livesdk_guest_connection_mode_view_duration", LIZ2);
        }
        LIZ = 0L;
    }

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
        throw new UnsupportedOperationException("Method not decompiled: X.C74751TVj.LIZ(com.bytedance.android.livesdkapi.depend.model.live.Room):java.util.Map");
    }

    public static final void LJ(String str) {
        EnterRoomLinkSession enterRoomLinkSession;
        String str2;
        EnterRoomConfig enterRoomConfig;
        String str3;
        if (C74838TYs.LJ().LJJ <= 0) {
            return;
        }
        if (C74752TVk.LIZ() != null) {
            C28643BLz c28643BLz = B57.LIZ;
            if (C38354F3m.LJ(c28643BLz.LIZJ)) {
                enterRoomLinkSession = c28643BLz.LIZ();
            } else {
                enterRoomLinkSession = (EnterRoomLinkSession) ((ConcurrentHashMap) c28643BLz.LIZ).get(c28643BLz.LIZJ);
            }
            if (enterRoomLinkSession == null || (enterRoomConfig = enterRoomLinkSession.mEnterRoomConfig) == null || (str3 = enterRoomConfig.mRoomsData.enterForMultiLive) == null || !C29306Beo.LJIJJLI(str3)) {
                str2 = "";
            } else {
                str2 = "from_activitypage";
            }
            if (C29306Beo.LJIJJLI(str2)) {
                str = str2;
            }
        }
        LIZIZ = SystemClock.uptimeMillis();
        java.util.Map LIZ2 = LIZ(null);
        if (str == null) {
            str = "connection_start";
        }
        HashMap hashMap = (HashMap) LIZ2;
        hashMap.put("trigger", str);
        LJIIL(null);
        C74824TYe.LIZIZ(LIZ2, C74824TYe.LJIIJ());
        hashMap.put("guest_cnt", String.valueOf(C74838TYs.LJ().LJJ));
        LJIIJ("livesdk_guest_connection_status_view_start", LIZ2);
    }

    public static final void LJIIIZ(boolean z) {
        if (C74838TYs.LJ().LJJ > 0) {
            if (MultiGuestV3PipSetting.INSTANCE.getValue()) {
                if (!z) {
                    LJ("live_play");
                    return;
                }
                return;
            }
            LJ("live_play");
        }
    }

    public static void LJIIJJI(String str) {
        if (str == null) {
            LIZLLL = null;
        } else {
            if (o.LJ(LIZLLL, "live_over")) {
                return;
            }
            LIZLLL = str;
        }
    }

    public static void LJIIL(String str) {
        if (str == null) {
            LJ = null;
        } else {
            if (o.LJ(LJ, "live_over")) {
                return;
            }
            LJ = str;
        }
    }

    public static final void LJII(String str, String str2) {
        String str3;
        String str4;
        MultiGuestDataHolder multiGuestDataHolder;
        OSZ[] oszArr = new OSZ[3];
        C75559Tl5 c75559Tl5 = C75559Tl5.LIZIZ;
        Object obj = c75559Tl5.LIZJ().get("MULTI_GUEST_DATA_HOLDER");
        if (!(obj instanceof MultiGuestDataHolder) || (multiGuestDataHolder = (MultiGuestDataHolder) obj) == null || (str3 = multiGuestDataHolder.LJJJJI) == null) {
            str3 = "others";
        }
        oszArr[0] = new OSZ("guest_invite_type", str3);
        oszArr[1] = new OSZ("click_type", str);
        if (str2 == null) {
            str2 = "";
        }
        oszArr[2] = new OSZ("tab", str2);
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        C78880UxY.LJIIZILJ(LJJLIIIIJ);
        MultiGuestDataHolder multiGuestDataHolder2 = (MultiGuestDataHolder) c75559Tl5.LIZIZ("MULTI_GUEST_DATA_HOLDER");
        if (multiGuestDataHolder2 != null) {
            if (!multiGuestDataHolder2.LJ) {
                str4 = "off";
            } else if (multiGuestDataHolder2.LJIIIIZZ) {
                str4 = "rear_camera";
            } else {
                str4 = "front_camera";
            }
            LJJLIIIIJ.put("camera_setting", str4);
        }
        C78880UxY.LJIILLIIL(LJJLIIIIJ);
        C77123UOp.LJIIJJI(LJJLIIIIJ);
        C77123UOp.LJIIJ(LJJLIIIIJ);
        C77123UOp.LJIILIIL(LJJLIIIIJ);
        LJIIJ("livesdk_guest_video_preview_page_click", LJJLIIIIJ);
    }

    public static final void LJIIIIZZ(boolean z, Room room) {
        if (C74838TYs.LJ().LJJ > 0) {
            if (MultiGuestV3PipSetting.INSTANCE.getValue()) {
                if (!z) {
                    LIZLLL(null, null, room, 3);
                    return;
                }
                return;
            }
            LIZLLL(null, null, room, 3);
        }
    }

    public static void LJIIJ(String str, java.util.Map map) {
        BZI LIZ2 = C28787BRn.LIZ(str);
        LIZ2.LJIIZILJ();
        LIZ2.LJJIFFI(map);
        LIZ2.LJJIIJZLJL();
    }

    public static final void LIZIZ(String str, String str2, String str3) {
        String str4;
        OSZ[] oszArr = new OSZ[4];
        TRS trs = (TRS) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (trs == null || (str4 = trs.LIZIZ(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId())) == null) {
            str4 = "others";
        }
        oszArr[0] = new OSZ("guest_invite_type", str4);
        oszArr[1] = new OSZ("action_type", str2);
        oszArr[2] = new OSZ("click_decision", str3);
        if (str == null) {
            str = "";
        }
        oszArr[3] = new OSZ("guest_connection_type", str);
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        C78880UxY.LJIILLIIL(LJJLIIIIJ);
        C78880UxY.LJIIZILJ(LJJLIIIIJ);
        LJIIJ("livesdk_guest_cancel_connection_window", LJJLIIIIJ);
    }

    public static final void LJFF(String str, String str2, EnumC74778TWk enumC74778TWk) {
        HashMap LIZ2 = C45243HpH.LIZ("popup_action_type", str, "popup_click_type", str2);
        LIZ2.put("layout_setting", C74824TYe.LJI(enumC74778TWk).getFirst());
        LIZ2.put("window_setting", C74824TYe.LJI(enumC74778TWk).getSecond());
        LJIIJ("livesdk_guest_decline_invitation_popup", LIZ2);
    }

    public static void LIZLLL(String str, Integer num, Room room, int i) {
        String valueOf;
        EnumC74778TWk enumC74778TWk = null;
        if ((i & 1) != 0) {
            str = null;
        }
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
        if (str == null && (str = LJ) == null) {
            str = "live_over";
        }
        HashMap hashMap = (HashMap) LIZ2;
        hashMap.put("trigger", str);
        LJIIL(null);
        MultiGuestDataHolder multiGuestDataHolder = C74824TYe.LIZIZ;
        if (multiGuestDataHolder != null) {
            enumC74778TWk = multiGuestDataHolder.LJJIIJZLJL;
        }
        C74824TYe.LIZIZ(LIZ2, enumC74778TWk);
        hashMap.put("duration", String.valueOf(uptimeMillis));
        if (num == null || (valueOf = num.toString()) == null) {
            valueOf = String.valueOf(C74838TYs.LJ().LJJ);
        }
        hashMap.put("guest_cnt", valueOf);
        LJIIJ("livesdk_guest_connection_status_view_duration", LIZ2);
        LIZIZ = 0L;
    }

    public static final void LJI(String str, String str2, String str3, Long l, boolean z) {
        String str4;
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("action_type", str), new OSZ("guest_decision", str2), new OSZ("stay_duration", String.valueOf(l)), new OSZ("receive_invitation_platform", "room"));
        C78880UxY.LJIIZILJ(LJJLIIIIJ);
        C78880UxY.LJIILLIIL(LJJLIIIIJ);
        C77123UOp.LJIIL(LJJLIIIIJ);
        LJJLIIIIJ.put("invitation_type", str3);
        if (z) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        LJJLIIIIJ.put("show_in_outer_page", str4);
        LJIIJ("livesdk_guest_reply_anchor_invitation", LJJLIIIIJ);
    }
}
