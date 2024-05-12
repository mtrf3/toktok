package com.ttnet.org.chromium.base;

import J.N;
import X.C38772FJo;
import X.VI0;
import X.VI2;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes15.dex */
public class TraceEvent implements AutoCloseable {
    public static volatile boolean LJLILLLLZI;
    public static final AtomicBoolean LJLJI;
    public static boolean LJLJJI;
    public final String LJLIL;

    static {
        new AtomicBoolean();
        LJLJI = new AtomicBoolean();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        String str = this.LJLIL;
        EarlyTraceEvent.LIZJ(str, false);
        if (LJLILLLLZI) {
            N.M5yUVmrW(str, null);
        }
    }

    public TraceEvent(String str) {
        this.LJLIL = str;
        EarlyTraceEvent.LIZ(str, false);
        if (LJLILLLLZI) {
            N.MajVTFsV(str, null);
        }
    }

    public static TraceEvent LIZ(String str) {
        if (!EarlyTraceEvent.LIZIZ() && !LJLILLLLZI) {
            return null;
        }
        return new TraceEvent(str);
    }

    public static void dumpViewHierarchy(long j) {
        ApplicationStatus.LIZ();
    }

    public static void setEnabled(boolean z) {
        VI2 vi2 = null;
        if (z) {
            synchronized (EarlyTraceEvent.LIZIZ) {
                if (EarlyTraceEvent.LIZIZ()) {
                    throw null;
                }
            }
        }
        if (LJLILLLLZI != z) {
            LJLILLLLZI = z;
            Looper looper = ThreadUtils.LIZ().getLooper();
            if (z) {
                vi2 = C38772FJo.LIZ;
            }
            looper.setMessageLogging(vi2);
        }
        if (LJLJI.get()) {
            VI0.LIZ();
        }
    }

    public static void setEventNameFilteringEnabled(boolean z) {
        LJLJJI = z;
    }
}
