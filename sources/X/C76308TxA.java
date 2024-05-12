package X;

import Y.ARunnableS32S0200000_13;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleItemCard;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattlePunishFinishMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;

/* renamed from: X.TxA, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76308TxA implements OnIMMessageListener {
    public final /* synthetic */ C76110Tty LJLIL;

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "preview_multi";
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    public C76308TxA(C76110Tty c76110Tty) {
        this.LJLIL = c76110Tty;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        C76110Tty c76110Tty = this.LJLIL;
        c76110Tty.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("message = ");
        LIZ.append(iMessage);
        C0NB.LJIIIZ("MultiHostFeedHandler", X1D.LIZIZ(LIZ));
        C76301Tx3 c76301Tx3 = c76110Tty.LJLLL;
        if (c76301Tx3 != null) {
            C76299Tx1 c76299Tx1 = c76301Tx3.LJLJLJ;
            if (c76299Tx1.LJ) {
                C76312TxE c76312TxE = c76299Tx1.LIZIZ;
                c76312TxE.getClass();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("message = ");
                LIZ2.append(iMessage);
                C0NB.LJIIIZ("MatchFeedWidgetPresenter", X1D.LIZIZ(LIZ2));
                if (iMessage instanceof LinkMicBattleMessage) {
                    C30946CCo.LIZ(new ARunnableS32S0200000_13(c76312TxE, iMessage, 71));
                    return;
                }
                if (iMessage instanceof LinkMicBattleArmiesMessage) {
                    C30946CCo.LIZ(new ARunnableS32S0200000_13(c76312TxE, iMessage, 72));
                    return;
                }
                if (iMessage instanceof LinkMicBattlePunishFinishMessage) {
                    C30946CCo.LIZ(new ARunnableS32S0200000_13(c76312TxE, iMessage, 73));
                } else if (iMessage instanceof LinkMicBattleItemCard) {
                    C30946CCo.LIZ(new ARunnableS32S0200000_13(c76312TxE, iMessage, 74));
                } else {
                    C0NB.LJ("MatchFeedWidgetPresenter", "mMessageReceiver-> receive message is not support");
                }
            }
        }
    }
}
