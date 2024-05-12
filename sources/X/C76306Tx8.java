package X;

import Y.ARunnableS32S0200000_13;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleNoticeMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattlePunishFinishMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleVictoryLapMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* renamed from: X.Tx8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76306Tx8 implements OnMessageListener {
    public final /* synthetic */ AbstractC76285Twn<P> LJLIL;

    public C76306Tx8(AbstractC76285Twn<P> abstractC76285Twn) {
        this.LJLIL = abstractC76285Twn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        long j;
        AbstractC76285Twn<P> abstractC76285Twn = this.LJLIL;
        abstractC76285Twn.getClass();
        if (iMessage == 0) {
            return;
        }
        if (((iMessage instanceof LinkMicBattleNoticeMessage) && ((LinkMicBattleNoticeMessage) iMessage).LJLIL) || abstractC76285Twn.LJII == 0) {
            return;
        }
        if (iMessage instanceof BaseMessage) {
            CommonMessageData commonMessageData = ((BaseMessage) iMessage).baseMessage;
            long j2 = 0;
            if (commonMessageData != null) {
                j = commonMessageData.createTime;
            } else {
                j = 0;
            }
            long j3 = j / 1000;
            Room room = abstractC76285Twn.LJIIIIZZ;
            if (room != null) {
                j2 = room.nowTime;
            }
            if (j3 < j2) {
                C0NB.LJIIIZ("IMatchViewPresenter", "onMessage, return message is old");
                if (!(iMessage instanceof LinkMicBattleVictoryLapMessage)) {
                    return;
                } else {
                    C0NB.LJIIIZ("IMatchViewPresenter", "onMessage, LinkMicBattleVictoryLapMessage is old but still handle it");
                }
            }
        }
        if (iMessage instanceof LinkMicBattleMessage) {
            C30946CCo.LIZ(new ARunnableS32S0200000_13(abstractC76285Twn, iMessage, 58));
            return;
        }
        if (iMessage instanceof LinkMicBattleArmiesMessage) {
            abstractC76285Twn.LJI((LinkMicBattleArmiesMessage) iMessage);
            return;
        }
        if (iMessage instanceof LinkMicBattlePunishFinishMessage) {
            C30946CCo.LIZ(new ARunnableS32S0200000_13(abstractC76285Twn, iMessage, 59));
        } else if (iMessage instanceof LinkMicBattleVictoryLapMessage) {
            C30946CCo.LIZ(new ARunnableS32S0200000_13(abstractC76285Twn, iMessage, 60));
        } else {
            C0NB.LJ("IMatchViewPresenter", "mMessageReceiver-> receive message is not support, please ensure handle this message callback");
        }
    }
}
