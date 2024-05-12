package X;

import com.ss.android.ugc.aweme.experiment.LogInterceptImpl;
import com.ss.android.ugc.aweme.performanceopt.api.ILogInterceptApi;
import org.json.JSONObject;

/* renamed from: X.3PG, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3PG implements ILogInterceptApi {
    public static final C3PG LIZIZ = new C3PG();
    public final /* synthetic */ ILogInterceptApi LIZ;

    @Override // com.ss.android.ugc.aweme.performanceopt.api.ILogInterceptApi
    public final boolean LIZ(String str) {
        return this.LIZ.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.ILogInterceptApi
    public final boolean LIZIZ(String str, JSONObject jSONObject) {
        return this.LIZ.LIZIZ(str, jSONObject);
    }

    public C3PG() {
        ILogInterceptApi iLogInterceptApi;
        Object LIZ = C58096Mr6.LIZ(ILogInterceptApi.class, false);
        if (LIZ != null) {
            iLogInterceptApi = (ILogInterceptApi) LIZ;
        } else {
            if (C58096Mr6.r0 == null) {
                synchronized (ILogInterceptApi.class) {
                    if (C58096Mr6.r0 == null) {
                        C58096Mr6.r0 = new LogInterceptImpl();
                    }
                }
            }
            iLogInterceptApi = C58096Mr6.r0;
        }
        this.LIZ = iLogInterceptApi;
    }
}
