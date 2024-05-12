package X;

import android.os.Message;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: X.Vsb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81121Vsb extends PthreadThread {
    public static final C81121Vsb LJLJI;
    public final ArrayBlockingQueue<C81122Vsc> LJLIL;
    public final C43051mX<C81122Vsc> LJLILLLLZI;

    static {
        C81121Vsb c81121Vsb = new C81121Vsb();
        LJLJI = c81121Vsb;
        c81121Vsb.start();
    }

    public C81121Vsb() {
        super("SceneAsyncLayoutInflater$InflateThread");
        this.LJLIL = new ArrayBlockingQueue<>(10);
        this.LJLILLLLZI = new C43051mX<>(10);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                try {
                    C81122Vsc take = this.LJLIL.take();
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
