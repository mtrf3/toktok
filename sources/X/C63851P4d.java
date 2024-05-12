package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.nio.ByteBuffer;

/* renamed from: X.P4d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63851P4d {
    public PthreadThread LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public C63850P4c LJ;
    public volatile boolean LJFF;
    public volatile boolean LJI;
    public final Object LJII = new Object();
    public ByteBuffer LJIIIIZZ = null;

    public final void LIZ(int i) {
        this.LIZLLL = i;
        this.LIZIZ = 512;
        this.LIZJ = 512;
        this.LJIIIIZZ = ByteBuffer.allocate(1048576);
        PthreadThread pthreadThread = new PthreadThread(new RunnableC63849P4b(this), "VEGLMemLeaker");
        this.LIZ = pthreadThread;
        pthreadThread.start();
        synchronized (this.LJII) {
            try {
                this.LJII.wait(1000L);
            } catch (InterruptedException e) {
                C16880lQ.LLLLIIL(e);
            }
            if (!this.LJI) {
            }
        }
    }
}
