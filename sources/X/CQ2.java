package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftUserConsumeLayerSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveRandomGiftCapsuleGovernanceSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftCollectionUpdateMessage;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CQ2 implements InterfaceC31330CRi<GiftCollectionUpdateMessage> {
    @Override // X.InterfaceC31330CRi
    public final boolean LIZ(GiftCollectionUpdateMessage giftCollectionUpdateMessage, CQQ context) {
        boolean z;
        GiftCollectionUpdateMessage message = giftCollectionUpdateMessage;
        o.LJIIIZ(message, "message");
        o.LJIIIZ(context, "context");
        if (message.giftCollection.messageType != 2) {
            return false;
        }
        if (LiveRandomGiftCapsuleGovernanceSetting.INSTANCE.getValue() == 0 && !context.LJIIZILJ) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            if (!C29306Beo.LJIIJJI(dataChannelGlobal) || !message.giftCollection.isFilterHost) {
                if (C29306Beo.LJIIJJI(dataChannelGlobal)) {
                    return false;
                }
                if (LiveGiftUserConsumeLayerSetting.INSTANCE.getValue() < 3) {
                    z = true;
                } else {
                    z = false;
                }
                Gift findGiftById = ((IGiftService) CN1.LIZ(IGiftService.class)).findGiftById(message.giftCollection.gift.id);
                if (findGiftById != null && findGiftById.isDisplayedOnPanel) {
                    return z;
                }
            }
        }
        return true;
    }
}
