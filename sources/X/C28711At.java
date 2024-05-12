package X;

import Y.IDRunnableS6S0101000;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1At, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28711At implements C08B {
    public final Context LIZ;
    public final C12120dk LIZIZ;
    public final C08I LIZJ;
    public final Object LIZLLL;
    public Handler LJ;
    public Executor LJFF;
    public PThreadPoolExecutor LJI;
    public C08C LJII;

    public final void LIZIZ() {
        synchronized (this.LIZLLL) {
            this.LJII = null;
            Handler handler = this.LJ;
            if (handler != null) {
                handler.removeCallbacks(null);
            }
            this.LJ = null;
            PThreadPoolExecutor pThreadPoolExecutor = this.LJI;
            if (pThreadPoolExecutor != null) {
                pThreadPoolExecutor.shutdown();
            }
            this.LJFF = null;
            this.LJI = null;
        }
    }

    public final void LIZJ() {
        synchronized (this.LIZLLL) {
            if (this.LJII == null) {
                return;
            }
            if (this.LJFF == null) {
                PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new AnonymousClass081("emojiCompat"));
                pThreadPoolExecutor.allowCoreThreadTimeOut(true);
                this.LJI = pThreadPoolExecutor;
                this.LJFF = pThreadPoolExecutor;
            }
            this.LJFF.execute(new IDRunnableS6S0101000(0, this, 8));
        }
    }

    public final C12180dq LIZLLL() {
        try {
            C08I c08i = this.LIZJ;
            Context context = this.LIZ;
            C12120dk c12120dk = this.LIZIZ;
            c08i.getClass();
            C12170dp LIZ = C12110dj.LIZ(context, c12120dk);
            if (LIZ.LIZ == 0) {
                C12180dq[] c12180dqArr = LIZ.LIZIZ;
                if (c12180dqArr != null && c12180dqArr.length != 0) {
                    return c12180dqArr[0];
                }
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("fetchFonts failed (");
            throw new RuntimeException(C08380Uo.LIZ(LIZ2, LIZ.LIZ, ")", LIZ2));
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }

    @Override // X.C08B
    public final void LIZ(C08C c08c) {
        synchronized (this.LIZLLL) {
            this.LJII = c08c;
        }
        LIZJ();
    }

    public C28711At(Context context, C12120dk c12120dk) {
        C08I c08i = C28721Au.LIZLLL;
        this.LIZLLL = new Object();
        TMC.LJIIIZ(context, "Context cannot be null");
        this.LIZ = C16880lQ.LLLLL(context);
        this.LIZIZ = c12120dk;
        this.LIZJ = c08i;
    }
}
