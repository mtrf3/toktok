package X;

import android.os.Process;
import android.os.SystemClock;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.util.NativeTools;
import java.io.File;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PKJ implements PLX {
    public final boolean LIZ;
    public final Throwable LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final Thread LJFF;
    public final String LJI;
    public final boolean LJII;
    public final File LJIIIIZZ;

    @Override // X.PLX
    public final void LIZIZ() {
    }

    @Override // X.PLX
    public final PKN LIZJ(int i, PKN pkn) {
        try {
            File file = this.LJIIIIZZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJIIIIZZ.getName());
            LIZ.append(".");
            LIZ.append(i);
            PK8.LJIILLIIL(new File(file, X1D.LIZIZ(LIZ)), pkn.LIZ);
            PK0.LJIIIZ.clearImportTagsFile();
        } catch (Throwable unused) {
        }
        return pkn;
    }

    @Override // X.PLX
    public final PKN LIZLLL(int i, PKN pkn) {
        String str;
        String str2;
        CrashType crashType;
        List<ICrashCallback> list;
        CrashType crashType2;
        Object LIZIZ;
        JSONArray jSONArray;
        int i2 = 2;
        if (i != 0) {
            String str3 = "true";
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                pkn.LJIIJJI("crash_uuid", this.LJI);
                            }
                        } else if (!this.LIZ) {
                            C64264PKa.LJ(PK0.LIZ, pkn.LIZ);
                        }
                    } else {
                        File file = new File(C78596Usy.LJIJI(PK0.LIZ, PK0.LIZJ()), "trace.txt");
                        if ((!Header.LJIIIZ()) && PJA.LJIIJ("custom_event_settings", "npth_simple_setting", "enable_anr_dump_for_java_crash") == 1) {
                            NativeTools.LJIILJJIL().LIZIZ(file.getAbsolutePath(), false);
                            try {
                                jSONArray = PK8.LJIIIIZZ(file.getAbsolutePath());
                            } catch (Throwable unused) {
                                jSONArray = null;
                            }
                            LIZIZ = PKP.LJIIJ(jSONArray, null, false).second;
                        } else {
                            LIZIZ = PKW.LIZIZ(C16880lQ.LLLLIIIILLL().getName());
                        }
                        if (LIZIZ != null) {
                            pkn.LJIIJJI("all_thread_stacks", LIZIZ);
                        }
                    }
                } else {
                    if (this.LIZ) {
                        C64264PKa.LJ(PK0.LIZ, pkn.LIZ);
                    }
                    if (this.LJII) {
                        pkn.LJIIJJI("launch_did", C37214Ej4.LIZJ(PK0.LIZ));
                    }
                    JSONArray LIZJ = PIX.LIZJ();
                    long uptimeMillis = SystemClock.uptimeMillis();
                    JSONObject LIZ = PIX.LIZ();
                    JSONArray LIZLLL = PIX.LIZLLL(uptimeMillis);
                    pkn.LJIIJJI("history_message", LIZJ);
                    pkn.LJIIJJI("current_message", LIZ);
                    pkn.LJIIJJI("pending_messages", LIZLLL);
                    pkn.LJFF("disable_looper_monitor", String.valueOf(PJA.LIZIZ()));
                    if (!this.LIZ && PJA.LJIIJ("custom_event_settings", "npth_simple_setting", "enable_hprof_all_java_crash") == 1) {
                        pkn.LJFF("may_have_hprof", "true");
                        PKR.LIZIZ(this.LJFF, this.LIZIZ, this.LJII, this.LIZJ, PKZ.LJFF.LIZLLL);
                    }
                    pkn.LJIIJJI("alive_pids", PKQ.LIZLLL());
                }
            } else {
                if (this.LJII) {
                    pkn.LJIIJJI("timestamp", Long.valueOf(this.LIZJ));
                    pkn.LJIIJJI("main_process", Boolean.valueOf(C64264PKa.LJII(PK0.LIZ)));
                    pkn.LJIIJJI("crash_type", CrashType.JAVA);
                }
                Thread thread = this.LJFF;
                if (thread != null) {
                    str = thread.getName();
                } else {
                    str = "";
                }
                pkn.LJIIJJI("crash_thread_name", str);
                pkn.LJIIJJI("tid", Integer.valueOf(Process.myTid()));
                if (PKZ.LIZLLL()) {
                    str2 = "true";
                } else {
                    str2 = "false";
                }
                pkn.LJFF("crash_after_crash", str2);
                if (!NativeImpl.LIZLLL()) {
                    str3 = "false";
                }
                pkn.LJFF("crash_after_native", str3);
                PKR LJ = PKR.LJ();
                Thread thread2 = this.LJFF;
                Throwable th = this.LIZIZ;
                boolean z = this.LJII;
                LJ.getClass();
                if (z) {
                    C64311PLv<CrashType, ICrashCallback> c64311PLv = PKZ.LJFF.LIZ;
                    crashType = CrashType.LAUNCH;
                    list = c64311PLv.getList(crashType);
                } else {
                    C64311PLv<CrashType, ICrashCallback> c64311PLv2 = PKZ.LJFF.LIZ;
                    crashType = CrashType.JAVA;
                    list = c64311PLv2.getList(crashType);
                }
                for (ICrashCallback iCrashCallback : list) {
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    try {
                        iCrashCallback.onCrash(crashType, PKW.LIZJ(th), thread2);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("callback_cost_");
                        LIZ2.append(iCrashCallback.getClass().getName());
                        pkn.LIZIZ(X1D.LIZIZ(LIZ2), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis2));
                    } catch (Throwable unused2) {
                        C78685UuP.LJLIL();
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("callback_err_");
                        LIZ3.append(iCrashCallback.getClass().getName());
                        pkn.LIZIZ(X1D.LIZIZ(LIZ3), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis2));
                    }
                }
                File LJIJ = C78596Usy.LJIJ(PK0.LIZ);
                if (this.LJII) {
                    crashType2 = CrashType.LAUNCH;
                } else {
                    crashType2 = CrashType.JAVA;
                }
                C30581Hy.LJJIJLIJ(LJIJ, crashType2);
            }
        } else {
            pkn.LJIIJJI("data", PKW.LIZJ(this.LIZIZ));
            pkn.LJIIJJI("isOOM", Boolean.valueOf(this.LIZ));
            if (this.LJII) {
                pkn.LJIIJJI("event_type", "start_crash");
            } else {
                pkn.LJIIJJI("isJava", 1);
            }
            pkn.LJIIJJI("crash_time", Long.valueOf(this.LIZJ));
            int i3 = C64269PKf.LJJI;
            if (i3 == 1) {
                if (!C64269PKf.LJJIFFI) {
                    i2 = 1;
                }
                i3 = i2;
            }
            pkn.LJIIJJI("launch_mode", Integer.valueOf(i3));
            pkn.LJIIJJI("launch_time", Long.valueOf(C64269PKf.LJJII));
            String str4 = this.LIZLLL;
            if (str4 != null) {
                pkn.LJIIJJI("crash_md5", str4);
                pkn.LJFF("crash_md5", this.LIZLLL);
                boolean z2 = this.LJ;
                if (z2) {
                    pkn.LJFF("has_ignore", String.valueOf(z2));
                }
            }
        }
        return pkn;
    }

    public PKJ(boolean z, Throwable th, long j, String str, boolean z2, Thread thread, String str2, File file, boolean z3) {
        this.LIZ = z;
        this.LJFF = thread;
        this.LIZIZ = th;
        this.LIZJ = j;
        this.LIZLLL = str;
        this.LJ = z2;
        this.LJI = str2;
        this.LJIIIIZZ = file;
        this.LJII = z3;
    }
}
