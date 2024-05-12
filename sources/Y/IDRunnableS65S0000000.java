package Y;

import X.BZI;
import X.C04390Ff;
import X.C09590Zf;
import X.C09900aA;
import X.C0M2;
import X.C16950lX;
import X.C17010ld;
import X.C1EO;
import X.C1FP;
import X.C25500zK;
import X.C28787BRn;
import X.C36381bm;
import X.C36401bo;
import X.C36711cJ;
import X.C38016Ew0;
import X.C47261Igj;
import X.F9U;
import X.PF6;
import X.PFB;
import X.PFC;
import X.X1D;
import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class IDRunnableS65S0000000 implements Runnable {
    public final int $t;

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
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            default:
                return;
        }
    }

    public static void LIZ$0() {
        C1EO c1eo;
        C47261Igj.LJIILJJIL(C1EO.LIZ);
        C04390Ff c04390Ff = C04390Ff.LIZIZ;
        if (C1EO.LIZJ.get() && c04390Ff != null) {
            synchronized (c04390Ff) {
                c1eo = c04390Ff.LIZ;
            }
            if (C1EO.LIZLLL != null && c1eo != null && c1eo.LIZIZ(C1EO.LIZLLL) == 0 && C1EO.LIZIZ.get()) {
                c1eo.LIZ();
            }
        }
    }

    public static void LIZ$2() {
        while (true) {
            try {
                if (!C25500zK.LJIJ && C25500zK.LIZ > -1) {
                    C25500zK.LJI = SystemClock.uptimeMillis() - C25500zK.LJII;
                    C25500zK.LJI &= 8796093022207L;
                    SystemClock.sleep(5L);
                } else {
                    Object obj = C25500zK.LJIIZILJ;
                    synchronized (obj) {
                        obj.wait();
                    }
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public static void LIZ$3() {
        C25500zK.LJIIJJI.removeCallbacksAndMessages(null);
        C36401bo c36401bo = C25500zK.LJIJJ;
        if (c36401bo != null) {
            CopyOnWriteArrayList<PFB> copyOnWriteArrayList = PF6.LIZLLL;
            synchronized (copyOnWriteArrayList) {
                copyOnWriteArrayList.remove(c36401bo);
                C36381bm c36381bm = C36381bm.LJIL;
                if (c36381bm.LJIJ && copyOnWriteArrayList.isEmpty() && c36381bm.LJII() == 0) {
                    PF6.LIZ();
                }
            }
        }
        C25500zK.LJIIJ.quit();
        C25500zK.LIZLLL = null;
    }

    public static void LIZ$1() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("bytebench_");
        LIZ.append(C09590Zf.LJIILLIIL.LIZJ);
        String string = Keva.getRepo(X1D.LIZIZ(LIZ)).getString("LocalAggregationProtocol", "");
        if (string == null || string.isEmpty()) {
            C47261Igj.LJIILL("ByteBenchFeatureCenter");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                JSONArray optJSONArray = JSONObjectProtectorUtils.getJSONObject(jSONObject, keys.next()).optJSONArray("need_event_list");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        String optString = JSONArrayProtectorUtils.getJSONObject(optJSONArray, i).optString("origin_event");
                        if (!optString.isEmpty()) {
                            C1FP.LJLILLLLZI.add(optString);
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("need event: ");
                            LIZ2.append(optString);
                            X1D.LIZIZ(LIZ2);
                            C47261Igj.LJIILJJIL("ByteBenchFeatureCenter");
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public IDRunnableS65S0000000(int i) {
        this.$t = i;
    }

    public static final void run$0(IDRunnableS65S0000000 iDRunnableS65S0000000) {
        boolean LIZ;
        try {
            LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(IDRunnableS65S0000000 iDRunnableS65S0000000) {
        boolean LIZ;
        try {
            LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(IDRunnableS65S0000000 iDRunnableS65S0000000) {
        boolean LIZ;
        try {
            synchronized (C25500zK.LIZJ) {
                if (C25500zK.LIZ == Integer.MAX_VALUE || C25500zK.LIZ == -4) {
                    C25500zK.LIZ = -3;
                    C25500zK.LIZIZ = true;
                    C25500zK.LJIIIZ = new IDRunnableS65S0000000(11);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(IDRunnableS65S0000000 iDRunnableS65S0000000) {
        boolean LIZ;
        try {
            LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(IDRunnableS65S0000000 iDRunnableS65S0000000) {
        boolean LIZ;
        try {
            synchronized (C25500zK.LIZJ) {
                if (C25500zK.LIZ == Integer.MAX_VALUE || C25500zK.LIZ == 1) {
                    C25500zK.LIZ = -2;
                    C25500zK.LIZIZ = true;
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(IDRunnableS65S0000000 iDRunnableS65S0000000) {
        boolean LIZ;
        try {
            C36711cJ.LIZ.LJIIIIZZ();
            C36711cJ.LJI = C38016Ew0.LIZLLL.schedule(iDRunnableS65S0000000, C36711cJ.LIZLLL.timerTriggerInterval, TimeUnit.MILLISECONDS);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(IDRunnableS65S0000000 iDRunnableS65S0000000) {
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_network_error");
        LIZ.LJIJJ(String.valueOf(1), "error_type");
        LIZ.LJJIIJZLJL();
    }

    public static final void run$2(IDRunnableS65S0000000 iDRunnableS65S0000000) {
        boolean LIZ;
        try {
            C0M2 LIZ2 = C0M2.LIZ();
            LIZ2.getClass();
            F9U.LIZ.LIZJ(new IDRunnableS3S0100100(LIZ2, SystemClock.uptimeMillis(), 0));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(IDRunnableS65S0000000 iDRunnableS65S0000000) {
        boolean LIZ;
        try {
            PFC.LJLJLLL.getClass();
            PFC.LJLLLL = true;
            C0M2 LIZ2 = C0M2.LIZ();
            LIZ2.getClass();
            F9U.LIZ.LIZJ(new IDRunnableS85S0100000(LIZ2, 68));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(IDRunnableS65S0000000 iDRunnableS65S0000000) {
        boolean LIZ;
        try {
            C0M2 LIZ2 = C0M2.LIZ();
            LIZ2.getClass();
            F9U.LIZ.LIZJ(new IDRunnableS85S0100000(LIZ2, 69));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(IDRunnableS65S0000000 iDRunnableS65S0000000) {
        boolean LIZ;
        try {
            C09900aA.LJIILLIIL("Apm#init", "Apm init");
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(IDRunnableS65S0000000 iDRunnableS65S0000000) {
        boolean LIZ;
        try {
            C09900aA.LJIILLIIL("Apm#start", "Apm start");
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(IDRunnableS65S0000000 iDRunnableS65S0000000) {
        boolean LIZ;
        try {
            C09900aA.LJIILLIIL("Apm#init", "Apm init");
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(IDRunnableS65S0000000 iDRunnableS65S0000000) {
        boolean LIZ;
        try {
            if (C16950lX.LIZIZ) {
                try {
                    C17010ld.LIZ();
                } catch (Exception unused) {
                }
                try {
                    C17010ld.LIZIZ();
                } catch (Exception unused2) {
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(IDRunnableS65S0000000 iDRunnableS65S0000000) {
        boolean LIZ;
        try {
            LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }
}
