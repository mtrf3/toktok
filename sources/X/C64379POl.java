package X;

import com.ss.android.ugc.aweme.trace.TraceLogConfig;

/* renamed from: X.POl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64379POl extends AbstractC65781Prl implements InterfaceC65784Pro<TraceLogConfig> {
    public static final C64379POl LJLIL = new C64379POl();

    public C64379POl() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final TraceLogConfig invoke() {
        try {
            FFL LJIIIZ = FFL.LJIIIZ();
            TraceLogConfig traceLogConfig = C64377POj.LIZIZ;
            LJIIIZ.getClass();
            TraceLogConfig traceLogConfig2 = (TraceLogConfig) FFL.LJIJ(true, "ttk_trace_log_configs", 31744, TraceLogConfig.class, traceLogConfig);
            if (traceLogConfig2 == null) {
                C64377POj.LIZ.getClass();
                return traceLogConfig;
            }
            return traceLogConfig2;
        } catch (Throwable unused) {
            C64377POj.LIZ.getClass();
            return C64377POj.LIZIZ;
        }
    }
}
