package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.account.network.ttp.IgnoredResponse;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.FgD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39585FgD<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ int LJFF;

    public C39585FgD(String str, String str2, int i, int i2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = i2;
    }

    @Override // X.C10I
    public final Object then(C10K c10k) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (C82544WaS.LJ(c10k) && TextUtils.equals(((IgnoredResponse) c10k.LJIIJJI()).message, "success")) {
            i = 1;
        } else {
            i = 0;
        }
        Integer LIZJ = C39584FgC.LIZJ(c10k.LJIIJ());
        if (LIZJ != null) {
            i2 = LIZJ.intValue();
        } else {
            i2 = 0;
        }
        String str = this.LIZ;
        String str2 = this.LIZIZ;
        int i5 = this.LIZJ;
        String str3 = this.LIZLLL;
        String str4 = this.LJ;
        if (this.LJFF != 0) {
            i4 = 1;
        }
        HH1.LIZ(str, "domain", str2, "hashId", str4, "result");
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("domain", str);
        c198517qh.LIZ.put("hashed_id", str2);
        c198517qh.LIZ.put("type", Integer.valueOf(i5));
        c198517qh.LIZ.put("platform_app_id", str3);
        c198517qh.LIZ.put("result", str4);
        c198517qh.LIZ.put("is_retry", Integer.valueOf(i4));
        c198517qh.LIZ.put("error_code", Integer.valueOf(i2));
        JSONObject LJ = c198517qh.LJ();
        o.LJIIIIZZ(LJ, "newBuilder()\n           …ode)\n            .build()");
        Q13.LIZIZ("monitor_login_ttp_region_alert", i ^ 1, LJ);
        if (i == 0 && (i3 = this.LJFF) <= 3) {
            C66569QAr.LJI(this.LIZ, this.LIZIZ, this.LIZJ, i3 + 1, this.LIZLLL, this.LJ);
        }
        return C76800UCe.LIZ;
    }
}
