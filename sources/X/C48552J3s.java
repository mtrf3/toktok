package X;

import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.J3s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48552J3s {
    public final String LIZ;
    public final OnePlaytimePredictConfig LIZIZ;
    public int LIZJ;
    public long LIZLLL;
    public int LJ;
    public int LJFF;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("(scene='");
        LIZ.append(this.LIZ);
        LIZ.append("', isRunning=");
        LIZ.append(false);
        LIZ.append(", runCount:");
        LIZ.append(this.LJFF);
        LIZ.append(", skipFeedCount=");
        LIZ.append(this.LJ);
        LIZ.append(", skipTimes=");
        LIZ.append(this.LIZJ);
        LIZ.append(", lastRunTime=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", config:");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C48552J3s(String str, OnePlaytimePredictConfig config) {
        o.LJIIIZ(config, "config");
        this.LIZ = str;
        this.LIZIZ = config;
    }
}
