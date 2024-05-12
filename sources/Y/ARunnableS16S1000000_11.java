package Y;

import X.C39223FaN;
import X.C64089PDh;
import X.C64096PDo;
import X.C64214PIc;
import X.C64248PJk;
import X.C64268PKe;
import X.F9U;
import X.PFF;
import X.PFM;
import X.PKN;
import X.PRZ;
import com.bytedance.crash.CrashType;
import com.bytedance.monitor.collector.LockMonitorManager;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ARunnableS16S1000000_11 implements Runnable {
    public final int $t;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        PKN pkn = new PKN();
        pkn.LJIIJJI("data", this.s0);
        pkn.LJIIJJI("userdefine", 1);
        PKN LIZ = C64268PKe.LIZLLL().LIZ(CrashType.CUSTOM_JAVA, pkn);
        if (LIZ != null) {
            C64248PJk LIZIZ = C64248PJk.LIZIZ();
            JSONObject jSONObject = LIZ.LIZ;
            LIZIZ.getClass();
            if (jSONObject == null || jSONObject.length() == 0) {
                return;
            }
            C64214PIc.LIZ().LIZ(new ARunnableS47S0100000_11(jSONObject, 88));
        }
    }

    public static final void run$0(ARunnableS16S1000000_11 aRunnableS16S1000000_11) {
        boolean LIZ;
        try {
            PRZ.LIZ(aRunnableS16S1000000_11.s0).LJIIL();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS16S1000000_11 aRunnableS16S1000000_11) {
        boolean LIZ;
        try {
            PRZ.LIZ(aRunnableS16S1000000_11.s0).LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS16S1000000_11 aRunnableS16S1000000_11) {
        boolean LIZ;
        try {
            PRZ.LIZ(aRunnableS16S1000000_11.s0).LJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS16S1000000_11 aRunnableS16S1000000_11) {
        try {
            PFF LIZ = PFF.LIZ(aRunnableS16S1000000_11.s0);
            if (LIZ != null) {
                F9U.LIZ.LIZJ(new ARunnableS47S0100000_11(LIZ, 27));
                for (PFM pfm : LockMonitorManager.sOnLockListenerList) {
                    if (pfm != null) {
                        pfm.LIZ();
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static final void run$4(ARunnableS16S1000000_11 aRunnableS16S1000000_11) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("evil_method_section", aRunnableS16S1000000_11.s0);
            C64089PDh.LJIIJ().LIZLLL(new C64096PDo("evil_method_tracing", 0, null, jSONObject, null, null));
        } catch (JSONException unused) {
        } catch (Throwable th) {
            if (C39223FaN.LIZ(th)) {
            } else {
                throw th;
            }
        }
    }

    public static final void run$5(ARunnableS16S1000000_11 aRunnableS16S1000000_11) {
        boolean LIZ;
        try {
            aRunnableS16S1000000_11.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS16S1000000_11(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
