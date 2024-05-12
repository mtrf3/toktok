package X;

import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.model.ExchangeDisplayInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.UaS, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77448UaS {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(int i, String str, String giftSource) {
        o.LJIIIZ(giftSource, "giftSource");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_auto_balance_exchange_show");
        C78895Uxn.LIZIZ(LIZ2, str, "charge_reason", i, "popup_type");
        LIZ2.LJIJJ(giftSource, "gift_enter_from");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZ(int i, String str, String giftSource, boolean z) {
        String str2;
        o.LJIIIZ(giftSource, "giftSource");
        if (z) {
            str2 = "turn_on";
        } else {
            str2 = "cancel";
        }
        BZI LIZIZ = C0JU.LIZIZ("livesdk_auto_balance_exchange_click", str2, "click", str, "charge_reason");
        LIZIZ.LJIJJ(Integer.valueOf(i), "popup_type");
        LIZIZ.LJIJJ(giftSource, "gift_enter_from");
        LIZIZ.LJJIIJZLJL();
    }

    public static void LJI(String from, String str, String giftSource, boolean z) {
        String str2;
        o.LJIIIZ(from, "from");
        o.LJIIIZ(giftSource, "giftSource");
        if (z) {
            str2 = "open";
        } else {
            str2 = "close";
        }
        C06490Nh.LIZLLL(C0JU.LIZIZ("livesdk_auto_balance_exchange_setting", str2, "status", from, "request_from"), str, "charge_reason", giftSource, "gift_enter_from");
    }

    public static void LJFF(int i, long j, DataChannel dataChannel, String giftSource, boolean z) {
        String str;
        String str2;
        o.LJIIIZ(giftSource, "giftSource");
        if (i == 1) {
            str = "ug_exchange";
        } else {
            str = "anchor_income";
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_balance_exchange_success");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(Long.valueOf(j), "gift_id");
        LIZ2.LJIJJ(str, "enter_from");
        LIZ2.LJIJJ(giftSource, "gift_enter_from");
        LIZ2.LJIJJ(Integer.valueOf(z ? 1 : 0), "is_auto");
        if (C29306Beo.LJIIJ(dataChannel)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJIJJ(Long.valueOf(((C29374Bfu) TTL.LIZJ(LIZ2, str2, "is_anchor")).getCurrentUserId()), "user_id");
        LIZ2.LJJIIJZLJL();
    }

    public static void LJ(DataChannel dataChannel, long j, String str, String str2, String giftSource, int i, int i2, int i3) {
        String str3;
        o.LJIIIZ(giftSource, "giftSource");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_balance_exchange_window_show");
        LIZ2.LJIILLIIL(dataChannel);
        if (C29306Beo.LJIIJ(dataChannel)) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJIJJ(Long.valueOf(((C29374Bfu) TTL.LIZJ(LIZ2, str3, "is_anchor")).getCurrentUserId()), "user_id");
        LIZ2.LJIJJ(Integer.valueOf(i), "popup_type");
        LIZ2.LJIJJ(Integer.valueOf(i2), "has_auto_check_box");
        LIZ2.LJIJJ(Integer.valueOf(i3), "if_confirm_auto_popup");
        LIZ2.LJIJJ(Long.valueOf(j), "gift_id");
        LIZ2.LJIJJ(str2, "enter_from");
        C06490Nh.LIZLLL(LIZ2, str, "show_reason", giftSource, "gift_enter_from");
    }

    public static void LIZLLL(DataChannel dataChannel, long j, String str, String str2, String giftSource, int i, int i2, int i3, int i4) {
        String str3;
        o.LJIIIZ(giftSource, "giftSource");
        ExchangeDisplayInfo exchangeDisplayInfo = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLJI;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_balance_exchange_confirm");
        LIZ2.LJIILLIIL(dataChannel);
        if (C29306Beo.LJIIJ(dataChannel)) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJIJJ(Long.valueOf(((C29374Bfu) TTL.LIZJ(LIZ2, str3, "is_anchor")).getCurrentUserId()), "user_id");
        LIZ2.LJIJJ(Integer.valueOf(i), "popup_type");
        LIZ2.LJIJJ(Integer.valueOf(i2), "has_auto_check_box");
        LIZ2.LJIJJ(Integer.valueOf(i4), "if_check_auto");
        LIZ2.LJIJJ(Integer.valueOf(i3), "if_confirm_auto_popup");
        LIZ2.LJIJJ(Long.valueOf(j), "gift_id");
        LIZ2.LJIJJ(str, "request_from");
        LIZ2.LJIJJ(str2, "enter_from");
        LIZ2.LJIJJ(giftSource, "gift_enter_from");
        LIZ2.LJIJJ(Integer.valueOf(!exchangeDisplayInfo.isFirstExchange ? 1 : 0), "is_exchange_before");
        LIZ2.LJIJJ(Integer.valueOf(exchangeDisplayInfo.LIZ() ? 1 : 0), "is_tax_info_finished");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZJ(DataChannel dataChannel, long j, String str, String str2, String giftSource, int i, int i2, int i3, int i4, String str3) {
        String str4;
        o.LJIIIZ(giftSource, "giftSource");
        ExchangeDisplayInfo exchangeDisplayInfo = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLJI;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_balance_exchange_cancel");
        LIZ2.LJIILLIIL(dataChannel);
        if (C29306Beo.LJIIJ(dataChannel)) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJIJJ(Long.valueOf(((C29374Bfu) TTL.LIZJ(LIZ2, str4, "is_anchor")).getCurrentUserId()), "user_id");
        LIZ2.LJIJJ(Integer.valueOf(i), "popup_type");
        LIZ2.LJIJJ(Integer.valueOf(i2), "has_auto_check_box");
        LIZ2.LJIJJ(Integer.valueOf(i4), "if_check_auto");
        LIZ2.LJIJJ(Integer.valueOf(i3), "if_confirm_auto_popup");
        LIZ2.LJIJJ(Long.valueOf(j), "gift_id");
        LIZ2.LJIJJ(str, "request_from");
        LIZ2.LJIJJ(str2, "enter_from");
        LIZ2.LJIJJ(giftSource, "gift_enter_from");
        LIZ2.LJIJJ(str3, "exit_click_position");
        LIZ2.LJIJJ(Integer.valueOf(!exchangeDisplayInfo.isFirstExchange ? 1 : 0), "is_exchange_before");
        LIZ2.LJIJJ(Integer.valueOf(exchangeDisplayInfo.LIZ() ? 1 : 0), "is_tax_info_finished");
        LIZ2.LJJIIJZLJL();
    }
}
