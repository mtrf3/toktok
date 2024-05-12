package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C10370av;
import X.C76800UCe;
import X.C76820UCy;
import X.C76821UCz;
import X.C78983UzD;
import X.InterfaceC32701Qc;
import X.InterfaceC88472Yns;
import X.U2O;
import X.UD0;
import X.UD5;
import X.V55;
import com.bytedance.android.live.liveinteract.multimatch.speedchallenge.viewmodel.MatchSpeedChallengeVM;

/* loaded from: classes14.dex */
public class AqS34S0100100_13 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS34S0100100_13 aqS34S0100100_13, Object obj) {
        C76820UCy setState = (C76820UCy) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C76820UCy.LIZIZ(setState, (U2O) aqS34S0100100_13.l0, aqS34S0100100_13.j1, 0, null, 0, 0, null, null, null, null, null, 2044);
    }

    public static final Object invoke$1(AqS34S0100100_13 aqS34S0100100_13, Object obj) {
        InterfaceC32701Qc graphicsLayer = (InterfaceC32701Qc) obj;
        o.LJIIIZ(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.LJIILJJIL(C10370av.LIZLLL(aqS34S0100100_13.j1));
        graphicsLayer.LJIILLIIL(C10370av.LJ(aqS34S0100100_13.j1));
        graphicsLayer.LJIIZILJ(-((V55) aqS34S0100100_13.l0).LJLIL);
        graphicsLayer.LJII(-((V55) aqS34S0100100_13.l0).LJLILLLLZI);
        graphicsLayer.LJJJJLI(C78983UzD.LJ(0.0f, 0.0f));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS34S0100100_13 aqS34S0100100_13, Object obj) {
        boolean z;
        float LIZLLL;
        InterfaceC32701Qc graphicsLayer = (InterfaceC32701Qc) obj;
        o.LJIIIZ(graphicsLayer, "$this$graphicsLayer");
        if (C10370av.LIZLLL(aqS34S0100100_13.j1) == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        float f = 1.0f;
        if (z) {
            LIZLLL = 1.0f;
        } else {
            LIZLLL = 1 / C10370av.LIZLLL(aqS34S0100100_13.j1);
        }
        if (C10370av.LJ(aqS34S0100100_13.j1) != 0.0f) {
            f = 1 / C10370av.LJ(aqS34S0100100_13.j1);
        }
        graphicsLayer.LJIILJJIL(LIZLLL);
        graphicsLayer.LJIILLIIL(f);
        graphicsLayer.LJIIZILJ(((V55) aqS34S0100100_13.l0).LJLIL * LIZLLL);
        graphicsLayer.LJII(((V55) aqS34S0100100_13.l0).LJLILLLLZI * f);
        graphicsLayer.LJJJJLI(C78983UzD.LJ(0.0f, 0.0f));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS34S0100100_13 aqS34S0100100_13, Object obj) {
        C76820UCy it = (C76820UCy) obj;
        o.LJIIIZ(it, "it");
        C76821UCz c76821UCz = it.LJLL;
        long j = c76821UCz.LIZ;
        long j2 = j + 1;
        long j3 = aqS34S0100100_13.j1;
        if (j3 <= it.LJLJLLL.LJLILLLLZI && j2 <= j3) {
            ((MatchSpeedChallengeVM) aqS34S0100100_13.l0).gv0(j3, U2O.TASK_NOTICE);
        } else {
            MatchSpeedChallengeVM matchSpeedChallengeVM = (MatchSpeedChallengeVM) aqS34S0100100_13.l0;
            UD5 ud5 = matchSpeedChallengeVM.LJLL;
            UD5 ud52 = UD5.DEFAULT;
            if (ud5 == ud52 && j3 == it.LJLLI.LIZ + 1) {
                matchSpeedChallengeVM.hv0("egg_task_complete");
                ((MatchSpeedChallengeVM) aqS34S0100100_13.l0).gv0(aqS34S0100100_13.j1, U2O.TASK_IN_PROCESS);
            } else if (ud5 == ud52 && j3 > it.LJLLI.LIZ && j3 <= j) {
                matchSpeedChallengeVM.gv0(j3, U2O.TASK_IN_PROCESS);
            } else {
                UD5 ud53 = UD5.FAILED;
                if (ud5 == ud53) {
                    long j4 = c76821UCz.LJI;
                    if (j4 > 0) {
                        long j5 = it.LJLLI.LIZ;
                        if (j5 > 0 && j3 < j && j3 >= j4 - 3 && j3 >= j5) {
                            matchSpeedChallengeVM.gv0(j3, U2O.TASK_FAILED);
                        }
                    }
                }
                if (ud5 == ud53) {
                    long j6 = c76821UCz.LJI;
                    if (j6 > 0) {
                        long j7 = it.LJLLI.LIZ;
                        if (j7 > 0 && (j3 < j6 - 3 || j3 < j7)) {
                            matchSpeedChallengeVM.gv0(j3, U2O.DISABLED);
                        }
                    }
                }
                UD5 ud54 = UD5.SUCCEED;
                if ((ud5 == ud54 || ud5 == UD5.BOTH_SUCCEED) && j3 < j && j3 >= it.LJLLI.LIZ) {
                    matchSpeedChallengeVM.gv0(j3, U2O.TASK_SUCCEED);
                } else {
                    if (ud5 == ud54 || ud5 == UD5.BOTH_SUCCEED) {
                        UD0 ud0 = it.LJLLI;
                        long j8 = ud0.LIZ;
                        if (j3 < j8 && j3 == (j8 - ud0.LIZIZ) + 1 && matchSpeedChallengeVM.getState().LJLIL != U2O.BONUS_FINISHED) {
                            ((MatchSpeedChallengeVM) aqS34S0100100_13.l0).hv0("egg_reward_complete");
                            ((MatchSpeedChallengeVM) aqS34S0100100_13.l0).gv0(aqS34S0100100_13.j1, U2O.BONUS_IN_PROCESS);
                        }
                    }
                    MatchSpeedChallengeVM matchSpeedChallengeVM2 = (MatchSpeedChallengeVM) aqS34S0100100_13.l0;
                    UD5 ud55 = matchSpeedChallengeVM2.LJLL;
                    if (ud55 == ud54 || ud55 == UD5.BOTH_SUCCEED) {
                        long j9 = aqS34S0100100_13.j1;
                        UD0 ud02 = it.LJLLI;
                        long j10 = ud02.LIZ;
                        if (j9 <= j10 && j9 > j10 - ud02.LIZIZ) {
                            matchSpeedChallengeVM2.gv0(j9, U2O.BONUS_IN_PROCESS);
                        }
                    }
                    if (ud55 == ud54 || ud55 == UD5.BOTH_SUCCEED) {
                        UD0 ud03 = it.LJLLI;
                        long j11 = ud03.LIZJ;
                        if (j11 > 0 && ud03.LIZ > 0 && ud03.LIZIZ > 0) {
                            long j12 = aqS34S0100100_13.j1;
                            if (j12 <= j11 - ud03.LIZLLL) {
                                matchSpeedChallengeVM2.gv0(j12, U2O.DISABLED);
                            }
                        }
                    }
                    UD0 ud04 = it.LJLLI;
                    long j13 = ud04.LIZJ;
                    if (j13 > 0) {
                        long j14 = aqS34S0100100_13.j1;
                        if (j14 <= j13 - ud04.LIZLLL) {
                            matchSpeedChallengeVM2.gv0(j14, U2O.DISABLED);
                        }
                    }
                    matchSpeedChallengeVM2.gv0(aqS34S0100100_13.j1, matchSpeedChallengeVM2.getState().LJLIL);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS34S0100100_13(long j, U2O u2o, int i) {
        super(1);
        this.$t = i;
        this.l0 = u2o;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS34S0100100_13(long j, V55 v55, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = v55;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS34S0100100_13(long j, MatchSpeedChallengeVM matchSpeedChallengeVM, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = matchSpeedChallengeVM;
    }
}
