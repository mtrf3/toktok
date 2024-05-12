package X;

import com.bytedance.android.livesdk.model.GiftRandomEffectInfo;
import com.bytedance.android.livesdk.model.RandomGiftPanelBanner;
import com.bytedance.android.livesdk.model.message.GiftCollection;
import com.bytedance.android.livesdk.model.message.GiftCollectionUpdateMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CQ5 implements OnMessageListener {
    public IMessageManager LJLIL;
    public boolean LJLILLLLZI;

    public CQ5() {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        boolean z = false;
        if (room != null && C025908h.LIZ() == room.getOwnerUserId()) {
            z = true;
        }
        this.LJLILLLLZI = z;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        Long l;
        RandomGiftPanelBanner randomGiftPanelBanner;
        RandomGiftPanelBanner randomGiftPanelBanner2;
        if (iMessage != null && (iMessage instanceof GiftCollectionUpdateMessage)) {
            GiftCollectionUpdateMessage giftCollectionUpdateMessage = (GiftCollectionUpdateMessage) iMessage;
            GiftCollection giftCollection = giftCollectionUpdateMessage.giftCollection;
            if (giftCollection.messageType == 1 && this.LJLILLLLZI) {
                GiftRandomEffectInfo giftRandomEffectInfo = giftCollection.gift.randomEffectInfo;
                Long l2 = null;
                if (giftRandomEffectInfo != null && (randomGiftPanelBanner2 = giftRandomEffectInfo.randomGiftPanelBanner) != null) {
                    l = Long.valueOf(randomGiftPanelBanner2.collectNum);
                } else {
                    l = null;
                }
                GiftRandomEffectInfo giftRandomEffectInfo2 = giftCollectionUpdateMessage.giftCollection.gift.randomEffectInfo;
                if (giftRandomEffectInfo2 != null && (randomGiftPanelBanner = giftRandomEffectInfo2.randomGiftPanelBanner) != null) {
                    l2 = Long.valueOf(randomGiftPanelBanner.targetNum);
                }
                GiftCollection giftCollection2 = giftCollectionUpdateMessage.giftCollection;
                long j = giftCollection2.round;
                long j2 = giftCollection2.gift.id;
                if (l == null || l.longValue() != 1) {
                    if (o.LJ(l, l2)) {
                        BZI LIZ = C28787BRn.LIZ("travel_gift_collect_finished");
                        LIZ.LJIIZILJ();
                        LIZ.LJIJJ(Long.valueOf(j), "round");
                        LIZ.LJIJJ(C32129CjF.LIZ.LIZ, "guide_from");
                        LIZ.LJIJJ(String.valueOf(C30725C4b.LIZ()), "timestamp");
                        C30869C9p.LIZ(j2, LIZ, "gift_id");
                    }
                } else {
                    BZI LIZ2 = C28787BRn.LIZ("travel_gift_collect_start");
                    LIZ2.LJIIZILJ();
                    LIZ2.LJIJJ(Long.valueOf(j), "round");
                    LIZ2.LJIJJ(C32129CjF.LIZ.LIZ, "guide_from");
                    LIZ2.LJIJJ(String.valueOf(C30725C4b.LIZ()), "timestamp");
                    C30869C9p.LIZ(j2, LIZ2, "gift_id");
                }
                C29823Bn9.LIZIZ = l;
                C29823Bn9.LIZJ = l2;
                C29823Bn9.LIZ = Long.valueOf(j);
            }
        }
    }
}
