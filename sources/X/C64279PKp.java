package X;

import android.os.SystemClock;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.crash.vmMonitor.NativeVMMonitor;
import com.bytedance.crash.vmMonitor.VMMonitor;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.io.File;

/* renamed from: X.PKp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64279PKp extends PthreadThread {
    public final /* synthetic */ int LJLIL = 0;
    public final /* synthetic */ VMMonitor LJLILLLLZI;

    public final void LIZLLL() {
        PLQ plq;
        String str;
        String str2;
        String str3;
        String str4;
        C78685UuP.LJIJJLI();
        File LJJIII = C78596Usy.LJJIII(PK0.LIZ, PK0.LIZJ());
        try {
            File file = new File(LJJIII, "maps.txt");
            if (!file.exists()) {
                str = file.getAbsolutePath();
            } else {
                str = null;
            }
            File file2 = new File(LJJIII, "smaps.txt");
            if (!file2.exists()) {
                str2 = file2.getAbsolutePath();
            } else {
                str2 = null;
            }
            File file3 = new File(LJJIII, "meminfo.txt");
            if (!file3.exists()) {
                str3 = file3.getAbsolutePath();
            } else {
                str3 = null;
            }
            File file4 = new File(LJJIII, "threads.txt");
            if (!file4.exists()) {
                str4 = file4.getAbsolutePath();
            } else {
                str4 = null;
            }
            NativeTools.LJIILJJIL().getClass();
            NativeTools.LJ(null, str, str2, str4, str3);
            C1XY.LJII(LJJIII);
            C1XY.LJI(LJJIII);
            NativeVMMonitor.LJI().getClass();
            NativeVMMonitor.LIZLLL(5, 1);
        } catch (Throwable unused) {
        }
        NativeVMMonitor LJI = NativeVMMonitor.LJI();
        int i = this.LJLIL;
        LJI.getClass();
        int LIZLLL = NativeVMMonitor.LIZLLL(5, i);
        if (LIZLLL != 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VMMonitor: dump Native error: ");
            LIZ.append(LIZLLL);
            X1D.LIZIZ(LIZ);
            C78685UuP.LJIJJLI();
            return;
        }
        this.LJLILLLLZI.getClass();
        VMMonitor.LJIIJJI(false);
        try {
            SystemClock.sleep(60000L);
        } catch (Throwable unused2) {
        }
        if (this.LJLIL == 0) {
            C78685UuP.LJIJJLI();
            VMMonitor.LJII.LJFF = 5;
            NativeVMMonitor.LJI().getClass();
            int LIZLLL2 = NativeVMMonitor.LIZLLL(0, 1);
            if (LIZLLL2 != 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("VMMonitor: recover error: ");
                LIZ2.append(LIZLLL2);
                X1D.LIZIZ(LIZ2);
                C78685UuP.LJIJJLI();
            }
        }
        VMMonitor vMMonitor = this.LJLILLLLZI;
        int i2 = this.LJLIL;
        vMMonitor.getClass();
        if (i2 == 0) {
            plq = VMMonitor.LJII;
        } else {
            plq = VMMonitor.LJIIIIZZ;
        }
        plq.LJ = false;
        plq.LIZLLL = false;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZLLL();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64279PKp(VMMonitor vMMonitor) {
        super("mmap_dump_thread");
        this.LJLILLLLZI = vMMonitor;
    }
}
