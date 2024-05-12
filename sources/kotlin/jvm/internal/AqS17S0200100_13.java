package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C0NB;
import X.C76265TwT;
import X.C76800UCe;
import X.C76820UCy;
import X.C78159Ulv;
import X.C78164Um0;
import X.C78165Um1;
import X.InterfaceC88472Yns;
import X.U2O;
import X.X1D;
import com.bytedance.android.live.liveinteract.match.business.event.BattleBonusTaskStateChannel;
import com.bytedance.android.live.liveinteract.multimatch.speedchallenge.viewmodel.MatchSpeedChallengeVM;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes14.dex */
public class AqS17S0200100_13 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS17S0200100_13 aqS17S0200100_13, Object obj) {
        C76820UCy it = (C76820UCy) obj;
        o.LJIIIZ(it, "it");
        U2O u2o = it.LJLIL;
        U2O u2o2 = (U2O) aqS17S0200100_13.l0;
        if (u2o != u2o2) {
            if (u2o.compareTo(u2o2) < 0 || ((U2O) aqS17S0200100_13.l0) == U2O.DISABLED) {
                ((MatchSpeedChallengeVM) aqS17S0200100_13.l1).setState(new AqS34S0100100_13(aqS17S0200100_13.j2, (U2O) aqS17S0200100_13.l0, 0));
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("compareState==>> timeStamp = ");
                LIZ.append(aqS17S0200100_13.j2);
                LIZ.append(" currentSTate = ");
                LIZ.append(u2o);
                C0NB.LIZIZ("SpeedChallengeVM", X1D.LIZIZ(LIZ));
                DataChannel dataChannel = ((MatchSpeedChallengeVM) aqS17S0200100_13.l1).LJLJJI;
                if (dataChannel != null) {
                    dataChannel.rv0(BattleBonusTaskStateChannel.class, (U2O) aqS17S0200100_13.l0);
                }
            }
        } else if ((u2o == U2O.BONUS_IN_PROCESS || u2o == U2O.TASK_IN_PROCESS) && u2o != U2O.DISABLED) {
            ((MatchSpeedChallengeVM) aqS17S0200100_13.l1).setState(new AqS20S0000100_13(aqS17S0200100_13.j2, 4));
            DataChannel dataChannel2 = ((MatchSpeedChallengeVM) aqS17S0200100_13.l1).LJLJJI;
            if (dataChannel2 != null) {
                dataChannel2.rv0(BattleBonusTaskStateChannel.class, u2o);
            }
        }
        if (u2o.compareTo(U2O.TASK_IN_PROCESS) > 0) {
            C76265TwT.LIZ.LJJJZ = 0L;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS17S0200100_13 aqS17S0200100_13, Object obj) {
        C78164Um0 it = (C78164Um0) obj;
        o.LJIIIZ(it, "it");
        C78159Ulv c78159Ulv = (C78159Ulv) aqS17S0200100_13.l0;
        C78165Um1 c78165Um1 = (C78165Um1) aqS17S0200100_13.l1;
        c78159Ulv.LJIIIZ(true, c78165Um1.LJIIIZ, null, c78165Um1.LIZIZ, c78165Um1.LIZJ, it, c78165Um1.LJIIJ, Long.valueOf(aqS17S0200100_13.j2));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS17S0200100_13(U2O u2o, MatchSpeedChallengeVM matchSpeedChallengeVM, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = u2o;
        this.l1 = matchSpeedChallengeVM;
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS17S0200100_13(C78159Ulv c78159Ulv, C78165Um1 c78165Um1, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c78159Ulv;
        this.l1 = c78165Um1;
        this.j2 = j;
    }
}
