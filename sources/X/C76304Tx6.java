package X;

import Y.ARunnableS32S0200000_13;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleNoticeMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattlePunishFinishMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleVictoryLapMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* renamed from: X.Tx6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76304Tx6 implements OnMessageListener {
    public final /* synthetic */ AbstractC76282Twk<P> LJLIL;

    public C76304Tx6(AbstractC76282Twk<P> abstractC76282Twk) {
        this.LJLIL = abstractC76282Twk;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        long j;
        AbstractC76282Twk<P> abstractC76282Twk = this.LJLIL;
        abstractC76282Twk.getClass();
        if (iMessage == 0) {
            return;
        }
        if (((iMessage instanceof LinkMicBattleNoticeMessage) && ((LinkMicBattleNoticeMessage) iMessage).LJLIL) || abstractC76282Twk.LIZLLL == 0) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onMessage, message = ");
        LIZ.append(GsonProtectorUtils.toJson(C09650Zl.LIZJ, iMessage));
        C0NB.LJIIIZ("IMatchViewPresenter", X1D.LIZIZ(LIZ));
        if (iMessage instanceof BaseMessage) {
            long j2 = ((BaseMessage) iMessage).baseMessage.createTime / 1000;
            Room room = abstractC76282Twk.LJ;
            if (room != null) {
                j = room.nowTime;
            } else {
                j = 0;
            }
            if (j2 < j) {
                C0NB.LJIIIZ("IMatchViewPresenter", "onMessage, return message is old");
                return;
            }
        }
        if (iMessage instanceof LinkMicBattleMessage) {
            C30946CCo.LIZ(new ARunnableS32S0200000_13(abstractC76282Twk, iMessage, 48));
            return;
        }
        if (iMessage instanceof LinkMicBattleArmiesMessage) {
            abstractC76282Twk.LJ((LinkMicBattleArmiesMessage) iMessage);
            return;
        }
        if (iMessage instanceof LinkMicBattlePunishFinishMessage) {
            C30946CCo.LIZ(new ARunnableS32S0200000_13(abstractC76282Twk, iMessage, 49));
        } else if (iMessage instanceof LinkMicBattleVictoryLapMessage) {
            C30946CCo.LIZ(new ARunnableS32S0200000_13(abstractC76282Twk, iMessage, 50));
        } else {
            C0NB.LJ("IMatchViewPresenter", "mMessageReceiver-> receive message is not support, please ensure handle this message callback");
        }
    }
}
