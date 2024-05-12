package X;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.model.Gift;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Cty, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32794Cty extends AbstractC65781Prl implements InterfaceC88471Ynr<String, Integer, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Gift LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ C32785Ctp LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ String LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32794Cty(long j, String str, Gift gift, boolean z, C32785Ctp c32785Ctp, int i, String str2) {
        super(2);
        this.LJLIL = j;
        this.LJLILLLLZI = str;
        this.LJLJI = gift;
        this.LJLJJI = z;
        this.LJLJJL = c32785Ctp;
        this.LJLJJLL = i;
        this.LJLJL = str2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(String giftType, Integer num) {
        Object obj;
        boolean z;
        String str;
        long j;
        boolean z2;
        int i;
        String str2;
        Object obj2;
        Object obj3;
        Object obj4;
        String str3;
        int intValue = num.intValue();
        o.LJIIIZ(giftType, "giftType");
        HashMap hashMap = new HashMap();
        hashMap.put("gift_type", giftType);
        hashMap.put("combo_cnt", String.valueOf(intValue));
        hashMap.put("gift_cnt", String.valueOf(intValue));
        C43881HKb.LIZJ(this.LJLIL, hashMap, "gift_id", "gift_enter_from", "convenient_icon");
        String str4 = this.LJLILLLLZI;
        if (str4 == null) {
            str4 = "";
        }
        hashMap.put("show_type", str4);
        boolean LJ = o.LJ(BJM.LJIIIIZZ(), "portal");
        String str5 = "1";
        if (LJ) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_portal_user", obj);
        if (LJ) {
            hashMap.put("portal_id", String.valueOf(BJM.LJIIL()));
        }
        Gift gift = this.LJLJI;
        if (gift != null && gift.type == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            hashMap.put("gift_value_type", "sticker_gift");
        } else {
            if (this.LJLJJI) {
                str = "animation_gift";
            } else {
                str = "non_animation_gift";
            }
            hashMap.put("gift_value_type", str);
        }
        GiftManager inst = GiftManager.inst();
        Gift gift2 = this.LJLJI;
        if (gift2 != null) {
            j = gift2.id;
        } else {
            j = 0;
        }
        Gift findGiftById = inst.findGiftById(j);
        if (findGiftById != null && findGiftById.isBroadcastGift) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            hashMap.put("special_gift", "announcements_gift");
        } else {
            Gift gift3 = this.LJLJI;
            if (gift3 != null && gift3.id == AbstractC32320CmK.LIZ.LJII()) {
                hashMap.put("special_gift", "first_recharge_gift");
            } else {
                Gift gift4 = this.LJLJI;
                if (gift4 != null && gift4.isRandomGift) {
                    hashMap.put("special_gift", "travel_gift");
                } else {
                    hashMap.put("special_gift", "");
                }
            }
        }
        hashMap.put("send_gift_scene", C31120CJg.LJ().getDesc());
        hashMap.put("request_id", BJM.LJIILIIL());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IInteractService iInteractService = C31120CJg.LIZ;
        if (!TextUtils.isEmpty(iInteractService.FZ())) {
            java.util.Map LJFF = C31120CJg.LJFF();
            if (LJFF != null) {
                linkedHashMap.putAll(LJFF);
            }
            if (TextUtils.equals("in_pk", iInteractService.FZ())) {
                linkedHashMap.put("match_status", "pk_phase");
            } else {
                linkedHashMap.put("match_status", "punish");
            }
        }
        hashMap.putAll(linkedHashMap);
        Gift gift5 = this.LJLJI;
        if (gift5 != null) {
            i = gift5.diamondCount;
        } else {
            i = -1;
        }
        C77453UaX c77453UaX = new C77453UaX(i, this.LJLIL, 8);
        ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange().getClass();
        boolean LIZLLL = C77481Uaz.LIZLLL(null, c77453UaX, null);
        ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange().getClass();
        boolean LJ2 = C77481Uaz.LJ(null, c77453UaX, null);
        if (C74838TYs.LJ().LJJ > 0) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        if (LIZLLL) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_anchor_exchange", obj2);
        if (((WalletExchange) ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange()).LJIILIIL() && LIZLLL) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_auto_anchor", obj3);
        if (LJ2) {
            obj4 = "1";
        } else {
            obj4 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_ug_exchange", obj4);
        if (!((WalletExchange) ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange()).LJIJJ() || !LJ2) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_auto_ug", str5);
        C32785Ctp c32785Ctp = this.LJLJJL;
        long j2 = this.LJLIL;
        c32785Ctp.getClass();
        hashMap.put("is_goal_gift", C32785Ctp.LJIIIZ(j2));
        BZI LIZ = C28787BRn.LIZ("convenient_gift_click");
        LIZ.LJIIZILJ();
        LIZ.LIZLLL(C28835BTj.LIZJ("user_live_duration"));
        LIZ.LJJIFFI(hashMap);
        LIZ.LJIJJ(Long.valueOf(C30725C4b.LIZ()), "timestamp");
        LIZ.LJIJJ(Integer.valueOf(this.LJLJJLL), "is_new_unlock");
        C06490Nh.LIZLLL(LIZ, C77283UUt.LIZ, "gift_dialog_request_id", str2, "is_guest_connection");
        String str6 = this.LJLJL;
        if (str6 == null) {
            str3 = "gift";
        } else {
            str3 = str6;
        }
        C32282Cli.LIZIZ("click", str3, o.LJ(str6, "welcome_pack"));
        return C76800UCe.LIZ;
    }
}
