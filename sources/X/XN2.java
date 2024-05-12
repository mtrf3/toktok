package X;

import Y.ARunnableS11S0101000_7;
import com.bytedance.ies.effecteditor.swig.METEffectExportErrorCode;
import com.bytedance.ies.effecteditor.swig.UIAnnotationParserExportHandle;
import com.ss.android.vesdk.VERecorder;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes16.dex */
public final class XN2 extends UIAnnotationParserExportHandle {
    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationParserExportHandle
    public final METEffectExportErrorCode effectExportSticker(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        if (IBZ.LIZ().LIZIZ() == null) {
            return METEffectExportErrorCode.METEffectExportErrorCode_NoEffect;
        }
        XN4 xn4 = new XN4();
        XN3 xn3 = new XN3(xn4);
        VERecorder LIZIZ = IBZ.LIZ().LIZIZ();
        Objects.requireNonNull(LIZIZ);
        LIZIZ.LIZIZ.addRecorderStateListener(xn3);
        VERecorder LIZIZ2 = IBZ.LIZ().LIZIZ();
        Objects.requireNonNull(LIZIZ2);
        LIZIZ2.LIZIZ.exportResource(str);
        ScheduledFuture<?> schedule = PRB.LIZ().schedule(new ARunnableS11S0101000_7(2, xn4, 10), 5L, TimeUnit.SECONDS);
        do {
            synchronized (xn4) {
                if (!xn4.LIZ && !xn4.LIZIZ && !xn4.LIZJ) {
                    z = false;
                }
                z = true;
            }
        } while (!z);
        if (!schedule.isDone()) {
            schedule.cancel(true);
        }
        VERecorder LIZIZ3 = IBZ.LIZ().LIZIZ();
        Objects.requireNonNull(LIZIZ3);
        LIZIZ3.LIZIZ.removeRecorderStateListener(xn3);
        synchronized (xn4) {
            z2 = xn4.LIZIZ;
            z3 = xn4.LIZJ;
        }
        if (z2) {
            return METEffectExportErrorCode.METEffectExportErrorCode_Failed;
        }
        if (z3) {
            return METEffectExportErrorCode.METEffectExportErrorCode_Timeout;
        }
        return METEffectExportErrorCode.METEffectExportErrorCode_None;
    }
}
