package X;

import com.ss.android.ugc.aweme.trace.AwemeTraceLogAdapter;
import com.ss.android.ugc.aweme.trace.IAwemeTraceLogAdapter;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PP2 implements IAwemeTraceLogAdapter {
    public static final PP2 LIZIZ = new PP2();
    public final /* synthetic */ IAwemeTraceLogAdapter LIZ;

    @Override // com.ss.android.ugc.aweme.trace.IAwemeTraceLogAdapter
    public final void LIZ(String str, JSONObject jSONObject) {
        this.LIZ.LIZ(str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.trace.IAwemeTraceLogAdapter
    public final void LIZIZ(JSONObject jSONObject, String str, boolean z) {
        this.LIZ.LIZIZ(jSONObject, str, z);
    }

    @Override // com.ss.android.ugc.aweme.trace.IAwemeTraceLogAdapter
    public final void LIZJ(int i, String str, String str2, long j, String str3) {
        this.LIZ.LIZJ(i, str, str2, j, str3);
    }

    @Override // com.ss.android.ugc.aweme.trace.IAwemeTraceLogAdapter
    public final String LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.trace.IAwemeTraceLogAdapter
    public final void LJ(String str, JSONObject jSONObject) {
        this.LIZ.LJ(str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.trace.IAwemeTraceLogAdapter
    public final String LJFF(String str) {
        return this.LIZ.LJFF(str);
    }

    public PP2() {
        IAwemeTraceLogAdapter iAwemeTraceLogAdapter;
        Object LIZ = C58096Mr6.LIZ(IAwemeTraceLogAdapter.class, false);
        if (LIZ != null) {
            iAwemeTraceLogAdapter = (IAwemeTraceLogAdapter) LIZ;
        } else {
            if (C58096Mr6.D7 == null) {
                synchronized (IAwemeTraceLogAdapter.class) {
                    if (C58096Mr6.D7 == null) {
                        C58096Mr6.D7 = new AwemeTraceLogAdapter();
                    }
                }
            }
            iAwemeTraceLogAdapter = C58096Mr6.D7;
        }
        this.LIZ = iAwemeTraceLogAdapter;
    }
}
