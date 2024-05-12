package X;

import android.app.Application;
import android.os.SystemClock;
import com.bytedance.crash.vmMonitor.NativeVMMonitor;
import com.bytedance.crash.vmMonitor.VMMonitor;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* renamed from: X.PKk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64274PKk extends PthreadThread {
    public final /* synthetic */ VMMonitor LJLIL;

    public final void LIZLLL() {
        long j = 3000;
        while (true) {
            PLQ plq = VMMonitor.LJII;
            if (plq.LJI == 0) {
                int i = plq.LJFF;
                if (i != 4) {
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    this.LJLIL.LIZLLL = VMMonitor.LIZLLL();
                                    VMMonitor vMMonitor = this.LJLIL;
                                    if (vMMonitor.LIZLLL < vMMonitor.LJ) {
                                        VMMonitor.LJII.LJFF = 2;
                                        VMMonitor.LJII(0);
                                    } else {
                                        VMMonitor.LJII.LJFF = 4;
                                        VMMonitor.LJIIIZ();
                                        C64272PKi.LIZ().getClass();
                                        Application application = PK0.LIZIZ;
                                        if (application != null) {
                                            application.unregisterActivityLifecycleCallbacks(C64272PKi.LJ);
                                        }
                                        this.LJLIL.LIZIZ();
                                    }
                                }
                            } else {
                                this.LJLIL.LIZLLL = VMMonitor.LIZLLL();
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("VMMonitor: leakSize: ");
                                LIZ.append(this.LJLIL.LIZLLL);
                                LIZ.append(", dumpleaksize: ");
                                LIZ.append(this.LJLIL.LJ);
                                X1D.LIZIZ(LIZ);
                                C78685UuP.LJIJJLI();
                                VMMonitor vMMonitor2 = this.LJLIL;
                                long j2 = vMMonitor2.LIZLLL;
                                long j3 = vMMonitor2.LJ;
                                if (j2 >= (5 * j3) / 4) {
                                    VMMonitor.LJII.LJFF = 3;
                                    VMMonitor.LJIIIIZZ();
                                } else {
                                    if (j2 >= j3 / 4) {
                                        if (j2 != 0) {
                                            j *= j3 / j2;
                                        }
                                    }
                                    j *= 4;
                                }
                            }
                        } else {
                            NativeVMMonitor.LJI().getClass();
                            long max = Math.max(0, NativeVMMonitor.LJ(7)) - this.LJLIL.LJFF;
                            StringBuilder LIZJ = V10.LIZJ("VMMonitor: growVmSize: ", max, ", originVmSize: ");
                            LIZJ.append(this.LJLIL.LJFF);
                            LIZJ.append(", mwaterLine: ");
                            LIZJ.append(this.LJLIL.LJI);
                            X1D.LIZIZ(LIZJ);
                            C78685UuP.LJIJJLI();
                            long j4 = this.LJLIL.LJI;
                            if (max >= j4) {
                                VMMonitor.LJII.LJFF = 2;
                                VMMonitor.LJII(0);
                            } else {
                                if (max > j4 / 4) {
                                    if (max != 0) {
                                        j *= j4 / max;
                                    }
                                }
                                j *= 4;
                            }
                        }
                    } else {
                        plq.LJFF = 1;
                    }
                }
                int i2 = VMMonitor.LJII.LJFF;
                if (i2 == -1 || i2 == 4 || i2 == 5) {
                    break;
                }
                try {
                    j = Math.max(j, 3000L);
                    SystemClock.sleep(j);
                } catch (Throwable unused) {
                }
            } else {
                break;
            }
        }
        VMMonitor.LJII.LIZLLL = false;
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
    public C64274PKk(VMMonitor vMMonitor) {
        super("mmapWaterLineModeMonitor");
        this.LJLIL = vMMonitor;
    }
}
