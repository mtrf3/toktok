package X;

import Y.ARunnableS47S0100000_11;
import android.system.Os;
import android.system.OsConstants;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.monitor.collector.MonitorJni;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public final class PEJ extends PEL {
    public int LJ;
    public boolean LJFF;
    public final PE1 LJI;

    @Override // X.PEL
    public final synchronized Pair<String, String> LIZ() {
        try {
            if (!C64125PEr.LJIIJJI) {
                return null;
            }
            return new Pair<>(this.LIZ, MonitorJni.getProcInfos());
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // X.PEL
    public final void LIZJ() {
        if (C35044DpA.LIZ()) {
            this.LJFF = false;
        }
        super.LIZJ();
        try {
            if (C64125PEr.LJIIJJI) {
                boolean z = this.LJFF;
                if (z) {
                    this.LJ = 5000;
                } else {
                    this.LJ = 1000;
                }
                MonitorJni.keepProcHyperOpen(z);
                MonitorJni.doStart();
                PE3 pe3 = this.LIZLLL;
                if (pe3 != null) {
                    PE1 pe1 = this.LJI;
                    long j = this.LJ;
                    if (pe1 == null) {
                        return;
                    }
                    try {
                        C39050FUg LIZIZ = pe3.LIZIZ(pe1);
                        LIZIZ.LIZ(pe1);
                        LIZIZ.LIZJ(LIZIZ.scheduleWithFixedDelay(pe1, 0L, j, TimeUnit.MILLISECONDS), pe1.hashCode(), true);
                    } catch (Throwable th) {
                        pe3.LIZ("Apm-Async-task-removeTask", th);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public PEJ(int i) {
        super(i, "proc_monitor");
        this.LJ = 1000;
        this.LJFF = true;
        this.LJI = new PE1(PD7.LIGHT_WEIGHT, new ARunnableS47S0100000_11(this, 28), "collect-proc");
    }

    public static void LJ(PEJ pej) {
        if (C35044DpA.LIZ() && C84763XOl.LJIIJJI) {
            return;
        }
        synchronized (pej) {
            if (C64125PEr.LJIIJJI) {
                MonitorJni.doCollect();
            }
        }
    }

    public static long LJFF(int i) {
        try {
            if (!C64125PEr.LJIIJJI) {
                return -1L;
            }
            long doGetCpuTime = MonitorJni.doGetCpuTime(i);
            if (PEK.LIZIZ == -1) {
                long j = PEK.LIZ;
                if (j <= 0) {
                    j = Os.sysconf(OsConstants._SC_CLK_TCK);
                    if (j <= 0) {
                        j = 100;
                    }
                    PEK.LIZ = j;
                }
                PEK.LIZIZ = 1000 / j;
            }
            return doGetCpuTime * PEK.LIZIZ;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    @Override // X.PEL
    public final void LIZLLL(int i) {
        PE1 pe1;
        try {
            if (!C64125PEr.LJIIJJI) {
                return;
            }
            this.LIZIZ = 1;
            try {
                if (C64125PEr.LJIIJJI) {
                    PE3 pe3 = this.LIZLLL;
                    if (pe3 != null && (pe1 = this.LJI) != null) {
                        try {
                            C39050FUg LIZIZ = pe3.LIZIZ(pe1);
                            ThreadPoolExecutor threadPoolExecutor = LIZIZ.LJLJJI;
                            if (threadPoolExecutor != null) {
                                threadPoolExecutor.remove(pe1);
                            }
                            LIZIZ.LIZ(pe1);
                        } catch (Throwable th) {
                            pe3.LIZ("Apm-Async-task-removeTask", th);
                        }
                    }
                    MonitorJni.doStop();
                }
            } catch (Throwable unused) {
            }
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        this.LJ = 1000;
                        MonitorJni.setBufferSize(LiveChatShowDelayForHotLiveSetting.DEFAULT);
                    }
                } else {
                    this.LJ = 1000;
                    MonitorJni.setBufferSize(200);
                }
                LIZJ();
            }
        } catch (Throwable unused2) {
        }
    }

    @Override // X.PEL
    public final synchronized Pair<String, String> LIZIZ(long j, long j2) {
        try {
            if (!C64125PEr.LJIIJJI) {
                return null;
            }
            return new Pair<>(this.LIZ, MonitorJni.getProcInfoTimeRange(j, j2));
        } catch (Throwable unused) {
            return null;
        }
    }
}
