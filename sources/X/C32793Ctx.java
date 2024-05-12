package X;

import android.os.SystemClock;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.guide.model.GuideInfoResponse;
import com.bytedance.android.livesdk.model.Gift;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ctx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32793Ctx {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    public static void LIZLLL(String str) {
        long currentTimeMillis = System.currentTimeMillis() - LIZ;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_gift_guide_show");
        LIZ2.LJIJJ(Long.valueOf(currentTimeMillis), "message_received_to_show_duration");
        LIZ2.LJIJJ(str, "notification_type");
        LIZ2.LJJIIJZLJL();
        LIZ = 0L;
    }

    public static final void LIZ(EnumC32853Cuv reason, EnumC32606Cqw showReason) {
        String str;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        o.LJIIIZ(reason, "reason");
        o.LJIIIZ(showReason, "showReason");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_gift_guide_bubble_close");
        LIZ2.LJIJJ(reason.getDesc$livegift_impl_release(), "close_reason");
        LIZ2.LJIJJ(C32650Cre.LIZJ, "notification_type");
        LIZ2.LJIJJ(C32650Cre.LIZIZ, "notification_request_id");
        LIZ2.LJIJJ(showReason.getDesc(), "show_reason");
        if (C32257ClJ.LJFF() == 1) {
            str = "anchor";
        } else {
            str = "user";
        }
        LIZ2.LJIJJ(str, "user_type");
        GuideInfoResponse.UserStats userStats = C32696CsO.LJ;
        Long l5 = null;
        if (userStats != null) {
            l = Long.valueOf(userStats.giftPanelShowCnt);
        } else {
            l = null;
        }
        LIZ2.LJIJJ(l, "gift_panel_show_cnt");
        GuideInfoResponse.UserStats userStats2 = C32696CsO.LJ;
        if (userStats2 != null) {
            l2 = Long.valueOf(userStats2.shortcutGiftClickCnt);
        } else {
            l2 = null;
        }
        LIZ2.LJIJJ(l2, "convenient_gift_click_cnt");
        GuideInfoResponse.UserStats userStats3 = C32696CsO.LJ;
        if (userStats3 != null) {
            l3 = Long.valueOf(userStats3.giftGuidePopupShowCnt);
        } else {
            l3 = null;
        }
        LIZ2.LJIJJ(l3, "gift_guide_popup_show_cnt");
        GuideInfoResponse.UserStats userStats4 = C32696CsO.LJ;
        if (userStats4 != null) {
            l4 = Long.valueOf(userStats4.likeCnt);
        } else {
            l4 = null;
        }
        LIZ2.LJIJJ(l4, "like_cnt");
        GuideInfoResponse.UserStats userStats5 = C32696CsO.LJ;
        if (userStats5 != null) {
            l5 = Long.valueOf(userStats5.watchDuration);
        }
        LIZ2.LJIJJ(l5, "watch_duration");
        C1FL.LJI(LIZ2, C32696CsO.LJFF, "trigger_rule");
    }

    public static final void LIZIZ(Long l, EnumC32606Cqw reason, int i) {
        String str;
        o.LJIIIZ(reason, "reason");
        long uptimeMillis = SystemClock.uptimeMillis() - BJI.LIZIZ;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_gift_guide_bubble_show");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(C32650Cre.LIZJ, "notification_type");
        LIZ2.LJIJJ(C32650Cre.LIZIZ, "notification_request_id");
        LIZ2.LJIJJ(l, "gift_id");
        LIZ2.LJIJJ(reason.getDesc(), "show_reason");
        LIZ2.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
        if (C32257ClJ.LJFF() == 1) {
            str = "anchor";
        } else {
            str = "user";
        }
        LIZ2.LJIJJ(str, "user_type");
        LIZ2.LJIJJ(Long.valueOf(uptimeMillis), "message_received_to_show_duration");
        if (o.LJ(reason.getDesc(), "user_level_up")) {
            LIZ2.LJIJJ(Integer.valueOf(i), "user_level");
        }
        LIZ2.LJJIIJZLJL();
        LIZLLL(C32650Cre.LIZJ);
    }

    public static final void LIZJ(int i, String giftEnterFrom, long j, String notificationType, String str, boolean z) {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        o.LJIIIZ(giftEnterFrom, "giftEnterFrom");
        o.LJIIIZ(notificationType, "notificationType");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_gift_guide_popup_send_click");
        C07250Qf.LIZJ(j, LIZ2, "gift_id", notificationType, "notification_type");
        C78895Uxn.LIZIZ(LIZ2, C32650Cre.LIZIZ, "notification_request_id", z ? 1 : 0, "has_gift_sent_before");
        LIZ2.LJIJJ(str, "trigger_keyword");
        GuideInfoResponse.UserStats userStats = C32696CsO.LJ;
        if (userStats != null) {
            l = Long.valueOf(userStats.giftPanelShowCnt);
        } else {
            l = null;
        }
        LIZ2.LJIJJ(l, "gift_panel_show_cnt");
        GuideInfoResponse.UserStats userStats2 = C32696CsO.LJ;
        if (userStats2 != null) {
            l2 = Long.valueOf(userStats2.shortcutGiftClickCnt);
        } else {
            l2 = null;
        }
        LIZ2.LJIJJ(l2, "convenient_gift_click_cnt");
        GuideInfoResponse.UserStats userStats3 = C32696CsO.LJ;
        if (userStats3 != null) {
            l3 = Long.valueOf(userStats3.giftGuidePopupShowCnt);
        } else {
            l3 = null;
        }
        LIZ2.LJIJJ(l3, "gift_guide_popup_show_cnt");
        GuideInfoResponse.UserStats userStats4 = C32696CsO.LJ;
        if (userStats4 != null) {
            l4 = Long.valueOf(userStats4.likeCnt);
        } else {
            l4 = null;
        }
        LIZ2.LJIJJ(l4, "like_cnt");
        GuideInfoResponse.UserStats userStats5 = C32696CsO.LJ;
        if (userStats5 != null) {
            l5 = Long.valueOf(userStats5.watchDuration);
        } else {
            l5 = null;
        }
        LIZ2.LJIJJ(l5, "watch_duration");
        LIZ2.LJIJJ(C32696CsO.LJFF, "trigger_rule");
        String str2 = "1";
        if (C32314CmE.LIZIZ() > 0) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJIJJ(obj, "has_coin");
        LIZ2.LJIIZILJ();
        LIZ2.LJJIIJZLJL();
        C77453UaX c77453UaX = new C77453UaX(i, j, 8);
        ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange().getClass();
        boolean LIZLLL = C77481Uaz.LIZLLL(null, c77453UaX, null);
        ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange().getClass();
        boolean LJ = C77481Uaz.LJ(null, c77453UaX, null);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        C32455CoV.LJII(jSONObject, jSONObject3);
        Gift findGiftById = GiftManager.inst().findGiftById(j);
        if (findGiftById != null) {
            C32455CoV.LIZJ(findGiftById, null, 0L, jSONObject, jSONObject3);
        }
        C32455CoV.LJIJ(jSONObject, jSONObject2, j);
        BZI LIZ3 = C28787BRn.LIZ("livesdk_gift_send_click");
        LIZ3.LJIIZILJ();
        LIZ3.LJJ(jSONObject);
        LIZ3.LJJ(jSONObject3);
        LIZ3.LJJ(jSONObject2);
        if (!C38354F3m.LJ(BJM.LJII())) {
            LIZ3.LJIJJ(BJM.LJII(), "enter_url_source");
        }
        if (BJM.LJI() != 0) {
            LIZ3.LJIJJ(String.valueOf(BJM.LJI()), "enter_gift_id");
        }
        C07250Qf.LIZJ(j, LIZ3, "gift_id", "", "page_position");
        LIZ3.LJIJJ(notificationType, "notification_type");
        C78895Uxn.LIZIZ(LIZ3, C32650Cre.LIZIZ, "notification_request_id", z ? 1 : 0, "has_gift_sent_before");
        LIZ3.LJIJJ(giftEnterFrom, "gift_enter_from");
        if (LIZLLL) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ3.LJIJJ(obj2, "is_anchor_exchange");
        if (((WalletExchange) ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange()).LJIILIIL() && LIZLLL) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ3.LJIJJ(obj3, "is_auto_anchor");
        if (LJ) {
            obj4 = "1";
        } else {
            obj4 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ3.LJIJJ(obj4, "is_ug_exchange");
        if (((WalletExchange) ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange()).LJIJJ() && LJ) {
            obj5 = "1";
        } else {
            obj5 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ3.LJIJJ(obj5, "is_auto_ug");
        if (C74838TYs.LJ().LJJ > 0) {
            obj6 = "1";
        } else {
            obj6 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ3.LJIJJ(obj6, "is_guest_connection");
        if (C31120CJg.LJIIIIZZ()) {
            obj7 = "1";
        } else {
            obj7 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ3.LJIJJ(obj7, "is_match_item");
        if (C31120CJg.LJIIJ()) {
            obj8 = "1";
        } else {
            obj8 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ3.LJIJJ(obj8, "is_match_item_user");
        if (AbstractC32320CmK.LIZ.LJIIL()) {
            obj9 = "1";
        } else {
            obj9 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ3.LJIJJ(obj9, "is_first_recharge");
        if (C32314CmE.LIZIZ() > 0) {
            obj10 = "1";
        } else {
            obj10 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ3.LJIJJ(obj10, "has_coin");
        if (C32314CmE.LIZ()) {
            obj11 = "1";
        } else {
            obj11 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ3.LJIJJ(obj11, "can_exchange");
        LIZ3.LJIJJ(str, "trigger_keyword");
        if (o.LJ(C31120CJg.LIZIZ(), "manual_pk")) {
            if (C31120CJg.LJIIIZ()) {
                LIZ3.LJIJJ("pk_phase", "match_status");
            } else {
                LIZ3.LJIJJ("punish", "match_status");
            }
            LIZ3.LJJIFFI(C31120CJg.LJFF());
            LIZ3.LJIJJ(Long.valueOf(C31120CJg.LIZ()), "pk_id");
            if (((IInteractService) CN1.LIZ(IInteractService.class)).yr() != 2) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ3.LJIJJ(str2, "is_multi");
        }
        LIZ3.LJJIIJZLJL();
    }
}
