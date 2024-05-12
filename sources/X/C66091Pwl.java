package X;

import android.net.LocalSocket;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* renamed from: X.Pwl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C66091Pwl extends PthreadThread {
    public final LocalSocket LJLIL;
    public final /* synthetic */ C66090Pwk LJLILLLLZI;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.LJLILLLLZI.LIZJ.LIZ(new C66096Pwq(this.LJLIL, new C66103Pwx(this.LJLIL.getInputStream())));
        } catch (Exception unused) {
        } catch (Throwable th) {
            if (C39223FaN.LIZ(th)) {
            } else {
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66091Pwl(C66090Pwk c66090Pwk, LocalSocket localSocket) {
        super("LocalSocketServer$WorkerThread");
        this.LJLILLLLZI = c66090Pwk;
        this.LJLIL = localSocket;
    }
}
