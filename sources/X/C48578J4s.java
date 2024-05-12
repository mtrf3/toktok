package X;

import com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig;
import com.ss.android.ugc.aweme.ml.feature.SmartDataTrackerServiceImpl;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.J4s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48578J4s {
    public final String LIZ;
    public final OneSmartDataTrackConfig LIZIZ;
    public int LIZJ;
    public final LinkedList<SmartDataTrackerServiceImpl.TrackerMonitorData> LIZLLL;
    public final int LJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("(scene='");
        LIZ.append(this.LIZ);
        LIZ.append("', runCount:");
        LIZ.append(this.LIZJ);
        LIZ.append(" config:");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C48578J4s(String str, OneSmartDataTrackConfig config) {
        o.LJIIIZ(config, "config");
        this.LIZ = str;
        this.LIZIZ = config;
        this.LIZLLL = new LinkedList<>();
        this.LJ = 16;
    }
}
