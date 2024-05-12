package X;

import com.bytedance.android.live.liveinteract.multimatch.speedchallenge.viewmodel.MatchSpeedChallengeVM;
import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* loaded from: classes14.dex */
public final class UD1 implements OnMessageListener {
    public final /* synthetic */ MatchSpeedChallengeVM LJLIL;

    public UD1(MatchSpeedChallengeVM matchSpeedChallengeVM) {
        this.LJLIL = matchSpeedChallengeVM;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage == null || !(iMessage instanceof LinkMicBattleArmiesMessage) || !this.LJLIL.jv0()) {
            return;
        }
        U2O u2o = this.LJLIL.getState().LJLIL;
        U2O u2o2 = U2O.TASK_IN_PROCESS;
        if (u2o != u2o2) {
            return;
        }
        if (this.LJLIL.getState().LJLIL == u2o2 || this.LJLIL.getState().LJLIL == U2O.TASK_SUCCEED) {
            C0NB.LIZIZ("SpeedChallengeVM", iMessage.toString());
            long j = ((LinkMicBattleArmiesMessage) iMessage).giftId;
            MatchSpeedChallengeVM matchSpeedChallengeVM = this.LJLIL;
            long j2 = matchSpeedChallengeVM.LJLLL;
            if (j2 != 0 && j2 == j) {
                matchSpeedChallengeVM.LJLLLLLL += matchSpeedChallengeVM.LJLLLL;
            }
        }
    }
}
