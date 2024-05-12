package X;

import android.util.Pair;
import com.bytedance.monitor.collector.MonitorJni;

/* loaded from: classes12.dex */
public final class PEQ extends PEL {
    @Override // X.PEL
    public final Pair<String, ?> LIZ() {
        String doDumpAtrace;
        try {
            if (!C64125PEr.LJIIJJI) {
                return null;
            }
            String str = this.LIZ;
            if (!C64125PEr.LJIIJJI) {
                doDumpAtrace = null;
            } else {
                doDumpAtrace = MonitorJni.doDumpAtrace();
            }
            return new Pair<>(str, doDumpAtrace);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // X.PEL
    public final void LIZLLL(int i) {
    }

    public PEQ(int i) {
        super(i, "atrace_event");
    }

    @Override // X.PEL
    public final Pair<String, ?> LIZIZ(long j, long j2) {
        String doDumpAtraceRange;
        try {
            if (!C64125PEr.LJIIJJI) {
                return null;
            }
            String str = this.LIZ;
            if (!C64125PEr.LJIIJJI) {
                doDumpAtraceRange = null;
            } else {
                doDumpAtraceRange = MonitorJni.doDumpAtraceRange(j, j2);
            }
            return new Pair<>(str, doDumpAtraceRange);
        } catch (Throwable unused) {
            return null;
        }
    }
}
