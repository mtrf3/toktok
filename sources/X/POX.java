package X;

import com.ss.android.ugc.aweme.trace.ITraceLogWrapApi;
import com.ss.android.ugc.aweme.trace.TraceLogWrapApiImpl;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class POX implements ITraceLogWrapApi {
    public static final POX LIZIZ = new POX();
    public final /* synthetic */ ITraceLogWrapApi LIZ;

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final void LIZ(POZ logSource, POS pos) {
        o.LJIIIZ(logSource, "logSource");
        this.LIZ.LIZ(logSource, pos);
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final void LIZIZ(String traceId) {
        o.LJIIIZ(traceId, "traceId");
        this.LIZ.LIZIZ(traceId);
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final void LIZJ(String traceId) {
        o.LJIIIZ(traceId, "traceId");
        this.LIZ.LIZJ(traceId);
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final void LIZLLL(POZ logSource, POT pot) {
        o.LJIIIZ(logSource, "logSource");
        this.LIZ.LIZLLL(logSource, pot);
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final void LJ(String str, JSONObject jSONObject) {
        this.LIZ.LJ(str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final void LJFF(String traceId, String str, String str2) {
        o.LJIIIZ(traceId, "traceId");
        this.LIZ.LJFF(traceId, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final String LJI(String parentSpanId) {
        o.LJIIIZ(parentSpanId, "parentSpanId");
        return this.LIZ.LJI(parentSpanId);
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final String LJII(String traceId) {
        o.LJIIIZ(traceId, "traceId");
        return this.LIZ.LJII(traceId);
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final void LJIIIIZZ(POZ logSource, POV pov) {
        o.LJIIIZ(logSource, "logSource");
        this.LIZ.LJIIIIZZ(logSource, pov);
    }

    @Override // com.ss.android.ugc.aweme.trace.ITraceLogWrapApi
    public final String LJIIIZ(String pageBtm) {
        o.LJIIIZ(pageBtm, "pageBtm");
        return this.LIZ.LJIIIZ(pageBtm);
    }

    public POX() {
        ITraceLogWrapApi iTraceLogWrapApi;
        Object LIZ = C58096Mr6.LIZ(ITraceLogWrapApi.class, false);
        if (LIZ != null) {
            iTraceLogWrapApi = (ITraceLogWrapApi) LIZ;
        } else {
            if (C58096Mr6.G7 == null) {
                synchronized (ITraceLogWrapApi.class) {
                    if (C58096Mr6.G7 == null) {
                        C58096Mr6.G7 = new TraceLogWrapApiImpl();
                    }
                }
            }
            iTraceLogWrapApi = C58096Mr6.G7;
        }
        this.LIZ = iTraceLogWrapApi;
    }
}
