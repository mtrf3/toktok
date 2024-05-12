package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C05630Jz;
import X.C0RN;
import X.C29306Beo;
import X.C47121t6;
import X.C75457TjR;
import X.C75832TpU;
import X.C76800UCe;
import X.C76805UCj;
import X.C76810UCo;
import X.C76812UCq;
import X.C76819UCx;
import X.CL6;
import X.CMV;
import X.InterfaceC65784Pro;
import X.U27;
import X.X1D;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostBeInvitedFragment;
import com.bytedance.android.live.liveinteract.multimatch.speedchallenge.ui.MatchSpeedChallengeAssem;
import com.zhiliaoapp.musically.R;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class AqS40S0100100_13 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS40S0100100_13 aqS40S0100100_13) {
        C47121t6 c47121t6 = ((C76805UCj) aqS40S0100100_13.l0).LJLZ;
        if (c47121t6 != null) {
            c47121t6.setVisibility(8);
        }
        View view = ((C76805UCj) aqS40S0100100_13.l0).LJZ;
        if (view != null) {
            view.setVisibility(8);
        }
        LinearLayout linearLayout = ((C76805UCj) aqS40S0100100_13.l0).LJLLLL;
        if (linearLayout != null) {
            linearLayout.setBackgroundResource(R.drawable.cj8);
        }
        C76805UCj c76805UCj = (C76805UCj) aqS40S0100100_13.l0;
        C76819UCx c76819UCx = c76805UCj.LLF;
        if (c76819UCx != null) {
            C76812UCq c76812UCq = new C76812UCq(c76819UCx.LLIIIILZ, null, null);
            CMV cmv = c76805UCj.LJLLLLLL;
            C76805UCj.LJII(c76805UCj, c76812UCq, new C76810UCo(null, cmv, cmv, c76805UCj.LJLLLL));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("eggtask_reward_over, left_time = ");
            C0RN.LJ(LIZ, aqS40S0100100_13.j1, LIZ, "BattleTaskContainer");
            return C76800UCe.LIZ;
        }
        o.LJIJI("presenter");
        throw null;
    }

    public static final Object invoke$1(AqS40S0100100_13 aqS40S0100100_13) {
        boolean z;
        C76805UCj c76805UCj = (C76805UCj) aqS40S0100100_13.l0;
        if (c76805UCj.LJLIL) {
            long j = aqS40S0100100_13.j1;
            C76819UCx c76819UCx = c76805UCj.LLF;
            Boolean bool = null;
            if (c76819UCx != null) {
                c76805UCj.LJIIIZ(c76819UCx.LL, j);
                C76805UCj c76805UCj2 = (C76805UCj) aqS40S0100100_13.l0;
                if (!c76805UCj2.LLII) {
                    c76805UCj2.LLII = true;
                    if (!c76805UCj2.LLFII) {
                        C76819UCx c76819UCx2 = c76805UCj2.LLF;
                        if (c76819UCx2 != null) {
                            C75457TjR.LJIILL(c76819UCx2.LLD);
                        } else {
                            o.LJIJI("presenter");
                            throw null;
                        }
                    }
                    ((C76805UCj) aqS40S0100100_13.l0).LIZIZ();
                    CL6.LIZIZ("match_color_eggs_task_start");
                    boolean z2 = ((C76805UCj) aqS40S0100100_13.l0).LLFII;
                    long j2 = aqS40S0100100_13.j1;
                    JSONObject jSONObject = new JSONObject();
                    C05630Jz.LJFF(jSONObject, "match_left_time", j2);
                    if (z2) {
                        U27.LJIILLIIL(jSONObject, "task_start");
                    } else {
                        U27.LJIIZILJ(jSONObject, "task_start");
                    }
                    C75832TpU c75832TpU = C75832TpU.LIZ;
                    C76805UCj c76805UCj3 = (C76805UCj) aqS40S0100100_13.l0;
                    boolean z3 = c76805UCj3.LLFZ;
                    if (c76805UCj3.getTranslationY() == 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c75832TpU.LJJIJL(z3, 1, !z, ((C76805UCj) aqS40S0100100_13.l0).getCpcToastShow());
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("eggtask_task_start, left_time = ");
                    C0RN.LJ(LIZ, aqS40S0100100_13.j1, LIZ, "BattleTaskContainer");
                }
                ValueAnimator valueAnimator = ((C76805UCj) aqS40S0100100_13.l0).LLFFF;
                if (valueAnimator != null) {
                    bool = Boolean.valueOf(valueAnimator.isRunning());
                }
                if (C29306Beo.LJIL(bool)) {
                    ((C76805UCj) aqS40S0100100_13.l0).LIZLLL();
                }
            } else {
                o.LJIJI("presenter");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS40S0100100_13 aqS40S0100100_13) {
        ((MultiCoHostBeInvitedFragment) aqS40S0100100_13.l0).Kl(aqS40S0100100_13.j1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS40S0100100_13 aqS40S0100100_13) {
        MatchSpeedChallengeAssem matchSpeedChallengeAssem = (MatchSpeedChallengeAssem) aqS40S0100100_13.l0;
        if (matchSpeedChallengeAssem.LJLL) {
            long j = aqS40S0100100_13.j1;
            C76819UCx c76819UCx = matchSpeedChallengeAssem.LLIIJI;
            Boolean bool = null;
            if (c76819UCx != null) {
                matchSpeedChallengeAssem.P3(c76819UCx.LL, j);
                MatchSpeedChallengeAssem matchSpeedChallengeAssem2 = (MatchSpeedChallengeAssem) aqS40S0100100_13.l0;
                if (!matchSpeedChallengeAssem2.LLIIL) {
                    matchSpeedChallengeAssem2.LLIIL = true;
                    if (!matchSpeedChallengeAssem2.LLIIIZ) {
                        C76819UCx c76819UCx2 = matchSpeedChallengeAssem2.LLIIJI;
                        if (c76819UCx2 != null) {
                            C75457TjR.LJIILL(c76819UCx2.LLD);
                        } else {
                            o.LJIJI("presenter");
                            throw null;
                        }
                    }
                    ((MatchSpeedChallengeAssem) aqS40S0100100_13.l0).I3();
                    CL6.LIZIZ("match_color_eggs_task_start");
                    boolean z = ((MatchSpeedChallengeAssem) aqS40S0100100_13.l0).LLIIIZ;
                    long j2 = aqS40S0100100_13.j1;
                    JSONObject jSONObject = new JSONObject();
                    C05630Jz.LJFF(jSONObject, "match_left_time", j2);
                    if (z) {
                        U27.LJIILLIIL(jSONObject, "task_start");
                    } else {
                        U27.LJIIZILJ(jSONObject, "task_start");
                    }
                    C75832TpU c75832TpU = C75832TpU.LIZ;
                    ((MatchSpeedChallengeAssem) aqS40S0100100_13.l0).getClass();
                    ((MatchSpeedChallengeAssem) aqS40S0100100_13.l0).getClass();
                    c75832TpU.LJJIJL(false, 1, false, false);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("eggtask_task_start, left_time = ");
                    C0RN.LJ(LIZ, aqS40S0100100_13.j1, LIZ, "SpeedChallengeAssem");
                }
                ValueAnimator valueAnimator = ((MatchSpeedChallengeAssem) aqS40S0100100_13.l0).LLIIIL;
                if (valueAnimator != null) {
                    bool = Boolean.valueOf(valueAnimator.isRunning());
                }
                if (C29306Beo.LJIL(bool)) {
                    ((MatchSpeedChallengeAssem) aqS40S0100100_13.l0).L3();
                }
            } else {
                o.LJIJI("presenter");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS40S0100100_13(C76805UCj c76805UCj, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c76805UCj;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS40S0100100_13(MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = multiCoHostBeInvitedFragment;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS40S0100100_13(MatchSpeedChallengeAssem matchSpeedChallengeAssem, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = matchSpeedChallengeAssem;
        this.j1 = j;
    }
}
