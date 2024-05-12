package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftLockInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ctv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32791Ctv extends AbstractC65781Prl implements InterfaceC88471Ynr<String, Integer, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ Gift LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ boolean LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ C32785Ctp LJLJLLL;
    public final /* synthetic */ String LJLL;
    public final /* synthetic */ Integer LJLLI;
    public final /* synthetic */ Room LJLLILLLL;
    public final /* synthetic */ int LJLLJ;
    public final /* synthetic */ long LJLLL;
    public final /* synthetic */ int LJLLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32791Ctv(boolean z, long j, String str, String str2, Gift gift, boolean z2, boolean z3, boolean z4, C32785Ctp c32785Ctp, String str3, Integer num, Room room, int i, long j2, int i2) {
        super(2);
        this.LJLIL = z;
        this.LJLILLLLZI = j;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = gift;
        this.LJLJJLL = z2;
        this.LJLJL = z3;
        this.LJLJLJ = z4;
        this.LJLJLLL = c32785Ctp;
        this.LJLL = str3;
        this.LJLLI = num;
        this.LJLLILLLL = room;
        this.LJLLJ = i;
        this.LJLLL = j2;
        this.LJLLLL = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(String sendType, Integer num) {
        Object obj;
        Object obj2;
        long j;
        boolean z;
        int i;
        String str;
        int i2;
        String str2;
        long j2;
        int i3;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Integer num2;
        String str3;
        int i4;
        Object obj7;
        int i5;
        java.util.Map<String, String> map;
        Object obj8;
        int i6;
        String str4;
        Object obj9;
        Object obj10;
        String str5;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Integer num3;
        GiftLockInfo giftLockInfo;
        User owner;
        GiftLockInfo giftLockInfo2;
        LiveMode streamType;
        int intValue = num.intValue();
        o.LJIIIZ(sendType, "sendType");
        HashMap hashMap = new HashMap();
        hashMap.put("gift_type", sendType);
        String str6 = "animation_gift";
        if (this.LJLIL) {
            obj = "animation_gift";
        } else {
            obj = "non_animation_gift";
        }
        hashMap.put("gift_value_type", obj);
        hashMap.put("combo_cnt", String.valueOf(intValue));
        hashMap.put("gift_cnt", String.valueOf(intValue));
        hashMap.put("gift_id", String.valueOf(this.LJLILLLLZI));
        String str7 = "wishlist";
        String str8 = "";
        if (!o.LJ("wishlist", this.LJLJI)) {
            if (C38354F3m.LJ(this.LJLJI)) {
                str7 = "icon";
            } else {
                str7 = this.LJLJI;
                if (str7 == null) {
                    str7 = "";
                }
            }
        }
        hashMap.put("gift_enter_from", str7);
        hashMap.put("send_gift_scene", C31120CJg.LJ().getDesc());
        String str9 = this.LJLJJI;
        if (str9 == null) {
            str9 = "";
        }
        hashMap.put("show_type", str9);
        Gift gift = this.LJLJJL;
        if (gift != null && gift.type == 4) {
            hashMap.put("gift_value_type", "sticker_gift");
        } else {
            if (!this.LJLIL) {
                str6 = "non_animation_gift";
            }
            hashMap.put("gift_value_type", str6);
        }
        boolean LJ = o.LJ(BJM.LJIIIIZZ(), "portal");
        String str10 = "1";
        if (LJ) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_portal_user", obj2);
        if (LJ) {
            hashMap.put("portal_id", String.valueOf(BJM.LJIIL()));
        }
        GiftManager inst = GiftManager.inst();
        Gift gift2 = this.LJLJJL;
        if (gift2 != null) {
            j = gift2.id;
        } else {
            j = 0;
        }
        Gift findGiftById = inst.findGiftById(j);
        if (findGiftById != null && findGiftById.isBroadcastGift) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            hashMap.put("special_gift", "announcements_gift");
        } else {
            Gift gift3 = this.LJLJJL;
            if (gift3 != null && gift3.id == AbstractC32320CmK.LIZ.LJII()) {
                hashMap.put("special_gift", "first_recharge_gift");
            } else {
                Gift gift4 = this.LJLJJL;
                if (gift4 != null && gift4.isEffectBEFView) {
                    hashMap.put("special_gift", "anchor_element_gift");
                } else if (this.LJLJJLL) {
                    hashMap.put("special_gift", "user_level_gift");
                } else if (this.LJLJL) {
                    hashMap.put("special_gift", "fans_club_unlock_gift");
                } else if (this.LJLJLJ) {
                    hashMap.put("special_gift", "fans_club_gift");
                } else {
                    hashMap.put("special_gift", "");
                }
            }
        }
        C32785Ctp c32785Ctp = this.LJLJLLL;
        long j3 = this.LJLILLLLZI;
        List<? extends Gift> list = c32785Ctp.LIZLLL;
        if (list != null) {
            Iterator<? extends Gift> it = list.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                i7++;
                if (it.next().id == j3) {
                    i = i7 % 8;
                    break;
                }
            }
        }
        i = 0;
        hashMap.put("gift_position", String.valueOf(i));
        GiftManager inst2 = GiftManager.inst();
        C32128CjE c32128CjE = C32129CjF.LIZ;
        hashMap.put("tab_position", String.valueOf(inst2.getTabLocation(c32128CjE.LJIIIIZZ)));
        hashMap.put("page_position", String.valueOf(this.LJLJLLL.LIZJ));
        if (C88137YiT.LIZ.LIZ) {
            str = "first_screen";
        } else {
            str = "other_screen";
        }
        hashMap.put("is_first_screen", str);
        hashMap.put("actual_gift_position", String.valueOf(GiftManager.inst().getGiftPosition(this.LJLILLLLZI)));
        this.LJLJLLL.LJII = C30725C4b.LIZ();
        C32830CuY c32830CuY = this.LJLJLLL.LJIIJ.get(Long.valueOf(this.LJLILLLLZI));
        String str11 = "null";
        if (c32830CuY != null) {
            j2 = c32830CuY.LIZIZ;
            str2 = c32830CuY.LIZJ;
            String str12 = c32830CuY.LJFF;
            if (str12 != null) {
                str11 = str12;
            }
            i2 = 1;
        } else {
            i2 = 0;
            str2 = "null";
            j2 = -1;
        }
        Gift gift5 = this.LJLJJL;
        if (gift5 != null) {
            i3 = gift5.diamondCount;
        } else {
            i3 = -1;
        }
        C77453UaX c77453UaX = new C77453UaX(i3, this.LJLILLLLZI, 8);
        ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange().getClass();
        String str13 = null;
        boolean LIZLLL = C77481Uaz.LIZLLL(null, c77453UaX, null);
        ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange().getClass();
        boolean LJ2 = C77481Uaz.LJ(null, c77453UaX, null);
        if (LIZLLL) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_anchor_exchange", obj3);
        if (((WalletExchange) ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange()).LJIILIIL() && LIZLLL) {
            obj4 = "1";
        } else {
            obj4 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_auto_anchor", obj4);
        if (LJ2) {
            obj5 = "1";
        } else {
            obj5 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_ug_exchange", obj5);
        if (((WalletExchange) ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange()).LJIJJ() && LJ2) {
            obj6 = "1";
        } else {
            obj6 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_auto_ug", obj6);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.mv0(C29054Bak.class);
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room != null && (streamType = room.getStreamType()) != null) {
            str13 = C28509BGv.LIZ(streamType);
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        C32455CoV.LJII(jSONObject, jSONObject3);
        Gift gift6 = this.LJLJJL;
        if (gift6 != null) {
            num2 = null;
            C32455CoV.LIZJ(gift6, null, 0L, jSONObject, jSONObject3);
        } else {
            num2 = null;
        }
        C32455CoV.LJIJ(jSONObject, jSONObject2, this.LJLILLLLZI);
        BZI LIZ = C28787BRn.LIZ("livesdk_gift_send_click");
        LIZ.LJJ(jSONObject);
        LIZ.LJJ(jSONObject3);
        LIZ.LJJ(jSONObject2);
        LIZ.LJIJJ(this.LJLL, "tab_name");
        if (!C38354F3m.LJ(BJM.LJII())) {
            LIZ.LJIJJ(BJM.LJII(), "enter_url_source");
        }
        if (BJM.LJI() != 0) {
            LIZ.LJIJJ(String.valueOf(BJM.LJI()), "enter_gift_id");
        }
        if (!ujb.o.LJJJJIZL(this.LJLJI, "gift_guide_bubble", false)) {
            str3 = "";
        } else {
            str3 = this.LJLJI;
        }
        LIZ.LJIJJ(str3, "notification_type");
        if (ujb.o.LJJJJIZL(this.LJLJI, "gift_guide_bubble", false)) {
            str8 = C32650Cre.LIZIZ;
        }
        LIZ.LJIJJ(str8, "notification_request_id");
        LIZ.LJIJJ(Long.valueOf(this.LJLJLLL.LJII), "timestamp");
        Gift gift7 = this.LJLJJL;
        if (gift7 != null) {
            num2 = Integer.valueOf(gift7.diamondCount);
        }
        LIZ.LJIJJ(num2, "gift_price");
        I9A.LIZ(C30725C4b.LIZ(), c32128CjE.LJIIIZ, LIZ, "from_panel_show_duration");
        Gift gift8 = this.LJLJJL;
        if (gift8 != null) {
            i4 = gift8.diamondCount;
        } else {
            i4 = 0;
        }
        LIZ.LJIJJ(Integer.valueOf(intValue * i4), "consume_amount");
        if (GiftManager.inst().isDynamicGift(this.LJLILLLLZI)) {
            obj7 = "1";
        } else {
            obj7 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(obj7, "dynamic_preview");
        LIZ.LJJIFFI(hashMap);
        Gift gift9 = this.LJLJJL;
        if (gift9 != null && (giftLockInfo2 = gift9.giftSubInfo) != null && giftLockInfo2.mLockType == 2) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        LIZ.LJIJJ(Integer.valueOf(i5), "is_event_lock_gift");
        Gift findGiftById2 = GiftManager.inst().findGiftById(this.LJLILLLLZI);
        if (findGiftById2 != null) {
            map = findGiftById2.trackerParams;
        } else {
            map = null;
        }
        LIZ.LJJIFFI(map);
        LIZ.LJIJJ(this.LJLLI, "tab_id");
        LIZ.LJIJJ(C77283UUt.LIZ, "gift_dialog_request_id");
        String str14 = C32785Ctp.LJIILJJIL;
        this.LJLJLLL.getClass();
        if (C32785Ctp.LJI()) {
            obj8 = "1";
        } else {
            obj8 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(obj8, str14);
        C32785Ctp c32785Ctp2 = this.LJLJLLL;
        Gift gift10 = this.LJLJJL;
        c32785Ctp2.getClass();
        LIZ.LJIJJ(C32785Ctp.LJ(gift10), "gift_lock_type");
        Room room2 = this.LJLLILLLL;
        if (room2 != null && (owner = room2.getOwner()) != null && owner.isSubscribed()) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        LIZ.LJIJJ(Integer.valueOf(i6), "is_subscription");
        Gift gift11 = this.LJLJJL;
        if (gift11 != null) {
            str4 = gift11.recommendInfo;
        } else {
            str4 = null;
        }
        LIZ.LJIJJ(str4, "recommend_info");
        if (GiftManager.inst().isPollGift(this.LJLILLLLZI)) {
            obj9 = "1";
        } else {
            obj9 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(obj9, "is_effective_poll_gift");
        LIZ.LJIJJ(Long.valueOf(((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).pz()), "poll_id");
        List list2 = (List) dataChannelGlobal.mv0(C29083BbD.class);
        if (list2 != null && list2.contains(Long.valueOf(this.LJLILLLLZI))) {
            obj10 = "1";
        } else {
            obj10 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(obj10, "is_wishlist_gift");
        if (C15380j0.LJIILLIIL()) {
            str5 = "portrait";
        } else {
            str5 = "landscape";
        }
        C78895Uxn.LIZIZ(LIZ, str5, "room_orientation", i2, "is_force_insert_gift");
        C07250Qf.LIZJ(j2, LIZ, "force_insert_priority", str2, "force_insert_from");
        LIZ.LJIJJ(str11, "force_insert_gift_arena_country");
        LIZ.LJIJJ(Integer.valueOf(this.LJLLJ), "user_level");
        LIZ.LJIJJ(Long.valueOf(this.LJLLL), "fans_club_level");
        LIZ.LJJIFFI(c32128CjE.LJIILJJIL);
        LIZ.LIZLLL(C28835BTj.LIZJ("user_live_duration"));
        LIZ.LJIIZILJ();
        boolean z2 = this.LJLJJLL;
        Gift gift12 = this.LJLJJL;
        if (z2) {
            if (gift12 != null && (giftLockInfo = gift12.giftSubInfo) != null) {
                num3 = Integer.valueOf(giftLockInfo.giftLevel);
            } else {
                num3 = null;
            }
            LIZ.LJIJJ(num3, "unlock_level");
        }
        LIZ.LJIJJ(0, "is_leaderboard");
        LIZ.LJIJJ(Integer.valueOf(EnumC35440DvY.NO_IN_RANK.getValue()), "leaderboard_user_rank");
        LIZ.LJIJJ(str13, "live_type");
        LIZ.LJIJJ(Integer.valueOf(this.LJLLLL), "is_new_unlock");
        if (C74838TYs.LJ().LJJ > 0) {
            obj11 = "1";
        } else {
            obj11 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(obj11, "is_guest_connection");
        if (AbstractC32320CmK.LIZ.LJIIL()) {
            obj12 = "1";
        } else {
            obj12 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(obj12, "is_first_recharge");
        if (C32314CmE.LIZIZ() > 0) {
            obj13 = "1";
        } else {
            obj13 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(obj13, "has_coin");
        if (C32314CmE.LIZ()) {
            obj14 = "1";
        } else {
            obj14 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(obj14, "can_exchange");
        if (C31120CJg.LJIIIIZZ()) {
            obj15 = "1";
        } else {
            obj15 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(obj15, "is_match_item");
        if (C31120CJg.LJIIJ()) {
            obj16 = "1";
        } else {
            obj16 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(obj16, "is_match_item_user");
        this.LJLJLLL.getClass();
        LIZ.LJJIFFI(C32785Ctp.LIZLLL());
        if (o.LJ(C31120CJg.LIZIZ(), "manual_pk")) {
            if (C31120CJg.LJIIIZ()) {
                LIZ.LJIJJ("pk_phase", "match_status");
            } else {
                LIZ.LJIJJ("punish", "match_status");
            }
            LIZ.LJJIFFI(C31120CJg.LJFF());
            LIZ.LJIJJ(Long.valueOf(C31120CJg.LIZ()), "pk_id");
            if (((IInteractService) CN1.LIZ(IInteractService.class)).yr() != 2) {
                str10 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ.LJIJJ(str10, "is_multi");
        }
        LIZ.LJJIIJZLJL();
        return C76800UCe.LIZ;
    }
}
