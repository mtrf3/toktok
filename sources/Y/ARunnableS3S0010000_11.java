package Y;

import X.C16880lQ;
import X.C171096nZ;
import X.C48175IvT;
import X.C48292IxM;
import X.C5S1;
import X.C64131PEx;
import X.C64214PIc;
import X.C64225PIn;
import X.C64241PJd;
import X.C64256PJs;
import X.C64263PJz;
import X.C64264PKa;
import X.C64268PKe;
import X.C64278PKo;
import X.C64304PLo;
import X.C64305PLp;
import X.C64307PLr;
import X.C77412UZs;
import X.C78685UuP;
import X.C85999Xp5;
import X.C86305Xu1;
import X.EF7;
import X.OSZ;
import X.PJ7;
import X.PJA;
import X.PJC;
import X.PJD;
import X.PJY;
import X.PJZ;
import X.PK0;
import X.PKG;
import X.PKO;
import X.PKQ;
import X.PKZ;
import X.PL1;
import X.PL9;
import X.PLD;
import X.PN9;
import X.RunnableC64270PKg;
import X.X1D;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import com.bytedance.crash.Npth;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.services.apm.api.IFdCheck;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.List;

/* loaded from: classes12.dex */
public class ARunnableS3S0010000_11 implements Runnable {
    public final int $t;
    public boolean z0;

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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        boolean z = this.z0;
        PJ7.LJ();
        Context context = PK0.LIZ;
        C64268PKe.LIZLLL();
        C64256PJs LIZIZ = C64256PJs.LIZIZ();
        int i = 0;
        if (LIZIZ.LJ == -1) {
            File file = LIZIZ.LIZ;
            if (LIZIZ.LJI == null) {
                File[] listFiles = file.listFiles(new C48175IvT());
                LIZIZ.LJI = listFiles;
                if (listFiles == null) {
                    LIZIZ.LJI = new File[0];
                }
            }
            File[] fileArr = LIZIZ.LJI;
            if (fileArr == null || fileArr.length == 0) {
                LIZIZ.LJ = 2;
            }
        }
        try {
            C64225PIn.LIZ();
        } catch (Throwable unused) {
        }
        try {
            PKG.LIZ = new ARunnableS13S0000000_6(13);
            PKG.LIZIZ = new C64304PLo();
            PKG.LIZJ = new C64305PLp();
        } catch (Throwable unused2) {
        }
        try {
            C64307PLr.LIZ = true;
        } catch (Throwable unused3) {
        }
        try {
            if (C64131PEx.LIZ != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("npth_logcat");
                LIZ.append(".so");
                PJC.LJIIJ(PK0.LJIIJJI, X1D.LIZIZ(LIZ), "0.0.3-rc.2-ttp");
                if (NativeImpl.LIZLLL) {
                    C64214PIc.LIZ().LIZ(new ARunnableS0S2000000_6("npth_logcat", "0.0.3-rc.2-ttp", 3));
                }
            }
            if (C64131PEx.LIZ != null) {
                Npth.registerSdk("npth_logcat", "0.0.3-rc.2-ttp");
            }
        } catch (Throwable unused4) {
        }
        try {
            PK0.LJIIIZ.save();
        } catch (Exception unused5) {
        }
        int LIZIZ2 = NativeImpl.LIZIZ();
        if (PKZ.LJ) {
            PJZ.LIZ.getClass();
            PJY.LIZJ("NativeLibraryLoad faild", "EnsureNotReachHere", null);
        } else if (LIZIZ2 < 0) {
            PJZ.LIZ.getClass();
            PJY.LIZJ("createCallbackThread faild", "EnsureNotReachHere", null);
        }
        if (!PKQ.LIZ) {
            PKQ.LIZ = true;
            if (!PJA.LIZ()) {
                PKQ.LIZIZ();
                synchronized (PKQ.class) {
                    C78685UuP.LJJJLL();
                    new PthreadThread(new ARunnableS18S0000000_11(33), "monitor-terminal").start();
                }
            }
            if (PLD.LIZLLL && !PJA.LIZ()) {
                File file2 = PKQ.LIZJ;
                if (!PKO.LIZJ) {
                    C78685UuP.LJJJLL();
                    PKO.LIZJ = true;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("proc/");
                    LIZ2.append(Process.myPid());
                    File file3 = new File(file2, X1D.LIZIZ(LIZ2));
                    file3.mkdirs();
                    new PL9(file3.getAbsolutePath(), file3).startWatching();
                }
            }
        }
        C64214PIc.LIZ().LIZJ(new RunnableC64270PKg(i, context), 0);
        if (z) {
            C48292IxM.LIZJ(context).LJII();
            new PthreadThread(new ARunnableS18S0000000_11(8), "NPTH-AnrMonitor").start();
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS18S0000000_11(9));
            PKZ.LIZJ = z;
        }
        C64241PJd LJ = C64241PJd.LJ();
        LJ.getClass();
        if (C64241PJd.LIZLLL.isEmpty()) {
            LJ.LIZ.LIZJ(LJ.LIZJ, 30000L);
        } else {
            LJ.LIZ.LIZ(LJ.LIZJ);
        }
        try {
            C171096nZ.LIZ.put(IFdCheck.class, new IFdCheck() { // from class: com.bytedance.crash.NpthCore$5
                @Override // com.bytedance.services.apm.api.IFdCheck
                public List<String> getFdList() {
                    return NativeTools.LJIILJJIL().LJIJI();
                }
            });
        } catch (Throwable unused6) {
        }
        try {
            File LLIIJI = C16880lQ.LLIIJI(context, "fastbot");
            if (C64264PKa.LJII(PK0.LIZ) && LLIIJI != null && LLIIJI.exists()) {
                String absolutePath = LLIIJI.getAbsolutePath();
                C85999Xp5 c85999Xp5 = new C85999Xp5();
                PL1 pl1 = C64278PKo.LIZLLL;
                if (pl1 != null) {
                    pl1.stopWatching();
                }
                PL1 pl12 = new PL1(absolutePath, c85999Xp5, absolutePath);
                C64278PKo.LIZLLL = pl12;
                pl12.startWatching();
            }
        } catch (Throwable unused7) {
        }
        long symbolAddress = NativeTools.LJIILJJIL().getSymbolAddress("libc.so", "malloc_info", true);
        if (symbolAddress != 0) {
            NativeTools.LJIILJJIL().setMallocInfoFunc(symbolAddress);
        }
        NativeTools.LJIILJJIL().getClass();
        C64263PJz.LIZ("afterNpthInit", "noValue");
        long j = PK0.LJIJ;
        if (j > 0) {
            C64214PIc.LIZ().LIZJ(new ARunnableS18S0000000_11(6), j);
        } else {
            PJD.LIZIZ("npthStart", null, C77412UZs.LJLILLLLZI);
        }
    }

    public final void LIZ$1() {
        OSZ LIZJ = PN9.LIZJ();
        long longValue = ((Number) LIZJ.getSecond()).longValue() + ((Number) LIZJ.getFirst()).longValue();
        long j = longValue - PN9.LJFF;
        if (this.z0) {
            PN9.LJI += j;
        } else {
            PN9.LJIIIIZZ += j;
        }
        PN9.LJFF = longValue;
    }

    public final void LIZ$2() {
        int i;
        int i2;
        C86305Xu1.LJIIIIZZ();
        Bundle bundle = new Bundle();
        if (C86305Xu1.LJ()) {
            i = 2;
        } else {
            i = 0;
        }
        bundle.putInt("filter_warn", i);
        AppLog.setCustomerHeader(bundle);
        if (this.z0) {
            i2 = R.string.q5r;
        } else {
            i2 = R.string.q5q;
        }
        C5S1 c5s1 = new C5S1(EF7.LIZIZ());
        c5s1.LIZJ(i2);
        c5s1.LJ();
    }

    public static final void run$0(ARunnableS3S0010000_11 aRunnableS3S0010000_11) {
        boolean LIZ;
        try {
            aRunnableS3S0010000_11.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS3S0010000_11 aRunnableS3S0010000_11) {
        boolean LIZ;
        try {
            aRunnableS3S0010000_11.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS3S0010000_11 aRunnableS3S0010000_11) {
        boolean LIZ;
        try {
            aRunnableS3S0010000_11.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS3S0010000_11(boolean z, int i) {
        this.$t = i;
        this.z0 = z;
    }
}
