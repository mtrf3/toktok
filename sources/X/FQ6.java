package X;

import android.os.Build;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class FQ6 implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ AtomicBoolean LJLILLLLZI;

    public final void LIZ() {
        C78685UuP.LJJJLL();
        try {
            Process exec = Runtime.getRuntime().exec(new String[]{"logcat", "-b", "main,system,crash,events", "-f", this.LJLIL});
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    exec.waitFor(3000L, TimeUnit.MILLISECONDS);
                } else if (this.LJLILLLLZI.get()) {
                    exec.waitFor();
                } else {
                    SystemClock.sleep(1000L);
                    if (exec == null) {
                        return;
                    }
                }
            } catch (Throwable unused) {
                if (exec == null) {
                    return;
                }
            }
            exec.destroy();
        } catch (Throwable unused2) {
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public FQ6(String str, AtomicBoolean atomicBoolean) {
        this.LJLIL = str;
        this.LJLILLLLZI = atomicBoolean;
    }
}
