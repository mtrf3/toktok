package X;

import com.ss.android.ugc.aweme.trace.IPageTraceApi;
import com.ss.android.ugc.aweme.trace.PageTraceApiImpl;
import org.json.JSONObject;

/* renamed from: X.POs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64386POs implements IPageTraceApi {
    public static final C64386POs LIZIZ = new C64386POs();
    public final /* synthetic */ IPageTraceApi LIZ;

    @Override // com.ss.android.ugc.aweme.trace.IPageTraceApi
    public final String LIZIZ(String str) {
        return this.LIZ.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.trace.IPageTraceApi
    public final void LIZJ(NDG ndg, JSONObject jSONObject) {
        this.LIZ.LIZJ(ndg, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.trace.IPageTraceApi
    public final OSZ<String, String> LIZLLL(String str) {
        return this.LIZ.LIZLLL(str);
    }

    @Override // com.ss.android.ugc.aweme.trace.IPageTraceApi
    public final void LJ(NDG ndg, JSONObject jSONObject) {
        this.LIZ.LJ(ndg, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.trace.IPageTraceApi
    public final void LJFF(NDG ndg, JSONObject jSONObject) {
        this.LIZ.LJFF(ndg, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.trace.IPageTraceApi
    public final void LJI(NDG ndg, JSONObject jSONObject) {
        this.LIZ.LJI(ndg, jSONObject);
    }

    public C64386POs() {
        IPageTraceApi iPageTraceApi;
        Object LIZ = C58096Mr6.LIZ(IPageTraceApi.class, false);
        if (LIZ != null) {
            iPageTraceApi = (IPageTraceApi) LIZ;
        } else {
            if (C58096Mr6.E7 == null) {
                synchronized (IPageTraceApi.class) {
                    if (C58096Mr6.E7 == null) {
                        C58096Mr6.E7 = new PageTraceApiImpl();
                    }
                }
            }
            iPageTraceApi = C58096Mr6.E7;
        }
        this.LIZ = iPageTraceApi;
    }
}
