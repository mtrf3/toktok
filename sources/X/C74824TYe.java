package X;

import Y.ARunnableS0S2100100_13;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multilive.model.FanTicketRanklistResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3AndroidPreviewOptSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestMonitorConfigSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.t1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.TYe */
/* loaded from: classes14.dex */
public final class C74824TYe {
    public static final C74824TYe LIZ = new C74824TYe();
    public static MultiGuestDataHolder LIZIZ;
    public static EnumC74778TWk LIZJ;
    public static long LIZLLL;
    public static EnumC74778TWk LJ;
    public static long LJFF;
    public static long LJI;
    public static long LJII;
    public static long LJIIIIZZ;
    public static String LJIIIZ;
    public static long LJIIJ;
    public static String LJIIJJI;
    public static String LJIIL;
    public static String LJIILIIL;
    public static Long LJIILJJIL;
    public static String LJIILL;

    public static EnumC74778TWk LJIIJ() {
        if (C19N.LIZLLL()) {
            return C59994Ngc.LIZJ();
        }
        MultiGuestDataHolder multiGuestDataHolder = LIZIZ;
        if (multiGuestDataHolder != null) {
            return multiGuestDataHolder.LJJIIZ;
        }
        return null;
    }

    public static String LJIIJJI(int i) {
        return (i == 0 || i != 1) ? "by_default" : "by_coins";
    }

    static {
        EnumC74778TWk enumC74778TWk = EnumC74778TWk.NORMAL;
        LIZJ = enumC74778TWk;
        LJ = enumC74778TWk;
        LJII = -1L;
        LJIIIIZZ = -1L;
        LJIIIZ = "";
        LJIIJJI = "";
        LJIIL = "";
        LJIILIIL = "";
        LJIILL = "go_live_panel";
    }

    public static String LJFF() {
        TRS trs;
        String LIZIZ2;
        Object obj = C75559Tl5.LIZIZ.LIZJ().get("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if ((obj instanceof TQ8) && (trs = (TRS) obj) != null && (LIZIZ2 = trs.LIZIZ(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId())) != null) {
            return LIZIZ2;
        }
        return "others";
    }

    public static LiveMode LJIIIIZZ() {
        LiveMode streamType;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null || (streamType = room.getStreamType()) == null) {
            return LiveMode.VIDEO;
        }
        return streamType;
    }

    public static String LJIIIZ() {
        LiveMode streamType;
        String str;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null || (streamType = room.getStreamType()) == null || (str = streamType.logStreamingType) == null) {
            return "video_live";
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0025, code lost:
    
        if (r4 != null) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.OSZ LJIIL() {
        /*
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r0 = X.C74824TYe.LIZIZ
            if (r0 == 0) goto L8
            com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings r4 = r0.LJIIJ
            if (r4 != 0) goto Le
        L8:
            X.TYs r0 = X.C74838TYs.LJ()
            com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings r4 = r0.LJJI
        Le:
            r3 = 3
            if (r4 == 0) goto L4d
            int r0 = r4.allowViewerReq
            if (r0 != r3) goto L4d
            r0 = 1
        L16:
            r1 = 4
            java.lang.String r2 = "on"
            if (r0 == 0) goto L25
            int r0 = r4.onlyAllowFollowerReq
            if (r0 != r1) goto L27
            X.OSZ r1 = new X.OSZ
            r1.<init>(r2, r2)
        L24:
            return r1
        L25:
            if (r4 == 0) goto L45
        L27:
            int r0 = r4.allowViewerReq
            if (r0 != r3) goto L37
            int r0 = r4.onlyAllowFollowerReq
            if (r0 != r3) goto L37
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "off"
            r1.<init>(r0, r2)
            goto L24
        L37:
            int r0 = r4.allowViewerReq
            if (r0 != r1) goto L45
            int r0 = r4.onlyAllowFollowerReq
            if (r0 != r1) goto L45
            X.OSZ r1 = new X.OSZ
            r1.<init>(r2, r2)
            goto L24
        L45:
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "err"
            r1.<init>(r0, r0)
            goto L24
        L4d:
            r0 = 0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74824TYe.LJIIL():X.OSZ");
    }

    public static void LJJJJLI() {
        InterfaceC75441TjB R6;
        InterfaceC75441TjB R62;
        boolean z;
        InterfaceC75973Trl LLIIJI;
        List<LinkUser> LJFF2;
        int size;
        InterfaceC74695TTf LLIIJLIL;
        InterfaceC74695TTf LLIIJLIL2;
        String str;
        String str2;
        U8H LJJZZI;
        EnumC74829TYj LJJIIZ;
        InterfaceC75973Trl LLIIJI2;
        List<LinkUser> LJJIIZI;
        InterfaceC74695TTf LLIIJLIL3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            linkedHashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            linkedHashMap.put("room_id", idStr);
        }
        InterfaceC75441TjB R63 = C8E.LJ().R6();
        int i = 0;
        if ((R63 != null && (LLIIJLIL3 = R63.LLIIJLIL()) != null && LLIIJLIL3.LJIIJJI()) || (((R6 = C8E.LJ().R6()) != null && (LLIIJLIL2 = R6.LLIIJLIL()) != null && LLIIJLIL2.LJI()) || ((R62 = C8E.LJ().R6()) != null && (LLIIJLIL = R62.LLIIJLIL()) != null && LLIIJLIL.LJIILIIL()))) {
            z = true;
            InterfaceC75441TjB R64 = C8E.LJ().R6();
            if (R64 != null && (LLIIJI2 = R64.LLIIJI()) != null && (LJJIIZI = LLIIJI2.LJJIIZI()) != null) {
                size = LJJIIZI.size();
                i = size - 1;
            }
        } else {
            z = false;
            InterfaceC75441TjB R65 = C8E.LJ().R6();
            if (R65 != null && (LLIIJI = R65.LLIIJI()) != null && (LJFF2 = LLIIJI.LJFF()) != null) {
                size = LJFF2.size();
                i = size - 1;
            }
        }
        InterfaceC75441TjB R66 = C8E.LJ().R6();
        if (R66 == null || (LJJZZI = R66.LJJZZI()) == null || (LJJIIZ = LJJZZI.LJJIIZ()) == null || (str = LJJIIZ.toString()) == null) {
            str = "";
        }
        C132805Jc.LJFF(linkedHashMap, "adaptation_type", str, i, "guest_connected_cnt");
        if (z) {
            str2 = "guest";
        } else {
            str2 = "viewer";
        }
        linkedHashMap.put("view_type", str2);
        EnumC74778TWk LJIIJ2 = LJIIJ();
        linkedHashMap.put("layout_setting", LJI(LJIIJ2).getFirst());
        linkedHashMap.put("window_setting", LJI(LJIIJ2).getSecond());
        BZI LIZ2 = C28787BRn.LIZ("livesdk_guest_layout_adaptation");
        LIZ2.LJJIFFI(linkedHashMap);
        LIZ2.LJJIIJZLJL();
    }

    public static String LJ() {
        U8H LJJZZI;
        C76696U8e LJJIII;
        String realDrawLayoutId;
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LJJZZI = R6.LJJZZI()) != null && (LJJIII = LJJZZI.LJJIII()) != null && (realDrawLayoutId = LJJIII.getRealDrawLayoutId()) != null) {
            return realDrawLayoutId;
        }
        return "";
    }

    public static void LIZ(java.util.Map map) {
        int i;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            HashMap hashMap = (HashMap) map;
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            hashMap.put("room_id", idStr);
            t1.LJ((C29374Bfu) B83.LIZ().LIZIZ(), hashMap, "user_id");
            hashMap.put("enter_method", BJM.LJIIIIZZ());
            hashMap.put("enter_from_merge", BJM.LJFF());
            hashMap.put("action_type", BJM.LIZLLL());
            EnumC74778TWk LJIIJ2 = LJIIJ();
            if (C29137Bc5.LIZIZ(room)) {
                hashMap.put("layout_id", LJ());
            } else {
                hashMap.put("layout_setting", LJI(LJIIJ2).getFirst());
                hashMap.put("window_setting", LJI(LJIIJ2).getSecond());
            }
            hashMap.put("live_room_mode", String.valueOf(room.liveRoomMode));
            String str = room.getStreamType().logStreamingType;
            o.LJIIIIZZ(str, "room.streamType.logStreamingType");
            hashMap.put("live_type", str);
            String requestId = room.getRequestId();
            if (requestId != null) {
                hashMap.put("request_id", requestId);
            }
        }
        MultiGuestDataHolder multiGuestDataHolder = LIZIZ;
        if (multiGuestDataHolder != null) {
            i = multiGuestDataHolder.LJIILIIL;
        } else {
            i = 0;
        }
        ((HashMap) map).put("guest_cnt", String.valueOf(i));
        C77123UOp.LJIILJJIL(map);
    }

    public static void LIZLLL(Runnable runnable) {
        if (LiveSdkMultiGuestMonitorConfigSetting.INSTANCE.getValue().enable) {
            runnable.run();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x002b, code lost:
    
        if (r5 == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.OSZ LJI(X.EnumC74778TWk r5) {
        /*
            r4 = -1
            if (r5 == 0) goto L7
            X.TWk r0 = X.EnumC74778TWk.NORMAL
            if (r5 != r0) goto L4f
        L7:
            com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestMultiLiveLayoutTypesFixSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestMultiLiveLayoutTypesFixSetting.INSTANCE
            boolean r0 = r0.isFix()
            if (r0 == 0) goto L2b
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r0 = X.TRK.LIZ()
            if (r0 == 0) goto L4d
            com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings r0 = r0.LJIIJ
            if (r0 == 0) goto L4d
            int r1 = r0.layoutType
        L1b:
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r0 = X.TRK.LIZ()
            if (r0 == 0) goto L4b
            com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings r0 = r0.LJIIJ
            if (r0 == 0) goto L4b
            int r0 = r0.fixMicNumAction
        L27:
            X.TWk r5 = X.CL8.LIZJ(r1, r0)
        L2b:
            if (r5 != 0) goto L4f
        L2d:
            r0 = 1
            java.lang.String r3 = "fixed"
            java.lang.String r1 = "floating"
            if (r4 == r0) goto L6a
            r0 = 2
            java.lang.String r2 = "unfixed"
            if (r4 == r0) goto L64
            r0 = 3
            java.lang.String r1 = "grid"
            if (r4 == r0) goto L5e
            r0 = 4
            if (r4 == r0) goto L58
            X.OSZ r2 = new X.OSZ
            java.lang.String r1 = "normal_floating"
            java.lang.String r0 = "not_existed"
            r2.<init>(r1, r0)
            return r2
        L4b:
            r0 = -1
            goto L27
        L4d:
            r1 = -1
            goto L1b
        L4f:
            int[] r1 = X.C74826TYg.LIZ
            int r0 = r5.ordinal()
            r4 = r1[r0]
            goto L2d
        L58:
            X.OSZ r0 = new X.OSZ
            r0.<init>(r1, r2)
            return r0
        L5e:
            X.OSZ r0 = new X.OSZ
            r0.<init>(r1, r3)
            return r0
        L64:
            X.OSZ r0 = new X.OSZ
            r0.<init>(r1, r2)
            return r0
        L6a:
            X.OSZ r0 = new X.OSZ
            r0.<init>(r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74824TYe.LJI(X.TWk):X.OSZ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x004e, code lost:
    
        if (r5 != null) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.OSZ LJIILIIL(X.EnumC74827TYh r6) {
        /*
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r0 = X.C74824TYe.LIZIZ
            if (r0 == 0) goto L1b
            com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings r5 = r0.LJIIJ
        L6:
            int[] r1 = X.C74826TYg.LIZIZ
            int r0 = r6.ordinal()
            r0 = r1[r0]
            java.lang.String r4 = "on"
            java.lang.String r3 = "off"
            switch(r0) {
                case 1: goto L39;
                case 2: goto L34;
                case 3: goto L2e;
                case 4: goto L28;
                case 5: goto L23;
                case 6: goto L1d;
                default: goto L15;
            }
        L15:
            X.6Zf r0 = new X.6Zf
            r0.<init>()
            throw r0
        L1b:
            r5 = 0
            goto L6
        L1d:
            X.OSZ r1 = new X.OSZ
            r1.<init>(r4, r3)
            goto L4d
        L23:
            X.OSZ r1 = LJIIL()
            goto L4d
        L28:
            X.OSZ r1 = new X.OSZ
            r1.<init>(r3, r4)
            goto L4d
        L2e:
            X.OSZ r1 = new X.OSZ
            r1.<init>(r3, r3)
            goto L4d
        L34:
            X.OSZ r1 = LJIIL()
            goto L4d
        L39:
            r2 = 3
            if (r5 == 0) goto L6e
            int r0 = r5.allowViewerReq
            if (r0 != r2) goto L6c
            r0 = 1
        L41:
            r1 = 4
            if (r0 == 0) goto L4e
            int r0 = r5.onlyAllowFollowerReq
            if (r0 != r1) goto L50
            X.OSZ r1 = new X.OSZ
            r1.<init>(r3, r4)
        L4d:
            return r1
        L4e:
            if (r5 == 0) goto L6e
        L50:
            int r0 = r5.allowViewerReq
            if (r0 != r2) goto L5e
            int r0 = r5.onlyAllowFollowerReq
            if (r0 != r2) goto L5e
            X.OSZ r1 = new X.OSZ
            r1.<init>(r4, r4)
            goto L4d
        L5e:
            int r0 = r5.allowViewerReq
            if (r0 != r1) goto L6e
            int r0 = r5.onlyAllowFollowerReq
            if (r0 != r1) goto L6e
            X.OSZ r1 = new X.OSZ
            r1.<init>(r3, r3)
            goto L4d
        L6c:
            r0 = 0
            goto L41
        L6e:
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "err"
            r1.<init>(r0, r0)
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74824TYe.LJIILIIL(X.TYh):X.OSZ");
    }

    public static String LJIILJJIL(FanTicketRanklistResponse.ResponseData responseData) {
        if (responseData != null) {
            long j = responseData.ownIndex;
            if (j != 0) {
                return String.valueOf(Long.valueOf(j));
            }
        }
        return "-1";
    }

    public static String LJIILL(User user) {
        if (TV3.LJFF(user)) {
            return "anchor";
        }
        if (TV3.LJIIIIZZ(user)) {
            return "guest";
        }
        if (TV3.LJI(user)) {
            return "user";
        }
        return "";
    }

    public static void LJJIIZ(String str) {
        HashMap LIZJ2 = C03660Ck.LIZJ("errorMsg", str);
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            LIZJ2.put("room_id", idStr);
        }
        LJLL("livesdk_linkmic_audience_click_entrance_intercepted", LIZJ2);
    }

    public static void LJJIJIIJIL(EnumC74827TYh triggerMode) {
        o.LJIIIZ(triggerMode, "triggerMode");
        HashMap hashMap = new HashMap();
        LIZ(hashMap);
        hashMap.put("connection_type", "guest");
        hashMap.put("trigger", triggerMode.getValue());
        hashMap.put("guest_mode_status", LJIILIIL(triggerMode).getSecond());
        hashMap.put("switch_to", LJIILIIL(triggerMode).getFirst());
        LJLL("livesdk_permissionsettiings_followers_only_on_and_off", hashMap);
    }

    public static void LJJJZ(String str) {
        HashMap hashMap = new HashMap();
        LIZ(hashMap);
        hashMap.put("connection_type", "guest");
        hashMap.put("switch_to", str);
        LJLL("livesdk_layoutwindowsettings_switch", hashMap);
    }

    public static void LJJLIIIIJ(Throwable th) {
        if (th instanceof C29401Dk) {
            C276516r c276516r = (C276516r) th;
            if (c276516r.getErrorCode() == 4004442 || c276516r.getErrorCode() == 4004441) {
                HashMap hashMap = new HashMap();
                LIZ(hashMap);
                LJLL("livesdk_lineup_multi_click_toast", hashMap);
            }
        }
    }

    public static void LJJLIIJ(String str) {
        if (TV3.LIZJ() || LJ == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        LIZ(hashMap);
        hashMap.put("trigger", str);
        EnumC74778TWk enumC74778TWk = LJ;
        LJ = null;
        hashMap.put("layout_setting", LJI(enumC74778TWk).getFirst());
        hashMap.put("window_setting", LJI(enumC74778TWk).getSecond());
        hashMap.put("duration", String.valueOf(System.currentTimeMillis() - LJFF));
        LJLL("livesdk_multilive_mode_connection_duration", hashMap);
        if (enumC74778TWk == LIZJ) {
            return;
        }
        LJJLJ(str, enumC74778TWk);
    }

    public static String LJLLI(Integer num) {
        if (num != null) {
            if (num.intValue() == 1 || num.intValue() == 3) {
                return "video";
            }
            if (num.intValue() == 2) {
                return "audio";
            }
            num.intValue();
        }
        return "no_permission";
    }

    public final void LJJIJ(String str) {
        Long l;
        User owner;
        FollowInfo followInfo;
        HashMap LIZ2 = C1R5.LIZ(str, "guestId");
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        LIZ2.put("guest_id", str);
        if (room != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
            l = Long.valueOf(followInfo.getFollowStatus());
        } else {
            l = null;
        }
        LIZ2.put("anchor_relationship", String.valueOf(l));
        LIZ2.put("connected_guest_cnt", String.valueOf(C78886Uxe.LJJJJZI(C8E.LJ())));
        LIZJ(this, LIZ2);
        LIZ(LIZ2);
        LJLL("livesdk_canceled_enlarge_guest_screen", LIZ2);
    }

    public static void LIZIZ(java.util.Map map, EnumC74778TWk enumC74778TWk) {
        boolean z;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        int i = 0;
        if (room != null && C29137Bc5.LIZIZ(room)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String LJ2 = LJ();
            if (LJ2.length() == 0 && TV3.LIZJ()) {
                LJ2 = LAV.LIZIZ();
            }
            map.put("layout_id", LJ2);
            map.remove("layout_setting");
            map.remove("window_setting");
        } else {
            map.put("layout_setting", LJI(enumC74778TWk).getFirst());
            map.put("window_setting", LJI(enumC74778TWk).getSecond());
        }
        MultiGuestDataHolder multiGuestDataHolder = LIZIZ;
        if (multiGuestDataHolder != null) {
            i = multiGuestDataHolder.LJIILIIL;
        }
        map.put("guest_cnt", String.valueOf(i));
    }

    public static /* synthetic */ void LIZJ(C74824TYe c74824TYe, java.util.Map map) {
        c74824TYe.getClass();
        EnumC74778TWk LJIIJ2 = LJIIJ();
        c74824TYe.getClass();
        LIZIZ(map, LJIIJ2);
    }

    public static String LJII(boolean z, Room room) {
        long j;
        if (!z) {
            Integer num = null;
            if (LinkMicMultiGuestV3AndroidPreviewOptSwitchSetting.INSTANCE.getValue()) {
                MultiGuestDataHolder multiGuestDataHolder = LIZIZ;
                if (multiGuestDataHolder != null) {
                    num = Integer.valueOf(multiGuestDataHolder.LJJJIL);
                }
                return LJLLI(num);
            }
            MultiGuestDataHolder multiGuestDataHolder2 = LIZIZ;
            if (multiGuestDataHolder2 != null) {
                num = Integer.valueOf(multiGuestDataHolder2.LJJIJLIJ);
            }
            return LJLLI(num);
        }
        if (room != null) {
            j = C74769TWb.LJ(room);
        } else {
            j = 0;
        }
        return LJLLI(Integer.valueOf((int) j));
    }

    public static void LJJIIJZLJL(String str, boolean z) {
        String str2;
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            hashMap.put("room_id", idStr);
        }
        hashMap.put("list_type", str);
        if (z) {
            str2 = "click";
        } else if (!z) {
            str2 = "show";
        } else {
            throw new C162476Zf();
        }
        hashMap.put("action_type", str2);
        LJLL("livesdk_anchor_guest_connection_panel_more", hashMap);
    }

    public static void LJJIJIIJI(String str, EnumC75310Th4 switchType) {
        o.LJIIIZ(switchType, "switchType");
        if (switchType != EnumC75310Th4.TURN_ON && switchType != EnumC75310Th4.TURN_OFF) {
            return;
        }
        HashMap hashMap = new HashMap();
        LIZ(hashMap);
        hashMap.put("connection_type", "guest");
        hashMap.put("switch_to", str);
        LJLL("livesdk_layoutsettings_fixed_number_of_windows", hashMap);
    }

    public static void LJJJ(boolean z, boolean z2) {
        String str;
        String str2;
        HashMap LIZLLL2 = C73098SmU.LIZLLL();
        if (z) {
            str = "confirm";
        } else {
            str = "cancel";
        }
        LIZLLL2.put("click_type", str);
        if (z2) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = "1";
        }
        LIZLLL2.put("show_again", str2);
        LJLL("livesdk_guest_connection_apply_first_popup_click", LIZLLL2);
    }

    public static void LJJJIL(String str, String str2) {
        HashMap hashMap = new HashMap();
        LIZ(hashMap);
        hashMap.put("content_starling_key", str);
        hashMap.put(WM7.SCENE_SERVICE, str2);
        LJLL("livesdk_guest_microphone_occupied_toast_show", hashMap);
    }

    public static void LJJJJI(long j, String str) {
        if (C74838TYs.LJ().LJJIJ) {
            return;
        }
        HashMap hashMap = new HashMap();
        LIZ(hashMap);
        hashMap.put("request_page", str);
        hashMap.put("anchor_relationship", String.valueOf(j));
        LJLL("livesdk_guest_connection_icon_show", hashMap);
    }

    public static void LJJJJJL(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("popup_action_type", str);
        hashMap.put("popup_click_type", str2);
        LJLL("livesdk_guest_decline_invitation_popup_with_setting", hashMap);
    }

    public static void LJJLJ(String trigger, EnumC74778TWk enumC74778TWk) {
        o.LJIIIZ(trigger, "trigger");
        if (TV3.LIZJ() || LIZJ == null) {
            return;
        }
        HashMap LIZLLL2 = C73098SmU.LIZLLL();
        if (!o.LJ(trigger, "live_over") && !o.LJ(trigger, "manual_setting_switch") && !o.LJ(trigger, "connection_start")) {
            trigger = "others";
        }
        LIZLLL2.put("trigger", trigger);
        if (enumC74778TWk == null) {
            enumC74778TWk = LIZJ;
        }
        LIZJ = null;
        LIZLLL2.put("layout_setting", LJI(enumC74778TWk).getFirst());
        LIZLLL2.put("window_setting", LJI(enumC74778TWk).getSecond());
        LIZLLL2.put("duration", String.valueOf(System.currentTimeMillis() - LIZLLL));
        LJLL("livesdk_multilive_mode_watch_duration", LIZLLL2);
    }

    public static void LJJLJLI(String trigger, Integer num) {
        int i;
        o.LJIIIZ(trigger, "trigger");
        if (TV3.LIZJ()) {
            return;
        }
        EnumC74778TWk LJIIJ2 = LJIIJ();
        if (LJIIJ2 == null) {
            LJIIJ2 = EnumC74778TWk.NORMAL;
        }
        MultiGuestDataHolder multiGuestDataHolder = LIZIZ;
        if (multiGuestDataHolder != null) {
            i = multiGuestDataHolder.LJIILIIL;
        } else {
            i = 0;
        }
        if ((LJIIJ2 == EnumC74778TWk.FLOATING || LJIIJ2 == EnumC74778TWk.GRID) && i < 1) {
            LJIIJ2 = EnumC74778TWk.NORMAL;
        }
        EnumC74778TWk enumC74778TWk = LIZJ;
        if (LJIIJ2 == enumC74778TWk) {
            return;
        }
        if (enumC74778TWk != null) {
            LJJLJ(trigger, enumC74778TWk);
        }
        HashMap hashMap = new HashMap();
        LIZ(hashMap);
        hashMap.put("trigger", trigger);
        LIZJ = LJIIJ2;
        hashMap.put("layout_setting", LJI(LJIIJ2).getFirst());
        hashMap.put("window_setting", LJI(LJIIJ2).getSecond());
        if (num != null) {
            C0EM.LIZJ(num, hashMap, "guest_cnt");
        }
        LJLL("livesdk_multilive_mode_watch_start", hashMap);
        LIZLLL = System.currentTimeMillis();
    }

    public static void LJLJJL(int i, String str) {
        HashMap LIZLLL2 = C73098SmU.LIZLLL();
        LIZLLL2.put("threshold_cnt", String.valueOf(i));
        LIZLLL2.put("trigger_type", str);
        LJLL("livesdk_anchor_guest_request_filter_start", LIZLLL2);
    }

    public static void LJLJJLL(int i, String str) {
        HashMap LIZLLL2 = C73098SmU.LIZLLL();
        LIZLLL2.put("threshold_cnt", String.valueOf(i));
        LIZLLL2.put("set_type", str);
        LJLL("livesdk_anchor_guest_request_filter_threshold_set", LIZLLL2);
    }

    public static void LJLL(String str, java.util.Map map) {
        BZI LIZ2 = C28787BRn.LIZ(str);
        LIZ2.LJJIFFI(map);
        if ((o.LJ("livesdk_linkmic_multi_guest_icon_show", str) || o.LJ("livesdk_multilive_mode_watch_duration", str) || o.LJ("livesdk_multilive_mode_watch_start", str) || o.LJ("livesdk_linkmic_perf_api_finish", str) || o.LJ("livesdk_video_box_gift_icon_effect_show", str) || o.LJ("livesdk_guest_connection_icon_show", str)) && BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
            LIZ2.LJJIJ();
            LIZ2.LJI();
            LIZ2.LJIJJ(BJM.LJLIL.LIZJ(), "live_type");
            LIZ2.LJIJJ(BJM.LIZLLL(), "action_type");
            LIZ2.LJIJJ(BJM.LJIILIIL(), "request_id");
            LIZ2.LJJIIZI();
            return;
        }
        LIZ2.LJIIZILJ();
        LIZ2.LJJIIJZLJL();
    }

    public final void LJIIZILJ(String str, String str2) {
        HashMap LIZLLL2 = C73098SmU.LIZLLL();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            LIZLLL2.put("room_id", idStr);
            LIZLLL2.put("anchor_id", String.valueOf(room.getOwnerUserId()));
        }
        LIZLLL2.put("request_page", str);
        LIZLLL2.put("guest_connected_cnt", String.valueOf(C74838TYs.LJ().LJJ));
        LIZLLL2.put("tab_name", str2);
        LIZJ(this, LIZLLL2);
        LJLL("livesdk_anchor_guest_blank_panel_click", LIZLLL2);
    }

    public final void LJJI(int i, String str) {
        HashMap LIZJ2 = C03660Ck.LIZJ("change_type", str);
        LIZJ2.put("enlarge_type", String.valueOf(i));
        LIZJ2.put("connected_guest_cnt", String.valueOf(C78886Uxe.LJJJJZI(C8E.LJ())));
        LIZJ(this, LIZJ2);
        LIZ(LIZJ2);
        LJLL("livesdk_anchor_change_anchor_screen_success", LIZJ2);
    }

    public final void LJJJJLL(String str, String str2) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        String str3;
        int i;
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            hashMap.put("room_id", idStr);
            t1.LJ((C29374Bfu) B83.LIZ().LIZIZ(), hashMap, "guest_id");
        }
        hashMap.put("guest_invite_type", str);
        hashMap.put("connection_status", str2);
        hashMap.put("reservation_id", String.valueOf(C75027TcV.LIZLLL));
        if (C75027TcV.LIZLLL != 0) {
            hashMap.put("is_reservation_sender", "1");
        }
        MultiGuestDataHolder multiGuestDataHolder = LIZIZ;
        if (multiGuestDataHolder != null) {
            bool = Boolean.valueOf(multiGuestDataHolder.LIZLLL);
        } else {
            bool = null;
        }
        hashMap.put("mic_status", String.valueOf(!C29306Beo.LJIL(bool) ? 1 : 0));
        MultiGuestDataHolder multiGuestDataHolder2 = LIZIZ;
        if (multiGuestDataHolder2 != null) {
            bool2 = Boolean.valueOf(multiGuestDataHolder2.LJ);
        } else {
            bool2 = null;
        }
        if (C29306Beo.LJIL(bool2)) {
            str3 = "off";
        } else {
            MultiGuestDataHolder multiGuestDataHolder3 = LIZIZ;
            if (multiGuestDataHolder3 != null) {
                bool3 = Boolean.valueOf(multiGuestDataHolder3.LJIIIIZZ);
            } else {
                bool3 = null;
            }
            if (C29306Beo.LJJIFFI(bool3)) {
                str3 = "rear";
            } else {
                str3 = "front";
            }
        }
        hashMap.put("camera_type", str3);
        MultiGuestDataHolder multiGuestDataHolder4 = LIZIZ;
        if (multiGuestDataHolder4 != null) {
            i = multiGuestDataHolder4.LJIILIIL;
        } else {
            i = 0;
        }
        hashMap.put("guest_cnt", String.valueOf(i));
        hashMap.put("guest_permission", LJII(false, null));
        LIZJ(this, hashMap);
        LJLL("livesdk_guest_preview_page_show", hashMap);
    }

    public static final void LJJIIJ(long j, String str, String str2) {
        HashMap hashMap = new HashMap();
        if (o.LJ(LJIIJJI, "appointment_guide")) {
            hashMap.put("enter_from", "appointment_guide");
        }
        hashMap.put("is_reservation_sender", CardStruct.IStatusCode.DEFAULT);
        AnonymousClass391.LJFF(hashMap, "click_time", str, j, "reservation_id");
        hashMap.put("reservation_status", str2);
        LJLL("livesdk_anchor_guest_connection_reservation_show", hashMap);
    }

    public static void LJJIIZI(int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        LIZ(hashMap);
        hashMap.put("connection_type", "guest");
        hashMap.put("switch_to", str);
        C116484hg.LIZIZ(hashMap, "way_of_switch", str2, i, "is_success");
        LJLL("livesdk_camera_on_and_off", hashMap);
    }

    public static void LJJIJL(User user, FanTicketRanklistResponse.ResponseData responseData, boolean z) {
        Long l;
        String str;
        List<FanTicketRanklistResponse.RanklistUser> list;
        LJII = System.currentTimeMillis();
        HashMap LIZLLL2 = C73098SmU.LIZLLL();
        User LJ2 = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
        o.LJIIIIZZ(LJ2, "getInstance().user().currentUserOpt");
        LIZLLL2.put("user_type", LJIILL(LJ2));
        if (user != null) {
            l = Long.valueOf(user.getId());
        } else {
            l = null;
        }
        LIZLLL2.put("guest_id", String.valueOf(l));
        int i = 0;
        if (user != null && user.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZLLL2.put("is_own_ranking", str);
        LIZLLL2.put("ranking_enter_from", "guest_window");
        if (responseData != null && (list = responseData.ranklistUsers) != null) {
            i = list.size();
        }
        LIZLLL2.put("contributors_num", String.valueOf(i));
        LIZLLL2.put("user_rank", LJIILJJIL(responseData));
        LIZLLL2.put("is_liveshow_ongoing", String.valueOf(z ? 1 : 0));
        LJLL("livesdk_guest_charm_ranking_list_show", LIZLLL2);
    }

    public static void LJJIJLIJ(User user, String str, boolean z) {
        Long l;
        String str2;
        HashMap LIZLLL2 = C73098SmU.LIZLLL();
        if (str != null) {
            LIZLLL2.put("gift_enter_from", str);
        }
        User LJ2 = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
        o.LJIIIIZZ(LJ2, "getInstance().user().currentUserOpt");
        LIZLLL2.put("user_type", LJIILL(LJ2));
        if (user != null) {
            LIZLLL2.put("to_user_type", LJIILL(user));
            l = Long.valueOf(user.getId());
        } else {
            l = null;
        }
        LIZLLL2.put("to_user_id", String.valueOf(l));
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZLLL2.put("is_back", str2);
        LJLL("livesdk_gift_recipient_switch_entrance_show", LIZLLL2);
    }

    public static void LJJJI(boolean z, boolean z2, Integer num) {
        String str;
        String str2;
        String str3;
        HashMap LIZLLL2 = C73098SmU.LIZLLL();
        if (z) {
            str = "click";
        } else {
            str = "show";
        }
        LIZLLL2.put("popup_action_type", str);
        if (z) {
            if (z2) {
                str2 = "confirm";
            } else {
                str2 = "cancel";
            }
        } else {
            str2 = "";
        }
        LIZLLL2.put("popup_click_type", str2);
        if (num != null && num.intValue() != 8 && num.intValue() != 5) {
            if (num.intValue() == 6) {
                str3 = "close_icon";
            } else if (num.intValue() == 11) {
                str3 = "kick_out";
            } else if (num.intValue() == 48) {
                str3 = "draw";
            }
            LIZLLL2.put("leave_type", str3);
            LJLL("livesdk_guest_connection_applying_leave_popup", LIZLLL2);
        }
        str3 = "button_back";
        LIZLLL2.put("leave_type", str3);
        LJLL("livesdk_guest_connection_applying_leave_popup", LIZLLL2);
    }

    public static void LJJLIL(String str, Integer num, int i) {
        if ((i & 4) != 0) {
            num = null;
        }
        if (TV3.LIZJ()) {
            return;
        }
        HashMap hashMap = new HashMap();
        LIZ(hashMap);
        hashMap.put("trigger", str);
        EnumC74778TWk LJIIJ2 = LJIIJ();
        if (LJIIJ2 != null) {
            LJ = LJIIJ2;
        }
        hashMap.put("layout_setting", LJI(LJIIJ2).getFirst());
        hashMap.put("window_setting", LJI(LJIIJ2).getSecond());
        if (num != null) {
            C0EM.LIZJ(num, hashMap, "guest_cnt");
        }
        LJLL("livesdk_multilive_mode_connection_start", hashMap);
        LJFF = System.currentTimeMillis();
        if (o.LJ(str, "connection_start")) {
            LJI = System.currentTimeMillis();
        }
        LJJLJLI(str, null);
    }

    public static void LJJLL(String str, boolean z, boolean z2) {
        String str2;
        Object obj;
        if (str == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            hashMap.put("room_id", idStr);
            if (z) {
                str2 = "click";
            } else {
                str2 = "show";
            }
            hashMap.put("action_type", str2);
            String str3 = "1";
            if (C74838TYs.LJ().LJJ != 0) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("is_guest_connection", obj);
            hashMap.put("guest_cnt", String.valueOf(C74838TYs.LJ().LJJ));
            hashMap.put("user_id", str);
            if (!z2) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("is_mutal", str3);
            LIZJ(LIZ, hashMap);
            LJLL("livesdk_anchor_guest_connection_animation", hashMap);
        }
    }

    public static void LJLIIL(EnumC74827TYh triggerMode, boolean z, boolean z2) {
        Object obj;
        o.LJIIIZ(triggerMode, "triggerMode");
        HashMap hashMap = new HashMap();
        LIZ(hashMap);
        hashMap.put("connection_type", "guest");
        hashMap.put("trigger", triggerMode.getValue());
        String str = "on";
        if (z2) {
            obj = "on";
        } else {
            obj = "off";
        }
        hashMap.put("guest_mode_status", obj);
        if (!z2 || !z) {
            str = "off";
        }
        hashMap.put("switch_to", str);
        LJLL("livesdk_permissionsettings_viewer_on_and_off", hashMap);
    }

    public static void LJLJJI(String str, boolean z, TZX tzx) {
        int i;
        String str2;
        int i2;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2;
        List LJIIIIZZ2;
        HashMap LIZLLL2 = C73098SmU.LIZLLL();
        if (tzx != null && (LJIIIIZZ2 = tzx.LJIIIIZZ()) != null) {
            i = LJIIIIZZ2.size();
        } else {
            i = 0;
        }
        LIZLLL2.put("request_list_ucnt", String.valueOf(i));
        LIZLLL2.put("to_display_type", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZLLL2.put("is_first_time_click", str2);
        MultiGuestDataHolder LIZ2 = TRK.LIZ();
        int i3 = -1;
        if (LIZ2 != null && (multiLiveAnchorPanelSettings2 = LIZ2.LJIIJ) != null) {
            i2 = multiLiveAnchorPanelSettings2.layoutType;
        } else {
            i2 = -1;
        }
        MultiGuestDataHolder LIZ3 = TRK.LIZ();
        if (LIZ3 != null && (multiLiveAnchorPanelSettings = LIZ3.LJIIJ) != null) {
            i3 = multiLiveAnchorPanelSettings.fixMicNumAction;
        }
        EnumC74778TWk LIZJ2 = CL8.LIZJ(i2, i3);
        LIZLLL2.put("layout_setting", LJI(LIZJ2).getFirst());
        LIZLLL2.put("window_setting", LJI(LIZJ2).getSecond());
        LJLL("livesdk_anchor_guest_request_display_confirm", LIZLLL2);
    }

    public static void LJLJL(int i, String str, String str2) {
        if (i <= 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            hashMap.put("room_id", idStr);
            if (C29137Bc5.LIZIZ(room)) {
                hashMap.put("layout_id", LJ());
            }
            hashMap.put("live_type", LJIIIZ());
        }
        if (str2 != null) {
            hashMap.put("enter_from", str2);
        }
        hashMap.put("viewer_cnt", String.valueOf(i));
        hashMap.put("show_time", str);
        C77123UOp.LJIILJJIL(hashMap);
        LJLL("livesdk_anchor_guest_connection_viewers_list_invite_list_show", hashMap);
    }

    public final void LJJIFFI(int i, String guestId, String str) {
        o.LJIIIZ(guestId, "guestId");
        HashMap hashMap = new HashMap();
        hashMap.put("guest_id", guestId);
        hashMap.put("change_type", str);
        hashMap.put("enlarge_type", String.valueOf(i));
        hashMap.put("connected_guest_cnt", String.valueOf(C78886Uxe.LJJJJZI(C8E.LJ())));
        LIZJ(this, hashMap);
        LIZ(hashMap);
        LJLL("livesdk_anchor_change_guest_screen_success", hashMap);
    }

    public final void LJJJJL(String str, String[] requestPermissions, boolean z) {
        String str2;
        String str3;
        o.LJIIIZ(requestPermissions, "requestPermissions");
        HashMap LIZLLL2 = C73098SmU.LIZLLL();
        if (z) {
            str2 = LJIIIZ;
        } else {
            str2 = C75017TcL.LIZ;
        }
        if (str2 == null) {
            str2 = "";
        }
        LIZLLL2.put("check_permission_scene", str2);
        LIZLLL2.put("popup_type", "first_popup");
        LIZLLL2.put("guest_permission", LJII(false, null));
        if (ORY.LJJIJIIJIL("android.permission.RECORD_AUDIO", requestPermissions) && ORY.LJJIJIIJIL("android.permission.CAMERA", requestPermissions)) {
            str3 = "all";
        } else if (ORY.LJJIJIIJIL("android.permission.CAMERA", requestPermissions) && !ORY.LJJIJIIJIL("android.permission.RECORD_AUDIO", requestPermissions)) {
            str3 = "video";
        } else if (!ORY.LJJIJIIJIL("android.permission.CAMERA", requestPermissions) && ORY.LJJIJIIJIL("android.permission.RECORD_AUDIO", requestPermissions)) {
            str3 = "audio";
        } else {
            str3 = LiveGiftNewGifterBadgeSetting.DEFAULT;
        }
        LIZLLL2.put("require_permission", str3);
        LIZLLL2.put("click_type", str);
        LJLL("livesdk_guest_sys_permission_click", LIZLLL2);
    }

    public static void LJJIII(int i, String popupScene, String str, String str2) {
        o.LJIIIZ(popupScene, "popupScene");
        HashMap hashMap = new HashMap();
        LIZ(hashMap);
        hashMap.put("popup_scene", popupScene);
        hashMap.put("guest_cnt", String.valueOf(i));
        hashMap.put("action_type", str);
        hashMap.put("click_type", str2);
        LJLL("livesdk_anchor_expand_seat_guidance_popup", hashMap);
    }

    public static void LJJIJIL(User user, FanTicketRanklistResponse.ResponseData responseData, String str, String str2) {
        Long l;
        String str3;
        List<FanTicketRanklistResponse.RanklistUser> list;
        HashMap LIZLLL2 = C73098SmU.LIZLLL();
        User LJ2 = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
        o.LJIIIIZZ(LJ2, "getInstance().user().currentUserOpt");
        LIZLLL2.put("user_type", LJIILL(LJ2));
        if (user != null) {
            l = Long.valueOf(user.getId());
        } else {
            l = null;
        }
        LIZLLL2.put("guest_id", String.valueOf(l));
        int i = 0;
        if (user != null && user.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZLLL2.put("is_own_ranking", str3);
        LIZLLL2.put("ranking_enter_from", str);
        if (responseData != null && (list = responseData.ranklistUsers) != null) {
            i = list.size();
        }
        LIZLLL2.put("contributors_num", String.valueOf(i));
        LIZLLL2.put("user_rank", LJIILJJIL(responseData));
        LIZLLL2.put("click_type", str2);
        LJLL("livesdk_guest_charm_ranking_list_click", LIZLLL2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJJIL(int i, int i2, Integer num, String str) {
        String str2;
        HashMap LIZLLL2 = C73098SmU.LIZLLL();
        int i3 = 0;
        LIZLLL2.put("guest_permission", LJII(false, null));
        StringBuilder LIZ2 = X1D.LIZ();
        String str3 = "";
        LIZ2.append("");
        LIZ2.append(i);
        LIZLLL2.put("applying_guest_cnt", X1D.LIZIZ(LIZ2));
        Integer num2 = (Integer) C74740TUy.LIZLLL().LIZIZ;
        if (num2 == null || num2.intValue() != 1) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = "1";
        }
        LIZLLL2.put("is_applying", str2);
        String str4 = C75017TcL.LIZ;
        if (str4 != null) {
            str3 = str4;
        }
        LIZLLL2.put("request_page", str3);
        MultiGuestDataHolder multiGuestDataHolder = LIZIZ;
        if (multiGuestDataHolder != null) {
            i3 = multiGuestDataHolder.LJIILIIL;
        }
        LIZLLL2.put("connected_guest_cnt", String.valueOf(i3));
        LIZLLL2.put("request_display_setting", LJIIJJI(i2));
        if (num != null) {
            C0EM.LIZJ(num, LIZLLL2, "own_rank");
        }
        if (TUZ.LIZIZ() && str != null) {
            LIZLLL2.put("filter_request_setting", str);
        }
        LJLL("livesdk_guest_application_panel_show", LIZLLL2);
    }

    public static /* synthetic */ void LJJIZ(int i, int i2, String str, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            str = null;
        }
        LJJIL(i, i2, null, str);
    }

    public static void LJJL(String str, String str2, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        LIZ(hashMap);
        hashMap.put("connection_type", "guest");
        if (z2) {
            if (z) {
                str = "fixed";
            } else {
                str = "unfixed";
            }
        }
        hashMap.put("switch_to", str);
        hashMap.put("decision", str2);
        LJLL("livesdk_layoutwindowsettings_confirm", hashMap);
    }

    public static void LJJLI(FanTicketRanklistResponse.ResponseData responseData, String str, boolean z, boolean z2) {
        Object obj;
        int i;
        long j;
        List<FanTicketRanklistResponse.RanklistUser> list;
        HashMap LIZLLL2 = C73098SmU.LIZLLL();
        String str2 = "1";
        if (!z2) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        LIZLLL2.put("is_proactive_disconnect", obj);
        if (responseData != null && (list = responseData.ranklistUsers) != null) {
            i = list.size();
        } else {
            i = 0;
        }
        LIZLLL2.put("contributors_num", String.valueOf(i));
        if (responseData != null) {
            j = responseData.fanTicketTotal;
        } else {
            j = 0;
        }
        C43881HKb.LIZJ(j, LIZLLL2, "charm_values", "click_type", str);
        if (o.LJ(str, "disconnect")) {
            if (!z) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
        } else {
            str2 = "-1";
        }
        LIZLLL2.put("is_show_again", str2);
        LJLL("livesdk_guest_disconnect_ranking_popup_click", LIZLLL2);
    }

    public static void LJJLIIIJILLIZJL(long j, String str, String str2, Throwable th) {
        LIZLLL(new ARunnableS0S2100100_13(j, str, str2, th, 0));
    }

    public static void LJJLIIIJJIZ(long j, String str, String str2, String str3) {
        LIZLLL(new RunnableC74828TYi(str, j, str2, str3));
    }

    public static void LJJZ(int i, int i2, boolean z, int i3) {
        String str;
        HashMap LIZLLL2 = C73098SmU.LIZLLL();
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZLLL2.put("is_user_apply", str);
        LIZLLL2.put("apply_guest_cnt", String.valueOf(i));
        LIZLLL2.put("connected_guest_cnt", String.valueOf(i2));
        C116484hg.LIZIZ(LIZLLL2, "request_page", "connection_button", i3, "live_room_mode");
        LJLL("livesdk_guest_apply_panel_show", LIZLLL2);
    }

    public static void LJLJI(String str, String coinsGap, String str2, String str3) {
        long j;
        User owner;
        FollowInfo followInfo;
        o.LJIIIZ(coinsGap, "coinsGap");
        HashMap hashMap = new HashMap();
        LIZ(hashMap);
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
            j = followInfo.getFollowStatus();
        } else {
            j = 0;
        }
        C43881HKb.LIZJ(j, hashMap, "follow_status", "gift_id", str);
        hashMap.put("coins_gap", coinsGap);
        hashMap.put("popup_action_type", str2);
        hashMap.put("popup_type", str3);
        LJLL("livesdk_guest_prioritized_gift_popup_show", hashMap);
    }

    public static void LJLJLLL(String str, String errorCode, String errorDetail, String str2) {
        o.LJIIIZ(errorCode, "errorCode");
        o.LJIIIZ(errorDetail, "errorDetail");
        HashMap hashMap = new HashMap();
        LIZ(hashMap);
        hashMap.put("reason", str);
        hashMap.put("costTime", String.valueOf(C31012CFc.LIZIZ() - LJIIJ));
        hashMap.put("error_msg", errorCode);
        hashMap.put("error_detail", errorDetail);
        hashMap.put("log_id", str2);
        LJLL("livesdk_audio_chat_init_failed", hashMap);
    }

    public final void LJJ(int i, String str, String str2, boolean z) {
        String str3;
        HashMap LIZLLL2 = C73098SmU.LIZLLL();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            LIZLLL2.put("room_id", idStr);
            LIZLLL2.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            t1.LJ((C29374Bfu) B83.LIZ().LIZIZ(), LIZLLL2, "guest_id");
        }
        if (str == null) {
            str = "";
        } else if (o.LJ(str, "apply")) {
            str = "guest_apply_anchor";
        } else if (o.LJ(str, "invite")) {
            str = "anchor_invite_guest";
        }
        LIZLLL2.put("guest_invite_type", str);
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    LIZLLL2.put("guest_connection_type", "voice");
                }
            } else {
                LIZLLL2.put("guest_connection_type", "video");
            }
        } else {
            LIZLLL2.put("guest_connection_type", "video");
        }
        if (z) {
            str3 = "mute";
        } else {
            str3 = "unmute";
        }
        LIZLLL2.put("switch_to", str3);
        LIZLLL2.put("connection_type", "guest");
        LIZLLL2.put("setting_position", str2);
        LIZJ(this, LIZLLL2);
        LJLL("livesdk_guest_switch_mute_setting", LIZLLL2);
    }

    public final void LJJJJ(String str, String str2, boolean z, boolean z2) {
        String str3;
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -1183699191:
                    if (str2.equals("invite")) {
                        hashMap.put("guest_invite_type", "anchor_invite_guest");
                        break;
                    }
                    break;
                case -1006804125:
                    if (str2.equals("others")) {
                        hashMap.put("guest_invite_type", "others");
                        break;
                    }
                    break;
                case 93029230:
                    if (str2.equals("apply")) {
                        hashMap.put("guest_invite_type", "guest_apply_anchor");
                        break;
                    }
                    break;
                case 1466857630:
                    if (str2.equals("join_direct")) {
                        hashMap.put("guest_invite_type", "guest_apply_anchor");
                        break;
                    }
                    break;
            }
        }
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            hashMap.put("room_id", idStr);
            t1.LJ((C29374Bfu) B83.LIZ().LIZIZ(), hashMap, "guest_id");
        }
        hashMap.put("connection_type", "guest");
        String str4 = "off";
        if (!z) {
            str3 = "off";
        } else if (z2) {
            str3 = "rear";
        } else {
            str3 = "front";
        }
        hashMap.put("switch_to", str3);
        hashMap.put("way_of_switch", str);
        LIZJ(this, hashMap);
        LJLL("livesdk_guest_camera_on_and_off", hashMap);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("log_name", "ttlive_multilive_guest_switch_camera");
        if (z) {
            str4 = "on";
        }
        jSONObject.put("switch", str4);
        jSONObject.put("way", str);
        C0NB.LJIIIZ("MultiLiveGuestSwitchCamera", jSONObject.toString());
    }

    public static void LJJJJJ(int i, int i2, String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        LIZ(hashMap);
        hashMap.put("popup_type", str);
        hashMap.put("from_guest_seat", String.valueOf(i));
        hashMap.put("to_guest_seat", String.valueOf(i2));
        hashMap.put("action_type", str2);
        hashMap.put("click_type", str3);
        LJLL("livesdk_anchor_guest_seat_modification_popup", hashMap);
    }

    public static void LJJLIIIJ(int i, String str, String str2, long j, String str3) {
        if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_linkmic_perf_api_finish", LiveLogMonitorSampleSetting.getSAMPLE_1000())) {
            return;
        }
        HashMap hashMap = new HashMap();
        LIZ(hashMap);
        hashMap.put("source", str);
        hashMap.put("duration", String.valueOf(j));
        hashMap.put("logId", str2);
        hashMap.put("is_anchor", String.valueOf(o.LJ(hashMap.get("anchor_id"), hashMap.get("user_id")) ? 1 : 0));
        hashMap.put("error_code", String.valueOf(i));
        if (str3 != null) {
            hashMap.put("type", str3);
        }
        LJLL("livesdk_linkmic_perf_api_finish", hashMap);
    }

    public static /* synthetic */ void LJJLIIIJLLLLLLLZ(String str, int i, int i2, Long l, int i3) {
        Long l2 = l;
        if ((i3 & 8) != 0) {
            l2 = null;
        }
        LJJLIIIJLJLI(str, i, i2, l2, null, null, null);
    }

    public static void LJJZZI(boolean z, String str, String str2, int i, DataChannel dataChannel) {
        Long l;
        Long l2;
        Long l3;
        String str3;
        String str4;
        User owner;
        FollowInfo followInfo;
        LiveMode streamType;
        HashMap LIZ2 = C1R5.LIZ(str, "guestInviteType");
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        long j = C75027TcV.LIZLLL;
        if (j != 0) {
            str = "guest_apply_anchor";
        }
        Long l4 = null;
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        LIZ2.put("room_id", String.valueOf(l));
        if (room != null) {
            l2 = Long.valueOf(room.getId());
        } else {
            l2 = null;
        }
        LIZ2.put("channel_id", String.valueOf(l2));
        LIZ2.put("connection_type", "audience");
        if (room != null) {
            l3 = Long.valueOf(room.getOwnerUserId());
        } else {
            l3 = null;
        }
        LIZ2.put("anchor_id", String.valueOf(l3));
        if (room == null || (streamType = room.getStreamType()) == null || (str3 = streamType.logStreamingType) == null) {
            str3 = "video_live";
        }
        LIZ2.put("live_type", str3);
        LIZ2.put("permission_type", C74776TWi.LJ());
        if (z) {
            str4 = "on";
        } else {
            str4 = "off";
        }
        LIZ2.put("camera_status", str4);
        LIZ2.put("guest_invite_type", str);
        LIZ2.put("reservation_id", String.valueOf(C75027TcV.LIZLLL));
        if (j != 0) {
            LIZ2.put("is_reservation_sender", "1");
        }
        if (room != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
            l4 = Long.valueOf(followInfo.getFollowStatus());
        }
        LIZ2.put("anchor_relationship", String.valueOf(l4));
        if (room != null && C29137Bc5.LIZIZ(room)) {
            LIZ2.put("layout_id", LJ());
        } else {
            C29556Biq.LIZ().getClass();
            LIZ2.put("layout_setting", LJI(C74983Tbn.LIZJ()).getFirst());
            C29556Biq.LIZ().getClass();
            LIZ2.put("window_setting", LJI(C74983Tbn.LIZJ()).getSecond());
        }
        LIZ2.put("link_id", str2);
        LIZ2.put("guest_cnt", String.valueOf(i));
        C77123UOp.LJIILIIL(LIZ2);
        C77123UOp.LJIIJ(LIZ2);
        C77123UOp.LJIIL(LIZ2);
        C77123UOp.LJIIJJI(LIZ2);
        C77123UOp.LJIIIZ(LIZ2);
        C77123UOp.LJIILJJIL(LIZ2);
        String str5 = C75017TcL.LIZIZ;
        o.LJIIIIZZ(str5, "getInvitationType()");
        LIZ2.put("invitation_type", str5);
        BZI LIZ3 = C28787BRn.LIZ("livesdk_guest_connection_success_onstage");
        LIZ3.LJJIFFI(LIZ2);
        LIZ3.LJIIJJI("live_detail");
        LIZ3.LJIIIZ("live_function");
        LIZ3.LJIILLIIL(dataChannel);
        LIZ3.LJJIIJZLJL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJJZZIII(long j, long j2, boolean z, String linkId, String str) {
        TRS trs;
        String str2;
        String str3;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        o.LJIIIZ(linkId, "linkId");
        HashMap hashMap = new HashMap();
        LIZ(hashMap);
        C75559Tl5 c75559Tl5 = C75559Tl5.LIZIZ;
        Object obj = c75559Tl5.LIZJ().get("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        if (obj instanceof InterfaceC31805Ce1) {
            trs = (TRS) obj;
        } else {
            trs = null;
        }
        hashMap.put("guest_id", String.valueOf(j));
        String str4 = "null";
        if (trs == null || (str2 = trs.LIZIZ(j)) == null) {
            str2 = "null";
        }
        hashMap.put("guest_invite_type", str2);
        Object obj2 = C58582Myw.LIZ().get(Long.valueOf(j));
        if (obj2 != 0) {
            str4 = obj2;
        }
        hashMap.put("enter_from", str4);
        hashMap.put("connection_over_type", str);
        hashMap.put("link_id", linkId);
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        AnonymousClass391.LJFF(hashMap, "is_multi_guest_moderator_action", str3, j2, "anchor_relationship");
        Long l = (Long) C75457TjR.LJFF().get(Long.valueOf(j));
        if (l != null) {
            hashMap.put("gift_num", String.valueOf(l.longValue()));
        }
        Integer num = (Integer) C75457TjR.LJI().get(Long.valueOf(j));
        if (num != null) {
            hashMap.put("gift_rank", String.valueOf(num.intValue()));
        }
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) c75559Tl5.LIZIZ("MULTI_GUEST_DATA_HOLDER");
        if (multiGuestDataHolder != null && (multiLiveAnchorPanelSettings = multiGuestDataHolder.LJIIJ) != null) {
            hashMap.put("request_display_setting", LJIIJJI(multiLiveAnchorPanelSettings.applierSortSetting));
        }
        String remove = C74830TYk.LJ.remove(Long.valueOf(j));
        if (remove != null) {
            hashMap.put("request_page", remove);
        }
        if (TUZ.LIZ()) {
            ConcurrentHashMap<Long, Integer> concurrentHashMap = TYJ.LIZ;
            Integer num2 = concurrentHashMap.get(Long.valueOf(j));
            if (num2 != null) {
                hashMap.put("is_prioritized_request", num2.toString());
            } else {
                hashMap.put("is_prioritized_request", CardStruct.IStatusCode.DEFAULT);
            }
            concurrentHashMap.remove(Long.valueOf(j));
        }
        LJLL("livesdk_anchor_guest_disconnect", hashMap);
        C75457TjR.LJFF().remove(Long.valueOf(j));
        C75457TjR.LJI().remove(Long.valueOf(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJLI(int i, int i2, long j, String str, boolean z) {
        TRS trs;
        String str2;
        String str3;
        HashMap LIZLLL2 = C73098SmU.LIZLLL();
        Object obj = C75559Tl5.LIZIZ.LIZJ().get("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        if (obj instanceof InterfaceC31805Ce1) {
            trs = (TRS) obj;
        } else {
            trs = null;
        }
        LIZLLL2.put("guest_id", String.valueOf(j));
        String str4 = "null";
        if (trs == null || (str2 = trs.LIZIZ(j)) == null) {
            str2 = "null";
        }
        LIZLLL2.put("guest_invite_type", str2);
        String str5 = "off";
        if (i != 0) {
            if (i != 1) {
                str3 = "off";
            } else {
                str3 = "on";
            }
        } else {
            str3 = "abnormal";
        }
        LIZLLL2.put("to_camera_status", str3);
        if (i2 == 1) {
            str5 = "on";
        }
        LIZLLL2.put("to_mic_status", str5);
        LIZLLL2.put("link_id", str);
        Object obj2 = C58582Myw.LIZ().get(Long.valueOf(j));
        if (obj2 != 0) {
            str4 = obj2;
        }
        LIZLLL2.put("enter_from", str4);
        if (z) {
            LJLL("livesdk_anchor_guest_camera_status_switch_success", LIZLLL2);
        } else {
            LJLL("livesdk_anchor_guest_mic_status_switch_success", LIZLLL2);
        }
    }

    public static void LJLIIIL(int i, String from, boolean z, String linkId, String guestInviteType) {
        String str;
        String str2;
        o.LJIIIZ(from, "from");
        o.LJIIIZ(linkId, "linkId");
        o.LJIIIZ(guestInviteType, "guestInviteType");
        HashMap hashMap = new HashMap();
        LIZ(hashMap);
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        hashMap.put("switch_to", str);
        hashMap.put("way_of_switch", from);
        hashMap.put("link_id", linkId);
        if (o.LJ(guestInviteType, "apply")) {
            str2 = "guest_apply_anchor";
        } else if (o.LJ(guestInviteType, "invite")) {
            str2 = "anchor_invite_guest";
        } else {
            str2 = "others";
        }
        hashMap.put("guest_invite_type", str2);
        C116484hg.LIZIZ(hashMap, "connection_type", "guest", i, "live_room_mode");
        LJLL("livesdk_guest_camera_on_and_off_save", hashMap);
    }

    public final void LJIJI(long j, String str, String str2, String str3, String linkId) {
        String str4 = str3;
        o.LJIIIZ(linkId, "linkId");
        if (str4 == null) {
            str4 = "";
        } else if (o.LJ(str4, "apply")) {
            str4 = "guest_apply_anchor";
        } else if (o.LJ(str4, "invite")) {
            str4 = "anchor_invite_guest";
        }
        if (TextUtils.equals(str, "guest")) {
            HashMap LIZLLL2 = C73098SmU.LIZLLL();
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                String idStr = room.getIdStr();
                o.LJIIIIZZ(idStr, "room.idStr");
                LIZLLL2.put("room_id", idStr);
                LIZLLL2.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            }
            LIZLLL2.put("initiator", "guest");
            LIZLLL2.put("request_page", str2);
            AnonymousClass391.LJFF(LIZLLL2, "guest_invite_type", str4, j, "guest_id");
            LIZLLL2.put("link_id", linkId);
            LIZLLL2.put("duration", String.valueOf(System.currentTimeMillis() - LJI));
            LIZJ(this, LIZLLL2);
            LJLL("livesdk_guest_connection_click_disconnect", LIZLLL2);
            return;
        }
        if (!TextUtils.equals(str, "anchor")) {
            return;
        }
        HashMap LIZLLL3 = C73098SmU.LIZLLL();
        Room room2 = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room2 != null) {
            String idStr2 = room2.getIdStr();
            o.LJIIIIZZ(idStr2, "room.idStr");
            LIZLLL3.put("room_id", idStr2);
            LIZLLL3.put("anchor_id", String.valueOf(room2.getOwnerUserId()));
            t1.LJ((C29374Bfu) B83.LIZ().LIZIZ(), LIZLLL3, "guest_id");
        }
        LIZLLL3.put("initiator", "anchor");
        LIZLLL3.put("request_page", str2);
        AnonymousClass391.LJFF(LIZLLL3, "guest_invite_type", str4, j, "guest_id");
        LIZLLL3.put("link_id", linkId);
        LIZJ(this, LIZLLL3);
        LJLL("livesdk_anchor_guest_connection_click_disconnect", LIZLLL3);
    }

    public final void LJJII(int i, String anchorId, String guestId, String str, String str2) {
        o.LJIIIZ(anchorId, "anchorId");
        o.LJIIIZ(guestId, "guestId");
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", anchorId);
        hashMap.put("guest_id", guestId);
        hashMap.put("enlarge_type", String.valueOf(i));
        hashMap.put("connected_guest_cnt", String.valueOf(C78886Uxe.LJJJJZI(C8E.LJ())));
        LIZJ(this, hashMap);
        LIZ(hashMap);
        hashMap.put("action_type", str);
        hashMap.put("to_user_type", str2);
        LJLL("livesdk_anchor_enlarge_guest_screen_icon", hashMap);
    }

    public final void LJIJJLI(int i, int i2, String str, String str2, String str3, boolean z) {
        HashMap LIZLLL2 = C73098SmU.LIZLLL();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            LIZLLL2.put("room_id", idStr);
            LIZLLL2.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            t1.LJ((C29374Bfu) B83.LIZ().LIZIZ(), LIZLLL2, "guest_id");
        }
        if (str == null) {
            str = "guest_apply_anchor";
        }
        LIZLLL2.put("guest_invite_type", str);
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    LIZLLL2.put("camera_status", "off");
                }
            } else {
                LIZLLL2.put("camera_status", "on");
            }
        } else {
            LIZLLL2.put("camera_status", "abnormal");
        }
        if (i2 != 1) {
            if (i2 == 2) {
                LIZLLL2.put("mic_status", "off");
            }
        } else {
            LIZLLL2.put("mic_status", "on");
        }
        if (z) {
            LIZLLL2.put("switch_type", "camera");
        } else {
            LIZLLL2.put("switch_type", "mico");
        }
        if (str3 == null) {
            str3 = "";
        }
        LIZLLL2.put("windows_type", str3);
        LIZLLL2.put("action_type", str2);
        LIZJ(this, LIZLLL2);
        LJLL("livesdk_guest_connection_status_switch", LIZLLL2);
    }

    public final void LJIL(String str, int i, int i2, List<String> list, Long l, String str2) {
        if (!UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_anchor_guest_connection_status_show")) {
            return;
        }
        HashMap LIZLLL2 = C73098SmU.LIZLLL();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            LIZLLL2.put("room_id", idStr);
            LIZLLL2.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            LIZLLL2.put("guest_id", String.valueOf(l));
            String json = GsonProtectorUtils.toJson(C09650Zl.LIZJ, list);
            o.LJIIIIZZ(json, "getDefault().toJson(showTagList)");
            LIZLLL2.put("show_tag_list", json);
        }
        if (str2 != null) {
            LIZLLL2.put("enter_from", str2);
        }
        if (str == null) {
            str = "guest_apply_anchor";
        }
        LIZLLL2.put("guest_invite_type", str);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    LIZLLL2.put("camera_status", "");
                } else {
                    LIZLLL2.put("camera_status", "off");
                }
            } else {
                LIZLLL2.put("camera_status", "on");
            }
        } else {
            LIZLLL2.put("camera_status", "abnormal");
        }
        if (i2 != 1) {
            if (i2 != 2) {
                LIZLLL2.put("camera_status", "");
            } else {
                LIZLLL2.put("mic_status", "off");
            }
        } else {
            LIZLLL2.put("mic_status", "on");
        }
        LIZJ(this, LIZLLL2);
        LJLL("livesdk_anchor_guest_connection_status_show", LIZLLL2);
    }

    public static void LJIJJ(String requestPage, Long l, HashMap hashMap, String clickPosition, String connectionType, Long l2, int i) {
        String str;
        String str2;
        java.util.Map<String, String> params;
        String l3;
        C74824TYe c74824TYe = LIZ;
        if ((i & 8) != 0) {
            clickPosition = "gift_panel";
        }
        if ((i & 16) != 0) {
            connectionType = ((IInteractService) CN1.LIZ(IInteractService.class)).getConnectionType();
            o.LJIIIIZZ(connectionType, "getService(IInteractServ…lass.java).connectionType");
        }
        if ((i & 32) != 0) {
            l2 = null;
        }
        o.LJIIIZ(requestPage, "requestPage");
        o.LJIIIZ(clickPosition, "clickPosition");
        o.LJIIIZ(connectionType, "connectionType");
        HashMap hashMap2 = new HashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            hashMap2.put("room_id", idStr);
            hashMap2.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            hashMap2.put("guest_id", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
            hashMap2.put("server_heat_level", String.valueOf(((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).u4(room.getId())));
            hashMap2.put("client_heat_level", String.valueOf(((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).F(room.getId())));
        }
        if (o.LJ(BJM.LJIIIIZZ(), "portal")) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap2.put("is_portal_user", str);
        if (o.LJ(BJM.LJIIIIZZ(), "portal")) {
            hashMap2.put("portal_id", String.valueOf(BJM.LJIIL()));
        }
        hashMap2.put("request_page", requestPage);
        hashMap2.put("click_user_position", clickPosition);
        hashMap2.put("connection_type", connectionType);
        String str3 = "";
        if (l == null || (str2 = l.toString()) == null) {
            str2 = "";
        }
        hashMap2.put("to_user_id", str2);
        MultiGuestDataHolder multiGuestDataHolder = LIZIZ;
        int i2 = 0;
        if (multiGuestDataHolder != null && multiGuestDataHolder.LJIILIIL > 0) {
            i2 = 1;
        }
        hashMap2.put("is_guest_connection", String.valueOf(i2));
        if (l2 != null && (l3 = l2.toString()) != null) {
            str3 = l3;
        }
        hashMap2.put("multiguest_liveshow_ranking_num", str3);
        LIZJ(c74824TYe, hashMap2);
        LIZ(hashMap2);
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
        IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
        if (iInteractService.Qe0()) {
            params = iInteractService.L00();
        } else {
            params = new LinkedHashMap<>();
        }
        if (!TextUtils.isEmpty(iInteractService.FZ())) {
            if (TextUtils.equals("in_pk", iInteractService.FZ())) {
                o.LJIIIIZZ(params, "params");
                params.put("match_status", "pk_phase");
            } else {
                o.LJIIIIZZ(params, "params");
                params.put("match_status", "punish");
            }
        }
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
        hashMap2.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
        hashMap2.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
        hashMap2.putAll(params);
        LJLL("livesdk_follow", hashMap2);
    }

    public static void LJJLIIIJLJLI(String str, int i, int i2, Long l, Integer num, Long l2, String str2) {
        if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_linkmic_multi_guest_icon_show", LiveLogMonitorSampleSetting.getSAMPLE_100())) {
            return;
        }
        HashMap hashMap = new HashMap();
        LIZ(hashMap);
        hashMap.put(WM7.SCENE_SERVICE, str);
        hashMap.put("response_status", String.valueOf(i));
        hashMap.put("is_visible", String.valueOf(i2));
        if (l != null) {
            hashMap.put("permission_error_code", String.valueOf(l.longValue()));
        }
        if (num != null) {
            C0EM.LIZJ(num, hashMap, "error_code");
        }
        if (l2 != null) {
            hashMap.put("duration", String.valueOf(l2.longValue()));
        }
        if (str2 != null) {
            hashMap.put("log_id", str2);
        }
        LJLL("livesdk_linkmic_multi_guest_icon_show", hashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJLJLJ(com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r7, java.lang.String r8, int r9, java.util.List r10, java.util.List r11, java.lang.String r12, java.lang.String r13) {
        /*
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LJLJJI
            java.lang.Class<X.Baa> r0 = X.C29044Baa.class
            java.lang.Object r2 = r1.mv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r2
            r5 = 1
            if (r2 == 0) goto L45
            long r0 = r2.getOwnerUserId()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "anchor_id"
            r3.put(r0, r1)
            java.lang.String r1 = r2.getIdStr()
            java.lang.String r0 = "room.idStr"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "room_id"
            r3.put(r0, r1)
            boolean r0 = X.C29137Bc5.LIZIZ(r2)
            if (r0 != r5) goto L3c
            java.lang.String r1 = LJ()
            java.lang.String r0 = "layout_id"
            r3.put(r0, r1)
        L3c:
            java.lang.String r1 = LJIIIZ()
            java.lang.String r0 = "live_type"
            r3.put(r0, r1)
        L45:
            if (r13 == 0) goto L4c
            java.lang.String r0 = "enter_from"
            r3.put(r0, r13)
        L4c:
            com.bytedance.android.live.base.model.user.User r0 = r7.mUser
            java.lang.String r1 = r0.getIdStr()
            java.lang.String r0 = "viewer.user.idStr"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "guest_id"
            r3.put(r0, r1)
            com.bytedance.android.live.base.model.user.User r0 = r7.mUser
            com.bytedance.android.live.base.model.user.FollowInfo r0 = r0.getFollowInfo()
            long r6 = r0.getFollowStatus()
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto Lda
        L6c:
            java.lang.String r4 = "0"
            if (r5 == 0) goto Lc9
        L70:
            r5 = r4
        L71:
            r1 = r5
        L72:
            java.lang.String r0 = "is_fans"
            r3.put(r0, r5)
            java.lang.String r0 = "is_mutal"
            r3.put(r0, r1)
            java.lang.String r1 = "status"
            java.lang.String r0 = "rank"
            X.C116484hg.LIZIZ(r3, r1, r8, r9, r0)
            com.google.gson.Gson r2 = X.C09650Zl.LIZJ
            java.lang.String r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r2, r11)
            java.lang.String r0 = "getDefault().toJson(tagList)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "tag_list"
            r3.put(r0, r1)
            java.lang.String r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r2, r10)
            java.lang.String r0 = "getDefault().toJson(showTagList)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "show_tag_list"
            r3.put(r0, r1)
            java.lang.String r1 = X.C58578Mys.LIZ
            java.lang.String r0 = "multi_request_id"
            r3.put(r0, r1)
            java.lang.String r0 = "show_time"
            r3.put(r0, r12)
            java.lang.String r1 = "tag_show_cnt"
            if (r10 == 0) goto Lc5
            int r0 = r10.size()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.put(r1, r0)
        Lbc:
            X.C77123UOp.LJIILJJIL(r3)
            java.lang.String r0 = "livesdk_anchor_guest_connection_viewers_list_invite_show"
            LJLL(r0, r3)
            return
        Lc5:
            r3.put(r1, r4)
            goto Lbc
        Lc9:
            r1 = 2
            java.lang.String r5 = "1"
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto Ld2
            goto L71
        Ld2:
            r1 = 3
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L70
            r1 = r4
            goto L72
        Lda:
            r1 = 1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto Le1
            goto L6c
        Le1:
            r5 = 0
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74824TYe.LJLJLJ(com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo, java.lang.String, int, java.util.List, java.util.List, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILLIIL(int i, int i2, String str, String requestPage, String str2, boolean z, long j) {
        InterfaceC31805Ce1 interfaceC31805Ce1;
        AbstractC74727TUl LIZ2;
        LinkPlayerInfo LJJIJL;
        o.LJIIIZ(requestPage, "requestPage");
        HashMap hashMap = new HashMap();
        LIZ(hashMap);
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            hashMap.put("guest_id", String.valueOf(j));
        }
        if (str == null) {
            str = "guest_apply_anchor";
        }
        hashMap.put("guest_invite_type", str);
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    hashMap.put("camera_status", "off");
                }
            } else {
                hashMap.put("camera_status", "on");
            }
        } else {
            hashMap.put("camera_status", "abnormal");
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hashMap.put("mic_status", "off");
            }
        } else {
            hashMap.put("mic_status", "on");
        }
        Object obj = C75559Tl5.LIZIZ.LIZJ().get("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        String str3 = null;
        if ((obj instanceof InterfaceC31805Ce1) && (interfaceC31805Ce1 = (InterfaceC31805Ce1) obj) != null && (LIZ2 = interfaceC31805Ce1.LIZ()) != null && ((LJJIJL = C76917UGr.LJJIJL(LIZ2, j)) == null || (str3 = LJJIJL.mInteractIdStr) == null)) {
            str3 = "";
        }
        hashMap.put("request_page", requestPage);
        hashMap.put("action_type", str2);
        String str4 = "null";
        if (str3 == null) {
            str3 = "null";
        }
        hashMap.put("link_id", str3);
        Object obj2 = C58582Myw.LIZ().get(Long.valueOf(j));
        if (obj2 != 0) {
            str4 = obj2;
        }
        hashMap.put("guest_enter_from", str4);
        LIZJ(this, hashMap);
        if (z) {
            LJLL("livesdk_anchor_guest_camera_status_switch", hashMap);
        } else {
            LJLL("livesdk_anchor_guest_mic_status_switch", hashMap);
        }
    }

    public final void LJLIL(boolean z, String str, String str2, String str3, int i, DataChannel dataChannel, EnumC74991Tbv layoutName) {
        o.LJIIIZ(layoutName, "layoutName");
        LJJJJIZL(this, z, "guest_apply_anchor", str, str2, str3, i, dataChannel, layoutName);
    }

    public final void LJLILLLLZI(boolean z, String str, String str2, String str3, int i, DataChannel dataChannel, EnumC74991Tbv layoutName) {
        o.LJIIIZ(layoutName, "layoutName");
        LJJJJIZL(this, z, "anchor_invite_guest", str, str2, str3, i, dataChannel, layoutName);
    }

    public static void LJJJJIZL(C74824TYe c74824TYe, boolean z, String guestInviteType, String str, String str2, String str3, int i, DataChannel dataChannel, EnumC74991Tbv layoutName) {
        Long l;
        Long l2;
        String str4;
        Long l3;
        String str5;
        String str6;
        String str7;
        Long l4;
        User owner;
        FollowInfo followInfo;
        LiveMode streamType;
        c74824TYe.getClass();
        o.LJIIIZ(guestInviteType, "guestInviteType");
        o.LJIIIZ(layoutName, "layoutName");
        C74740TUy LIZLLL2 = C74740TUy.LIZLLL();
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        long j = C75027TcV.LIZLLL;
        if (j != 0) {
            guestInviteType = "guest_apply_anchor";
        }
        hashMap.put("reservation_id", String.valueOf(j));
        if (j != 0) {
            hashMap.put("is_reservation_sender", "1");
        }
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        hashMap.put("room_id", String.valueOf(l));
        if (room != null) {
            l2 = Long.valueOf(room.getId());
        } else {
            l2 = null;
        }
        hashMap.put("channel_id", String.valueOf(l2));
        hashMap.put("connection_type", "audience");
        if (LIZLLL2.LJIIIZ) {
            str4 = String.valueOf(C31012CFc.LJFF(LIZLLL2.LJIIJ));
        } else {
            str4 = "1440";
        }
        hashMap.put("time", str4);
        if (room != null) {
            l3 = Long.valueOf(room.getOwnerUserId());
        } else {
            l3 = null;
        }
        hashMap.put("anchor_id", String.valueOf(l3));
        if (C74740TUy.LIZLLL().LJIIJJI == 1) {
            str5 = "video";
        } else {
            str5 = "voice";
        }
        hashMap.put("guest_connection_type", str5);
        C74740TUy.LIZLLL().getClass();
        hashMap.put("weight_decay_type", String.valueOf(0));
        if (room == null || (streamType = room.getStreamType()) == null || (str6 = streamType.logStreamingType) == null) {
            str6 = "video_live";
        }
        hashMap.put("live_type", str6);
        hashMap.put("permission_type", C74776TWi.LJ());
        if (z) {
            str7 = "on";
        } else {
            str7 = "off";
        }
        hashMap.put("camera_status", str7);
        hashMap.put("guest_invite_type", guestInviteType);
        if (room != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
            l4 = Long.valueOf(followInfo.getFollowStatus());
        } else {
            l4 = null;
        }
        hashMap.put("anchor_relationship", String.valueOf(l4));
        if (room != null && C29137Bc5.LIZIZ(room)) {
            hashMap.put("layout_id", LJ());
        } else {
            C29556Biq.LIZ().getClass();
            hashMap.put("layout_setting", LJI(C74983Tbn.LIZ(layoutName)).getFirst());
            C29556Biq.LIZ().getClass();
            hashMap.put("window_setting", LJI(C74983Tbn.LIZ(layoutName)).getSecond());
        }
        hashMap.put("link_id", str);
        hashMap.put("anchor_invite_position", str2);
        C116484hg.LIZIZ(hashMap, "accept_invitation_platform", str3, i, "guest_cnt");
        Long l5 = LJIILJJIL;
        if (l5 != null) {
            hashMap.put("waiting_duration", String.valueOf((System.currentTimeMillis() - l5.longValue()) / 1000));
        }
        LJIILJJIL = null;
        C77123UOp.LJIILIIL(hashMap);
        C77123UOp.LJIIJ(hashMap);
        C77123UOp.LJIIL(hashMap);
        C77123UOp.LJIIJJI(hashMap);
        C77123UOp.LJIIIZ(hashMap);
        C77123UOp.LJIILJJIL(hashMap);
        hashMap.put("is_outside_liveroom", String.valueOf(o.LJ(C75017TcL.LIZIZ, "outside_liveroom") ? 1 : 0));
        BZI LIZ2 = C28787BRn.LIZ("livesdk_guest_connection_success");
        LIZ2.LJJIFFI(hashMap);
        LIZ2.LJIIJJI("live_detail");
        LIZ2.LJIIIZ("live_function");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJJIIJZLJL();
    }

    public final void LJJJJZ(String str, LiveEffect liveEffect, long j, boolean z, boolean z2, boolean z3, String closeWay, String closeReason, long j2) {
        String str2;
        long j3;
        String str3;
        String str4;
        o.LJIIIZ(closeWay, "closeWay");
        o.LJIIIZ(closeReason, "closeReason");
        HashMap hashMap = new HashMap();
        if (str == null) {
            str2 = "others";
        } else if (o.LJ(str, "apply")) {
            str2 = "guest_apply_anchor";
        } else if (o.LJ(str, "invite")) {
            str2 = "anchor_invite_guest";
        } else {
            str2 = str;
        }
        hashMap.put("guest_invite_type", str2);
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            t1.LJ((C29374Bfu) B83.LIZ().LIZIZ(), hashMap, "guest_id");
        }
        if (liveEffect != null) {
            j3 = liveEffect.effectId;
        } else {
            j3 = 0;
        }
        C64504PTg.LIZJ(j3, hashMap, "props_id", j, "enhance_level");
        hashMap.put("mic_status", String.valueOf(!z ? 1 : 0));
        hashMap.put("camera_status", String.valueOf(!z2 ? 1 : 0));
        if (z2) {
            str3 = "off";
        } else if (z3) {
            str3 = "rear";
        } else {
            str3 = "front";
        }
        hashMap.put("camera_type", str3);
        hashMap.put("close_way", closeWay);
        hashMap.put("close_reason", closeReason);
        hashMap.put("guest_permission", LJII(false, null));
        if (str == null) {
            str4 = "click_icon";
        } else if (o.LJ(str, "apply")) {
            str4 = "accepted_apply";
        } else if (o.LJ(str, "invite")) {
            str4 = "receive_invitation";
        } else {
            str4 = "";
        }
        hashMap.put("open_reason", str4);
        hashMap.put("stay_duration", String.valueOf(j2));
        hashMap.put("live_type", LJIIIZ());
        LIZJ(this, hashMap);
        LJLL("livesdk_guest_connection_preview_panel_close", hashMap);
    }

    public final void LJJJJZI(LiveEffect liveEffect, long j, boolean z, boolean z2, boolean z3, String closeWay, long j2, boolean z4, int i, String requestPage) {
        long j3;
        String str;
        o.LJIIIZ(closeWay, "closeWay");
        o.LJIIIZ(requestPage, "requestPage");
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            t1.LJ((C29374Bfu) B83.LIZ().LIZIZ(), hashMap, "guest_id");
        }
        if (liveEffect != null) {
            j3 = liveEffect.effectId;
        } else {
            j3 = 0;
        }
        hashMap.put("props_id", String.valueOf(j3));
        hashMap.put("enhance_level", String.valueOf(j));
        hashMap.put("guest_permission", LJII(false, null));
        hashMap.put("mic_status", String.valueOf(!z ? 1 : 0));
        hashMap.put("camera_status", String.valueOf(!z2 ? 1 : 0));
        if (z2) {
            str = "off";
        } else if (z3) {
            str = "rear";
        } else {
            str = "front";
        }
        hashMap.put("camera_type", str);
        hashMap.put("close_way", closeWay);
        hashMap.put("stay_duration", String.valueOf(((float) j2) / 1000.0f));
        if (z4) {
            hashMap.put("enlarge_status", String.valueOf(i));
        }
        hashMap.put("request_page", requestPage);
        C77123UOp.LJIILJJIL(hashMap);
        LIZJ(this, hashMap);
        LJLL("livesdk_guest_connection_setting_panel_close", hashMap);
    }

    public final void LJJJLL(String str, String requestPage, String tab, LiveEffect liveEffect, long j, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        long j2;
        String str2;
        o.LJIIIZ(requestPage, "requestPage");
        o.LJIIIZ(tab, "tab");
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            t1.LJ((C29374Bfu) B83.LIZ().LIZIZ(), hashMap, "guest_id");
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1183699191) {
                if (hashCode != 93029230) {
                    if (hashCode == 1466857630 && str.equals("join_direct")) {
                        hashMap.put("guest_invite_type", "guest_apply_anchor");
                    }
                } else if (str.equals("apply")) {
                    hashMap.put("guest_invite_type", "guest_apply_anchor");
                }
            } else if (str.equals("invite")) {
                hashMap.put("guest_invite_type", "anchor_invite_guest");
            }
        }
        hashMap.put("request_page", requestPage);
        if (z2) {
            tab = "";
        }
        hashMap.put("tab", tab);
        if (liveEffect != null) {
            j2 = liveEffect.effectId;
        } else {
            j2 = 0;
        }
        hashMap.put("props_id", String.valueOf(j2));
        hashMap.put("enhance_level", String.valueOf(j));
        hashMap.put("guest_permission", LJII(false, null));
        hashMap.put("mic_status", String.valueOf(!z ? 1 : 0));
        hashMap.put("camera_status", String.valueOf(!z2 ? 1 : 0));
        if (z2) {
            str2 = "off";
        } else if (z3) {
            str2 = "rear";
        } else {
            str2 = "front";
        }
        hashMap.put("camera_type", str2);
        if (z4) {
            hashMap.put("enlarge_status", String.valueOf(i));
        }
        C77123UOp.LJIILJJIL(hashMap);
        LIZJ(this, hashMap);
        LJLL("livesdk_guest_connection_setting_panel_show", hashMap);
    }

    public static void LJIJ(String str, String tabName, TZX tzx, MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, String clickTime, int i, int i2, String str2, int i3, long j, int i4, String str3, int i5) {
        int i6;
        int i7;
        List LJIIIIZZ2;
        List LJ2;
        String str4;
        String str5 = str2;
        int i8 = i3;
        C74824TYe c74824TYe = LIZ;
        if ((i5 & 16) != 0) {
            clickTime = C75457TjR.LJ(C74838TYs.LJ().LJJ);
        }
        if ((i5 & 32) != 0) {
            i = 0;
        }
        if ((i5 & 64) != 0) {
            i2 = 0;
        }
        String str6 = null;
        if ((i5 & 128) != 0) {
            str5 = null;
        }
        if ((i5 & 256) != 0) {
            i8 = 0;
        }
        if ((i5 & 512) != 0) {
            j = 0;
        }
        if ((i5 & 1024) != 0) {
            i4 = 0;
        }
        if ((i5 & 2048) == 0) {
            str6 = str3;
        }
        o.LJIIIZ(tabName, "tabName");
        o.LJIIIZ(clickTime, "clickTime");
        String str7 = "selfie_window";
        if (i8 == 1) {
            if (o.LJ(LJIILIIL, "selfie_window")) {
                LJIILIIL = "";
            }
            str7 = str;
        } else {
            if (o.LJ(LJIIL, "selfie_window")) {
                LJIILIIL = LJIIL;
                LJIIL = "";
            }
            str7 = str;
        }
        HashMap LIZLLL2 = C73098SmU.LIZLLL();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            LIZLLL2.put("room_id", idStr);
            LIZLLL2.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            LIZLLL2.put("guest_id", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
            if (C29232Bdc.LJIIL()) {
                str4 = "1";
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZLLL2.put("is_subscriber_only_live", str4);
        }
        if (o.LJ(LJIIJJI, "appointment_guide")) {
            LIZLLL2.put("enter_from", "appointment_guide");
            LIZLLL2.put("is_reservation_sender", CardStruct.IStatusCode.DEFAULT);
        } else if (str6 != null) {
            LIZLLL2.put("enter_from", str6);
        }
        LIZLLL2.put("request_page", str7);
        LIZLLL2.put("guest_connected_cnt", String.valueOf(C74838TYs.LJ().LJJ));
        LIZLLL2.put("tab_name", tabName);
        LIZLLL2.put("click_time", clickTime);
        LIZLLL2.put("reservation_guest_cnts", String.valueOf(i));
        LIZLLL2.put("reservation_response_cnts", String.valueOf(i2));
        if (tzx != null && (LJ2 = tzx.LJ()) != null) {
            i6 = LJ2.size();
        } else {
            i6 = 0;
        }
        LIZLLL2.put("viewer_list_ucnt", String.valueOf(i6));
        if (tzx != null && (LJIIIIZZ2 = tzx.LJIIIIZZ()) != null) {
            i7 = LJIIIIZZ2.size();
        } else {
            i7 = 0;
        }
        LIZLLL2.put("request_list_ucnt", String.valueOf(i7));
        LIZLLL2.put("loading_duration", String.valueOf(j));
        if (str5 != null) {
            LIZLLL2.put("guest_bonus", str5);
        }
        LIZJ(c74824TYe, LIZLLL2);
        if (i8 != 0) {
            if (i8 != 1) {
                return;
            }
            LJLL("livesdk_anchor_guest_connection_panel_close", LIZLLL2);
            return;
        }
        int i9 = 1;
        LIZLLL2.put("request_display_setting", LJIIJJI(i4));
        if (multiLiveAnchorPanelSettings == null || multiLiveAnchorPanelSettings.allowViewerReq != 3) {
            i9 = 0;
        }
        LIZLLL2.put("allow_request_from_viewer", String.valueOf(i9));
        LJLL("livesdk_anchor_guest_connection_panel_show", LIZLLL2);
    }
}
