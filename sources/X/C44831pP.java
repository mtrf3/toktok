package X;

import android.os.Message;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: X.1pP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C44831pP extends PthreadThread {
    public static final C44831pP LJLJI;
    public final ArrayBlockingQueue<C15W> LJLIL;
    public final C43051mX<C15W> LJLILLLLZI;

    static {
        C44831pP c44831pP = new C44831pP();
        LJLJI = c44831pP;
        c44831pP.start();
    }

    public C44831pP() {
        super("AsyncLayoutInflater$InflateThread");
        this.LJLIL = new ArrayBlockingQueue<>(10);
        this.LJLILLLLZI = new C43051mX<>(10);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                try {
                    C15W take = this.LJLIL.take();
                    try {
                        take.LIZLLL = C16880lQ.LLLLIILL(take.LIZ.LIZ, take.LIZJ, take.LIZIZ, false);
                    } catch (RuntimeException unused) {
                    }
                    Message.obtain(take.LIZ.LIZIZ, 0, take).sendToTarget();
                } catch (Throwable th) {
                    if (C39223FaN.LIZ(th)) {
                        return;
                    } else {
                        throw th;
                    }
                }
            } catch (InterruptedException unused2) {
            }
        }
    }
}
