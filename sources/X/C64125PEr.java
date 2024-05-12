package X;

import Y.ARunnableS46S0100000_10;
import android.content.Context;
import android.os.Process;
import android.util.Pair;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.monitor.collector.BinderMonitor;
import com.bytedance.monitor.collector.MonitorJni;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: X.PEr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64125PEr {
    public static volatile boolean LJIIJJI;
    public static volatile C64125PEr LJIIL;
    public final List<PEL> LIZ;
    public volatile boolean LIZIZ;
    public volatile boolean LIZJ;
    public volatile boolean LIZLLL;
    public boolean LJ;
    public BinderMonitor LJFF;
    public PEJ LJI;
    public PEQ LJII;
    public C64176PGq LJIIIIZZ;
    public C64124PEq LJIIIZ;
    public int LJIIJ;

    public static long LIZJ() {
        BufferedReader bufferedReader;
        int i = FQS.LIZ;
        if (i == 0) {
            i = 128;
        }
        long j = -1;
        for (int i2 = 0; i2 < i; i2++) {
            BufferedReader bufferedReader2 = null;
            try {
                try {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("/sys/devices/system/cpu/cpu");
                    LIZ.append(i2);
                    LIZ.append("/cpufreq/stats/time_in_state");
                    bufferedReader = new BufferedReader(new FileReader(X1D.LIZIZ(LIZ)), 50);
                    while (true) {
                        try {
                            try {
                                String readLine = bufferedReader.readLine();
                                if (readLine != null && !readLine.isEmpty()) {
                                    String[] split = readLine.split("\\s+");
                                    if (split.length == 2) {
                                        j += Long.parseLong(split[1]);
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                C78685UuP.LJJLIIIJLLLLLLLZ(bufferedReader);
                                throw th;
                            }
                        } catch (FileNotFoundException unused) {
                            bufferedReader2 = bufferedReader;
                            FQS.LIZ = i2;
                            C78685UuP.LJJLIIIJLLLLLLLZ(bufferedReader2);
                            return j;
                        } catch (IOException e) {
                            e = e;
                            C16880lQ.LLLLIIL(e);
                            C78685UuP.LJJLIIIJLLLLLLLZ(bufferedReader);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                }
            } catch (FileNotFoundException unused2) {
            } catch (IOException e2) {
                e = e2;
                bufferedReader = null;
            }
            C78685UuP.LJJLIIIJLLLLLLLZ(bufferedReader);
        }
        return j;
    }

    public static C64125PEr LIZLLL() {
        if (LJIIL == null) {
            synchronized (C64125PEr.class) {
                if (LJIIL == null) {
                    LJIIL = new C64125PEr();
                }
            }
        }
        return LJIIL;
    }

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < ((CopyOnWriteArrayList) this.LIZ).size(); i++) {
            try {
                Pair<String, ?> LIZ = ((PEL) ListProtector.get(this.LIZ, i)).LIZ();
                if (LIZ != null) {
                    jSONObject.put((String) LIZ.first, LIZ.second);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return jSONObject;
    }

    public final C64177PGr LJ() {
        C64178PGs c64178PGs;
        C64177PGr LIZIZ;
        C64176PGq c64176PGq = this.LJIIIIZZ;
        if (c64176PGq == null || (c64178PGs = c64176PGq.LJIIIZ) == null || !c64176PGq.LJIJ || (LIZIZ = c64178PGs.LIZIZ()) == null || LIZIZ.LIZLLL != 8) {
            return null;
        }
        return c64176PGq.LJIIIZ.LIZIZ();
    }

    public C64125PEr() {
        new ARunnableS46S0100000_10(this, 30);
        this.LJIIJ = 0;
        this.LIZ = new CopyOnWriteArrayList();
        ActivityLifeObserver.getInstance().register(new C64128PEu(this));
    }

    public static synchronized boolean LJFF(Context context) {
        boolean z;
        String str;
        synchronized (C64125PEr.class) {
            if (!LJIIJJI) {
                LJIIJJI = FPV.LIZIZ(context, C36844Ed6.LIZIZ(Process.myPid()));
                if (C09970aH.LJII()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Load Result: ");
                    if (LJIIJJI) {
                        str = "Succeed";
                    } else {
                        str = "Failed";
                    }
                    LIZ.append(str);
                    X1D.LIZIZ(LIZ);
                }
                new C0IO();
                boolean LJII = C09970aH.LJII();
                int i = C0IP.AUTOMATIC.value;
                C0IN c0in = new C0IN();
                c0in.LIZ = i;
                c0in.LIZIZ = LJII;
                ByteHook.init(c0in);
            }
            z = LJIIJJI;
        }
        return z;
    }

    public final synchronized void LJI(C64124PEq c64124PEq) {
        this.LJIIIZ = c64124PEq;
        if (C09970aH.LJII()) {
            try {
                if (LJIIJJI) {
                    MonitorJni.doSetDebugMode(true);
                }
            } catch (Throwable unused) {
            }
        }
        if (!LJIIJJI) {
            return;
        }
        if (this.LJI == null) {
            this.LJI = new PEJ(c64124PEq.LJI);
        }
        if (c64124PEq.LIZIZ) {
            if (this.LJFF == null) {
                this.LJFF = new BinderMonitor(c64124PEq.LJI);
            }
            this.LJFF.getClass();
            MonitorJni.enableBinderHook();
        }
        if (c64124PEq.LIZ) {
            if (this.LJII == null) {
                this.LJII = new PEQ(c64124PEq.LJI);
            }
            PEQ peq = this.LJII;
            long j = c64124PEq.LJFF;
            peq.getClass();
            try {
                if (LJIIJJI) {
                    MonitorJni.doEnableAtrace(peq.LIZJ, j);
                }
            } catch (Throwable unused2) {
            }
            if (c64124PEq.LIZJ) {
                this.LJII.getClass();
                try {
                    if (LJIIJJI) {
                        MonitorJni.doEnableLock();
                    }
                } catch (Throwable unused3) {
                }
            }
        }
        LJII(c64124PEq.LJII);
        if (c64124PEq.LIZLLL && this.LJIIIIZZ == null) {
            C36381bm.LJIL.LJIIIZ();
            this.LJIIIIZZ = new C64176PGq(c64124PEq.LJI);
        }
    }

    public final void LJII(int i) {
        if (this.LJIIJ == i) {
            return;
        }
        this.LJIIJ = i;
        if (C09970aH.LJII()) {
            StringBuilder LJ = C7MY.LJ("updateSocketHookMode=", i, "-soLoad=");
            LJ.append(LJIIJJI);
            X1D.LIZIZ(LJ);
        }
        if (LJIIJJI) {
            if (i > 0) {
                MonitorJni.enableSocketHook(i);
            } else {
                MonitorJni.disableSocketHook();
            }
        }
    }

    public final JSONObject LIZIZ(long j, long j2) {
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < ((CopyOnWriteArrayList) this.LIZ).size(); i++) {
            try {
                Pair<String, ?> LIZIZ = ((PEL) ListProtector.get(this.LIZ, i)).LIZIZ(j, j2);
                if (LIZIZ != null) {
                    jSONObject.put((String) LIZIZ.first, LIZIZ.second);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }
}
