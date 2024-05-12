package X;

import com.bytedance.android.livesdk.model.message.LinkMicBattleArmiesMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* loaded from: classes14.dex */
public final class UD2 implements OnMessageListener {
    public final /* synthetic */ C76819UCx LJLIL;

    public UD2(C76819UCx c76819UCx) {
        this.LJLIL = c76819UCx;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        U2O u2o;
        U2O u2o2;
        if (iMessage == null) {
            return;
        }
        C76819UCx c76819UCx = this.LJLIL;
        if (c76819UCx.LJLJJI == null || !(iMessage instanceof LinkMicBattleArmiesMessage) || !c76819UCx.LJFF() || (u2o = this.LJLIL.LJLL) != (u2o2 = U2O.TASK_IN_PROCESS)) {
            return;
        }
        if (u2o == u2o2 || u2o == U2O.TASK_SUCCEED) {
            C0NB.LIZIZ("BattleTaskPresenterTag", iMessage.toString());
            long j = ((LinkMicBattleArmiesMessage) iMessage).giftId;
            C76819UCx c76819UCx2 = this.LJLIL;
            long j2 = c76819UCx2.LLIIJLIL;
            if (j2 != 0 && j2 == j) {
                c76819UCx2.LLIILII += c76819UCx2.LLIIL;
            }
        }
    }
}
