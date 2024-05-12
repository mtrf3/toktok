package Y;

import X.C40700FyC;
import X.C65819PsN;
import X.C65825PsT;
import X.C66370Q3a;
import X.C66371Q3b;
import X.C66372Q3c;
import X.C66388Q3s;
import X.Q3Z;
import android.os.Bundle;
import com.bytedance.vmsdk.jsbridge.utils.SystemThread;
import com.facebook.GraphRequest;
import m43.u;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ARunnableS10S0000100_11 implements Runnable {
    public final int $t;
    public long j0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS10S0000100_11 aRunnableS10S0000100_11) {
        boolean LIZ;
        try {
            SystemThread.nativeRun(aRunnableS10S0000100_11.j0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS10S0000100_11 aRunnableS10S0000100_11) {
        C65825PsT LJFF;
        C66370Q3a LIZIZ;
        String LIZ;
        long j = aRunnableS10S0000100_11.j0;
        if (C40700FyC.LIZ(C66371Q3b.class)) {
            return;
        }
        try {
            if (C66371Q3b.LJFF.LIZ() && (LJFF = C65819PsN.LJFF(u.LIZLLL())) != null && LJFF.LJFF && (LIZIZ = Q3Z.LIZIZ(u.LIZJ())) != null && LIZIZ.LIZ() != null && (LIZ = LIZIZ.LIZ()) != null) {
                Bundle bundle = new Bundle();
                bundle.putString("advertiser_id", LIZ);
                bundle.putString("fields", "auto_event_setup_enabled");
                GraphRequest LJI = C66388Q3s.LJI(null, "app", null);
                LJI.LIZJ = bundle;
                JSONObject jSONObject = LJI.LIZJ().LIZJ;
                if (jSONObject != null) {
                    C66372Q3c c66372Q3c = C66371Q3b.LJI;
                    c66372Q3c.LIZJ = Boolean.valueOf(jSONObject.optBoolean("auto_event_setup_enabled", false));
                    c66372Q3c.LIZLLL = j;
                    C66371Q3b.LIZ.LJIIIIZZ(c66372Q3c);
                }
            }
            C66371Q3b.LIZJ.set(false);
        } catch (Throwable unused) {
        }
    }

    public ARunnableS10S0000100_11(long j, int i) {
        this.$t = i;
        switch (i) {
            case 0:
                this.j0 = j;
                return;
            default:
                this.j0 = j;
                return;
        }
    }
}
