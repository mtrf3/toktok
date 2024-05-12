package X;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.FMb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC38837FMb implements Runnable {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ JSONObject LJLJL;

    public final void LIZ() {
        try {
            Context context = this.LJLIL;
            String str = this.LJLILLLLZI;
            String str2 = this.LJLJI;
            String str3 = this.LJLJJI;
            long j = this.LJLJJL;
            long j2 = this.LJLJJLL;
            JSONObject jSONObject = this.LJLJL;
            if (!TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str)) {
                    str = "event_v1";
                }
                if (!C38354F3m.LJ(null)) {
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    try {
                        jSONObject.put("launch_from", (Object) null);
                    } catch (JSONException unused) {
                    }
                }
                if (context != null) {
                    FMR.LIZ.LIZIZ(str, str2, str3, Long.valueOf(j), Long.valueOf(j2), jSONObject);
                }
            }
        } catch (Exception unused2) {
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC38837FMb(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        this.LJLIL = context;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = j;
        this.LJLJJLL = j2;
        this.LJLJL = jSONObject;
    }
}
