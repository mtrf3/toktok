package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePrompt;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTaskGiftAmountGuide;
import kotlin.jvm.internal.o;

/* renamed from: X.UCz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76821UCz {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final BattlePrompt LIZLLL;
    public long LJ;
    public final UD5 LJFF;
    public final long LJI;
    public final ImageModel LJII;
    public final BattleTaskGiftAmountGuide LJIIIIZZ;

    public C76821UCz() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76821UCz)) {
            return false;
        }
        C76821UCz c76821UCz = (C76821UCz) obj;
        return this.LIZ == c76821UCz.LIZ && this.LIZIZ == c76821UCz.LIZIZ && this.LIZJ == c76821UCz.LIZJ && o.LJ(this.LIZLLL, c76821UCz.LIZLLL) && this.LJ == c76821UCz.LJ && this.LJFF == c76821UCz.LJFF && this.LJI == c76821UCz.LJI && o.LJ(this.LJII, c76821UCz.LJII) && o.LJ(this.LJIIIIZZ, c76821UCz.LJIIIIZZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TaskPeriodState(taskStartTime=");
        LIZ.append(this.LIZ);
        LIZ.append(", taskDuration=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", taskTargetCount=");
        LIZ.append(this.LIZJ);
        LIZ.append(", taskPeriodPrompt=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", currentTaskProgress=");
        LIZ.append(this.LJ);
        LIZ.append(", taskResult=");
        LIZ.append(this.LJFF);
        LIZ.append(", taskFailedTime=");
        LIZ.append(this.LJI);
        LIZ.append(", taskIcon=");
        LIZ.append(this.LJII);
        LIZ.append(", battleTaskGuideInfo=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LIZJ = JBR.LIZJ(this.LIZJ, JBR.LIZJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31), 31);
        BattlePrompt battlePrompt = this.LIZLLL;
        int i = 0;
        if (battlePrompt == null) {
            hashCode = 0;
        } else {
            hashCode = battlePrompt.hashCode();
        }
        int LIZJ2 = JBR.LIZJ(this.LJI, (this.LJFF.hashCode() + JBR.LIZJ(this.LJ, (LIZJ + hashCode) * 31, 31)) * 31, 31);
        ImageModel imageModel = this.LJII;
        if (imageModel == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = imageModel.hashCode();
        }
        int i2 = (LIZJ2 + hashCode2) * 31;
        BattleTaskGiftAmountGuide battleTaskGiftAmountGuide = this.LJIIIIZZ;
        if (battleTaskGiftAmountGuide != null) {
            i = battleTaskGiftAmountGuide.hashCode();
        }
        return i2 + i;
    }

    public /* synthetic */ C76821UCz(int i) {
        this(-1L, 30L, 10L, null, 0L, UD5.DEFAULT, 0L, null, null);
    }

    public C76821UCz(long j, long j2, long j3, BattlePrompt battlePrompt, long j4, UD5 taskResult, long j5, ImageModel imageModel, BattleTaskGiftAmountGuide battleTaskGiftAmountGuide) {
        o.LJIIIZ(taskResult, "taskResult");
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = battlePrompt;
        this.LJ = j4;
        this.LJFF = taskResult;
        this.LJI = j5;
        this.LJII = imageModel;
        this.LJIIIIZZ = battleTaskGiftAmountGuide;
    }

    public static C76821UCz LIZ(C76821UCz c76821UCz, long j, long j2, long j3, BattlePrompt battlePrompt, long j4, ImageModel imageModel, BattleTaskGiftAmountGuide battleTaskGiftAmountGuide, int i) {
        long j5;
        UD5 taskResult;
        long j6 = j2;
        long j7 = j4;
        BattleTaskGiftAmountGuide battleTaskGiftAmountGuide2 = battleTaskGiftAmountGuide;
        long j8 = j;
        long j9 = j3;
        ImageModel imageModel2 = imageModel;
        BattlePrompt battlePrompt2 = battlePrompt;
        if ((i & 1) != 0) {
            j8 = c76821UCz.LIZ;
        }
        if ((i & 2) != 0) {
            j6 = c76821UCz.LIZIZ;
        }
        if ((i & 4) != 0) {
            j9 = c76821UCz.LIZJ;
        }
        if ((i & 8) != 0) {
            battlePrompt2 = c76821UCz.LIZLLL;
        }
        if ((i & 16) != 0) {
            j5 = c76821UCz.LJ;
        } else {
            j5 = 0;
        }
        if ((i & 32) != 0) {
            taskResult = c76821UCz.LJFF;
        } else {
            taskResult = null;
        }
        if ((i & 64) != 0) {
            j7 = c76821UCz.LJI;
        }
        if ((i & 128) != 0) {
            imageModel2 = c76821UCz.LJII;
        }
        if ((i & 256) != 0) {
            battleTaskGiftAmountGuide2 = c76821UCz.LJIIIIZZ;
        }
        c76821UCz.getClass();
        o.LJIIIZ(taskResult, "taskResult");
        return new C76821UCz(j8, j6, j9, battlePrompt2, j5, taskResult, j7, imageModel2, battleTaskGiftAmountGuide2);
    }
}
