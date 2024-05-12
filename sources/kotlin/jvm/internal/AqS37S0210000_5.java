package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C29401Dk;
import X.C32650Cre;
import X.C32793Ctx;
import X.C32796Cu0;
import X.C32801Cu5;
import X.C32805Cu9;
import X.C32822CuQ;
import X.C32841Cuj;
import X.C32844Cum;
import X.C73026SlK;
import X.C76800UCe;
import X.C76825UDd;
import X.CN1;
import X.EnumC32737Ct3;
import X.EnumC76826UDe;
import X.EnumC76934UHi;
import X.InterfaceC65784Pro;
import X.U5H;
import X.XKX;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.wallet.IWalletExchange;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.guide.LiveGiftGuideWidgetV2;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftSenderRefactorV1Setting;
import com.bytedance.android.livesdk.livesetting.gift.LiveRechargeGiftGuideSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.BannerInRoomCollection;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes6.dex */
public class AqS37S0210000_5 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS37S0210000_5 aqS37S0210000_5) {
        TopRightBannerWidget topRightBannerWidget = (TopRightBannerWidget) aqS37S0210000_5.l0;
        String str = ((BannerInRoomCollection.BannerInfo) aqS37S0210000_5.l1).url;
        o.LJIIIIZZ(str, "bannerInfo.url");
        topRightBannerWidget.LJZI(str, aqS37S0210000_5.z2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS37S0210000_5 aqS37S0210000_5) {
        Room room;
        String str;
        boolean z;
        C32822CuQ c32822CuQ;
        User owner;
        User owner2;
        C32822CuQ LIZ;
        int i;
        if (C76825UDd.LIZ((GiftGuideMessage) aqS37S0210000_5.l0)) {
            long j = ((GiftGuideMessage) aqS37S0210000_5.l0).giftId;
            Gift findGiftById = GiftManager.inst().findGiftById(((GiftGuideMessage) aqS37S0210000_5.l0).giftId);
            if (findGiftById != null) {
                i = findGiftById.diamondCount;
            } else {
                i = 0;
            }
            GiftGuideMessage giftGuideMessage = (GiftGuideMessage) aqS37S0210000_5.l0;
            C32793Ctx.LIZJ(i, giftGuideMessage.guideType, j, C32650Cre.LIZJ, null, giftGuideMessage.hasSent);
        } else {
            LiveGiftGuideWidgetV2 liveGiftGuideWidgetV2 = (LiveGiftGuideWidgetV2) aqS37S0210000_5.l1;
            GiftGuideMessage giftGuideMessage2 = (GiftGuideMessage) aqS37S0210000_5.l0;
            boolean z2 = aqS37S0210000_5.z2;
            liveGiftGuideWidgetV2.getClass();
            Gift findGiftById2 = GiftManager.inst().findGiftById(giftGuideMessage2.giftId);
            if (findGiftById2 != null) {
                DataChannel dataChannel = liveGiftGuideWidgetV2.dataChannel;
                if (dataChannel != null) {
                    room = (Room) dataChannel.kv0(RoomChannel.class);
                } else {
                    room = null;
                }
                if (C76825UDd.LIZIZ(giftGuideMessage2)) {
                    str = EnumC76826UDe.GIFT_GUIDE_POPUP_NEW_GIFTER.getValue();
                } else if (z2) {
                    str = EnumC76826UDe.GIFT_GUIDE_POPUP_RECHARGE.getValue();
                } else {
                    str = giftGuideMessage2.guideType;
                }
                if (LiveGiftSenderRefactorV1Setting.INSTANCE.enable()) {
                    if (room != null && (owner2 = room.getOwner()) != null && (LIZ = U5H.LIZ(owner2)) != null) {
                        XKX.LIZLLL(liveGiftGuideWidgetV2.LJLJL, null, null, new C32844Cum(findGiftById2, room, LIZ, str, liveGiftGuideWidgetV2, giftGuideMessage2, null), 3);
                    }
                } else {
                    C32805Cu9 c32805Cu9 = new C32805Cu9(giftGuideMessage2.giftId, 1, C76825UDd.LIZJ(findGiftById2), room, 0, new C73026SlK(EnumC32737Ct3.GIFT_GUIDE, EnumC76934UHi.ANCHOR));
                    if (findGiftById2.type != 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c32805Cu9.LJIILL = z;
                    c32805Cu9.LJIJI = "click";
                    c32805Cu9.LJIJJLI = findGiftById2.isBroadcastGift;
                    c32805Cu9.LJIIIZ = findGiftById2.diamondCount;
                    c32805Cu9.LJIJJ = CardStruct.IStatusCode.DEFAULT;
                    if (room != null && (owner = room.getOwner()) != null) {
                        c32822CuQ = U5H.LIZ(owner);
                    } else {
                        c32822CuQ = null;
                    }
                    c32805Cu9.LJIILIIL = c32822CuQ;
                    c32805Cu9.LJIILJJIL = str;
                    c32805Cu9.LJIL = findGiftById2.isEffectBEFView;
                    c32805Cu9.LJJIIJ = giftGuideMessage2.hasSent;
                    if (LiveRechargeGiftGuideSetting.INSTANCE.getValue()) {
                        c32805Cu9.LJJJ = new C32841Cuj(liveGiftGuideWidgetV2);
                    }
                    C32796Cu0.LIZIZ(liveGiftGuideWidgetV2.dataChannel, c32805Cu9);
                }
                C32793Ctx.LIZJ(findGiftById2.diamondCount, str, giftGuideMessage2.giftId, C32650Cre.LIZJ, null, giftGuideMessage2.hasSent);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS37S0210000_5 aqS37S0210000_5) {
        IWalletExchange walletExchange = ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange();
        WalletExchange walletExchange2 = (WalletExchange) walletExchange;
        walletExchange2.LJJIFFI(((C32801Cu5) aqS37S0210000_5.l0).LJFF(), 11, !aqS37S0210000_5.z2 ? 1 : 0, ((C29401Dk) ((Throwable) aqS37S0210000_5.l1)).getPrompt());
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS37S0210000_5(C32801Cu5 c32801Cu5, Throwable th, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c32801Cu5;
        this.l1 = th;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS37S0210000_5(TopRightBannerWidget topRightBannerWidget, BannerInRoomCollection.BannerInfo bannerInfo, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = topRightBannerWidget;
        this.l1 = bannerInfo;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS37S0210000_5(GiftGuideMessage giftGuideMessage, LiveGiftGuideWidgetV2 liveGiftGuideWidgetV2, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = giftGuideMessage;
        this.l1 = liveGiftGuideWidgetV2;
        this.z2 = z;
    }
}
