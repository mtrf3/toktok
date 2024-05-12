package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftGoalBannerEnabledSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftLockInfo;
import com.bytedance.android.livesdk.model.GiftsBoxInfoForSend;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.live.GiftSuspension;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ctp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32785Ctp {
    public static final C32785Ctp LJIILIIL = C77565UcL.LIZ;
    public static final String LJIILJJIL = "is_anchor";
    public static final String LJIILL = "convenient_icon";
    public static final String LJIILLIIL = "short_roomgift_limit";
    public static final String LJIIZILJ = "all_roomgift_limit";
    public static final String LJIJ = "uid_gift_limit";
    public String LIZ;
    public int LIZIZ;
    public int LIZJ;
    public List<? extends Gift> LIZLLL;
    public boolean LJ;
    public String LJI;
    public long LJII;
    public boolean LJIIIZ;
    public long LJFF = C30725C4b.LIZ();
    public final CopyOnWriteArraySet<Long> LJIIIIZZ = new CopyOnWriteArraySet<>();
    public java.util.Map<Long, C32830CuY> LJIIJ = new LinkedHashMap();
    public boolean LJIIJJI = true;
    public boolean LJIIL = true;

    public static java.util.Map LIZJ() {
        HashMap hashMap = new HashMap();
        IInteractService iInteractService = C31120CJg.LIZ;
        if (iInteractService.GR() >= 0) {
            hashMap.put("pk_status", String.valueOf(iInteractService.GR()));
        }
        if (iInteractService.Ef() >= 0) {
            hashMap.put("pk_preview_win", String.valueOf(iInteractService.Ef()));
        }
        return hashMap;
    }

    public static java.util.Map LIZLLL() {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        LiveMode liveMode = null;
        if (room != null) {
            liveMode = room.getStreamType();
        }
        if (C29137Bc5.LIZ(liveMode)) {
            IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
            if (iInteractService == null || (str = iInteractService.gB()) == null) {
                str = "";
            }
            linkedHashMap.put("layout_id", str);
        }
        return linkedHashMap;
    }

    public static boolean LJI() {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && room.getOwnerUserId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            return true;
        }
        return false;
    }

    public static void LJIIZILJ() {
        BZI LIZ = C28787BRn.LIZ("subscribe_expire");
        LIZ.LJIJJ(Long.valueOf(BJM.LJIILJJIL()), "room_id");
        LIZ.LJIJJ(Long.valueOf(BJM.LJ()), "anchor_id");
        LIZ.LJIJJ(BJM.LJFF(), "enter_from_merge");
        LIZ.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
        LIZ.LJIJJ(BJM.LIZLLL(), "action_type");
        LIZ.LJIJJ(BJM.LJIILIIL(), "request_id");
        LIZ.LJIJJ(BJM.LJIJ(), "video_id");
        LIZ.LJIJJ("sub_gift", "click_position");
        LIZ.LJJIIJZLJL();
    }

    public static boolean LIZ(Gift gift) {
        int i;
        C29800Bmm gr = ((IUserLevelService) CN1.LIZ(IUserLevelService.class)).gr();
        if (gr == null) {
            return false;
        }
        if (gift != null) {
            i = gift.diamondCount;
        } else {
            i = 0;
        }
        if (i + gr.LIZIZ <= gr.LJII) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(String str) {
        Long l;
        String str2;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            room.getOwnerUserId();
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        BZI LIZ = C28787BRn.LIZ("gift_ban_toast_show");
        LIZ.LJIJJ(l, "anchor_id");
        LIZ.LJIJJ(Long.valueOf(BJM.LJIILJJIL()), "room_id");
        LIZ.LJIJJ(str, "toast_reason");
        String str3 = LJIILJJIL;
        if (LJI()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(str2, str3);
        LIZ.LJJIIJZLJL();
    }

    public static String LJ(Gift gift) {
        GiftLockInfo giftLockInfo;
        Integer valueOf;
        if (gift != null && (giftLockInfo = gift.giftSubInfo) != null && (valueOf = Integer.valueOf(giftLockInfo.mLockType)) != null) {
            if (valueOf.intValue() == 1) {
                return "subscribe_lock_gift";
            }
            if (valueOf.intValue() == 2) {
                return "event_lock_gift";
            }
        }
        return "normal_gift";
    }

    public static String LJFF(String str) {
        MessageDigest messageDigest;
        byte[] bArr = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
            messageDigest = null;
        }
        if (messageDigest != null) {
            byte[] bytes = str.getBytes(PVC.LIZ);
            o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
            bArr = messageDigest.digest(bytes);
        }
        return C38352F3k.LJ(bArr);
    }

    public static boolean LJII(Gift gift) {
        GiftLockInfo giftLockInfo;
        if (gift != null && (giftLockInfo = gift.giftSubInfo) != null && giftLockInfo.mLockType == 5) {
            return true;
        }
        return false;
    }

    public static boolean LJIIIIZZ(Gift gift) {
        GiftLockInfo giftLockInfo;
        if (gift != null && (giftLockInfo = gift.giftSubInfo) != null && giftLockInfo.mLockType == 4) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIIIZ(long r7) {
        /*
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LJLJJI
            java.lang.Class<X.Baa> r0 = X.C29044Baa.class
            java.lang.Object r0 = r1.mv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            r6 = 0
            java.lang.String r5 = "0"
            if (r0 == 0) goto L3e
            long r3 = r0.getId()
            java.lang.String r0 = "room_id"
            java.lang.String r0 = X.C29854Bne.LIZ(r0)
            if (r0 != 0) goto L1c
            r0 = r5
        L1c:
            long r1 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L3e
            r3 = 1
        L25:
            java.lang.String r0 = "goal_gift_id"
            java.lang.String r0 = X.C29854Bne.LIZ(r0)
            if (r0 != 0) goto L2e
            r0 = r5
        L2e:
            long r1 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L37
            r6 = 1
        L37:
            if (r3 == 0) goto L3d
            if (r6 == 0) goto L3d
            java.lang.String r5 = "1"
        L3d:
            return r5
        L3e:
            r3 = 0
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32785Ctp.LJIIIZ(long):java.lang.String");
    }

    public static boolean LJIIJ(Gift gift) {
        GiftLockInfo giftLockInfo;
        if (gift != null && (giftLockInfo = gift.giftSubInfo) != null && giftLockInfo.mLockType == 3) {
            return true;
        }
        return false;
    }

    public static void LJIIJJI(String type) {
        String str;
        o.LJIIIZ(type, "type");
        BZI LIZ = C28787BRn.LIZ("special_gift_icon_show");
        LIZ.LJIJJ(BJM.LJFF(), "enter_from_merge");
        LIZ.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
        LIZ.LJIJJ(BJM.LIZLLL(), "action_type");
        LIZ.LJIJJ(type, "animation_type");
        if (LJI()) {
            str = "anchor";
        } else {
            str = "user";
        }
        LIZ.LJIJJ(str, "user_type");
        LIZ.LJJIIJZLJL();
    }

    public static void LJJIII(GiftsBoxInfoForSend giftsBoxInfoForSend) {
        long j;
        String str;
        if (giftsBoxInfoForSend != null) {
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            long j2 = 0;
            if (room != null) {
                j = room.getId();
                if (room.getOwner() != null) {
                    j2 = room.getOwner().getId();
                }
            } else {
                j = 0;
            }
            long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
            if (j2 == currentUserId) {
                str = "anchor";
            } else {
                str = "user";
            }
            BZI LIZ = C28787BRn.LIZ("livesdk_send_giftbox_failed_toast_show");
            LIZ.LJIJJ(BJM.LJFF(), "enter_from_merge");
            LIZ.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
            LIZ.LJIJJ(Long.valueOf(j), "room_id");
            LIZ.LJIJJ(Long.valueOf(j2), "anchor_id");
            LIZ.LJIJJ(Long.valueOf(currentUserId), "user_id");
            LIZ.LJIJJ(str, "user_type");
            LIZ.LJJIIJZLJL();
        }
    }

    public static void LJJIIJ(C32805Cu9 c32805Cu9) {
        GiftsBoxInfoForSend giftsBoxInfoForSend;
        if (c32805Cu9 != null) {
            giftsBoxInfoForSend = c32805Cu9.LJJJJ;
        } else {
            giftsBoxInfoForSend = null;
        }
        LJJIII(giftsBoxInfoForSend);
    }

    public final void LJIIL(EnumC32766CtW currentState) {
        String str;
        String str2;
        o.LJIIIZ(currentState, "currentState");
        BZI LIZIZ = C0N3.LIZIZ("gift_panel_price_sorting_click", "live", "enter_from_method");
        String str3 = this.LJI;
        if (str3 == null) {
            str3 = "icon";
        }
        LIZIZ.LJIJJ(str3, "gift_enter_from");
        LIZIZ.LJIJJ(C31120CJg.LJ().getDesc(), "send_gift_scene");
        String str4 = LJIILJJIL;
        if (LJI()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZIZ.LJIJJ(str, str4);
        LIZIZ.LJIJJ(currentState.getDescription(), "current_mode");
        LIZIZ.LJIJJ(currentState.nextState().getDescription(), "activation_mode");
        if (C88137YiT.LIZ.LIZ) {
            str2 = "first_screen";
        } else {
            str2 = "other_screen";
        }
        LIZIZ.LJIJJ(str2, "is_first_screen");
        LIZIZ.LJJIIJZLJL();
    }

    public static void LJIJJ(long j, boolean z) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        C32455CoV.LJII(jSONObject, jSONObject3);
        Gift findGiftById = GiftManager.inst().findGiftById(j);
        if (findGiftById != null) {
            C32455CoV.LIZJ(findGiftById, null, 0L, jSONObject, jSONObject3);
        }
        C32455CoV.LJIJ(jSONObject, jSONObject2, j);
        jSONObject.put("dynamic_preview", GiftManager.inst().isDynamicGift(j) ? 1 : 0);
        jSONObject.put("is_preview_image_displayed", z ? 1 : 0);
        BZI LIZ = C28787BRn.LIZ("livesdk_gift_selected_view_click");
        LIZ.LJIIZILJ();
        LIZ.LJJ(jSONObject);
        LIZ.LJJ(jSONObject3);
        LIZ.LJJ(jSONObject2);
        LIZ.LJJIIJZLJL();
        C0K2.LJI("ttlive_gift_selected_view_click", jSONObject, jSONObject2, jSONObject3);
    }

    public static void LJIJJLI(String str, String message) {
        o.LJIIIZ(message, "message");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject.put("error_msg", message);
        jSONObject.put("error_code", str);
        C0K2.LJI("gift_send_client_exception", jSONObject, jSONObject2, jSONObject3);
    }

    public static void LJJ(Integer num, String str) {
        String str2;
        BZI LIZIZ = C0N3.LIZIZ("gift_tab_click", str, "tab_name");
        LIZIZ.LJIJJ(C77283UUt.LIZ, "gift_dialog_request_id");
        LIZIZ.LJIJJ(num, "tab_id");
        if (C15380j0.LJIILLIIL()) {
            str2 = "portrait";
        } else {
            str2 = "landscape";
        }
        LIZIZ.LJIJJ(str2, "room_orientation");
        LIZIZ.LJJIIJZLJL();
    }

    public static void LJJIIZ(String str, String convenientSource) {
        String str2;
        o.LJIIIZ(convenientSource, "convenientSource");
        HashMap hashMap = new HashMap();
        hashMap.put("error_code", "-1: Network error");
        if (C38354F3m.LJ(str)) {
            str2 = "icon";
        } else if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        hashMap.put("gift_enter_from", str2);
        if (ujb.o.LJJJJIZL(str, LJIILL, false)) {
            hashMap.put("convenient_gift_enter_from", convenientSource);
        }
        BZI LIZ = C28787BRn.LIZ("send_gift_network_fail");
        LIZ.LJIIZILJ();
        LIZ.LIZLLL(C28835BTj.LIZJ("user_live_duration"));
        LIZ.LJJIFFI(hashMap);
        LIZ.LJJIIJZLJL();
    }

    public static void LJIL(boolean z, Room room, GiftSuspension giftSuspension) {
        String str;
        String str2;
        if (z) {
            str = "anchor";
        } else {
            str = "user";
        }
        int i = giftSuspension.status;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str2 = "";
                } else {
                    str2 = LJIJ;
                }
            } else {
                str2 = LJIIZILJ;
            }
        } else {
            str2 = LJIILLIIL;
        }
        BZI LIZIZ = C0N3.LIZIZ("livesdk_violation_toast", str, "user_type");
        LIZIZ.LJIJJ(Long.valueOf(room.getOwnerUserId()), "violation_anchor_id");
        LIZIZ.LJIJJ(str2, "violation_type");
        LIZIZ.LJIJJ("live", "scene_type");
        LIZIZ.LJJIIJZLJL();
    }

    public static void LJIJ(long j, int i, int i2, Long l, List list) {
        boolean z;
        String str;
        C32785Ctp c32785Ctp = LJIILIIL;
        Long valueOf = Long.valueOf(j);
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        C32128CjE c32128CjE = C32129CjF.LIZ;
        String str2 = c32128CjE.LJ;
        if (C88133YiP.LIZ.LIZ) {
            str = "call";
        } else {
            str = "click";
        }
        c32785Ctp.LJJIFFI(valueOf, z, str2, str, Integer.valueOf(c32128CjE.LJIIIIZZ), Integer.valueOf(i2), l, list, null);
    }

    public static void LJJIJ(C32805Cu9 c32805Cu9, String str, String str2, String str3, String str4) {
        HH1.LIZ(str, "errorCode", str2, "errorReason", str4, "convenientSource");
        LJJIIZI(str, str2, str3, str4, c32805Cu9.LJJ, c32805Cu9.LJ);
    }

    public final void LJIILLIIL(int i, int i2, GiftPage giftPage, boolean z, String str) {
        int i3;
        String str2;
        String str3;
        int i4;
        Long l;
        Integer num;
        Gift gift;
        Gift gift2;
        Gift gift3;
        User owner;
        int i5;
        long j;
        Gift gift4;
        o.LJIIIZ(giftPage, "giftPage");
        int i6 = this.LIZJ;
        if (i6 == i && !z) {
            return;
        }
        this.LIZIZ = i6;
        this.LIZJ = i;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        JSONObject jSONObject = new JSONObject();
        int i7 = 1;
        if (giftPage.gifts.size() < 9) {
            i3 = giftPage.gifts.size();
        } else if (giftPage.gifts.size() > this.LIZJ * 8 && giftPage.gifts.size() < (this.LIZJ + 1) * 8) {
            i3 = giftPage.gifts.size() - (this.LIZJ * 8);
        } else {
            i3 = 8;
        }
        for (int i8 = 0; i8 < i3; i8++) {
            int i9 = (this.LIZJ * 8) + i8;
            List<? extends Gift> list = this.LIZLLL;
            if (list != null) {
                i5 = list.size();
            } else {
                i5 = 0;
            }
            if (i5 > i9) {
                List<? extends Gift> list2 = this.LIZLLL;
                if (list2 != null && (gift4 = (Gift) ListProtector.get(list2, i9)) != null) {
                    j = gift4.id;
                } else {
                    j = 0;
                }
                jSONObject.put(String.valueOf(j), i8 + 1);
            }
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_gift_pages_show");
        LIZ.LJIIZILJ();
        LIZ.LIZLLL(C28835BTj.LIZJ("user_live_duration"));
        LIZ.LJIJJ(C77283UUt.LIZ, "gift_dialog_request_id");
        LIZ.LJIJJ(giftPage.pageName, "tab_name");
        LIZ.LJIJJ(Integer.valueOf(giftPage.pageType), "tab_id");
        LIZ.LJIJJ(Integer.valueOf(i2 + 1), "tab_position");
        LIZ.LJIJJ(Integer.valueOf(this.LIZIZ + 1), "from_page");
        LIZ.LJIJJ(jSONObject.toString(), "gift_seen");
        if (C88137YiT.LIZ.LIZ) {
            str2 = "first_screen";
        } else {
            str2 = "other_screen";
        }
        LIZ.LJIJJ(str2, "is_first_screen");
        if (o.LJ(C31120CJg.LIZIZ(), "manual_pk")) {
            if (C31120CJg.LJIIIZ()) {
                LIZ.LJIJJ("pk_phase", "match_status");
            } else {
                LIZ.LJIJJ("punish", "match_status");
            }
            LIZ.LJJIFFI(C31120CJg.LJFF());
        }
        LIZ.LJIJJ(C31120CJg.LJ().getDesc(), "send_gift_scene");
        int i10 = i + 1;
        LIZ.LJIJJ(Integer.valueOf(i10), "page");
        LIZ.LJIJJ(Integer.valueOf(i10), "page_position");
        LIZ.LJIJJ(str, "gift_enter_from");
        LIZ.LJIJJ(str, "event_module");
        String str4 = LJIILJJIL;
        if (LJI()) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(str3, str4);
        if (room == null || (owner = room.getOwner()) == null || !owner.isSubscribed()) {
            i7 = 0;
        }
        LIZ.LJIJJ(Integer.valueOf(i7), "is_subscription");
        LIZ.LJJIFFI(C32129CjF.LIZ.LJIILJJIL);
        LIZ.LJJIIJZLJL();
        for (int i11 = 0; i11 < i3; i11++) {
            int i12 = (this.LIZJ * 8) + i11;
            List<? extends Gift> list3 = this.LIZLLL;
            if (list3 != null) {
                i4 = list3.size();
            } else {
                i4 = 0;
            }
            if (i12 < i4) {
                List<? extends Gift> list4 = this.LIZLLL;
                String str5 = null;
                if (list4 != null && (gift3 = (Gift) ListProtector.get(list4, i12)) != null) {
                    l = Long.valueOf(gift3.id);
                } else {
                    l = null;
                }
                List<? extends Gift> list5 = this.LIZLLL;
                if (list5 != null && (gift2 = (Gift) ListProtector.get(list5, i12)) != null) {
                    num = Integer.valueOf(gift2.diamondCount);
                } else {
                    num = null;
                }
                List<? extends Gift> list6 = this.LIZLLL;
                if (list6 != null && (gift = (Gift) ListProtector.get(list6, i12)) != null) {
                    str5 = gift.recommendInfo;
                }
                LJIILJJIL(i11, i2, giftPage, l, num, str5);
            }
        }
    }

    public static void LJIJI(int i, long j, long j2, long j3, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        C32455CoV.LJII(jSONObject, jSONObject3);
        Gift findGiftById = GiftManager.inst().findGiftById(j);
        if (findGiftById != null) {
            C32455CoV.LIZJ(findGiftById, null, 0L, jSONObject, jSONObject3);
        }
        C32455CoV.LJIJ(jSONObject, jSONObject2, j);
        jSONObject.put("combo_style", str);
        jSONObject.put("combo_from", str2);
        jSONObject.put("combo_count", i);
        jSONObject2.put("send_to_combo_view_duration", j2);
        jSONObject2.put("combo_show_to_click_time", j3);
        BZI LIZ = C28787BRn.LIZ("livesdk_gift_combo_view_show");
        LIZ.LJIIZILJ();
        LIZ.LJJ(jSONObject);
        LIZ.LJJ(jSONObject3);
        LIZ.LJJ(jSONObject2);
        LIZ.LJJIIJZLJL();
        C0K2.LJI("ttlive_gift_combo_view_show", jSONObject, jSONObject2, jSONObject3);
    }

    public static void LJJIIJZLJL(String errorCode, String str, String str2, String convenientSource, long j, long j2) {
        String str3;
        o.LJIIIZ(errorCode, "errorCode");
        o.LJIIIZ(convenientSource, "convenientSource");
        HashMap hashMap = new HashMap();
        hashMap.put("error_code", errorCode);
        if (C38354F3m.LJ(str2)) {
            str3 = "icon";
        } else if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2;
        }
        hashMap.put("gift_enter_from", str3);
        hashMap.put("fail_reason", str);
        hashMap.put("send_click_duration", String.valueOf(C30725C4b.LIZ() - j2));
        if (ujb.o.LJJJJIZL(str2, LJIILL, false)) {
            hashMap.put("convenient_gift_enter_from", convenientSource);
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        C32455CoV.LJII(jSONObject, jSONObject3);
        Gift findGiftById = GiftManager.inst().findGiftById(j);
        if (findGiftById != null) {
            C32455CoV.LIZJ(findGiftById, null, 0L, jSONObject, jSONObject3);
        }
        C32455CoV.LJIJ(jSONObject, jSONObject2, j);
        BZI LIZ = C28787BRn.LIZ("livesdk_gift_local_fail");
        LIZ.LJIIZILJ();
        LIZ.LJJ(jSONObject);
        LIZ.LJJ(jSONObject3);
        LIZ.LJJ(jSONObject2);
        LIZ.LJJIFFI(hashMap);
        LIZ.LJJIIJZLJL();
    }

    public static void LJJIIZI(String errorCode, String errorReason, String str, String convenientSource, long j, long j2) {
        String str2;
        o.LJIIIZ(errorCode, "errorCode");
        o.LJIIIZ(errorReason, "errorReason");
        o.LJIIIZ(convenientSource, "convenientSource");
        HashMap hashMap = new HashMap();
        hashMap.put("error_code", errorCode);
        hashMap.put("fail_reason", errorReason);
        if (C38354F3m.LJ(str)) {
            str2 = "icon";
        } else if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        hashMap.put("gift_enter_from", str2);
        hashMap.put("send_click_duration", String.valueOf(C30725C4b.LIZ() - j));
        hashMap.put("gift_id", String.valueOf(j2));
        if (ujb.o.LJJJJIZL(str, LJIILL, false)) {
            hashMap.put("convenient_gift_enter_from", convenientSource);
        }
        C29822Bn8.LIZIZ("livesdk_gift_request_fail", hashMap);
    }

    public final void LJIILJJIL(int i, int i2, GiftPage giftPage, Long l, Integer num, String str) {
        int i3;
        String str2;
        Long l2;
        boolean z;
        int i4;
        Object obj;
        String str3;
        long j;
        Object obj2;
        Object obj3;
        String str4;
        User owner;
        String str5;
        LiveMode streamType;
        String str6 = str;
        int i5 = (this.LIZJ * 8) + i;
        List<? extends Gift> list = this.LIZLLL;
        if (list != null) {
            i3 = list.size();
        } else {
            i3 = 0;
        }
        if (i3 <= i5) {
            return;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        dataChannelGlobal.mv0(C29054Bak.class);
        Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        Long l3 = null;
        if (room2 != null && (streamType = room2.getStreamType()) != null) {
            str2 = C28509BGv.LIZ(streamType);
        } else {
            str2 = null;
        }
        C32515CpT c32515CpT = C32502CpG.LIZIZ().LIZ;
        if (c32515CpT != null) {
            l2 = Long.valueOf(c32515CpT.LJLIL);
        } else {
            l2 = null;
        }
        int i6 = 1;
        if (o.LJ(l2, l) && LiveGiftGoalBannerEnabledSetting.INSTANCE.getValue()) {
            z = true;
        } else {
            z = false;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_gift_show");
        LIZ.LJIIZILJ();
        LIZ.LIZLLL(C28835BTj.LIZJ("user_live_duration"));
        LIZ.LJIJJ(l, "gift_id");
        LIZ.LJIJJ(C77283UUt.LIZ, "gift_dialog_request_id");
        String str7 = "";
        if (str6 == null) {
            str6 = "";
        }
        LIZ.LJIJJ(str6, "recommend_info");
        if (giftPage != null && (str5 = giftPage.pageName) != null) {
            str7 = str5;
        }
        LIZ.LJIJJ(str7, "tab_name");
        if (giftPage != null) {
            i4 = giftPage.pageType;
        } else {
            i4 = 0;
        }
        LIZ.LJIJJ(Integer.valueOf(i4), "tab_id");
        LIZ.LJIJJ(Integer.valueOf(i2 + 1), "tab_position");
        String str8 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(obj, "is_goal_gift_label_show");
        if (o.LJ(C31120CJg.LIZIZ(), "manual_pk")) {
            if (C31120CJg.LJIIIZ()) {
                LIZ.LJIJJ("pk_phase", "match_status");
            } else {
                LIZ.LJIJJ("punish", "match_status");
            }
            LIZ.LJJIFFI(C31120CJg.LJFF());
        }
        LIZ.LJIJJ(Integer.valueOf(i + 1), "gift_position");
        LIZ.LJIJJ(Integer.valueOf(this.LIZJ + 1), "page_position");
        if (this.LJ) {
            str3 = "guest";
        } else {
            str3 = "anchor";
        }
        LIZ.LJIJJ(str3, "to_user_type");
        LIZ.LJIJJ(C31120CJg.LJ().getDesc(), "send_gift_scene");
        GiftManager inst = GiftManager.inst();
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        LIZ.LJIJJ(Integer.valueOf(inst.getGiftPosition(j)), "actual_gift_position");
        String str9 = this.LJI;
        if (str9 == null) {
            str9 = "icon";
        }
        LIZ.LJIJJ(str9, "gift_enter_from");
        LIZ.LJIJJ(num, "gift_price");
        LIZ.LJIJJ(Long.valueOf(C30725C4b.LIZ()), "timestamp");
        if (o.LJ(BJM.LJIIIIZZ(), "portal")) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(obj2, "is_portal_user");
        String str10 = LJIILJJIL;
        if (LJI()) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(obj3, str10);
        if (C88137YiT.LIZ.LIZ) {
            str4 = "first_screen";
        } else {
            str4 = "other_screen";
        }
        LIZ.LJIJJ(str4, "is_first_screen");
        if (room == null || (owner = room.getOwner()) == null || !owner.isSubscribed()) {
            i6 = 0;
        }
        LIZ.LJIJJ(Integer.valueOf(i6), "is_subscription");
        C32128CjE c32128CjE = C32129CjF.LIZ;
        LIZ.LJJIFFI(c32128CjE.LJIILJJIL);
        LIZ.LJIJJ(0, "is_leaderboard");
        LIZ.LJIJJ(Integer.valueOf(EnumC35440DvY.NO_IN_RANK.getValue()), "leaderboard_user_rank");
        LIZ.LJIJJ(str2, "live_type");
        User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
        o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
        LIZ.LJIJJ(C31120CJg.LJII(LJ), "user_type");
        if (C74838TYs.LJ().LJJ <= 0) {
            str8 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(str8, "is_guest_connection");
        User user = c32128CjE.LIZJ;
        if (user != null) {
            l3 = Long.valueOf(user.getId());
        }
        LIZ.LJIJJ(l3, "to_user_id");
        LIZ.LJJIFFI(LIZLLL());
        LIZ.LJJIIJZLJL();
    }

    public final void LJJI(long j, boolean z, boolean z2, String str, String giftPageName, String str2, Integer num, String str3) {
        int i;
        int i2;
        long j2;
        C29750Bly DZ;
        C29800Bmm gr;
        o.LJIIIZ(giftPageName, "giftPageName");
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        Gift findGiftById = GiftManager.inst().findGiftById(j);
        if (LJIIJ(findGiftById) && this.LJIIIIZZ.contains(Long.valueOf(j))) {
            i = 1;
        } else if (LJIIJ(findGiftById) && !this.LJIIIIZZ.contains(Long.valueOf(j))) {
            i = 0;
        } else {
            i = -1;
        }
        if (z) {
            C32849Cur.LIZ(j, z, new C32794Cty(j, str2, findGiftById, z2, this, i, str3));
            return;
        }
        boolean LJIIJ = LJIIJ(findGiftById);
        boolean LJIIIIZZ = LJIIIIZZ(findGiftById);
        boolean LJII = LJII(findGiftById);
        IUserLevelService iUserLevelService = (IUserLevelService) CN1.LIZ(IUserLevelService.class);
        if (iUserLevelService != null && (gr = iUserLevelService.gr()) != null) {
            i2 = gr.LIZ;
        } else {
            i2 = 0;
        }
        IFansClubService iFansClubService = (IFansClubService) CN1.LIZ(IFansClubService.class);
        if (iFansClubService != null && (DZ = iFansClubService.DZ()) != null) {
            j2 = DZ.LIZ;
        } else {
            j2 = 0;
        }
        C32849Cur.LIZ(j, z, new C32791Ctv(z2, j, str, str2, findGiftById, LJIIJ, LJIIIIZZ, LJII, this, giftPageName, num, room, i2, j2, i));
    }

    public final void LJJIFFI(Long l, boolean z, String str, String str2, Integer num, Integer num2, Long l2, List list, C76854UEg c76854UEg) {
        int i;
        long j;
        C29750Bly DZ;
        C29800Bmm gr;
        java.util.Map LIZJ = LIZJ();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        IUserLevelService iUserLevelService = (IUserLevelService) CN1.LIZ(IUserLevelService.class);
        if (iUserLevelService != null && (gr = iUserLevelService.gr()) != null) {
            i = gr.LIZ;
        } else {
            i = 0;
        }
        IFansClubService iFansClubService = (IFansClubService) CN1.LIZ(IFansClubService.class);
        long j2 = 0;
        if (iFansClubService != null && (DZ = iFansClubService.DZ()) != null) {
            j = DZ.LIZ;
        } else {
            j = 0;
        }
        if (l != null) {
            j2 = l.longValue();
        }
        C32849Cur.LIZ(j2, false, new C32788Cts(l, this, z, str, str2, num, num2, l2, room, list, i, j, LIZJ, c76854UEg));
    }

    public final void LJIILL(String str, Integer num, List list, String str2, String str3, String str4, String str5, boolean z, java.util.Map map, String str6) {
        Long l;
        int i;
        String str7;
        Object obj;
        String str8;
        String str9;
        Object obj2;
        User owner;
        LiveMode streamType;
        String str10 = str4;
        ArrayList LJ = AnonymousClass391.LJ(list, "giftIdSet");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            l = null;
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            long longValue = ((Number) it.next()).longValue();
            if (map != null) {
                C32830CuY c32830CuY = (C32830CuY) ((LinkedHashMap) map).get(Long.valueOf(longValue));
                if (c32830CuY != null) {
                    LJ.add(1);
                    arrayList.add(Long.valueOf(c32830CuY.LIZIZ));
                    arrayList2.add(c32830CuY.LIZJ);
                    arrayList3.add(c32830CuY.LJFF);
                }
            }
            LJ.add(0);
            arrayList.add(-1L);
            arrayList2.add(null);
            arrayList3.add(null);
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        dataChannelGlobal.mv0(C29054Bak.class);
        Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room2 != null && (streamType = room2.getStreamType()) != null) {
            str7 = C28509BGv.LIZ(streamType);
        } else {
            str7 = null;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_gift_show");
        LIZ.LJIIZILJ();
        LIZ.LIZLLL(C28835BTj.LIZJ("user_live_duration"));
        LIZ.LJIJJ(C77283UUt.LIZ, "gift_dialog_request_id");
        GiftManager inst = GiftManager.inst();
        C32128CjE c32128CjE = C32129CjF.LIZ;
        LIZ.LJIJJ(inst.getTabName(c32128CjE.LJIIIIZZ), "tab_name");
        String str11 = "1";
        if (o.LJ(BJM.LJIIIIZZ(), "portal")) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(obj, "is_portal_user");
        LIZ.LJIJJ(Integer.valueOf(c32128CjE.LJIIIIZZ), "tab_id");
        LIZ.LJIJJ(Integer.valueOf(GiftManager.inst().getTabLocation(c32128CjE.LJIIIIZZ)), "tab_position");
        if (c32128CjE.LIZLLL == EnumC35487DwJ.GUEST) {
            str8 = "guest";
        } else {
            str8 = "anchor";
        }
        LIZ.LJIJJ(str8, "to_user_type");
        LIZ.LJIJJ(C31120CJg.LJ().getDesc(), "send_gift_scene");
        LIZ.LJIJJ(str, "show_gift_position");
        LIZ.LJIJJ(num, "show_gift_cnt");
        LIZ.LJIJJ(list.toString(), "gift_id_set");
        LIZ.LJIJJ(str3, "gift_price_set");
        if (str10 == null) {
            str10 = "";
        }
        LIZ.LJIJJ(str10, "recommend_info_set");
        LIZ.LJIJJ(str2, "gift_position");
        String str12 = this.LJI;
        if (str12 == null) {
            str12 = "icon";
        }
        LIZ.LJIJJ(str12, "gift_enter_from");
        LIZ.LJIJJ(Long.valueOf(C30725C4b.LIZ()), "timestamp");
        if (C88137YiT.LIZ.LIZ) {
            str9 = "first_screen";
        } else {
            str9 = "other_screen";
        }
        LIZ.LJIJJ(str9, "is_first_screen");
        String str13 = LJIILJJIL;
        if (LJI()) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(obj2, str13);
        if (room == null || (owner = room.getOwner()) == null || !owner.isSubscribed()) {
            i = 0;
        }
        LIZ.LJIJJ(Integer.valueOf(i), "is_subscription");
        LIZ.LJJIFFI(c32128CjE.LJIILJJIL);
        LIZ.LJIJJ(str5, "is_frequently_used_gift");
        LIZ.LJIJJ(Integer.valueOf(z ? 1 : 0), "is_in_frequently_used_gift_area");
        LIZ.LJIJJ(0, "is_leaderboard");
        LIZ.LJIJJ(Integer.valueOf(EnumC35440DvY.NO_IN_RANK.getValue()), "leaderboard_user_rank");
        LIZ.LJIJJ(str7, "live_type");
        LIZ.LJIJJ(LJ.toString(), "is_force_insert_gift");
        LIZ.LJIJJ(arrayList.toString(), "force_insert_priority");
        LIZ.LJIJJ(arrayList2.toString(), "force_insert_from");
        LIZ.LJIJJ(arrayList3.toString(), "force_insert_gift_country");
        User LJ2 = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
        o.LJIIIIZZ(LJ2, "getInstance().user().currentUserOpt");
        LIZ.LJIJJ(C31120CJg.LJII(LJ2), "user_type");
        if (C74838TYs.LJ().LJJ <= 0) {
            str11 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(str11, "is_guest_connection");
        if (o.LJ(C31120CJg.LIZIZ(), "manual_pk")) {
            if (C31120CJg.LJIIIZ()) {
                LIZ.LJIJJ("pk_phase", "match_status");
            } else {
                LIZ.LJIJJ("punish", "match_status");
            }
            LIZ.LJJIFFI(C31120CJg.LJFF());
        }
        User user = c32128CjE.LIZJ;
        if (user != null) {
            l = Long.valueOf(user.getId());
        }
        LIZ.LJIJJ(l, "to_user_id");
        if (C29306Beo.LJIJJLI(str6)) {
            LIZ.LJIJJ(str6, "is_goal_gift_label_show");
        }
        LIZ.LJJIFFI(LIZLLL());
        LIZ.LJJIIJZLJL();
    }

    public final void LJIILIIL(boolean z, long j, boolean z2, int i, String str, int i2, Integer num, Long l, String str2, boolean z3, List<Long> frequentlyUsedGifts, java.util.Map<Long, C32830CuY> map, boolean z4, C76854UEg c76854UEg) {
        C32830CuY c32830CuY;
        long j2;
        int i3;
        Object obj;
        Object obj2;
        boolean z5;
        boolean z6;
        int i4;
        Object obj3;
        long j3;
        int i5;
        Object obj4;
        int i6;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        int i7;
        int i8;
        List list;
        Object obj10;
        java.util.Map map2;
        int i9;
        long j4;
        Object obj11;
        int i10;
        int i11;
        long j5;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        Object obj18;
        ImageModel imageModel;
        List<String> list2;
        String str3;
        Object obj19;
        Object obj20;
        GiftLockInfo giftLockInfo;
        User owner;
        GiftLockInfo giftLockInfo2;
        GiftLockInfo giftLockInfo3;
        GiftLockInfo giftLockInfo4;
        LiveMode streamType;
        GiftLockInfo giftLockInfo5;
        GiftLockInfo giftLockInfo6;
        o.LJIIIZ(frequentlyUsedGifts, "frequentlyUsedGifts");
        if (map != null) {
            c32830CuY = map.get(Long.valueOf(j));
        } else {
            c32830CuY = null;
        }
        Object obj21 = "null";
        if (c32830CuY != null) {
            j2 = c32830CuY.LIZIZ;
            obj2 = c32830CuY.LIZJ;
            obj = c32830CuY.LJFF;
            if (obj == null) {
                obj = "null";
            }
            i3 = 1;
        } else {
            j2 = -1;
            i3 = 0;
            obj = "null";
            obj2 = "null";
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        Gift findGiftById = GiftManager.inst().findGiftById(j);
        boolean LJIIJ = LJIIJ(findGiftById);
        boolean LJIIIIZZ = LJIIIIZZ(findGiftById);
        boolean LJII = LJII(findGiftById);
        if (findGiftById != null) {
            z5 = findGiftById.isEffectBEFView;
            z6 = findGiftById.isRandomGift;
        } else {
            z5 = false;
            z6 = false;
        }
        int i12 = -1;
        if (LJIIJ) {
            if (findGiftById != null && (giftLockInfo5 = findGiftById.giftSubInfo) != null && giftLockInfo5.mLockType == 3 && (giftLockInfo6 = findGiftById.giftSubInfo) != null && !giftLockInfo6.mLock) {
                i4 = 1;
            } else {
                i4 = 0;
            }
        } else {
            i4 = -1;
        }
        dataChannelGlobal.mv0(C29054Bak.class);
        Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room2 != null && (streamType = room2.getStreamType()) != null) {
            obj3 = C28509BGv.LIZ(streamType);
        } else {
            obj3 = null;
        }
        if (LJIIJ) {
            if (this.LJIIIIZZ.contains(Long.valueOf(j))) {
                i12 = 1;
            } else if (!this.LJIIIIZZ.contains(Long.valueOf(j))) {
                i12 = 0;
            }
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        C32455CoV.LJII(jSONObject, jSONObject3);
        if (findGiftById != null) {
            C32455CoV.LIZJ(findGiftById, null, 0L, jSONObject, jSONObject3);
        }
        C32455CoV.LJIJ(jSONObject, jSONObject2, j);
        BZI LIZ = C28787BRn.LIZ("livesdk_gift_preview");
        LIZ.LJIIZILJ();
        LIZ.LIZLLL(C28835BTj.LIZJ("user_live_duration"));
        LIZ.LJJ(jSONObject);
        LIZ.LJJ(jSONObject3);
        LIZ.LJJ(jSONObject2);
        C32128CjE c32128CjE = C32129CjF.LIZ;
        LIZ.LJIJJ(c32128CjE.LJ, "gift_enter_from");
        if (!C38354F3m.LJ(BJM.LJII())) {
            LIZ.LJIJJ(BJM.LJII(), "enter_url_source");
        }
        if (BJM.LJI() != 0) {
            LIZ.LJIJJ(String.valueOf(BJM.LJI()), "enter_gift_id");
        }
        LIZ.LJIJJ(Integer.valueOf(GiftManager.inst().getTabLocation(i)), "tab_position");
        LIZ.LJIJJ(str, "tab_name");
        String str4 = "";
        KNV.LJ(c32128CjE.LJIIIIZZ, LIZ, "tab_id", "", "page_position");
        C32313CmD c32313CmD = AbstractC32320CmK.LIZ;
        if (j == c32313CmD.LJII() && c32313CmD.LJIIL()) {
            j3 = -1;
        } else {
            j3 = j;
        }
        LIZ.LJIJJ(Long.valueOf(j3), "gift_id");
        LIZ.LJIJJ(LJIIIZ(j), "is_goal_gift");
        if (findGiftById != null && findGiftById.canPutInGiftBox) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        LIZ.LJIJJ(Integer.valueOf(i5), "is_gift_box_gift");
        LIZ.LJIJJ(Integer.valueOf(z3 ? 1 : 0), "disable_send");
        LIZ.LJIJJ(CardStruct.IStatusCode.DEFAULT, "can_group_send");
        if (z) {
            obj4 = "call";
        } else {
            obj4 = "click";
        }
        LIZ.LJIJJ(obj4, "show_type");
        LIZ.LJIJJ(Integer.valueOf(i2), "gift_position");
        LIZ.LJIJJ(Long.valueOf(C30725C4b.LIZ()), "timestamp");
        if (num != null) {
            i6 = num.intValue();
        } else {
            i6 = 0;
        }
        LIZ.LJIJJ(Integer.valueOf(i6), "gift_price");
        LIZ.LJIJJ(C77283UUt.LIZ, "gift_dialog_request_id");
        if (z2) {
            obj5 = "portrait";
        } else {
            obj5 = "landscape";
        }
        LIZ.LJIJJ(obj5, "room_orientation");
        LIZ.LJIJJ(C31120CJg.LJ().getDesc(), "send_gift_scene");
        LIZ.LJIJJ(Integer.valueOf(GiftManager.inst().getGiftPosition(j)), "actual_gift_position");
        Object obj22 = "1";
        if (o.LJ(BJM.LJIIIIZZ(), "portal")) {
            obj6 = "1";
        } else {
            obj6 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(obj6, "is_portal_user");
        LIZ.LJIJJ(str2, "recommend_info");
        if (C88137YiT.LIZ.LIZ) {
            obj7 = "first_screen";
        } else {
            obj7 = "other_screen";
        }
        LIZ.LJIJJ(obj7, "is_first_screen");
        LIZ.LJIJJ(c32128CjE.LIZ, "guide_from");
        String str5 = LJIILJJIL;
        if (LJI()) {
            obj8 = "1";
        } else {
            obj8 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(obj8, str5);
        if (GiftManager.inst().isDynamicGift(j)) {
            obj9 = "1";
        } else {
            obj9 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(obj9, "dynamic_preview");
        if (c32313CmD.LJII() == j) {
            obj21 = "first_recharge_gift";
        } else {
            Gift findGiftById2 = GiftManager.inst().findGiftById(j);
            if (findGiftById2 != null && findGiftById2.isBroadcastGift) {
                obj21 = "announcements_gift";
            } else if (z5) {
                obj21 = "anchor_element_gift";
            } else if (z6) {
                obj21 = "travel_gift";
            } else if (LJIIJ) {
                obj21 = "user_level_gift";
            } else if (LJIIIIZZ) {
                obj21 = "fans_club_unlock_gift";
            } else if (LJII) {
                obj21 = "fans_club_gift";
            }
        }
        LIZ.LJIJJ(obj21, "special_gift");
        if (findGiftById != null && (giftLockInfo4 = findGiftById.giftSubInfo) != null && giftLockInfo4.mLockType == 2) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        LIZ.LJIJJ(Integer.valueOf(i7), "is_event_lock_gift");
        if (findGiftById != null && (giftLockInfo2 = findGiftById.giftSubInfo) != null && giftLockInfo2.mLockType == 2 && (giftLockInfo3 = findGiftById.giftSubInfo) != null && !giftLockInfo3.mLock) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        LIZ.LJIJJ(Integer.valueOf(i8), "is_unlock");
        if (findGiftById == null || (list = findGiftById.colorInfos) == null) {
            list = C61878OQg.INSTANCE;
        }
        if (!(!list.isEmpty())) {
            obj10 = "";
        } else {
            obj10 = "color_gift";
        }
        LIZ.LJIJJ(obj10, "gift_property");
        LIZ.LJIJJ(LJ(findGiftById), "gift_lock_type");
        LIZ.LJIJJ(l, "color_id");
        Gift findGiftById3 = GiftManager.inst().findGiftById(j);
        if (findGiftById3 != null) {
            map2 = findGiftById3.trackerParams;
        } else {
            map2 = null;
        }
        LIZ.LJJIFFI(map2);
        if (room != null && (owner = room.getOwner()) != null && owner.isSubscribed()) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        LIZ.LJIJJ(Integer.valueOf(i9), "is_subscription");
        LIZ.LJIJJ(Integer.valueOf(GiftManager.inst().isPollGift(j) ? 1 : 0), "is_effective_poll_gift");
        if (((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).zq()) {
            j4 = ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).pz();
        } else {
            j4 = 0;
        }
        LIZ.LJIJJ(Long.valueOf(j4), "poll_id");
        List list3 = (List) dataChannelGlobal.mv0(C29083BbD.class);
        if (list3 != null && list3.contains(Long.valueOf(j))) {
            obj11 = "1";
        } else {
            obj11 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(obj11, "is_wishlist_gift");
        LIZ.LJIJJ(Integer.valueOf(C77119UOl.LJIIZILJ(j, frequentlyUsedGifts)), "is_frequently_used_gift");
        if ((!frequentlyUsedGifts.isEmpty()) && frequentlyUsedGifts.size() > 1) {
            i10 = C77119UOl.LJIIZILJ(j, frequentlyUsedGifts);
        } else {
            i10 = 0;
        }
        LIZ.LJIJJ(Integer.valueOf(i10), "is_in_frequently_used_gift_area");
        LIZ.LJIJJ(Long.valueOf(C30725C4b.LIZ() - c32128CjE.LJIIIZ), "preview_duration");
        LIZ.LJIJJ(Integer.valueOf(i3), "is_force_insert_gift");
        LIZ.LJIJJ(Long.valueOf(j2), "force_insert_priority");
        LIZ.LJIJJ(obj2, "force_insert_from");
        LIZ.LJIJJ(obj, "force_insert_gift_arena_country");
        LIZ.LJIJJ(Integer.valueOf(LIZ(findGiftById) ? 1 : 0), "can_level_up");
        C29800Bmm gr = ((IUserLevelService) CN1.LIZ(IUserLevelService.class)).gr();
        if (gr != null) {
            i11 = gr.LIZ;
        } else {
            i11 = 0;
        }
        LIZ.LJIJJ(Integer.valueOf(i11), "user_level");
        C29750Bly DZ = ((IFansClubService) CN1.LIZ(IFansClubService.class)).DZ();
        if (DZ != null) {
            j5 = DZ.LIZ;
        } else {
            j5 = 0;
        }
        LIZ.LJIJJ(Long.valueOf(j5), "fans_club_level");
        LIZ.LJIJJ(Integer.valueOf(i4), "is_unlock_level");
        LIZ.LJJIFFI(c32128CjE.LJIILJJIL);
        if (LJIIJ) {
            Gift findGiftById4 = GiftManager.inst().findGiftById(j);
            if (findGiftById4 != null && (giftLockInfo = findGiftById4.giftSubInfo) != null) {
                obj20 = Integer.valueOf(giftLockInfo.giftLevel);
            } else {
                obj20 = null;
            }
            LIZ.LJIJJ(obj20, "unlock_level");
        }
        LIZ.LJIJJ(0, "is_leaderboard");
        LIZ.LJIJJ(Integer.valueOf(EnumC35440DvY.NO_IN_RANK.getValue()), "leaderboard_user_rank");
        LIZ.LJIJJ(obj3, "live_type");
        LIZ.LJIJJ(Integer.valueOf(i12), "is_new_unlock");
        User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
        o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
        LIZ.LJIJJ(C31120CJg.LJII(LJ), "user_type");
        if (C74838TYs.LJ().LJJ > 0) {
            obj12 = "1";
        } else {
            obj12 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(obj12, "is_guest_connection");
        if (o.LJ(C31120CJg.LIZIZ(), "manual_pk")) {
            if (C31120CJg.LJIIIZ()) {
                LIZ.LJIJJ("pk_phase", "match_status");
            } else {
                LIZ.LJIJJ("punish", "match_status");
            }
            LIZ.LJJIFFI(C31120CJg.LJFF());
            if (((IInteractService) CN1.LIZ(IInteractService.class)).yr() == 2) {
                obj19 = "1";
            } else {
                obj19 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ.LJIJJ(obj19, "is_multi");
        }
        LIZ.LJIJJ(Integer.valueOf(!z ? 1 : 0), "is_by_user");
        if (findGiftById != null && (imageModel = findGiftById.icon) != null && (list2 = imageModel.mUrls) != null && (str3 = (String) ORZ.LJLLLLLL(0, list2)) != null) {
            str4 = str3;
        }
        C78895Uxn.LIZIZ(LIZ, str4, "gift_icon_url", z4 ? 1 : 0, "is_gift_image_displayed");
        User user = c32128CjE.LIZJ;
        if (user != null) {
            obj13 = C31120CJg.LJII(user);
        } else {
            obj13 = null;
        }
        LIZ.LJIJJ(obj13, "to_user_type");
        User user2 = c32128CjE.LIZJ;
        if (user2 != null) {
            obj14 = Long.valueOf(user2.getId());
        } else {
            obj14 = null;
        }
        LIZ.LJIJJ(obj14, "to_user_id");
        if (c32313CmD.LJIIL()) {
            obj15 = "1";
        } else {
            obj15 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(obj15, "is_first_recharge");
        if (C32314CmE.LIZIZ() > 0) {
            obj16 = "1";
        } else {
            obj16 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(obj16, "has_coin");
        if (C32314CmE.LIZ()) {
            obj17 = "1";
        } else {
            obj17 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(obj17, "can_exchange");
        if (C31120CJg.LJIIIIZZ()) {
            obj18 = "1";
        } else {
            obj18 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(obj18, "is_match_item");
        if (!C31120CJg.LJIIJ()) {
            obj22 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(obj22, "is_match_item_user");
        LIZ.LJIJJ(Long.valueOf(C31120CJg.LIZ()), "pk_id");
        LIZ.LJJIFFI(LIZLLL());
        if (c76854UEg != null) {
            LIZ.LJIJJ(c76854UEg.LJLIL, "recharge_type");
            LIZ.LJIJJ(Integer.valueOf(c76854UEg.LJLILLLLZI), "recharge_coins");
            LIZ.LJIJJ(Long.valueOf(c76854UEg.LJLJI), "enter_price_gap");
            LIZ.LJIJJ(Long.valueOf(c76854UEg.LJLJJI), "rec_gift_id");
            LIZ.LJIJJ(Integer.valueOf(c76854UEg.LJLJJL), "rec_gift_price");
        }
        LIZ.LJJIFFI(LIZJ());
        LIZ.LJJIIJZLJL();
    }
}
