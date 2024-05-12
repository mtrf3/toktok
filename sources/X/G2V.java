package X;

import android.content.Context;
import com.ss.android.ugc.aweme.trace.IUnsampledTraceLogger;
import com.ss.android.ugc.aweme.trace.UnsampledTraceLoggerImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G2V implements IUnsampledTraceLogger {
    public static final G2V LIZIZ = new G2V();
    public final /* synthetic */ IUnsampledTraceLogger LIZ;

    @Override // com.ss.android.ugc.aweme.trace.IUnsampledTraceLogger
    public final void LIZ(Context context, String str) {
        o.LJIIIZ(context, "context");
        this.LIZ.LIZ(context, str);
    }

    @Override // com.ss.android.ugc.aweme.trace.IUnsampledTraceLogger
    public final void LIZIZ() {
        this.LIZ.LIZIZ();
    }

    public G2V() {
        IUnsampledTraceLogger iUnsampledTraceLogger;
        Object LIZ = C58096Mr6.LIZ(IUnsampledTraceLogger.class, false);
        if (LIZ != null) {
            iUnsampledTraceLogger = (IUnsampledTraceLogger) LIZ;
        } else {
            if (C58096Mr6.H7 == null) {
                synchronized (IUnsampledTraceLogger.class) {
                    if (C58096Mr6.H7 == null) {
                        C58096Mr6.H7 = new UnsampledTraceLoggerImpl();
                    }
                }
            }
            iUnsampledTraceLogger = C58096Mr6.H7;
        }
        this.LIZ = iUnsampledTraceLogger;
    }
}
