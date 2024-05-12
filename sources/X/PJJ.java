package X;

import android.os.Build;
import android.os.SystemClock;
import android.util.Printer;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.crash.Npth;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.util.NativeTools;
import java.lang.reflect.Field;
import java.util.ArrayList;
import org.json.JSONArray;

/* loaded from: classes12.dex */
public final class PJJ implements PJB {
    @Override // X.PJB
    public final void LIZIZ() {
    }

    @Override // X.PJB
    public final void LIZ() {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        int i2;
        boolean z4;
        Printer printer;
        int i3 = 1;
        if (!PJA.LIZIZ() && C10040aO.LIZ == null) {
            PJK LIZ = PJK.LIZ();
            if (!LIZ.LIZLLL) {
                LIZ.LIZLLL = true;
                try {
                    Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
                    declaredField.setAccessible(true);
                    printer = (Printer) declaredField.get(C16880lQ.LLJJJJ());
                } catch (Exception unused) {
                    C78685UuP.LJLIL();
                    printer = null;
                }
                PJK.LJ = printer;
                PJL pjl = PJK.LJI;
                if (printer == pjl) {
                    PJK.LJ = null;
                }
                C16880lQ.LLJJJJ().setMessageLogging(pjl);
            }
            PJK LIZ2 = PJK.LIZ();
            PIY piy = new PIY();
            synchronized (LIZ2) {
                ((ArrayList) LIZ2.LIZIZ).add(piy);
            }
            ((ArrayList) PJK.LIZ().LIZJ).add(new PIZ());
            PIX.LJI = PIX.LJIILIIL;
            PIX.LJII = SystemClock.uptimeMillis();
        }
        if (PJG.LIZIZ(PJC.LIZJ(PJA.LJI(), "custom_event_settings", "npth_simple_setting", "enable_api_level")) && PJG.LIZJ(PJC.LIZJ(PJA.LJI(), "custom_event_settings", "npth_simple_setting", "enable_device_brand"))) {
            if (PJA.LJIIJ("custom_event_settings", "npth_simple_setting", "enable_pthread_key_monitor") == 1) {
                try {
                    ByteHook.init();
                    NativeImpl.doPthreadKeyMonitorInit(Build.VERSION.SDK_INT);
                } catch (Throwable unused2) {
                }
            }
            if (PJA.LJIIJ("custom_event_settings", "npth_simple_setting", "enable_env_monitor") == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z && (i2 = Build.VERSION.SDK_INT) <= 31) {
                NativeTools LJIILJJIL = NativeTools.LJIILJJIL();
                if (PJA.LJIIJ("custom_event_settings", "npth_simple_setting", "enable_debug") == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                LJIILJJIL.LIZ(i2, z4);
            }
            if (NativeTools.LJIILJJIL().LJJIIZ() && ((PJA.LIZJ() || PK0.LJII() || "true".equals(null)) && !PJA.LIZLLL() && Build.VERSION.SDK_INT <= 31 && PKZ.LJIIIZ != null)) {
                Npth.startGwpAsan(false);
            }
            if (((!PJA.LIZJ() && PJA.LIZLLL()) || PK0.LJII() || PIX.LJII()) && Build.VERSION.SDK_INT <= 32) {
                boolean LJJIIZ = NativeTools.LJIILJJIL().LJJIIZ();
                if (PJA.LJIIJ("custom_event_settings", "npth_simple_setting", "app_32_or_64") == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (LJJIIZ == z3) {
                    JSONArray LIZJ = PJC.LIZJ(PJA.LJI(), "custom_event_settings", "npth_simple_setting", "native_heap_params");
                    if (PKZ.LJIIIIZZ != null) {
                        Npth.startNativeHeapTracker(LIZJ);
                    }
                }
            }
            if (!PJA.LIZJ()) {
                boolean LJJIIZ2 = NativeTools.LJIILJJIL().LJJIIZ();
                if (PJA.LJIIJ("custom_event_settings", "npth_simple_setting", "app_32_or_64") == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (LJJIIZ2 != z2) {
                    if (PJA.LJIIJ("custom_event_settings", "npth_simple_setting", "enable_mmap_monitor") == 1 || PIX.LJII()) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if (PJA.LJIIJ("custom_event_settings", "npth_simple_setting", "enable_mprotect_monitor") == 1 || PIX.LJII()) {
                        i += 2;
                    }
                    if (PKZ.LJIIJ != null) {
                        Npth.startNativeVMMonitor(i);
                    }
                    NativeImpl.LJIILL();
                }
            }
            if (PJA.LJIIJ("custom_event_settings", "npth_simple_setting", "enable_monitor_reference") == 1) {
                PKV.LIZ(null, 0);
            }
            if (PJA.LJIIJ("custom_event_settings", "fd_track", "enable_fd_track") == 1 && PKZ.LJIIJJI != null) {
                Npth.startFdTracker();
            }
        }
        if (PJA.LJIIJ("custom_event_settings", "npth_simple_setting", "enable_resume_cb_thread_when_crash") == 1) {
            NativeImpl.LJI();
        }
        if (!NativeImpl.LJ && PJA.LJIIJ("custom_event_settings", "npth_simple_setting", "enable_anr_minidump") == 1) {
            NativeImpl.LJFF();
        }
        if (PJC.LIZLLL(PJA.LJI(), 1, "custom_event_settings", "npth_simple_setting", "enable_dump_malloc") != 1) {
            i3 = 0;
        }
        NativeImpl.LJ(i3);
        if (PK0.LJIJJLI) {
            NativeImpl.LJIIZILJ(Build.VERSION.SDK_INT);
        }
    }
}
