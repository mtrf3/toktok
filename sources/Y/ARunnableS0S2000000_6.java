package Y;

import X.C16880lQ;
import X.C198517qh;
import X.C2NU;
import X.C78685UuP;
import X.EF7;
import X.FMX;
import X.FPW;
import X.FUA;
import X.FVJ;
import X.FW5;
import X.GPR;
import X.PJY;
import X.PJZ;
import X.PK0;
import X.PK8;
import X.V3N;
import X.X1D;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.ss.android.ugc.aweme.common.MobClick;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ARunnableS0S2000000_6 implements Runnable {
    public final int $t;
    public String s0;
    public String s1;

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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        long j;
        File file = new File(this.s0);
        if (file.exists() && file.isDirectory()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[logFileInfo]: current creation id: ");
            LIZ.append(this.s1);
            GPR.LIZIZ("", X1D.LIZIZ(LIZ));
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isFile()) {
                        j = file2.length();
                    } else {
                        j = -1;
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("[logFileInfo]: file path : ");
                    LIZ2.append(file2);
                    LIZ2.append(" exist : ");
                    LIZ2.append(file2.exists());
                    LIZ2.append(", size: ");
                    LIZ2.append(j);
                    GPR.LIZIZ("", X1D.LIZIZ(LIZ2));
                }
            }
        }
    }

    public final void LIZ$1() {
        boolean z;
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("message", this.s0);
        EF7.LIZIZ();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        c198517qh.LIZ.put("network_connected", Boolean.valueOf(z));
        c198517qh.LIZ.put("mainCreate2ResumeDuration", Long.valueOf(FW5.LJFF));
        c198517qh.LIZ.put("sMainActivityCreate2FeedRequestDuration", Long.valueOf(FW5.LJI));
        c198517qh.LIZ.put("requestId", this.s1);
        FUA.LIZJ("aweme_feed_0vv", c198517qh.LJ());
    }

    public final void LIZ$2() {
        boolean z;
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("fake_reason", this.s0);
        c198517qh.LIZ.put("fake_type", this.s1);
        EF7.LIZIZ();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        c198517qh.LIZ.put("has_network", String.valueOf(z));
        c198517qh.LIZ.put("mainCreate2ResumeDuration", Long.valueOf(FW5.LJFF));
        c198517qh.LIZ.put("sMainActivityCreate2FeedRequestDuration", Long.valueOf(FW5.LJI));
        JSONObject LJ = c198517qh.LJ();
        MobClick obtain = MobClick.obtain();
        obtain.setEventName("fake_feed_response");
        obtain.setLabelName("perf_monitor");
        obtain.setJsonObject(LJ);
        FMX.onEvent(obtain);
        FMX.LJIILJJIL("fake_feed_response", LJ);
        FVJ.LIZIZ("fake_feed_response", System.currentTimeMillis(), LJ);
    }

    public final void LIZ$3() {
        if (V3N.LJLJI == null) {
            V3N.LJLJI = new HashMap();
            File file = new File(C16880lQ.LLIIJLIL(PK0.LIZ), "/npth/selflib/");
            String[] list = file.list();
            if (list != null) {
                for (String str : list) {
                    if (str.endsWith(".ver")) {
                        String substring = str.substring(0, str.length() - 4);
                        try {
                            HashMap hashMap = V3N.LJLJI;
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append(file.getAbsolutePath());
                            LIZ.append("/");
                            LIZ.append(str);
                            hashMap.put(substring, PK8.LJFF(X1D.LIZIZ(LIZ)));
                        } catch (Throwable th) {
                            PJZ.LIZ.getClass();
                            PJY.LIZ("NPTH_CATCH", th);
                        }
                    } else if (!str.endsWith(".so")) {
                        PK8.LIZJ(new File(file, str));
                    }
                }
            }
        }
        String str2 = this.s0;
        if (!this.s1.equals(V3N.LJLJI.get(str2)) || !new File(V3N.LJIIJ(str2)).exists()) {
            File file2 = new File(V3N.LJIIJ(this.s0));
            file2.getParentFile().mkdirs();
            if (file2.exists()) {
                C16880lQ.LLLZZIL(file2);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("doUnpackLibrary: ");
            LIZ2.append(this.s0);
            X1D.LIZIZ(LIZ2);
            C78685UuP.LJLILLLLZI();
            Context context = PK0.LIZ;
            String str3 = this.s0;
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (FPW.LIZ(file2, applicationInfo.sourceDir, str3) != null) {
                String[] strArr = applicationInfo.splitSourceDirs;
                if (strArr != null) {
                    for (String str4 : strArr) {
                        if (FPW.LIZ(file2, str4, str3) != null) {
                        }
                    }
                    return;
                }
                return;
            }
            V3N.LJLJI.put(file2.getName(), this.s1);
            try {
                String str5 = this.s0;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(C16880lQ.LLIIJLIL(PK0.LIZ));
                LIZ3.append("/npth/selflib/");
                LIZ3.append(str5);
                LIZ3.append(".ver");
                PK8.LJIILJJIL(new File(X1D.LIZIZ(LIZ3)), this.s1, false);
            } catch (Throwable unused) {
            }
        }
    }

    public static final void run$0(ARunnableS0S2000000_6 aRunnableS0S2000000_6) {
        boolean LIZ;
        try {
            aRunnableS0S2000000_6.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S2000000_6 aRunnableS0S2000000_6) {
        boolean LIZ;
        try {
            aRunnableS0S2000000_6.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS0S2000000_6 aRunnableS0S2000000_6) {
        boolean LIZ;
        try {
            aRunnableS0S2000000_6.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS0S2000000_6 aRunnableS0S2000000_6) {
        boolean LIZ;
        try {
            aRunnableS0S2000000_6.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S2000000_6(String str, String str2, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
