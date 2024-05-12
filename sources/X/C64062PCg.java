package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import org.json.JSONObject;

/* renamed from: X.PCg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64062PCg implements InterfaceC64090PDi {
    public final String LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final int LJI;
    public final JSONObject LJII;

    @Override // X.InterfaceC64090PDi
    public final String LIZIZ() {
        return null;
    }

    @Override // X.InterfaceC64090PDi
    public final boolean LIZJ() {
        return true;
    }

    @Override // X.InterfaceC64090PDi
    public final boolean LIZLLL(JSONObject jSONObject) {
        return false;
    }

    @Override // X.InterfaceC64090PDi
    public final String LJ() {
        return null;
    }

    @Override // X.InterfaceC64090PDi
    public final JSONObject LIZ() {
        if (TextUtils.isEmpty(this.LIZ)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("log_type", this.LIZ);
            jSONObject.put("duration", this.LIZIZ);
            jSONObject.put("uri", UriProtector.parse(this.LIZLLL));
            long j = this.LIZJ;
            if (j > 0) {
                jSONObject.put("timestamp", j);
            }
            jSONObject.put("status", this.LJI);
            if (!TextUtils.isEmpty(this.LJ)) {
                jSONObject.put(C63832P3k.LIZ, this.LJ);
            }
            if (!TextUtils.isEmpty(this.LJFF)) {
                jSONObject.put("trace_code", this.LJFF);
            } else {
                jSONObject.put("trace_code", "");
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public C64062PCg(String str, long j, long j2, String str2, String str3, String str4, int i, JSONObject jSONObject) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = i;
        if (jSONObject == null) {
            this.LJII = new JSONObject();
        } else {
            this.LJII = jSONObject;
        }
    }
}
