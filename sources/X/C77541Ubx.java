package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.dataChannel.BroadcastPageChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Ubx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77541Ubx {
    public static final /* synthetic */ int LIZ = 0;

    public static java.util.Map LJ() {
        Boolean bool;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        if (dataChannelGlobal.mv0(C29044Baa.class) != null) {
            String roomStatus = ((IGiftService) CN1.LIZ(IGiftService.class)).getRoomStatus();
            if (roomStatus == null) {
                roomStatus = "";
            }
            linkedHashMap.put(WM7.SCENE_SERVICE, roomStatus);
            linkedHashMap.put("anchor_id", String.valueOf(BJM.LJ()));
            linkedHashMap.put("room_id", String.valueOf(BJM.LJIILJJIL()));
            linkedHashMap.put("enter_from_merge", BJM.LJFF());
            linkedHashMap.put("enter_method", BJM.LJIIIIZZ());
            linkedHashMap.put("action_type", BJM.LIZLLL());
            linkedHashMap.put("request_id", BJM.LJIILIIL());
            linkedHashMap.put("video_id", BJM.LJIJ());
            EnumC29309Ber enumC29309Ber = (EnumC29309Ber) dataChannelGlobal.mv0(BroadcastPageChannel.class);
            if (enumC29309Ber != null) {
                bool = Boolean.valueOf(enumC29309Ber.isAudience());
            } else {
                bool = null;
            }
            if (C29306Beo.LJJIFFI(bool)) {
                str = CardStruct.IStatusCode.DEFAULT;
            } else {
                str = "1";
            }
            linkedHashMap.put("is_anchor", str);
        }
        return linkedHashMap;
    }

    public static void LJIIL() {
        BZI LIZIZ = C0N3.LIZIZ("livesdk_feature_abnormal_toast", "recharge_panel_exchange", "scenario");
        LIZIZ.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
        LIZIZ.LJJIIJZLJL();
    }

    public static void LIZIZ(BZI bzi) {
        if (DataChannelGlobal.LJLJJI.mv0(C29044Baa.class) != null) {
            bzi.LJIJJ(Long.valueOf(BJM.LJ()), "anchor_id");
            bzi.LJIJJ(Long.valueOf(BJM.LJIILJJIL()), "room_id");
            bzi.LJIJJ(BJM.LJFF(), "enter_from_merge");
            bzi.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
            bzi.LJIJJ(BJM.LIZLLL(), "action_type");
            bzi.LJIJJ(BJM.LJIILIIL(), "request_id");
            bzi.LJIJJ(BJM.LJIJ(), "video_id");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0070 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJII(X.UI8 r3) {
        /*
            java.lang.String r0 = "config"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            boolean r0 = r3.LJIILIIL
            r2 = 1
            if (r0 == 0) goto L55
            int r1 = r3.LJIIJJI
            if (r1 == 0) goto L2e
            if (r1 == r2) goto L2b
            r0 = 4
            if (r1 == r0) goto L28
            r0 = 5
            if (r1 == r0) goto L25
            r0 = 6
            if (r1 == r0) goto L22
            r0 = 7
            if (r1 == r0) goto L1f
        L1c:
            java.lang.String r0 = "room_recharge"
        L1e:
            return r0
        L1f:
            java.lang.String r0 = "event_ticket"
            goto L1e
        L22:
            java.lang.String r0 = "shoutout"
            goto L1e
        L25:
            java.lang.String r0 = "promote"
            goto L1e
        L28:
            java.lang.String r0 = "video_gifting"
            goto L1e
        L2b:
            java.lang.String r0 = "balance_page_recharge"
            goto L1e
        L2e:
            java.lang.String r1 = r3.LJFF
            java.lang.String r0 = "first_recharge"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L3b
            java.lang.String r0 = "room_first_recharge_panel_cash"
            goto L1e
        L3b:
            java.lang.Class<com.bytedance.android.live.gift.IGiftService> r0 = com.bytedance.android.live.gift.IGiftService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.live.gift.IGiftService r0 = (com.bytedance.android.live.gift.IGiftService) r0
            boolean r0 = r0.isFirstRecharge()
            if (r0 == 0) goto L4c
            java.lang.String r0 = "room_first_recharge_panel_normal"
            goto L1e
        L4c:
            int r1 = r3.LJIIL
            r0 = 1002(0x3ea, float:1.404E-42)
            if (r1 != r0) goto L1c
            java.lang.String r0 = "room_insufficient_recharge_panel"
            goto L1e
        L55:
            int r1 = r3.LJIIJJI
            if (r1 == 0) goto L6c
            r0 = 15
            if (r1 == r0) goto Lc5
            r0 = 18
            if (r1 == r0) goto L67
            switch(r1) {
                case 9: goto Lb9;
                case 10: goto Lad;
                case 11: goto L73;
                default: goto L64;
            }
        L64:
            java.lang.String r0 = "room_ug_exchange"
            goto L1e
        L67:
            int r0 = r3.LJIIL
            if (r0 != r2) goto L64
            goto L70
        L6c:
            int r0 = r3.LJIIL
            if (r0 != r2) goto L64
        L70:
            java.lang.String r0 = "room_income_exchange"
            goto L1e
        L73:
            int r0 = r3.LJIIL
            if (r0 != r2) goto L91
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r0 = com.bytedance.android.live.wallet.IWalletService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.live.wallet.IWalletService r0 = (com.bytedance.android.live.wallet.IWalletService) r0
            com.bytedance.android.live.wallet.IWalletExchange r0 = r0.walletExchange()
            com.bytedance.android.live.wallet.WalletExchange r0 = (com.bytedance.android.live.wallet.WalletExchange) r0
            boolean r0 = r0.LJIILIIL()
            if (r0 == 0) goto L8e
            java.lang.String r0 = "room_gift_auto_income_exchange"
            goto L1e
        L8e:
            java.lang.String r0 = "room_gift_manual_income_exchange"
            goto L1e
        L91:
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r0 = com.bytedance.android.live.wallet.IWalletService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.live.wallet.IWalletService r0 = (com.bytedance.android.live.wallet.IWalletService) r0
            com.bytedance.android.live.wallet.IWalletExchange r0 = r0.walletExchange()
            com.bytedance.android.live.wallet.WalletExchange r0 = (com.bytedance.android.live.wallet.WalletExchange) r0
            boolean r0 = r0.LJIJJ()
            if (r0 == 0) goto La9
            java.lang.String r0 = "room_gift_auto_ug_exchange"
            goto L1e
        La9:
            java.lang.String r0 = "room_gift_manual_ug_exchange"
            goto L1e
        Lad:
            int r0 = r3.LJIIL
            if (r0 != r2) goto Lb5
            java.lang.String r0 = "withdraw_page_income_exchange"
            goto L1e
        Lb5:
            java.lang.String r0 = "withdraw_page_ug_exchange"
            goto L1e
        Lb9:
            int r0 = r3.LJIIL
            if (r0 != r2) goto Lc1
            java.lang.String r0 = "balance_page_income_exchange"
            goto L1e
        Lc1:
            java.lang.String r0 = "balance_page_ug_exchange"
            goto L1e
        Lc5:
            java.lang.String r0 = "balance_page_refund_credit"
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77541Ubx.LJII(X.UI8):java.lang.String");
    }

    public static String LJIIIIZZ(int i) {
        if (i != 0) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        if (i != 7) {
                            String scene = EnumC77542Uby.RECHARGE_LIVE_ROOM.getScene();
                            o.LJIIIIZZ(scene, "RECHARGE_LIVE_ROOM.scene");
                            return scene;
                        }
                        String scene2 = EnumC77542Uby.RECHARGE_EVENT_TICKET.getScene();
                        o.LJIIIIZZ(scene2, "RECHARGE_EVENT_TICKET.scene");
                        return scene2;
                    }
                    String scene3 = EnumC77542Uby.RECHARGE_SHOUTOUT.getScene();
                    o.LJIIIIZZ(scene3, "RECHARGE_SHOUTOUT.scene");
                    return scene3;
                }
                String scene4 = EnumC77542Uby.RECHARGE_PROMOTE.getScene();
                o.LJIIIIZZ(scene4, "RECHARGE_PROMOTE.scene");
                return scene4;
            }
            String scene5 = EnumC77542Uby.RECHARGE_VIDEO_GIFTING.getScene();
            o.LJIIIIZZ(scene5, "RECHARGE_VIDEO_GIFTING.scene");
            return scene5;
        }
        String scene6 = EnumC77542Uby.RECHARGE_LIVE_ROOM.getScene();
        o.LJIIIIZZ(scene6, "RECHARGE_LIVE_ROOM.scene");
        return scene6;
    }

    public static java.util.Map LIZJ(C77591Ucl c77591Ucl, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!c77591Ucl.LJIIIZ) {
            return linkedHashMap;
        }
        long j = c77591Ucl.LJFF;
        linkedHashMap.put("gift_id", String.valueOf(c77591Ucl.LJ));
        linkedHashMap.put("gift_total_price", String.valueOf(c77591Ucl.LJII));
        linkedHashMap.put("price_gap", String.valueOf(j));
        linkedHashMap.put("package_price_gap", String.valueOf(i - j));
        linkedHashMap.put("has_sent_before", c77591Ucl.LJIJ);
        return linkedHashMap;
    }

    public static java.util.Map LIZLLL(C77591Ucl c77591Ucl, DiamondPackageExtra diamondPackageExtra) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = c77591Ucl.LJIIIZ;
        String str = CardStruct.IStatusCode.DEFAULT;
        if (z) {
            linkedHashMap.put("if_insufficient", "1");
            if (diamondPackageExtra != null && o.LJ(diamondPackageExtra.getNewRecommendPackage(), Boolean.TRUE)) {
                str = "1";
            }
            linkedHashMap.put("if_new_rec", str);
        } else {
            linkedHashMap.put("if_insufficient", CardStruct.IStatusCode.DEFAULT);
        }
        return linkedHashMap;
    }

    public static String LJFF(String str, String str2) {
        if (C76828UDg.LIZIZ(str)) {
            return str2;
        }
        return "";
    }

    public static String LJI(C77591Ucl c77591Ucl, boolean z) {
        if (c77591Ucl.LJIIIZ) {
            if (z) {
                return "rec_extra";
            }
            return "rec_main";
        }
        return "normal";
    }

    public static void LJIILIIL(String str, UI8 config) {
        boolean z;
        o.LJIIIZ(config, "config");
        String LJII = LJII(config);
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() == room.getOwnerUserId()) {
            z = true;
        } else {
            z = false;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_recharge_ban_popup_click");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
        LIZ2.LJIJJ(Boolean.valueOf(z), "is_anchor");
        LIZ2.LJIJJ(LJII, "popup_entrance");
        C06490Nh.LIZLLL(LIZ2, "gpppa", "ban_reason", str, "click_type");
    }

    public static void LJIILJJIL(C77591Ucl rechargeDialogConfig, String str) {
        o.LJIIIZ(rechargeDialogConfig, "rechargeDialogConfig");
        java.util.Map LJJL = C113554cx.LJJL(new OSZ("click_type", str), new OSZ("request_page", rechargeDialogConfig.LJIIJJI));
        BZI LIZ2 = C28787BRn.LIZ("livesdk_get_package_failed_page_page_click");
        LIZ2.LJJIFFI(LJJL);
        LIZ2.LJJIFFI(rechargeDialogConfig.LIZIZ);
        LIZ2.LJJIIJZLJL();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILLIIL(int r3, X.UI8 r4) {
        /*
            java.lang.String r0 = "config"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            switch(r3) {
                case 42030: goto Lb;
                case 42031: goto L27;
                case 42032: goto L27;
                default: goto L8;
            }
        L8:
            switch(r3) {
                case 4005265: goto L27;
                case 4005266: goto Lb;
                case 4005267: goto L27;
                case 4005268: goto L27;
                case 4005269: goto Lb;
                case 4005270: goto L27;
                case 4005271: goto L27;
                default: goto Lb;
            }
        Lb:
            java.lang.String r0 = "livesdk_kyc_reminder_popup"
        Ld:
            X.BZI r2 = X.C28787BRn.LIZ(r0)
            r2.LJIIZILJ()
            java.lang.String r1 = "error_code"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.LJIJJ(r0, r1)
            LIZIZ(r2)
            LIZ(r2, r3, r4)
            r2.LJJIIJZLJL()
            return
        L27:
            java.lang.String r0 = "livesdk_kyc_popup_show"
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77541Ubx.LJIILLIIL(int, X.UI8):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.BZI r4, int r5, X.UI8 r6) {
        /*
            java.lang.String r1 = LJII(r6)
            java.lang.String r0 = "popup_entrance"
            r4.LJIJJ(r1, r0)
            java.lang.String r3 = ""
            switch(r5) {
                case 42030: goto L11;
                case 42031: goto L40;
                case 42032: goto L3d;
                default: goto Le;
            }
        Le:
            switch(r5) {
                case 4005265: goto L3a;
                case 4005266: goto L11;
                case 4005267: goto L3a;
                case 4005268: goto L3a;
                case 4005269: goto L11;
                case 4005270: goto L3d;
                case 4005271: goto L40;
                default: goto L11;
            }
        L11:
            r1 = r3
        L12:
            java.lang.String r0 = "popup_type"
            r4.LJIJJ(r1, r0)
            java.lang.Exception r0 = r6.LIZLLL
            com.bytedance.android.livesdk.wallet.CustomErrorExtra r2 = com.bytedance.android.livesdk.wallet.CustomErrorExtra.getCustomErrorExtra(r0)
            java.lang.String r1 = "trigger_scenario"
            java.lang.String r0 = "recharge"
            r4.LJIJJ(r0, r1)
            java.lang.String r1 = "page_type"
            if (r2 == 0) goto L38
            X.BNS r0 = r2.extraMap
            if (r0 == 0) goto L38
            org.json.JSONObject r0 = r0.LIZ
            if (r0 == 0) goto L38
            java.lang.String r0 = r0.optString(r1, r3)
        L34:
            r4.LJIJJ(r0, r1)
            return
        L38:
            r0 = 0
            goto L34
        L3a:
            java.lang.String r1 = "resubmit"
            goto L12
        L3d:
            java.lang.String r1 = "rejected"
            goto L12
        L40:
            java.lang.String r1 = "under_review"
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77541Ubx.LIZ(X.BZI, int, X.UI8):void");
    }

    public static void LJIJJ(UI8 ui8, String str, String str2) {
        String str3;
        int i;
        CustomErrorExtra customErrorExtra;
        BNS bns;
        java.util.Map<String, String> map;
        if (ui8.LJIILIIL) {
            str3 = "recharge";
        } else if (ui8.LJIIJJI == 11) {
            str3 = "send_gift";
        } else {
            str3 = "exchange";
        }
        Exception exc = ui8.LIZLLL;
        if (exc instanceof C29401Dk) {
            o.LJII(exc, "null cannot be cast to non-null type com.bytedance.android.live.api.exceptions.server.ApiServerException");
            C276516r c276516r = (C276516r) exc;
            i = c276516r.getErrorCode();
            customErrorExtra = CustomErrorExtra.getCustomErrorExtra(c276516r);
        } else {
            i = -1;
            customErrorExtra = null;
        }
        String LIZ2 = C76828UDg.LIZ(ui8.LJIIIIZZ.get("gift_enter_from"));
        BZI LIZ3 = C28787BRn.LIZ("livesdk_wallet_limit_popup_click");
        LIZ3.LJIIZILJ();
        LIZ3.LJIJJ(Integer.valueOf(i), "error_code");
        LIZ3.LJIJJ(str3, "entry_type");
        LIZ3.LJIJJ(str, "click_type");
        LIZ3.LJIJJ(str2, "click_area");
        if (o.LJ(str3, "send_gift")) {
            LIZ3.LJIJJ(LIZ2, "gift_enter_from");
        } else {
            LIZ3.LJIJJ(LJII(ui8), "hit_entry");
        }
        if (customErrorExtra != null && (bns = customErrorExtra.extraMap) != null && (map = bns.LIZIZ) != null) {
            for (Map.Entry entry : ((HashMap) map).entrySet()) {
                Object key = entry.getKey();
                o.LJIIIIZZ(key, "entry.key");
                LIZ3.LJIJJ(entry.getValue(), (String) key);
            }
        }
        LIZIZ(LIZ3);
        LIZ3.LJJIIJZLJL();
    }

    public static void LJIIIZ(java.util.Map map, String failedReason, int i, String str) {
        o.LJIIIZ(failedReason, "failedReason");
        BZI LIZIZ = C0JU.LIZIZ("livesdk_abnormal_subscribe_popup_click", failedReason, "failed_reason", str, "click_type");
        LIZIZ.LJIJJ(str, "type");
        LIZIZ.LJIJJ(Integer.valueOf(i), "error_code");
        LIZIZ.LJJIFFI(map);
        LIZIZ.LJIIZILJ();
        LIZIZ.LJJIIJZLJL();
    }

    public static void LJIIJ(int i, String str, String str2, String str3) {
        HH1.LIZ(str, "failFrom", str2, "failReason", str3, "chargeReason");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_recharge_fail_contact_us_click");
        KNV.LJ(i, LIZ2, "package", str, "fail_from");
        LIZ2.LJIJJ(str2, "fail_reason");
        LIZ2.LJIJJ(str3, "charge_reason");
        LIZ2.LJIIZILJ();
        LIZ2.LJJIIJZLJL();
    }

    public static void LJIIJJI(int i, String str, String str2, String str3) {
        HH1.LIZ(str, "failFrom", str2, "failReason", str3, "chargeReason");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_recharge_fail_popup_show");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(Integer.valueOf(i), "package");
        LIZ2.LJIJJ(str, "fail_from");
        C06490Nh.LIZLLL(LIZ2, str2, "fail_reason", str3, "charge_reason");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r5 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        r1 = "not_now";
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        r1 = "verify";
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (r5 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        r1 = "see_detail";
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        r1 = "got_it";
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        if (r5 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        r1 = "cancel";
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        r1 = "resubmit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        if (r5 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r5 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        if (r5 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r5 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        if (r5 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        if (r5 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        if (r5 != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILL(int r3, X.UI8 r4, boolean r5, boolean r6) {
        /*
            java.lang.String r0 = "config"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            switch(r3) {
                case 42030: goto Lb;
                case 42031: goto L66;
                case 42032: goto L66;
                default: goto L8;
            }
        L8:
            switch(r3) {
                case 4005265: goto L66;
                case 4005266: goto Lb;
                case 4005267: goto L66;
                case 4005268: goto L66;
                case 4005269: goto Lb;
                case 4005270: goto L66;
                case 4005271: goto L66;
                default: goto Lb;
            }
        Lb:
            java.lang.String r0 = "livesdk_kyc_reminder_popup_click"
        Ld:
            X.BZI r2 = X.C28787BRn.LIZ(r0)
            r2.LJIIZILJ()
            java.lang.String r1 = "error_code"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.LJIJJ(r0, r1)
            if (r6 == 0) goto L30
            java.lang.String r1 = "check_detail"
        L21:
            java.lang.String r0 = "click_type"
            r2.LJIJJ(r1, r0)
            LIZIZ(r2)
            LIZ(r2, r3, r4)
            r2.LJJIIJZLJL()
            return
        L30:
            switch(r3) {
                case 42030: goto L4d;
                case 42031: goto L58;
                case 42032: goto L5b;
                default: goto L33;
            }
        L33:
            switch(r3) {
                case 4005265: goto L3f;
                case 4005266: goto L39;
                case 4005267: goto L42;
                case 4005268: goto L48;
                case 4005269: goto L50;
                case 4005270: goto L3c;
                case 4005271: goto L5e;
                default: goto L36;
            }
        L36:
            java.lang.String r1 = ""
            goto L21
        L39:
            if (r5 == 0) goto L45
            goto L52
        L3c:
            if (r5 == 0) goto L63
            goto L60
        L3f:
            if (r5 == 0) goto L55
            goto L4a
        L42:
            if (r5 == 0) goto L45
            goto L4a
        L45:
            java.lang.String r1 = "not_now"
            goto L21
        L48:
            if (r5 == 0) goto L55
        L4a:
            java.lang.String r1 = "resubmit"
            goto L21
        L4d:
            if (r5 == 0) goto L55
            goto L52
        L50:
            if (r5 == 0) goto L55
        L52:
            java.lang.String r1 = "verify"
            goto L21
        L55:
            java.lang.String r1 = "cancel"
            goto L21
        L58:
            if (r5 == 0) goto L63
            goto L60
        L5b:
            if (r5 == 0) goto L63
            goto L60
        L5e:
            if (r5 == 0) goto L63
        L60:
            java.lang.String r1 = "got_it"
            goto L21
        L63:
            java.lang.String r1 = "see_detail"
            goto L21
        L66:
            java.lang.String r0 = "livesdk_kyc_popup_click"
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77541Ubx.LJIILL(int, X.UI8, boolean, boolean):void");
    }

    public static void LJIJJLI(C77591Ucl rechargeDialogConfig, DataChannel dataChannel, Diamond diamond, boolean z, DiamondPackageExtra diamondPackageExtra, boolean z2, boolean z3) {
        String str;
        Object obj;
        Object obj2;
        Integer num;
        String str2;
        Object obj3;
        Object obj4;
        o.LJIIIZ(rechargeDialogConfig, "rechargeDialogConfig");
        OSZ[] oszArr = new OSZ[23];
        oszArr[0] = new OSZ("request_page", rechargeDialogConfig.LJIIJJI);
        if (o.LJ(BJM.LJIIIIZZ(), "portal")) {
            str = "portal";
        } else {
            str = rechargeDialogConfig.LIZJ;
        }
        oszArr[1] = new OSZ("charge_reason", str);
        oszArr[2] = new OSZ("charge_style", "window");
        oszArr[3] = new OSZ("gift_enter_from", C76828UDg.LIZ(rechargeDialogConfig.LJIILIIL));
        oszArr[4] = new OSZ("gift_send_type", rechargeDialogConfig.LJIILL);
        oszArr[5] = new OSZ("has_gift_sent_before", rechargeDialogConfig.LJIJ);
        String str3 = rechargeDialogConfig.LJIILIIL;
        if (!C76828UDg.LIZIZ(str3)) {
            str3 = "";
        }
        oszArr[6] = new OSZ("notification_type", str3);
        oszArr[7] = new OSZ("notification_request_id", LJFF(rechargeDialogConfig.LJIILIIL, rechargeDialogConfig.LJIILJJIL));
        oszArr[8] = new OSZ("gift_send_type", rechargeDialogConfig.LJIILL);
        oszArr[9] = new OSZ("notification_request_id", LJFF(rechargeDialogConfig.LJIILIIL, rechargeDialogConfig.LJIILJJIL));
        oszArr[10] = new OSZ("pay_method", C77608Ud2.LIZ());
        String str4 = "1";
        if (((IGiftService) CN1.LIZ(IGiftService.class)).isFirstRecharge()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[11] = new OSZ("is_first_recharge", obj);
        oszArr[12] = new OSZ("second_entrance", rechargeDialogConfig.LJIIL);
        oszArr[13] = new OSZ("timestamp", String.valueOf(C30725C4b.LIZ()));
        if (C29306Beo.LJIIJ(dataChannel)) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[14] = new OSZ("is_anchor", obj2);
        oszArr[15] = new OSZ("request_id", BJM.LJIILIIL());
        oszArr[16] = new OSZ("panel_type", LJI(rechargeDialogConfig, z));
        if (diamond != null) {
            num = Integer.valueOf(diamond.count);
        } else {
            num = null;
        }
        oszArr[17] = new OSZ("call_package", String.valueOf(num));
        if (diamond != null) {
            str2 = diamond.LJLILLLLZI;
        } else {
            str2 = null;
        }
        oszArr[18] = new OSZ("currency", String.valueOf(str2));
        oszArr[19] = new OSZ("portal_id", String.valueOf(BJM.LJIIL()));
        if (o.LJ(BJM.LJIIIIZZ(), "portal")) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[20] = new OSZ("is_portal_user", obj3);
        if (z2) {
            obj4 = "1";
        } else {
            obj4 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[21] = new OSZ("if_has_exchange_option", obj4);
        if (!z3) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[22] = new OSZ("can_exchange", str4);
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        if (rechargeDialogConfig.LJIIIZ) {
            LJJLIIIIJ.put("gift_id", String.valueOf(rechargeDialogConfig.LJ));
            LJJLIIIIJ.put("gift_total_price", String.valueOf(rechargeDialogConfig.LJII));
        }
        java.util.Map LJ = LJ();
        java.util.Map LIZLLL = LIZLLL(rechargeDialogConfig, diamondPackageExtra);
        BZI LIZ2 = C28787BRn.LIZ("livesdk_recharge_show");
        if (!C38354F3m.LJ(BJM.LJII())) {
            LIZ2.LJIJJ(BJM.LJII(), "enter_url_source");
        }
        if (BJM.LJI() != 0) {
            LIZ2.LJIJJ(String.valueOf(BJM.LJI()), "enter_gift_id");
        }
        LIZ2.LJJIFFI(LJJLIIIIJ);
        LIZ2.LJJIFFI(LJ);
        LIZ2.LJJIFFI(LIZLLL);
        LIZ2.LJJIFFI(rechargeDialogConfig.LIZIZ);
        LIZ2.LIZLLL(C28835BTj.LIZIZ(null, dataChannel, "user_live_duration"));
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJJIIJZLJL();
    }

    public static void LJIJI(int i, C77591Ucl rechargeDialogConfig, DataChannel dataChannel, boolean z, java.util.Map map, Diamond diamond, boolean z2, DiamondPackageExtra diamondPackageExtra, boolean z3, boolean z4) {
        int i2;
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        Integer num;
        String str2;
        String str3;
        Object obj4;
        o.LJIIIZ(rechargeDialogConfig, "rechargeDialogConfig");
        if (diamond != null && i == diamond.count) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        OSZ[] oszArr = new OSZ[20];
        oszArr[0] = new OSZ("request_page", rechargeDialogConfig.LJIIJJI);
        if (o.LJ(BJM.LJIIIIZZ(), "portal")) {
            str = "portal";
        } else {
            str = rechargeDialogConfig.LIZJ;
        }
        oszArr[1] = new OSZ("charge_reason", str);
        oszArr[2] = new OSZ("charge_style", "window");
        oszArr[3] = new OSZ("pay_method", C77608Ud2.LIZ());
        oszArr[4] = new OSZ("recharge_package", String.valueOf(i));
        String str4 = "1";
        if (((IGiftService) CN1.LIZ(IGiftService.class)).isFirstRecharge()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[5] = new OSZ("is_first_recharge", obj);
        oszArr[6] = new OSZ("second_entrance", rechargeDialogConfig.LJIIL);
        oszArr[7] = new OSZ("timestamp", String.valueOf(C30725C4b.LIZ()));
        String str5 = rechargeDialogConfig.LJIILIIL;
        if (!C76828UDg.LIZIZ(str5)) {
            str5 = "";
        }
        oszArr[8] = new OSZ("notification_type", str5);
        oszArr[9] = new OSZ("notification_request_id", LJFF(rechargeDialogConfig.LJIILIIL, rechargeDialogConfig.LJIILJJIL));
        if (dataChannel != null && o.LJ(dataChannel.kv0(UserIsAnchorChannel.class), Boolean.TRUE)) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[10] = new OSZ("is_anchor", obj2);
        oszArr[11] = new OSZ("portal_id", String.valueOf(BJM.LJIIL()));
        if (o.LJ(BJM.LJIIIIZZ(), "portal")) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[12] = new OSZ("is_portal_user", obj3);
        oszArr[13] = new OSZ("panel_type", LJI(rechargeDialogConfig, z2));
        if (diamond != null) {
            num = Integer.valueOf(diamond.count);
        } else {
            num = null;
        }
        oszArr[14] = new OSZ("call_package", String.valueOf(num));
        if (diamond != null) {
            str2 = diamond.LJLILLLLZI;
        } else {
            str2 = null;
        }
        oszArr[15] = new OSZ("currency", String.valueOf(str2));
        oszArr[16] = new OSZ("if_default_package", String.valueOf(i2));
        if (z) {
            str3 = "click";
        } else {
            str3 = "call";
        }
        oszArr[17] = new OSZ("preview_type", str3);
        if (z3) {
            obj4 = "1";
        } else {
            obj4 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[18] = new OSZ("if_has_exchange_option", obj4);
        if (!z4) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[19] = new OSZ("can_exchange", str4);
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        java.util.Map LIZJ = LIZJ(rechargeDialogConfig, i);
        java.util.Map LJ = LJ();
        java.util.Map LIZLLL = LIZLLL(rechargeDialogConfig, diamondPackageExtra);
        BZI LIZ2 = C28787BRn.LIZ("livesdk_recharge_pay");
        LIZ2.LJIJJ(C76828UDg.LIZ(rechargeDialogConfig.LJIILIIL), "gift_enter_from");
        LIZ2.LJIJJ(rechargeDialogConfig.LJIILL, "gift_send_type");
        LIZ2.LJIJJ(rechargeDialogConfig.LJIJ, "has_gift_sent_before");
        LIZ2.LJJIFFI(LJJLIIIIJ);
        LIZ2.LJJIFFI(LIZJ);
        LIZ2.LJJIFFI(LJ);
        LIZ2.LJJIFFI(LIZLLL);
        LIZ2.LJJIFFI(map);
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LIZLLL(C28835BTj.LIZIZ(null, dataChannel, "user_live_duration"));
        LIZ2.LJJIIJZLJL();
    }

    public static void LJIIZILJ(C77591Ucl rechargeDialogConfig, int i, boolean z, DataChannel dataChannel, Diamond diamond, boolean z2, DiamondPackageExtra diamondPackageExtra, String str, boolean z3, boolean z4, boolean z5) {
        int i2;
        Integer num;
        String str2;
        String str3;
        Object obj;
        Object obj2;
        Object obj3;
        String str4;
        Object obj4;
        o.LJIIIZ(rechargeDialogConfig, "rechargeDialogConfig");
        int i3 = 1;
        boolean z6 = false;
        if (diamond != null && i == diamond.count) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        OSZ[] oszArr = new OSZ[5];
        oszArr[0] = new OSZ("panel_type", LJI(rechargeDialogConfig, z2));
        if (diamond != null) {
            num = Integer.valueOf(diamond.count);
        } else {
            num = null;
        }
        oszArr[1] = new OSZ("call_package", String.valueOf(num));
        if (diamond != null) {
            str2 = diamond.LJLILLLLZI;
        } else {
            str2 = null;
        }
        oszArr[2] = new OSZ("currency", String.valueOf(str2));
        oszArr[3] = new OSZ("if_default_package", String.valueOf(i2));
        if (z) {
            str3 = "click";
        } else {
            str3 = "call";
        }
        oszArr[4] = new OSZ("preview_type", str3);
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        if (diamond == null || i != diamond.count) {
            i3 = 0;
        }
        java.util.Map LIZJ = LIZJ(rechargeDialogConfig, i);
        java.util.Map LJ = LJ();
        java.util.Map LIZLLL = LIZLLL(rechargeDialogConfig, diamondPackageExtra);
        BZI LIZ2 = C28787BRn.LIZ("livesdk_recharge_click");
        LIZ2.LJIJJ(Integer.valueOf(i), "recharge_package");
        LIZ2.LJIJJ(C76828UDg.LIZ(rechargeDialogConfig.LJIILIIL), "gift_enter_from");
        C78895Uxn.LIZIZ(LIZ2, rechargeDialogConfig.LJIILL, "gift_send_type", i3, "is_recommended");
        LIZ2.LJIJJ(rechargeDialogConfig.LJIIJJI, "request_page");
        LIZ2.LJIJJ(rechargeDialogConfig.LJIJ, "has_gift_sent_before");
        String str5 = "";
        if (o.LJ(BJM.LJIIIIZZ(), "portal")) {
            obj = "portal";
        } else {
            obj = "";
        }
        LIZ2.LJIJJ(obj, "recharge_reason");
        LIZ2.LJIJJ("window", "charge_style");
        String str6 = rechargeDialogConfig.LJIILIIL;
        if (C76828UDg.LIZIZ(str6)) {
            str5 = str6;
        }
        LIZ2.LJIJJ(str5, "notification_type");
        LIZ2.LJIJJ(LJFF(rechargeDialogConfig.LJIILIIL, rechargeDialogConfig.LJIILJJIL), "notification_request_id");
        LIZ2.LJIJJ(C77608Ud2.LIZ(), "pay_method");
        LIZ2.LJIJJ(rechargeDialogConfig.LJIIL, "second_entrance");
        if (dataChannel != null) {
            z6 = o.LJ(dataChannel.kv0(UserIsAnchorChannel.class), Boolean.TRUE);
        }
        String str7 = "1";
        if (z6) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJIJJ(obj2, "is_anchor");
        if (((IGiftService) CN1.LIZ(IGiftService.class)).isFirstRecharge()) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJIJJ(obj3, "is_first_recharge");
        LIZ2.LJIJJ(rechargeDialogConfig.LIZJ, "charge_reason");
        LIZ2.LJIJJ(String.valueOf(C30725C4b.LIZ()), "timestamp");
        LIZ2.LJIJJ(BJM.LJIILIIL(), "request_id");
        LIZ2.LJIJJ(str, "guided_to_web_type");
        LIZ2.LJIJJ(String.valueOf(BJM.LJIIL()), "portal_id");
        LIZ2.LJIJJ(Integer.valueOf(o.LJ(BJM.LJIIIIZZ(), "portal") ? 1 : 0), "is_portal_user");
        if (z5) {
            str4 = "feature_available";
        } else {
            str4 = "feature_unavailable";
        }
        LIZ2.LJIJJ(str4, "recharge_type");
        if (z3) {
            obj4 = "1";
        } else {
            obj4 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJIJJ(obj4, "if_has_exchange_option");
        if (!z4) {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJIJJ(str7, "can_exchange");
        LIZ2.LJJIFFI(LJJLIIIIJ);
        LIZ2.LJJIFFI(LIZLLL);
        LIZ2.LJJIFFI(LIZJ);
        LIZ2.LJJIFFI(LJ);
        LIZ2.LJJIFFI(rechargeDialogConfig.LIZIZ);
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LIZLLL(C28835BTj.LIZIZ(null, dataChannel, "user_live_duration"));
        LIZ2.LJJIIJZLJL();
    }

    public static /* synthetic */ void LJIJ(C77591Ucl c77591Ucl, int i, boolean z, DataChannel dataChannel, Diamond diamond, boolean z2, DiamondPackageExtra diamondPackageExtra, String str, boolean z3, boolean z4, int i2) {
        boolean z5;
        if ((i2 & 256) != 0) {
            z3 = false;
        }
        if ((i2 & 512) != 0) {
            z4 = false;
        }
        if ((i2 & 1024) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        LJIIZILJ(c77591Ucl, i, z, dataChannel, diamond, z2, diamondPackageExtra, str, z3, z4, z5);
    }

    public static void LJIL(int i, String str, String str2, C77591Ucl rechargeDialogConfig, DataChannel dataChannel, boolean z, Diamond diamond, boolean z2, DiamondPackageExtra diamondPackageExtra, boolean z3, boolean z4) {
        int i2;
        String str3;
        Object obj;
        Object obj2;
        Integer num;
        String str4;
        String str5;
        Object obj3;
        o.LJIIIZ(rechargeDialogConfig, "rechargeDialogConfig");
        if (diamond != null && i == diamond.count) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        OSZ[] oszArr = new OSZ[20];
        oszArr[0] = new OSZ("pay_method", C77608Ud2.LIZ());
        oszArr[1] = new OSZ("charge_style", "window");
        if (o.LJ(BJM.LJIIIIZZ(), "portal")) {
            str3 = "portal";
        } else {
            str3 = rechargeDialogConfig.LIZJ;
        }
        oszArr[2] = new OSZ("charge_reason", str3);
        oszArr[3] = new OSZ("request_page", rechargeDialogConfig.LJIIJJI);
        oszArr[4] = new OSZ("recharge_package", String.valueOf(i));
        String str6 = "1";
        if (((IGiftService) CN1.LIZ(IGiftService.class)).isFirstRecharge()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[5] = new OSZ("is_first_recharge", obj);
        oszArr[6] = new OSZ("second_entrance", rechargeDialogConfig.LJIIL);
        oszArr[7] = new OSZ("timestamp", String.valueOf(C30725C4b.LIZ()));
        String str7 = rechargeDialogConfig.LJIILIIL;
        if (!C76828UDg.LIZIZ(str7)) {
            str7 = "";
        }
        oszArr[8] = new OSZ("notification_type", str7);
        oszArr[9] = new OSZ("notification_request_id", LJFF(rechargeDialogConfig.LJIILIIL, rechargeDialogConfig.LJIILJJIL));
        if (dataChannel != null && o.LJ(dataChannel.kv0(UserIsAnchorChannel.class), Boolean.TRUE)) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[10] = new OSZ("is_anchor", obj2);
        oszArr[11] = new OSZ("order_id", str);
        oszArr[12] = new OSZ("package_quantity", str2);
        oszArr[13] = new OSZ("panel_type", LJI(rechargeDialogConfig, z2));
        if (diamond != null) {
            num = Integer.valueOf(diamond.count);
        } else {
            num = null;
        }
        oszArr[14] = new OSZ("call_package", String.valueOf(num));
        if (diamond != null) {
            str4 = diamond.LJLILLLLZI;
        } else {
            str4 = null;
        }
        oszArr[15] = new OSZ("currency", String.valueOf(str4));
        oszArr[16] = new OSZ("if_default_package", String.valueOf(i2));
        if (z) {
            str5 = "click";
        } else {
            str5 = "call";
        }
        oszArr[17] = new OSZ("preview_type", str5);
        if (z3) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[18] = new OSZ("if_has_exchange_option", obj3);
        if (!z4) {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[19] = new OSZ("can_exchange", str6);
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        if (!C38354F3m.LJ(C28594BKc.LIZJ().LIZLLL())) {
            String LIZLLL = C28594BKc.LIZJ().LIZLLL();
            o.LJIIIIZZ(LIZLLL, "getInstance().liveDrawerRequestPage");
            LJJLIIIIJ.put("enter_live_method", LIZLLL);
        }
        java.util.Map LIZJ = LIZJ(rechargeDialogConfig, i);
        java.util.Map LJ = LJ();
        java.util.Map LIZLLL2 = LIZLLL(rechargeDialogConfig, diamondPackageExtra);
        LJ.putAll(BJB.LIZ());
        BZI LIZ2 = C28787BRn.LIZ("livesdk_recharge_success");
        LIZ2.LJJIFFI(LJJLIIIIJ);
        if (!C38354F3m.LJ(BJM.LJII())) {
            LIZ2.LJIJJ(BJM.LJII(), "enter_url_source");
        }
        if (BJM.LJI() != 0) {
            LIZ2.LJIJJ(String.valueOf(BJM.LJI()), "enter_gift_id");
        }
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
        LIZ2.LJIJJ(iLiveHostCrossRoomEventHelper.getFromRequestId(), "cohost_from_request_id");
        LIZ2.LJIJJ(iLiveHostCrossRoomEventHelper.getFromRoomId(), "cohost_from_room_id");
        LIZ2.LJIJJ(C76828UDg.LIZ(rechargeDialogConfig.LJIILIIL), "gift_enter_from");
        LIZ2.LJIJJ(rechargeDialogConfig.LJIILL, "gift_send_type");
        LIZ2.LJIJJ(rechargeDialogConfig.LJIJ, "has_gift_sent_before");
        LIZ2.LJIJJ(String.valueOf(BJM.LJIIL()), "portal_id");
        LIZ2.LJIJJ(Integer.valueOf(o.LJ(BJM.LJIIIIZZ(), "portal") ? 1 : 0), "is_portal_user");
        LIZ2.LJJIFFI(LIZJ);
        LIZ2.LJJIFFI(LJ);
        LIZ2.LJJIFFI(LIZLLL2);
        LIZ2.LJJIFFI(rechargeDialogConfig.LIZIZ);
        LIZ2.LIZLLL(C28835BTj.LIZIZ(null, dataChannel, "user_live_duration"));
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJJIIJZLJL();
    }
}
