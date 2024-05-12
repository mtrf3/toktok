package X;

import com.ss.android.videoshop.api.stub.AutoPauseResumeLifeCycleHandler;
import com.ss.android.videoshop.context.VideoContext;

/* renamed from: X.Vvb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81307Vvb {
    public long LIZIZ;
    public boolean LIZJ;
    public boolean LJ;
    public AutoPauseResumeLifeCycleHandler LJFF;
    public final VideoContext LJI;
    public long LIZ = 600000;
    public boolean LJII = true;
    public boolean LJIIIIZZ = true;
    public int LIZLLL = 1;

    public final void LIZIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onViewPaused ");
        LIZ.append(Integer.toHexString(hashCode()));
        X1D.LIZIZ(LIZ);
        LIZJ(2);
    }

    public C81307Vvb(VideoContext videoContext) {
        this.LJI = videoContext;
    }

    public final void LIZ(int i) {
        boolean z;
        int i2 = this.LIZLLL;
        if ((i2 & i) == 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("clearStateBitFlag return. mStateBitFlags:");
            LIZ.append(this.LIZLLL);
            LIZ.append(", stateFlag:");
            LIZ.append(i);
            X1D.LIZIZ(LIZ);
            return;
        }
        this.LIZLLL = i2 & (~i);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("clearStateBitFlag mStateBitFlags ");
        LIZ2.append(this.LIZLLL);
        LIZ2.append(" mIsWorking:");
        LIZ2.append(this.LJ);
        LIZ2.append(" mIsAutoPaused:");
        LIZ2.append(this.LIZJ);
        LIZ2.append(" ");
        LIZ2.append(Integer.toHexString(hashCode()));
        X1D.LIZIZ(LIZ2);
        if (this.LJ && this.LIZJ && this.LIZLLL == 0 && i != 0) {
            if (this.LIZIZ > 0 && System.currentTimeMillis() - this.LIZIZ > this.LIZ) {
                z = true;
            } else {
                z = false;
            }
            AutoPauseResumeLifeCycleHandler autoPauseResumeLifeCycleHandler = this.LJFF;
            if (autoPauseResumeLifeCycleHandler != null && autoPauseResumeLifeCycleHandler.onTryAutoResume(z)) {
                this.LIZJ = false;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("autoResumed ");
                LIZ3.append(Integer.toHexString(hashCode()));
                LIZ3.append(", isAutoResumeTimeout:");
                LIZ3.append(z);
                X1D.LIZIZ(LIZ3);
            }
            this.LIZJ = false;
        }
    }

    public final void LIZJ(int i) {
        AutoPauseResumeLifeCycleHandler autoPauseResumeLifeCycleHandler;
        int i2 = this.LIZLLL;
        if ((i2 & i) != 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setStateBitFlag return. mStateBitFlags:");
            LIZ.append(this.LIZLLL);
            LIZ.append(", stateFlag:");
            LIZ.append(i);
            X1D.LIZIZ(LIZ);
            return;
        }
        this.LIZLLL = i2 | i;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("setStateBitFlag mStateBitFlags ");
        LIZ2.append(this.LIZLLL);
        LIZ2.append(" mIsWorking:");
        LIZ2.append(this.LJ);
        LIZ2.append(" mIsAutoPaused:");
        LIZ2.append(this.LIZJ);
        LIZ2.append(" ");
        LIZ2.append(Integer.toHexString(hashCode()));
        X1D.LIZIZ(LIZ2);
        if (this.LJ && i != 0 && (autoPauseResumeLifeCycleHandler = this.LJFF) != null && autoPauseResumeLifeCycleHandler.onTryAutoPause()) {
            this.LIZJ = true;
            this.LIZIZ = System.currentTimeMillis();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("autoPaused ");
            LIZ3.append(Integer.toHexString(hashCode()));
            X1D.LIZIZ(LIZ3);
        }
    }
}
