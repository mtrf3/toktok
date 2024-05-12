package X;

import com.ss.android.vesdk.VERecorder;
import kotlin.jvm.internal.o;

/* renamed from: X.ICi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46228ICi implements F4V {
    public final VERecorder LJLIL;

    @Override // X.F4V
    public final int getPriority() {
        return T4L.LIZ();
    }

    public C46228ICi(VERecorder recorder) {
        o.LJIIIZ(recorder, "recorder");
        this.LJLIL = recorder;
    }

    @Override // X.F4V
    public final ERS LIZLLL(ERN ern, T4S session) {
        o.LJIIIZ(session, "session");
        if (session instanceof T4Q) {
            VERecorder enableFastCVProcessArbiter = this.LJLIL;
            o.LJIIIZ(enableFastCVProcessArbiter, "$this$enableFastCVProcessArbiter");
            enableFastCVProcessArbiter.LIZIZ.enableFastCVProcess(0, false);
        } else if (session instanceof T4R) {
            VERecorder enableFastCVProcessArbiter2 = this.LJLIL;
            o.LJIIIZ(enableFastCVProcessArbiter2, "$this$enableFastCVProcessArbiter");
            enableFastCVProcessArbiter2.LIZIZ.enableFastCVProcess(0, true);
        }
        return ern.LIZ(session);
    }
}
