package X;

import com.bytedance.android.live.gift.GiftLimitNotificationEvent;
import com.bytedance.android.live.gift.IGiftReminderService;
import com.bytedance.android.livesdk.model.message.GiftPromptMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BRU implements OnMessageListener {
    public final DataChannel LJLIL;
    public IMessageManager LJLILLLLZI;

    public BRU(DataChannel mDataChannel) {
        o.LJIIIZ(mDataChannel, "mDataChannel");
        this.LJLIL = mDataChannel;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        int intValue;
        if (iMessage instanceof GiftPromptMessage) {
            BEA bea = BEA.LIZ;
            GiftPromptMessage giftPromptMessage = (GiftPromptMessage) iMessage;
            String str = giftPromptMessage.title;
            bea.getClass();
            BEA.LJIIIIZZ = str;
            BEA.LJIIIZ = giftPromptMessage.body;
            Integer num = giftPromptMessage.blockNumDays;
            if (num == null) {
                intValue = 0;
            } else {
                intValue = num.intValue();
            }
            BEA.LJIIJ = intValue;
            BEA.LJIIJJI = giftPromptMessage.orderId;
            Long l = giftPromptMessage.orderTimestamp;
            if (l != null) {
                BEA.LJIIL = String.valueOf(l);
            }
            ((IGiftReminderService) CN1.LIZ(IGiftReminderService.class)).Pc0(4);
            this.LJLIL.qv0(GiftLimitNotificationEvent.class, Boolean.valueOf(BEA.LIZJ()));
        }
    }
}
