package X;

import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePrompt;
import kotlin.jvm.internal.o;

/* renamed from: X.UCy */
/* loaded from: classes14.dex */
public final class C76820UCy implements C33Q {
    public final U2O LJLIL;
    public final long LJLILLLLZI;
    public final int LJLJI;
    public final String LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final BattlePrompt LJLJL;
    public final BattlePrompt LJLJLJ;
    public final UD4 LJLJLLL;
    public final C76821UCz LJLL;
    public final UD0 LJLLI;

    public C76820UCy() {
        this(0);
    }

    public static C76820UCy LIZ(U2O currentState, long j, int i, String pkTaskType, int i2, int i3, BattlePrompt battlePrompt, BattlePrompt battlePrompt2, UD4 previewPeriodState, C76821UCz taskPeriodState, UD0 rewardPeriodState) {
        o.LJIIIZ(currentState, "currentState");
        o.LJIIIZ(pkTaskType, "pkTaskType");
        o.LJIIIZ(previewPeriodState, "previewPeriodState");
        o.LJIIIZ(taskPeriodState, "taskPeriodState");
        o.LJIIIZ(rewardPeriodState, "rewardPeriodState");
        return new C76820UCy(currentState, j, i, pkTaskType, i2, i3, battlePrompt, battlePrompt2, previewPeriodState, taskPeriodState, rewardPeriodState);
    }

    public static /* synthetic */ C76820UCy LIZIZ(C76820UCy c76820UCy, U2O u2o, long j, int i, String str, int i2, int i3, BattlePrompt battlePrompt, BattlePrompt battlePrompt2, UD4 ud4, C76821UCz c76821UCz, UD0 ud0, int i4) {
        UD0 ud02 = ud0;
        C76821UCz c76821UCz2 = c76821UCz;
        UD4 ud42 = ud4;
        BattlePrompt battlePrompt3 = battlePrompt2;
        BattlePrompt battlePrompt4 = battlePrompt;
        long j2 = j;
        U2O u2o2 = u2o;
        int i5 = i;
        String str2 = str;
        int i6 = i2;
        int i7 = i3;
        if ((i4 & 1) != 0) {
            u2o2 = c76820UCy.LJLIL;
        }
        if ((i4 & 2) != 0) {
            j2 = c76820UCy.LJLILLLLZI;
        }
        if ((i4 & 4) != 0) {
            i5 = c76820UCy.LJLJI;
        }
        if ((i4 & 8) != 0) {
            str2 = c76820UCy.LJLJJI;
        }
        if ((i4 & 16) != 0) {
            i6 = c76820UCy.LJLJJL;
        }
        if ((i4 & 32) != 0) {
            i7 = c76820UCy.LJLJJLL;
        }
        if ((i4 & 64) != 0) {
            battlePrompt4 = c76820UCy.LJLJL;
        }
        if ((i4 & 128) != 0) {
            battlePrompt3 = c76820UCy.LJLJLJ;
        }
        if ((i4 & 256) != 0) {
            ud42 = c76820UCy.LJLJLLL;
        }
        if ((i4 & 512) != 0) {
            c76821UCz2 = c76820UCy.LJLL;
        }
        if ((i4 & 1024) != 0) {
            ud02 = c76820UCy.LJLLI;
        }
        c76820UCy.getClass();
        return LIZ(u2o2, j2, i5, str2, i6, i7, battlePrompt4, battlePrompt3, ud42, c76821UCz2, ud02);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76820UCy)) {
            return false;
        }
        C76820UCy c76820UCy = (C76820UCy) obj;
        return this.LJLIL == c76820UCy.LJLIL && this.LJLILLLLZI == c76820UCy.LJLILLLLZI && this.LJLJI == c76820UCy.LJLJI && o.LJ(this.LJLJJI, c76820UCy.LJLJJI) && this.LJLJJL == c76820UCy.LJLJJL && this.LJLJJLL == c76820UCy.LJLJJLL && o.LJ(this.LJLJL, c76820UCy.LJLJL) && o.LJ(this.LJLJLJ, c76820UCy.LJLJLJ) && o.LJ(this.LJLJLLL, c76820UCy.LJLJLLL) && o.LJ(this.LJLL, c76820UCy.LJLL) && o.LJ(this.LJLLI, c76820UCy.LJLLI);
    }

    public final String toString() {
        return "SpeedChallengeState(currentState=" + this.LJLIL + ", stateTime=" + this.LJLILLLLZI + ", taskType=" + this.LJLJI + ", pkTaskType=" + this.LJLJJI + ", bonusTaskType=" + this.LJLJJL + ", clickAction=" + this.LJLJJLL + ", clickToastPrompt=" + this.LJLJL + ", audienceEnterPrompt=" + this.LJLJLJ + ", previewPeriodState=" + this.LJLJLLL + ", taskPeriodState=" + this.LJLL + ", rewardPeriodState=" + this.LJLLI + ')';
    }

    public final int hashCode() {
        int hashCode;
        int LJ = (((C79062V1e.LJ(this.LJLJJI, (JBR.LIZJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31) + this.LJLJI) * 31, 31) + this.LJLJJL) * 31) + this.LJLJJLL) * 31;
        BattlePrompt battlePrompt = this.LJLJL;
        int i = 0;
        if (battlePrompt == null) {
            hashCode = 0;
        } else {
            hashCode = battlePrompt.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        BattlePrompt battlePrompt2 = this.LJLJLJ;
        if (battlePrompt2 != null) {
            i = battlePrompt2.hashCode();
        }
        return this.LJLLI.hashCode() + ((this.LJLL.hashCode() + ((this.LJLJLLL.hashCode() + ((i2 + i) * 31)) * 31)) * 31);
    }

    public /* synthetic */ C76820UCy(int i) {
        this(U2O.DISABLED, -1L, 1, "", 0, 0, null, null, new UD4(), new C76821UCz(0), new UD0(0));
    }

    public C76820UCy(U2O currentState, long j, int i, String pkTaskType, int i2, int i3, BattlePrompt battlePrompt, BattlePrompt battlePrompt2, UD4 previewPeriodState, C76821UCz taskPeriodState, UD0 rewardPeriodState) {
        o.LJIIIZ(currentState, "currentState");
        o.LJIIIZ(pkTaskType, "pkTaskType");
        o.LJIIIZ(previewPeriodState, "previewPeriodState");
        o.LJIIIZ(taskPeriodState, "taskPeriodState");
        o.LJIIIZ(rewardPeriodState, "rewardPeriodState");
        this.LJLIL = currentState;
        this.LJLILLLLZI = j;
        this.LJLJI = i;
        this.LJLJJI = pkTaskType;
        this.LJLJJL = i2;
        this.LJLJJLL = i3;
        this.LJLJL = battlePrompt;
        this.LJLJLJ = battlePrompt2;
        this.LJLJLLL = previewPeriodState;
        this.LJLL = taskPeriodState;
        this.LJLLI = rewardPeriodState;
    }
}
