package X;

import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.List;

/* loaded from: classes8.dex */
public final class IAO extends QXX {
    public static final C1UB<IAO> LJLJJL = new C1UB<>(1);
    public List<TimeSpeedModelExtension> LJLIL;
    public long LJLILLLLZI;
    public TimeSpeedModelExtension LJLJI;
    public boolean LJLJJI;

    public IAO() {
        super((Object) null);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecordingProgressUpdateEvent{timeSpeedModels=");
        LIZ.append(this.LJLIL);
        LIZ.append(", elapsedTimeInMicros=");
        return C47135Ieh.LIZIZ(LIZ, this.LJLILLLLZI, '}', LIZ);
    }

    public static IAO LLLLZ(long j, List list, boolean z) {
        IAO LIZIZ = LJLJJL.LIZIZ();
        if (LIZIZ == null) {
            LIZIZ = new IAO();
        }
        LIZIZ.LJLJI = null;
        LIZIZ.LJLIL = list;
        LIZIZ.LJLILLLLZI = j;
        LIZIZ.LJLJJI = z;
        return LIZIZ;
    }

    public static IAO LLLLZIL(HCA hca, long j, TimeSpeedModelExtension timeSpeedModelExtension) {
        IAO LLLLZ = LLLLZ(j, hca, false);
        LLLLZ.LJLJI = timeSpeedModelExtension;
        return LLLLZ;
    }
}
