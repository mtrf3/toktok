package X;

import Y.ARunnableS17S0110000_11;
import Y.ARunnableS6S0001000_11;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.bytedance.ies.safemode.SafeModeActivity;
import com.bytedance.ies.safemode.SafeModeReporter;
import com.bytedance.ies.safemode.SmartProtected.state.ExceptionManager;
import com.bytedance.ies.safemode.SmartProtected.state.SmartProtectedStateMachine;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.apache.commons.io.FileUtils;

/* renamed from: X.Q6m, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66460Q6m {
    public static volatile C66460Q6m LJI;
    public static long LJII;
    public ScheduledExecutorService LIZ;
    public boolean LIZIZ;
    public ExceptionManager.ExceptionRecord LIZJ;
    public int LIZLLL;
    public Context LJ;
    public SmartProtectedStateMachine LJFF;

    public static synchronized C66460Q6m LIZIZ() {
        C66460Q6m c66460Q6m;
        synchronized (C66460Q6m.class) {
            if (LJI == null) {
                LJI = new C66460Q6m();
            }
            c66460Q6m = LJI;
        }
        return c66460Q6m;
    }

    public static boolean LIZLLL() {
        return C66465Q6r.LJIILLIIL.LIZLLL.LIZ().booleanValue();
    }

    public final void LJI() {
        synchronized (this.LIZ) {
            if (!this.LIZIZ) {
                this.LIZIZ = true;
                this.LIZ.shutdown();
            }
        }
    }

    public final void LJ() {
        if (!LIZLLL()) {
            PSY.LJ("<init>Launch protection is disable!!!");
            return;
        }
        PSY.LJ(C16880lQ.LLLZ("startCheckAndReport immediatelyStart %b", new Object[]{Boolean.FALSE}));
        ScheduledExecutorService newSingleThreadScheduledExecutor = PThreadExecutorsUtils.newSingleThreadScheduledExecutor(new DefaultThreadFactory("BootProtector"));
        this.LIZ = newSingleThreadScheduledExecutor;
        ARunnableS17S0110000_11 aRunnableS17S0110000_11 = new ARunnableS17S0110000_11(this, 6);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        newSingleThreadScheduledExecutor.scheduleWithFixedDelay(aRunnableS17S0110000_11, 0L, 10L, timeUnit);
        this.LIZ.schedule(new ARunnableS6S0001000_11(0, 0), 30L, timeUnit);
    }

    public final void LJFF(ExceptionManager.ExceptionRecord exceptionRecord, int i) {
        Context context = C66465Q6r.LJIILLIIL.LIZ;
        C66457Q6j c66457Q6j = SafeModeActivity.LJLJJLL;
        String type = exceptionRecord.getCrashType();
        String stack = exceptionRecord.getCrashReason();
        c66457Q6j.getClass();
        o.LJIIJ(context, "context");
        o.LJIIJ(type, "type");
        o.LJIIJ(stack, "stack");
        Intent putExtra = new Intent(context, (Class<?>) SafeModeActivity.class).addFlags(268435456).addFlags(32768).putExtra("crashType", type).putExtra("crashStack", stack).putExtra("reachType", i);
        o.LJFF(putExtra, "Intent(context, SafeMode…ra(REACH_TYPE, reachType)");
        C16880lQ.LIZJ(context, putExtra);
        C66462Q6o LIZ = C66462Q6o.LIZ(this.LJ);
        long currentTimeMillis = System.currentTimeMillis();
        LIZ.getClass();
        try {
            FileUtils.writeStringToFile(LIZ.LIZ, String.valueOf(currentTimeMillis), Charset.forName("UTF-8"));
        } catch (IOException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final synchronized void LIZ(long j, String str, String str2) {
        C66465Q6r c66465Q6r = C66465Q6r.LJIILLIIL;
        c66465Q6r.LIZIZ();
        if (!LIZLLL()) {
            PSY.LJ("<addException>Function is disabled，ignore this crash");
            return;
        }
        LJI();
        if (SystemClock.elapsedRealtime() - LJII > 2000) {
            ((PTS) c66465Q6r.LIZIZ).getClass();
            if (ActivityStack.getTopActivity() == null) {
                LIZIZ();
                SafeModeReporter.LIZLLL(SafeModeReporter.CrashInfo.LIZIZ(str, str2), 1);
                PSY.LJ("<addException>App in the background，ignore this crash");
                return;
            }
        }
        c66465Q6r.getClass();
        if (this.LJFF != null) {
            LIZIZ();
            SafeModeReporter.LIZLLL(SafeModeReporter.CrashInfo.LIZIZ(str, str2), 0);
            this.LJFF.LIZJ(j, str, str2);
        } else {
            LIZIZ();
            SafeModeReporter.LIZLLL(SafeModeReporter.CrashInfo.LIZIZ(str, str2), 4);
            PSY.LIZLLL("BootProtector", "machine is null,so skip exception in addException");
        }
    }

    public final synchronized void LIZJ(Context context, boolean z, PTS pts) {
        if (this.LIZ == null) {
            if (context != null) {
                LJII = SystemClock.elapsedRealtime();
                C66465Q6r c66465Q6r = C66465Q6r.LJIILLIIL;
                PSY.LJ(c66465Q6r.toString());
                this.LJ = context;
                c66465Q6r.LIZ = context;
                c66465Q6r.LIZIZ = pts;
                if (z) {
                    LJ();
                }
            } else {
                throw new RuntimeException("ProtectTask context is null");
            }
        }
    }
}
