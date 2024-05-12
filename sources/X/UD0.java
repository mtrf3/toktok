package X;

import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePrompt;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UD0 {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final BattlePrompt LJ;
    public final BattlePrompt LJFF;
    public final BattlePrompt LJI;

    public UD0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UD0)) {
            return false;
        }
        UD0 ud0 = (UD0) obj;
        return this.LIZ == ud0.LIZ && this.LIZIZ == ud0.LIZIZ && this.LIZJ == ud0.LIZJ && this.LIZLLL == ud0.LIZLLL && o.LJ(this.LJ, ud0.LJ) && o.LJ(this.LJFF, ud0.LJFF) && o.LJ(this.LJI, ud0.LJI);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RewardPeriodState(rewardStartTime=");
        LIZ.append(this.LIZ);
        LIZ.append(", rewardDuration=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", rewardResultTime=");
        LIZ.append(this.LIZJ);
        LIZ.append(", rewardResultDuration=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", rewardPreparePrompt=");
        LIZ.append(this.LJ);
        LIZ.append(", rewardingPrompt=");
        LIZ.append(this.LJFF);
        LIZ.append(", rewardSettlePrompt=");
        LIZ.append(this.LJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LIZJ = JBR.LIZJ(this.LIZLLL, JBR.LIZJ(this.LIZJ, JBR.LIZJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31), 31), 31);
        BattlePrompt battlePrompt = this.LJ;
        int i = 0;
        if (battlePrompt == null) {
            hashCode = 0;
        } else {
            hashCode = battlePrompt.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        BattlePrompt battlePrompt2 = this.LJFF;
        if (battlePrompt2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = battlePrompt2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        BattlePrompt battlePrompt3 = this.LJI;
        if (battlePrompt3 != null) {
            i = battlePrompt3.hashCode();
        }
        return i3 + i;
    }

    public /* synthetic */ UD0(int i) {
        this(-1L, 10L, 0L, 5L, null, null, null);
    }

    public UD0(long j, long j2, long j3, long j4, BattlePrompt battlePrompt, BattlePrompt battlePrompt2, BattlePrompt battlePrompt3) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
        this.LJ = battlePrompt;
        this.LJFF = battlePrompt2;
        this.LJI = battlePrompt3;
    }

    public static UD0 LIZ(UD0 ud0, long j, long j2, long j3, BattlePrompt battlePrompt, BattlePrompt battlePrompt2, BattlePrompt battlePrompt3, int i) {
        long j4;
        BattlePrompt battlePrompt4 = battlePrompt2;
        BattlePrompt battlePrompt5 = battlePrompt;
        long j5 = j3;
        long j6 = j;
        BattlePrompt battlePrompt6 = battlePrompt3;
        long j7 = j2;
        if ((i & 1) != 0) {
            j6 = ud0.LIZ;
        }
        if ((i & 2) != 0) {
            j7 = ud0.LIZIZ;
        }
        if ((i & 4) != 0) {
            j5 = ud0.LIZJ;
        }
        if ((i & 8) != 0) {
            j4 = ud0.LIZLLL;
        } else {
            j4 = 0;
        }
        if ((i & 16) != 0) {
            battlePrompt5 = ud0.LJ;
        }
        if ((i & 32) != 0) {
            battlePrompt4 = ud0.LJFF;
        }
        if ((i & 64) != 0) {
            battlePrompt6 = ud0.LJI;
        }
        ud0.getClass();
        return new UD0(j6, j7, j5, j4, battlePrompt5, battlePrompt4, battlePrompt6);
    }
}
