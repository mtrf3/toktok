package X;

import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes15.dex */
public final class VEQ {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public final VEX LIZIZ;
    public final InterfaceC61096NyO LIZJ;

    public VEQ(InterfaceC61096NyO interfaceC61096NyO) {
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZJ = interfaceC61096NyO;
        if (VEX.LIZJ()) {
            this.LIZIZ = new VEX();
        }
    }

    public final void LIZ(String str, VES ves) {
        if (this.LIZJ != null) {
            TraceEvent.LIZIZ("Using DynamicComponentFetcher");
            this.LIZJ.LIZ(str, new VER(ves));
            TraceEvent.LJ("Using DynamicComponentFetcher");
            return;
        }
        ves.LIZ(null, new Throwable("No available provider or fetcher"));
    }

    public final void LIZIZ(String str, VES ves) {
        if (this.LIZ.get()) {
            TraceEvent.LIZIZ("Using LynxResourceServiceProvider");
            VEX vex = this.LIZIZ;
            if (vex != null) {
                vex.LIZ(new C08200Tw(str), new VEP(this, str, ves));
                TraceEvent.LJ("Using LynxResourceServiceProvider");
                return;
            } else {
                LLog.LIZLLL(3, "LynxExternalResourceFetcherWrapper", "LynxResourceServiceProvider is null, switch to the fetchers registered in by host. ");
                TraceEvent.LJ("Using LynxResourceServiceProvider");
            }
        }
        LIZ(str, ves);
    }
}
